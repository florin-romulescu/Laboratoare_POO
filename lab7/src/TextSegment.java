import org.w3c.dom.Text;

public abstract class TextSegment implements DocumentVisitable{
    private String content;

    TextSegment(String content) {
        this.content = content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void accept(DocumentVisitor visitor) {

    }
}

class ItalicTextSegment extends TextSegment {

    ItalicTextSegment(String content) {
        super(content);
    }

    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visit(this);
    }
}

class BoldTextSegment extends  TextSegment {

    BoldTextSegment(String content) {
        super(content);
    }

    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visit(this);
    }
}

class UrlSegment extends TextSegment {

    private String title;

    UrlSegment(String content, String title) {
        super(content);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visit(this);
    }
}

class PlainTextSegment extends  TextSegment {
    PlainTextSegment(String content) {
        super(content);
    }

    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visit(this);
    }
}