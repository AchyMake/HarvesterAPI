Check Repository = https://jitpack.io/#AchyMake/HarvesterAPI
```xml
<repositories>
    <repositories>
        <repository>
            <id>jitpack.io</id>
            <url>https://jitpack.io</url>
        </repository>
    </repositories>
</repositories>

<dependencies>
    <dependency>
        <groupId>com.github.AchyMake</groupId>
        <artifactId>HarvesterAPI</artifactId>
        <version>LATEST</version>
        <scope>provided</scope>
    </dependency>
</dependencies>
```
Example

```java
package org.example.yourplugin;

import org.achymake.harvester.events.ReplantEvent;
import org.bukkit.Chunk;
import org.bukkit.OfflinePlayer;
import org.bukkit.plugin.java.JavaPlugin;

public class Replant implements Listener {
    private YourPlugin getInstance() {
        return YourPlugin.getInstance();
    }
    private PluginManager getPluginManager() {
        return getInstance().getPluginManager();
    }
    public Replant() {
        getPluginManager().registerEvents(this, getInstance());
    }
    @EventHandler(priority = EventPriority.NORMAL)
    public void onReplant(ReplantEvent event) {
        var player = event.getPlayer();
        var block = event.getBlock();
        //cancel event if you want
    }
}
```