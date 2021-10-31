package com.ashish.medicinetime.alarm;

import com.ashish.medicinetime.BasePresenter;
import com.ashish.medicinetime.BaseView;
import com.ashish.medicinetime.data.source.History;
import com.ashish.medicinetime.data.source.MedicineAlarm;

/**
 * Created by ashish on 13/07/17.
 */

public interface ReminderContract {

    interface View extends BaseView<Presenter> {

        void showMedicine(MedicineAlarm medicineAlarm);

        void showNoData();

        boolean isActive();

        void onFinish();

    }

    interface Presenter extends BasePresenter {

        void finishActivity();

        void onStart(long id);

        void loadMedicineById(long id);

        void addPillsToHistory(History history);

    }
}
