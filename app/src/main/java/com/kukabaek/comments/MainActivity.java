package com.kukabaek.comments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONObject;
import org.w3c.dom.Comment;

import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    public interface CommentDataFactory<T extends Map> {
        T createComemntStructure(List<Comment> comments);
    }


    public class Comment implements CommentDataFactory {
        private final long id;
        private final long userId;
        private final long replyTo;
        private final String name;
        private final String content;

        public Comment(long newId, long newUserId, long newReplyTo, String newName, String newContent) {
            id = newId;
            userId = newUserId;
            replyTo = newReplyTo;
            name = newName;
            content = newContent;
        }
        // Getters and Setters

        public void setId(long newId) {
            this.id = newId;
        }
        public long getId() {
            return id;
        }
        public void setUserId(long newUserId) {
            this.userId = newUserId;
        }
        public long getUserId() {
            return userId;
        }

        public void setReplyTo(long newReplyTo) {
            this.replyTo = newReplyTo;
        }

        public long getReplyTo() {
            return replyTo;
        }

        public void setName(String newName) {
            this.name = newName;
        }

        public String getName() {
            return name;
        }

        public void setContent(String newContent) {
            this.content = newContent;
        }

        public String getContent() {
            return content;
        }

        @Override
        public Map createComemntStructure(List list) {
            if(replyTo ==0){
                Log.i("it is root comment");
            }
            
            return null;
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
