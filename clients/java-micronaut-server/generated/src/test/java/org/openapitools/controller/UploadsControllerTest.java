package org.openapitools.controller;

import org.openapitools.model.CompleteUploadRequest;
import io.micronaut.http.multipart.CompletedFileUpload;
import org.openapitools.model.CreateUploadRequest;
import org.openapitools.model.Upload;
import org.openapitools.model.UploadPart;
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
 * API tests for UploadsController
 */
@MicronautTest
public class UploadsControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    UploadsController controller;

    /**
     * This test is used to validate the implementation of addUploadPart() method
     *
     * The method should: Adds a [Part](/docs/api-reference/uploads/part-object) to an [Upload](/docs/api-reference/uploads/object) object. A Part represents a chunk of bytes from the file you are trying to upload.   Each Part can be at most 64 MB, and you can add Parts until you hit the Upload maximum of 8 GB.  It is possible to add multiple Parts in parallel. You can decide the intended order of the Parts when you [complete the Upload](/docs/api-reference/uploads/complete). 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void addUploadPartMethodTest() {
        // given
        String uploadId = "upload_abc123";
        CompletedFileUpload data = null;

        // when
        UploadPart result = controller.addUploadPart(uploadId, data).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/uploads/{upload_id}/parts' to the features of addUploadPart() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void addUploadPartClientApiTest() throws IOException {
        // given
        Map<String, Object> form = new HashMap<String, Object>(){{
            // Fill in the body form parameters
            put("data", new FileReader(File.createTempFile("test", ".tmp")));
        }};
        String uri = UriTemplate.of("/uploads/{upload_id}/parts").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("upload_id", "upload_abc123");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, form)
            .accept("[Ljava.lang.String;@3e1ff1cf");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, UploadPart.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of cancelUpload() method
     *
     * The method should: Cancels the Upload. No Parts may be added after an Upload is cancelled. 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void cancelUploadMethodTest() {
        // given
        String uploadId = "upload_abc123";

        // when
        Upload result = controller.cancelUpload(uploadId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/uploads/{upload_id}/cancel' to the features of cancelUpload() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void cancelUploadClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/uploads/{upload_id}/cancel").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("upload_id", "upload_abc123");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, null)
            .accept("[Ljava.lang.String;@389588b2");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Upload.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of completeUpload() method
     *
     * The method should: Completes the [Upload](/docs/api-reference/uploads/object).   Within the returned Upload object, there is a nested [File](/docs/api-reference/files/object) object that is ready to use in the rest of the platform.  You can specify the order of the Parts by passing in an ordered list of the Part IDs.  The number of bytes uploaded upon completion must match the number of bytes initially specified when creating the Upload object. No Parts may be added after an Upload is completed. 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void completeUploadMethodTest() {
        // given
        String uploadId = "upload_abc123";
        CompleteUploadRequest completeUploadRequest = new CompleteUploadRequest(Arrays.asList("example"));

        // when
        Upload result = controller.completeUpload(uploadId, completeUploadRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/uploads/{upload_id}/complete' to the features of completeUpload() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void completeUploadClientApiTest() throws IOException {
        // given
        CompleteUploadRequest body = new CompleteUploadRequest(Arrays.asList("example"));
        String uri = UriTemplate.of("/uploads/{upload_id}/complete").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("upload_id", "upload_abc123");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@57e9122f");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Upload.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of createUpload() method
     *
     * The method should: Creates an intermediate [Upload](/docs/api-reference/uploads/object) object that you can add [Parts](/docs/api-reference/uploads/part-object) to. Currently, an Upload can accept at most 8 GB in total and expires after an hour after you create it.  Once you complete the Upload, we will create a [File](/docs/api-reference/files/object) object that contains all the parts you uploaded. This File is usable in the rest of our platform as a regular File object.  For certain &#x60;purpose&#x60;s, the correct &#x60;mime_type&#x60; must be specified. Please refer to documentation for the supported MIME types for your use case: - [Assistants](/docs/assistants/tools/file-search#supported-files)  For guidance on the proper filename extensions for each purpose, please follow the documentation on [creating a File](/docs/api-reference/files/create). 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void createUploadMethodTest() {
        // given
        CreateUploadRequest createUploadRequest = new CreateUploadRequest("example", "example", 56, "example");

        // when
        Upload result = controller.createUpload(createUploadRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/uploads' to the features of createUpload() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void createUploadClientApiTest() throws IOException {
        // given
        CreateUploadRequest body = new CreateUploadRequest("example", "example", 56, "example");
        String uri = UriTemplate.of("/uploads").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@14d6f58f");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Upload.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
