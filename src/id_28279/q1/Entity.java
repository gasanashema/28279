package id_28279.q1;

import java.time.LocalDate;

public class Entity {
    private int id;
    private LocalDate createdDate;
    private LocalDate updatedDate;

    public Entity(int id, LocalDate createdDate, LocalDate updatedDate) throws HospitalDataException {
        if (id <= 0) throw new HospitalDataException("ID must be greater than 0");
        if (createdDate == null) throw new HospitalDataException("Created date cannot be null");
        if (updatedDate == null) throw new HospitalDataException("Updated date cannot be null");

        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public int getId() { return id; }
    public LocalDate getCreatedDate() { return createdDate; }
    public LocalDate getUpdatedDate() { return updatedDate; }

    public void setId(int id) throws HospitalDataException {
        if (id <= 0) throw new HospitalDataException("ID must be greater than 0");
        this.id = id;
    }

    public void setCreatedDate(LocalDate createdDate) throws HospitalDataException {
        if (createdDate == null) throw new HospitalDataException("Created date cannot be null");
        this.createdDate = createdDate;
    }

    public void setUpdatedDate(LocalDate updatedDate) throws HospitalDataException {
        if (updatedDate == null) throw new HospitalDataException("Updated date cannot be null");
        this.updatedDate = updatedDate;
    }
}
