package app;

import models.Vehiculo;
import services.VehiculoService;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Insertar vehículo");
            System.out.println("2. Listar vehículos");
            System.out.println("3. Actualizar vehículo");
            System.out.println("4. Borrar vehículo");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Marca: ");
                    String marca = sc.nextLine();
                    System.out.print("Modelo: ");
                    String modelo = sc.nextLine();
                    System.out.print("Tipo (coche/moto): ");
                    String tipo = sc.nextLine();
                    System.out.print("Precio: ");
                    double precio = sc.nextDouble();
                    sc.nextLine();

                    Vehiculo nuevo = new Vehiculo(0, marca, modelo, tipo, precio);
                    if (VehiculoService.insertar(nuevo)) {
                        System.out.println("Vehículo insertado correctamente.");
                    } else {
                        System.out.println("Error al insertar vehículo.");
                    }
                    break;

                case 2:
                    List<Vehiculo> vehiculos = VehiculoService.listar();
                    if (vehiculos.isEmpty()) {
                        System.out.println("No hay vehículos.");
                    } else {
                        for (Vehiculo v : vehiculos) {
                            System.out.println(v);
                        }
                    }
                    break;

                case 3:
                    System.out.print("ID del vehículo a actualizar: ");
                    int idActualizar = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nueva marca: ");
                    String nuevaMarca = sc.nextLine();
                    System.out.print("Nuevo modelo: ");
                    String nuevoModelo = sc.nextLine();
                    System.out.print("Nuevo tipo (coche/moto): ");
                    String nuevoTipo = sc.nextLine();
                    System.out.print("Nuevo precio: ");
                    double nuevoPrecio = sc.nextDouble();
                    sc.nextLine();

                    Vehiculo actualizado = new Vehiculo(idActualizar, nuevaMarca, nuevoModelo, nuevoTipo, nuevoPrecio);
                    if (VehiculoService.actualizar(actualizado)) {
                        System.out.println("Vehículo actualizado correctamente.");
                    } else {
                        System.out.println("Error al actualizar vehículo.");
                    }
                    break;

                case 4:
                    System.out.print("ID del vehículo a borrar: ");
                    int idBorrar = sc.nextInt();
                    sc.nextLine();
                    if (VehiculoService.borrar(idBorrar)) {
                        System.out.println("Vehículo borrado correctamente.");
                    } else {
                        System.out.println("Error al borrar vehículo.");
                    }
                    break;
            }

        } while (opcion != 0);

        sc.close();
        System.out.println("Programa finalizado.");
    }
}
