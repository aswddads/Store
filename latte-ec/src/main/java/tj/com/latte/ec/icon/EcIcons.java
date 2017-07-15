package tj.com.latte.ec.icon;

import com.joanzapata.iconify.Icon;

/**
 * Created by Jun on 17/7/15.
 */

public enum EcIcons implements Icon {
    test1('\ue600'),
    test2('\ue625');

    private char chararacter;

    EcIcons(char chararacter) {
        this.chararacter = chararacter;
    }

    @Override
    public String key() {
        return name().replace('_', '_');
    }

    @Override
    public char character() {
        return chararacter;
    }
}
