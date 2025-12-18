public class Telephone {
    public static void main(String[] args) {

        // Use single quotes for char values and add a semicolon at the end
        char[][] telephone = {
            {'1', '2', '3'},
            {'4', '5', '6'},
            {'7', '8', '9'},
            {'*', '0', '#'}
        };

        for (char[] row : telephone) {
            // 'number' must be type char, not char[]
            for (char number : row) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}