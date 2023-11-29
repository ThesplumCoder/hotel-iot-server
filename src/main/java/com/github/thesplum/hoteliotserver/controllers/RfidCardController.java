package com.github.thesplum.hoteliotserver.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import jakarta.validation.Valid;

import com.github.thesplum.hoteliotserver.models.RfidCard;
import com.github.thesplum.hoteliotserver.repositories.RfidCardRepository;

/**
 * RfidCardController
 */
@RestController
@RequestMapping("/rfid-card")
public class RfidCardController {

  @Autowired
  private RfidCardRepository rcr;

  @GetMapping()
  public List<RfidCard> getAll() {
    return rcr.findAll();
  }

  @PostMapping()
  public RfidCard createRfidCard(@Valid @RequestBody RfidCard rfidCard) {
    return rcr.save(rfidCard);
  }

}
