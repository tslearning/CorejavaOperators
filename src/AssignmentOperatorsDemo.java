public class AssignmentOperatorsDemo {
    public static void main(String[] args) {
        //Assigning Primitive Values
    int j, k;
    j = 10;
    j = 5;
    k = j;
        System.out.println("j is : " + j);
        System.out.println("k is : " + k);

        //Mutiple Assignments
    k = j = 10; // (k = (j = 10))
        System.out.println("j is : " + j);
        System.out.println("k is : " + k);
    }
}
