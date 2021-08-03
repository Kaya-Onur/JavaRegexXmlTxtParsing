package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TxtOku {

    protected static ArrayList<Bar> BarNesnesiOlustur(ArrayList<String> dosyadanOku, ArrayList<Bar> list) {


        String title = dosyadanOku.get(0);
        String xaxis = dosyadanOku.get(1);



        for (int i = 4; i < dosyadanOku.size(); i++) {

            if (!dosyadanOku.get(i).equals(" ")) {

                String[] d=dosyadanOku.get(i).split(",");
                if(d.length==5){
                    String year = d[0];
                    String name = d[1];
                    String country = d[2];
                    int value = Integer.valueOf(d[3]);
                    String category = d[4];

                    list.add(new Bar(year, name, country, value, category));
                }
            }
        }
        /*for (Bar b:list)
            System.out.println(b);*/



        return list;


    }
    protected static ArrayList<Line> LineNesnesiOlustur(ArrayList<String> dosyadanOku, ArrayList<Line> list) {


        String title = dosyadanOku.get(0);
        String xaxis = dosyadanOku.get(1);



        for (int i = 4; i < dosyadanOku.size(); i++) {

            if (!dosyadanOku.get(i).equals(" ")) {

                String[] d=dosyadanOku.get(i).split(",");
                if(d.length==5){
                    String year = d[0];
                    String name = d[1];
                    String country = d[2];
                    int value = Integer.valueOf(d[3]);
                    String category = d[4];

                    list.add(new Line(year, name, country, value, category));
                }
            }
        }
        /*for (Line b:list)
            System.out.println(b);*/



        return list;


    }

    protected static ArrayList<String> dosyadanOku(String text) throws FileNotFoundException {

        File sourceFile = new File(text);

        if (!sourceFile.exists())
            System.out.println("Source file does not exist");

        ArrayList<String> s = new ArrayList<>();


        try (Scanner scanner = new Scanner(sourceFile)) {
            String line;
            while (scanner.hasNext()) {

                line = scanner.nextLine();
                s.add(line);

            }

        }

        return s;

    }
}
