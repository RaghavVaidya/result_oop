package models;

public class result_generator {
    int maths;
    int physics;
    int chemistry;
    public void setPhysics(int physics) {
        this.physics = physics;
    }

    public void setChemistry(int chemistry) {
        this.chemistry = chemistry;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }
    public int getPhysics() {
        return physics;
    }

    public int getChemistry() {
        return chemistry;
    }

    public int getMaths() {
        return maths;
    }
}