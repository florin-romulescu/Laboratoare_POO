import org.w3c.dom.Text;

import java.util.List;

public class WikiGenerator {
    private final List<TextSegment> textSegments;

    public WikiGenerator(List<TextSegment> textSegments) {
        this.textSegments = textSegments;
    }

    public StringBuilder getDokuWikiDocument() {
        DocumentVisitor visitor = new DokuWikiVisitor();

        for (TextSegment text: textSegments) {
            text.accept(visitor);
        }

        return visitor.getDocument();
    }

    public StringBuilder getMarkdownDocument() {
        DocumentVisitor visitor = new MarkdownVisitor();

        for (TextSegment text: textSegments) {
            text.accept(visitor);
        }

        return visitor.getDocument();
    }
}
