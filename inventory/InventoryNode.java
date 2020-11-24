package inventory;

class InventoryNode<T> {
    private final T dimension;
    private int stock;
    private double cost;

    InventoryNode(T d, int s, double c) {
        this.dimension = d;
        this.stock = s;
        this.cost = c;
    }

    int getStock() {
        return this.stock;
    }

    void changeStock(int stock) {
        this.stock = stock;
    }

    double getCost() {
        return this.cost;
    }

    T getDimension() {
        return dimension.toString();
    }

}