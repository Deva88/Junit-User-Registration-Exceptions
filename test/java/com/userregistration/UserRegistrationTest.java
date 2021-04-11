package com.userregistration;


class FNameException extends Exception {
    FNameException(String f){
        super(f);
    }
}
class LNameException extends Exception {
    LNameException(String l){
        super(l);
    }
}
class MobileException extends Exception {
    MobileException(String m){
        super(m);
    }
}
class EMailException extends Exception {
    EMailException(String e){
        super(e);
    }
}
class PassException extends Exception {
    PassException(String p){
        super(p);
    }
}