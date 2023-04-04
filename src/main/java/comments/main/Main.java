package comments.main;

import comments.model.Comment;
import comments.proxies.EmailCommentNotificationProxy;
import comments.repositories.DBCommentRepository;
import comments.services.CommentService;

public class Main {
    public static void main(String[] args) {

        var commentRepository = new DBCommentRepository();
        var commentNotificationProxy = new EmailCommentNotificationProxy();
        var commentService = new CommentService(commentRepository, commentNotificationProxy);

        var comment = new Comment();
        comment.setText("Demo");
        comment.setAuthor("Vlad");

        commentService.publishComment(comment);
    }
}
