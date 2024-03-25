package AST.statement.navigator;

public class MaterialPageRoute  {
    String goTO ;
    String content ;

    String className;

    String content2 ;
    public MaterialPageRoute() {
        this.goTO = new String();
        this.content = new String();
        this.content2 = new String();
    }


    public void setMaterialPageRoute(String goTO , String content , String content2 ) {
        this.goTO = goTO;
        this.content = content;
        this.content2 = content2;
    }

    public String generateJSCode() {
        StringBuilder sb = new StringBuilder();

        sb.append("function "+ className+"(){\n");
        if( content != null ){
            sb.append("var ").append(content).append(" = document.getElementById(\'").append(content).append("\');\n");
            sb.append(" window.location.href = \"/ "+ goTO + ".html?"+content+"=\"+ "+ content+";\n");
        }
        else{
            sb.append(" window.location.href = \"/ "+ goTO + ".html;\n");
        }
        sb.append("}");

        sb.append("\n }\n");

        return sb.toString();
    }

    @Override
    public String toString() {
        if( content != null ){
            return "MaterialPageRoute : the destination " + goTO + ", with data  " + content;}
        else{
            return "MaterialPageRoute : the destination " + goTO ;
        }
    }

}
