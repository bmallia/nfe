package com.fincatto.nfe.classes.nota;

import java.math.BigDecimal;
import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import com.fincatto.nfe.classes.NFBase;
import com.fincatto.nfe.classes.NFProdutoCompoeValorNota;
import com.fincatto.nfe.validadores.BigDecimalParser;
import com.fincatto.nfe.validadores.IntegerValidador;
import com.fincatto.nfe.validadores.StringValidador;

public class NFNotaInfoItemProduto extends NFBase {

    @Element(name = "cProd", required = true)
    private String codigo;

    @Element(name = "cEAN", required = true)
    private String codigoDeBarras;

    @Element(name = "xProd", required = true)
    private String descricao;

    @Element(name = "NCM", required = true)
    private String ncm;

    @Element(name = "EXTIPI", required = false)
    private Integer extipi;

    @Element(name = "CFOP", required = true)
    private String cfop;

    @Element(name = "uCom", required = true)
    private String unidadeComercial;

    @Element(name = "qCom", required = true)
    private String quantidadeComercial;

    @Element(name = "vUnCom", required = true)
    private String valorUnitario;

    @Element(name = "vProd", required = true)
    private String valorTotalBruto;

    @Element(name = "cEANTrib", required = true)
    private String codigoDeBarrasTributavel;

    @Element(name = "uTrib", required = true)
    private String unidadeTributavel;

    @Element(name = "qTrib", required = true)
    private String quantidadeTributavel;

    @Element(name = "vUnTrib", required = true)
    private String valorUnitarioTributavel;

    @Element(name = "vFrete", required = false)
    private String valorFrete;

    @Element(name = "vSeg", required = false)
    private String valorSeguro;

    @Element(name = "vDesc", required = false)
    private String valorDesconto;

    @Element(name = "vOutro", required = false)
    private String valorOutrasDespesasAcessorias;

    @Element(name = "indTot", required = true)
    private NFProdutoCompoeValorNota compoeValorNota;

    @ElementList(entry = "DI", inline = true, required = false)
    private List<NFNotaInfoItemProdutoDeclaracaoImportacao> declaracoesImportacao;

    @Element(name = "xPed", required = false)
    private String numeroPedidoCliente;

    @Element(name = "nItemPed", required = false)
    private Integer numeroPedidoItemCliente;

    @Element(name = "veicProd", required = false)
    private NFNotaInfoItemProdutoVeiculo veiculo;

    @ElementList(entry = "med", inline = true, required = false)
    private List<NFNotaInfoItemProdutoMedicamento> medicamentos;

    @ElementList(entry = "arma", inline = true, required = false)
    private List<NFNotaInfoItemProdutoArmamento> armamentos;

    @Element(name = "comb", required = false)
    private NFNotaInfoItemProdutoCombustivel combustivel;

    public void setCodigo(final String codigo) {
        StringValidador.tamanho60(codigo);
        this.codigo = codigo;
    }

    public void setCodigoDeBarras(final String codigoDeBarras) {
        StringValidador.codigoDeBarras(codigoDeBarras);
        this.codigoDeBarras = codigoDeBarras;
    }

    public void setDescricao(final String descricao) {
        StringValidador.tamanho120(descricao);
        this.descricao = descricao;
    }

    public void setNcm(final String ncm) {
        StringValidador.ncm(ncm);
        this.ncm = ncm;
    }

    public void setExtipi(final Integer extipi) {
        IntegerValidador.tamanho2ou3(extipi);
        this.extipi = extipi;
    }

    public void setCfop(final String cfop) {
        StringValidador.exatamente4N(cfop);
        this.cfop = cfop;
    }

    public void setUnidadeComercial(final String unidadeComercial) {
        StringValidador.tamanho6(unidadeComercial);
        this.unidadeComercial = unidadeComercial;
    }

    public void setQuantidadeComercial(final BigDecimal quantidadeComercial) {
        this.quantidadeComercial = BigDecimalParser.tamanho15comAte4CasasDecimais(quantidadeComercial);
    }

    public void setValorUnitario(final BigDecimal valorUnitario) {
        this.valorUnitario = BigDecimalParser.tamanho21ComAte10CasasDecimais(valorUnitario);
    }

    public void setValorTotalBruto(final BigDecimal valorTotalBruto) {
        this.valorTotalBruto = BigDecimalParser.tamanho15Com2CasasDecimais(valorTotalBruto);
    }

    public void setCodigoDeBarrasTributavel(final String codigoDeBarrasTributavel) {
        StringValidador.codigoDeBarras(codigoDeBarrasTributavel);
        this.codigoDeBarrasTributavel = codigoDeBarrasTributavel;
    }

    public void setUnidadeTributavel(final String unidadeTributavel) {
        StringValidador.tamanho6(unidadeTributavel);
        this.unidadeTributavel = unidadeTributavel;
    }

    public void setQuantidadeTributavel(final BigDecimal quantidadeTributavel) {
        this.quantidadeTributavel = BigDecimalParser.tamanho15comAte4CasasDecimais(quantidadeTributavel);
    }

    public void setValorUnitarioTributavel(final BigDecimal valorUnitarioTributavel) {
        this.valorUnitarioTributavel = BigDecimalParser.tamanho21ComAte10CasasDecimais(valorUnitarioTributavel);
    }

    public void setValorFrete(final BigDecimal valorFrete) {
        this.valorFrete = BigDecimalParser.tamanho15Com2CasasDecimais(valorFrete);
    }

    public void setValorSeguro(final BigDecimal valorSeguro) {
        this.valorSeguro = BigDecimalParser.tamanho15Com2CasasDecimais(valorSeguro);
    }

    public void setValorDesconto(final BigDecimal valorDesconto) {
        this.valorDesconto = BigDecimalParser.tamanho15Com2CasasDecimais(valorDesconto);
    }

    public void setValorOutrasDespesasAcessorias(final BigDecimal valorOutrasDespesasAcessorias) {
        this.valorOutrasDespesasAcessorias = BigDecimalParser.tamanho15Com2CasasDecimais(valorOutrasDespesasAcessorias);
    }

    public void setCompoeValotNota(final NFProdutoCompoeValorNota compoeValorNota) {
        this.compoeValorNota = compoeValorNota;
    }

    public void setDeclaracoesImportacao(final List<NFNotaInfoItemProdutoDeclaracaoImportacao> declaracoesImportacao) {
        this.declaracoesImportacao = declaracoesImportacao;
    }

    public void setNumeroPedidoCliente(final String numeroPedidoCliente) {
        StringValidador.tamanho15(numeroPedidoCliente);
        this.numeroPedidoCliente = numeroPedidoCliente;
    }

    public void setNumeroPedidoItemCliente(final Integer numeroPedidoItemCliente) {
        IntegerValidador.exatamente6(numeroPedidoItemCliente);
        this.numeroPedidoItemCliente = numeroPedidoItemCliente;
    }

    public void setVeiculo(final NFNotaInfoItemProdutoVeiculo veiculo) {
        this.veiculo = veiculo;
    }

    public void setMedicamentos(final List<NFNotaInfoItemProdutoMedicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }

    public void setArmamentos(final List<NFNotaInfoItemProdutoArmamento> armamentos) {
        this.armamentos = armamentos;
    }

    public void setCombustivel(final NFNotaInfoItemProdutoCombustivel combustivel) {
        this.combustivel = combustivel;
    }
}