package demo;

import java.util.Arrays;
import java.util.HashMap; // import the HashMap class


public class StatisticFormulas {
    public static double mean(int[] values) {
        if(values.length == 0) {
            return 0;
        }

        float y = 0;

        // Get cumulative sum
        for(int value: values) {
            y += value;
        }

        // Return average
        return y / values.length;
    }

    public static double median(int[] values) throws Exception {
        // If empty
        if(values.length == 0) {
            throw new Exception("Cannot find median of empty array");
        }

        // Copy to not overwrite input array
        int[] copy = Arrays.copyOf(values, values.length);

        Arrays.sort(copy);

        if(copy.length % 2 == 0) {    // Even
            int idx = copy.length / 2;
            return (float)(copy[idx] + copy[idx - 1]) / 2;
        } else {                        // Odd
            int idx = copy.length / 2;
            return copy[idx];
        }
    }

    public static int mode(int[] values) throws Exception {
        // If empty
        if(values.length == 0) {
            throw new Exception("Cannot find mode of empty array");
        }

        HashMap<Integer, Integer> frequency = new HashMap<>();

        // Count frequencies of nums
        for(int num: values) {
            if(frequency.containsKey(num)) {
                frequency.put(num, frequency.get(num) + 1);
            } else {
                frequency.put(num, 1);
            }
        }


        // Find num with greatest frequency
        int greatestFrequency = 0;
        int mode = -1;
        int numFrequency;
        for(int num : frequency.keySet()) {
            numFrequency = frequency.get(num);

            if(numFrequency > greatestFrequency) {
                greatestFrequency = numFrequency;
                mode = num;
            }
        }

        return mode;
    }
}
