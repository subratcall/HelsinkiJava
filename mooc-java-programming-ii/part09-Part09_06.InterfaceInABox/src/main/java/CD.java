/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author petersims
 */
public class CD implements Packable{
    public String artist;
    public String title;
    public int year;

    public CD(String artist, String title, int year) {
        this.artist = artist;
        this.title = title;
        this.year = year;
    }
    
   @Override
   public double weight(){
       return 0.1;
   }
   
   @Override
   public String toString(){
       return this.artist + ": " + this.title + " (" + this.year + ")";
   }
}
