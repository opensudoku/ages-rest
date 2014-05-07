/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author mark
 */
@Stateless
public class AgesFacade extends AbstractFacade<Ages> {
    @PersistenceContext(unitName = "ages-restPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AgesFacade() {
        super(Ages.class);
    }
    
}
