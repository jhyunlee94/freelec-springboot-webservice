package com.jojoldu.book.springboot.web;

import com.jojoldu.book.springboot.web.dto.HelloResponseDto;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {

    @Test
    public void 롬복_기능_테스트(){
        // given
        String name = "test";
        int amount = 1000;

        // when
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        //then
        // assertThat : 테스트 검증 라이브러리의 검증 메소드, 대상을 인자로 받음, 메소드 체이닝 지원
        // isEqualTo : assertj의 동등 비교 메소드입니다, assertThat 값과 isEqualTo의 값을 비교해서 같을 때만 성공
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
