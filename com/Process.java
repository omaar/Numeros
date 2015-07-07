package com;

public class Process {

  private int n;

  public Process(){
    this.n  = 0;
  }
  public int getN(){
    return this.n;
  }

  public void setN(int n){
    this.n = n;
  }

  public int result(){
    return (getN() > 21)?n *= n:n - 21;
  }

  public void setAll(int n){
    System.out.println("Ingresa un numero: ");
    setN(n);
  }

}
