/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hash;

import java.util.Hashtable;
import java.util.Enumeration;

public class HashtableExample {
 
 public static void main(String[] args) {
 
   Enumeration nome;
   String chave;
 
   // Criar a Hashtable
   Hashtable<String, String> hashtable = 
              new Hashtable<String, String>();
 
   // Add valor
   hashtable.put("CHAVE1","Rodrigo");
   hashtable.put("CHAVE2","Pedro");
   hashtable.put("CHAVE3","Joao");
   hashtable.put("CHAVE4","Paulo");
   hashtable.put("CHAVE5","Fabio");
 
   nome = hashtable.keys();
   while(nome.hasMoreElements()) {
      chave = (String) nome.nextElement();
      System.out.println("Chave: " +chave+ " & Valor: " +
      hashtable.get(chave));
   }
 }
}