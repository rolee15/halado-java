package enums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Posta {

    private final List<PostaFiok> fiokok;
    private Map<Integer, Posta> forwardMap;

    public Posta(List<PostaFiok> fiokok) {
        this.fiokok = fiokok;
    }

    public void valogat(Level level) {
        int idx = searchStations(level.getZipCode());
        if (idx == -1) forward(level);
        Posta posta = forwardMap.get(level.getZipCode());
    }
}
