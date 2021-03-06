/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author petersims
 */
public class ProductWarehouse extends Warehouse {

    private String product;

    public ProductWarehouse(String product, double capacity) {
        super(capacity);
        this.product = product;
    }

    public String getName() {
        return this.product;
    }

    public void setName(String newName) {
        this.product = newName;
    }

    @Override
    public String toString() {
        return this.product + ": " + super.toString();
    }
}
