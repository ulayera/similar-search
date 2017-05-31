package cl.ulayera.redd.service.model;

import com.googlecode.cqengine.attribute.Attribute;
import com.googlecode.cqengine.attribute.SimpleAttribute;
import com.googlecode.cqengine.query.option.QueryOptions;

/**
 * Created by ulayera on 30-05-2017.
 */
public class Articulo {
    public String nombre;
    public String attA;
    public String attB;
    public String attC;
    public String attD;
    public String attE;
    public String attF;
    public String attG;
    public String attH;
    public String attI;
    public String attJ;
    public Long puntaje = 0L;

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

    public static final Attribute<Articulo, String> NOMBRE = new SimpleAttribute<Articulo, String>("nombre") {
        public String getValue(Articulo articulo, QueryOptions queryOptions) {
            return articulo.nombre;
        }
    };
    public static final Attribute<Articulo, String> ATT_A = new SimpleAttribute<Articulo, String>("attA") {
        public String getValue(Articulo articulo, QueryOptions queryOptions) {
            return articulo.attA;
        }
    };
    public static final Attribute<Articulo, String> ATT_B = new SimpleAttribute<Articulo, String>("attB") {
        public String getValue(Articulo articulo, QueryOptions queryOptions) {
            return articulo.attB;
        }
    };
    public static final Attribute<Articulo, String> ATT_C = new SimpleAttribute<Articulo, String>("attC") {
        public String getValue(Articulo articulo, QueryOptions queryOptions) {
            return articulo.attC;
        }
    };
    public static final Attribute<Articulo, String> ATT_D = new SimpleAttribute<Articulo, String>("attD") {
        public String getValue(Articulo articulo, QueryOptions queryOptions) {
            return articulo.attD;
        }
    };
    public static final Attribute<Articulo, String> ATT_E = new SimpleAttribute<Articulo, String>("attE") {
        public String getValue(Articulo articulo, QueryOptions queryOptions) {
            return articulo.attE;
        }
    };
    public static final Attribute<Articulo, String> ATT_F = new SimpleAttribute<Articulo, String>("attF") {
        public String getValue(Articulo articulo, QueryOptions queryOptions) {
            return articulo.attF;
        }
    };
    public static final Attribute<Articulo, String> ATT_G = new SimpleAttribute<Articulo, String>("attG") {
        public String getValue(Articulo articulo, QueryOptions queryOptions) {
            return articulo.attG;
        }
    };
    public static final Attribute<Articulo, String> ATT_H = new SimpleAttribute<Articulo, String>("attH") {
        public String getValue(Articulo articulo, QueryOptions queryOptions) {
            return articulo.attH;
        }
    };
    public static final Attribute<Articulo, String> ATT_I = new SimpleAttribute<Articulo, String>("attI") {
        public String getValue(Articulo articulo, QueryOptions queryOptions) {
            return articulo.attI;
        }
    };
    public static final Attribute<Articulo, String> ATT_J = new SimpleAttribute<Articulo, String>("attJ") {
        public String getValue(Articulo articulo, QueryOptions queryOptions) {
            return articulo.attJ;
        }
    };
    public static final Attribute<Articulo, Long> SCORE = new SimpleAttribute<Articulo, Long>("puntaje") {
        public Long getValue(Articulo articulo, QueryOptions queryOptions) {
            return articulo.puntaje;
        }
    };

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
