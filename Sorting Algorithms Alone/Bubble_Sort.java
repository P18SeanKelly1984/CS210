package Sorting;

import java.util.Arrays;

public class Bubble_Sort
{
  public static void main(String args[])
  {
    int[] array = {13, 5, 8, 3, 10, 15, 53};

    boolean swapped = false;
    
    do
    {
      swapped = false;

      for(int i = 0; i < array.length - 1; i++)
      {
        if(array[i] > array[i + 1])
        {
          int temp = array[i];
          array[i] = array[i + 1];
          array[i + 1] = temp;

          swapped = true;
        }
      } 
    } 
    while(swapped);

    System.out.println(Arrays.toString(array));

  }

}
