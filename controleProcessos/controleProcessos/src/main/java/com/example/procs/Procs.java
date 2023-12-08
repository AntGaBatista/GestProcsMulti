package com.example.procs;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name="tbprocessos")
@Entity(name = "tbprocessos")
@Getter
@NoArgsConstructor
@EqualsAndHashCode(of = "idReg")

public class Procs {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReg;
    @Id
    private Long idProc;
    private Long relName;
    private Long status;

public Procs(ProcsRequestDTO data){
    this.idProc = Long.valueOf(data.idProc());
    this.idReg = Long.valueOf(data.idReg());
    this.relName = Long.valueOf(data.relName());
    this.status = Long.valueOf(data.status());
}
}
