public interface DocumentVisitor {
    public void visit(ItalicTextSegment text);
    public void visit(BoldTextSegment text);
    public void visit(UrlSegment text);
    public void visit(PlainTextSegment text);
    public StringBuilder getDocument();
}
