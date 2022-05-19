package com.t2010a.hellot2010aagain.entity.ShoppingCart;

import java.util.ArrayList;

public interface ShoppingCartAction  {
    void add(Product product, int quantity);
    void update(Product product, int quantity);
    void remove(Product product);
    ArrayList<CartItem> getListItems();
}
