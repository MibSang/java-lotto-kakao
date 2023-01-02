package lotto.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import java.util.List;
import org.junit.jupiter.api.Test;

public class WinningLottoTest {

    @Test
    void 당첨로또를_생성할_수_있다() {
        assertDoesNotThrow(() -> new WinningLotto(List.of(1, 2, 3, 4, 5, 6), 7));
    }

    @Test
    void 당첨로또는_내부적으로_로또_객체를_가지고_있다() {
        WinningLotto winningLotto = new WinningLotto(List.of(1, 2, 3, 4, 5, 6), 7);
        assertThat(winningLotto.getLotto()).isInstanceOf(Lotto.class);
    }

    @Test
    void 당첨로또는_LottoNumber_객체로_보너스_숫자를_가진다() {
        WinningLotto winningLotto = new WinningLotto(List.of(1, 2, 3, 4, 5, 6), 40);
        assertThat(winningLotto.getBonusNumber())
                .isEqualTo(new LottoNumber(40))
                .isInstanceOf(LottoNumber.class);
    }
}
