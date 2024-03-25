package AST.widget;

import AST.Node;

public class alertDialogWidget extends Widget{
    String content;
   // actions actions;
    String title;
    public Node node;


    public alertDialogWidget() {
        this.content =  new String();
      //  this.actions =  new actions();
        this.title =  new String();
        this.node =  new Node();
    }

    public void setContent(String content) {
        this.content=content;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public void setTitle(String title) {
        this.title=title;
    }

    public String generateHTMLCode() {
        return null;
    }

    public String generateCSSCode() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(".dialog {\n ");
        stringBuilder.append("width: 300px;\n ");
        stringBuilder.append("background-color: white;\n ");
        stringBuilder.append("padding: 20px;\n ");
        stringBuilder.append("border: 1px solid #ccc;\n ");
        stringBuilder.append("border-radius: 4px;\n ");
        stringBuilder.append("box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);\n  } \n");

        stringBuilder.append(".dialog button {\n ");
        stringBuilder.append("padding: 8px 16px;\n ");
        stringBuilder.append("border-radius: 4px;\n ");
        stringBuilder.append("background-color: #007bff;\n ");
        stringBuilder.append("color: white;\n ");
        stringBuilder.append("border: none;\n ");
        stringBuilder.append("cursor: pointer;\n } \n ");

        return stringBuilder.toString();
    }

    public String generateJSCode() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("var dialog = document.createElement('div');\n ");
        stringBuilder.append("dialog.className = 'dialog'; \n ");
        stringBuilder.append("dialog.innerHTML = '<h2>"+title+"</h2> <br> <p>"+ content +"</p>'; \n");
        stringBuilder.append("var closeButton = document.createElement('button');\n ");
        stringBuilder.append("closeButton.textContent = 'OK';\n ");
        stringBuilder.append("closeButton.addEventListener('click', function() {\n ");
        stringBuilder.append("document.body.removeChild(dialog);\n  }); \n ");
        stringBuilder.append("dialog.appendChild(closeButton);\n ");
        stringBuilder.append("document.body.appendChild(dialog); }\n ");
        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        return "alertDialogWidget";
    }


}
