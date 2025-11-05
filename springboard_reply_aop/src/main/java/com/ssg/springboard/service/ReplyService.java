package com.ssg.springboard.service;

import com.ssg.springboard.domain.Criteria;
import com.ssg.springboard.domain.ReplyVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public interface ReplyService {
    public Long register(ReplyVO replyVO);

    public int getReplyCountOfBoard(Long bno);

    public ReplyVO get(Long rno);

    public boolean modify(ReplyVO replyVO);

    public boolean remove(Long rno);

    public List<ReplyVO> getListWithBno(Criteria cri, Long bno);

    public int getTotalWithBno(Criteria criteria, Long bno);

}
