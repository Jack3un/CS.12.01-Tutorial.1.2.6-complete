public class Mountain {

    public static boolean isIncreasing(int[] arr, int pause) 
    {
        for (int i = 0; i < pause ; i++)
        {
            if (arr[i] >= arr[i + 1])
            {
                return false;
            }
        }
        return true;
    }

    public static boolean isDecreasing(int[] arr, int start)
    {
        for (int i = start; i < arr.length - 1; i++)
        {
            if (arr[i] <= arr[i + 1])
            {
                return false;
            }
        }
        return true;
    }

    public static int getPeakIndex(int[] arr)
    {
        for (int i = 1; i < arr.length - 1; i++)
        {
            if (arr[i] > arr[i-1] && arr[i] > arr[i + 1])
            {
                return i;
            }
        }
        return -1;
    }

    public static boolean isMountain(int[] arr)
    {
        int peak = getPeakIndex(arr);
        return peak != -1 && isIncreasing(arr, peak) && isDecreasing(arr, peak);
    }

}