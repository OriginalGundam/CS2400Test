//Task C
//Matthew Yeung
//CS1400
//Assignment 4
//10-08-2023
public class TaskC{
    public static void main(String[] args){
        for (int looptime = 5;  looptime > 0; looptime = looptime - 1)
        {
            String people = "";
            String person = "\\O/";
            for(int peopleloop = looptime; peopleloop > 0; peopleloop--){
                people += person;
            }
            System.out.println(people);
        }
    }
}