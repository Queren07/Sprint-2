package poo.app;

import java.net.PortUnreachableException;
import java.util.Objects;

public class DocumentoID{
    private final String codigoID;
    private final TipoDocumento tipo;

    public String getCodigoID() {
        return codigoID;
    }

    public TipoDocumento getTipo() {
        return tipo;
    }

    public DocumentoID(String codigoID,TipoDocumento tipo){
        this.codigoID=codigoID;
        this.tipo =tipo;
    }
    public DocumentoID(DocumentoID doc){
        this.codigoID=doc.codigoID;
        this.tipo =doc.tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        DocumentoID that = (DocumentoID) o;
        return Objects.equals(codigoID, that.codigoID) && tipo == that.tipo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), codigoID, tipo);
    }
}

