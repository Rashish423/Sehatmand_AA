package com.ashish.medicinetime.addmedicine;

import com.ashish.medicinetime.BasePresenter;
import com.ashish.medicinetime.BaseView;
import com.ashish.medicinetime.data.source.MedicineAlarm;
import com.ashish.medicinetime.data.source.Pills;

import java.util.List;

/**
 * Created by ashish on 12/07/17.
 */

public interface AddMedicineContract {

    interface View extends BaseView<Presenter> {

        void showEmptyMedicineError();

        void showMedicineList();

        boolean isActive();

    }

    interface  Presenter extends BasePresenter{


        void saveMedicine(MedicineAlarm alarm, Pills pills);


        boolean isDataMissing();

        boolean isMedicineExits(String pillName);

        long addPills(Pills pills);

        Pills getPillsByName(String pillName);

        List<MedicineAlarm> getMedicineByPillName(String pillName);

        List<Long> tempIds();

        void deleteMedicineAlarm(long alarmId);

    }
}
