package org.example;
public class Jenerik<T> {
        private T icerik;
        public void setIcerik(T icerik) {
            this.icerik = icerik;
        }
        public T getIcerik() {
            return icerik;
        }


    public static void main(String[] args) {
        Jenerik<String> ogrencIsmı = new Jenerik<>();
        ogrencIsmı.setIcerik("Melis ");
        Jenerik<Integer> ogrenciYasi = new Jenerik<>();
        ogrenciYasi.setIcerik(21);
        Jenerik<String> metin = new Jenerik<>();
        metin.setIcerik(" yaşındadır");
        System.out.println(ogrencIsmı.getIcerik()+ ogrenciYasi.getIcerik() + metin.getIcerik());
    }




}







