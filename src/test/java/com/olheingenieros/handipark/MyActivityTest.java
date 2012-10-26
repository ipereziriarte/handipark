package com.olheingenieros.handipark;

import com.xtremelabs.robolectric.RobolectricTestRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertNotNull;

@RunWith(RobolectricTestRunner.class)
public class MyActivityTest {
    private MyActivity myActivity;

    @Test
    public void shouldNotBeNull() throws Exception {
    myActivity = new MyActivity();
    assertNotNull(myActivity);
    }
}
