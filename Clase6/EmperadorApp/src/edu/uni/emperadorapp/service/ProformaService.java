package edu.uni.emperadorapp.service;

import edu.uni.emperadorapp.dto.ComboDto;
import edu.uni.emperadorapp.dto.ProformaDto;

public class ProformaService {

    public ComboDto[] getHospedajes() {
        return Data.hospedajes;
    }

    public ComboDto[] getDesayunos() {
        return Data.desayunos;
    }

    public ComboDto[] getAlmuerzos() {
        return Data.almuerzos;
    }

    public ComboDto[] getCenas() {
        return Data.cenas;
    }

    public void procesar(ProformaDto dto) {
        dto.setImporteHospedaje(dto.getPersonas() * dto.getHospedaje().getPrecio() * dto.getDias());
        dto.setImporteDesayuno(dto.getPersonas() * dto.getDesayuno().getPrecio() * dto.getDias());
        dto.setImporteAlmuerzo(dto.getPersonas() * dto.getAlmuerzo().getPrecio() * dto.getDias());
        dto.setImporteCena(dto.getPersonas() * dto.getCena().getPrecio() * dto.getDias());
        dto.setTotal(dto.getImporteHospedaje() + dto.getImporteDesayuno()
                + dto.getImporteAlmuerzo() + dto.getImporteCena());
    }

}
