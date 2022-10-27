package modelo;
import java.time.LocalDate;
import java.util.Date;
import java.time.LocalDate;

public class Usuario {
	int usuario_id;
	String usuario_nome;
	String usuario_cpf;
	String usuario_cnpj;
	Date usuario_datanascimento;
	String usuario_telefone;
	String usuario_senha;
	String usuario_email;
	int tipouser_id_tipo;
	public Usuario(int usuario_id, String usuario_nome, String usuario_cpf, String usuario_cnpj, Date usuario_datanascimento,
			String usuario_telefone, String usuario_senha, String usuario_email, int tipouser_id_tipo) {
		this.usuario_id = usuario_id;
		this.usuario_nome = usuario_nome;
		this.usuario_cpf = usuario_cpf;
		this.usuario_cnpj = usuario_cnpj;
		this.usuario_datanascimento = usuario_datanascimento;
		this.usuario_telefone = usuario_telefone;
		this.usuario_senha = usuario_senha;
		this.usuario_email = usuario_email;
		this.tipouser_id_tipo = tipouser_id_tipo;
	}
		// TODO Auto-generated constructor stub
	public int getUsuario_id() {
		return usuario_id;
	}
	public String getUsuario_cnpj() {
		return usuario_cnpj;
	}
	public void setUsuario_cnpj(String usuario_cnpj) {
		this.usuario_cnpj = usuario_cnpj;
	}
	public void setUsuario_id(int usuario_id) {
		this.usuario_id = usuario_id;
	}
	public String getUsuario_nome() {
		return usuario_nome;
	}
	public void setUsuario_nome(String usuario_nome) {
		this.usuario_nome = usuario_nome;
	}
	public String getUsuario_cpf() {
		return usuario_cpf;
	}
	public void setUsuario_cpf(String usuario_cpf) {
		this.usuario_cpf = usuario_cpf;
	}
	public Date getUsuario_datanascimento() {
		return usuario_datanascimento;
	}
	public void setUsuario_datanascimento(Date usuario_datanascimento) {
		this.usuario_datanascimento = usuario_datanascimento;
	}
	public String getUsuario_telefone() {
		return usuario_telefone;
	}
	public void setUsuario_telefone(String usuario_telefone) {
		this.usuario_telefone = usuario_telefone;
	}
	public String getUsuario_senha() {
		return usuario_senha;
	}
	public void setUsuario_senha(String usuario_senha) {
		this.usuario_senha = usuario_senha;
	}
	public String getUsuario_email() {
		return usuario_email;
	}
	public void setUsuario_email(String usuario_email) {
		this.usuario_email = usuario_email;
	}
	public int getTipouser_id_tipo() {
		return tipouser_id_tipo;
	}
	public void setTipouser_id_tipo(int tipouser_id_tipo) {
		this.tipouser_id_tipo = tipouser_id_tipo;
	}
	
}
