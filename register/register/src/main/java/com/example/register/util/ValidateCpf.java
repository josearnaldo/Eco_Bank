package com.example.register.util;


public class ValidateCpf {
    

    public static boolean isValid(String cpf){
        int sum=0,sum2=0;
		int validenumber1, validenumber2;
        int cont = 11;
        String[] validateCPF = cpf.split("");
        for(int i=0; i < 9; i++){
            cont--;
            sum += Integer.parseInt(validateCPF[i])*cont;
        }
        cont = 12;
        for(int i =0; i<10; i++){
            cont --;
            sum2 += Integer.parseInt(validateCPF[i])*cont;
        }

        validenumber1 = (sum*10)%11;
        validenumber2 = ((sum2*10)%11);
        
        if(validenumber1 ==10){
            validenumber1 =0;
        }else if(validenumber2 == 10){
            validenumber2 =0;
        }
        
      
        return validenumber1 == Integer.parseInt(validateCPF[9]) && validenumber2 == Integer.parseInt(validateCPF[10]);
      
    }
}
