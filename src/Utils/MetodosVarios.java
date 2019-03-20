package Utils;

import javax.swing.JOptionPane;

public class MetodosVarios {

private static String nombreAtr[] = {"Agilidad","Astucia","Espiritu","Fuerza","Vigor","Salir"};    
private static String nombreRaza[] = {"Humano","Elfo","Enano","Mediano","Orco","Salir"};    

public static String pedirString(String msg){
    return JOptionPane.showInputDialog(msg);
}
public static int pedirenteiro(String msg){
    return Integer.parseInt(JOptionPane.showInputDialog(msg));
}
    
public static String pedirNombreAtr( String msg){
    int aux = -1; String atributo;
    do{
        atributo = JOptionPane.showInputDialog(msg);
        for (int i = 0; i < nombreAtr.length; i++) {
            if (atributo.equalsIgnoreCase(nombreAtr[i])){
                aux = i;
            }}
            if(aux < 0 || aux > 5) {
                JOptionPane.showConfirmDialog(null,"La opción introducida no es correcta, por favor intentalo de nuevo");
            }
    }while (aux < 0 || aux > 5);
    return atributo;
}

public static String pedirNombreRaza(String msg){
    int aux = -1; String raza;
    do{
        raza = JOptionPane.showInputDialog(msg);
        for (int i = 0; i < nombreRaza.length; i++) {
            if (raza.equalsIgnoreCase(nombreRaza[i])){
                aux = i;
            }}
            if(aux < 0 || aux > 5) {
                JOptionPane.showConfirmDialog(null,"La opción introducida no es correcta, por favor intentalo de nuevo");
            }
    }while (aux < 0 || aux > 5);
    return raza;
}

public static int pedirPuntosAtr(String msg){
    int puntos;
    do{
        puntos = Integer.parseInt(JOptionPane.showInputDialog(msg));
        if(puntos < 0 || puntos > 4)
            JOptionPane.showMessageDialog(null, "La cantidad introducida no es valida: ");
    }while(puntos <0 || puntos > 4);
    return puntos;
}

public static void ErrorMaxSuperado (String msg){
    JOptionPane.showMessageDialog(null, msg);
}

}
