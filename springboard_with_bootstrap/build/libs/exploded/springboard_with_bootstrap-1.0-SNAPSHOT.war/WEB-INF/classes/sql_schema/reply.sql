use root;

create table reply(
    rno int auto_increment primary key, # 댓글 식별자
    bno int not null ,  #원본글 식별 번호
    replyText varchar(2000) not null,
    replyer varchar(100)    not null,
    regDate timestamp default current_timestamp() null,
    updateDate timestamp default current_timestamp() null,
    constraint fk_reply_board foreign key (bno) references board(bno)
);