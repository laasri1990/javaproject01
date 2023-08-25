package replitpriject;

import java.util.Scanner;

public class project5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("In: ");
        int x=scanner.nextInt();

        for (int i = 0; i<=x; i++) { // (x*2) if you want to print double times exp: 5  0123456789
            System.out.println(i);
        }


    }
}

/*
Given the following inputs:

```
int x;
```

Write a for loop that will print out a series of numbers starting at 0 and ending at the x
(value must be taken from a user), exclusive.
 */