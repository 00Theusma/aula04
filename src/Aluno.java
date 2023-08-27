import javax.xml.crypto.Data;

public class Aluno {
    private String matricula;
    private Data dataMatricula;
    
    public Aluno(String matricula, Data dataMatricula) {
        this.matricula = matricula;
        this.dataMatricula = dataMatricula;
    }

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Data getDataMatricula() {
        return dataMatricula;
    }
    public void setDataMatricula(Data dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    

}
