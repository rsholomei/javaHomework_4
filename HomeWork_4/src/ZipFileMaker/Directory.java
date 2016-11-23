package ZipFileMaker;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Directory {

    List<String> list = new ArrayList<>();

    public List<String> listDirectories() {
        File dir = new File("/home/ruslan/folder/");
        list.add("/home/ruslan/folder/");
        if(dir.isDirectory())
        {
            for(File item : dir.listFiles())
            {
                if(item.isDirectory()){
                    list.add(item.getAbsolutePath());
                }
            }
        }
        return list;
    }
}
