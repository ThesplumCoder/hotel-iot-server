package com.github.thesplum.hoteliotserver.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

/**
 * AdministrativeAccess modela la relación entre las tarjetas RFID y los
 * empleados. Esto con el fin de proveer a muchos empleados múltiples tarjetas
 * para tareas administrativas del hotel.
 *
 * @author Anderson Acuña (ThesplumCoder).
 * @version 1.0
 */
@Entity
@Table(name = "administrative_access")
public class AdministrativeAccess {
  /**
   * Identificador para la BD.
   */
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  /**
   * Empleado asociado al acceso administrativo.
   */
  @ManyToOne
  @JoinColumn(name = "employee_id")
  private Employee employee;

  /**
   * Tarjetas de uso administrativo que tiene el empleado.
   */
  @OneToOne
  @JoinColumn(name = "rfid_card_id")
  private RfidCard rfidCard;

  public AdministrativeAccess() {
    //
  }

  /**
   * Crea un acceso administrativo con un empleado y la tarjeta que va a apoyar la
   * operación.
   *
   * @param employee Empleado al que se le va a dar la tarjeta administrativa.
   * @param rfidCard Tarjeta RFID que es de uso administrativo.
   */
  public AdministrativeAccess(Employee employee, RfidCard rfidCard) {
    setEmployee(employee);
    setRfidCard(rfidCard);
  }

  /**
   * Retorna el valor del identificador de la BD.
   */
  public Integer getId() {
    return id;
  }

  /**
   * Retorna el empleado del acceso administrativo.
   */
  public Employee getEmployee() {
    return employee;
  }

  /**
   * Retorna la tarjeta RFID que se usa para el acceso administrativo.
   */
  public RfidCard getRfidCard() {
    return rfidCard;
  }

  /**
   * Cambia el empleado del acceso.
   *
   * @param employee Nuevo empleado para el acceso.
   */
  public void setEmployee(Employee employee) {
    this.employee = employee;
  }

  /**
   * Cambia la tarjeta que apoya el acceso administrativo.
   *
   * @param rfidCard Nueva tarjeta para el acceso.
   */
  public void setRfidCard(RfidCard rfidCard) {
    this.rfidCard = rfidCard;
  }
}
