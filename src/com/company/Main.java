package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println("Punto 1 -------------------------");
        Persona per1 = new Persona();
        Persona per2 = new Persona("Juan", 20, 'H');
        Persona per3 = new Persona("Maria", 30, 'M', 50.0, 1.60);
        HashMap<Integer, Persona> lista_hash = new HashMap<Integer, Persona>();
        lista_hash.put(per1.hashCode(), per1);
        lista_hash.put(per2.hashCode(), per2);
        lista_hash.put(per3.hashCode(), per3);
        for (Map.Entry<Integer, Persona> entry : lista_hash.entrySet()) {
            // Adquirimos el valor de persona dentro de esa posición
            Persona persona_value = entry.getValue();
            System.out.println(persona_value.toString());
            System.out.println(persona_value.calcularIMC());
        }

        System.out.println("Punto 2 -------------------------");
        int index = 0;
        HashMap<Integer, Password> lista_pass = new HashMap<Integer, Password>();
        HashMap<Integer, Boolean> son_seguras = new HashMap<Integer, Boolean>();
        while (index < 3) {
            // Generamos de manera aleatoria nuevas passwords
            Password pass = new Password();
            lista_pass.put(pass.hashCode(), pass);
            son_seguras.put(pass.hashCode(), pass.esFuerte());
            System.out.println(pass.toString());
            index += 1;
        }
        for (Map.Entry<Integer, Boolean> entry : son_seguras.entrySet()) {
            System.out.println("La clave: " + entry.getKey() + ", es fuerte?: " + entry.getValue() );
        }

        Password p1 = new Password();
        Password p2 = new Password();
        // Creamos nuevas pass y comparamos si son iguales::
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p1.compareTo(p2));

        System.out.println("Punto 3 -------------------------");

        Serie s1 = new Serie("serie 1", 4, Genero.TERROR, "creador");
        Serie s2 = new Serie("serie 2", 1, Genero.ACCION, "creador");
        Serie s3 = new Serie("serie 3", 3, Genero.COMEDIA, "creador");
        Serie s4 = new Serie("serie 4", 6, Genero.FANTASIA, "creador");
        Serie s5 = new Serie("serie 5", 2, Genero.TERROR, "creador");
        Serie s6 = new Serie("serie 5", 3, Genero.ACCION, "creador");

        HashMap<Integer, Entretenimiento> lista_entretenimiento = new HashMap<Integer, Entretenimiento>();
        lista_entretenimiento.put(s1.hashCode(), s1);
        lista_entretenimiento.put(s2.hashCode(), s2);
        lista_entretenimiento.put(s3.hashCode(), s3);
        lista_entretenimiento.put(s4.hashCode(), s4);
        lista_entretenimiento.put(s5.hashCode(), s5);

        // Vamos a mostrar como implementar equals para que no tengamos dos series con el mismo titulo
        Boolean exists = false;
        for (Map.Entry<Integer, Entretenimiento> entry : lista_entretenimiento.entrySet()) {
            // Recorremos todas las series del hash y comparamos por medio de equals
            Serie serieObj = (Serie) entry.getValue();
            if (serieObj.equals(s6)){
                System.out.println("La serie: " + s6.getTitulo() + ", ya existe");
                exists = true;
            }
        }
        // Si no existe lo agregamos
        if (!exists) {
            lista_entretenimiento.put(s6.hashCode(), s6);
        }

        // Entregamos algunos titulos
        s2.entregar();
        s5.entregar();

        // Ahora buscamos la serie con mas temporadas y guardamos la key
        int key = 0;
        int max_temp = 0;
        for (Map.Entry<Integer, Entretenimiento> entry : lista_entretenimiento.entrySet()) {
            Serie serieObj = (Serie) entry.getValue();
            if (max_temp < serieObj.getCant_temporada()) {
                max_temp = serieObj.getCant_temporada();
                key = entry.getKey();
            }
        }
        Serie serieMaxTemp = (Serie) lista_entretenimiento.get(key);
        System.out.println("La serie con mas temporadas es: " + serieMaxTemp.toString());

        for (Map.Entry<Integer, Entretenimiento> entry : lista_entretenimiento.entrySet()) {
            Entretenimiento serieObj = (Serie) entry.getValue();
            System.out.println(serieObj.toString());
        }

    }
}
