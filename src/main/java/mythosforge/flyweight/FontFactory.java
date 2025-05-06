package mythosforge.flyweight;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class FontFactory {
    private Map<String, FontFlyweight> cache = new HashMap<>();
    public FontFlyweight getFont(String family, int size, String style) {
        String key = family + "-" + size + "-" + style;
        if (!cache.containsKey(key)) {
            cache.put(key, new Font(family, size, style));
        }
        return cache.get(key);
    }
}