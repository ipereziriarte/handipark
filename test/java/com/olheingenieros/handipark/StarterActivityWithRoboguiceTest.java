package com.olheingenieros.handipark;

import android.widget.TextView;
import com.olheingenieros.handipark.test.support.FakeCurrentTime;
import com.olheingenieros.handipark.test.support.RobolectricTestRunnerWithInjection;
import com.olheingenieros.handipark.util.CurrentTime;
import com.google.inject.Inject;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(RobolectricTestRunnerWithInjection.class)
public class StarterActivityWithRoboguiceTest {
    @Inject
    CurrentTime currentTime;

    @Test
    public void testCurrentTimeIsInjected() throws Exception {
        ((FakeCurrentTime) currentTime).setCurrentTime(12345L);
        final StarterActivity activity = new StarterActivity();
        activity.onCreate(null);
        TextView title = (TextView) activity.findViewById(R.id.current_time);
        assertEquals("12345", title.getText());
    }
}
