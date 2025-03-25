package models.enums;

import com.sun.nio.sctp.IllegalReceiveException;

import java.util.Arrays;

public enum ProfileEnum {
    ROLE_ADMIN("ROLE_ADMIN"),
    ROLE_USER("ROLE_COSTUMER"),
    ROLE_TECHNICIAN("ROLE_TECHNICIAN");

    private final String value;

    ProfileEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static ProfileEnum toEnum(final String value) {

        return Arrays.stream(ProfileEnum.values())
                .filter(profileEnum -> profileEnum.getValue().equals(value))
                .findFirst()
                .orElseThrow(() -> new IllegalReceiveException("Invalid description " + value));

    }
}
