package com.usac.brayan.mensajeriaarquitectura;

public class ChatMessage {
    public int left;
    private String message;
    private String curso;
    private String seccion;

    public ChatMessage(int left, String seccion,String curso, String message,String catedratico) {
        super();
        this.left = left;
        this.message = message;
        this.curso=curso;
        this.seccion=seccion;
    }

    public int isLeft() {
        return left;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }
}