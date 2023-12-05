package com.github.thesplum.hoteliotserver.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

/**
 * Guest modela los huespedes del hotel.
 *
 * @author Anderson Acuña (ThesplumCoder).
 * @version 1.0
 */
@Entity
@Table(name = "guests")
public class Guest {
  /**
   * Identificador para la BD.
   */
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  @OneToOne
  @JoinColumn(name = "rfid_card_id")
  private RfidCard rfidCard;

  /**
   * Nombre completo del huesped.
   */
  @Column(name = "name", length = 50)
  private String name;

  /**
   * Número telefónico.
   */
  @Column(name = "telephone_number", length = 50)
  private String telephoneNumber;

  public Guest() {
    //
  }

  /**
   * Inicializa un huesped con todos los atributos disponibles.
   *
   * @param id              Identificador para la BD.
   * @param rfidCard        Tarjeta RFID de la habitación que reservó.
   * @param name            Nombre completo.
   * @param telephoneNumber Número telefónico.
   */
  public Guest(Integer id, RfidCard rfidCard, String name, String telephoneNumber) {
    setId(id);
    setRfidCard(rfidCard);
    setName(name);
    setTelephoneNumber(telephoneNumber);
  }

  /**
   * Retorna el identificador para la BD.
   */
  public Integer getId() {
    return id;
  }

  /**
   * Retorna la tarjeta RFID asociada.
   */
  public RfidCard getRfidCard() {
    return rfidCard;
  }

  /**
   * Retorna el nombre del huesped.
   */
  public String getName() {
    return name;
  }

  /**
   * Retorna el número telefónico.
   */
  public String getTelephoneNumber() {
    return telephoneNumber;
  }

  /**
   * Cambia el identificador para la BD.
   *
   * @param id Nuevo identificador para la BD.
   */
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * Cambia la tarjeta RFID asociada.
   *
   * @param card Nueva tarjeta RFID.
   */
  public void setRfidCard(RfidCard card) {
    this.rfidCard = card;
  }

  /**
   * Cambia el nombre completo.
   *
   * @param Nuevo nombre para el huesped.
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Cambia el número telefónico.
   *
   * @param Nuevo número telefónico.
   */
  public void setTelephoneNumber(String telephoneNumber) {
    this.telephoneNumber = telephoneNumber;
  }
}
