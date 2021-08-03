package sample;

public class Bar implements Comparable<Bar>{

    //record(year, name, country, value, category)


    private String year="";
    private String name="";
    private String country="";
    private int value;
    private String category="";

    public Bar(String year, String name, String country, int value, String category) {

        this.year = year;
        this.name = name;
        this.country = country;
        this.value = value;
        this.category = category;
    }




    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }



    @Override
    public int compareTo(Bar o) {
        if(o==null)
            return 0;
        if(!(o instanceof Bar))
            return 0;

        int result=this.value-o.value;
        return result;


    }

    @Override
    public String toString() {
        return "Bar{" +
                "year='" + year + '\'' +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", value=" + value +
                ", category='" + category + '\'' +
                '}';
    }
}

