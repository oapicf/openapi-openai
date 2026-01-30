package org.openapitools.controller;

import io.micronaut.http.multipart.CompletedFileUpload;
import org.openapitools.model.DeleteFileResponse;
import org.openapitools.model.ListFilesResponse;
import org.openapitools.model.OpenAIFile;
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
 * API tests for FilesController
 */
@MicronautTest
public class FilesControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    FilesController controller;

    /**
     * This test is used to validate the implementation of createFile() method
     *
     * The method should: Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports &#x60;.jsonl&#x60; files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports &#x60;.jsonl&#x60; files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void createFileMethodTest() {
        // given
        CompletedFileUpload _file = null;
        String purpose = "example";

        // when
        OpenAIFile result = controller.createFile(_file, purpose).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/files' to the features of createFile() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void createFileClientApiTest() throws IOException {
        // given
        Map<String, Object> form = new HashMap<String, Object>(){{
            // Fill in the body form parameters
            put("file", new FileReader(File.createTempFile("test", ".tmp")));
            put("purpose", "example");
        }};
        String uri = UriTemplate.of("/files").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, form)
            .accept("[Ljava.lang.String;@2b5747f0");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, OpenAIFile.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of deleteFile() method
     *
     * The method should: Delete a file.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void deleteFileMethodTest() {
        // given
        String fileId = "example";

        // when
        DeleteFileResponse result = controller.deleteFile(fileId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/files/{file_id}' to the features of deleteFile() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void deleteFileClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/files/{file_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("file_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.DELETE(uri)
            .accept("[Ljava.lang.String;@75352929");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, DeleteFileResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of downloadFile() method
     *
     * The method should: Returns the contents of the specified file.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void downloadFileMethodTest() {
        // given
        String fileId = "example";

        // when
        String result = controller.downloadFile(fileId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/files/{file_id}/content' to the features of downloadFile() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void downloadFileClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/files/{file_id}/content").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("file_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@1d6d5c2a");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, String.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of listFiles() method
     *
     * The method should: Returns a list of files.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void listFilesMethodTest() {
        // given
        String purpose = "example";
        Integer limit = 10000;
        String order = "desc";
        String after = "example";

        // when
        ListFilesResponse result = controller.listFiles(purpose, limit, order, after).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/files' to the features of listFiles() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void listFilesClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/files").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@d06a341");
        request.getParameters()
            .add("purpose", "example") // The query parameter format should be 
            .add("limit", String.valueOf(10000)) // The query parameter format should be 
            .add("order", "desc") // The query parameter format should be 
            .add("after", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, ListFilesResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of retrieveFile() method
     *
     * The method should: Returns information about a specific file.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void retrieveFileMethodTest() {
        // given
        String fileId = "example";

        // when
        OpenAIFile result = controller.retrieveFile(fileId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/files/{file_id}' to the features of retrieveFile() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void retrieveFileClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/files/{file_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("file_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@1c7f0dd6");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, OpenAIFile.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
