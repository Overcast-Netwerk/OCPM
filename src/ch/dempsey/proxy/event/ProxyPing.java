package ch.dempsey.proxy.event;

import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.proxy.ProxyPingEvent;
import com.velocitypowered.api.proxy.server.ServerPing;

import net.kyori.text.TextComponent;

public class ProxyPing {

	@Subscribe
	public void onProxyPing(ProxyPingEvent e) {
		ServerPing sp = e.getPing().asBuilder().description(TextComponent.of("")).build();
		e.setPing(sp);
	}
	
}
