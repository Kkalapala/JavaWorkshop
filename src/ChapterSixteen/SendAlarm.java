package ChapterSixteen;

import java.util.function.Consumer;

public class SendAlarm implements Consumer<Sensor> {
    @Override
    public void accept(Sensor sensor) {
        if (sensor.triggered()) {
            example163.alarmServiceNotified = true;
        }
    }
}
