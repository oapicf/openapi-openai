package org.openapitools.controller;

import org.openapitools.model.CreateVectorStoreFileBatchRequest;
import org.openapitools.model.CreateVectorStoreFileRequest;
import org.openapitools.model.CreateVectorStoreRequest;
import org.openapitools.model.DeleteVectorStoreFileResponse;
import org.openapitools.model.DeleteVectorStoreResponse;
import org.openapitools.model.ListVectorStoreFilesResponse;
import org.openapitools.model.ListVectorStoresResponse;
import org.openapitools.model.UpdateVectorStoreRequest;
import org.openapitools.model.VectorStoreFileBatchObject;
import org.openapitools.model.VectorStoreFileObject;
import org.openapitools.model.VectorStoreObject;
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
 * API tests for VectorStoresController
 */
@MicronautTest
public class VectorStoresControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    VectorStoresController controller;

    /**
     * This test is used to validate the implementation of cancelVectorStoreFileBatch() method
     *
     * The method should: Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void cancelVectorStoreFileBatchMethodTest() {
        // given
        String vectorStoreId = "example";
        String batchId = "example";

        // when
        VectorStoreFileBatchObject result = controller.cancelVectorStoreFileBatch(vectorStoreId, batchId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel' to the features of cancelVectorStoreFileBatch() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void cancelVectorStoreFileBatchClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("vector_store_id", "example");
            put("batch_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, null)
            .accept("[Ljava.lang.String;@508a1ef0");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, VectorStoreFileBatchObject.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of createVectorStore() method
     *
     * The method should: Create a vector store.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void createVectorStoreMethodTest() {
        // given
        CreateVectorStoreRequest createVectorStoreRequest = new CreateVectorStoreRequest();

        // when
        VectorStoreObject result = controller.createVectorStore(createVectorStoreRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/vector_stores' to the features of createVectorStore() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void createVectorStoreClientApiTest() throws IOException {
        // given
        CreateVectorStoreRequest body = new CreateVectorStoreRequest();
        String uri = UriTemplate.of("/vector_stores").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@64845c40");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, VectorStoreObject.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of createVectorStoreFile() method
     *
     * The method should: Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void createVectorStoreFileMethodTest() {
        // given
        String vectorStoreId = "vs_abc123";
        CreateVectorStoreFileRequest createVectorStoreFileRequest = new CreateVectorStoreFileRequest("example");

        // when
        VectorStoreFileObject result = controller.createVectorStoreFile(vectorStoreId, createVectorStoreFileRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/vector_stores/{vector_store_id}/files' to the features of createVectorStoreFile() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void createVectorStoreFileClientApiTest() throws IOException {
        // given
        CreateVectorStoreFileRequest body = new CreateVectorStoreFileRequest("example");
        String uri = UriTemplate.of("/vector_stores/{vector_store_id}/files").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("vector_store_id", "vs_abc123");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@68073c8d");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, VectorStoreFileObject.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of createVectorStoreFileBatch() method
     *
     * The method should: Create a vector store file batch.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void createVectorStoreFileBatchMethodTest() {
        // given
        String vectorStoreId = "vs_abc123";
        CreateVectorStoreFileBatchRequest createVectorStoreFileBatchRequest = new CreateVectorStoreFileBatchRequest(Arrays.asList("example"));

        // when
        VectorStoreFileBatchObject result = controller.createVectorStoreFileBatch(vectorStoreId, createVectorStoreFileBatchRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/vector_stores/{vector_store_id}/file_batches' to the features of createVectorStoreFileBatch() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void createVectorStoreFileBatchClientApiTest() throws IOException {
        // given
        CreateVectorStoreFileBatchRequest body = new CreateVectorStoreFileBatchRequest(Arrays.asList("example"));
        String uri = UriTemplate.of("/vector_stores/{vector_store_id}/file_batches").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("vector_store_id", "vs_abc123");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@1472308f");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, VectorStoreFileBatchObject.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of deleteVectorStore() method
     *
     * The method should: Delete a vector store.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void deleteVectorStoreMethodTest() {
        // given
        String vectorStoreId = "example";

        // when
        DeleteVectorStoreResponse result = controller.deleteVectorStore(vectorStoreId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/vector_stores/{vector_store_id}' to the features of deleteVectorStore() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void deleteVectorStoreClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/vector_stores/{vector_store_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("vector_store_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.DELETE(uri)
            .accept("[Ljava.lang.String;@140fc16f");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, DeleteVectorStoreResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of deleteVectorStoreFile() method
     *
     * The method should: Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void deleteVectorStoreFileMethodTest() {
        // given
        String vectorStoreId = "example";
        String fileId = "example";

        // when
        DeleteVectorStoreFileResponse result = controller.deleteVectorStoreFile(vectorStoreId, fileId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/vector_stores/{vector_store_id}/files/{file_id}' to the features of deleteVectorStoreFile() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void deleteVectorStoreFileClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/vector_stores/{vector_store_id}/files/{file_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("vector_store_id", "example");
            put("file_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.DELETE(uri)
            .accept("[Ljava.lang.String;@52afe9f2");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, DeleteVectorStoreFileResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of getVectorStore() method
     *
     * The method should: Retrieves a vector store.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getVectorStoreMethodTest() {
        // given
        String vectorStoreId = "example";

        // when
        VectorStoreObject result = controller.getVectorStore(vectorStoreId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/vector_stores/{vector_store_id}' to the features of getVectorStore() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getVectorStoreClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/vector_stores/{vector_store_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("vector_store_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@39d547e");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, VectorStoreObject.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of getVectorStoreFile() method
     *
     * The method should: Retrieves a vector store file.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getVectorStoreFileMethodTest() {
        // given
        String vectorStoreId = "vs_abc123";
        String fileId = "file-abc123";

        // when
        VectorStoreFileObject result = controller.getVectorStoreFile(vectorStoreId, fileId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/vector_stores/{vector_store_id}/files/{file_id}' to the features of getVectorStoreFile() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getVectorStoreFileClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/vector_stores/{vector_store_id}/files/{file_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("vector_store_id", "vs_abc123");
            put("file_id", "file-abc123");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@66efaca");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, VectorStoreFileObject.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of getVectorStoreFileBatch() method
     *
     * The method should: Retrieves a vector store file batch.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getVectorStoreFileBatchMethodTest() {
        // given
        String vectorStoreId = "vs_abc123";
        String batchId = "vsfb_abc123";

        // when
        VectorStoreFileBatchObject result = controller.getVectorStoreFileBatch(vectorStoreId, batchId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/vector_stores/{vector_store_id}/file_batches/{batch_id}' to the features of getVectorStoreFileBatch() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getVectorStoreFileBatchClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/vector_stores/{vector_store_id}/file_batches/{batch_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("vector_store_id", "vs_abc123");
            put("batch_id", "vsfb_abc123");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@6c8057d1");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, VectorStoreFileBatchObject.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of listFilesInVectorStoreBatch() method
     *
     * The method should: Returns a list of vector store files in a batch.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void listFilesInVectorStoreBatchMethodTest() {
        // given
        String vectorStoreId = "example";
        String batchId = "example";
        Integer limit = 20;
        String order = "desc";
        String after = "example";
        String before = "example";
        String filter = "example";

        // when
        ListVectorStoreFilesResponse result = controller.listFilesInVectorStoreBatch(vectorStoreId, batchId, limit, order, after, before, filter).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/vector_stores/{vector_store_id}/file_batches/{batch_id}/files' to the features of listFilesInVectorStoreBatch() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void listFilesInVectorStoreBatchClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/vector_stores/{vector_store_id}/file_batches/{batch_id}/files").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("vector_store_id", "example");
            put("batch_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@414dc3ca");
        request.getParameters()
            .add("limit", String.valueOf(20)) // The query parameter format should be 
            .add("order", "desc") // The query parameter format should be 
            .add("after", "example") // The query parameter format should be 
            .add("before", "example") // The query parameter format should be 
            .add("filter", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, ListVectorStoreFilesResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of listVectorStoreFiles() method
     *
     * The method should: Returns a list of vector store files.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void listVectorStoreFilesMethodTest() {
        // given
        String vectorStoreId = "example";
        Integer limit = 20;
        String order = "desc";
        String after = "example";
        String before = "example";
        String filter = "example";

        // when
        ListVectorStoreFilesResponse result = controller.listVectorStoreFiles(vectorStoreId, limit, order, after, before, filter).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/vector_stores/{vector_store_id}/files' to the features of listVectorStoreFiles() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void listVectorStoreFilesClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/vector_stores/{vector_store_id}/files").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("vector_store_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@281a5139");
        request.getParameters()
            .add("limit", String.valueOf(20)) // The query parameter format should be 
            .add("order", "desc") // The query parameter format should be 
            .add("after", "example") // The query parameter format should be 
            .add("before", "example") // The query parameter format should be 
            .add("filter", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, ListVectorStoreFilesResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of listVectorStores() method
     *
     * The method should: Returns a list of vector stores.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void listVectorStoresMethodTest() {
        // given
        Integer limit = 20;
        String order = "desc";
        String after = "example";
        String before = "example";

        // when
        ListVectorStoresResponse result = controller.listVectorStores(limit, order, after, before).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/vector_stores' to the features of listVectorStores() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void listVectorStoresClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/vector_stores").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@5953465a");
        request.getParameters()
            .add("limit", String.valueOf(20)) // The query parameter format should be 
            .add("order", "desc") // The query parameter format should be 
            .add("after", "example") // The query parameter format should be 
            .add("before", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, ListVectorStoresResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of modifyVectorStore() method
     *
     * The method should: Modifies a vector store.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void modifyVectorStoreMethodTest() {
        // given
        String vectorStoreId = "example";
        UpdateVectorStoreRequest updateVectorStoreRequest = new UpdateVectorStoreRequest();

        // when
        VectorStoreObject result = controller.modifyVectorStore(vectorStoreId, updateVectorStoreRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/vector_stores/{vector_store_id}' to the features of modifyVectorStore() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void modifyVectorStoreClientApiTest() throws IOException {
        // given
        UpdateVectorStoreRequest body = new UpdateVectorStoreRequest();
        String uri = UriTemplate.of("/vector_stores/{vector_store_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("vector_store_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@3703bc7e");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, VectorStoreObject.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
