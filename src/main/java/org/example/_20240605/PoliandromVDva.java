package org.example._20240605;

import java.util.Objects;

public class PoliandromVDva {
    public static boolean isStrPol(String str) {
        StringBuilder sb = new StringBuilder(str);
        return Objects.equals(str, sb.reverse().toString());
    }
}
