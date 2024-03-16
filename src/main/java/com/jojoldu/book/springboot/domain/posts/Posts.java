package com.jojoldu.book.springboot.domain.posts;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity //테이블과 링크될 클래스임
public class Posts extends BaseTimeEntity{

    @Id//PK필드를 나타냄
    //@GeneratedValue 생성 규칙을 나타냄
    @GeneratedValue(strategy = GenerationType.IDENTITY) //GenerationType.IDENTITY는 데이터베이스의 자동 증가(auto-increment)같은 역할
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder// 생성자 대산 사용해 생성 시점에 값을 채워주는 역할
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}