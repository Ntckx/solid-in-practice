package org.example.solid.isp;

import org.example.solid.isp.rolebased.CustomerActions;
import org.example.solid.isp.rolebased.VoucherRedeemer;

// As Customer implements only interface they require, they do not have to define method they do not need
// Keep the interface lean
public class Customer implements CustomerActions, VoucherRedeemer {
    @Override
    public void browseItem() {
        System.out.println("Browse Item");
    }

    @Override
    public void checkout() {
        System.out.println("Checkout");
    }

    @Override
    public void applyVoucher() {
        System.out.println("Apply Voucher");
    }
}



