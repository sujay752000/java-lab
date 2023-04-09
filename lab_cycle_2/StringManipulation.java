package lab_cycle_2;

public class StringManipulation {

    public static void main(String[] args){

        String college_name = "College Of Engineering Chengannur";
        System.out.printf("String created using String class\nString = %s\n", college_name);

        college_name = college_name.toUpperCase();
        System.out.printf("Upper case = %s\n", college_name);

        college_name = college_name.toLowerCase();
        System.out.printf("Lower case = %s\n", college_name);

        college_name = college_name.concat(" PIN - 690535");
        System.out.printf("Concatinated String is = %s\n", college_name);

        college_name = college_name.replace("PIN - 690535", "Pin - 689121");
        System.out.printf("Replaced String is = %s\n\n", college_name);

    
        StringBuffer text = new StringBuffer("My name is ");
        System.out.printf("String created using String StringBuffer class\nString = %s\n", text);
        text.append("Rahul");
        System.out.printf("After appending = %s\n", text);

        text.delete(0, 11);
        System.out.printf("After deleting from index 0 to 7 String = %s\n", text);

        text.insert(0, "I am ");
        System.out.printf("After inserting new string from 0 th index String = %s\n", text);

        text.reverse();
        System.out.printf("Reversed String = %s\n", text);
        
    }
    
}
