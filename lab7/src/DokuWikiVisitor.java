public class DokuWikiVisitor implements DocumentVisitor {
    StringBuilder document = new StringBuilder();
    @Override
    public void visit(ItalicTextSegment text) {
        document.append("//").append(text.getContent()).append("//");
    }

    @Override
    public void visit(BoldTextSegment text) {
        document.append("**").append(text.getContent()).append("**");
    }

    @Override
    public void visit(UrlSegment text) {
        document.append("[[").append(text.getContent()).append("|").append(text.getTitle()).append("]]");
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
