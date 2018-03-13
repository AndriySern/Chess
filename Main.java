package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	String position = input();
    int x = (int)position.charAt(0)-96;
	int y = (int)position.charAt(1)-48;
    int [] xMove = {1,-1,2,2,-2,-2,1,-1};
    int [] yMove = {2,2,1,-1,1,-1,-2,-2};
	String result = "List of new horse positions: ";
    for (int i=0;i<8;i++) {
	    if((x+xMove[i])<8&&(y+yMove[i])<8 &&(x+xMove[i])>0&&(y+yMove[i])>0) {
	        result = result + (char)((x+xMove[i])+96) + (char)((y+yMove[i])+48)+ " ";
	    }
    }
	System.out.println(result);

    }


    public static String input() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the horse start position: ");
        return reader.readLine();
    }

    }
