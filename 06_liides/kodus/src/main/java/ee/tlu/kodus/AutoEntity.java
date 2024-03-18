package ee.tlu.kodus;

import lombok.Getter;

@Getter
public class AutoEntity {
    String mudel;
    int kw;
    float mootoriSuurus;
    String mootoriTyyp;

    public AutoEntity(String mudel, int kw, float mootoriSuurus, String mootoriTyyp) {
        this.mudel = mudel;
        this.kw = kw;
        this.mootoriSuurus = mootoriSuurus;
        this.mootoriTyyp = mootoriTyyp;
    }
}
