package utils;

public enum TimeSlot {
    MORNING,
    AFTERNOON,
    EVENING;
    // Method to convert integer to TimeSlot enum
    public static TimeSlot fromInteger(int value) {
        return switch (value) {
            case 1 -> MORNING;
            case 2 -> AFTERNOON;
            case 3 -> EVENING;
            default -> throw new IllegalArgumentException("Invalid value for TimeSlot: " + value);
        };
    }
}

