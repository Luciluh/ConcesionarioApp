package models;

public class Vehiculo {
    private int id;
    private String marca;
    private String modelo;
    private String tipo;
    private double precio;

    public Vehiculo(int id, String marca, String modelo, String tipo, double precio) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return String.format("ID: %d | Marca: %s | Modelo: %s | Tipo: %s | Precio: %.2f",
                            id, marca, modelo, tipo, precio);
    }
}
