import java.time.LocalDate;

public class Mentoria extends Conteudo{
	
	private LocalDate data;

	
	@Override
	public double calcularXp() {
		// TODO Auto-generated method stub
		return XP_PADRAO + 10;
	}

	////////////////////////////////////
	public LocalDate getData() {
		return data;
	}



	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Mentoria [data=" + data + ", getTitulo()=" + getTitulo() + ", getDescricao()=" + getDescricao() + "]";
	}


	
	

	


	
	

	
	
}
