class Solution {
    public Node cloneGraph(Node node) {
        Map<Node,Node> otn = new HashMap<>();

        return dfs(node,otn);      
    }

    private Node dfs(Node node, Map<Node, Node> otn) {
        if(node == null) {
            return null;
        }

        if(otn.containsKey(node)) {
            return otn.get(node);
        }

        Node copy = new Node(node.val);
        otn.put(node, copy);

        for(Node n : node.neighbors) {
            copy.neighbors.add(dfs(n, otn));
        }

        return copy;
    }
}