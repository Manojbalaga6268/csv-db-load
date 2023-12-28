package com.SpringbootCSV.CSV.DBLoad.reository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringbootCSV.CSV.DBLoad.Entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
