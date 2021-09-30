package entity;

public class Comment {
    private int id;
    private String ten;
    private String cmt;
    private String gmail;

    public Comment(int id, String ten, String cmt, String gmail) {
        this.id = id;
        this.ten = ten;
        this.cmt = cmt;
        this.gmail = gmail;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", ten='" + ten + '\'' +
                ", cmt='" + cmt + '\'' +
                ", gmail='" + gmail + '\'' +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCmt(String cmt) {
        this.cmt = cmt;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public int getId() {
        return id;
    }

    public String getCmt() {
        return cmt;
    }

    public String getTen() {
        return ten;
    }

    public String getGmail() {
        return gmail;
    }
}
