package carlosrivera_lab.pkg8;

import javax.swing.JProgressBar;

public class adminPelea {
    private JProgressBar HP1;
    private JProgressBar HP2;
    private Hadas fairy1;
    private Hadas fairy2;
    private boolean live;
    private boolean runs;

    public adminPelea(JProgressBar HP1, JProgressBar HP2, Hadas fairy1, Hadas fairy2, boolean live, boolean runs) {
        this.HP1 = HP1;
        this.HP2 = HP2;
        this.fairy1 = fairy1;
        this.fairy2 = fairy2;
        this.live = live;
        this.runs = runs;
    }

    public JProgressBar getHP1() {
        return HP1;
    }

    public void setHP1(JProgressBar HP1) {
        this.HP1 = HP1;
    }

    public JProgressBar getHP2() {
        return HP2;
    }

    public void setHP2(JProgressBar HP2) {
        this.HP2 = HP2;
    }

    public Hadas getFairy1() {
        return fairy1;
    }

    public void setFairy1(Hadas fairy1) {
        this.fairy1 = fairy1;
    }

    public Hadas getFairy2() {
        return fairy2;
    }

    public void setFairy2(Hadas fairy2) {
        this.fairy2 = fairy2;
    }

    public boolean isLive() {
        return live;
    }

    public void setLive(boolean live) {
        this.live = live;
    }

    public boolean isRuns() {
        return runs;
    }

    public void setRuns(boolean runs) {
        this.runs = runs;
    }

    @Override
    public String toString() {
        return "adminPelea{" + "HP1=" + HP1 + ", HP2=" + HP2 + ", fairy1=" + fairy1 + ", fairy2=" + fairy2 + ", live=" + live + ", runs=" + runs + '}';
    }
    
    public void run() {
        while (live) {
            if (runs) {
                if (fairy1 instanceof Salamandras && ((fairy2 instanceof Hamadriades))) {
                    fairy2.setSalud((int) (fairy2.getSalud() - (fairy1.getPoder() + (fairy1.getPoder() * 0.37))));
                } else if (((fairy1 instanceof Lamias) || (fairy1 instanceof Silfides)) && (fairy2 instanceof Hamadriades)) {
                    if (fairy1 instanceof Lamias) {
                        fairy2.setSalud((int) (fairy2.getSalud() - (fairy1.getPoder() + (fairy1.getPoder() * 0.42))));
                    }
                    if (fairy1 instanceof Silfides) {
                        fairy2.setSalud((int) (fairy2.getSalud() - (fairy1.getPoder() + (fairy1.getPoder() * 0.37))));
                    }
                } else {
                    fairy2.setSalud(fairy2.getSalud() - (fairy1.getPoder()));
                }
                if (fairy2 instanceof Salamandras && ((fairy1 instanceof Hamadriades))) {
                    fairy1.setSalud((int) (fairy1.getSalud() - (fairy1.getPoder() + (fairy2.getPoder() * 0.37))));
                } else if (((fairy2 instanceof Lamias) || (fairy2 instanceof Silfides)) && (fairy1 instanceof Hamadriades)) {
                    if (fairy2 instanceof Lamias) {
                        fairy1.setSalud((int) (fairy1.getSalud() - (fairy2.getPoder() + (fairy2.getPoder() * 0.42))));
                    }
                    if (fairy2 instanceof Silfides) {
                        fairy1.setSalud((int) (fairy1.getSalud() - (fairy2.getPoder() + (fairy2.getPoder() * 0.37))));
                    }
                } else {
                    fairy1.setSalud(fairy1.getSalud() - (fairy2.getPoder()));
                }
            }
        }
    }
}
