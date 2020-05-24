package question2;


/**
 * Décrivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom) 
 * @version (un numéro de version ou une date)
 */
public class FahrenheitCelsius{

     /** le point d'entrée de cette application, 
      * dont le commentaire est à compléter
      *
      *  @param args ...
      */
     public static void main(String[] args){
          //checking if arguments are entered
        if (args.length == 0 || args==null) {
            
            System.out.println("Veuillez saisir les valeurs à convertir dans la ligne de commande");
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
      * la méthode à compléter. 
      *   @param f la valeur en degré Fahrenheit
      *   @return  la conversion en degré Celsius
      */
     public static float fahrenheitEnCelsius( int temperatureInFahrenheit){
       float temperatureInCelsius;
          
        temperatureInCelsius = ((float)(temperatureInFahrenheit - 32)*5)/(float)9;
            
        temperatureInCelsius = (float)((int)(temperatureInCelsius*10))/10; 
        
        return temperatureInCelsius;
        
        //return 0.F; // à compléter en remplaçant ce return 0.F par la fonction
                    // de conversion
     }

}
