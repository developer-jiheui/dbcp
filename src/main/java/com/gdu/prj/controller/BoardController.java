package com.gdu.prj.controller;

import com.gdu.prj.service.BoardService;
import com.gdu.prj.service.BoardServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/*
* View - Controller -Service - Dao - DB
* */

@WebServlet(name = "BoardController", value = "*.brd")
public class BoardController extends HttpServlet {
    //Controller calls Service(Model)

    private BoardService boardService = new BoardServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
