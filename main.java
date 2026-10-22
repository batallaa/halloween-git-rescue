public class main {

    static boolean checkAccess(String user) {
        return user.equals("admin");
    }

    static void triggerAlarm(boolean active) {
        if (active) {
            System.out.println("ALARMA ACTIVADA");
        }
    }

    public static void main(String[] args) {
        System.out.println("Sistema de la sala de servidores iniciado");

        String securityLevel = "sanctuary";
        System.out.println("Nivel de seguridad: " + securityLevel);

        if (checkAccess("admin")) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Acceso denegado");
        }

        triggerAlarm(false);
    }
}