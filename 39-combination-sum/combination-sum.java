class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
          List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, 0, target, new ArrayList<>(), result);
        return result;
    }
       private void backtrack(int[] arr, int i, int target, List<Integer> current, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        if (i == arr.length || target < 0)
            return;

        current.add(arr[i]);
        backtrack(arr, i, target - arr[i], current, result);
        current.remove(current.size() - 1);
        backtrack(arr, i + 1, target, current, result);
    }
}