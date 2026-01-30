// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile, HttpInfo} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';


import { CreateVectorStoreFileBatchRequest } from '../models/CreateVectorStoreFileBatchRequest';
import { CreateVectorStoreFileRequest } from '../models/CreateVectorStoreFileRequest';
import { CreateVectorStoreRequest } from '../models/CreateVectorStoreRequest';
import { DeleteVectorStoreFileResponse } from '../models/DeleteVectorStoreFileResponse';
import { DeleteVectorStoreResponse } from '../models/DeleteVectorStoreResponse';
import { ListVectorStoreFilesResponse } from '../models/ListVectorStoreFilesResponse';
import { ListVectorStoresResponse } from '../models/ListVectorStoresResponse';
import { UpdateVectorStoreRequest } from '../models/UpdateVectorStoreRequest';
import { VectorStoreFileBatchObject } from '../models/VectorStoreFileBatchObject';
import { VectorStoreFileObject } from '../models/VectorStoreFileObject';
import { VectorStoreObject } from '../models/VectorStoreObject';

/**
 * no description
 */
export class VectorStoresApiRequestFactory extends BaseAPIRequestFactory {

    /**
     * Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
     * @param vectorStoreId The ID of the vector store that the file batch belongs to.
     * @param batchId The ID of the file batch to cancel.
     */
    public async cancelVectorStoreFileBatch(vectorStoreId: string, batchId: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'vectorStoreId' is not null or undefined
        if (vectorStoreId === null || vectorStoreId === undefined) {
            throw new RequiredError("VectorStoresApi", "cancelVectorStoreFileBatch", "vectorStoreId");
        }


        // verify required parameter 'batchId' is not null or undefined
        if (batchId === null || batchId === undefined) {
            throw new RequiredError("VectorStoresApi", "cancelVectorStoreFileBatch", "batchId");
        }


        // Path Params
        const localVarPath = '/vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel'
            .replace('{' + 'vector_store_id' + '}', encodeURIComponent(String(vectorStoreId)))
            .replace('{' + 'batch_id' + '}', encodeURIComponent(String(batchId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Create a vector store.
     * @param createVectorStoreRequest 
     */
    public async createVectorStore(createVectorStoreRequest: CreateVectorStoreRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'createVectorStoreRequest' is not null or undefined
        if (createVectorStoreRequest === null || createVectorStoreRequest === undefined) {
            throw new RequiredError("VectorStoresApi", "createVectorStore", "createVectorStoreRequest");
        }


        // Path Params
        const localVarPath = '/vector_stores';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(createVectorStoreRequest, "CreateVectorStoreRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
     * @param vectorStoreId The ID of the vector store for which to create a File. 
     * @param createVectorStoreFileRequest 
     */
    public async createVectorStoreFile(vectorStoreId: string, createVectorStoreFileRequest: CreateVectorStoreFileRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'vectorStoreId' is not null or undefined
        if (vectorStoreId === null || vectorStoreId === undefined) {
            throw new RequiredError("VectorStoresApi", "createVectorStoreFile", "vectorStoreId");
        }


        // verify required parameter 'createVectorStoreFileRequest' is not null or undefined
        if (createVectorStoreFileRequest === null || createVectorStoreFileRequest === undefined) {
            throw new RequiredError("VectorStoresApi", "createVectorStoreFile", "createVectorStoreFileRequest");
        }


        // Path Params
        const localVarPath = '/vector_stores/{vector_store_id}/files'
            .replace('{' + 'vector_store_id' + '}', encodeURIComponent(String(vectorStoreId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(createVectorStoreFileRequest, "CreateVectorStoreFileRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Create a vector store file batch.
     * @param vectorStoreId The ID of the vector store for which to create a File Batch. 
     * @param createVectorStoreFileBatchRequest 
     */
    public async createVectorStoreFileBatch(vectorStoreId: string, createVectorStoreFileBatchRequest: CreateVectorStoreFileBatchRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'vectorStoreId' is not null or undefined
        if (vectorStoreId === null || vectorStoreId === undefined) {
            throw new RequiredError("VectorStoresApi", "createVectorStoreFileBatch", "vectorStoreId");
        }


        // verify required parameter 'createVectorStoreFileBatchRequest' is not null or undefined
        if (createVectorStoreFileBatchRequest === null || createVectorStoreFileBatchRequest === undefined) {
            throw new RequiredError("VectorStoresApi", "createVectorStoreFileBatch", "createVectorStoreFileBatchRequest");
        }


        // Path Params
        const localVarPath = '/vector_stores/{vector_store_id}/file_batches'
            .replace('{' + 'vector_store_id' + '}', encodeURIComponent(String(vectorStoreId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(createVectorStoreFileBatchRequest, "CreateVectorStoreFileBatchRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Delete a vector store.
     * @param vectorStoreId The ID of the vector store to delete.
     */
    public async deleteVectorStore(vectorStoreId: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'vectorStoreId' is not null or undefined
        if (vectorStoreId === null || vectorStoreId === undefined) {
            throw new RequiredError("VectorStoresApi", "deleteVectorStore", "vectorStoreId");
        }


        // Path Params
        const localVarPath = '/vector_stores/{vector_store_id}'
            .replace('{' + 'vector_store_id' + '}', encodeURIComponent(String(vectorStoreId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.DELETE);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
     * @param vectorStoreId The ID of the vector store that the file belongs to.
     * @param fileId The ID of the file to delete.
     */
    public async deleteVectorStoreFile(vectorStoreId: string, fileId: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'vectorStoreId' is not null or undefined
        if (vectorStoreId === null || vectorStoreId === undefined) {
            throw new RequiredError("VectorStoresApi", "deleteVectorStoreFile", "vectorStoreId");
        }


        // verify required parameter 'fileId' is not null or undefined
        if (fileId === null || fileId === undefined) {
            throw new RequiredError("VectorStoresApi", "deleteVectorStoreFile", "fileId");
        }


        // Path Params
        const localVarPath = '/vector_stores/{vector_store_id}/files/{file_id}'
            .replace('{' + 'vector_store_id' + '}', encodeURIComponent(String(vectorStoreId)))
            .replace('{' + 'file_id' + '}', encodeURIComponent(String(fileId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.DELETE);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Retrieves a vector store.
     * @param vectorStoreId The ID of the vector store to retrieve.
     */
    public async getVectorStore(vectorStoreId: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'vectorStoreId' is not null or undefined
        if (vectorStoreId === null || vectorStoreId === undefined) {
            throw new RequiredError("VectorStoresApi", "getVectorStore", "vectorStoreId");
        }


        // Path Params
        const localVarPath = '/vector_stores/{vector_store_id}'
            .replace('{' + 'vector_store_id' + '}', encodeURIComponent(String(vectorStoreId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Retrieves a vector store file.
     * @param vectorStoreId The ID of the vector store that the file belongs to.
     * @param fileId The ID of the file being retrieved.
     */
    public async getVectorStoreFile(vectorStoreId: string, fileId: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'vectorStoreId' is not null or undefined
        if (vectorStoreId === null || vectorStoreId === undefined) {
            throw new RequiredError("VectorStoresApi", "getVectorStoreFile", "vectorStoreId");
        }


        // verify required parameter 'fileId' is not null or undefined
        if (fileId === null || fileId === undefined) {
            throw new RequiredError("VectorStoresApi", "getVectorStoreFile", "fileId");
        }


        // Path Params
        const localVarPath = '/vector_stores/{vector_store_id}/files/{file_id}'
            .replace('{' + 'vector_store_id' + '}', encodeURIComponent(String(vectorStoreId)))
            .replace('{' + 'file_id' + '}', encodeURIComponent(String(fileId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Retrieves a vector store file batch.
     * @param vectorStoreId The ID of the vector store that the file batch belongs to.
     * @param batchId The ID of the file batch being retrieved.
     */
    public async getVectorStoreFileBatch(vectorStoreId: string, batchId: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'vectorStoreId' is not null or undefined
        if (vectorStoreId === null || vectorStoreId === undefined) {
            throw new RequiredError("VectorStoresApi", "getVectorStoreFileBatch", "vectorStoreId");
        }


        // verify required parameter 'batchId' is not null or undefined
        if (batchId === null || batchId === undefined) {
            throw new RequiredError("VectorStoresApi", "getVectorStoreFileBatch", "batchId");
        }


        // Path Params
        const localVarPath = '/vector_stores/{vector_store_id}/file_batches/{batch_id}'
            .replace('{' + 'vector_store_id' + '}', encodeURIComponent(String(vectorStoreId)))
            .replace('{' + 'batch_id' + '}', encodeURIComponent(String(batchId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Returns a list of vector store files in a batch.
     * @param vectorStoreId The ID of the vector store that the files belong to.
     * @param batchId The ID of the file batch that the files belong to.
     * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     * @param order Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
     * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     * @param before A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
     * @param filter Filter by file status. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;cancelled&#x60;.
     */
    public async listFilesInVectorStoreBatch(vectorStoreId: string, batchId: string, limit?: number, order?: 'asc' | 'desc', after?: string, before?: string, filter?: 'in_progress' | 'completed' | 'failed' | 'cancelled', _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'vectorStoreId' is not null or undefined
        if (vectorStoreId === null || vectorStoreId === undefined) {
            throw new RequiredError("VectorStoresApi", "listFilesInVectorStoreBatch", "vectorStoreId");
        }


        // verify required parameter 'batchId' is not null or undefined
        if (batchId === null || batchId === undefined) {
            throw new RequiredError("VectorStoresApi", "listFilesInVectorStoreBatch", "batchId");
        }







        // Path Params
        const localVarPath = '/vector_stores/{vector_store_id}/file_batches/{batch_id}/files'
            .replace('{' + 'vector_store_id' + '}', encodeURIComponent(String(vectorStoreId)))
            .replace('{' + 'batch_id' + '}', encodeURIComponent(String(batchId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (limit !== undefined) {
            requestContext.setQueryParam("limit", ObjectSerializer.serialize(limit, "number", ""));
        }

        // Query Params
        if (order !== undefined) {
            requestContext.setQueryParam("order", ObjectSerializer.serialize(order, "'asc' | 'desc'", ""));
        }

        // Query Params
        if (after !== undefined) {
            requestContext.setQueryParam("after", ObjectSerializer.serialize(after, "string", ""));
        }

        // Query Params
        if (before !== undefined) {
            requestContext.setQueryParam("before", ObjectSerializer.serialize(before, "string", ""));
        }

        // Query Params
        if (filter !== undefined) {
            requestContext.setQueryParam("filter", ObjectSerializer.serialize(filter, "'in_progress' | 'completed' | 'failed' | 'cancelled'", ""));
        }


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Returns a list of vector store files.
     * @param vectorStoreId The ID of the vector store that the files belong to.
     * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     * @param order Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
     * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     * @param before A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
     * @param filter Filter by file status. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;cancelled&#x60;.
     */
    public async listVectorStoreFiles(vectorStoreId: string, limit?: number, order?: 'asc' | 'desc', after?: string, before?: string, filter?: 'in_progress' | 'completed' | 'failed' | 'cancelled', _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'vectorStoreId' is not null or undefined
        if (vectorStoreId === null || vectorStoreId === undefined) {
            throw new RequiredError("VectorStoresApi", "listVectorStoreFiles", "vectorStoreId");
        }







        // Path Params
        const localVarPath = '/vector_stores/{vector_store_id}/files'
            .replace('{' + 'vector_store_id' + '}', encodeURIComponent(String(vectorStoreId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (limit !== undefined) {
            requestContext.setQueryParam("limit", ObjectSerializer.serialize(limit, "number", ""));
        }

        // Query Params
        if (order !== undefined) {
            requestContext.setQueryParam("order", ObjectSerializer.serialize(order, "'asc' | 'desc'", ""));
        }

        // Query Params
        if (after !== undefined) {
            requestContext.setQueryParam("after", ObjectSerializer.serialize(after, "string", ""));
        }

        // Query Params
        if (before !== undefined) {
            requestContext.setQueryParam("before", ObjectSerializer.serialize(before, "string", ""));
        }

        // Query Params
        if (filter !== undefined) {
            requestContext.setQueryParam("filter", ObjectSerializer.serialize(filter, "'in_progress' | 'completed' | 'failed' | 'cancelled'", ""));
        }


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Returns a list of vector stores.
     * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     * @param order Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
     * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     * @param before A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
     */
    public async listVectorStores(limit?: number, order?: 'asc' | 'desc', after?: string, before?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;





        // Path Params
        const localVarPath = '/vector_stores';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (limit !== undefined) {
            requestContext.setQueryParam("limit", ObjectSerializer.serialize(limit, "number", ""));
        }

        // Query Params
        if (order !== undefined) {
            requestContext.setQueryParam("order", ObjectSerializer.serialize(order, "'asc' | 'desc'", ""));
        }

        // Query Params
        if (after !== undefined) {
            requestContext.setQueryParam("after", ObjectSerializer.serialize(after, "string", ""));
        }

        // Query Params
        if (before !== undefined) {
            requestContext.setQueryParam("before", ObjectSerializer.serialize(before, "string", ""));
        }


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Modifies a vector store.
     * @param vectorStoreId The ID of the vector store to modify.
     * @param updateVectorStoreRequest 
     */
    public async modifyVectorStore(vectorStoreId: string, updateVectorStoreRequest: UpdateVectorStoreRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'vectorStoreId' is not null or undefined
        if (vectorStoreId === null || vectorStoreId === undefined) {
            throw new RequiredError("VectorStoresApi", "modifyVectorStore", "vectorStoreId");
        }


        // verify required parameter 'updateVectorStoreRequest' is not null or undefined
        if (updateVectorStoreRequest === null || updateVectorStoreRequest === undefined) {
            throw new RequiredError("VectorStoresApi", "modifyVectorStore", "updateVectorStoreRequest");
        }


        // Path Params
        const localVarPath = '/vector_stores/{vector_store_id}'
            .replace('{' + 'vector_store_id' + '}', encodeURIComponent(String(vectorStoreId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(updateVectorStoreRequest, "UpdateVectorStoreRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

}

export class VectorStoresApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to cancelVectorStoreFileBatch
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async cancelVectorStoreFileBatchWithHttpInfo(response: ResponseContext): Promise<HttpInfo<VectorStoreFileBatchObject >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: VectorStoreFileBatchObject = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "VectorStoreFileBatchObject", ""
            ) as VectorStoreFileBatchObject;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: VectorStoreFileBatchObject = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "VectorStoreFileBatchObject", ""
            ) as VectorStoreFileBatchObject;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to createVectorStore
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async createVectorStoreWithHttpInfo(response: ResponseContext): Promise<HttpInfo<VectorStoreObject >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: VectorStoreObject = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "VectorStoreObject", ""
            ) as VectorStoreObject;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: VectorStoreObject = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "VectorStoreObject", ""
            ) as VectorStoreObject;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to createVectorStoreFile
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async createVectorStoreFileWithHttpInfo(response: ResponseContext): Promise<HttpInfo<VectorStoreFileObject >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: VectorStoreFileObject = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "VectorStoreFileObject", ""
            ) as VectorStoreFileObject;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: VectorStoreFileObject = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "VectorStoreFileObject", ""
            ) as VectorStoreFileObject;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to createVectorStoreFileBatch
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async createVectorStoreFileBatchWithHttpInfo(response: ResponseContext): Promise<HttpInfo<VectorStoreFileBatchObject >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: VectorStoreFileBatchObject = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "VectorStoreFileBatchObject", ""
            ) as VectorStoreFileBatchObject;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: VectorStoreFileBatchObject = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "VectorStoreFileBatchObject", ""
            ) as VectorStoreFileBatchObject;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to deleteVectorStore
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async deleteVectorStoreWithHttpInfo(response: ResponseContext): Promise<HttpInfo<DeleteVectorStoreResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: DeleteVectorStoreResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "DeleteVectorStoreResponse", ""
            ) as DeleteVectorStoreResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: DeleteVectorStoreResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "DeleteVectorStoreResponse", ""
            ) as DeleteVectorStoreResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to deleteVectorStoreFile
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async deleteVectorStoreFileWithHttpInfo(response: ResponseContext): Promise<HttpInfo<DeleteVectorStoreFileResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: DeleteVectorStoreFileResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "DeleteVectorStoreFileResponse", ""
            ) as DeleteVectorStoreFileResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: DeleteVectorStoreFileResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "DeleteVectorStoreFileResponse", ""
            ) as DeleteVectorStoreFileResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to getVectorStore
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async getVectorStoreWithHttpInfo(response: ResponseContext): Promise<HttpInfo<VectorStoreObject >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: VectorStoreObject = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "VectorStoreObject", ""
            ) as VectorStoreObject;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: VectorStoreObject = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "VectorStoreObject", ""
            ) as VectorStoreObject;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to getVectorStoreFile
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async getVectorStoreFileWithHttpInfo(response: ResponseContext): Promise<HttpInfo<VectorStoreFileObject >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: VectorStoreFileObject = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "VectorStoreFileObject", ""
            ) as VectorStoreFileObject;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: VectorStoreFileObject = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "VectorStoreFileObject", ""
            ) as VectorStoreFileObject;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to getVectorStoreFileBatch
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async getVectorStoreFileBatchWithHttpInfo(response: ResponseContext): Promise<HttpInfo<VectorStoreFileBatchObject >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: VectorStoreFileBatchObject = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "VectorStoreFileBatchObject", ""
            ) as VectorStoreFileBatchObject;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: VectorStoreFileBatchObject = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "VectorStoreFileBatchObject", ""
            ) as VectorStoreFileBatchObject;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to listFilesInVectorStoreBatch
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async listFilesInVectorStoreBatchWithHttpInfo(response: ResponseContext): Promise<HttpInfo<ListVectorStoreFilesResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: ListVectorStoreFilesResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ListVectorStoreFilesResponse", ""
            ) as ListVectorStoreFilesResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: ListVectorStoreFilesResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ListVectorStoreFilesResponse", ""
            ) as ListVectorStoreFilesResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to listVectorStoreFiles
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async listVectorStoreFilesWithHttpInfo(response: ResponseContext): Promise<HttpInfo<ListVectorStoreFilesResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: ListVectorStoreFilesResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ListVectorStoreFilesResponse", ""
            ) as ListVectorStoreFilesResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: ListVectorStoreFilesResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ListVectorStoreFilesResponse", ""
            ) as ListVectorStoreFilesResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to listVectorStores
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async listVectorStoresWithHttpInfo(response: ResponseContext): Promise<HttpInfo<ListVectorStoresResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: ListVectorStoresResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ListVectorStoresResponse", ""
            ) as ListVectorStoresResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: ListVectorStoresResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ListVectorStoresResponse", ""
            ) as ListVectorStoresResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to modifyVectorStore
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async modifyVectorStoreWithHttpInfo(response: ResponseContext): Promise<HttpInfo<VectorStoreObject >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: VectorStoreObject = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "VectorStoreObject", ""
            ) as VectorStoreObject;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: VectorStoreObject = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "VectorStoreObject", ""
            ) as VectorStoreObject;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

}
