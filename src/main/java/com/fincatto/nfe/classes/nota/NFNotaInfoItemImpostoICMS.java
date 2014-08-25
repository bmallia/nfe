package com.fincatto.nfe.classes.nota;

import org.simpleframework.xml.Element;

import com.fincatto.nfe.classes.NFBase;

public class NFNotaInfoItemImpostoICMS extends NFBase {

    private boolean isSelecionado = false;

    @Element(name = "ICMS00", required = false)
    private NFNotaInfoItemImpostoICMS00 icms00;

    @Element(name = "ICMS10", required = false)
    private NFNotaInfoItemImpostoICMS10 icms10;

    @Element(name = "ICMS20", required = false)
    private NFNotaInfoItemImpostoICMS20 icms20;

    @Element(name = "ICMS30", required = false)
    private NFNotaInfoItemImpostoICMS30 icms30;

    @Element(name = "ICMS40", required = false)
    private NFNotaInfoItemImpostoICMS40 icms40;

    @Element(name = "ICMS51", required = false)
    private NFNotaInfoItemImpostoICMS51 icms51;

    @Element(name = "ICMS60", required = false)
    private NFNotaInfoItemImpostoICMS60 icms60;

    @Element(name = "ICMS70", required = false)
    private NFNotaInfoItemImpostoICMS70 icms70;

    @Element(name = "ICMS90", required = false)
    private NFNotaInfoItemImpostoICMS90 icms90;

    @Element(name = "ICMSPart", required = false)
    private NFNotaInfoItemImpostoICMSPartilhado icmsPartilhado;

    @Element(name = "ICMSST", required = false)
    private NFNotaInfoItemImpostoICMSST icmsst;

    @Element(name = "ICMSSN101", required = false)
    private NFNotaInfoItemImpostoICMSSN101 icmssn101;

    @Element(name = "ICMSSN102", required = false)
    private NFNotaInfoItemImpostoICMSSN102 icmssn102;

    @Element(name = "ICMSSN201", required = false)
    private NFNotaInfoItemImpostoICMSSN201 icmssn201;

    @Element(name = "ICMSSN202", required = false)
    private NFNotaInfoItemImpostoICMSSN202 icmssn202;

    @Element(name = "ICMSSN500", required = false)
    private NFNotaInfoItemImpostoICMSSN500 icmssn500;

    @Element(name = "ICMSSN900", required = false)
    private NFNotaInfoItemImpostoICMSSN900 icmssn900;

    public NFNotaInfoItemImpostoICMS() {
        this.icms00 = null;
        this.icms10 = null;
        this.icms20 = null;
        this.icms30 = null;
        this.icms40 = null;
        this.icms51 = null;
        this.icms60 = null;
        this.icms70 = null;
        this.icms90 = null;
        this.icmsPartilhado = null;
        this.icmsst = null;
        this.icmssn101 = null;
        this.icmssn102 = null;
        this.icmssn201 = null;
        this.icmssn202 = null;
        this.icmssn500 = null;
        this.icmssn900 = null;
    }

    public void setIcms00(final NFNotaInfoItemImpostoICMS00 icms00) {
        this.validaApenasUmSelecionado();
        this.icms00 = icms00;
    }

    public void setIcms10(final NFNotaInfoItemImpostoICMS10 icms10) {
        this.validaApenasUmSelecionado();
        this.icms10 = icms10;
    }

    public void setIcms20(final NFNotaInfoItemImpostoICMS20 icms20) {
        this.validaApenasUmSelecionado();
        this.icms20 = icms20;
    }

    public void setIcms30(final NFNotaInfoItemImpostoICMS30 icms30) {
        this.validaApenasUmSelecionado();
        this.icms30 = icms30;
    }

    public void setIcms40(final NFNotaInfoItemImpostoICMS40 icms40) {
        this.validaApenasUmSelecionado();
        this.icms40 = icms40;
    }

    public void setIcms51(final NFNotaInfoItemImpostoICMS51 icms51) {
        this.validaApenasUmSelecionado();
        this.icms51 = icms51;
    }

    public void setIcms60(final NFNotaInfoItemImpostoICMS60 icms60) {
        this.validaApenasUmSelecionado();
        this.icms60 = icms60;
    }

    public void setIcms70(final NFNotaInfoItemImpostoICMS70 icms70) {
        this.validaApenasUmSelecionado();
        this.icms70 = icms70;
    }

    public void setIcms90(final NFNotaInfoItemImpostoICMS90 icms90) {
        this.validaApenasUmSelecionado();
        this.icms90 = icms90;
    }

    public void setIcmsPartilhado(final NFNotaInfoItemImpostoICMSPartilhado icmsPartilhado) {
        this.validaApenasUmSelecionado();
        this.icmsPartilhado = icmsPartilhado;
    }

    public void setIcmsst(final NFNotaInfoItemImpostoICMSST icmsst) {
        this.validaApenasUmSelecionado();
        this.icmsst = icmsst;
    }

    public void setIcmssn101(final NFNotaInfoItemImpostoICMSSN101 icmssn101) {
        this.validaApenasUmSelecionado();
        this.icmssn101 = icmssn101;
    }

    public void setIcmssn102(final NFNotaInfoItemImpostoICMSSN102 icmssn102) {
        this.validaApenasUmSelecionado();
        this.icmssn102 = icmssn102;
    }

    public void setIcmssn201(final NFNotaInfoItemImpostoICMSSN201 icmssn201) {
        this.validaApenasUmSelecionado();
        this.icmssn201 = icmssn201;
    }

    public void setIcmssn202(final NFNotaInfoItemImpostoICMSSN202 icmssn202) {
        this.validaApenasUmSelecionado();
        this.icmssn202 = icmssn202;
    }

    public void setIcmssn500(final NFNotaInfoItemImpostoICMSSN500 icmssn500) {
        this.validaApenasUmSelecionado();
        this.icmssn500 = icmssn500;
    }

    public void setIcmssn900(final NFNotaInfoItemImpostoICMSSN900 icmssn900) {
        this.validaApenasUmSelecionado();
        this.icmssn900 = icmssn900;
    }

    private void validaApenasUmSelecionado() {
        if (this.isSelecionado) {
            throw new IllegalStateException("Ja possui ICMS selecionado");
        }
        this.isSelecionado = true;
    }
}