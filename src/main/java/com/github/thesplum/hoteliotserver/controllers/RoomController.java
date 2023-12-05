package com.github.thesplum.hoteliotserver.controllers;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import jakarta.validation.Valid;

import com.github.thesplum.hoteliotserver.models.Room;
import com.github.thesplum.hoteliotserver.repositories.RoomRepository;

/**
 * RoomController
 */
@RestController
@RequestMapping("/room")
public class RoomController {

  @Autowired
  private RoomRepository roomRepo;

  @GetMapping()
  public List<Room> getAll() {
    LinkedList<Room> res = new LinkedList<>();
    for (Room room : roomRepo.findAll()) {
      res.add(room);
    }
    return res;
  }

  @PostMapping()
  public Room createRoom(@Valid @RequestBody Room room) {
    return roomRepo.save(room);
  }

  @DeleteMapping()
  public void deleteByNumber(@RequestBody Room room) {
    roomRepo.deleteById(room.getId());
  }
}
