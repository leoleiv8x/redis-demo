package Stream;

public class UserDTO {
    private Integer dtoId;
    private String dtoName;

    public UserDTO(Integer dtoId, String dtoName) {
        this.dtoId = dtoId;
        this.dtoName = dtoName;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "dtoId=" + dtoId +
                ", dtoName='" + dtoName + '\'' +
                '}';
    }

    public Integer getDtoId() {
        return dtoId;
    }

    public void setDtoId(Integer dtoId) {
        this.dtoId = dtoId;
    }

    public String getDtoName() {
        return dtoName;
    }

    public void setDtoName(String dtoName) {
        this.dtoName = dtoName;
    }
}
