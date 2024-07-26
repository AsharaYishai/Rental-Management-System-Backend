package org.rms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class HardwareItem {
    private Long itemId;
    private String name;
    private String availability;
    private String finePerDay;
    private String rentalPerDay;
}
