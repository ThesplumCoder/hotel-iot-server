package com.github.thesplum.hoteliotserver.repositories;

import org.springframework.data.repository.CrudRepository;

import com.github.thesplum.hoteliotserver.models.Status;

/**
 * StatusRepository
 */
public interface StatusRepository extends CrudRepository<Status, Integer> {
  //
}
