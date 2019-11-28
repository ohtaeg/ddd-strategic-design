# 키친포스

## 요구 사항

- 치킨집 포스 프로그램을 구현 한다.

- 메뉴
    - [ ] 메뉴는 메뉴 번호, 메뉴명, 금액, 메뉴 상품들로 구성 되어 있다.
    - [ ] 하나의 메뉴는 여러 메뉴 상품들을 가질 수 있다.
    - [ ] 메뉴를 생성할 수 있다.
        - [ ] 메뉴의 금액은 없어선 안된다.
        - [ ] 메뉴의 금액은 0원 이하 일 수 없다.
        - [ ] 메뉴는 메뉴 그룹에 속해 있어야 한다. 
        - [ ] 존재하는 메뉴 상품에 대해서만 메뉴를 생성할 수 있다.
        - [ ] 메뉴 상품의 총 금액은 (상품의 금액 * 상품의 갯수) 이다.
        - [ ] 메뉴 상품의 합계 금액은 메뉴 금액 보다 클 수 없다.
        - [ ] 메뉴가 생성되면 메뉴 번호가 생성 된다.
        - [ ] 생성된 메뉴 번호로 메뉴 상품들도 같이 생성 된다.
    - [ ] 메뉴들의 목록을 조회 할 수 있다.
        - [ ] 각 메뉴의 메뉴 상품들을 조회할 수 있다.
        
- 메뉴 그룹
    - [ ] 메뉴 그룹은 메뉴 그룹 번호와 메뉴 그룹명으로 구성 되어 있다.
    - [ ] 메뉴 그룹을 생성할 수 있다.
    - [ ] 메뉴 그룹들을 조회할 수 있다.

- 메뉴 상품
    - [ ] 메뉴 상품은 메뉴 번호, 상품 번호, 수량을 가진다.
    - [ ] 하나의 메뉴 상품은 여러 메뉴에 포함 될 수 있다.
  
- 상품
    - [ ] 상품은 상품 번호, 상품 명, 상품 금액으로 구성 되어 있다.
    - [ ] 상품을 생성할 수 있다.
        - [ ] 상품의 금액은 없어선 안된다.
        - [ ] 상품의 금액은 0원 이하 일 수 없다. 
    - [ ] 상품 목록을 조회 할 수 있다.
    
- 주문 
    - [ ] 주문은 주문 번호, 주문 테이블 번호, 주문 상태, 주문 시간, 주문 항목으로 구성 되어 있다.
    - [ ] 주문은 여러 주문 항목을 가질 수 있다.
    - [ ] 주문을 생성할 수 있다.
        - [ ] 주문 항목은 없어선 안된다.
        - [ ] 존재하는 주문 테이블에 대해서만 주문을 생성할 수 있다.
        - [ ] 만약 주문한 테이블의 테이블 그룹이 존재하면 해당 테이블 그룹에 속해있는 주문 테이블들 중에서
              가장 먼저 주문된 주문 테이블을 우선시한다. 
        - [ ] 주문 시간은 현재 주문한 시간을 기준으로 한다.
        - [ ] 주문 상태는 요리중인 상태로 변경 된다.
        - [ ] 주문이 생성되면 주문 번호가 생성 된다.
        - [ ] 생성된 주문 번호로 주문 항목들도 같이 생성 된다.
    - [ ] 주문 목록을 조회 할 수 있다.
        - [ ] 각 주문의 주문 항목들을 조회 할 수 있다.
    - [ ] 주문 상태를 변경할 수 있다.
        - [ ] 이미 주문이 생성되어 있어야 한다.
        - [ ] 주문 상태가 완료일 경우 변경할 수 없다.
 
- 주문 항목
    - [ ] 주문 항목은 주문 항목 번호, 주문 번호, 메뉴 번호, 메뉴 갯수로 구성 되어 있다.
    
- 테이블 그룹
    - [ ] 테이블 그룹은 테이블 번호, 주문 테이블로 구성 되어 있다.
    - [ ] 테이블 그룹은 여러 주문 테이블을 가질 수 있다.
    - [ ] 테이블 그룹을 생성할 수 있다.
        - [ ] 주문 테이블이 없어선 안된다.
        - [ ] 주문 테이블의 갯수가 2개 미만이면 안된다.
        - [ ] 존재하는 주문 테이블에 대해서만 테이블 그룹을 생성할 수 있다.
        - [ ] 테이블 그룹을 생성하려는 주문 테이블은 테이블 그룹에 속한 상태면 안된다.
        - [ ] 테이블 그룹 생성시 현재 생성 시간을 기준으로 한다.
        - [ ] 테이블 그룹 생성시 테이블 그룹 번호가 생성된다.
        - [ ] 생성된 테이블 그룹 번호로 주문 테이블도 같이 생성 된다.
    - [ ] 테이블 그룹에 속한 주문 테이블들의 테이블 그룹을 삭제할 수 있다.
        - [ ] 해당 테이블 그룹에 속한 주문 테이블들이 존재 해야 한다.
        - [ ] 해당 테이블 그룹에 속해있는 주문 테이블들 중에서 
              가장 먼저 주문된 주문 테이블의 주문 상태가 요리중이거나 식사중일 경우 삭제 할 수 없다.
        
- 주문 테이블
    - [ ] 주문 테이블은, 주문 테이블 번호, 테이블 그룹 번호, 고객 인원 수, 테이블 이용 여부를 가지고 있다.
    - [ ] 주문 테이블을 생성할 수 있다.
    - [ ] 주문 테이블 목록을 조회할 수 있다.
    - [ ] 주문 테이블의 테이블 이용 여부를 변경할 수 있다.
        - [ ] 해당 주문 테이블이 존재 해야 한다.
        - [ ] 해당 주문 테이블은 테이블 그룹에 속한 상태면 안된다.
        - [ ] 해당 주문 테이블의 주문 상태가 요리중이거나 식사중일 경우 변경 할 수 없다.
    - [ ] 주문 테이블의 고객 인원 수를 변경할 수 있다.
        - [ ] 변경하려는 주문 테이블의 고객 인원 숫자는 1명 이상 있어야 한다.
        - [ ] 해당 주문 테이블이 존재 해야 한다.
        - [ ] 해당 주문 테이블을 고객이 사용하고 있어야 한다.
    
- 주문 상태
    - [ ] 요리중, 식사중, 완료 총 3개의 상태를 가진다.

## 용어 사전

| 한글명 | 영문명 | 설명 |
| --- | --- | --- |

## 모델링

- 