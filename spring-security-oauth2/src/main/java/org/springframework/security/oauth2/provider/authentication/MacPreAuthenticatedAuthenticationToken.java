/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2015 All Rights Reserved.
 */
package org.springframework.security.oauth2.provider.authentication;

import org.springframework.security.web.authentication.preauth.PreAuthenticatedAuthenticationToken;

/**
 *
 * @author anran
 * @version $Id: MacPreAuthenticatedAuthenticationToken.java, v 0.1 2015-07-15 下午8:25 anran Exp $$
 */
public class MacPreAuthenticatedAuthenticationToken extends PreAuthenticatedAuthenticationToken {

    private final String mac;

    private final String access_token;

    private final String time_stamp;

    private final String nonce;

    public MacPreAuthenticatedAuthenticationToken(Object aPrincipal, Object aCredentials) {
        super(aPrincipal, aCredentials);
        this.mac = null;
        this.access_token = null;
        this.time_stamp = null;
        this.nonce = null;
    }

    public MacPreAuthenticatedAuthenticationToken(Object aPrincipal, Object aCredentials,
                                                  String mac, String access_token, String time_stamp,String nonce) {
        super(aPrincipal, aCredentials);
        this.mac = mac;
        this.access_token = access_token;
        this.time_stamp = time_stamp;
        this.nonce = nonce;
    }

    public String getMac() {
        return mac;
    }

    public String getAccess_token() {
        return access_token;
    }

    public String getTime_stamp() {
        return time_stamp;
    }

    public String getNonce() {
        return nonce;
    }
}
