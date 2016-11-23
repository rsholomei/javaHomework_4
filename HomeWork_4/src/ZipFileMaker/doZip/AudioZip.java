package ZipFileMaker.doZip;

import ZipFileMaker.fileFilter.AudioFilter;

import java.io.*;

public class AudioZip extends BaseZip {
    @Override
    public String pathArchives() {
        return "/home/ruslan/folder/audio.zip";
    }

    @Override
    public FileFilter fileFilter() {
        return new AudioFilter();
    }
}