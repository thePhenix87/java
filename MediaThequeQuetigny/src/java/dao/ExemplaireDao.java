/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.ejb.Stateless;
import model.Exemplaire;

/**
 *
 * @author alex-dev
 */

@Stateless
public class ExemplaireDao extends DAO_IMPL<Exemplaire>{
    
     public ExemplaireDao()
    {
        super(Exemplaire.class);
    }
    
}
