package com.ssg.springboard.service;

import com.ssg.springboard.domain.Criteria;
import com.ssg.springboard.domain.ReplyVO;
import com.ssg.springboard.mappers.ReplyMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Log4j2
@RequiredArgsConstructor
@Transactional
public class ReplyServiceImpl implements ReplyService {

  private final ReplyMapper replyMapper;
//등록
  @Override
  public Long register(ReplyVO replyVO) {
    log.info(replyVO);
    replyMapper.insert(replyVO);
    return replyVO.getRno();
  }

  @Override
  public ReplyVO get(Long rno) {
    log.info(rno);
    return replyMapper.selectOne(rno);
  }


  @Override
  public boolean modify(ReplyVO replyVO) {
    log.info(replyVO);
    return replyMapper.update(replyVO) == 1;
  }


  @Override
  public boolean remove(Long rno) {
    log.info(rno);
    return replyMapper.delete(rno) == 1;
  }

  @Override
  public List<ReplyVO> getList(Criteria cri, Long bno) {
    log.info("", bno, cri);
    return replyMapper.getReplyList(cri, bno);
  }
}

