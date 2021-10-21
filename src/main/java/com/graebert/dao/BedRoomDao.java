package com.graebert.dao;

import org.springframework.data.repository.CrudRepository;

import com.graebert.entity.BedRoom;

public interface BedRoomDao extends CrudRepository<BedRoom, Integer> {

}
