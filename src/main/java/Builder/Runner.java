package Builder;

public class Runner {
    public static void main(String[] args) {
        Computer computerCreated = Computer.builder().withCpu("Lenove")
                .withMonitor("acer")
                .withKeyboard("hp")
                .withMouse("samsung")
                .withHeadphone("sony")
                .withMousepad("abc").build();

        String computerCreatedString = computerCreated.toString();
        System.out.println(computerCreatedString);
        Computer brokenComputer = Computer.builder().withCpu("lenove").withMousepad("abc").withKeyboard("hp").build();
        System.out.println(brokenComputer.toString());
    }
}
