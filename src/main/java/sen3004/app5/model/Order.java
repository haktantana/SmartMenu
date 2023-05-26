package sen3004.app5.model;

import java.time.LocalDate;

import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class Order {
    private long id;
	private String firstName;
	private long price;
    private long masaNo;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public long getPrice() {
        return price;
    }
    public void setPrice(long price) {
        this.price = price;
    }
    public long getMasaNo() {
        return masaNo;
    }
    public void setMasaNo(long masaNo) {
        this.masaNo = masaNo;
    }

    
}
