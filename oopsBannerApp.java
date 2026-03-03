/*public class oopsBannerApp {
    public static void main(String[] args) {
        System.out.println("OOPS");
    }
}*/

/*public class oopsBannerApp {
    public static void main(String[] args) {

        System.out.println("      ***      ***      *****       *****      ");
        System.out.println("     ** **    ** **    **   **    **           ");
        System.out.println("    **   **  **   **   **   **   **            ");
        System.out.println("    **   **  **   **   *****      ***          ");
        System.out.println("    **   **  **   **   **            **        ");
        System.out.println("     ** **    ** **    **             **       ");
        System.out.println("      ***      ***     **        *****         ");

    }
}*/
/*public class OOPSBannerApp3 {
    public static void main(String[] args) {

        System.out.println(String.join("", "      ***      ***      *****       ***** "));
        System.out.println(String.join("", "     ** **    ** **    **   **    **      "));
        System.out.println(String.join("", "    **   **  **   **   **   **   **       "));
        System.out.println(String.join("", "    **   **  **   **   *****      ***     "));
        System.out.println(String.join("", "    **   **  **   **   **            **   "));
        System.out.println(String.join("", "     ** **    ** **    **             **  "));
        System.out.println(String.join("", "      ***      ***     **        *****    "));

    }
}*/
/*public class oopsBannerApp {

    public static void main(String[] args) {

    
        String[] banner = new String[7];

    
        banner[0] = String.join("", "      ***      ***      *****       ***** ");
        banner[1] = String.join("", "     ** **    ** **    **   **    **      ");
        banner[2] = String.join("", "    **   **  **   **   **   **   **       ");
        banner[3] = String.join("", "    **   **  **   **   *****      ***     ");
        banner[4] = String.join("", "    **   **  **   **   **            **   ");
        banner[5] = String.join("", "     ** **    ** **    **             **  ");
        banner[6] = String.join("", "      ***      ***     **        *****    ");

        
        for (String line : banner) {
            System.out.println(line);
        }
    }
}*/
/*public class oopsBannerApp {

    public static void main(String[] args) {

    
        String[] banner = new String[7];

    
        banner[0] = String.join("", "      ***      ***      *****       ***** ");
        banner[1] = String.join("", "     ** **    ** **    **   **    **      ");
        banner[2] = String.join("", "    **   **  **   **   **   **   **       ");
        banner[3] = String.join("", "    **   **  **   **   *****      ***     ");
        banner[4] = String.join("", "    **   **  **   **   **            **   ");
        banner[5] = String.join("", "     ** **    ** **    **             **  ");
        banner[6] = String.join("", "      ***      ***     **        *****    ");

        
        for (String line : banner) {
            System.out.println(line);
        }
    }
}*/
public class oopsBannerApp {
    public static void main(String[] args) {
        char[][] O = {
            {' ', '*', '*', '*', ' '},
            {'*', ' ', ' ', ' ', '*'},
            {'*', ' ', ' ', ' ', '*'},
            {'*', ' ', ' ', ' ', '*'},
            {' ', '*', '*', '*', ' '}
        };

        char[][] P = {
            {'*', '*', '*', '*', ' '},
            {'*', ' ', ' ', ' ', '*'},
            {'*', '*', '*', '*', ' '},
            {'*', ' ', ' ', ' ', ' '},
            {'*', ' ', ' ', ' ', ' '}
        };

        char[][] S = {
            {' ', '*', '*', '*', '*'},
            {'*', ' ', ' ', ' ', ' '},
            {' ', '*', '*', '*', ' '},
            {' ', ' ', ' ', ' ', '*'},
            {'*', '*', '*', '*', ' '}
        };

        char[][][] letters = {O, O, P, S};

        for (int i = 0; i < 5; i++) {
            for (int l = 0; l < letters.length; l++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(letters[l][i][j] + " ");
                }
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
