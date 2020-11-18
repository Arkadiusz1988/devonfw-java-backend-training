package com.devonfw.app.java.order.orderservice.dataaccess.api;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.devonfw.app.java.order.general.dataaccess.api.ApplicationPersistenceEntity;
import com.devonfw.app.java.order.orderservice.common.api.Customer;

@Entity(name = "Customer")
public class CustomerEntity extends ApplicationPersistenceEntity implements Customer {

  private String firstName;

  private String lastName;

  private static final long serialVersionUID = 1L;

  private Set<OrderEntity> Orders;

  /**
   * @return orders
   */
  @OneToMany(mappedBy = "owner")
  public Set<OrderEntity> getOrders() {

    return this.Orders;
  }

  /**
   * @param orders new value of {@link #getorders}.
   */
  public void setOrders(Set<OrderEntity> orders) {

    this.Orders = orders;
  }

  /**
   * @return firstName
   */
  @Override
  public String getFirstName() {

    return this.firstName;
  }

  /**
   * @param firstName new value of {@link #getfirstName}.
   */
  @Override
  public void setFirstName(String firstName) {

    this.firstName = firstName;
  }

  /**
   * @return lastName
   */
  @Override
  public String getLastName() {

    return this.lastName;
  }

  /**
   * @param lastName new value of {@link #getlastName}.
   */
  @Override
  public void setLastName(String lastName) {

    this.lastName = lastName;
  }

  /**
   * @return serialversionuid
   */
  public static long getSerialversionuid() {

    return serialVersionUID;
  }

}
