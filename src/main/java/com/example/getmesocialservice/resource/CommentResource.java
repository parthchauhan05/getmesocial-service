package com.example.getmesocialservice.resource;

import com.example.getmesocialservice.model.Comment;
import com.example.getmesocialservice.model.Photo;
import com.example.getmesocialservice.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/comments")
public class CommentResource {
    @Autowired private CommentService commentService;

    @GetMapping
    public List<Comment> getAllComment() {
        return commentService.getAllComment();
    }

    @GetMapping("/comment")
    public Optional<Comment> getCommentById(@RequestParam(name = "id") String id){
        return commentService.getCommentById(id);
    }

    @PostMapping
    public Comment saveComment(@RequestBody @Valid Comment comment) {
        return commentService.saveComment(comment);
    }

    @PutMapping
    public Comment updateComment(@RequestBody @Valid Comment comment) {
        return commentService.updateComment(comment);
    }

    @DeleteMapping
    public void deleteComment(@RequestParam(name = "id") String id) {
        commentService.deleteComment(id);
    }
}
