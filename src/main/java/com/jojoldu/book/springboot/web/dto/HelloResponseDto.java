package com.jojoldu.book.springboot.web.dto;//데이터를 전송하거나 전달하려는 목적

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor //선언된 모든 final 필드 생성자를 생성해줌
public class HelloResponseDto {

    private final String name;
    private final int amount;
}
