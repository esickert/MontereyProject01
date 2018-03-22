package collections.framework.wu;

public class Person {

    String name;
    int age;
    char gender;

    Person()   {
    }

    Person(String newName, int newAge, char newGender) {
        this.name = newName;
        this.age = newAge;
        this.gender = newGender;
    }

    public void setName(String newName){
        name = newName;
    }

    public String getName(){
        return name;
    }

    public void setAge(int newAge)  {
        age = newAge;
    }

    public int getAge()    {
        return age;
    }

    public void setGender(char newGender) {
        gender = newGender;
    }

    public char getGender()   {
        return gender;
    }
}
