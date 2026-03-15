
class RandomizedSet {
    private List<Integer> nums;
    private Map<Integer, Integer> locs; 
    private Random rand = new Random();
    public RandomizedSet() {
        nums = new ArrayList<>();
        locs = new HashMap<>();
    }
    public boolean insert(int val) {
        if (locs.containsKey(val)) return false;
        locs.put(val, nums.size());
        nums.add(val);
        return true;
    }

    public boolean remove(int val) {
        if (!locs.containsKey(val)) return false;
        int location = locs.get(val);
        if (location < nums.size() - 1) {
            int lastOne = nums.get(nums.size() - 1);
            nums.set(location, lastOne);
            locs.put(lastOne, location);
        }
        locs.remove(val);
        nums.remove(nums.size() - 1);
        return true;
    }
    public int getRandom() {
        return nums.get(rand.nextInt(nums.size()));
    }
}