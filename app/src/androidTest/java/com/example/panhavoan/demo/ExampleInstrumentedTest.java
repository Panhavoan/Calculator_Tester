package com.example.panhavoan.demo;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.clearText;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    public static final String NUM_ONE = "8";
    public static final String NUM_TWO = "4";
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.example.panhavoan.demo", appContext.getPackageName());
    }
    @Rule
    public ActivityTestRule<MainActivity> main = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void checkOperation(){
        String RESULT_SUM = "12";
        String RESULT_MINUS = "4";
        String RESULT_MULTI = "32";
        String RESULT_DEV = "2";

        // Test Sum
        onView(withId(R.id.num_1)).perform(typeText(NUM_ONE), ViewActions.closeSoftKeyboard());
        onView(withId(R.id.num_2)).perform(typeText(NUM_TWO), ViewActions.closeSoftKeyboard());
        onView(withId(R.id.btnAdd)) .perform(ViewActions.click());
        onView(withId(R.id.result_view)).check(matches(withText(RESULT_SUM)));

        // Minus
        onView(withId(R.id.num_1)).perform(clearText());
        onView(withId(R.id.num_2)).perform(clearText());
        onView(withId(R.id.num_1)).perform(typeText(NUM_ONE), ViewActions.closeSoftKeyboard());
        onView(withId(R.id.num_2)).perform(typeText(NUM_TWO), ViewActions.closeSoftKeyboard());
        onView(withId(R.id.btnMinus)) .perform(ViewActions.click());
        onView(withId(R.id.result_view)).check(matches(withText(RESULT_MINUS)));

        // Multi
        onView(withId(R.id.num_1)).perform(clearText());
        onView(withId(R.id.num_2)).perform(clearText());
        onView(withId(R.id.num_1)).perform(typeText(NUM_ONE), ViewActions.closeSoftKeyboard());
        onView(withId(R.id.num_2)).perform(typeText(NUM_TWO), ViewActions.closeSoftKeyboard());
        onView(withId(R.id.btnMulti)) .perform(ViewActions.click());
        onView(withId(R.id.result_view)).check(matches(withText(RESULT_MULTI)));

        // Dev
        onView(withId(R.id.num_1)).perform(clearText());
        onView(withId(R.id.num_2)).perform(clearText());
        onView(withId(R.id.num_1)).perform(typeText(NUM_ONE), ViewActions.closeSoftKeyboard());
        onView(withId(R.id.num_2)).perform(typeText(NUM_TWO), ViewActions.closeSoftKeyboard());
        onView(withId(R.id.btnDivice)) .perform(ViewActions.click());
        onView(withId(R.id.result_view)).check(matches(withText(RESULT_DEV)));
    }
}
