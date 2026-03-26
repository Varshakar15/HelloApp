package org.example;

public class uc4 {
    public static void main(string[] args){
        string name="";
        stringbuilder nameBuilder=new stringBuilder();
        for(int i=0;i<args.length;i++){
            nameBuilder.append(args[i]);
            if(i<args.length-1) {
                nameBuilder.append(", ");
            }
            name=nameBuilder.tostring();
            system.out.print(name);
            }
