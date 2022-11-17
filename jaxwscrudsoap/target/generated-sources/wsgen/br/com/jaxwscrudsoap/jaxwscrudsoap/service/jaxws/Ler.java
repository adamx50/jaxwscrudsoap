
package br.com.jaxwscrudsoap.jaxwscrudsoap.service.jaxws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement(name = "ler", namespace = "http://service.jaxwscrudsoap.jaxwscrudsoap.com.br/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ler", namespace = "http://service.jaxwscrudsoap.jaxwscrudsoap.com.br/")
public class Ler {

    @XmlElement(name = "arg0", namespace = "")
    private long arg0;

    /**
     * 
     * @return
     *     returns long
     */
    public long getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(long arg0) {
        this.arg0 = arg0;
    }

}
