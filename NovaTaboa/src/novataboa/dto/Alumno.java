/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package novataboa.dto;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author manuel
 */
public class Alumno {
    
    private String nome;
    private String apelidos;
    private String curso= "2020/2021";
    private Date dataAlta;

    public String getCurso() {
        return curso;
    }

    public Date getDataAlta() {
        return dataAlta;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setDataAlta(Date dataAlta) {
        this.dataAlta = dataAlta;
    }
    
    
    

    public Alumno(String nome, String apelidos) {
        this.nome = nome;
        this.apelidos = apelidos;
    }

    public Alumno(String nome, String apelidos, Date dataAlta, String curso) {
        this.nome = nome;
        this.apelidos = apelidos;
        this.dataAlta = dataAlta;
        this.curso=curso;
    }
    
    public Alumno(String nome, String apelidos, Date dataAlta) {
        this.nome = nome;
        this.apelidos = apelidos;
        this.dataAlta = dataAlta;
    }

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelidos() {
        return apelidos;
    }

    public void setApelidos(String apelidos) {
        this.apelidos = apelidos;
    }

    public String [] toArray() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
        String dAlta=sdf.format(dataAlta);
        String [] alumno = {this.nome, this.apelidos, this.curso, dAlta};
        return alumno; 
    }

    
    
}
