package comments;

import comments.proxies.CommentNotificationProxy;
import comments.proxies.EmailCommentNotificationProxy;
import comments.repositories.CommentRepository;
import comments.repositories.DBCommentRepository;
import comments.services.CommentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"comments.proxies", "comments.services", "comments.repositories"})
public class ProjectConfig {

    /*
    @Bean
    public CommentRepository commentRepository(){
        return new  DBCommentRepository();
    }

    @Bean
    public CommentNotificationProxy commentNotificationProxy(){
        return new EmailCommentNotificationProxy();
    }

    @Bean
    public CommentService commentService (CommentRepository commentRepository,
                                          CommentNotificationProxy commentNotificationProxy){

        return new CommentService(commentRepository, commentNotificationProxy);
    }

     */
}
