package com.company.killoran;

public class Main {

    public static void main(String[] args) {
	// write your code here
    int i = 0;

    while(i<10){
        i+=2;
        System.out.println(i);
    }

    for(i=0;i<=10;i++){
        System.out.println(i);
        i++;
    }

    i = 1000;
    do{
        System.out.println(i);
        i+=2;
    }while(i<12);

    int[] integers = {1,2,3,4,-1,-2,10,4,-35,98,-100};
    //find all negative values in the array.
        for(i = 0; i< integers.length ; i++){
            if(integers[i]<0) {
                System.out.println(integers[i]);
            }
        }

    for(int j = 1; j<=10; j++){
        System.out.println(j);
    }

        String name = "Simeon";
        System.out.println(name);
        name= name.substring(1,name.length()-1);
        System.out.println(name);




    }
}
