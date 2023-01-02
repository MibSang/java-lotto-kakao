package lotto.domain;

import static lotto.constant.MessageConstant.INVALID_LOTTO_SIZE;

import java.util.List;
import java.util.stream.Collectors;

public class Lotto {

    public static final int LOTTO_SIZE = 6;
    private final List<LottoNumber> lottoNumbers;

    public Lotto(List<Integer> numbers) {
        validateLottoSize(numbers);
        this.lottoNumbers = numbers.stream()
                .map(LottoNumber::new)
                .collect(Collectors.toList());
    }

    private static void validateLottoSize(List<Integer> numbers) {
        if (numbers.size() != LOTTO_SIZE) {
            throw new IllegalArgumentException(INVALID_LOTTO_SIZE);
        }
    }

    public List<LottoNumber> getNumbers() {
        return lottoNumbers;
    }
}
