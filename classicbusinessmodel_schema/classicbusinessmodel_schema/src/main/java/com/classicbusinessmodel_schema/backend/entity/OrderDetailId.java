import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class OrderDetailId implements Serializable {

    private Integer orderNumber;
    private String productCode;
}