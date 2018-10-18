# learn-algorithm

## Baekjoon Online Judge
--------
[1463](https://boj.kr/1463) : [BOJ1463.java](baekjoon/src/BOJ1463.java) : 2018-09-10

- DP로 풀기
- 역산으로 하면 되네
- 순서대로 할려다가 안됐음...

[11726](https://boj.kr/11726) : [BOJ11726.java](baekjoon/src/BOJ11726.java) : 2018-09-11

- DP
- 피보나치네... 30분동안 삽질함

[11727](https://boj.kr/11727) : [BOJ11727.java](baekjoon/src/BOJ11727.java) : 2018-09-12

- DP
- 피보나치에 좀 더 장난친거
- 비슷한 문제 풀어놓고 이해를 잘못해서 이상하게 접근하고 있었다

[9095](https://boj.kr/9095) : [BOJ9095.java](baekjoon/src/BOJ9095.java) : 2018-09-13

- DP
- 피보나치 활용
- 얘는 3개 전까지 다 더함
- 1, 2, 3, 4를 이용하여 수를 만든다면 4개 전까지 다 더하면 될 것 같다.

[10844](https://boj.kr/10844) : [BOJ10844.java](baekjoon/src/BOJ10844.java) : 2018-09-13

- DP
- 오버플로우 잘 처리해야함
- 프로그램 로직은 맞는데 오버플로우 때문에 40분정도 씀

[11057](https://boj.kr/11057) : [BOJ11057.java](baekjoon/src/BOJ11057.java) : 2018-09-13

- DP
- 3항 계산이 우연으로 다른 방법으로 맞아떨어져 전혀 다르게 접근(...)
- 1\*10 + 2\*9 + 3\*8 + 4\*7 + 5\*6 + 6\*5 + 7\*4 + 8\*3 + 9\*2 + 10\*1 = 220이 왜 나와가지고 ㅠㅠ
- 경우의 수를 잘 따지자

[2193](https://boj.kr/2193) : [BOJ2193.java](baekjoon/src/BOJ2193.java) : 2018-09-14

- DP
- 얘는 뭐 나누라는 소리가 없네
- 우려대로 그냥 int 쓰면 오버플로우...
- BigInteger를 썼다

[9465](https://boj.kr/9465) : [BOJ9465.java](baekjoon/src/BOJ9465.java) : 2018-09-14

- DP
- DP로 할랬는데 왜 그리디로 짜졌을까...
- 갈아엎었다
- 재귀적 관계를 잘 생각하자

[2156](https://boj.kr/9465) : [BOJ2156.java](baekjoon/src/BOJ2156.java) : 2018-09-15

- DP
- 점화식은 잘 짰는데 두 개 이상 뛰어넘어야 하는 애가 안됨
- 0항을 이전 항 중 가장 큰 걸로 해줬어야 했음
- 예제는 우연히 2항이 가장 큰값이라서 그냥 2항을 0항에 넣었었음

[1003](https://boj.kr/1003) : [BOJ1003.java](baekjoon/src/BOJ1003.java) : 2018-09-15

- DP
- 4년 전에 풀다가 실패(...)
- 그 땐 DP도 제대로 몰랐던거 같다.
- 지금 푸니 쉽게 풀었다.

[11053](https://boj.kr/11053) : [BOJ11053.java](baekjoon/src/BOJ11053.java) : 2018-09-16

- DP
- 조금만 더 해보면 이런 식의 문제는 금방 풀 것 같다.

[11055](https://boj.kr/11055) : [BOJ11055.java](baekjoon/src/BOJ11055.java) : 2018-09-16

- DP
- 11053번을 조금 더 활용
- DP 배열을 하나 더 썼다.

[11722](https://boj.kr/11722) : [BOJ11722.java](baekjoon/src/BOJ11722.java) : 2018-09-17

- DP
- 11053 활용
- 조건 하나만 반대로

[11054](https://boj.kr/11054) : [BOJ11054.java](baekjoon/src/BOJ11054.java) : 2018-09-17

- DP
- 11053 + 11722
- 생각보다 오래 걸렸다. 왜 조금 응용 시켜놓으면 잘 안보일까 ㅠㅠ

[1912](https://boj.kr/1912) : [BOJ1912.java](baekjoon/src/BOJ1912.java) : 2018-09-18

- DP
- 음수 조건이 있어서 answer 초기화를 0으로 해줘서 계속 틀렸다.

[2579](https://boj.kr/2579) : [BOJ2579.java](baekjoon/src/BOJ2579.java) : 2018-09-18

- DP
- 두번째 전꺼 가져오는걸 이상하게 해줬었다

[1699](https://boj.kr/1699) : [BOJ1699.java](baekjoon/src/BOJ1699.java) : 2018-09-19

- DP
- 생각한건 맞았는데 구현을 너무 복잡하게 했다
- 갈아엎음...

[2133](https://boj.kr/2133) : [BOJ2133.java](baekjoon/src/BOJ2133.java) : 2018-09-19

- DP
- 잘못 계산한 항이 우연찮게 또 규칙있게 만들어짐(...)

[9461](https://boj.kr/9461) : [BOJ9461.java](baekjoon/src/BOJ9461.java) : 2018-09-19

- DP
- 피보나치 활용
- BigInteger 사용

[2225](https://boj.kr/2225) : [BOJ2225.java](baekjoon/src/BOJ2225.java) : 2018-09-19

- DP
- 규칙찾기가 어려웠다
- 결국 질문 찾아봄

[2011](https://boj.kr/2011) : [BOJ2011.java](baekjoon/src/BOJ2021.java) : 2018-09-19

- DP
- 뒷자리부터 DP하면 됨
- 앞자리하면 0 때문에 자꾸 뭔가 꼬임

[11052](https://boj.kr/11052) : [BOJ11052.java](baekjoon/src/BOJ11052.java) : 2018-09-19

- DP
- 현재 최대값을 구할려는 인덱스의 반만큼까지 계산 반복

[7576](https://boj.kr/7576) : [BOJ7576.java](baekjoon/src/BOJ7576.java) : 2018-09-24

- BFS
- 시간초과 계속 나서 for문을 최대한 줄였다

[7569](https://boj.kr/7569) : [BOJ7569.java](baekjoon/src/BOJ7569.java) : 2018-09-25

- BFS
- 7576을 한 차원 더 늘린 것

[11403](https://boj.kr/11403) : [BOJ11403.java](baekjoon/src/BOJ11403.java) : 2018-09-27

- DFS
- 재귀적으로 짜는게 조금 힘들다
  
[13460](https://boj.kr/13460) : [BOJ13460.java](baekjoon/src/BOJ13460.java) : 2018-09-28

- DFS
- 코드가 너무 복잡해져서 한 번 엎었다.
- 경계값 체크를 정확하게 안해서 몇 번 틀렸다.

[14503](https://boj.kr/14503) : [BOJ14503.java](baekjoon/src/BOJ14503.java) : 2018-09-29

- 시뮬레이션
- 설마 바로 맞을까 했는데 통과...

[14888](https://boj.kr/14888) : [BOJ14888.java](baekjoon/src/BOJ14888.java) : 2018-09-29

- 완전탐색
- DFS
- 쉬운문제 같은데 이런 종류가 잘 안 풀린다. 좀 더 풀어봐야겠다.

[14889](https://boj.kr/14889) : [BOJ14889.java](baekjoon/src/BOJ14889.java) : 2018-09-30

- 완전탐색
- DFS

[2315](https://boj.kr/2315) : [BOJ2315.java](baekjoon/src/BOJ2315.java) : 2018-10-01

- DP
- 몇 년전에 수업에서 들었던 문제인데 다시 풀어봐도 어렵다.
- 보안 업체, 김치 배달, 사수아탕이 비슷한 문제라고 하니 풀어봐야겠다.

[2869](https://boj.kr/2869) : [BOJ2869.java](baekjoon/src/BOJ2869.java) : 2018-10-01

- 수학
- 이분탐색으로도 가능하다.
- 입력이 Int 범위를 넘어서서 long 사용

[14502](https://boj.kr/14502) : [BOJ14502.java](baekjoon/src/BOJ14502.java) : 2018-10-01

- 완전탐색
- DFS
- 이제 좀 풀리는 것 같다.
- 코드가 뭔가 이상하다...

[3190](https://boj.kr/3190) : [BOJ3190.java](baekjoon/src/BOJ3190.java) : 2018-10-01

- 시뮬레이션
- 꼬리를 별개로 처리해줘야했다.

[15685](https://boj.kr/15685) : [BOJ15685.java](baekjoon/src/BOJ15685.java) : 2018-10-02

- 시뮬레이션
- 그리면서 경로 저장할려다가 꼬여서 경로를 다 저장하고 그리는 것으로 갈아엎음

[2583](https://boj.kr/2583) : [BOJ2583.java](baekjoon/src/BOJ2583.java) : 2018-10-03

- DFS
- 제일 처음 시작점이 몇개가 될 수 있는가 따져주는게 조금 오래 걸렸다

[10250](https://boj.kr/10250) : [BOJ10250.java](baekjoon/src/BOJ10250.java) : 2018-10-03

- 수학
- 게시판 짤 때 페이지 번호 결정하는 로직이랑 좀 비슷하다.
- 나머지가 0일 때를 고려 안해서 몇 번 틀렸다.

[2667](https://boj.kr/2667) : [BOJ2667.java](baekjoon/src/BOJ2667.java) : 2018-10-04

- DFS
- [2583](https://boj.kr/2667)이랑 비슷하다

[15684](https://boj.kr/15684) : [BOJ15684.java](baekjoon/src/BOJ15684.java) : 2018-10-06

- 브루트 포스
- DFS
- 연산량을 줄이기 위해 각 DFS 탐색 시작 점을 전부 하지 않고 현재 높이로 초기화 해주었다.
- 좀 더 깔끔하게 짤 수 있을 것 같다.

[2206](https://boj.kr/2206) : [BOJ2206.java](baekjoon/src/BOJ2206.java) : 2018-10-07

- BFS
- BFS 한다면서 DFS로 짜고 있었다...
- 부술 때랑 아닐때 visited 배열을 따로 해줬어야 했다.

[11728](https://boj.kr/11728) : [BOJ11728.java](baekjoon/src/BOJ11728.java) : 2018-10-08

- 분할정복
- Merge Sort 할 때 배열 합치는 로직이다
- 그냥 한꺼번에 입력받아서 sort 돌려버리면 되는데 그런 라이브러리 쓰지 않고 구현했다.

[14863](https://boj.kr/14863) : [BOJ14863.java](baekjoon/src/BOJ14863.java) : 2018-10-08

- 프로그래머스 [42899](https://programmers.co.kr/learn/courses/30/lessons/42899)와 같은 문제
- DP

[11724](https://boj.kr/11724) : [BOJ11724.java](baekjoon/src/BOJ11724.java) : 2018-10-08

- DFS

[14891](https://boj.kr/14891) : [BOJ14891.java](baekjoon/src/BOJ14891.java) : 2018-10-10

- 시뮬레이션
- 돌아가는 조건이 해당 바퀴가 돌아가고 난 직후가 아니라 모든 바퀴가 돌아가기 전의 극을 보고 하는 것이였다.
- 바퀴 하나하나가 돌아가고 난 직후의 극을 보고 판단하는 걸로 착각했다.
- [SW Expert Academy 특이한 자석](https://www.swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AWIeV9sKkcoDFAVH&categoryId=AWIeV9sKkcoDFAVH&categoryType=CODE)과 똑같은 문제다.

[14499](https://boj.kr/14499) : [BOJ14499.java](baekjoon/src/BOJ14499.java) : 2018-10-11

- 시뮬레이션
- 주사위를 이차원 배열로 어떻게 해볼려다가 그냥 1차원으로 했다

[2178](https://boj.kr/2178) : [BOJ2178.java](baekjoon/src/BOJ2178.java) : 2018-10-13

- BFS

[12100](https://boj.kr/12100) : [BOJ12100.java](baekjoon/src/BOJ12100.java) : 2018-10-16

- DFS
- 브루트 포스
- 단순히 연달아 있는 애만 생각하고 멀리 떨어져있는애를 생각하지 못해서 오래걸렸다.

[14890](https://boj.kr/14890) : [BOJ14890.java](baekjoon/src/BOJ14890.java) : 2018-10-16

- 시뮬레이션
- 끝부분 처리해주는게 오래 걸렸다.

[14500](https://boj.kr/14500) : [BOJ14500.java](baekjoon/src/BOJ14500.java) : 2018-10-16

- 완전탐색
- DFS
- length가 2일때 'ㅗ' 모양 때문에 따로 처리해주었다.
- length가 4일때 순회하면서 값 세어주도록 하니 시간초과가 나서 각 단계마다 더한 값을 함수에 넘겨줬다.

[15683](https://boj.kr/15683) : [BOJ15683.java](baekjoon/src/BOJ15683.java) : 2018-10-18

- 시뮬레이션
- DFS

[15686](https://boj.kr/15686) : [BOJ15686.java](baekjoon/src/BOJ15686.java) : 2018-10-18

- DFS
- 조합

## Samsung SW Expert Academy
-------

[5656](https://www.swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AWXRQm6qfL0DFAUo&categoryId=AWXRQm6qfL0DFAUo&categoryType=CODE) : [SW5656.java](SWExpertAcademy/src/SW5656.java) : 2018-09-21

- DP로 연산량 줄일 수 있을 것 같은데 영 안떠오른다.
- 일단은 완전탐색...
- 제시해준 풀이도 기괴하다.
- 풀이보고 이해하면서 일단 코드를 작성해봤다.
- 근데도 버그 쩔어서 고친다고 한시간 넘게 투자했다.
- 다시 이해해보고 한번 더 짜봐야겠다.

[5644](https://www.swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AWXRDL1aeugDFAUo&categoryId=AWXRDL1aeugDFAUo&categoryType=CODE&&&) : [SW5644.java](SWExpertAcademy/src/SW5644.java) : 2018-09-22

- 각 단계마다 최대값 계산해서 갱신시켰다
- 해설보니 DFS를 썼네?
- DFS, BFS 문제 좀 풀어야겠다.

[5658](https://www.swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AWXRUN9KfZ8DFAUo&categoryId=AWXRUN9KfZ8DFAUo&categoryType=CODE) : [SW5658.java](SWExpertAcademy/src/SW5658.java) : 2018-09-26

- 정렬
- substring이랑 hex to int 하는 법을 찾아보았다.

[4012](https://www.swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AWIeUtVakTMDFAVH&categoryId=AWIeUtVakTMDFAVH&categoryType=CODE) : [SW4012.java](SWExpertAcademy/src/SW4012.java) : 2018-09-30

- 완전탐색
- DFS

[4013](https://www.swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AWIeV9sKkcoDFAVH&categoryId=AWIeV9sKkcoDFAVH&categoryType=CODE) : [SW4013.java](SWExpertAcademy/src/SW4013.java) : 2018-10-10

- 시뮬레이션

## Programmers
------

[43105](https://programmers.co.kr/learn/courses/30/lessons/43105) : [PROG43105.java](Programmers/src/PROG43105.java) : 2018-10-04

- DP

[42897](https://programmers.co.kr/learn/courses/30/lessons/42897) : [PROG42897.java](Programmers/src/PROG42897.java) : 2018-10-05

- DP
- 마지막에 처음 집이랑 마지막 집 둘 다 훔쳤는지 따져줄려다가 코드가 너무 복잡해졌다
- 그냥 첫 집 훔쳤을때랑 안 훔쳤을 때 DP 두번 돌렸다.
- 근데 2차원 배열로 하니깐 시간초과 뜨고 1차원 배열 2개 쓰니깐 통과한다. 뭐지?

[12952](https://programmers.co.kr/learn/courses/30/lessons/12952) : [PROG12952.java](Programmers/src/PROG12952.java) : 2018-10-07

- DFS
- N-Queen
- BFS로 할려다가 갈아엎었다.
- 아직 DFS랑 BFS 써야하는 상황 잘 구분을 못하는 듯 하다.
- 프로그래머스에 직접 코딩했다. 디버깅하기가 힘들다.

[42899](https://programmers.co.kr/learn/courses/30/lessons/42899) : [PROG42899.java](Programmers/src/PROG42899.java) : 2018-10-08

- DP
- 또 그리디처럼 풀려고 했다.
- 배열 크기 잘못 줘서 계속 틀렸다...
