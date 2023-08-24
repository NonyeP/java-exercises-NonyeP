package com.cbfacademy.accounts;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class MonthlyTimer {
    private final Runnable whatToDo;

        // when
        private final int dayOfMonth;
        private final int hourOfDay;

        // The current timer
        private Timer current = new Timer();//to avoid NPE

        public void cancelCurrent() {
            current.cancel();// cancel this execution;
            current.purge(); // removes the timer task so it can be garbage collected
        }

        // create a new instance
        public static MonthlyTimer schedule( Runnable runnable, int dayOfMonth, int hourOfDay ) {
            return new MonthlyTimer( runnable, dayOfMonth, hourOfDay );
        }

        private MonthlyTimer(Runnable runnable, int day, int hour ) {
            this.whatToDo = runnable;
            this.dayOfMonth = day;
            this.hourOfDay = hour;
            schedule();
        }
        // Schedules the task for execution on next month.
        private void schedule() {
            // Do you mean like this?
            cancelCurrent();
            current = new Timer(); // assigning a new instance
            // will allow the previous Timer to be garbage collected

            current.schedule( new TimerTask() {
                public void run() {
                    try {
                        whatToDo.run();
                    } finally {
                        schedule();// schedule for the next month
                    }
                }
            } , nextDate() );
        }
        // Do the next date stuff
        private Date nextDate() {
            Calendar runDate = Calendar.getInstance();
            runDate.set(Calendar.DAY_OF_MONTH, dayOfMonth);
            runDate.set(Calendar.HOUR_OF_DAY, hourOfDay);
            runDate.set(Calendar.MINUTE, 0);
            runDate.add(Calendar.MONTH, 1);//set to next month
            return runDate.getTime();
        }

}
