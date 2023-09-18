public class TreeMultiset<T> extends Multiset<T> {

    private Tree tree;
    public TreeMultiset(){
        super();
        this.tree = new Tree();
    }

    public boolean add(T t) {
        tree.insert(t);
        return true;
    }

    public boolean contains(T t) {
        return tree.contains(t);
    }

    public boolean is_empty() {
        return tree.is_empty();
    }

    public int count(T t) {
        return tree.count(t);
    }

    public int size() {
        return tree.size();
    }

    public void remove(T t) {
        tree.delete_item(t);
    }

}
