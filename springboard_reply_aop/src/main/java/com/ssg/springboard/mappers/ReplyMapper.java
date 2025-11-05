package com.ssg.springboard.mappers;

import com.ssg.springboard.domain.Criteria;
import com.ssg.springboard.domain.ReplyVO;
import org.apache.ibatis.annotations.Param;

public interface ReplyMapper {

    Long insert(ReplyVO replyVO);

    ReplyVO selectOne(Long rno);

    int deleteOne(Long rno);

    int updateOne(ReplyVO replyVO);

    java.util.List<ReplyVO> getReplyList(@Param("cri") Criteria cri, @Param("bno") Long bno);

    int getTotal(@Param("cri") Criteria cri, @Param("bno") Long bno);
}
