/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo.interfaces;

import java.util.Date;

/**
 *
 * @author Alvarez
 */
public interface IVisualizable {

    public Date startToSee(Date dateI);

    public void stopToSee(Date dateI, Date dateF);

}
