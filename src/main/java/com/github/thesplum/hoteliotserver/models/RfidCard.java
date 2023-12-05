package com.github.thesplum.hoteliotserver.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

/**
 * RfidCard representa la tarjeta RFID que participa en el sistema IoT.
 *
 * @author Anderson Acuña (ThesplumCoder)
 * @version 1.0
 */
@Entity
@Table(name = "rfid_cards")
public class RfidCard {
  /**
   * Identificador para la BD.
   */
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  /**
   * La habitación a la que fue asociada la tarjeta.
   */
  @ManyToOne
  @JoinColumn(name = "room_id")
  private Room room;

  /**
   * Estado de la tarjeta en el sistema.
   */
  @OneToOne
  @JoinColumn(name = "status_id")
  private Status status;

  /**
   * Identificador único que viene con la tarjeta.
   */
  @Column(name = "uid", length = 50)
  private String uid;

  public RfidCard() {
    //
  }

  /**
   * Inicializa una tarjeta RFID con todos los parámetros especificados.
   *
   * @param id     Identificador para la BD.
   * @param room   Habitación asociada.
   * @param status Estado de la tarjeta.
   * @param uid    Identificador físico de la tarjeta.
   */
  public RfidCard(Integer id, Room room, Status status, String uid) {
    setId(id);
    setRoom(room);
    setStatus(status);
    setUid(uid);
  }

  /**
   * Retorna el identificador de BD.
   *
   * @return Número correspondiente al id.
   */
  public Integer getId() {
    return id;
  }

  /**
   * Retorna la habitación a la que está asociada.
   *
   * @return Habitación asociada.
   */
  public Room getRoom() {
    return room;
  }

  /**
   * Retorna el estado de la tarjeta.
   *
   * @return Estado actual de la tarjeta.
   */
  public Status getStatus() {
    return status;
  }

  /**
   * Retorna el identificador físico.
   *
   * @return El valor de UID unido por comas en una cadena de texto.
   */
  public String getUid() {
    return uid;
  }

  /**
   * Fija el valor del identificador de la tarjeta.
   *
   * @param id Número que identifica cada tarjeta RFID disponible en el sistema.
   */
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * Cambia la habitación asociada a la tarjeta.
   *
   * @param room Nueva habitación a asociar.
   */
  public void setRoom(Room room) {
    this.room = room;
  }

  /**
   * Cambia el estado de la tarjeta.
   *
   * @param status Nuevo estado de la tarjeta.
   */
  public void setStatus(Status status) {
    this.status = status;
  }

  /**
   * Fija el valor del identificador físico.
   *
   * @param uid Valores decimales del UID que trae la tarjeta, juntos y separados
   *            por comas.
   */
  public void setUid(String uid) {
    this.uid = uid;
  }
}
