public class Duplicados {
    public static String duplicados(int[] nums) {
        String duplicado = "";

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    duplicado += nums[i] + " ";
                    break;
                }
            }
        }
        return duplicado;
    }

    public static void main(String[] args) {
        int [] nums = {10, 10, 4, 20, 30, 65, 30};

        String resultado = duplicados(nums);

        System.out.println(resultado);
    }
}
