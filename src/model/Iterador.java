/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Iterator;
/**
 *
 * @author franklin
 */


public class Iterador<T> implements Iterator<Object> {
  private T[] itens;
  private int posicao = 0;

  public Iterador(T[] itens) {
    this.itens = itens;
  }

  public void setPosicao(int posicao) {
    this.posicao = posicao;
  }

  public int getPosicao() {
    return posicao;
  }

  @Override
  public boolean hasNext() {
    return posicao >= 0 && posicao < itens.length && itens[posicao] != null;
  }

  @Override
  public Object next() {
    Object item = itens[posicao];
    posicao++;
    return item;
  }

  public Object prev() {
    Object item = itens[posicao];
    posicao--;
    return item;
  }
}
