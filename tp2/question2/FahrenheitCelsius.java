package question2;


/**
 * D�crivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom) 
 * @version (un num�ro de version ou une date)
 */
public class FahrenheitCelsius{

     /** le point d'entr�e de cette application, 
      * dont le commentaire est � compl�ter
      *
      *  @param args ...
      */
     public static void main(String[] args){
          //checking if arguments are entered
        if (args.length == 0 || args==null) {
            
            System.out.println("Veuillez saisir les valeurs � convertir dans la ligne de commande");
            return;
            
        }
        
        //looping the arguments sent in console
        for(int i=0; i< args.length; i++){
            
            //check if the argument is null or empty
            if (args[i] == null || args[i] == "" ){ 
                System.out.println("Argument "+i+" is null or empty, enter a valid integer number to convert");
                continue;
        }
        
        int fahrenheit = 0;
        try{
            fahrenheit = Integer.parseInt(args[i]);
       }catch(NumberFormatException nfe){
           System.out.println("error : " + nfe.getMessage());  // en cas d'erreur
           continue;   
       }
       
       
       float celsius = fahrenheitEnCelsius(fahrenheit);
            System.out.println(fahrenheit + "\u00B0F -> " + celsius + "\u00B0C");
        
    } 

     }
     
     /** 
      * la m�thode � compl�ter. 
      *   @param f la valeur en degr� Fahrenheit
      *   @return  la conversion en degr� Celsius
      */
     public static float fahrenheitEnCelsius( int temperatureInFahrenheit){
       float temperatureInCelsius;
          
        temperatureInCelsius = ((float)(temperatureInFahrenheit - 32)*5)/(float)9;
            
        temperatureInCelsius = (float)((int)(temperatureInCelsius*10))/10; 
        
        return temperatureInCelsius;
        
        //return 0.F; // � compl�ter en rempla�ant ce return 0.F par la fonction
                    // de conversion
     }

}
