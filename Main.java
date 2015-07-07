import java.util.Scanner;
import java.io.*;

import com.Process;

public class Main {
  public static void main(String[] args) {
    Scanner readC = new Scanner(System.in);
    Process process = new Process();
    System.out.println("Ingresa un numero: ");
    process.setN(readC.nextInt());
    System.out.println(process.result());
  }
}
