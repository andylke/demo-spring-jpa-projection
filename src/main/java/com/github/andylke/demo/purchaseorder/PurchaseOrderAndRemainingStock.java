package com.github.andylke.demo.purchaseorder;

import java.math.BigDecimal;

public interface PurchaseOrderAndRemainingStock {

  String getProductCode();

  String getPurchaseBy();

  BigDecimal getPurchaseAmount();

  Integer getPurchaseCount();

  Integer getRemainingCount();
}
