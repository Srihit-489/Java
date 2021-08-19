public static String kangaroo(int x1, int v1, int x2, int v2) {
    if(x1 > x2 && v1 > v2){
        return "NO";
    }else if(x1 < x2 && v1 < v2){
        return "NO";
    }
    
    int dif = x1 - x2;
    int speed = v2 - v1;
    if(dif == 0){
        return "YES";
    }else if(speed == 0){
        return "NO";
    }else{
        return dif%speed == 0?"YES":"NO";
    }
    
    }
