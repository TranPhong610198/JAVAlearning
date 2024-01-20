/**
 *
 * @Student name:
 */
class Fraction {

  private int numer;
  private int denom;

  //Definition
  public Fraction(int num, int den) {
    //Students write here appropriate statements to complete this function
    numer = num;
    denom = den;
  }

  //Simplify - tối giản hóa phân số
  void simplify() {
    int gcd = findGCD(numer, denom);
    numer /= gcd;
    denom /= gcd;
  }

  //GCD Function - tìm ước chung lớn nhất 
  int findGCD(int a, int b) {
    int temp;

    while (b != 0) {
      temp = b;
      b = a % b;
      a = temp;
    }

    return a;
  }

  //GetNumerator
  public int getNumer() {
    //Students write here appropriate statements to complete this function
    return numer;
  }

  //GetDenominator
  public int getDenom() {
    //Students write here appropriate statements to complete this function
    return denom;
  }

  //Fraction Add Method
  Fraction add(Fraction x) {
    Fraction result;

    if (denom == x.denom) {
      result = new Fraction(x.numer + numer, denom);
    } else {
      int den = denom * x.getDenom();
      int num = numer * x.getNumer();
      num += x.getNumer() * denom;
      result = new Fraction(num, den);
    }

    return result;
  }

  //Fraction Subtract Method
  Fraction subtract(Fraction x) {
    Fraction result;

    if (x.denom == denom) {
      //Students write here appropriate statements to complete this function
      
    } else {
      //Students write here appropriate statements to complete this function
      result = new Fraction(num, den);
    }

    return result;
  }

  //Fraction Multiply Method
  Fraction multiply(Fraction x) {
    Fraction result;

    if (x.denom == denom) {
      //Students write here appropriate statements to complete this function
    } else {
      //Students write here appropriate statements to complete this function
      result = new Fraction(num, den);
    }

    return result;
  }

  //Fraction Divide Method
  Fraction divide(Fraction x) {
    Fraction result;

    if (x.denom == denom) {
      //Students write here appropriate statements to complete this function
    } else {
      //Students write here appropriate statements to complete this function
      result = new Fraction(num, den);
    }

    return result;
  }

  //@Override
  public boolean equals(Fraction x) {

    boolean result = false;

    if (numer == x.numer && denom == x.denom) {
      result = true;
    }

    return result;
  }

  //ToString
  public String toString() {
    return (Integer.toString(numer) + "/" + Integer.toString(denom));
  }
}

/**
 *
 * @Student name:
 */
public class FractionDemo {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Fraction a = //Students write here appropriate statements to complete this function
    Fraction b = //Students write here appropriate statements to complete this function
    System.out.println( //Students write here appropriate statements to complete this function
    System.out.println( //Students write here appropriate statements to complete this function
      Fraction c = //Students write here appropriate statements to complete this function
      System.out.println(c.toString());
      c = //Students write here appropriate statements to complete this function
      System.out.println(c.toString());
      c = //Students write here appropriate statements to complete this function
      System.out.println(c.toString());
      c = //Students write here appropriate statements to complete this function
      System.out.println(c.toString());
    }
  }
