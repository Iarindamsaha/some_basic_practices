package argsPractice;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer testing = new StringBuffer("This Is A String Buffer");
        System.out.println(testing.capacity());
        testing.append(" " + "Arindam");
        System.out.println(testing);
//        testing.insert(1,"okok");
//        System.out.println(testing);
        testing.replace(1,3,"ok");
        System.out.println(testing);
        System.out.println(testing.capacity());

    }
}
