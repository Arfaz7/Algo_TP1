/**
 * Created by arfaz on 08/02/2017.
 */

import java.util.*;


public class RandomData {
    public static int[] generate1d(int nbVals, int min, int max){

        int[] res= new int[nbVals];

        Random random = new Random();

        for(int i=0; i != nbVals; ++i){
            res[i]= (int)(Math.random() * (max-min)) + min;
        }

        return res;
    }
}
