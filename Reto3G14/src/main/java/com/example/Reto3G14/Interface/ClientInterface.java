/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.Reto3G14.Interface;

import com.example.Reto3G14.Modelo.Client;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author MG1323
 */
public interface ClientInterface extends CrudRepository <Client, Integer > {
    
}
