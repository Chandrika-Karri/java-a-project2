package se.chandrika.adventure;

import se.chandrika.adventure.model.Burgler;
import se.chandrika.adventure.model.Resident;

public interface Room {

    public void enter(Resident resident, Burgler burgler);

}
