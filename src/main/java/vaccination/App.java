package vaccination;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;

public class App {
    private static final Logger logger = Logger.getLogger(App.class.getName());
    private static final Scanner input = new Scanner(System.in);

    private static ArrayList<User> users = new ArrayList<>();
    private static ArrayList<VaccinationCenter> centers = new ArrayList<>();

    private App() {
    }

    public static void start() {
        String name;
        String password;
        logger.info("Log in");
        logger.info("Username: ");
        name = input.next();
        logger.info("Password: ");
        password = input.next();
        if (!login(name, password)) {
            logger.info("Fail to log in.");
            return;
        }
        actions();
    }

    public static void register(String name, String password) {
        users.add(new User(name, password));
    }

    public static boolean login(String name, String password) {
        for (User user : users)
            if (user.auth(name, password)) return true;
        return false;
    }

    public static void actions() {
        var status = true;
        do {
            logger.info("=== Acciones ==");
            logger.info("(0) Cerrar sesión");
            logger.info("(1) Dar un centro de alta");
            logger.info("(2) Dar un centro de baja");
            logger.info("(3) Reporte");
            logger.info("Respuesta: ");
            var response = input.nextInt();
            switch (response) {
                case 0:
                    status = false;
                    break;
                case 1:
                    logger.info("Dar de alta a un centro");
                    logger.info("Nombre del centro: ");
                    createCenter(input.next());
                    break;
                case 2:
                    logger.info("Dar de baja a un centro");
                    logger.info("Centros: ");
                    for (VaccinationCenter center : centers) {
                        String out = "- " + center.getName();
                        logger.info(out);
                    }
                    logger.info("Nombre del centro a dar de baja: ");
                    deleteCenter(input.next());
                    break;
                case 3:
                    break;
                default:
                    status = false;
            }
        } while (status);
    }

    public static void createCenter(String name) {
        if (centers.size() < 50) centers.add(new VaccinationCenter(name));
    }

    public static void deleteCenter(String name) {
        for (var i = 0; i < centers.size(); ++i) {
            if (centers.get(i).compare(name)) {
                centers.remove(i);
            }
        }
    }
}