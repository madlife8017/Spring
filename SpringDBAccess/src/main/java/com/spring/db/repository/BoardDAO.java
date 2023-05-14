package com.spring.db.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.db.common.BoardMapper;
import com.spring.db.common.ScoreMapper;
import com.spring.db.model.BoardVO;


@Repository
public class BoardDAO implements IBoardDAO {

	/*
	 create table jdbc_board(
	board_no INT PRIMARY KEY AUTO_INCREMENT,
	writer VARCHAR(30) NOT NULL,
	title VARCHAR(100) NOT NULL,
	content VARCHAR(2000),
	reg_date DATETIME DEFAULT current_timestamp
	);
	 * */

	@Autowired
	private JdbcTemplate template;


	@Override
	public void insertArticle(BoardVO vo) {
		
		String sql = "INSERT INTO jdbc_board(writer,title,content) VALUES(?,?,?)";
		template.update(sql,vo.getWriter(),vo.getTitle(),vo.getContent());
	}

	@Override
	public List<BoardVO> getArticles() {
		String sql ="SELECT * FROM jdbc_board ORDER BY board_no ASC";
		return template.query(sql, new BoardMapper());
	}

	@Override
	public BoardVO getArticle(int bno) {
		String sql = "SELECT * FROM jdbc_board  WHERE board_no=?";
		return template.queryForObject(sql, new BoardMapper(), bno);	
	}

	@Override
	public void deleteArticle(int bno) {
		String sql ="DELETE FROM jdbc_board WHERE board_no = ?";
		template.update(sql,bno);

	}

	@Override
	public void updateArticle(BoardVO vo) {
		String sql = "UPDATE jdbc_board SET writer= ? , "
				+ "title= ?, content = ? WHERE board_no = ? ";
		template.update(sql,vo.getWriter(),vo.getTitle(),vo.getContent(),vo.getBoardNo());

	}

}
