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

@ExtendWith(SpringExtension.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j2
public class ReplyMapperTests {

  @Autowired(required = false)
  ReplyMapper replyMapper;



  @Test
  public void testInsert() {
      Long bno = 1525L;

    for (int i = 0; i < 20 ; i++) {
      ReplyVO replyVO = ReplyVO.builder()
              .bno(bno)
              .replyText("test reply.." + i)
              .replyer("suy"+i)
              .build();
      log.info(replyMapper.insert(replyVO));
    }


  }

  @Test
  public void testSelectOne() {

    Long rno = 5L;

    log.info(replyMapper.selectOne(rno));

  }

  @Test
  public void testUpdate() {
    ReplyVO replyVO = ReplyVO.builder()
            .rno(2L)
            .replyText("test reply..22222")
            .build();
    log.info(replyMapper.updateOne(replyVO));
  }

  @Test
  public void testDelete() {
    Long rno = 5L;
    log.info(replyMapper.deleteOne(rno));
  }

  @Test
  public void testSelectAll() {
    Criteria cri = new Criteria();
    //1 10

    replyMapper.getReplyList(cri,1526L).forEach(replyVO -> log.info(replyVO));
  }
}
