public class SumaIgual {
    public static String sumaIgual(int[] nums, int x) {
        String suma = "";

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == x) {
                    suma += "[" + nums[i] + " + " + nums[j] + "]";
                    break;
                }
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        int [] nums = {2, 3, 3, 5, 4, 1};

        int x = main.Utilidades.leerEntero("Introduce tu valor: ");

        System.out.println(sumaIgual(nums, x));
    }
}
