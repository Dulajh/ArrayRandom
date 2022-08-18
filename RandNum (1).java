import java.util.Random;

public class  RandNum{
  int arr[][] = new int[5][5];
Random random = new Random();
  
  int sum = 0;
  double avg = 0.00;
  int max = 0;
  int min;
  

  RandNum(){
  for(int i = 0; i<5; i++)
  {
     System.out.println("");
    for(int j = 0; j<5; j++)
      {
        int n = random.nextInt(100);
        arr[i][j] = n;
        System.out.print(arr[i][j]+" ");
        
        
      }
  }
 }
  
  public void MaxMinAvg(){
  min = arr[0][0]; 
    
    for(int i = 0; i<5; i++)
  {
    System.out.println("");
    for(int j = 0; j<5; j++)
      {
        if(max < arr[i][j]){
          max = arr[i][j];
        }
        if(min > arr[i][j]){
          min = arr[i][j];
        }
        sum =+ arr[i][j];
        
      }
  }
    avg = sum/25.00;
 }

  public void Display(){
    System.out.println("Maximum is :" +max + " minimum is :"+min+" Avarage is "+ avg);
  }
  
}