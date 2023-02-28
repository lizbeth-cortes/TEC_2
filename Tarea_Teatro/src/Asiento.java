public class Asiento {
    public float precio;
    public String material;
    public boolean sillaDeRuedas;

    public int no_asiento;

    public Asiento(float precio, String material, boolean sillaDeRuedas, int no_asiento) {
        this.precio = precio;
        this.material = material;
        this.sillaDeRuedas = sillaDeRuedas;
        this.no_asiento = no_asiento;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isSillaDeRuedas() {
        return sillaDeRuedas;
    }

    public void setSillaDeRuedas(boolean sillaDeRuedas) {
        this.sillaDeRuedas = sillaDeRuedas;
    }



    public int getNo_asiento() {
        return no_asiento;
    }

    public void setNo_asiento(int no_asiento) {
        this.no_asiento = no_asiento;
    }

    @Override
    public String toString() {
        return "Teatro{" +
                "precio=$ " + precio +
                ", material='" + material + '\'' +
                ", sillaDeRuedas=" + sillaDeRuedas +
                ", no_asiento=" + no_asiento +
                '}';
    }
}
