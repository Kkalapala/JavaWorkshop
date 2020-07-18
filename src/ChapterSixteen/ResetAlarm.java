package ChapterSixteen;

import java.util.function.Consumer;

public class ResetAlarm implements Consumer<Sensor> {
    @Override
    public void accept(Sensor sensor) {
        sensor.triggered(false);
        sensor.batteryHealth(50);

        example163.alarmServiceNotified = false;
    }
}
