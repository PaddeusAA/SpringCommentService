package comments.repositories;

import comments.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
