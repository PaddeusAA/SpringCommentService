package comments.proxies;

import comments.model.Comment;

public interface CommentNotificationProxy {

    void sendComment(Comment comment);
}
