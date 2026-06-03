public class Firewall {
    // Checks packet and returns decision
    public boolean inspectPacket(Packet packet) {
        if (packet.isInfected()) {
            System.out.println(
                    "\n[FIREWALL] Infected Packet Detected!"
            );
            System.out.println(
                    "[FIREWALL] Packet Blocked."
            );
            return false;
        }
        System.out.println(
                "\n[FIREWALL] Packet Approved."
        );

        return true;
    }
}