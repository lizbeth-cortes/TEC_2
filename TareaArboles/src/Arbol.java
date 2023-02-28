public class Arbol {
    public String tipo;
    public float altura;
    public int longevidad;
    public String clima;
    public String region;

    public Arbol(String tipo, float altura, int longevidad, String clima, String region) {
        this.tipo = tipo;
        this.altura = altura;
        this.longevidad = longevidad;
        this.clima = clima;
        this.region = region;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getLongevidad() {
        return longevidad;
    }

    public void setLongevidad(int longevidad) {
        this.longevidad = longevidad;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "Árbol{" +
                "tipo='" + tipo + '\'' +
                ", altura=" + altura + " metros"+
                ", longevidad=" + longevidad + " años" +
                ", clima='" + clima + '\'' +
                ", region='" + region + '\'' +
                '}';
    }
}
