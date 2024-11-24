package Taller16Poo.Ejercicio3;

public class CanalPush extends CanalMensaje{

    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando notificacino push: " + mensaje);
    }
    
}
