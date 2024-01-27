package com.dev.model.message;
import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

import com.dev.model.message.user.UserMess;
import com.dev.model.user.User;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "message")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String idMessage;
    UserMess userSend;
    UserMess userReceive;
    String contenu;
    int typemessage;
    Date dateHeureMessage;
    public Message() {
    }
    public Message(String idMessage, UserMess userSend, UserMess userReceive, String contenu, int typemessage,
            Date dateHeureMessage) {
        this.idMessage = idMessage;
        this.userSend = userSend;
        this.userReceive = userReceive;
        this.contenu = contenu;
        this.typemessage = typemessage;
        this.dateHeureMessage = dateHeureMessage;
    }
    public String getIdMessage() {
        return idMessage;
    }
    public void setIdMessage(String idMessage) {
        this.idMessage = idMessage;
    }
    public UserMess getUserSend() {
        return userSend;
    }
    public void setUserSend(UserMess userSend) {
        this.userSend = userSend;
    }
    public UserMess getUserReceive() {
        return userReceive;
    }
    public void setUserReceive(UserMess userReceive) {
        this.userReceive = userReceive;
    }
    public String getContenu() {
        return contenu;
    }
    public void setContenu(String contenu) {
        this.contenu = contenu;
    }
    public int getTypemessage() {
        return typemessage;
    }
    public void setTypemessage(int typemessage) {
        this.typemessage = typemessage;
    }
    public Date getDateHeureMessage() {
        return dateHeureMessage;
    }
    public void setDateHeureMessage(Date dateHeureMessage) {
        this.dateHeureMessage = dateHeureMessage;
    }
}
