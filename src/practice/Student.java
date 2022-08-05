package practice;
/**Ephrem Kidane          ID#: 112580
 * Data structure Lab Assignment 3
 */
public class Student {
    private int id;
    private String name;
    private int mark;
    public Student(int id, String name, int mark){
        this.id=id;
        this.name=name;
        this.mark= mark;
    }
    public void displayStudent() {
        System.out.println(id+" "+name+" "+mark);
    }
    public int getId(){
        return id;
    }
    public int getMark(){
    return mark;
    }
    public String getName(){
        return name;
    }
}
    class StudentArray{
        private Student[] a;
        private int nElems;
        public StudentArray(int max){
            a= new Student [max];
            nElems=0;
        }

    public Student find(int id) {
        for (int i = 0; i < a.length; i++) {
            if(a[i].getId()==id)
                return a[i];
        }
        return null;
    }
    public void insert(int id, String name, int mark) {
            a[nElems] = new Student(id,name,mark);
            nElems++;
        }

    public boolean delete(int id) {
        int i;
        for(i =0; i < a.length; i++)
            if(a[i].getId()==id)
                break;
        if(i == a.length)
            return false;
        else {
            for(int j = i+1; j< a.length; j++)
                a[j-1]= a[j];
            nElems--;
            return true;
        }

    }
    public void displayAll() {
        for(int i = 0; i< nElems; i++)
            a[i].displayStudent();
        }

    public void findScore() {
        int max = a[0].getMark();
        int min = a[0].getMark();
        String maxName="";
        String minName="";


        for(int i =0 ;i <a.length;i++ )
            if(a[i].getMark() < min) {
                min = a[i].getMark();
                minName=a[i].getName();
            }
            else if(a[i].getMark()> max) {
                max = a[i].getMark();
                maxName =a[i].getName();
            }
        System.out.println(maxName+" has the maximum mark which is :"+ max);
        System.out.println(minName+" has the minimum mark which is :"+ min);
    }
}
