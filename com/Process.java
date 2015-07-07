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

  public int result(int n){
    return (n > 21)?n *= n:n - 21;
  }
}
