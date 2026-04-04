class Solution {
    TreeMap<Integer, TreeMap<Integer, ArrayList<Integer>>> map;

    public void dfs(TreeNode root, int col, int level) {
        if (root == null) return;

        // insert in map
        if (!map.containsKey(col)) {
            map.put(col, new TreeMap<>());
        }
        if (!map.get(col).containsKey(level)) {
            map.get(col).put(level, new ArrayList<>());
        }
        map.get(col).get(level).add(root.val);
        
        dfs(root.left, col - 1, level + 1);
        dfs(root.right, col + 1, level + 1);
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        map = new TreeMap<>();
        List<List<Integer>> result = new ArrayList<>();
        
        // dfs call to fill the map
        dfs(root, 0, 0);
        
        // column wise sorting and building result
        for (Map.Entry<Integer, TreeMap<Integer, ArrayList<Integer>>> entry : map.entrySet()) {
            TreeMap<Integer, ArrayList<Integer>> levelMap = entry.getValue();
            ArrayList<Integer> list = new ArrayList<>();
            
            // level wise sorting
            for (Map.Entry<Integer, ArrayList<Integer>> subEntry : levelMap.entrySet()) {
                ArrayList<Integer> sublist = subEntry.getValue();
                Collections.sort(sublist);
                list.addAll(sublist);
            }
            result.add(list);
        }
        
        return result;
    }
}