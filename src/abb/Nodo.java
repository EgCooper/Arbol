package abb;

public class Nodo {
 private Nodo izquierdo;
 private int Dato;
 private Nodo derecho;

 public Nodo(Nodo izquierdo, int dato, Nodo derecho) {
  this.setIzquierdo(izquierdo);
  setDato(dato);
  this.setDerecho(derecho);
 }

 public Nodo getIzquierdo() {
  return izquierdo;
 }

 public void setIzquierdo(Nodo izquierdo) {
  this.izquierdo = izquierdo;
 }

 public int getDato() {
  return Dato;
 }

 public void setDato(int dato) {
  Dato = dato;
 }

 public Nodo getDerecho() {
  return derecho;
 }

 public void setDerecho(Nodo derecho) {
  this.derecho = derecho;
 }
}
