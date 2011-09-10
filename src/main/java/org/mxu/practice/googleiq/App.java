package org.mxu.practice.googleiq;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
	public static final String RED = "red";
	public static final String YELLOW = "yellow";
	public static final String BLUE = "blue";
	
	public static String[] tripleSort(String[] args){
		if(args==null){
			return null;
		}
		int redIndex = 0;
		int blueIndex = args.length-1;
		int i = 0;
		while(i < args.length){
			if(RED.equals(args[i])){
				if(i > redIndex){
					//swap the element with the leftest non red element
					String tmp = args[i];
					args[i] = args[redIndex];
					args[redIndex] = tmp;
					redIndex++;
				}else if(i==redIndex){
					i++;
				}
			}else if(BLUE.equals(args[i])){
				if(i < blueIndex){
					//swap the element with the rightest non blue element
					String tmp = args[i];
					args[i] = args[blueIndex];
					args[blueIndex] = tmp;
					blueIndex--;
				}else if(i >= blueIndex){
					break;
				}
			}else{
				i++;
			}
		}
		
		return args;
	}
    
}
