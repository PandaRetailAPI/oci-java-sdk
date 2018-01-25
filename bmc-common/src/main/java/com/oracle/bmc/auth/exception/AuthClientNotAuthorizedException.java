/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.auth.exception;

import com.google.common.base.Preconditions;
import com.oracle.bmc.model.BmcException;

/**
 * Exception thrown when the client failed to authenticate to the auth service using configured key suppliers.
 */
public class AuthClientNotAuthorizedException extends AuthClientException {
    private static final int STATUS_CODE_UNAUTHORIZED = 401;
    private static final long serialVersionUID = 1L;
    private static final String MESSAGE = "Client is unauthorized. ";

    public AuthClientNotAuthorizedException(BmcException e) {
        this(MESSAGE + e.getMessage(), e);
    }

    public AuthClientNotAuthorizedException(String message, BmcException cause) {
        super(message, validate(cause));
    }

    private static BmcException validate(BmcException cause) {
        Preconditions.checkArgument(matches(cause));
        return cause;
    }

    /**
     * Return true if the exception is a "client unauthorized" exception.
     * @param cause BMC exception to check
     * @return true if the exception is a "client unauthorized" exception
     */
    public static boolean matches(BmcException cause) {
        return cause.getStatusCode() == STATUS_CODE_UNAUTHORIZED;
    }
}
