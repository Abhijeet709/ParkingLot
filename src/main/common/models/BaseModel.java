package main.common.models;

public abstract class BaseModel {
    private long id;

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}
