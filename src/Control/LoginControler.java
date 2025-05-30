


// Datos de Usuario Temporal
String[][] credenciales = {
        { "admin",  "admin123"},
        { "juan.perez",  "jp456!"},
        { "maria.lopez",  "ml789@"},
        { "invitado",  "guest2024"},
        { "soporte",  "helpMeNow!"},
};

public boolean validacionDatos(String Eusuario , String Econtrasena){

    boolean res = false;
    for (int i = 0; i < credenciales.length; i++) {

        if (credenciales[i][0].equals(Eusuario) && credenciales[1][1].equals(Econtrasena)){
            res =true;
        }else{
            res =false;
        }
    }
    return res;
}

void main() {
}








