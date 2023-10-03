public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;
public Animal(String family,String name,int age,boolean isMammal){
    this.family=family;
    this.name=name;
    this.age=age;
    this.isMammal=isMammal;
}
    public String toString() {
        return "animal family: " + family + "\n animal name : " +name + "\n animal age: " + age +"\nisMammal: "+isMammal;
    }
}
