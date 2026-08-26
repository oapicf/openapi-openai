package org.openapitools.server.api;

import org.openapitools.server.model.CreateVectorStoreFileBatchRequest;
import org.openapitools.server.model.CreateVectorStoreFileRequest;
import org.openapitools.server.model.CreateVectorStoreRequest;
import org.openapitools.server.model.DeleteVectorStoreFileResponse;
import org.openapitools.server.model.DeleteVectorStoreResponse;
import java.util.HexFormat;
import org.openapitools.server.model.ListVectorStoreFilesResponse;
import org.openapitools.server.model.ListVectorStoresResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import io.helidon.http.Status;
import org.openapitools.server.model.UpdateVectorStoreRequest;
import org.openapitools.server.model.VectorStoreFileBatchObject;
import org.openapitools.server.model.VectorStoreFileObject;
import org.openapitools.server.model.VectorStoreObject;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'VectorStores'",
                             version = "7.24.0")
public interface VectorStoresService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.post("/{vector_store_id}/file_batches/{batch_id}/cancel", this::cancelVectorStoreFileBatch);
        rules.post("/", this::createVectorStore);
        rules.post("/{vector_store_id}/files", this::createVectorStoreFile);
        rules.post("/{vector_store_id}/file_batches", this::createVectorStoreFileBatch);
        rules.delete("/{vector_store_id}", this::deleteVectorStore);
        rules.delete("/{vector_store_id}/files/{file_id}", this::deleteVectorStoreFile);
        rules.get("/{vector_store_id}", this::getVectorStore);
        rules.get("/{vector_store_id}/files/{file_id}", this::getVectorStoreFile);
        rules.get("/{vector_store_id}/file_batches/{batch_id}", this::getVectorStoreFileBatch);
        rules.get("/{vector_store_id}/file_batches/{batch_id}/files", this::listFilesInVectorStoreBatch);
        rules.get("/{vector_store_id}/files", this::listVectorStoreFiles);
        rules.get("/", this::listVectorStores);
        rules.post("/{vector_store_id}", this::modifyVectorStore);
    }


    /**
     * POST /vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel : Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible..
     *
     * @param request the server request
     * @param response the server response
     */
    void cancelVectorStoreFileBatch(ServerRequest request, ServerResponse response);
    /**
     * POST /vector_stores : Create a vector store..
     *
     * @param request the server request
     * @param response the server response
     */
    void createVectorStore(ServerRequest request, ServerResponse response);
    /**
     * POST /vector_stores/{vector_store_id}/files : Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object)..
     *
     * @param request the server request
     * @param response the server response
     */
    void createVectorStoreFile(ServerRequest request, ServerResponse response);
    /**
     * POST /vector_stores/{vector_store_id}/file_batches : Create a vector store file batch..
     *
     * @param request the server request
     * @param response the server response
     */
    void createVectorStoreFileBatch(ServerRequest request, ServerResponse response);
    /**
     * DELETE /vector_stores/{vector_store_id} : Delete a vector store..
     *
     * @param request the server request
     * @param response the server response
     */
    void deleteVectorStore(ServerRequest request, ServerResponse response);
    /**
     * DELETE /vector_stores/{vector_store_id}/files/{file_id} : Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint..
     *
     * @param request the server request
     * @param response the server response
     */
    void deleteVectorStoreFile(ServerRequest request, ServerResponse response);
    /**
     * GET /vector_stores/{vector_store_id} : Retrieves a vector store..
     *
     * @param request the server request
     * @param response the server response
     */
    void getVectorStore(ServerRequest request, ServerResponse response);
    /**
     * GET /vector_stores/{vector_store_id}/files/{file_id} : Retrieves a vector store file..
     *
     * @param request the server request
     * @param response the server response
     */
    void getVectorStoreFile(ServerRequest request, ServerResponse response);
    /**
     * GET /vector_stores/{vector_store_id}/file_batches/{batch_id} : Retrieves a vector store file batch..
     *
     * @param request the server request
     * @param response the server response
     */
    void getVectorStoreFileBatch(ServerRequest request, ServerResponse response);
    /**
     * GET /vector_stores/{vector_store_id}/file_batches/{batch_id}/files : Returns a list of vector store files in a batch..
     *
     * @param request the server request
     * @param response the server response
     */
    void listFilesInVectorStoreBatch(ServerRequest request, ServerResponse response);
    /**
     * GET /vector_stores/{vector_store_id}/files : Returns a list of vector store files..
     *
     * @param request the server request
     * @param response the server response
     */
    void listVectorStoreFiles(ServerRequest request, ServerResponse response);
    /**
     * GET /vector_stores : Returns a list of vector stores..
     *
     * @param request the server request
     * @param response the server response
     */
    void listVectorStores(ServerRequest request, ServerResponse response);
    /**
     * POST /vector_stores/{vector_store_id} : Modifies a vector store..
     *
     * @param request the server request
     * @param response the server response
     */
    void modifyVectorStore(ServerRequest request, ServerResponse response);
}
