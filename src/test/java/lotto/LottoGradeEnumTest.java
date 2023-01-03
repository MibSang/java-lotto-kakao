package lotto;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class LottoGradeEnumTest {

    @Test
    void 로또의_일치하는_갯수와_보너스_일치_여부를_보내면_등수가_반환된다() {
        assertThat(LottoGradeEnum.getGrade(6, false))
                .isSameAs(LottoGradeEnum.FIRST);
    }

    @Test
    void 이등이_반환된다() {
        assertThat(LottoGradeEnum.getGrade(5, true))
                .isSameAs(LottoGradeEnum.SECOND);
    }
}
