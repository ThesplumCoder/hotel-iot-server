package com.github.thesplum.hoteliotserver.models;

import jakarta.persistence.Column;
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

  /**
   * Identificador para BD.
   */
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  /**
   * Número de la habitación.
   *
   * Este campo es de tipo texto para facilitar la numeración de habitaciones que
   * se basa en la combinación de: número del piso, número del edificio, división,
   * etc.
   */
  @Column(name = "number", length = 5)
  private String number;

  /**
   * Indica si la habitación ha sido asignada a un huesped.
   *
   * Si el valor es true entonces la habitación ya fue asignada, en caso contrario
   * es false.
   * 
   * @see Guest
   */
  private boolean occupied;

  public Room() {
    //
  }

  /**
   * Inicializa una habitación con número y estado de ocupación.
   *
   * @param number   Número de la habitación.
   * @param occupied Si la habitación ya fue asignada a un cliente.
   */
  public Room(Integer id, String number, boolean occupied) {
    setId(id);
    setNumber(number);
    setOccupied(occupied);
  }

  /**
   * Retorna el identificador.
   */
  public Integer getId() {
    return id;
  }

  /**
   * Retorna el número de habitación.
   */
  public String getNumber() {
    return number;
  }

  /**
   * Retorna el estado de asignación de la habitación.
   */
  public boolean getOccupied() {
    return occupied;
  }

  /**
   * Cambia el identificador para BD de la habitación.
   *
   * @param id Nuevo identificador para BD.
   */
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * Cambia el número asignado a la habitación.
   *
   * @param number Nuevo número de habitación.
   */
  public void setNumber(String number) {
    this.number = number;
  }

  /**
   * Cambia el estado de ocupación de la habitación.
   *
   * @param occupied Actualización del estado de ocupación.
   */
  public void setOccupied(boolean occupied) {
    this.occupied = occupied;
  }
}
