package hu.armando.muller.myminesweeper.db.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

import hu.armando.muller.myminesweeper.db.entity.MineFieldBlockEntity;

@Dao
public interface MineFieldBlockDao {
    @Query("select * from mineFieldBlock where id = :mineFieldId")
    LiveData<MineFieldBlockEntity> loadMineFieldBlocks(int mineFieldId);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(MineFieldBlockEntity mineFieldBlockEntity);

    @Query("select * from mineFieldBlock where isDiscovered = :isDiscovered")
    LiveData<List<MineFieldBlockEntity>> loadMineFields(boolean isDiscovered);
}
