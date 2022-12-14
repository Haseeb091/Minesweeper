package org.example;

public class Tile {

    private boolean isVisible;
    private boolean isMine;

    private int value;

    private boolean isFlagged;

    public Tile(int value){
        this.value=value;
        isVisible=false;
        isFlagged=false;
        isMine=false;
    }

    public void setValue(int value){
        this.value=value;

    }

    public int getValue(){
        return value;

    }

    public void setisFlagged(boolean isFlagged){
    this.isFlagged=isFlagged;

    }
    public boolean getisFlagged(){
        return isFlagged;

    }

    public void setisVisible(boolean isVisible){
        this.isVisible=isVisible;

    }
    public boolean getisVisible(){

        return isVisible;
    }

    public void setisMine(boolean isMine){

        this.isMine=isMine;
    }
    public boolean getisMine(){
        return isMine;

    }

    public void print(){
        if(!isVisible){
            if (isFlagged){
                System.out.print("f");
            }else {
            System.out.print("x");}
        }else{
            if(isMine){
                System.out.print("M");

            }else {
                System.out.print(value);

            }

        }

    }

}
