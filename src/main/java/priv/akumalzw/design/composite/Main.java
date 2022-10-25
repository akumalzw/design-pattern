package priv.akumalzw.design.composite;

public class Main {
    public static void main(String[] args) {
        System.out.println("生成树根root，根上长出五片叶子 LeafA、LeafB、LeafC、LeafD、LeafE");
        Composite root = new Composite("root");
        root.add(new Leaf("leafA"));
        root.add(new Leaf("leafB"));
        root.add(new Leaf("leafC"));
        Leaf leafD = new Leaf("leafD");
        Leaf leafE = new Leaf("leafE");
        root.add(leafD);
        root.add(leafE);

        System.out.println("根上长出分枝 compositeX 和 compositeY");
        Composite compositeX = new Composite("compositeX");
        Composite compositeY = new Composite("compositeY");
        root.add(compositeX);
        root.add(compositeY);

        System.out.println("CompositeX 长出两片叶子 leafXA 和 leafXB");
        Leaf leafX_A = new Leaf("leafXA");
        Leaf leafX_B = new Leaf("leafXB");
        compositeX.add(leafX_A);
        compositeX.add(leafX_B);

        System.out.println("CompositeY 上长出分枝 compositeYA 和 叶子 leafYA");
        Composite compositeY_A = new Composite("compositeYA");
        Leaf leafY_A = new Leaf("leafYA");
        compositeY.add(compositeY_A);
        compositeY.add(leafY_A);

        root.display(1);

        System.out.println("台风来了，吹走了叶子 leafD 和 leafE");
        root.remove(leafD);
        root.remove(leafE);

        root.display(1);
    }
}
