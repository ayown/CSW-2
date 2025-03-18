package ASSIGNMENT1;
import java.util.ArrayList;
import java.util.List;


public class ImageLibrary {
    private final List<Image> images = new ArrayList<>();
    public void insertImage(Image image) {
        images.add(image);
    }
    public Image getImage(int index) {
        return (index >= 0 && index < images.size()) ? images.get(index) : null;
    }
    public Image searchImage(int w, int h, String c) {
        return images.stream().filter(img -> img.getImgwidth() == w && img.getImgheight() == h && img.getColorcode().equals(c)).findFirst().orElse(null);
    }
    public void displayAllImages() {
        images.forEach(System.out::println);
    }
}

class Q5 {
    public static void main(String[] args) {
        ImageLibrary library = new ImageLibrary();
        library.insertImage(new Image(1920, 1080, "FF5733"));
        library.insertImage(new Image(1280, 720, "1E90FF"));
        library.insertImage(new Image(800, 600, "0000FF"));
        System.out.println("All images:");
        library.displayAllImages();
        System.out.println("\nSearch result: " + (library.searchImage(1280, 720, "1E90FF") != null ? library.searchImage(1280, 720, "1E90FF") : "Image not found"));
        System.out.println("\nImage at index 1: " + (library.getImage(1) != null ? library.getImage(1) : "Image not found"));
    }
}
