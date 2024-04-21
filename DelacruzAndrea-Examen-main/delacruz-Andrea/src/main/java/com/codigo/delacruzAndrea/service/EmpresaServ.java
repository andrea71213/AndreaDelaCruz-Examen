package com.codigo.delacruzAndrea.service;

import com.codigo.delacruzAndrea.entity.Empresa;

import java.util.List;

public interface EmpresaServ<Long> {

    Empresa registrarEmpresa(Empresa empresa);
    List<Empresa> getAll();
    Empresa buscarxId(java.lang.Long id);

    Empresa updateEmpresa(java.lang.Long id, Empresa request);

    Empresa deleteEmpresa(java.lang.Long id);
}
