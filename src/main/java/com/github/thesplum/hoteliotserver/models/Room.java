package com.github.thesplum.hoteliotserver.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Room representa una habitación de hotel.
 *
 * @author Anderson Acuña (ThesplumCoder)
 * @version 1.0
 */
@Entity
@Table(name = "rooms")
public class Room {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer number;
  private boolean occupied;
  private RfidCard rfidCard;

  public Room() {
    //
  }

  public Room(Integer number, boolean occupied, RfidCard rfidCard) {
    setNumber(number);
    setOccupied(occupied);
    setRfidCard(rfidCard);
  }

  public Integer getNumber() {
    return number;
  }

  public boolean getOccupied() {
    return occupied;
  }

  public RfidCard getRfidCard() {
    return rfidCard;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public void setOccupied(boolean occupied) {
    this.occupied = occupied;
  }

  public void setRfidCard(RfidCard rfidCard) {
    this.rfidCard = rfidCard;
  }
}
