public class Driver{
  public static void main(String[] args) {
        System.out.println("----------------- Testing Initialization -----------------");
    SuperArray x = new SuperArray(); //Initialized new SuperArray without values
    System.out.println(x); // should return null from having nothing inside
    System.out.println(x.size()); // should return size - 0
    System.out.println(x.isEmpty()); // should return true
    System.out.println(x.set(5, "this shouldn't work")); //should return null
    System.out.println("----------------- Testing Add -----------------");
    System.out.println(x.add("String1")); //Adding first element
    System.out.println(x); // should return [String1]
    System.out.println(x.size()); // should return size - 1
    System.out.println("----------------- Testing Loops -----------------");
    for (int i = 9; i != 0; i--){
      x.add("loop");
    }
    System.out.println(x); // should return [String1, loop, loop, loop, loop, loop, loop, loop, loop, loop]
    System.out.println(x.isEmpty()); // should return false
    System.out.println(x.get(0)); // should return String1
    for (int i = 0; i < 10; i++){
      x.set(i, "new"); // should return [new, new, new, new, new, new, new, new, new, new]
    }
    System.out.println(x);
    System.out.println(x.size()); // should return size - 10
    System.out.println("----------------- Testing Debug Methods -----------------");
    x.clear(); //Empties SuperArray
    System.out.println(x.toStringDebug()); //should return [null, null, null, null, null, null, null, null, null, null]
    
  }
}
