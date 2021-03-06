package com.example.easyfood42.controleur;

public class Client extends Utilisateur {

    private int noteEasyFood;
    private String commentaireEasyFood;
    private String commentaireVisible;

    public Client(Utilisateur utilisateur, int noteEasyFood, String commentaireEasyFood, String commentaireVisible) {
        super(utilisateur.getIdU(), utilisateur.getMailU(), utilisateur.getPseudoU(), utilisateur.getPasswd(),  utilisateur.getNomU(), utilisateur.getPrenomU(), utilisateur.getNumAdrU(), utilisateur.getNomAdrU(), utilisateur.getCpU(), utilisateur.getVilleU(), utilisateur.getIdTU());
        this.noteEasyFood = noteEasyFood;
        this.commentaireEasyFood = commentaireEasyFood;
        this.commentaireVisible = commentaireVisible;
    }

    public int getNoteEasyFood() {
        return noteEasyFood;
    }

    public void setNoteEasyFood(int noteEasyFood) {
        this.noteEasyFood = noteEasyFood;
    }

    public String getCommentaireEasyFood() {
        return commentaireEasyFood;
    }

    public void setCommentaireEasyFood(String commentaireEasyFood) {
        this.commentaireEasyFood = commentaireEasyFood;
    }

    public String getCommentaireVisible() {
        return commentaireVisible;
    }

    public void setCommentaireVisible(String commentaireVisible) {
        this.commentaireVisible = commentaireVisible;
    }
}
