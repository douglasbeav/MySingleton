public class SinglePerson {

    private static SinglePerson singlePerson;
    private static SinglePerson singlePerson2 = new SinglePerson();
    private String name, address, CPR;
    private int age;

    private SinglePerson() {}

    private SinglePerson(String name, String address, int age) {
        this.name = name; this.address = address; this.age = age;
    }

//    public static SinglePerson getSinglePerson(String name, String address, int age) {
//        if(singlePerson == null) {
//            singlePerson = new SinglePerson(name, address, age);
//        }
//        return singlePerson;
//    }

    public static SinglePerson getSinglePerson() {
        return singlePerson2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCPR() {
        return CPR;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", address='" + address + '\'' +
//                ", CPR='" + CPR + '\'' +
//                ", age=" + age +
//                '}';
//    }
}
