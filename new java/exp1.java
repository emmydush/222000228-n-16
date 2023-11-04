// this is the second program that shows statement program
public class exp1 {
    public static void main(String[]args){
        int Experience = 5;//initialization of variable 5.

        if (Experience < 1) {
            System.out.println("You are a hard worker");
        } else if (Experience >= 1 && Experience < 5) {
            System.out.println("You are a mid worker");
        } else if (Experience >= 5 && Experience < 10) {
            System.out.println("You are a senior worker");
        } else {
            System.out.println("You are a weak worker");//display the output.
        }
    }
}
