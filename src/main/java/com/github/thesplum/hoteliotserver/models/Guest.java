package com.github.thesplum.hoteliotserver.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

/**
 * Guest
 */
@Entity
@Table(name = "guests")
public class Guest {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;
  private String name;
  
  private RfidCard rfidCard;

  public Guest() {

  }

  public Guest(Integer id, String name, RfidCard rfidCard) {

  }

  public Integer getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public RfidCard getRfidCard() {
    return rfidCard;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setRfidCard(RfidCard card) {
    this.rfidCard = card;
  }
}
