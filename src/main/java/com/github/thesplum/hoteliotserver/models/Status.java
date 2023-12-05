package com.github.thesplum.hoteliotserver.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Status modela los estados posibles en los que puede estar una tarjeta RFID en
 * el sistema.
 *
 * @author Anderson Acuña (ThesplumCoder).
 * @version 1.0
 */
@Entity
@Table(name = "status")
public class Status {

  /**
   * Identificador para BD.
   */
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  /**
   * Nombre del estado o una descripción de él.
   */
  @Column(name = "description", length = 50)
  private String description;

  /**
   * Constructor vacío.
   */
  public Status() {
    //
  }

  /**
   * Inicializa un estado con su descripción.
   *
   * @param id          Identificador para la BD.
   * @param description Nombre o descripción del estado.
   */
  public Status(Integer id, String description) {
    setId(id);
    setDescription(description);
  }

  /**
   * Retorna el identificador.
   */
  public Integer getId() {
    return id;
  }

  /**
   * Retorna la descripción.
   */
  public String getDescription() {
    return description;
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
   * Cambia el nombre/descripción del estado.
   * 
   * @param description Nueva descripción del estado.
   */
  public void setDescription(String description) {
    this.description = description;
  }
}
