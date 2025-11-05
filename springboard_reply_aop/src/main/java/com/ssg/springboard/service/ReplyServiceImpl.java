package com.ssg.springboard.service;

import com.ssg.springboard.domain.Criteria;
import com.ssg.springboard.domain.ReplyVO;
import com.ssg.springboard.mappers.ReplyMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Transactional
@RequiredArgsConstructor
@Log4j2
@Service
public class ReplyServiceImpl implements ReplyService {

    private final ReplyMapper replyMapper;

    public Long register(ReplyVO replyVO) {
        replyMapper.insert(replyVO);
        return replyVO.getRno();
    }

    public int getReplyCountOfBoard(Long bno){

        return replyMapper.getTotal(null, bno);
    }

    public ReplyVO get(Long rno) {

        return replyMapper.selectOne(rno);
    }

    public boolean modify(ReplyVO replyVO) {

        return replyMapper.updateOne(replyVO) == 1;
    }

    public boolean remove(Long rno) {
        return replyMapper.deleteOne(rno) == 1;
    }

    public java.util.List<ReplyVO> getListWithBno(Criteria cri, Long bno){
        return replyMapper.getReplyList(cri,bno);
    }

    public int getTotalWithBno(Criteria criteria, Long bno){
        return replyMapper.getTotal(criteria, bno);
    }



}
