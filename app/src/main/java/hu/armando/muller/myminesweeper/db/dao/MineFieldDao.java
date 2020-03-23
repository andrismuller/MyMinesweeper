package hu.armando.muller.myminesweeper.db.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

import hu.armando.muller.myminesweeper.db.entity.MineFieldEntity;

@Dao
public interface MineFieldDao {
    @Query("select * from mineField where id = :mineFieldId")
    LiveData<MineFieldEntity> loadMineField(int mineFieldId);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(MineFieldEntity mineFieldEntity);

    @Query("select * from mineField")
    LiveData<List<MineFieldEntity>> loadAllMineFields();

    @Query("select * from mineField where isDead = :isDead")
    LiveData<List<MineFieldEntity>> loadMineFields(boolean isDead);

   // @Query("select * from mineField where isDead = 1 or minesFound = minesToBeFound group by level, isDead")

}
