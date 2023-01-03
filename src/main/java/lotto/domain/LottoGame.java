package lotto.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LottoGame {

    private final List<Lotto> lottos;
    private final WinningLotto winningLotto;

    private static final List<Integer> fullNumbers = IntStream.range(1, 46)
            .boxed()
            .collect(Collectors.toList());

    public LottoGame(int lottoCount, List<Integer> winningNumber, int bonusNumber) {
        lottos = new ArrayList<>();
        IntStream.range(0, lottoCount).forEach((i) -> lottos.add(createLotto()));
        winningLotto = new WinningLotto(winningNumber, bonusNumber);
    }

    public Lotto createLotto() {
        Collections.shuffle(fullNumbers);
        return new Lotto(fullNumbers.subList(0, 6));
    }

    public List<Lotto> getLottos() {
        return lottos;
    }
}
