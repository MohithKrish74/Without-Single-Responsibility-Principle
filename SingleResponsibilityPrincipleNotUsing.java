package com.keyword;

class SalesOrder // A class containing multiple functions.This violates Single Responsibility Principle.
{
    public void salesOrder()
    {
        System.out.println("Sales Order.");
    }
    public void saveOrder()
    {
        System.out.println("Save Order.");
    }
    public void export()
    {
        System.out.println("Export the Order.");
    }
}

public class SingleResponsibilityPrincipleNotUsing
{
    public static void main(String[] args)
    {
        SalesOrder salesOrder = new SalesOrder();
        salesOrder.salesOrder();
        salesOrder.saveOrder();
        salesOrder.export();
    }
}
