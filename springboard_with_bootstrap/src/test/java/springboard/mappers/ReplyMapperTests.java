package springboard.mappers;


import com.ssg.springboard.domain.BoardVO;
import com.ssg.springboard.domain.Criteria;
import com.ssg.springboard.domain.ReplyVO;
import com.ssg.springboard.mappers.BoardMapper;
import com.ssg.springboard.mappers.ReplyMapper;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

@ExtendWith(SpringExtension.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j2
public class ReplyMapperTests {

    @Autowired(required = false)
    ReplyMapper replyMapper;

    @Test
    public void testInsert() {
        Long bno = 30L;
        for (int i = 0; i < 20; i++) {
            ReplyVO replyVO = ReplyVO.builder()
                    .bno(bno)
                    .replyText("test reply.." + i)
                    .replyer("suy" + 1)
                    .build();
            log.info(replyMapper.insert(replyVO));
        }
    }

    @Test
    public void testselectOne() {
        Long rno = 9L;

        log.info(replyMapper.selectOne(rno));
    }

    @Test
    public void testUpdate() {
        ReplyVO replyVO = new ReplyVO();
        replyVO.setRno(9L);
        replyVO.setReplyText("Updated ReplyText");
        Long updateCount = replyMapper.update(replyVO);

        log.info(updateCount);
    }


    @Test
    public void testDelete() {
        Long rno = 9L;
        Long deletedCount = replyMapper.delete(rno);

        log.info(deletedCount);
    }

    @Test
    public void testSelectAll() {
        Criteria cri = new Criteria();
        //1 10
       replyMapper.getReplyList(cri,10L).forEach(replyVO -> log.info(replyVO));

    }
}

