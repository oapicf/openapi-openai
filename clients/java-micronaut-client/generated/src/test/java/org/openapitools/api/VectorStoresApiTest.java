package org.openapitools.api;

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
 * API tests for VectorStoresApi
 */
@MicronautTest
public class VectorStoresApiTest {

    @Inject
    VectorStoresApi api;

    
    /**
     * Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
     */
    @Test
    @Disabled("Not Implemented")
    public void cancelVectorStoreFileBatchTest() {
        // given
        String vectorStoreId = "example";
        String batchId = "example";

        // when
        VectorStoreFileBatchObject body = api.cancelVectorStoreFileBatch(vectorStoreId, batchId).block();

        // then
        // TODO implement the cancelVectorStoreFileBatchTest()
    }

    
    /**
     * Create a vector store.
     */
    @Test
    @Disabled("Not Implemented")
    public void createVectorStoreTest() {
        // given
        CreateVectorStoreRequest createVectorStoreRequest = new CreateVectorStoreRequest();

        // when
        VectorStoreObject body = api.createVectorStore(createVectorStoreRequest).block();

        // then
        // TODO implement the createVectorStoreTest()
    }

    
    /**
     * Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
     */
    @Test
    @Disabled("Not Implemented")
    public void createVectorStoreFileTest() {
        // given
        String vectorStoreId = "vs_abc123";
        CreateVectorStoreFileRequest createVectorStoreFileRequest = new CreateVectorStoreFileRequest("example");

        // when
        VectorStoreFileObject body = api.createVectorStoreFile(vectorStoreId, createVectorStoreFileRequest).block();

        // then
        // TODO implement the createVectorStoreFileTest()
    }

    
    /**
     * Create a vector store file batch.
     */
    @Test
    @Disabled("Not Implemented")
    public void createVectorStoreFileBatchTest() {
        // given
        String vectorStoreId = "vs_abc123";
        CreateVectorStoreFileBatchRequest createVectorStoreFileBatchRequest = new CreateVectorStoreFileBatchRequest(Arrays.asList("example"));

        // when
        VectorStoreFileBatchObject body = api.createVectorStoreFileBatch(vectorStoreId, createVectorStoreFileBatchRequest).block();

        // then
        // TODO implement the createVectorStoreFileBatchTest()
    }

    
    /**
     * Delete a vector store.
     */
    @Test
    @Disabled("Not Implemented")
    public void deleteVectorStoreTest() {
        // given
        String vectorStoreId = "example";

        // when
        DeleteVectorStoreResponse body = api.deleteVectorStore(vectorStoreId).block();

        // then
        // TODO implement the deleteVectorStoreTest()
    }

    
    /**
     * Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
     */
    @Test
    @Disabled("Not Implemented")
    public void deleteVectorStoreFileTest() {
        // given
        String vectorStoreId = "example";
        String fileId = "example";

        // when
        DeleteVectorStoreFileResponse body = api.deleteVectorStoreFile(vectorStoreId, fileId).block();

        // then
        // TODO implement the deleteVectorStoreFileTest()
    }

    
    /**
     * Retrieves a vector store.
     */
    @Test
    @Disabled("Not Implemented")
    public void getVectorStoreTest() {
        // given
        String vectorStoreId = "example";

        // when
        VectorStoreObject body = api.getVectorStore(vectorStoreId).block();

        // then
        // TODO implement the getVectorStoreTest()
    }

    
    /**
     * Retrieves a vector store file.
     */
    @Test
    @Disabled("Not Implemented")
    public void getVectorStoreFileTest() {
        // given
        String vectorStoreId = "vs_abc123";
        String fileId = "file-abc123";

        // when
        VectorStoreFileObject body = api.getVectorStoreFile(vectorStoreId, fileId).block();

        // then
        // TODO implement the getVectorStoreFileTest()
    }

    
    /**
     * Retrieves a vector store file batch.
     */
    @Test
    @Disabled("Not Implemented")
    public void getVectorStoreFileBatchTest() {
        // given
        String vectorStoreId = "vs_abc123";
        String batchId = "vsfb_abc123";

        // when
        VectorStoreFileBatchObject body = api.getVectorStoreFileBatch(vectorStoreId, batchId).block();

        // then
        // TODO implement the getVectorStoreFileBatchTest()
    }

    
    /**
     * Returns a list of vector store files in a batch.
     */
    @Test
    @Disabled("Not Implemented")
    public void listFilesInVectorStoreBatchTest() {
        // given
        String vectorStoreId = "example";
        String batchId = "example";
        Integer limit = 20;
        String order = "desc";
        String after = "example";
        String before = "example";
        String filter = "example";

        // when
        ListVectorStoreFilesResponse body = api.listFilesInVectorStoreBatch(vectorStoreId, batchId, limit, order, after, before, filter).block();

        // then
        // TODO implement the listFilesInVectorStoreBatchTest()
    }

    
    /**
     * Returns a list of vector store files.
     */
    @Test
    @Disabled("Not Implemented")
    public void listVectorStoreFilesTest() {
        // given
        String vectorStoreId = "example";
        Integer limit = 20;
        String order = "desc";
        String after = "example";
        String before = "example";
        String filter = "example";

        // when
        ListVectorStoreFilesResponse body = api.listVectorStoreFiles(vectorStoreId, limit, order, after, before, filter).block();

        // then
        // TODO implement the listVectorStoreFilesTest()
    }

    
    /**
     * Returns a list of vector stores.
     */
    @Test
    @Disabled("Not Implemented")
    public void listVectorStoresTest() {
        // given
        Integer limit = 20;
        String order = "desc";
        String after = "example";
        String before = "example";

        // when
        ListVectorStoresResponse body = api.listVectorStores(limit, order, after, before).block();

        // then
        // TODO implement the listVectorStoresTest()
    }

    
    /**
     * Modifies a vector store.
     */
    @Test
    @Disabled("Not Implemented")
    public void modifyVectorStoreTest() {
        // given
        String vectorStoreId = "example";
        UpdateVectorStoreRequest updateVectorStoreRequest = new UpdateVectorStoreRequest();

        // when
        VectorStoreObject body = api.modifyVectorStore(vectorStoreId, updateVectorStoreRequest).block();

        // then
        // TODO implement the modifyVectorStoreTest()
    }

    
}
