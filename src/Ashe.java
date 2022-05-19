public class Ashe extends Champion implements AsheActionCallbacks{
    public Ashe(int id, String name, String role, String difficulty, String description) {
        super(id, name, role, difficulty, description);
    }

    @Override
    public void frostShot(Screen s) {
        s.setVisible(true);
        s.out(showMessage(), "Helvetica", 28, Colors.BlueHorizon);
        s.showImage("ability_1.gif");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void hawkShot(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), "Helvetica", 28, Colors.BlueHorizon);
        s.showImage("ability_2.gif");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void rangerFocus(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), "Helvetica", 28, Colors.BlueHorizon);
        s.showImage("ability_3.gif");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void volley(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), "Helvetica", 28, Colors.BlueHorizon);
        s.showImage("ability_4.gif");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void crystalArrow(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), "Helvetica", 28, Colors.BlueHorizon);
        s.showImage("CrystalArrow.gif");
        s.setBounds(200,100,1100,900);
    }
}
