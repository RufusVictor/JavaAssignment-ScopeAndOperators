public class VariableScope {
    public static void main(String[] args) {
        int outsideVar = 10; // Declared outside the if block (accessible everywhere in main)
        if (outsideVar > 0) {
            int insideVar = 20; // Declared inside the if block (scope limited to this block)
            System.out.println("Inside if block: outsideVar = " + outsideVar + ", insideVar = " + insideVar);
        }
        System.out.println("Outside if block: outsideVar = " + outsideVar);
        // System.out.println("Outside if block: insideVar = " + insideVar); 
        // Compiler Error: insideVar cannot be resolved to a variable (out of scope)
    }
}
