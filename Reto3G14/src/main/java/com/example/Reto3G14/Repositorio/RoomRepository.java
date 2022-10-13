/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Reto3G14.Repositorio;

import com.example.Reto3G14.Interface.RoomInterface;
import com.example.Reto3G14.Modelo.Room;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

  @Repository

public class RoomRepository {
     @Autowired
    private RoomInterface extensionesCrud;
    
    public List<Room> getAll(){
        return (List<Room>) extensionesCrud.findAll();
    }
    
    public Optional<Room> getRoom(int id){
        return extensionesCrud.findById(id);
    }
    
    public Room save (Room room){
        return extensionesCrud.save(room);
    } 
    
    public void delete (Room room){
        extensionesCrud.delete(room);
    }


}


