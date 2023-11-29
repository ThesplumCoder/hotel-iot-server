package com.github.thesplum.hoteliotserver.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  /**
   * Identificador único que tiene viene con la tarjeta.
   */
  private String uid;

  public RfidCard(String uid) {
    setUid(uid);
  }

  /**
   * Retorna el identificador de BD.
   *
   * @return Número correspondiente al id.
   */
  @Column(name = "id", nullable = false)
  public Integer getId() {
    return id;
  }

  /**
   * Retorna el identificador físico.
   *
   * @return El valor de UID unido por comas en una cadena de texto.
   */
  @Column(name = "uid", nullable = false)
  public String getUid() {
    return uid;
  }

  /**
   * Fija el valor del identificador físico.
   *
   * @param Valores decimales del UID que trae la tarjeta, juntos y separados por
   *                comas.
   */
  public void setUid(String uid) {
    this.uid = uid;
  }
}
