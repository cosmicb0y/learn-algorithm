# learn-algorithm

## Baekjoon judge
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

## Samsung SW Expert Academy
-------

[5656](https://www.swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AWXRQm6qfL0DFAUo&categoryId=AWXRQm6qfL0DFAUo&categoryType=CODE) : [SW5656](SWExpertAcademy/src/SW5656.java) : 2018-09-21

- DP로 연산량 줄일 수 있을 것 같은데 영 안떠오른다.
- 일단은 완전탐색...
- 제시해준 풀이도 기괴하다.
- 풀이보고 이해하면서 일단 코드를 작성해봤다.
- 근데도 버그 쩔어서 고친다고 한시간 넘게 투자했다.
- 다시 이해해보고 한번 더 짜봐야겠다.

[5644](https://www.swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AWXRDL1aeugDFAUo&categoryId=AWXRDL1aeugDFAUo&categoryType=CODE&&&) : [SW5644](SWExpertAcademy/src/SW5644.java) : 2018-09-22

- 각 단계마다 최대값 계산해서 갱신시켰다
- 해설보니 DFS를 썼네?
- DFS, BFS 문제 좀 풀어야겠다.

[5658](https://www.swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AWXRUN9KfZ8DFAUo&categoryId=AWXRUN9KfZ8DFAUo&categoryType=CODE) : [SW5658](SWExpertAcademy/src/SW5658.java) : 2018-09-26

- 정렬
- substring이랑 hex to int 하는 법을 찾아보았다.
