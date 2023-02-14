import java.time.LocalDate;
import java.util.List;

public class Bootcamp extends Aprendizado{
	
	private LocalDate dataInicial;
	private  LocalDate dataFinal;
	private List<Dev> devs;
	private List<Mentoria>mentorias;
	private List<Atividade>atividades;

	
	public void IncreverDev(Dev dev) {
		this.devs.add(dev);
	}
	
	////Getter e Setters
	
	public LocalDate getDataInicial() {
		return dataInicial;
	}
	public void setDataInicial(LocalDate dataInicial) {
		this.dataInicial = dataInicial;
	}
	public LocalDate getDataFinal() {
		return dataFinal;
	}
	public void setDataFinal(LocalDate dataFinal) {
		this.dataFinal = dataFinal;
	}
	public List<Dev> getDevs() {
		return devs;
	}
	public void setDevs(List<Dev> devs) {
		this.devs = devs;
	}
	public List<Mentoria> getMentorias() {
		return mentorias;
	}
	public void setMentorias(List<Mentoria> mentorias) {
		this.mentorias = mentorias;
	}
	public List<Atividade> getAtividades() {
		return atividades;
	}
	public void setAtividades(List<Atividade> atividades) {
		this.atividades = atividades;
	}
	
}
