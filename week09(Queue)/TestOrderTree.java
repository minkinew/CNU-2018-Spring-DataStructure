import java.util.*;

public class TestOrderTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrderedTree treeA, treeB, treeD, treeE, treeG;

		OrderedTree treeC = new OrderedTree("C");
		OrderedTree treeF = new OrderedTree("F");
		OrderedTree treeH = new OrderedTree("H");
		OrderedTree treeI = new OrderedTree("I");
		OrderedTree treeJ = new OrderedTree("J");
		OrderedTree treeK = new OrderedTree("K");
		OrderedTree treeL = new OrderedTree("L");
		OrderedTree treeM = new OrderedTree("M");

		List subtreesOfE = new LinkedList();
		subtreesOfE.add(treeH);
		subtreesOfE.add(treeI);
		treeE = new OrderedTree("E", subtreesOfE);

		List subtreesOfG = new LinkedList();
		subtreesOfG.add(treeJ);
		subtreesOfG.add(treeK);
		subtreesOfG.add(treeL);
		subtreesOfG.add(treeM);
		treeG = new OrderedTree("G", subtreesOfG);

		List subtreesOfB = new LinkedList();
		subtreesOfB.add(treeE);
		subtreesOfB.add(treeF);
		treeB = new OrderedTree("B", subtreesOfB);

		List subtreesOfD = new LinkedList();
		subtreesOfD.add(treeG);
		treeD = new OrderedTree("D", subtreesOfD);

		List subtreesOfA = new LinkedList();
		subtreesOfA.add(treeB);
		subtreesOfA.add(treeC);
		subtreesOfA.add(treeD);
		treeA = new OrderedTree("A", subtreesOfA);

		System.out.print("Level Order : ");
		treeA.levelorder();

	}

}
