package com.example.aims.entity;

import java.util.List;

public class Cart {
    private List<CartMedia> listCartMedia;

    public Cart() {

    }

    public List<CartMedia> getListCartMedia() {
        return listCartMedia;
    }

    public void setListCartMedia(List<CartMedia> listCartMedia) {
        this.listCartMedia = listCartMedia;
    }

    public Cart(List<CartMedia> listCartMedia) {
        this.listCartMedia = listCartMedia;
    }


}
