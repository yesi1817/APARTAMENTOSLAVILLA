package MODELOS;

public class Apartamento {
    private Long id;

    private String direccion;

    private  String nombreUnidad;

    private Float area;

    private Integer habitaciones;

    private  Float precioAlquiler;

    private  Integer banos;

    public Apartamento() {
    }

    public Apartamento(Long id, String direccion, String nombreUnidad, Float area, Integer habitaciones, Float precioAlquiler, Integer baños) {
        this.id = id;
        this.direccion = direccion;
        this.nombreUnidad = nombreUnidad;
        this.area = area;
        this.habitaciones = habitaciones;
        this.precioAlquiler = precioAlquiler;
        this.banos = banos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombreUnidad() {
        return nombreUnidad;
    }

    public void setNombreUnidad(String nombreUnidad) {
        this.nombreUnidad = nombreUnidad;
    }

    public Float getArea() {
        return area;
    }

    public void setArea(Float area) {
        this.area = area;
    }

    public Integer getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(Integer habitaciones) {
        this.habitaciones = habitaciones;
    }

    public Float getPrecioAlquiler() {
        return precioAlquiler;
    }

    public void setPrecioAlquiler(Float precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    public Integer getBaños() {
        return banos;
    }

    public void setBaños(Integer baños) {
        this.banos = banos;



    }

    @Override
    public String toString() {
        return "Apartamento{" +
                "id=" + id +
                ", direccion='" + direccion + '\'' +
                ", nombreUnidad='" + nombreUnidad + '\'' +
                ", area=" + area +
                ", habitaciones=" + habitaciones +
                ", precioAlquiler=" + precioAlquiler +
                ", baños=" + banos +
                '}';
    }
}
