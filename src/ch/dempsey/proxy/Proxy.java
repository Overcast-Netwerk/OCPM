package ch.dempsey.proxy;

import org.slf4j.Logger;

import com.google.inject.Inject;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent;
import com.velocitypowered.api.plugin.Plugin;
import com.velocitypowered.api.proxy.ProxyServer;

import ch.dempsey.proxy.event.ProxyPing;
import ch.dempsey.proxy.util.MotdCache;

@Plugin(id = "proxymanager", name = "Proxy Manager", version = "1.0", description = "Proxy Manager", authors = "Dempsey")
public class Proxy {
	
	public static ProxyServer srv;
	public static Logger log;
	
	@Inject
	public Proxy(ProxyServer server, Logger logger) {
		srv = server;
		log = logger;
	}
	
	@Subscribe
	public void onProxyInitialize(ProxyInitializeEvent e) {
		srv.getEventManager().register(this, new ProxyPing());
		MotdCache.add("§eIn aanbouw \n §cOvercast Netwerk");
		MotdCache.add("§eOnderweg \n §cOvercast Netwerk");
	}
	
	
}
