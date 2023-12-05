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

import com.github.thesplum.hoteliotserver.models.Status;
import com.github.thesplum.hoteliotserver.repositories.StatusRepository;

import jakarta.validation.Valid;

/**
 * StatusController
 */
@RestController
@RequestMapping("/status")
public class StatusController {

  @Autowired
  private StatusRepository statusRepo;

  @GetMapping()
  public List<Status> getAll() {
    LinkedList<Status> res = new LinkedList<>();
    for (Status status : statusRepo.findAll()) {
      res.add(status);
    }
    return res;
  }

  @PostMapping()
  public Status create(@Valid @RequestBody Status status) {
    return statusRepo.save(status);
  }

  @DeleteMapping()
  public void deleteById(@RequestBody Status status) {
    statusRepo.deleteById(status.getId());
  }
}
