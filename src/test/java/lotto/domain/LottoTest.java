package lotto.domain;

import java.util.List;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class LottoTest {
    @Test
    void 리스트를_넣어서_로또를_생성할_수_있다() {
        assertDoesNotThrow(() -> new Lotto(List.of(1, 2, 3, 4, 5, 6)));
    }

    @Test
    void 숫자_리스트_크기가_6개가_아니면_예외가_발생한다() {
        assertThatThrownBy(() -> new Lotto(List.of(1, 2, 3)))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 로또에_저장되는_숫자는_LottoNumber_객체이다() {
        Lotto lotto = new Lotto(List.of(1, 2, 3, 4, 5, 6));
        assertThat(lotto.getNumbers().get(0)).isInstanceOf(LottoNumber.class);
    }
}
