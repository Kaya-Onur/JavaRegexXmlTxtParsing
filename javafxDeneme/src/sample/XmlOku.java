package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class XmlOku {
    protected static ArrayList<Bar> BarNesnesiOlustur(String text, ArrayList<Bar> list) {



        ArrayList<String> recordTut = new ArrayList<>();


        String regex3 = "(<record>)(.*?)(</record>)";
        Pattern pattern3 = Pattern.compile(regex3);
        Matcher matcher3 = pattern3.matcher(text);

        while (matcher3.find()) {
            recordTut.add(matcher3.group(2));
        }


        for (int j = 0; j < recordTut.size(); j++) {
            String regex4 = "(>)(.*?)(</field>)";
            Pattern pattern4 = Pattern.compile(regex4);
            Matcher matcher4 = pattern4.matcher(recordTut.get(j));
            ArrayList<String> d = new ArrayList<>();

            while (matcher4.find()) {
                d.add(matcher4.group(2));

            }

            if (d.size() == 5) {

                String year = d.get(2);
                String name = d.get(0);
                String country = d.get(1);
                int value = Integer.valueOf(d.get(3));
                String category = d.get(4);

                list.add(new Bar(year, name, country, value, category));

            }

            /*<field name = "Name" key = "DEU" > Germany </field >
              <field name = "Country" > Germany </field >
              <field name = "Year" > 1960 </field >
              <field name = "Value" > 72814900 </field >
              <field name = "Category" > Europe </field >*/

        }

       /* for(Bar aa:list)
            System.out.println(aa);*/
        return list;


    }
    protected  ArrayList<String> TitleandXaxis(String text,ArrayList<String> tt){
        String regex1 = "(<title>)(.*?)(</title>)";
        Pattern pattern1 = Pattern.compile(regex1);
        Matcher matcher1 = pattern1.matcher(text);
        String title = "";
        while (matcher1.find()) {
            title = matcher1.group(2);
        }
        System.out.println(title);


        String regex2 = "(<xlabel>)(.*?)(</xlabel>)";
        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher2 = pattern2.matcher(text);
        String xaxis = "";
        while (matcher2.find()) {
            xaxis = matcher2.group(2);
        }
        System.out.println(xaxis);

        tt.add(title);
        tt.add(xaxis);
        return tt;
    }

    protected static ArrayList<Line> LineNesnesiOlustur(String text, ArrayList<Line> list) {



        ArrayList<String> recordTut = new ArrayList<>();


        String regex3 = "(<record>)(.*?)(</record>)";
        Pattern pattern3 = Pattern.compile(regex3);
        Matcher matcher3 = pattern3.matcher(text);

        while (matcher3.find()) {
            recordTut.add(matcher3.group(2));
        }


        for (int j = 0; j < recordTut.size(); j++) {
            String regex4 = "(>)(.*?)(</field>)";
            Pattern pattern4 = Pattern.compile(regex4);
            Matcher matcher4 = pattern4.matcher(recordTut.get(j));
            ArrayList<String> d = new ArrayList<>();

            while (matcher4.find()) {
                d.add(matcher4.group(2));

            }

            if (d.size() == 5) {

                String year = d.get(2);
                String name = d.get(0);
                String country = d.get(1);
                int value = Integer.valueOf(d.get(3));
                String category = d.get(4);

                list.add(new Line(year, name, country, value, category));

            }

            /*<field name = "Name" key = "DEU" > Germany </field >
              <field name = "Country" > Germany </field >
              <field name = "Year" > 1960 </field >
              <field name = "Value" > 72814900 </field >
              <field name = "Category" > Europe </field >*/

        }

       /* for(Line aa:list)
            System.out.println(aa);*/
        return list;


    }

    protected String dosyadanOku(String text) throws FileNotFoundException {

        File sourceFile = new File(text);

        if (!sourceFile.exists())
            System.out.println("Source file does not exist");

        String s = "";


        try (Scanner scanner = new Scanner(sourceFile)) {
            String line;
            while (scanner.hasNext()) {

                line = scanner.nextLine();
                s += line;

            }
        }


        return s;

    }
}
