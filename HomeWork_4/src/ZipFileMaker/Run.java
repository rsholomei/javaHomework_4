package ZipFileMaker;

import ZipFileMaker.doZip.AudioZip;
import ZipFileMaker.doZip.ImageZip;
import ZipFileMaker.doZip.VideoZip;

import java.io.IOException;

public class Run {
    public static void main(String[] args) throws IOException {

        new AudioZip().newZip();
        new VideoZip().newZip();
        new ImageZip().newZip();

    }
}
