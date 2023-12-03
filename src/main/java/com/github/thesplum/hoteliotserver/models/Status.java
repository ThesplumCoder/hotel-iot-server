package com.github.thesplum.hoteliotserver.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Status
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
  @Column(columnDefinition = "VARCHAR(10)")
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
   * @param description Nombre o descripción del estado.
   */
  public Status(String description) {
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
   * Cambia el nombre/descripción del estado.
   * 
   * @param description Nueva descripción del estado.
   */
  public void setDescription(String description) {
    this.description = description;
  }
}
