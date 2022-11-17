
package br.com.jaxwscrudsoap.jaxwscrudsoap.service.jaxws;

import br.com.jaxwscrudsoap.jaxwscrudsoap.model.Noticia;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement(name = "adicionar", namespace = "http://service.jaxwscrudsoap.jaxwscrudsoap.com.br/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adicionar", namespace = "http://service.jaxwscrudsoap.jaxwscrudsoap.com.br/")
public class Adicionar {

    @XmlElement(name = "arg0", namespace = "")
    private Noticia arg0;

    /**
     * 
     * @return
     *     returns Noticia
     */
    public Noticia getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(Noticia arg0) {
        this.arg0 = arg0;
    }

}
