mport java.util.*;

class ThroneInheritance {
    
    private final Map<String, List<String>> familyTree;
    
    private final Set<String> deadSet;
    
    private final String king;

    public ThroneInheritance(String kingName) {
        this.king = kingName;
        this.familyTree = new HashMap<>();
        this.deadSet = new HashSet<>();
    }
    
    public void birth(String parentName, String childName) {
                this.familyTree.computeIfAbsent(parentName, k -> new ArrayList<>()).add(childName);
    }
    
    public void death(String name) {     
        this.deadSet.add(name);
    }
    
    public List<String> getInheritanceOrder() {
        List<String> currentOrder = new ArrayList<>();
        dfs(king, currentOrder);
        return currentOrder;
    }

    private void dfs(String currentPerson, List<String> currentOrder) {
        if (!deadSet.contains(currentPerson)) {
            currentOrder.add(currentPerson);
        }
        List<String> children = familyTree.get(currentPerson);
        if (children != null) {
            for (String child : children) {
                dfs(child, currentOrder);
            }
        }
    }
}
