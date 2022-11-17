
package br.com.jaxwscrudsoap.jaxwscrudsoap.service.jaxws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement(name = "adicionarResponse", namespace = "http://service.jaxwscrudsoap.jaxwscrudsoap.com.br/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adicionarResponse", namespace = "http://service.jaxwscrudsoap.jaxwscrudsoap.com.br/")
public class AdicionarResponse {

    @XmlElement(name = "return", namespace = "")
    private long _return;

    /**
     * 
     * @return
     *     returns long
     */
    public long getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(long _return) {
        this._return = _return;
    }

}
