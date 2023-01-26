package com.example.demo.backend_todolist.dto;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
CREATE TABLE todolist(
id number PRIMARY KEY,
completed number(1) DEFAULT 0,
todoname VARCHAR2(100) NOT NULL);

CREATE SEQUENCE todo_id_seq
START WITH 1
INCREMENT BY 1
NOCACHE
NOCYCLE;

INSERT INTO todolist VALUES(NULL, 0, '여행');

COMMIT;

SELECT * FROM todolist;
*/


/*
 *  @Data : @Setter, @Getter, @ToString, @EqualAndHashCode, @RequestedArgusConstructor
 *  @Data는 위의 5가지를 포함한다. 5가지 모두 사용하지 않는다면 각각 사용하는것을 권장한다.
 */

@Component // 알아서 bean으로 생성
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
// @Data
public class TodoDTO {
	private int id;
	private int completed;
	private String todoname;
	
}
