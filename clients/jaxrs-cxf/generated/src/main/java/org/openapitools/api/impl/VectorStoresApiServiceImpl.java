package org.openapitools.api.impl;

import org.openapitools.api.*;
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

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;


/**
 * OpenAI API
 *
 * <p>The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 */
public class VectorStoresApiServiceImpl implements VectorStoresApi {
    /**
     * Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
     *
     */
    public VectorStoreFileBatchObject cancelVectorStoreFileBatch(String vectorStoreId, String batchId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Create a vector store.
     *
     */
    public VectorStoreObject createVectorStore(CreateVectorStoreRequest createVectorStoreRequest) {
        // TODO: Implement...

        return null;
    }

    /**
     * Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
     *
     */
    public VectorStoreFileObject createVectorStoreFile(String vectorStoreId, CreateVectorStoreFileRequest createVectorStoreFileRequest) {
        // TODO: Implement...

        return null;
    }

    /**
     * Create a vector store file batch.
     *
     */
    public VectorStoreFileBatchObject createVectorStoreFileBatch(String vectorStoreId, CreateVectorStoreFileBatchRequest createVectorStoreFileBatchRequest) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete a vector store.
     *
     */
    public DeleteVectorStoreResponse deleteVectorStore(String vectorStoreId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
     *
     */
    public DeleteVectorStoreFileResponse deleteVectorStoreFile(String vectorStoreId, String fileId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Retrieves a vector store.
     *
     */
    public VectorStoreObject getVectorStore(String vectorStoreId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Retrieves a vector store file.
     *
     */
    public VectorStoreFileObject getVectorStoreFile(String vectorStoreId, String fileId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Retrieves a vector store file batch.
     *
     */
    public VectorStoreFileBatchObject getVectorStoreFileBatch(String vectorStoreId, String batchId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Returns a list of vector store files in a batch.
     *
     */
    public ListVectorStoreFilesResponse listFilesInVectorStoreBatch(String vectorStoreId, String batchId, Integer limit, String order, String after, String before, String filter) {
        // TODO: Implement...

        return null;
    }

    /**
     * Returns a list of vector store files.
     *
     */
    public ListVectorStoreFilesResponse listVectorStoreFiles(String vectorStoreId, Integer limit, String order, String after, String before, String filter) {
        // TODO: Implement...

        return null;
    }

    /**
     * Returns a list of vector stores.
     *
     */
    public ListVectorStoresResponse listVectorStores(Integer limit, String order, String after, String before) {
        // TODO: Implement...

        return null;
    }

    /**
     * Modifies a vector store.
     *
     */
    public VectorStoreObject modifyVectorStore(String vectorStoreId, UpdateVectorStoreRequest updateVectorStoreRequest) {
        // TODO: Implement...

        return null;
    }

}
