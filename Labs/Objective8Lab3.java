public class Objective8Lab3 {
  public static void main(String[] args) {
    int counter = 1;
    int i = 0;
    for (i=0; i<20; i+=1){
      if (counter % 2 == 0) {
        System.out.println(counter + " is even");
      }
      else System.out.println(counter + " is odd");
      counter +=1;
    }
  }
}
