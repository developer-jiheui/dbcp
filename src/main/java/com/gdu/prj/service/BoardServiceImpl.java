package com.gdu.prj.service;

import com.gdu.prj.common.ActionForward;
import com.gdu.prj.dao.BoardDao;
import com.gdu.prj.dao.BoardDaoImpl;
import jakarta.servlet.http.HttpServletRequest;
/*
* View - Controller -Service - Dao - DB
* */
public class BoardServiceImpl implements BoardService{

    //Service Calls Dao
    private BoardDao boardDao = new BoardDaoImpl();
    @Override
    public ActionForward addBoard(HttpServletRequest request) {
        return null;
    }

    @Override
    public ActionForward getBoardList(HttpServletRequest request) {
        return null;
    }

    @Override
    public ActionForward getBoardByNo(HttpServletRequest request) {
        return null;
    }

    @Override
    public ActionForward editBoard(HttpServletRequest request) {
        return null;
    }

    @Override
    public ActionForward modifyBoard(HttpServletRequest request) {
        return null;
    }

    @Override
    public ActionForward removeBoard(HttpServletRequest request) {
        return null;
    }
}
