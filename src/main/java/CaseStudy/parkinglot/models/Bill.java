package CaseStudy.parkinglot.models;

import java.util.Date;
import java.util.List;

public class Bill extends BaseModel{
    private Ticket ticket;
    private double amount;
    private Date exitTime;
    private Gate exitGate;
    private Operator generatedBy;
    private List<Payment> payments;
}
