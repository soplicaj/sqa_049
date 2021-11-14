package general;

public class MultiDimmensionArraysTutor {
    public static void main(String[] args) {
        int[][] m = new int[3][3];

        for (int i=0; i<m.length; i++) {
            for (int j=0; j<m[i].length; j++) {
                m[i][j] = i+j;
            }
        }

        for (int i[]:m) {
            for (int j:i) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}
