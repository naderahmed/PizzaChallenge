package com.example.singh.pizzachallenge.neworder;

import com.example.singh.pizzachallenge.model.NewOrder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by singh on 12-Apr-17.
 */

public class NewOrderPresenter implements NewOrderContract.Presenter {

    NewOrderContract.View view;
    List<NewOrder> newOrderList = new ArrayList<>();

    @Override
    public void addView(NewOrderContract.View view) {
        this.view = view;
    }

    @Override
    public void removeView() {

        this.view = null;
    }

    @Override
    public void validateInput(NewOrder newOrder) {


        if(newOrder.getToppings()==null || newOrder.getPhone()=="" || newOrder.getQuantity()==0 || newOrder.getUsername() == "")
            view.invalidOrder();
        else{

            saveNewOrder(newOrder);

            view.validOrder();
        }

    }

    private void saveNewOrder(NewOrder newOrder) {
        //Call database

        newOrderList.add(newOrder);
        System.out.println(newOrder.getToppings());


    }
}
