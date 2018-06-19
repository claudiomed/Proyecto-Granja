
package granja;
import java.util.*;
import java.util.ArrayList;

/**
@author Claudio Medrano
@Version 2.0
@since 2018-06-14

*/

public class Controller {
    
    public void Control(){
        
       
        int COW=1;
        int DOG=1;
        int HOR=1;
        int PIG=1;
        int CAT=1;
        boolean stop=false;
        do{
        Random con = new Random();
        int random=con.nextInt(5)+1; 
        
            switch (random){
                case 1:{
                    Vaca cow = new Vaca();
                    ArrayList<Vaca> list = new ArrayList<>();
                    cow.setNombre(COW);
                    list.add(cow);
                    System.out.println(cow.getNombre()+"  "+cow.mugir());
                    COW++;
                    break;
                }
                case 2:{
                    Perro dog = new Perro();
                    ArrayList<Perro> list = new ArrayList<>();
                    dog.setName(DOG);
                    list.add(dog);
                    System.out.println(dog.getName()+" "+dog.ladrar());
                    DOG++;
                    break;
                }
                case 3:{
                    Caballo horse = new Caballo();
                    ArrayList <Caballo> list = new ArrayList<>();
                    horse.setName(HOR);
                    list.add(horse);
                    System.out.println(horse.getName()+" "+horse.relinchar());
                    HOR++;
                }
                case 4:{
                    Cerdo pig = new Cerdo();
                    ArrayList<Cerdo> list = new ArrayList();
                    pig.setName(PIG);
                    list.add(pig);
                    System.out.println(pig.getName()+" "+pig.gruñir());
                    PIG++;
                }
                case 5:{
                    Gato cat = new Gato();
                    ArrayList<Gato> list = new ArrayList();
                    cat.setName(CAT);
                    list.add(cat);
                    System.out.println(cat.getName()+" "+cat.maullar());
                    CAT++;
                }
            
            }
            
        }while(stop==false);
    
    }
    
}
