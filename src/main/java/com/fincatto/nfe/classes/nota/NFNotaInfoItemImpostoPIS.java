package com.fincatto.nfe.classes.nota;

import org.simpleframework.xml.Element;

import com.fincatto.nfe.classes.NFBase;

public class NFNotaInfoItemImpostoPIS extends NFBase {

    @Element(name = "PISAliq", required = false)
    private NFNotaInfoItemImpostoPISAliquota aliquota;

    @Element(name = "PISQtde", required = false)
    private NFNotaInfoItemImpostoPISQuantidade quantidade;

    @Element(name = "PISNT", required = false)
    private NFNotaInfoItemImpostoPISNaoTributado naoTributado;

    @Element(name = "PISOutr", required = false)
    private NFNotaInfoItemImpostoPISOutrasOperacoes outrasOperacoes;

    public NFNotaInfoItemImpostoPIS() {
        this.aliquota = null;
        this.quantidade = null;
        this.naoTributado = null;
        this.outrasOperacoes = null;
    }

    public void setAliquota(final NFNotaInfoItemImpostoPISAliquota aliquota) {
        this.aliquota = aliquota;
    }

    public void setQuantidade(final NFNotaInfoItemImpostoPISQuantidade quantidade) {
        this.quantidade = quantidade;
    }

    public void setNaoTributado(final NFNotaInfoItemImpostoPISNaoTributado naoTributado) {
        this.naoTributado = naoTributado;
    }

    public void setOutrasOperacoes(final NFNotaInfoItemImpostoPISOutrasOperacoes outrasOperacoes) {
        this.outrasOperacoes = outrasOperacoes;
    }
}