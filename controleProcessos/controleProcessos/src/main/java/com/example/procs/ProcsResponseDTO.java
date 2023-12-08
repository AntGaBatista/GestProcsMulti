package com.example.procs;

import jakarta.persistence.Id;

public record ProcsResponseDTO(Long idReg, Long idProc, Long relName, Long status) {
public ProcsResponseDTO (Procs procs){
    this(procs.getIdReg(), procs.getIdProc(), procs.getRelName(), procs.getStatus());
}
}
