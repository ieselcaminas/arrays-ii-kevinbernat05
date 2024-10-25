public class Comunes {
    public static String comunes(int[] nums1, int[] nums2) {

        String repe = " ";

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    repe += nums1[i] + " ";
                    break;
                }
            }
        }
        return repe;
    }
    public static void main(String[] args) {
        int[] nums1 = {4,5,7,9,4,2};
        int[] nums2 = {4,6,2};



        System.out.println(comunes(nums1, nums2));
    }
}
