package com.mycompany.hotel.objetos;

public class HabitacionBAH {

    /**
     * @return the idHabitacion
     */
    public int getIdHabitacion() {
        return idHabitacion;
    }

    /**
     * @param idHabitacion the idHabitacion to set
     */
    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the numeroCamas
     */
    public int getNumeroCamas() {
        return numeroCamas;
    }

    /**
     * @param numeroCamas the numeroCamas to set
     */
    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    /**
     * @return the costePorDia
     */
    public double getCostePorDia() {
        return costePorDia;
    }

    /**
     * @param costePorDia the costePorDia to set
     */
    public void setCostePorDia(double costePorDia) {
        this.costePorDia = costePorDia;
    }
    private int idHabitacion;
    private String tipo;
    private int numeroCamas;
    private double costePorDia;

    public HabitacionBAH(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }
}
