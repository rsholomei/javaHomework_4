package ZipFileMaker.fileFilter;


public class AudioFilter extends Filter {
    @Override
    public String[] fileExtensions() {
        return new String[] {"mp3", "wav", "wma"};
    }
}
