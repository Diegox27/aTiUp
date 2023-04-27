/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Servlets;

import Model.AccesoDatos.CategoriaDAO;
import Model.Categoria;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class prueba {
    
     public static void main(String[] args) {
       /* ArrayList<Curso> listaCursosP = new ArrayList();
        Curso a = new Curso("Diseño", "asd");
        Curso b = new Curso("Plani", "pqr");
        Curso c = new Curso("Intro", "Iop");
        listaCursosP.add(a);
        listaCursosP.add(b);
        listaCursosP.add(c);
        Categoria pCat = new Categoria("Diseño de software", 0, "Prueba", listaCursosP);
        
        pCat.registrarItemNuevo("¿1g", "aaa", Fuente.ChatGPT, "a", Fuente.Admin, 1);
        pCat.registrarItemNuevo("¿2g", "aa", Fuente.ChatGPT, "a", Fuente.ChatGPT, 1);
        pCat.registrarItemNuevo("¿3g", "aaaaa", Fuente.ChatGPT, "a", Fuente.Admin, 1);
        pCat.registrarItemNuevo("¿4g", "aaaa", Fuente.ChatGPT, "a", Fuente.ChatGPT, 1);
        pCat.registrarItemNuevo("¿5g", "a", Fuente.ChatGPT, "a", Fuente.Admin, 1);
        pCat.registrarItemNuevo("¿6g", "a", Fuente.ChatGPT, "a", Fuente.ChatGPT, 1);
        pCat.registrarItemNuevo("¿55", "a", Fuente.Admin, "a", Fuente.ChatGPT, 1);
        pCat.registrarItemNuevo("¿66", "a", Fuente.Admin, "a", Fuente.ChatGPT, 1);
        pCat.registrarItemNuevo("¿77", "a", Fuente.Admin, "a", Fuente.ChatGPT, 1);
        
        Random random = new Random();
        for(Item i:pCat.getListaItems()){
            int val = random.nextInt(6);
            int val2 = random.nextInt(6);
            int val3 = random.nextInt(6);
            int val4 = random.nextInt(6);
            i.anadirValoracionEj(val, "a");
            i.anadirValoracionEj(val2, "b");
            i.anadirValoracionResp(val3, "b");
            i.anadirValoracionResp(val4, "b");
        }
        
        for(Item q: pCat.getListaItems()){
            q.ordenarNumeros(q.getListaValoracionesRespuesta());
        }
        
        //for(Item k: pCat.getListaItems()){
          //  System.out.println("\nEjemplo");
            //System.out.println(k.toStringLista(k.getListaValoracionesEjemplos()));
            //System.out.println("\n Respuesta");
            //System.out.println(k.toStringLista(k.getListaValoracionesRespuesta()));
        //}
        
        //pCat.ordenarAlfabeticamente();
        System.out.println("Top N respuestas Admin");
        System.out.println(pCat.topXBothBoth(4));*/
       
      /*  System.out.println("111111");
        CategoriaDAO miObjeto = new CategoriaDAO();
        System.out.println("22222");
        // llamar al método listarCategorias() y guardar el valor de retorno en una variable
        ArrayList<Categoria> listaCategorias = miObjeto.listarCategorias();
        System.out.println("33333");
       // System.out.println("XXXX"+miObjeto.listarCategorias());
        // imprimir la lista de categorías en la consola
        System.out.println("Lista de categorías:");
        for (Categoria categoria : listaCategorias) {
            System.out.println(categoria.toString1());
        }*/
     // Crear una instancia de CategoriaDAO
       /* CategoriaDAO categoriaDAO = CategoriaDAO.getInstance();

        // Llamar al método listarCategorias
        ArrayList<Categoria> categorias = categoriaDAO.listarCategorias();

        // Imprimir los resultados en la consola
        for (Categoria categoria : categorias) {
            System.out.println("Código: " + categoria.getCodigo());
            System.out.println("Nombre: " + categoria.getNombre());
            System.out.println("Descripción: " + categoria.getDescripcion());
        }*/
       
         

        

        

        Categoria nuevaCategoria = new Categoria(155, "Jefferson", "de sexologia");
        CategoriaDAO test= new CategoriaDAO();
        // Llamada al método insertarCategoria
        if (test.insertarCategoria(nuevaCategoria)) {
            System.out.println("La categoría se ha insertado correctamente.");
        } else {
            System.out.println("Ha ocurrido un error al insertar la categoría.");
        }

       
    }
    
}
