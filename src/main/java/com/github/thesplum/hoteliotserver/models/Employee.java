package com.github.thesplum.hoteliotserver.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Employee modela a los empleados del hotel.
 *
 * @author Anderson Acuña (ThesplumCoder)
 * @version 1.0
 */
@Entity
@Table(name = "employees")
public class Employee {
  /**
   * Identificador para la BD.
   */
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  /**
   * Nombre completo.
   */
  @Column(name = "name", length = 50)
  private String name;

  public Employee() {
    //
  }

  /**
   * Inicializa un empleado con todas sus propiedades pasadas.
   *
   * @param id   Identificador para la BD.
   * @param name Nombre completo.
   */
  public Employee(Integer id, String name) {
    setId(id);
    setName(name);
  }

  /**
   * Retorna el identificador de BD.
   */
  public Integer getId() {
    return id;
  }

  /**
   * Retorna el nombre.
   */
  public String getName() {
    return name;
  }

  /**
   * Cambia el identificador para la BD.
   *
   * @param id Nuevo identificador.
   */
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * Cambia el nombre.
   *
   * @param name Nuevo nombre del empleado.
   */
  public void setName(String name) {
    this.name = name;
  }
}
