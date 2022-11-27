import java.sql.Struct;

public class MarkdownVisitor implements DocumentVisitor {
    StringBuilder document = new StringBuilder();
    @Override
    public void visit(ItalicTextSegment text) {
        document.append("*").append(text.getContent()).append("*");
    }

    @Override
    public void visit(BoldTextSegment text) {
        document.append("**").append(text.getContent()).append("**");
    }

    @Override
    public void visit(UrlSegment text) {
        document.append("[").append(text.getTitle()).append("](").append(text.getContent()).append(")");
    }

    @Override
    public void visit(PlainTextSegment text) {
        document.append(text.getContent());
    }

    @Override
    public StringBuilder getDocument() {
        return document;
    }
}
