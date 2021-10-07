package entity;

public class Comment {
    private String cmt;
    private String gmail;
    private String ten;
    private String id;

    public Comment(String cmt, String gmail, String ten, String id) {
        this.cmt = cmt;
        this.gmail = gmail;
        this.ten = ten;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "cmt='" + cmt + '\'' +
                ", gmail='" + gmail + '\'' +
                ", ten='" + ten + '\'' +
                ", id=" + id +
                '}';
    }

    public void setId(String id) {
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

    public String getId() {
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
