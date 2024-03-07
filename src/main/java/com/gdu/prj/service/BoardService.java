package com.gdu.prj.service;

import com.gdu.prj.common.ActionForward;
import jakarta.servlet.http.HttpServletRequest;

public interface BoardService {
    ActionForward addBoard(HttpServletRequest request);
    ActionForward getBoardList(HttpServletRequest request);
    ActionForward getBoardByNo(HttpServletRequest request);

    //편집하는 뷰 의 서비스
    ActionForward editBoard(HttpServletRequest request);
    //실제로 편집하는 서비스
    ActionForward modifyBoard(HttpServletRequest request);
    ActionForward removeBoard(HttpServletRequest request);
}
