package remessaJson;

public class Transacao {

public int numeroCartao;
public String nomeTitular;
public String nome;
public String CPF;
public String bancoRecebimento;
public String bancoPagamento;
public String data;
public String valor;
public String parcelas;
public String numeroBoleto;

public String getNumeroBoleto() {
	return numeroBoleto;
}
public void setNumeroBoleto(String numeroBoleto) {
	this.numeroBoleto = numeroBoleto;
}
public String getParcelas() {
	return parcelas;
}
public void setParcelas(String parcelas) {
	this.parcelas = parcelas;
}
public final int getNumerocartao() {
	return numeroCartao;
}
public final void setNcartao(int ncartao) {
	this.numeroCartao = ncartao;
}
public final String getNomeTitular() {
	return nomeTitular;
}
public final void setNomeTitular(String nomeTitular) {
	this.nomeTitular = nomeTitular;
}
public final String getNome() {
	return nome;
}
public final void setNome(String nome) {
	this.nome = nome;
}
public final String getCpf() {
	return CPF;
}
public final void setCpf(String cpf) {
	this.CPF = cpf;
}
public final String getBancoRec() {
	return bancoRecebimento;
}
public final void setBancoRec(String bancoRec) {
	this.bancoRecebimento = bancoRec;
}
public final String getBancoPag() {
	return bancoPagamento;
}
public final void setBancoPag(String bancoPag) {
	this.bancoPagamento = bancoPag;
}
public final String getData() {
	return data;
}
public final void setData(String data) {
	this.data = data;
}
public final String getValor() {
	return valor;
}
public final void setValor(String valor) {
	this.valor = valor;
}

}
