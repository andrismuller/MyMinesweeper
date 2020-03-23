package hu.armando.muller.myminesweeper.ui.main;

import androidx.annotation.IntDef;
import androidx.lifecycle.ViewModel;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class MainViewModel extends ViewModel {
    // TODO: Implement the ViewModel

    public static final int LEVEL_EASY = 1;
    public static final int LEVEL_MEDIUM = 2;
    public static final int LEVEL_HARD = 3;
    public static final int LEVEL_CUSTOM = 4;

    @Retention(RetentionPolicy.SOURCE)
    @IntDef({LEVEL_EASY, LEVEL_MEDIUM, LEVEL_HARD, LEVEL_CUSTOM})
    public @interface MineFieldLevel {}
}
