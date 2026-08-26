package org.openapitools.api.interfaces;

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
import org.openapitools.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public interface VectorStoresService {

    /**
     * Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
     * 
     *
     * @param vectorStoreId The ID of the vector store that the file batch belongs to. (required)
     * @param batchId The ID of the file batch to cancel. (required)
     * @return VectorStoreFileBatchObject
     */
    VectorStoreFileBatchObject cancelVectorStoreFileBatch(
        String vectorStoreId,
        String batchId
    );

    /**
     * Create a vector store.
     * 
     *
     * @param createVectorStoreRequest  (required)
     * @return VectorStoreObject
     */
    VectorStoreObject createVectorStore(
        CreateVectorStoreRequest createVectorStoreRequest
    );

    /**
     * Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
     * 
     *
     * @param vectorStoreId The ID of the vector store for which to create a File.  (required)
     * @param createVectorStoreFileRequest  (required)
     * @return VectorStoreFileObject
     */
    VectorStoreFileObject createVectorStoreFile(
        String vectorStoreId,
        CreateVectorStoreFileRequest createVectorStoreFileRequest
    );

    /**
     * Create a vector store file batch.
     * 
     *
     * @param vectorStoreId The ID of the vector store for which to create a File Batch.  (required)
     * @param createVectorStoreFileBatchRequest  (required)
     * @return VectorStoreFileBatchObject
     */
    VectorStoreFileBatchObject createVectorStoreFileBatch(
        String vectorStoreId,
        CreateVectorStoreFileBatchRequest createVectorStoreFileBatchRequest
    );

    /**
     * Delete a vector store.
     * 
     *
     * @param vectorStoreId The ID of the vector store to delete. (required)
     * @return DeleteVectorStoreResponse
     */
    DeleteVectorStoreResponse deleteVectorStore(
        String vectorStoreId
    );

    /**
     * Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
     * 
     *
     * @param vectorStoreId The ID of the vector store that the file belongs to. (required)
     * @param fileId The ID of the file to delete. (required)
     * @return DeleteVectorStoreFileResponse
     */
    DeleteVectorStoreFileResponse deleteVectorStoreFile(
        String vectorStoreId,
        String fileId
    );

    /**
     * Retrieves a vector store.
     * 
     *
     * @param vectorStoreId The ID of the vector store to retrieve. (required)
     * @return VectorStoreObject
     */
    VectorStoreObject getVectorStore(
        String vectorStoreId
    );

    /**
     * Retrieves a vector store file.
     * 
     *
     * @param vectorStoreId The ID of the vector store that the file belongs to. (required)
     * @param fileId The ID of the file being retrieved. (required)
     * @return VectorStoreFileObject
     */
    VectorStoreFileObject getVectorStoreFile(
        String vectorStoreId,
        String fileId
    );

    /**
     * Retrieves a vector store file batch.
     * 
     *
     * @param vectorStoreId The ID of the vector store that the file batch belongs to. (required)
     * @param batchId The ID of the file batch being retrieved. (required)
     * @return VectorStoreFileBatchObject
     */
    VectorStoreFileBatchObject getVectorStoreFileBatch(
        String vectorStoreId,
        String batchId
    );

    /**
     * Returns a list of vector store files in a batch.
     * 
     *
     * @param vectorStoreId The ID of the vector store that the files belong to. (required)
     * @param batchId The ID of the file batch that the files belong to. (required)
     * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to 20)
     * @param order Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  (optional, default to desc)
     * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  (optional)
     * @param before A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  (optional)
     * @param filter Filter by file status. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;cancelled&#x60;. (optional)
     * @return ListVectorStoreFilesResponse
     */
    ListVectorStoreFilesResponse listFilesInVectorStoreBatch(
        String vectorStoreId,
        String batchId,
        Integer limit,
        String order,
        String after,
        String before,
        String filter
    );

    /**
     * Returns a list of vector store files.
     * 
     *
     * @param vectorStoreId The ID of the vector store that the files belong to. (required)
     * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to 20)
     * @param order Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  (optional, default to desc)
     * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  (optional)
     * @param before A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  (optional)
     * @param filter Filter by file status. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;cancelled&#x60;. (optional)
     * @return ListVectorStoreFilesResponse
     */
    ListVectorStoreFilesResponse listVectorStoreFiles(
        String vectorStoreId,
        Integer limit,
        String order,
        String after,
        String before,
        String filter
    );

    /**
     * Returns a list of vector stores.
     * 
     *
     * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to 20)
     * @param order Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  (optional, default to desc)
     * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  (optional)
     * @param before A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  (optional)
     * @return ListVectorStoresResponse
     */
    ListVectorStoresResponse listVectorStores(
        Integer limit,
        String order,
        String after,
        String before
    );

    /**
     * Modifies a vector store.
     * 
     *
     * @param vectorStoreId The ID of the vector store to modify. (required)
     * @param updateVectorStoreRequest  (required)
     * @return VectorStoreObject
     */
    VectorStoreObject modifyVectorStore(
        String vectorStoreId,
        UpdateVectorStoreRequest updateVectorStoreRequest
    );
}
