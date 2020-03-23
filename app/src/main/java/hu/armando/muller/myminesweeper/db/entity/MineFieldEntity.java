package hu.armando.muller.myminesweeper.db.entity;

import android.os.SystemClock;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.Index;
import androidx.room.PrimaryKey;

import java.util.Date;

import hu.armando.muller.myminesweeper.model.MineField;
import hu.armando.muller.myminesweeper.ui.main.MainViewModel;

@Entity(tableName = "mineField",
        indices = {
                @Index(value = "id"),
        })
public class MineFieldEntity implements MineField {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private int timeElapsed;
    private int minesFound;
    private int minesToBeFound;
    private int width;
    private int height;
    private int level;
    private boolean isDead;
    private Date createdAt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTimeElapsed() {
        return timeElapsed;
    }

    public void setTimeElapsed(int timeElapsed) {
        this.timeElapsed = timeElapsed;
    }

    public int getMinesFound() {
        return minesFound;
    }

    public void setMinesFound(int minesFound) {
        this.minesFound = minesFound;
    }

    public int getMinesToBeFound() {
        return minesToBeFound;
    }

    public void setMinesToBeFound(int minesToBeFound) {
        this.minesToBeFound = minesToBeFound;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @MainViewModel.MineFieldLevel
    public int getLevel() {
        return level;
    }

    public void setLevel(@MainViewModel.MineFieldLevel int level) {
        this.level = level;
    }

    public boolean isDead() {
        return isDead;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public MineFieldEntity(){}

    @Ignore

    public MineFieldEntity(int timeElapsed, int minesFound, int minesToBeFound, int width, int height, int level, boolean isDead) {
        this.timeElapsed = timeElapsed;
        this.minesFound = minesFound;
        this.minesToBeFound = minesToBeFound;
        this.width = width;
        this.height = height;
        this.level = level;
        this.isDead = isDead;
        this.createdAt = new Date();
    }
}
