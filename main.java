public class main {

    static boolean checkAccess(String user) {
        return user.equals("admin");
    }

    public static void main(String[] args) {
        System.out.println("Sistema de la sala de servidores iniciado");

        if (checkAccess("admin")) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Acceso denegado");
        }
    }
}