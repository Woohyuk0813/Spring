package com.ssg.springboard.controller;

import com.ssg.springboard.domain.ReplyVO;
import com.ssg.springboard.domain.Criteria;
import com.ssg.springboard.service.ReplyService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Log4j2
@RequiredArgsConstructor
@RequestMapping("/reply")
public class ReplyController {

    private final ReplyService replyService;


    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody ReplyVO replyVO) {
        log.info("댓글 등록 요청: {}", replyVO);

        replyService.register(replyVO);
        return new ResponseEntity<>("댓글이 등록되었습니다", HttpStatus.OK);
    }


    @GetMapping("/{rno}")
    public ResponseEntity<ReplyVO> get(@PathVariable("rno") Long rno) {
        log.info("댓글 조회 요청 rno: {}", rno);

        ReplyVO vo = replyService.get(rno);
        return new ResponseEntity<>(vo, HttpStatus.OK);
    }


    @PutMapping("/{rno}")
    public ResponseEntity<String> modify(@PathVariable("rno") Long rno,
                                         @RequestBody ReplyVO replyVO) {
        log.info("댓글 수정 요청 rno: {}", rno);

        replyVO.setRno(rno);
        replyService.modify(replyVO);

        return new ResponseEntity<>("댓글이 수정되었습니다", HttpStatus.OK);
    }


    @DeleteMapping("/{rno}")
    public ResponseEntity<String> remove(@PathVariable("rno") Long rno) {
        log.info("댓글 삭제 요청 rno: {}", rno);

        replyService.remove(rno);
        return new ResponseEntity<>("댓글이 삭제되었습니다", HttpStatus.OK);
    }
}
