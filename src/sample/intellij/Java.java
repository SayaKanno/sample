package sample.intellij;

public class Java extends Language {

    public Java(String name) {
        super(name);
        setKind("オブジェクト指向");
    }

    @Override
    public String getName() {
        return super.getName();
        
        
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getKind() {
        return super.getKind();
    }

    @Override
    public void setKind(String kind) {
        super.setKind(kind);
    }
}
