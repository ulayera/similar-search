package cl.ulayera.redd.cqengine.model;

import com.googlecode.cqengine.attribute.Attribute;
import com.googlecode.cqengine.attribute.SimpleAttribute;
import com.googlecode.cqengine.query.option.QueryOptions;

/**
 * Created by ulayera on 30-05-2017.
 */
public class CqengineArticulo {
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

    public CqengineArticulo() {

    }

    public CqengineArticulo(String nombre, String attA, String attB, String attC, String attD, String attE, String attF, String attG, String attH, String attI, String attJ) {
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

    public static final Attribute<CqengineArticulo, String> NOMBRE = new SimpleAttribute<CqengineArticulo, String>("nombre") {
        public String getValue(CqengineArticulo cqengineArticulo, QueryOptions queryOptions) {
            return cqengineArticulo.nombre;
        }
    };
    public static final Attribute<CqengineArticulo, String> ATT_A = new SimpleAttribute<CqengineArticulo, String>("attA") {
        public String getValue(CqengineArticulo cqengineArticulo, QueryOptions queryOptions) {
            return cqengineArticulo.attA;
        }
    };
    public static final Attribute<CqengineArticulo, String> ATT_B = new SimpleAttribute<CqengineArticulo, String>("attB") {
        public String getValue(CqengineArticulo cqengineArticulo, QueryOptions queryOptions) {
            return cqengineArticulo.attB;
        }
    };
    public static final Attribute<CqengineArticulo, String> ATT_C = new SimpleAttribute<CqengineArticulo, String>("attC") {
        public String getValue(CqengineArticulo cqengineArticulo, QueryOptions queryOptions) {
            return cqengineArticulo.attC;
        }
    };
    public static final Attribute<CqengineArticulo, String> ATT_D = new SimpleAttribute<CqengineArticulo, String>("attD") {
        public String getValue(CqengineArticulo cqengineArticulo, QueryOptions queryOptions) {
            return cqengineArticulo.attD;
        }
    };
    public static final Attribute<CqengineArticulo, String> ATT_E = new SimpleAttribute<CqengineArticulo, String>("attE") {
        public String getValue(CqengineArticulo cqengineArticulo, QueryOptions queryOptions) {
            return cqengineArticulo.attE;
        }
    };
    public static final Attribute<CqengineArticulo, String> ATT_F = new SimpleAttribute<CqengineArticulo, String>("attF") {
        public String getValue(CqengineArticulo cqengineArticulo, QueryOptions queryOptions) {
            return cqengineArticulo.attF;
        }
    };
    public static final Attribute<CqengineArticulo, String> ATT_G = new SimpleAttribute<CqengineArticulo, String>("attG") {
        public String getValue(CqengineArticulo cqengineArticulo, QueryOptions queryOptions) {
            return cqengineArticulo.attG;
        }
    };
    public static final Attribute<CqengineArticulo, String> ATT_H = new SimpleAttribute<CqengineArticulo, String>("attH") {
        public String getValue(CqengineArticulo cqengineArticulo, QueryOptions queryOptions) {
            return cqengineArticulo.attH;
        }
    };
    public static final Attribute<CqengineArticulo, String> ATT_I = new SimpleAttribute<CqengineArticulo, String>("attI") {
        public String getValue(CqengineArticulo cqengineArticulo, QueryOptions queryOptions) {
            return cqengineArticulo.attI;
        }
    };
    public static final Attribute<CqengineArticulo, String> ATT_J = new SimpleAttribute<CqengineArticulo, String>("attJ") {
        public String getValue(CqengineArticulo cqengineArticulo, QueryOptions queryOptions) {
            return cqengineArticulo.attJ;
        }
    };
    public static final Attribute<CqengineArticulo, Long> SCORE = new SimpleAttribute<CqengineArticulo, Long>("puntaje") {
        public Long getValue(CqengineArticulo cqengineArticulo, QueryOptions queryOptions) {
            return cqengineArticulo.puntaje;
        }
    };

    @Override
    public String toString() {
        return "CqengineArticulo{" +
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
