package hu.vg.component;

public class HelloWorld {

    private Koszontes koszontes;

    public HelloWorld(Koszontes koszontes) {
        this.koszontes=koszontes;
    }

    public void hello()
    {
        System.out.println(koszontes.udvozles());
    }
}