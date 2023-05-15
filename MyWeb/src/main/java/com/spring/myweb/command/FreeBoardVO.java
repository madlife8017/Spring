package com.spring.myweb.command;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*
 	CREATE TABLE feeboard(
			bno INT primary key auto_increment,
		    title varchar(300) NOT null,
		    writer varchar(50) not null,
		    content varchar(3000) not null,
		    reg_date datetime default current_timestamp,
		    update_date datetime default Null
		    
		); */


@Getter
@Setter
@ToString
public class FreeBoardVO {
	
	private int bno;
	private String title;
	private String writer;
	private String content;
	private LocalDateTime regDate;
	private LocalDateTime updateDate;	


}
