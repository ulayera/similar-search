package cl.ulayera.redd.scratch.model;

import com.googlecode.cqengine.attribute.Attribute;
import com.googlecode.cqengine.attribute.SimpleAttribute;
import com.googlecode.cqengine.query.option.QueryOptions;

/**
 * Created by ulayera on 30-05-2017.
 */
public class Articulo {
    private String nombre;
    private String attA;
    private String attB;
    private String attC;
    private String attD;
    private String attE;
    private String attF;
    private String attG;
    private String attH;
    private String attI;
    private String attJ;
    private Long puntaje = 0L;

    public Articulo() {

    }

    public Articulo(String nombre, String attA, String attB, String attC, String attD, String attE, String attF, String attG, String attH, String attI, String attJ) {
        this.nombre = nombre;
        this.attA = attA;
        this.attB = attB;
        this.attC = attC;
        this.attD = attD;
        this.attE = attE;
        this.attF = attF;
        this.attG = attG;
        this.attH = attH;
        this.attI = attI;
        this.attJ = attJ;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAttA() {
        return attA;
    }

    public void setAttA(String attA) {
        this.attA = attA;
    }

    public String getAttB() {
        return attB;
    }

    public void setAttB(String attB) {
        this.attB = attB;
    }

    public String getAttC() {
        return attC;
    }

    public void setAttC(String attC) {
        this.attC = attC;
    }

    public String getAttD() {
        return attD;
    }

    public void setAttD(String attD) {
        this.attD = attD;
    }

    public String getAttE() {
        return attE;
    }

    public void setAttE(String attE) {
        this.attE = attE;
    }

    public String getAttF() {
        return attF;
    }

    public void setAttF(String attF) {
        this.attF = attF;
    }

    public String getAttG() {
        return attG;
    }

    public void setAttG(String attG) {
        this.attG = attG;
    }

    public String getAttH() {
        return attH;
    }

    public void setAttH(String attH) {
        this.attH = attH;
    }

    public String getAttI() {
        return attI;
    }

    public void setAttI(String attI) {
        this.attI = attI;
    }

    public String getAttJ() {
        return attJ;
    }

    public void setAttJ(String attJ) {
        this.attJ = attJ;
    }

    public Long getPuntaje() {
        return puntaje;
    }

    public void incPuntaje() {
        this.puntaje++;
    }

    @Override
    public String toString() {
        return "Articulo{" +
                "nombre='" + nombre + '\'' +
                ", attA='" + attA + '\'' +
                ", attB='" + attB + '\'' +
                ", attC='" + attC + '\'' +
                ", attD='" + attD + '\'' +
                ", attE='" + attE + '\'' +
                ", attF='" + attF + '\'' +
                ", attG='" + attG + '\'' +
                ", attH='" + attH + '\'' +
                ", attI='" + attI + '\'' +
                ", attJ='" + attJ + '\'' +
                ", puntaje=" + puntaje +
                '}';
    }
}
