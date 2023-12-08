package com.example.controll;

import com.example.procs.ProcessRepository2;
import com.example.procs.Procs;
import com.example.procs.ProcsRequestDTO;
import com.example.procs.ProcsResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("proc")
public class processControll {
    @Autowired
    private ProcessRepository2 repository;

    @PostMapping
    public void saveProcess(@RequestBody ProcsRequestDTO data){
Procs procsData = new Procs(data);
        repository.save(procsData);
    }
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<ProcsResponseDTO> getAll(){
        List<ProcsResponseDTO> procsList = repository.findAll().stream().map(ProcsResponseDTO::new).toList();
        return procsList;
    }
}
