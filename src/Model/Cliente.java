package Model;

public class Cliente {

    private int ID_Client;
    private String Nome;
    private String CPF;
    private String Telefone;
    private String Email;
    private int Pontos_Fidelidade;
    private String Senha;

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getID_Client() {
        return ID_Client;
    }

    public void setID_Client(int ID_Client) {
        this.ID_Client = ID_Client;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getPontos_Fidelidade() {
        return Pontos_Fidelidade;
    }

    public void setPontos_Fidelidade(int pontos_Fidelidade) {
        Pontos_Fidelidade = pontos_Fidelidade;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String senha) {
        Senha = senha;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }
}
