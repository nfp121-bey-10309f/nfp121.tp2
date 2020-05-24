package question1;

/**
 * Décrivez votre classe FahrenheitCelsius ici.
 * 
 * @author (Mohamed SABRA)
 * @version (1)
 */
public class FahrenheitCelsius {

    /**
     * le point d'entrée de cette application, dont le commentaire est à
     * compléter
     * 
     * @param args
     *            Veuillez saisir les valeurs Fahrenheit (type entier) à convertir à Celsius dans la ligne de commande
     */
    public static void main(String[] args) {
        // pour tous les paramètres de la ligne de commande
        
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
        
            //check if the argument cannot be converted to Integer by encapsulating the Integer.parseInt(String s) method
            
            int fahrenheit = 0;
            //done before reading question 2, will be done in question 2 according to the instructions using getMessage()
             try {
                    fahrenheit = Integer.parseInt(args[i]);
                } catch (NumberFormatException e) {
                    System.out.println("Argument "+i+" has a wrong format, enter a valid integer number to convert");
                    continue;
                }
            
            float celsius = fahrenheitEnCelsius(fahrenheit);
            System.out.println(fahrenheit + "\u00B0F -> " + celsius + "\u00B0C");
        }

        
        
        
        /*int fahrenheit = 0;
        float celsius = 0;
        System.out.println(fahrenheit + "\u00B0F -> " + celsius + "\u00B0C"); // ligne,
                                                                                // format
                                                                                // imposés*/
                                                                                
    }

    /**
     * la méthode à compléter.
     * 
     * @param f
     *            la valeur en degré Fahrenheit
     * @return la conversion en degré Celsius
     */
    public static float fahrenheitEnCelsius(int temperatureInFahrenheit) {
        float temperatureInCelsius;
          
        temperatureInCelsius = ((float)(temperatureInFahrenheit - 32)*5)/(float)9;
             
        //rounding the result to 1 decimal 
        //double scale = Math.pow(10, 1); //1 decimal
        //temperatureInCelsius = (float)(Math.round(temperatureInCelsius * scale) / scale);
        
        temperatureInCelsius = (float)((int)(temperatureInCelsius*10))/10; 
        return temperatureInCelsius;
        
        //return 0.F; // à compléter en remplaçant ce return 0.F par la fonction
                    // de conversion
    }
    

    
   
}


