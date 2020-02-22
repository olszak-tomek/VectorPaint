package pl.sda.rafal.zientara.vector.paint.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SDAFileReader {

    private File file;


    public SDAFileReader(File file) {
        this.file = file;
    }

    public List<String> readFile() {
        BufferedReader br = null;
        List<String> data = new ArrayList<>();
        try {

            System.out.println(file.getAbsolutePath());
            java.io.FileReader fileReader = new java.io.FileReader(file);
            br = new BufferedReader(fileReader);


            // czytanie paczkami danych
            // char[]buffer = new char [1024]
            //int success = filerReader.read(buffer);

            String nextLine = br.readLine();
            while (nextLine != null) {
                System.out.println(nextLine);
                nextLine = br.readLine();
                data.add(nextLine);

            }

            System.out.println("Koniec pliku");
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return data;

    }
}
