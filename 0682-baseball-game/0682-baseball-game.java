class Solution {
    public int calPoints(String[] operations) {
        List<Integer> stack = new ArrayList<>();

        for (String op : operations) {
            if (op.equals("+")) {
                int n = stack.size();
                int sum = stack.get(n - 1) + stack.get(n - 2);
                stack.add(sum);
            } else if (op.equals("D")) {
                int n = stack.size();
                stack.add(stack.get(n - 1) * 2);
            } else if (op.equals("C")) {
                stack.remove(stack.size() - 1);
            } else {
                stack.add(Integer.parseInt(op));
            }
        }

        int total = 0;
        for (int val : stack) total += val;
        return total;
    }
}