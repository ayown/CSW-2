package CH17_DS;

public class TreeNode {
    int key;
    TreeNode l,r;
    public TreeNode(int item){
        key=item;
        l=r= null;
    }
}
class Main{
    static TreeNode search(TreeNode root, int key){
        if(root==null || root.key == key)
            return root;

        if(root.key<key)
            return search(root.r,key);

        return search(root.l,key);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(50);
        root.l=new TreeNode(30);
        root.r=new TreeNode(70);
        root.l.l= new TreeNode(20);
        root.l.r= new TreeNode(40);
        root.r.l= new TreeNode(60);
        root.r.r= new TreeNode(80);
        if(search(root,10)!=null){
            System.out.println("10 Found");
        }else{
            System.out.println("10 Not Found");
        }

        if (search(root,80)!=null){
            System.out.println("80 Found");
        }else{
            System.out.println("80 Not Found");
        }
    }
}