package com.nt.repository;

import org.springframework.data.repository.CrudRepository;

import com.nt.entity.Player;

public interface IplayerRepository extends CrudRepository<Player, Integer> {

}
