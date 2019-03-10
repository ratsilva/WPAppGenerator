package br.com.wpappgenerator.objects;

import java.util.List;
import java.util.Map;

import androidx.annotation.NonNull;

public class Post {

    private int id;
    private String date;
    private String date_gmt;
    // guid
    private String link;
    private String modified;
    private String modified_gmt;
    private String slug;
    private String status;
    private String type;
    private String password;
    // title
    private Map<String, Object> content;
    private int author;
    // excerpt
    private int featured_media;
    private String comment_status;
    private String ping_status;
    private String format;
    // meta;
    private boolean sticky;
    private String template;
    private int[] categories;
    private int[] tags;

    @Override
    public String toString() {
        return this.content.get("rendered").toString();
    }

    public Map<String, Object> getContent() {
        return content;
    }

    public void setContent(Map<String, Object> content) {
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate_gmt() {
        return date_gmt;
    }

    public void setDate_gmt(String date_gmt) {
        this.date_gmt = date_gmt;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public String getModified_gmt() {
        return modified_gmt;
    }

    public void setModified_gmt(String modified_gmt) {
        this.modified_gmt = modified_gmt;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAuthor() {
        return author;
    }

    public void setAuthor(int author) {
        this.author = author;
    }

    public int getFeatured_media() {
        return featured_media;
    }

    public void setFeatured_media(int featured_media) {
        this.featured_media = featured_media;
    }

    public String getComment_status() {
        return comment_status;
    }

    public void setComment_status(String comment_status) {
        this.comment_status = comment_status;
    }

    public String getPing_status() {
        return ping_status;
    }

    public void setPing_status(String ping_status) {
        this.ping_status = ping_status;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public boolean isSticky() {
        return sticky;
    }

    public void setSticky(boolean sticky) {
        this.sticky = sticky;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public int[] getCategories() {
        return categories;
    }

    public void setCategories(int[] categories) {
        this.categories = categories;
    }

    public int[] getTags() {
        return tags;
    }

    public void setTags(int[] tags) {
        this.tags = tags;
    }

}
