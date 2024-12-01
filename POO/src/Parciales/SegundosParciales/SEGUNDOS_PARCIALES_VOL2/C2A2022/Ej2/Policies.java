package Parciales.SegundosParciales.SEGUNDOS_PARCIALES_VOL2.C2A2022.Ej2;

public enum Policies {
    NONE {
        @Override
        public boolean passwordIsValid(String password){
            return password.length() > 0;
        }
    },
    LEVEL1 {
        @Override
        public boolean passwordIsValid(String password){
            return(password.length() > 4);
        }
    },
    LEVEL2 {
        @Override
        public boolean passwordIsValid(String password){
            return password.length() > 8 && password.contains("*");
        }
    };

    public abstract boolean passwordIsValid(String password);

}
