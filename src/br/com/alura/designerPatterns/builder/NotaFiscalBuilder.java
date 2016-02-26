package br.com.alura.designerPatterns.builder;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.alura.designerPatterns.observer.AcoesAposGerarNota;

public class NotaFiscalBuilder {

    private String razaoSocial;
    private String cnpj;

    private List<ItemDaNota> todosItens = new ArrayList<ItemDaNota>();
    private double valorBruto;
    private double impostos;
    private String observacoes;
    private Calendar data;

    private List<AcoesAposGerarNota> listAcoes;
    
    public NotaFiscalBuilder(List<AcoesAposGerarNota> listAcoes){
    	this.listAcoes = listAcoes;
    }
    
    public NotaFiscalBuilder(){}
    
    public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
        this.razaoSocial = razaoSocial;
        return this;
    }

    public NotaFiscalBuilder comCnpj(String cnpj) {
        this.cnpj = cnpj;
        return this;
    }

    public NotaFiscalBuilder comItem(ItemDaNota item) {
        todosItens.add(item);
        valorBruto += item.getValor();
        impostos += item.getValor() * 0.05;

        return this;
    }

    public NotaFiscalBuilder comObservacoes(String observacoes) {
        this.observacoes = observacoes;

        return this;
    }

    public NotaFiscalBuilder naData(Calendar data) {
        this.data = data;

        return this;
    }

    public NotaFiscal constroi() {
    	
    	NotaFiscal notaFiscal = new NotaFiscal(razaoSocial, cnpj, data, valorBruto, impostos, todosItens, observacoes);
        
    	for (AcoesAposGerarNota acoesAposGerarNota : listAcoes) {
			acoesAposGerarNota.executa(notaFiscal);
		}
    	
    	return notaFiscal;
    }

	public void adicionaAcao(AcoesAposGerarNota acoesAposGerarNota) {
		this.listAcoes.add(acoesAposGerarNota);
	}
}
