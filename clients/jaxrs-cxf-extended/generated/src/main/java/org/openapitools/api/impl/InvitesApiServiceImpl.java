package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.Invite;
import org.openapitools.model.InviteDeleteResponse;
import org.openapitools.model.InviteListResponse;
import org.openapitools.model.InviteRequest;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;

/**
 * OpenAI API
 *
 * <p>The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 */
public class InvitesApiServiceImpl implements InvitesApi {
    /**
     * Delete an invite. If the invite has already been accepted, it cannot be deleted.
     *
     */
    @Override
    public InviteDeleteResponse deleteInvite(String inviteId) {
        // TODO: Implement...
        return null;
    }

    /**
     * Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.
     *
     */
    @Override
    public Invite inviteUser(InviteRequest inviteRequest) {
        // TODO: Implement...
        return null;
    }

    /**
     * Returns a list of invites in the organization.
     *
     */
    @Override
    public InviteListResponse listInvites(Integer limit, String after) {
        // TODO: Implement...
        return null;
    }

    /**
     * Retrieves an invite.
     *
     */
    @Override
    public Invite retrieveInvite(String inviteId) {
        // TODO: Implement...
        return null;
    }

}
