package edu.uni.emperadorapp.service;

import edu.uni.emperadorapp.dto.ComboDto;

class Data {

    static ComboDto[] hospedajes = {
        new ComboDto("Cláasico", 80.0),
        new ComboDto("Ejecutivo", 120.0),
        new ComboDto("Premium", 160.0)
    };

    static ComboDto[] desayunos = {
        new ComboDto("Regional - Básico", 5.0),
        new ComboDto("Regional - Clásico", 8.0),
        new ComboDto("Internacional", 10.0)
    };

    static ComboDto[] almuerzos = {
        new ComboDto("Regional - Básico", 15.0),
        new ComboDto("Regional - Clásico", 25.0),
        new ComboDto("Internacional", 35.0),
        new ComboDto("De la casa", 30.0)
    };

    static ComboDto[] cenas = {
        new ComboDto("De la casa", 20.0),
        new ComboDto("Regional", 25.0),
        new ComboDto("Internacional", 30.0)
    };
}
