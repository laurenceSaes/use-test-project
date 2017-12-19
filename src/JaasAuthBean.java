/* Copyright (c) 2001-2017, The HSQL Development Group
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice, this
 * list of conditions and the following disclaimer.
 *
 * Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 *
 * Neither the name of the HSQL Development Group nor the names of its
 * contributors may be used to endorse or promote products derived from this
 * software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL HSQL DEVELOPMENT GROUP, HSQLDB.ORG,
 * OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.security.auth.Subject;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.NameCallback;
import javax.security.auth.callback.PasswordCallback;
import javax.security.auth.callback.UnsupportedCallbackException;
import javax.security.auth.login.LoginContext;
import javax.security.auth.login.LoginException;

import org.hsqldb.lib.FrameworkLogger;

public class JaasAuthBean {

    /**
     * By default, If roleSchemaValuePattern is set, then role and schema
     * values are obtained from principle values; otherwise existing account
     * privileges are used (if any).
     * If roleSchemaViaCredential is set to true and roleSchemaValuePattern is
     * set, then credential values will be used instead.
     * <P>
     * Do not set roleSchemaViaCredential to true unless roleSchemaValuePattern
     * is set.
     *
     * @param roleSchemaViaCredential boolean
     */
    public void setRoleSchemaViaCredential(boolean roleSchemaViaCredential) {
        this.roleSchemaViaCredential = roleSchemaViaCredential;
    }

    /**
     * By default, If roleSchemaValuePattern is set, then role and schema
     * values are obtained from principle values; otherwise existing account
     * privileges are used (if any).
     * If roleSchemaViaCredential is set to true and roleSchemaValuePattern is
     * set, then credential values will be used instead.
     * <P>
     * Do not set roleSchemaViaCredential to true unless roleSchemaValuePattern
     * is set.
     *
     * @param roleSchemaViaCredential boolean
     */
    public void setRoleSchemaViaCredential2(boolean roleSchemaViaCredential) {
        this.roleSchemaViaCredential = roleSchemaViaCredential;
    }
}
