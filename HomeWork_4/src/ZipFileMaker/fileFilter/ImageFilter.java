package ZipFileMaker.fileFilter;

public class ImageFilter extends Filter {
    @Override
    public String[] fileExtensions() {
        return new String[] {"jpeg", "jpg", "gif", "png"};
    }
}
