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
    return (this.n >= 21)?((this.n -= 21) * 2):this.n - 21;
  }

}
