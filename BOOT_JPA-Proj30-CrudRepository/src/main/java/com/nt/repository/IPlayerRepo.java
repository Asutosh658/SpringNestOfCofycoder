package com.nt.repository;

import org.springframework.data.repository.CrudRepository;

import com.nt.entity.Player;

public interface IPlayerRepo extends CrudRepository<Player, Integer> {

}
