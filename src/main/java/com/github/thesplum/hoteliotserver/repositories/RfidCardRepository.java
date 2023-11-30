package com.github.thesplum.hoteliotserver.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.github.thesplum.hoteliotserver.models.RfidCard;

/**
 * RfidCardRepository nos permite acceder a los datos de la tabla de las
 * tarjetas RFID.
 *
 * @author Anderson Acuña (ThesplumCoder).
 * @version 1.0
 */
@Repository
public interface RfidCardRepository extends CrudRepository<RfidCard, Integer> {

}
