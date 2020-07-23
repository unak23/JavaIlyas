package JavaTest;

public class Q89Planet {
	
	public String name;
	public int moons;
	
	public Q89Planet (String name, int moons) {
		this.name=name;
		this.moons=moons;
	}

	public static void main(String[] args) {
		Q89Planet[] planets = { 
				new Q89Planet("Mercury", 0),
				new Q89Planet("Venus", 0),
				new Q89Planet("Earth", 1),
				new Q89Planet("Mars", 2)
		};
		System.out.println(planets);
		System.out.println(planets[2]);
		System.out.println(planets[2].moons);
		
		
	}
}
