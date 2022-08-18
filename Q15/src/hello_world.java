public class hello_world {
    public static void main(String[] args){
        intro i =new intro();  //Creating object for intro class
        i.print_hw();  //Calling print_hw() method from intro class
        i.print_intro();  //Calling print_hw() method from intro class
    }
    public void print_hw(){
        System.out.println("Hello World.");  //Printing message
    }
}