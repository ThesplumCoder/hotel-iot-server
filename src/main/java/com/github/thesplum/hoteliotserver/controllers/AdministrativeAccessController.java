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

import com.github.thesplum.hoteliotserver.models.AdministrativeAccess;
import com.github.thesplum.hoteliotserver.repositories.AdministrativeAccessRepository;

import jakarta.validation.Valid;

/**
 * AdministrativeAccessController
 */
@RestController
@RequestMapping("/administrative-access")
public class AdministrativeAccessController {

  @Autowired
  private AdministrativeAccessRepository admAccRepo;

  @GetMapping()
  public List<AdministrativeAccess> getAll() {
    LinkedList<AdministrativeAccess> res = new LinkedList<>();
    for (AdministrativeAccess admAcc : admAccRepo.findAll()) {
      res.add(admAcc);
    }
    return res;
  }

  @PostMapping()
  public AdministrativeAccess create(@Valid @RequestBody AdministrativeAccess administrativeAccess) {
    return admAccRepo.save(administrativeAccess);
  }

  @DeleteMapping()
  public void deleteById(@RequestBody AdministrativeAccess administrativeAccess) {
    admAccRepo.deleteById(administrativeAccess.getId());
  }
}
