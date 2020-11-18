package com.devonfw.app.java.order.orderservice.logic.api.to;

import java.util.Set;

import com.devonfw.module.basic.common.api.to.AbstractCto;

/**
 * Composite transport object of Customer
 */
public class CustomerCto extends AbstractCto {

  private static final long serialVersionUID = 1L;

  private CustomerEto customer;

  private Set<OrderEto> Orders;

  public CustomerEto getCustomer() {

    return customer;
  }

  public void setCustomer(CustomerEto customer) {

    this.customer = customer;
  }

  public Set<OrderEto> getOrders() {

    return Orders;
  }

  public void setOrders(Set<OrderEto> Orders) {

    this.Orders = Orders;
  }

}
