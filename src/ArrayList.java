public class ArrayList<T> extends Multiset<T> {

    private ArrayList<T> list;
    public ArrayList()
    {
        super();
        this.list = new ArrayList<T>();
    }

    public boolean add(T t) {
        list.add(t);
        return true;
    }

    public boolean contains(T t) {
        return list.contains(t);
    }

    public boolean is_empty() {
        return list.is_empty();
    }

    public int count(T t) {
        return countHelper(list, t);
    }

    public int size() {
        return list.size();
    }

    public void remove(T t) {
        if (list.contains(t))
        {
            list.remove(t);
        }
    }

    public int countHelper(ArrayList<T> list, T item_found)
    {
        int count = 0;
        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i) == item_found)
            {
                count++;
            }
        }
        return count;
    }
}
