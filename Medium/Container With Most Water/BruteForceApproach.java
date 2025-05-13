public class BruteForceApproach {

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};

        int maxArea = maxArea(height);
        System.out.println("Maximum water container area: " + maxArea);
    }

    private static int maxArea(int[] height){
        int len = height.length;
        int area = 0;
        for(int i = 0; i < len -1; i++){
            for(int j = i; j < len; j++){
                int w = Math.min(height[i],height[j]);
                int b = j-i;
                int curr = w *b;
                if(curr > area){
                    area = curr;
                }
            }
        }

        return area;
    }
    
}
