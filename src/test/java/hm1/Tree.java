package hm1;

public class Tree {
    //-------------ATTRIBUTES-----------
    private String treeType;
    private String name;
    private double totalHeight;
    private int age;
    private double trunkDiameter;
    private double crownDiameter;

    //---------------GETTERS/SETTERS-----------

    public String getTreeType() {
        return treeType;
    }

    public void setTreeType(String treeType) {
        this.treeType = treeType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTotalHeight() {
        return totalHeight;
    }

    public void setTotalHeight(double totalHeight) {
        this.totalHeight = totalHeight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getTrunkDiameter() {
        return trunkDiameter;
    }

    public void setTrunkDiameter(double trunkDiameter) {
        this.trunkDiameter = trunkDiameter;
    }

    public double getCrownDiameter() {
        return crownDiameter;
    }

    public void setCrownDiameter(double crownDiameter) {
        this.crownDiameter = crownDiameter;
    }
}
