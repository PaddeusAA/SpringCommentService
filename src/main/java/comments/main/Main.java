package comments.main;

import comments.ProjectConfig;
import comments.model.Comment;
import comments.proxies.EmailCommentNotificationProxy;
import comments.repositories.DBCommentRepository;
import comments.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

    public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var comment = new Comment();
        comment.setText("Demo");
        comment.setAuthor("Vlad");

        var commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
    }
}
