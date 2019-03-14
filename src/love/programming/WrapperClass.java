package love.programming;

public class WrapperClass {
    public static void main(String[] args) {
        //autoboxing
        Integer myInteger = 10;
        System.out.println(myInteger);

        //normal boxing
        Integer myObjectInteger = new Integer(10);
        System.out.println(myObjectInteger.toString());

        //unboxing
        int a = myObjectInteger;
        System.out.println(myObjectInteger);

        Boolean myBoolean = true;
        Boolean myObjectBoolean = new Boolean(false);
        System.out.println(myObjectBoolean);

        char myChar = 'a';
        System.out.println(myChar);
        Character myObjectChar = new Character('a');
        System.out.println(myObjectChar.toString());
        Character  obj = myObjectChar;
        System.out.println(myObjectChar);

        byte x = 1;
        Byte byteobj = new Byte(x);
        System.out.println("Byte object byteobj:  " + byteobj);
        byte bv = byteobj;
        System.out.println("byte value, bv: " + bv);

        float c = 18.6f;
        Float floatobj = new Float(c);
        System.out.println("Float object floatobj:  " + floatobj);
        float fv = floatobj;
        System.out.println("float value, fv: " + fv);

        double d = 250.5;// double data type

        Double doubleobj = new Double(d);//  printing the values from objects
        System.out.println("Double object doubleobj:  " + doubleobj);

        double dv = doubleobj;
        // objects to data types (retrieving data types from objects)
        // unwrapping objects to primitive data types

        System.out.println("double value, dv: " + dv);// printing the values from data types




    }
    }







