package ZipFileMaker.fileFilter;

public class VideoFilter extends Filter {
    @Override
    public String[] fileExtensions() {
        return new String[] {"avi", "mp4", "flv"};
    }
}
