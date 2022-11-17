
package br.com.jaxwscrudsoap.jaxwscrudsoap.service.jaxws;

import br.com.jaxwscrudsoap.jaxwscrudsoap.model.Noticia;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement(name = "lerResponse", namespace = "http://service.jaxwscrudsoap.jaxwscrudsoap.com.br/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lerResponse", namespace = "http://service.jaxwscrudsoap.jaxwscrudsoap.com.br/")
public class LerResponse {

    @XmlElement(name = "return", namespace = "")
    private Noticia _return;

    /**
     * 
     * @return
     *     returns Noticia
     */
    public Noticia getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(Noticia _return) {
        this._return = _return;
    }

}
