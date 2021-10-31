package com.ashish.medicinetime;

import android.content.Context;
import androidx.annotation.NonNull;


import com.ashish.medicinetime.data.source.MedicineRepository;
import com.ashish.medicinetime.data.source.local.MedicinesLocalDataSource;


/**
 * Created by ashish on 13/05/17.
 */

public class Injection {

    public static MedicineRepository provideMedicineRepository(@NonNull Context context) {
        return MedicineRepository.getInstance(MedicinesLocalDataSource.getInstance(context));
    }
}