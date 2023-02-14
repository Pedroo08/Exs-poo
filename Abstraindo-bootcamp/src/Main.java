import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Java");
		curso1.setDescricao("Curso de java");
		curso1.setCargaHoraria(8);
		//System.out.println(curso1.toString());
		
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Mentoria Java");
		mentoria1.setDescricao("Poo-Java");
		mentoria1.setData(LocalDate.now());
		//System.out.println(mentoria1.toString());
		

		Bootcamp bootcamp1 =new Bootcamp();
		bootcamp1.setNome("Java Developer");
		bootcamp1.setDescricao("Vire Dev Java");
		bootcamp1.getConteudos().add(mentoria1);
		bootcamp1.getConteudos().add(curso1);
		
		Dev joao = new Dev();
		joao.setNome("Jo�o");
		joao.inscreverBootCamp(bootcamp1);
		System.out.println(" jo�o-Conteudos Incritos: " + joao.getConteudosInscritos());
		joao.progredir();
		System.out.println("----------------------");
		System.out.println(" jo�o-Conteudos Incritos: " + joao.getConteudosInscritos());
		System.out.println(" jo�o-Conteudos Concluidos: " + joao.getConteudosConcluidos());
		System.out.println(" jo�o-XP: " + joao.CalcularTotalXp());
		System.out.println("\n ------------------------------------------------------------------------------------------\n");
		
		Dev camila = new Dev();
		camila.inscreverBootCamp(bootcamp1);
		System.out.println("Camila-Conteudos Incritos: " + camila.getConteudosInscritos());
		camila.progredir();
		System.out.println("----------------------");
		System.out.println("Camila-Conteudos Incritos: " + camila.getConteudosInscritos());
		System.out.println("Camila-Conteudos Concluidos: " + camila.getConteudosConcluidos());
		System.out.println(" Camila-XP: " + camila.CalcularTotalXp());
	}
	
	
	
	
	

}

