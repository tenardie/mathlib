package xyz.ylmzr;

import java.util.ArrayList;

public class MathLib {
    public static void main(String[] args) {}

    public static class Carpan{
        public static ArrayList<Long> getCarpan(long num){
            ArrayList<Long> out = new ArrayList<Long>();
            double tempD;
            long tempL;
            for(long i=1;i<=num;i++){
                tempL = num / i;
                tempD = num * 1.0 / i;
                if(tempL == tempD){
                    out.add(i);
                }
            }
            return out;
        }

        public static ArrayList<Long> getAsalCarpan(long num){
            ArrayList<Long> out = new ArrayList<>();
            for(int i=0;i<getCarpan(num).size();i++){
                if(getCarpan(getCarpan(num).get(i)).size() == 2){
                    out.add(getCarpan(num).get(i));
                }
            }
            return out;
        }

        public static boolean isAsal(long num){
            return getCarpan(num).size() == 2;
        }
    }

}
