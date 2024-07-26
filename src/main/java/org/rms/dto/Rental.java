package org.rms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Rental {
    private Long rentalId;
    private String rentalDate;
    private String returnDate;
    private String dueDate;
    private String exitDate;
    private Double totalCost;
    private String fine;
}
