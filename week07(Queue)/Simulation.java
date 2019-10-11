public class Simulation {

	static int numServers;
	static int numClients;
	static int meanServiceTime;
	static int meanInterarrivalTime;
	static SimServer[] servers;
	static Client[] clients;
	static Queue queue = new SLinkedQueue();
	static java.util.Random randomArrival;
	static java.util.Random randomService;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		init(args);

		// 리스팅 6.3 참고
		run(); // 구현 해야 할 것.
	}

	static void init(String[] args) {
		if (args.length < 4) {
			System.out.println("Usage : java Simulation <numServers> "
					+ "<numClients> <meanServiceTime> <meanInterarrivalTime> ");
			System.out.println(" e.g.: java Simulation 3 100 12 4");
			System.exit(0);
		}

		numServers = Integer.parseInt(args[0]);
		numClients = Integer.parseInt(args[1]);
		meanServiceTime = Integer.parseInt(args[2]);
		meanInterarrivalTime = Integer.parseInt(args[3]);

		servers = new SimServer[numServers];
		clients = new Client[numClients];
		randomService = new ExponentialRandom(meanServiceTime);
		randomArrival = new ExponentialRandom(meanInterarrivalTime);
		queue = (Queue) new SLinkedQueue();

		for (int j = 0; j < numServers; j++) {
			servers[j] = new SimServer(j, randomService.nextInt());
		}

		System.out.println("	Number of servers = " + numServers);
		System.out.println("	Number of clients = " + numClients);
		System.out.println("	Mean service time = " + meanServiceTime);
		System.out.println("	Mean interarrival time = " + meanInterarrivalTime);

		for (int j = 0; j < numServers; j++) {
			System.out.println("Mean service time for " + servers[j] + "="
					+ servers[j].getMeanServiceTime());
		}
	}

	static void run() {
		int i = 0;
		int nextArrivalTime = 0;
		int sum = 0;
		int avg = 0;
		int e = 0;

		for (int t = 0; e != numClients; t++) {
			if (t == nextArrivalTime) {
				Client client = clients[i++] = new SimClient(i, t);
				queue.add(client);
				sum = sum - t;
				if (i < numClients)
					nextArrivalTime = t + randomArrival.nextInt();
			}
			for (int j = 0; j < numServers; j++) {
				Server server = servers[j];
				if (t == server.getStopTime()) {
					server.stopServing(t);
					sum = sum + server.getStopTime();
					++e;
				}
				if (server.isIdle() && !queue.empty()) {
					Client client = (SimClient) queue.remove();
					server.startServing(client, t);
				}
			}

		}
		avg = sum / numClients;
		System.out.println(sum);
		System.out.println(avg);
	}
}
