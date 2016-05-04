public class quickPass{
    //strength should be input 0-1
    public void generatePass(int length, double strength){
        String password="";
        for(int i=0;i<length;i++){
            if(Math.random()>strength){
                password+=getChar(0);
            }else{
                password+=getChar(1);
            }
        }
        System.out.println(password);
    }
    public char getChar(int difficulty){
        char[]mediumCharList={'0','1','2','3','4','5','6','7','8','9','0',';',',','.','/'};
        int randVal=(int)((Math.random()*94)+33);
        if(difficulty==0){
            if(randVal>=97&&randVal<=122){
                return (char)randVal;
            }
            return getChar(difficulty);
        }else if(difficulty==1){
            for(char c:mediumCharList){
                if(c==(char)randVal){
                    return (char)randVal;
                }
            }
            return getChar(difficulty);
        }else if(difficulty==2){
            for(char c:mediumCharList){
                if(c==(char)randVal){
                    return getChar(difficulty);
                }
            }
            if(randVal>=97&&randVal<=122){
                return getChar(difficulty);
            }
            return (char)randVal;
        }
        return (char)32;
    }
}