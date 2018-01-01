class SumDivisor {
    public int sumDivisor(int n) {

        int result = n;
        //for (int i = 1; i<n -1; i++)
        for (int i = 1; i < n/2; i++) {//이거만 돌려도 되네
            if (n % i == 0) {
                result += i;
            }
        }
        return result;
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        SumDivisor c = new SumDivisor();
        System.out.println(c.sumDivisor(12));
    }
}
