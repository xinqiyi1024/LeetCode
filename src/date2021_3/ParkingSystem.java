package date2021_3;

import java.sql.PreparedStatement;
import java.util.HashMap;
import java.util.Map;

/**
 * @author FZN
 */
public class ParkingSystem {
    int b, m, s;

    public ParkingSystem(int big, int medium, int small) {
        this.b = big;
        this.m = medium;
        this.s = small;
    }

    public boolean addCar(int carType) {
        switch (carType) {
            case 1:
                if (b > 0) {
                    b--;
                    return true;
                }
                break;
            case 2:
                if (m > 0) {
                    m--;
                    return true;
                }
                break;
            case 3:
                if (s > 0) {
                    s--;
                    return true;
                }
                break;
            default:
                break;
        }
        return false;
    }

    public static void main(String[] args) {
        ParkingSystem system = new ParkingSystem(1,1,0);
        System.out.println(system.addCar(2));
        System.out.println(system.addCar(1));
        System.out.println(system.addCar(3));
    }
}

