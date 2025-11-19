package id_28279.q2;

import java.time.LocalDate;

public abstract class Entity {
    private int id;
    private LocalDate createdDate;
    private LocalDate updatedDate;

    public Entity(int id, LocalDate createdDate, LocalDate updatedDate) throws Exception {
        if (id <= 0)
            throw new Exception("ID must be > 0");
        if (createdDate == null || updatedDate == null)
            throw new Exception("Dates cannot be null");
        if (updatedDate.isBefore(createdDate))
            throw new Exception("Updated date cannot be before created date");

        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public int getId() {
        return id;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public LocalDate getUpdatedDate() {
        return updatedDate;
    }

    public void setId(int id) throws Exception {
        if (id <= 0)
            throw new Exception("ID must be > 0");
        this.id = id;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public void setUpdatedDate(LocalDate updatedDate) {
        this.updatedDate = updatedDate;
    }
}
