package org.openapitools.controller;

import org.openapitools.model.Invite;
import org.openapitools.model.InviteDeleteResponse;
import org.openapitools.model.InviteListResponse;
import org.openapitools.model.InviteRequest;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.runtime.server.EmbeddedServer;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.MutableHttpRequest;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.uri.UriTemplate;
import io.micronaut.http.cookie.Cookie;
import io.micronaut.http.client.multipart.MultipartBody;
import io.micronaut.core.type.Argument;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Assertions;
import jakarta.inject.Inject;
import reactor.core.publisher.Mono;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;


/**
 * API tests for InvitesController
 */
@MicronautTest
public class InvitesControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    InvitesController controller;

    /**
     * This test is used to validate the implementation of deleteInvite() method
     *
     * The method should: Delete an invite. If the invite has already been accepted, it cannot be deleted.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void deleteInviteMethodTest() {
        // given
        String inviteId = "example";

        // when
        InviteDeleteResponse result = controller.deleteInvite(inviteId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/organization/invites/{invite_id}' to the features of deleteInvite() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void deleteInviteClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/organization/invites/{invite_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("invite_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.DELETE(uri)
            .accept("[Ljava.lang.String;@3426ce80");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, InviteDeleteResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of inviteUser() method
     *
     * The method should: Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void inviteUserMethodTest() {
        // given
        InviteRequest inviteRequest = new InviteRequest("example", "example");

        // when
        Invite result = controller.inviteUser(inviteRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/organization/invites' to the features of inviteUser() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void inviteUserClientApiTest() throws IOException {
        // given
        InviteRequest body = new InviteRequest("example", "example");
        String uri = UriTemplate.of("/organization/invites").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@10742c78");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Invite.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of listInvites() method
     *
     * The method should: Returns a list of invites in the organization.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void listInvitesMethodTest() {
        // given
        Integer limit = 20;
        String after = "example";

        // when
        InviteListResponse result = controller.listInvites(limit, after).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/organization/invites' to the features of listInvites() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void listInvitesClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/organization/invites").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@1b67ea5f");
        request.getParameters()
            .add("limit", String.valueOf(20)) // The query parameter format should be 
            .add("after", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, InviteListResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of retrieveInvite() method
     *
     * The method should: Retrieves an invite.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void retrieveInviteMethodTest() {
        // given
        String inviteId = "example";

        // when
        Invite result = controller.retrieveInvite(inviteId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/organization/invites/{invite_id}' to the features of retrieveInvite() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void retrieveInviteClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/organization/invites/{invite_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("invite_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@19ea1606");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Invite.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
