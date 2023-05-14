package com.spring.db.model;

import org.springframework.web.bind.annotation.PostMapping;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
 * create table scores(

	stu_id int primary key,
    stu_name varchar(30) not null,
    kor int default 0,
    eng int default 0,
    math int default 0,
    total int default 0,
	average decimal(5,2)


);
 */

@Getter @Setter @ToString
@AllArgsConstructor
@NoArgsConstructor

public class ScoreVO {
	
	private int stuId;
	private String stuName;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double average;
	

	//총점, 평균을 구하는 메서드
	public void calcData() {
		
		this.total = this.kor + this.eng + this.math;
		this.average = Math.round((this.total)/3.0*100)/100.0;
		
	}
	//점수 등록요청을 처리할 메서드
	@PostMapping("/register")
	public String register(ScoreVO vo) {
		System.out.println("/score/register : Post");
		System.out.println("vo: " +vo);
		
		return "score/write-result";
		
	}
	
}
