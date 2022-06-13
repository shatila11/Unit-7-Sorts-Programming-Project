//Selection & Insertion Sorts
import java.io.*;
import static java.lang.System.*;
import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;

class U7_SortsPP{
  public static void main (String str[]) throws IOException {
    int[] elements = {21, 17, 60, 20, 56, 12};
    //Selection Sort
    for (int j = 0; j < elements.length -1; j++)
    {
      int minIndex = j;
      for (int k = j + 1; k < elements.length; k++)
      {
        if (elements[k] < elements[minIndex])
        {
          minIndex = k;
        }
      }
      int temp = elements[j];
      elements[j] = elements[minIndex];
      elements[minIndex] = temp;
    }
    
    for (int num : elements)
    {
      System.out.println(num);
    }

//Insertion Sort
int[] elements2 = {21, 17, 60, 20, 56, 12};
    for (int j = 1; j < elements2.length; j++)
    {
      int temp = elements2[j];
      int possibleIndex = j;
      while (possibleIndex > 0 && temp < elements2[possibleIndex - 1])
      {
        elements2[possibleIndex] = elements2[possibleIndex - 1];
        possibleIndex--;
        
      }
      elements2[possibleIndex] = temp;
    }

    for (int num : elements2)
    {
      System.out.println(num);
    }
  }
}
