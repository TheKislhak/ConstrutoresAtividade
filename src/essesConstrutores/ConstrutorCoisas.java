package essesConstrutores;

public class ConstrutorCoisas {

	public static void main(String[] args) {
		Carro carro = new Carro("12356", 2347);
		Animal animal = new Animal(3.50f, "Laranja");
		Consulta consulta = new Consulta("12/03", "Clover", "Kanako");
		
		System.out.println("———————————————");
		System.out.println(carro.getPlaca());
		System.out.println(carro.getNumChassi());
		System.out.println("———————————————");
		System.out.println(animal.getTamanho());
		System.out.println(animal.getCor());
		System.out.println("———————————————");
		System.out.println(consulta.getData());
		System.out.println(consulta.getNomePcnte());
		System.out.println(consulta.getNomeDents());
		System.out.println("———————————————");
		
	}

}
