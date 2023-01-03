package lotto.domain;

import static lotto.constant.MessageConstant.INVALID_DUPLICATED_LOTTO_NUMBER;

import java.util.List;

public class WinningLotto {
    private final Lotto lotto;
    private final LottoNumber bonusNumber;

    public WinningLotto(List<Integer> numbers, int bonusNumber) {
        validateDuplicated(numbers, bonusNumber);
        this.lotto = new Lotto(numbers);
        this.bonusNumber = LottoNumber.from(bonusNumber);
    }

    private void validateDuplicated(List<Integer> numbers, int bonusNumber) {
        if (numbers.contains(bonusNumber)) {
            throw new IllegalArgumentException(INVALID_DUPLICATED_LOTTO_NUMBER);
        }
    }

    public Lotto getLotto() {
        return lotto;
    }

    public LottoNumber getBonusNumber() {
        return bonusNumber;
    }
}
