package ZipFileMaker.doZip;

import ZipFileMaker.fileFilter.VideoFilter;

import java.io.FileFilter;

public class VideoZip extends BaseZip {
    @Override
    public String pathArchives() {
        return "/home/ruslan/folder/video.zip";
    }

    @Override
    public FileFilter fileFilter() {
        return new VideoFilter();
    }
}
