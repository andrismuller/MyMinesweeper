package hu.armando.muller.myminesweeper.db.entity;

import androidx.annotation.IntRange;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Ignore;
import androidx.room.Index;
import androidx.room.PrimaryKey;

import hu.armando.muller.myminesweeper.model.MineField;
import hu.armando.muller.myminesweeper.model.MineFieldBlock;

@Entity(tableName = "mineFieldBlock",
        foreignKeys = {
            @ForeignKey(entity = MineField.class,
            parentColumns = "id",
            childColumns = "mineFieldId",
            onDelete = ForeignKey.CASCADE)
        },
        indices = {
            @Index(value = "mineFieldId"),
            @Index(value = {"mineFieldId", "rowId"})
        })
public class MineFieldBlockEntity implements MineFieldBlock {

    @PrimaryKey(autoGenerate = true)
    private int id;
    private int rowId;
    private int columnId;
    private boolean isDiscovered;
    private int minesAround;
    private boolean isMine;
    private int mineFieldId;


    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRowId() {
        return rowId;
    }

    public void setRowId(int rowId) {
        this.rowId = rowId;
    }

    public int getColumnId() {
        return columnId;
    }

    public void setColumnId(int columnId) {
        this.columnId = columnId;
    }

    public boolean isDiscovered() {
        return isDiscovered;
    }

    public void setDiscovered(boolean discovered) {
        this.isDiscovered = discovered;
    }

    public int getMinesAround() {
        return minesAround;
    }

    public void setMinesAround(@IntRange(from=0, to=8) int minesAround) {
        this.minesAround = minesAround;
    }

    public boolean isMine() {
        return isMine;
    }

    public void setMine(boolean mine) {
        isMine = mine;
    }

    public int getMineFieldId() {
        return mineFieldId;
    }

    public void setMineFieldId(int mineFieldId) {
        this.mineFieldId = mineFieldId;
    }

    public MineFieldBlockEntity() {
    }

    @Ignore
    public MineFieldBlockEntity(int id, int rowId, int columnId, boolean isDiscovered, @IntRange(from=-1, to=8) int mineAround, boolean isMine, int mineFieldId) {
        this.id = id;
        this.rowId = rowId;
        this.columnId = columnId;
        this.isDiscovered = isDiscovered;
        this.minesAround = mineAround;
        this.isMine = isMine;
        this.mineFieldId = mineFieldId;
    }
}
