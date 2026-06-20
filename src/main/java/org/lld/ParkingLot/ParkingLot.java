package org.lld.ParkingLot;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class ParkingLot {
    public static ParkingLot parkingLot;
    private Map<String, Ticket> activeTickets = new HashMap<>();
    private PaymentStrategy paymentStrategy;
    private static int count;

    private List<ParkingSlot> parkingSlots;

    private ParkingLot(List<ParkingSlot> parkingSlots){
        this.parkingSlots = parkingSlots;
    }

    public static ParkingLot getParkingLot(List<ParkingSlot> parkingSlots){
        if(parkingLot == null){
            parkingLot = new ParkingLot(parkingSlots);
        }

        return parkingLot;
    }

    public Map<String, Ticket> getActiveTickets() {
        return activeTickets;
    }

    public void setActiveTickets(Map<String, Ticket> activeTickets) {
        this.activeTickets = activeTickets;
    }

    public List<ParkingSlot> getParkingSlots() {
        return parkingSlots;
    }

    public void setParkingSlots(List<ParkingSlot> parkingSlots) {
        this.parkingSlots = parkingSlots;
    }

    public Ticket parkVehicle(Vehicle vehicle){
        ParkingSlot availableSpot = getAvailableParkingSlot(vehicle);

        availableSpot.park(vehicle);

        Ticket ticket = new Ticket(++count + "", vehicle, availableSpot);
        activeTickets.put(ticket.getTicketId(), ticket);

        return ticket;
    }

    public void exitVehicle(String ticketId, PaymentStrategy paymentStrategy){

        if(activeTickets.get(ticketId) == null){
            throw new RuntimeException("Invalid ticket Id.");
        }

        Ticket ticket = activeTickets.get(ticketId);
        paymentStrategy.ProcessPayment(ticket);

        ticket.getParkingSlot().unPark(ticket.getVehicle());
        activeTickets.remove(ticketId);
    }

    private ParkingSlot getAvailableParkingSlot(Vehicle vehicle){
        for(int i=0; i<parkingSlots.size(); i++){
            if(parkingSlots.get(i).isSlotAvailable() &&
                    parkingSlots.get(i).vehicleType.equals(vehicle.getVehicleType())){
                return parkingSlots.get(i);
            }
        }

        return null;
    }
}
