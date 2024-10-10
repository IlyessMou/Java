public class DeviceTest {
    public static void main(String[] args) {
        //instantiate the Phone class.
        Phone newPhone= new Phone();

        newPhone.Status();

        // Call the makeCall method three times
        newPhone.makeCall();
        newPhone.makeCall();
        newPhone.makeCall();
        // the playGame method twice
        newPhone.playGame();
        newPhone.playGame();
        // and the charge method once.
        newPhone.charge();

    }
}
