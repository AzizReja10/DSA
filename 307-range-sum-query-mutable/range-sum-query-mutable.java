class NumArray {
    private int[] tree;
    private int n;

    public NumArray(int[] nums) {
        if (nums.length >= 0) {
            n = nums.length;
            tree = new int[n * 2];
            buildTree(nums);
        }
    }

    private void buildTree(int[] nums) {
        // Insert leaf nodes in the second half of the tree array
        for (int i = 0, j = n; i < n; i++, j++) {
            tree[j] = nums[i];
        }
        // Build the tree by calculating parents
        for (int i = n - 1; i > 0; i--) {
            tree[i] = tree[i * 2] + tree[i * 2 + 1];
        }
    }

    public void update(int index, int val) {
        index += n; // Move to the leaf node
        tree[index] = val;
        while (index > 1) {
            int left = index;
            int right = index;
            if (index % 2 == 0) {
                right = index + 1;
            } else {
                left = index - 1;
            }
            // Update parent to reflect child change
            tree[index / 2] = tree[left] + tree[right];
            index /= 2;
        }
    }

    public int sumRange(int left, int right) {
        // Get sum from [left, right]
        int sum = 0;
        left += n;
        right += n;
        while (left <= right) {
            if ((left % 2) == 1) {
                sum += tree[left];
                left++;
            }
            if ((right % 2) == 0) {
                sum += tree[right];
                right--;
            }
            left /= 2;
            right /= 2;
        }
        return sum;
    }
}