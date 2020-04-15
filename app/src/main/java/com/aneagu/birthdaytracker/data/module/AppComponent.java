package com.aneagu.birthdaytracker.data.module;


import android.app.Application;

import com.aneagu.birthdaytracker.data.repository.local.AppDatabase;
import com.aneagu.birthdaytracker.data.repository.local.BirthdayDao;
import com.aneagu.birthdaytracker.ui.auth.LoginActivity;
import com.aneagu.birthdaytracker.ui.auth.RegisterActivity;
import com.aneagu.birthdaytracker.ui.birthdays.NewBirthdayActivity;
import com.aneagu.birthdaytracker.ui.birthdays.BirthdaysFragment;
import com.aneagu.birthdaytracker.ui.settings.SettingsFragment;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, DbModule.class})
public interface AppComponent {

    void inject(NewBirthdayActivity target);

    void inject(LoginActivity target);

    void inject(RegisterActivity target);

    void inject(BirthdaysFragment target);

    void inject(SettingsFragment target);

    Application application();

    AppDatabase appDatabase();

    BirthdayDao birthdayDao();

    FirebaseAuth firebaseAuth();

}
