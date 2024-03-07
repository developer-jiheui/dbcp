package com.gdu.prj.dao;

import com.gdu.prj.dto.BoardDto;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public interface BoardDao {
    int insertBoard(BoardDto board);
    int updateBoard(BoardDto board);
    int deleteBoard(int board_no);
    List<BoardDto> selectBoardList(Map<String, Objects> map);
    int getBoardCount();
    BoardDto selectBoardByNo(int board_no);
    void close();
}
