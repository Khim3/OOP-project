// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import javax.swing.JFrame;

class Pacman extends JFrame{

    public Pacman() {
        add(new Model());
    }


    public static void main(String[] args) {

        Pacman pac = new Pacman();
        pac.setVisible(true);
        pac.setTitle("Pacman Game");
        pac.setSize(380,420);
        pac.setDefaultCloseOperation(EXIT_ON_CLOSE);
        pac.setLocationRelativeTo(null);
    }

}