import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions.*;


public class combinations{
 @Test
    public void factorialTest(){
     int n = 4;
     int result = Main.factorial(n);

     System.out.println(result);

     Assertions.assertEquals(24, result);
 }
 @Test
 public void combinationsTest(){
  int n = 6;
  int k = 3;

  int result = Main.combinations(n, k);

  Assertions.assertEquals(20, result);
 }
 @Test
 public void possibleCombinations(){
  //Algorithm test
 }
}