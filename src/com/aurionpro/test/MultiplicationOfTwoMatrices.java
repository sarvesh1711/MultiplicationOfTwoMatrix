package com.aurionpro.test;

public class MultiplicationOfTwoMatrices{  
public static void main(String args[]){  
  
int a[][]={{10,11,12},{21,22,23},{31,32,33}};    
int b[][]={{13,14,15},{24,25,26},{34,35,36}};    
    

int c[][]=new int[3][3];  
    
   
for(int i=0;i<args.length;i++)
{    
for(int j=0;j<args.length;j++)
{    
c[i][j]=0;      
for(int s=0;s<3;s++)      
{      
c[i][j]+=a[i][s]*b[s][j];      
}
System.out.print(c[i][j]+" ");    
} 
System.out.println(); 
}    
}}  


/*
Output:
802 835 868 
1583 1649 1715 
2293 2389 2485 
*/
