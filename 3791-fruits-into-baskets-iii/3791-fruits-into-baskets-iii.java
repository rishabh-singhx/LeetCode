class Solution {

    static class SegmentTree {
        int[] tree;
        int[] baskets;
        int n;

        SegmentTree(int[] baskets) {
            this.baskets = baskets;
            this.n = baskets.length;
            this.tree = new int[4 * n];
            build(0, 0, n - 1);
        }

        void build(int node, int l, int r) {
            if (l == r) {
                tree[node] = baskets[l];
                return;
            }
            int mid = (l + r) / 2;
            build(2 * node + 1, l, mid);
            build(2 * node + 2, mid + 1, r);
            tree[node] = Math.max(tree[2 * node + 1], tree[2 * node + 2]);
        }

        // Query for leftmost index ≥ fruit starting from l..r
        int query(int node, int l, int r, int fruit) {
            if (tree[node] < fruit) return -1; // no basket here can hold the fruit
            if (l == r) return l;

            int mid = (l + r) / 2;
            int left = query(2 * node + 1, l, mid, fruit);
            if (left != -1) return left; // found in left child
            return query(2 * node + 2, mid + 1, r, fruit); // check right
        }

        void update(int node, int l, int r, int idx) {
            if (l == r) {
                tree[node] = -1; // mark basket as used
                return;
            }
            int mid = (l + r) / 2;
            if (idx <= mid) update(2 * node + 1, l, mid, idx);
            else update(2 * node + 2, mid + 1, r, idx);

            tree[node] = Math.max(tree[2 * node + 1], tree[2 * node + 2]);
        }
    }

    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = fruits.length;
        SegmentTree segTree = new SegmentTree(baskets);
        int unplaced = 0;

        for (int i = 0; i < n; i++) {
            int fruit = fruits[i];
            int idx = segTree.query(0, 0, n - 1, fruit);
            if (idx == -1) {
                unplaced++;
            } else {
                segTree.update(0, 0, n - 1, idx); // mark basket as used
            }
        }

        return unplaced;
    }
}