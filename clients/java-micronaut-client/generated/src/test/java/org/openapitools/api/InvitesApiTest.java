package org.openapitools.api;

import org.openapitools.model.Invite;
import org.openapitools.model.InviteDeleteResponse;
import org.openapitools.model.InviteListResponse;
import org.openapitools.model.InviteRequest;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import jakarta.inject.Inject;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;

/**
 * API tests for InvitesApi
 */
@MicronautTest
public class InvitesApiTest {

    @Inject
    InvitesApi api;

    
    /**
     * Delete an invite. If the invite has already been accepted, it cannot be deleted.
     */
    @Test
    @Disabled("Not Implemented")
    public void deleteInviteTest() {
        // given
        String inviteId = "example";

        // when
        InviteDeleteResponse body = api.deleteInvite(inviteId).block();

        // then
        // TODO implement the deleteInviteTest()
    }

    
    /**
     * Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.
     */
    @Test
    @Disabled("Not Implemented")
    public void inviteUserTest() {
        // given
        InviteRequest inviteRequest = new InviteRequest("example", "example");

        // when
        Invite body = api.inviteUser(inviteRequest).block();

        // then
        // TODO implement the inviteUserTest()
    }

    
    /**
     * Returns a list of invites in the organization.
     */
    @Test
    @Disabled("Not Implemented")
    public void listInvitesTest() {
        // given
        Integer limit = 20;
        String after = "example";

        // when
        InviteListResponse body = api.listInvites(limit, after).block();

        // then
        // TODO implement the listInvitesTest()
    }

    
    /**
     * Retrieves an invite.
     */
    @Test
    @Disabled("Not Implemented")
    public void retrieveInviteTest() {
        // given
        String inviteId = "example";

        // when
        Invite body = api.retrieveInvite(inviteId).block();

        // then
        // TODO implement the retrieveInviteTest()
    }

    
}
