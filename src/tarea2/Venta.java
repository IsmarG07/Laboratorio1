/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

/**
 *
 * @author AlanG
 */
public class Venta {
    private int Id;
        private String Producto;
        private int Cantidad;
        private double Precio;
        private double Importe;
        private double Total;

        public Venta() {
        }

        public int getId() {
            return Id;
        }

        public void setId(int Id) {
            this.Id = Id;
        }

        public String getProducto() {
            return Producto;
        }

        public void setProducto(String Producto) {
            this.Producto = Producto;
        }

        public int getCantidad() {
            return Cantidad;
        }

        public void setCantidad(int Cantidad) {
            this.Cantidad = Cantidad;
        }

        public double getPrecio() {
            return Precio;
        }

        public void setPrecio(double Precio) {
            this.Precio = Precio;
        }

        public double getImporte() {
            return Importe;
        }

        public void setImporte(double Importe) {
            this.Importe = Importe;
        }

        public double getTotal() {
            return Total;
        }

        public void setTotal(double Total) {
            this.Total = Total;
        }
        
        
}
