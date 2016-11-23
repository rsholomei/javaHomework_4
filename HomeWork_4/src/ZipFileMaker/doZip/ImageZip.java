package ZipFileMaker.doZip;

import ZipFileMaker.fileFilter.ImageFilter;
import ZipFileMaker.fileFilter.VideoFilter;

import java.io.FileFilter;

public class ImageZip extends BaseZip {
    @Override
    public String pathArchives() {
        return "/home/ruslan/folder/image.zip";
    }

    @Override
    public FileFilter fileFilter() {
        return new ImageFilter();
    }
}
