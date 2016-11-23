package ZipFileMaker.doZip;

import ZipFileMaker.Directorie;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class BaseZip {
    public String pathArchives()
    {
        return "path";
    }

    public FileFilter fileFilter()
    {
        return null;
    }

    public void newZip() throws IOException {
        ZipOutputStream out = new ZipOutputStream(new FileOutputStream(pathArchives()));
        doZip(out);
        out.close();
    }

    private void doZip(ZipOutputStream out) throws IOException {
        for (int i = 0; i < new Directorie().listDirectories().size(); i++)
        {
            File dir = new File(new Directorie().listDirectories().get(i));
            for (File file : dir.listFiles(fileFilter()))
            {
                if (file.isDirectory())
                    doZip(out);
                else {
                    out.putNextEntry(new ZipEntry(file.getPath().replace("/home/ruslan/", "")));
                    write(new FileInputStream(file), out);
                }
            }
        }
    }

    private void write(InputStream in, OutputStream out) throws IOException {
        byte[] buffer = new byte[1024];
        int len;
        while ((len = in.read(buffer)) >= 0)
            out.write(buffer, 0, len);
        in.close();
    }
}

