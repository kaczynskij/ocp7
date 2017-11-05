package jk.personal.manning.chapter_3.interfaces;

interface GuestHouse3 {
    void welcome();
}

interface PayingGuestHouse extends GuestHouse3 {
    void paidBreakfast();
}

interface StudentPGHouse extends PayingGuestHouse {
    void laundry();
}

interface ChildFriendly {
    void toys();
}

public interface FamilyPGHouse extends ChildFriendly, PayingGuestHouse {
    void kitchen();
}
