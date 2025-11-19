package id_28279.q7;

public class Agent extends Agency {
    private String agentName;
    private String email;
    private String licenseNumber;

    public Agent(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                 String agencyName, String location, String agencyPhone,
                 String agentName, String email, String licenseNumber,
                 String existingEmail) throws Exception {
        super(id, createdDate, updatedDate, agencyName, location, agencyPhone);

        if (!email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$"))
            throw new Exception("Invalid agent email format");
        if (email.equals(existingEmail))
            throw new Exception("Email already used");

        this.agentName = agentName;
        this.email = email;
        this.licenseNumber = licenseNumber;
    }

    public String getAgentName() { return agentName; }
    public String getEmail() { return email; }
    public String getLicenseNumber() { return licenseNumber; }
}
