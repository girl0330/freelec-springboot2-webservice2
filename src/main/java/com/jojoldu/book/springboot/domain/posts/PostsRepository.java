//Dao라고 불리는 DB 접근자 jpa에선 인터페이스로 생성
//이 인터페이스를 통해 Posts 엔티티와 관련된 CRUD(Create, Read, Update, Delete) 작업을 수행

package com.jojoldu.book.springboot.domain.posts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostsRepository extends JpaRepository<Posts, Long> { //<Entity 클래스, PK타입>을 상속하면 기복적인 CRUD 메소드가 자동으로 생성됨
//desc 내림차순/ asc 오름차순
    @Query("SELECT p FROM Posts p ORDER BY p.id DESC")
    List<Posts> findAllDesc();
}
