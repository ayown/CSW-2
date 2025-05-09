package CH18_FnProg.LAMBDAS;

interface ReportCard{
    void totalMarks(int math,int phy, int bio, int hist, int chem);
}

public class Test2 {
    public static void main(String[] args) {
        ReportCard rp1= (math,phy,bio,hist,chem) -> System.out.println(math+phy+bio+hist+chem);
        rp1.totalMarks(1,2,3,4,5);
        ReportCard rp2= (math,phy,bio,hist,chem) -> System.out.println(math+phy+bio+hist+chem);
        rp2.totalMarks(1,2,3,4,5);
        ReportCard rp3= (math,phy,bio,hist,chem) -> System.out.println(math+phy+bio+hist+chem);
        rp3.totalMarks(1,2,3,4,5);
    }
}
