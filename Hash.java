public class Hash {
    private List[] table;
    private int hash;
    
    public Hash(){
        table = new List[7];
        hash = 7;
        for (int i=0; i < 7; i++){
            table[i] = new List();
        }
    }

    public Hash insert(Node node){
        table[node.getKey()%hash].insert(node);
        return this;
    }

    public Node lookUp(int key){
        return table[key%hash].searchReturn(key);
    }

    public Node delete(int key){
        return table[key%hash].searchRemove(key);
    }

    public boolean isEmpty(){
        for (int i=0; i < 7; i++){
            if (!table[i].isEmptyList()) return false;
        }
        return true;
    }
}