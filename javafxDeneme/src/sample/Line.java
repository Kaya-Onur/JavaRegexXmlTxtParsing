package sample;

public class Line {

    private String title="";
    private String xaxis="";
    private String year="";
    private String name="";
    private String country="";
    private int value;
    private String category="";

    public Line(String year, String name, String country, int value, String category) {

        this.year = year;
        this.name = name;
        this.country = country;
        this.value = value;
        this.category = category;
    }



    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }




    public int nexValue(){

        return 1;
    };



    @Override
    public String toString() {
        return "Line{" +
                "year='" + year + '\'' +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", value=" + value +
                ", category='" + category + '\'' +
                '}';
    }
}
