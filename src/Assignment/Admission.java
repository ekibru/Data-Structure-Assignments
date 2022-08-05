package Assignment;

public class Admission implements Comparable<Admission>{
    int adno;
    String name;
    String pno;
    private static int start=5001;
    public Admission(String name,String pno){
       // create a first constructor to initialize the values using the fields name and pno

        this.name = name;
        this.pno = pno;
        this.adno=start;
        start++;

    }
    //create a second constructor to initialize the values using the fields adno, name and pno
    public Admission(int adno,String name,String pno){
        this.adno=adno;
        this.name = name;
        this.pno = pno;
    }
    public String toString(){
        return adno+" "+name+" "+pno;
    }

    @Override
    public int compareTo(Admission o) {
        return Integer.compare(this.adno,o.adno);
    }
}
