package com.example.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

enum nacionalidad {
    Alemania,
    Argentina,
    Australia,
    Austria,
    Belgica,
    Bolivia,
    Brasil,
    Canada,
    Chile,
    China,
    Colombia,
    Corea_del_Sur,
    Costa_Rica,
    Croacia,
    Cuba,
    Dinamarca,
    Ecuador,
    Egipto,
    El_Salvador,
    Emiratos_Arabes_Unidos,
    Escocia,
    Eslovaquia,
    Eslovenia,
    Espana,
    Estados_Unidos,
    Estonia,
    Filipinas,
    Finlandia,
    Francia,
    Grecia,
    Guatemala,
    Holanda,
    Honduras,
    Hungria,
    India,
    Indonesia,
    Inglaterra,
    Irak,
    Iran,
    Irlanda,
    Irlanda_del_Norte,
    Islandia,
}

@Entity
@Data

public class Nacionalidad {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_nacionalidad;

}