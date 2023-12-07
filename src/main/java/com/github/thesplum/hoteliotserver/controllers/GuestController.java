package com.github.thesplum.hoteliotserver.controllers;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import jakarta.validation.Valid;

import com.github.thesplum.hoteliotserver.models.Guest;
import com.github.thesplum.hoteliotserver.repositories.GuestRepository;

/**
 * RoomController
 */
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/guest")
public class GuestController {

  @Autowired
  private GuestRepository guestRepo;

  @GetMapping()
  public List<Guest> getAll() {
    LinkedList<Guest> res = new LinkedList<>();
    for (Guest guest : guestRepo.findAll()) {
      res.add(guest);
    }
    return res;
  }

  @PostMapping()
  public Guest createGuest(@Valid @RequestBody Guest guest) {
    return guestRepo.save(guest);
  }

  @DeleteMapping()
  public void deleteById(@RequestBody Guest guest) {
    guestRepo.deleteById(guest.getId());
  }
}
