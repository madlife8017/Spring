package com.spring.myweb.command;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
 CREATE TABLE snsboard(
	bno INT PRIMARY key auto_increment,
    writer VARCHAR(50) not null,
    upload_path varchar(100) not null,
    file_location varchar(100) not null,
    file_name varchar(50) not null,
    file_real_name varchar(50) not null,
    content varchar(2000),
    reg_date datetime default current_timestamp
);

 */

@Getter
@Setter
@ToString
@NoArgsConstructor //기본생성자
@AllArgsConstructor //모든값을 받는 생성자
public class SnsBoardVO {
	
	private int bno;
	private String writer;
	private String uploadPath;
	private String fileLoca;
	private String fileName;
	private String fileRealName;
	private String content;
	private LocalDateTime regDate;

}
