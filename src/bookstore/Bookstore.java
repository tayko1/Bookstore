/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore;

import bookstore.livraison.livraison;
import bookstore.connexion.connexion;
import bookstore.interfacee.interface_livraison;
import bookstore.services.service;
import bookstore.exception.exception_livraison;

/**
 *
 * @author Pc
 */
public class Bookstore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        livraison v;
        v = new livraison(3,"010","000",2,3);
        connexion cnx= connexion.getIstance();
        service sl = new service();
       
        sl.ajouter_livraison(v);
        //sl.afficher_livraison(v);
       // sl.modifier_Livraison(v);
        //sl.supprimer_livraison(v);
        
        
    }
}

   
    

