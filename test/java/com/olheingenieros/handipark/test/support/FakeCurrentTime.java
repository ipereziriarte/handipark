package com.olheingenieros.handipark.test.support;

import com.olheingenieros.handipark.util.CurrentTime;

public class FakeCurrentTime extends CurrentTime {
    private long fakeTime;

    @Override
    public long currentTimeMillis() {
        return fakeTime;
    }

    public void setCurrentTime(long time) {
        fakeTime = time;
    }
}
