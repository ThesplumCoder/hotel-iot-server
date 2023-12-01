package com.github.thesplum.hoteliotserver.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
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
  
  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "rfid_card_id", referencedColumnName = "id")
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
