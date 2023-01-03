package lotto;

import java.util.Arrays;

public enum LottoGradeEnum {

    FIRST(6, 2_000_000_000),
    SECOND(5, 300_000_000),
    THIRD(5, 1_500_000),
    FOURTH(4, 50_000),
    FIFTH(3, 5000),
    NONE_GRADE(0, 0);


    private final int matchCount;
    private final int price;

    LottoGradeEnum(int matchCount, int price) {
        this.matchCount = matchCount;
        this.price = price;
    }

    public static LottoGradeEnum getGrade(int matchCount, boolean isMatchBonus) {
        if (matchCount == SECOND.matchCount && isMatchBonus) {
            return SECOND;
        }
        return Arrays.stream(LottoGradeEnum.values())
                .filter((lottoGrade) -> lottoGrade.matchCount == matchCount)
                .findFirst()
                .orElse(NONE_GRADE);
    }
}
