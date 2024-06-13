package service.impl;

import service.ExercisesService;

public class ExercisesServiceImpl implements ExercisesService {
    int count = 0;
    @Override
    public void rusak(int n) {

        if (n == 0) {
            System.out.printf("String \"Hello\" dicetak sebanyak %d kali setelah pemanggilan fungsi rusak()%n", count);
            count = 0;
            return;
        }

        for (int i = 0 ; i < n ; i++) {
            System.out.println("Hello");
            count++;
        }

        rusak((int)n/2);
    }

    @Override
    public int roger(int k, int b) {
        if (b == 1) return 1;
        else if (k % b == 0) return 1 + roger(k, --b);
        else return roger(k, --b);
    }

    @Override
    public void countCharacter(String strInput) {
        String str = strInput.replaceAll("\\s", "");

        int countLower = 0;
        int countUpper = 0;
        int countNumber = 0;
        int countSymbol = 0;

        for(int i = 0; i < str.length(); i++){
            char word = str.charAt(i);

            if(word >= 'A' && word <= 'Z'){
                countUpper++;
            }else if(word >= 'a' && word <= 'z'){
                countLower++;
            }else if(word >= '0' && word <= '9'){
                countNumber++;
            }else{
                countSymbol++;
            }
        }

        System.out.println("uppercase : " + countUpper);
        System.out.println("lowercase : " + countLower);
        System.out.println("angka : " + countNumber);
        System.out.println("symbol : " + countSymbol);
    }
}
