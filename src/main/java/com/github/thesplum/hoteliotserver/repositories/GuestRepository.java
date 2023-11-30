package com.github.thesplum.hoteliotserver.repositories;

import org.springframework.data.repository.CrudRepository;

import com.github.thesplum.hoteliotserver.models.Guest;

/**
 * GuestRepository
 */
public interface GuestRepository extends CrudRepository<Guest, Integer> {

}
