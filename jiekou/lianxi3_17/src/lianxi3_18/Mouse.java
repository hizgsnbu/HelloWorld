package lianxi3_18;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Mouse implements USB{
    @Override
    public void open() {
        System.out.println("鼠标启动了");
    }

    @Override
    public void close() {
        System.out.println("鼠标关闭了");
    }
}
