package com.zia.freshdocs.preference;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.zia.freshdocs.model.NodeRef;

public class CMISHost implements Serializable
{
	private static final long serialVersionUID = -7004962852122155333L;

	private String _hostname;
	private String _username;
	private String _password;
	private String _webappRoot = "/alfresco";
	private int _port = 80;
	private boolean _SSL = false;
	private boolean _showHidden = true;
	private Set<NodeRef> _favorites;

	public CMISHost()
	{
		_favorites = new HashSet<NodeRef>();		
	}
	
	public boolean isShowHidden() {
		return _showHidden;
	}

	public void setShowHidden(boolean showHidden) {
		this._showHidden = showHidden;
	}

	public String getHostname() {
		return _hostname;
	}

	public void setHostname(String hostname) {
		this._hostname = hostname;
	}

	public String getUsername() {
		return _username;
	}

	public void setUsername(String username) {
		this._username = username;
	}

	public String getPassword() {
		return _password;
	}

	public void setPassword(String password) {
		this._password = password;
	}

	public int getPort() {
		return _port;
	}

	public void setPort(int port) {
		this._port = port;
	}

	public String getWebappRoot()
	{
		return _webappRoot;
	}

	public void setWebappRoot(String webappRoot)
	{
		this._webappRoot = webappRoot;
	}

	public boolean isSSL()
	{
		return _SSL;
	}

	public void setSSL(boolean sSL)
	{
		_SSL = sSL;
	}

	public Set<NodeRef> getFavorites()
	{
		return _favorites;
	}

	public void setFavorites(Set<NodeRef> favorites)
	{
		if(favorites != null)
		{
			this._favorites = favorites;
		}
	}
	
	public void addFavorite(NodeRef ref)
	{
		_favorites.add(ref);
	}
}
