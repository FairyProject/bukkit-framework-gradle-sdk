package org.imanity.sdk;

import org.imanity.framework.Cacheable;
import org.imanity.framework.bukkit.plugin.ImanityPlugin;
import org.imanity.framework.plugin.Plugin;
import org.imanity.framework.plugin.PluginType;

import java.lang.reflect.Method;

@Plugin(
        name = "Framework-Gradle-SDK",
        version = "1.0.0",

        type = PluginType.BUKKIT
)
public class SdkPlugin extends ImanityPlugin {

    @Override
    public void postEnable() {
        for (Method method : this.getClass().getDeclaredMethods()) {
            System.out.println(method);
        }

        System.out.println(this.cache());
        System.out.println(this.cache());
    }

    @Cacheable(key = "'hi'")
    public double cache() {
        return Math.random();
    }

}
