public class Iguales {
    public static boolean esIgual(int[] nums1, int[] nums2){

        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] != nums2[i]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,5};
        int[] nums2 = nums1.clone();

        System.out.println(esIgual(nums1, nums2));
    }
}
