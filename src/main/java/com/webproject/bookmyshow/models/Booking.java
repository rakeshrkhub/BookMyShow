package com.webproject.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Entity
@Getter
@Setter
public class Booking extends BaseModel{
    @ManyToMany
    private List<ShowSeat> showSeats;

    @ManyToOne
    private User user;

    @Enumerated(EnumType.ORDINAL)
    private BookingStatus bookingStatus;

    private int amount;

    @OneToMany
    private List<Payment> payments;
}
/*
  1        M
Booking ShowSheet : M-> M
   M        1
 */
