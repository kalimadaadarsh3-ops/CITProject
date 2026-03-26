public class NestedIf {
    public static void main(String[] args) {
        int age=65;
        if(age>=18){
            if(age>=65){
                System.out.println("eligible to vote and avail government fund");
            }
            else
                System.out.println("we are  eligible to vote but not eligible to avail government scheme");
            }else
                System.out.println("we are not eligible to vote but not eligible to avail government scheme");

        }
    
}
