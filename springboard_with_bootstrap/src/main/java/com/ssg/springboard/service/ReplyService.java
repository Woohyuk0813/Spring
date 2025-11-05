package com.ssg.springboard.service;

import com.ssg.springboard.domain.Criteria;
import com.ssg.springboard.domain.ReplyVO;

import java.util.List;

public interface ReplyService {

    Long register(ReplyVO replyVO);
    ReplyVO get(Long rno);
    boolean modify(ReplyVO replyVO);
    boolean remove(Long rno);
    List<ReplyVO> getList(Criteria cri, Long bno);
}
