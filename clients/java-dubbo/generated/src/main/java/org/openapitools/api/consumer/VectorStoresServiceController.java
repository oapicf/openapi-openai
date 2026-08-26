package org.openapitools.api.consumer;

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
import org.openapitools.api.interfaces.VectorStoresService;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

@RestController
@RequestMapping("/vector_stores")
public class VectorStoresServiceController {

    @DubboReference
    private VectorStoresService vectorStoresService;

    @RequestMapping(method = RequestMethod.POST, value = "/{vector_store_id}/file_batches/{batch_id}/cancel")
    public VectorStoreFileBatchObject cancelVectorStoreFileBatch(
        @RequestParam(name = "vectorStoreId") String vectorStoreId,
        @RequestParam(name = "batchId") String batchId
    ) {
        return vectorStoresService.cancelVectorStoreFileBatch(vectorStoreId, batchId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/")
    public VectorStoreObject createVectorStore(
        @RequestParam(name = "createVectorStoreRequest") CreateVectorStoreRequest createVectorStoreRequest
    ) {
        return vectorStoresService.createVectorStore(createVectorStoreRequest);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{vector_store_id}/files")
    public VectorStoreFileObject createVectorStoreFile(
        @RequestParam(name = "vectorStoreId") String vectorStoreId,
        @RequestParam(name = "createVectorStoreFileRequest") CreateVectorStoreFileRequest createVectorStoreFileRequest
    ) {
        return vectorStoresService.createVectorStoreFile(vectorStoreId, createVectorStoreFileRequest);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{vector_store_id}/file_batches")
    public VectorStoreFileBatchObject createVectorStoreFileBatch(
        @RequestParam(name = "vectorStoreId") String vectorStoreId,
        @RequestParam(name = "createVectorStoreFileBatchRequest") CreateVectorStoreFileBatchRequest createVectorStoreFileBatchRequest
    ) {
        return vectorStoresService.createVectorStoreFileBatch(vectorStoreId, createVectorStoreFileBatchRequest);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{vector_store_id}")
    public DeleteVectorStoreResponse deleteVectorStore(
        @RequestParam(name = "vectorStoreId") String vectorStoreId
    ) {
        return vectorStoresService.deleteVectorStore(vectorStoreId);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{vector_store_id}/files/{file_id}")
    public DeleteVectorStoreFileResponse deleteVectorStoreFile(
        @RequestParam(name = "vectorStoreId") String vectorStoreId,
        @RequestParam(name = "fileId") String fileId
    ) {
        return vectorStoresService.deleteVectorStoreFile(vectorStoreId, fileId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{vector_store_id}")
    public VectorStoreObject getVectorStore(
        @RequestParam(name = "vectorStoreId") String vectorStoreId
    ) {
        return vectorStoresService.getVectorStore(vectorStoreId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{vector_store_id}/files/{file_id}")
    public VectorStoreFileObject getVectorStoreFile(
        @RequestParam(name = "vectorStoreId") String vectorStoreId,
        @RequestParam(name = "fileId") String fileId
    ) {
        return vectorStoresService.getVectorStoreFile(vectorStoreId, fileId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{vector_store_id}/file_batches/{batch_id}")
    public VectorStoreFileBatchObject getVectorStoreFileBatch(
        @RequestParam(name = "vectorStoreId") String vectorStoreId,
        @RequestParam(name = "batchId") String batchId
    ) {
        return vectorStoresService.getVectorStoreFileBatch(vectorStoreId, batchId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{vector_store_id}/file_batches/{batch_id}/files")
    public ListVectorStoreFilesResponse listFilesInVectorStoreBatch(
        @RequestParam(name = "vectorStoreId") String vectorStoreId,
        @RequestParam(name = "batchId") String batchId,
        @RequestParam(name = "limit", defaultValue = "20") Integer limit,
        @RequestParam(name = "order", defaultValue = "desc") String order,
        @RequestParam(name = "after") String after,
        @RequestParam(name = "before") String before,
        @RequestParam(name = "filter") String filter
    ) {
        return vectorStoresService.listFilesInVectorStoreBatch(vectorStoreId, batchId, limit, order, after, before, filter);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{vector_store_id}/files")
    public ListVectorStoreFilesResponse listVectorStoreFiles(
        @RequestParam(name = "vectorStoreId") String vectorStoreId,
        @RequestParam(name = "limit", defaultValue = "20") Integer limit,
        @RequestParam(name = "order", defaultValue = "desc") String order,
        @RequestParam(name = "after") String after,
        @RequestParam(name = "before") String before,
        @RequestParam(name = "filter") String filter
    ) {
        return vectorStoresService.listVectorStoreFiles(vectorStoreId, limit, order, after, before, filter);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public ListVectorStoresResponse listVectorStores(
        @RequestParam(name = "limit", defaultValue = "20") Integer limit,
        @RequestParam(name = "order", defaultValue = "desc") String order,
        @RequestParam(name = "after") String after,
        @RequestParam(name = "before") String before
    ) {
        return vectorStoresService.listVectorStores(limit, order, after, before);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{vector_store_id}")
    public VectorStoreObject modifyVectorStore(
        @RequestParam(name = "vectorStoreId") String vectorStoreId,
        @RequestParam(name = "updateVectorStoreRequest") UpdateVectorStoreRequest updateVectorStoreRequest
    ) {
        return vectorStoresService.modifyVectorStore(vectorStoreId, updateVectorStoreRequest);
    }
}
