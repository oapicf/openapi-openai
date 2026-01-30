// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile, HttpInfo} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';


import { UsageResponse } from '../models/UsageResponse';

/**
 * no description
 */
export class UsageApiRequestFactory extends BaseAPIRequestFactory {

    /**
     * Get audio speeches usage details for the organization.
     * @param startTime Start time (Unix seconds) of the query time range, inclusive.
     * @param endTime End time (Unix seconds) of the query time range, exclusive.
     * @param bucketWidth Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.
     * @param projectIds Return only usage for these projects.
     * @param userIds Return only usage for these users.
     * @param apiKeyIds Return only usage for these API keys.
     * @param models Return only usage for these models.
     * @param groupBy Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them.
     * @param limit Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 
     * @param page A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.
     */
    public async usageAudioSpeeches(startTime: number, endTime?: number, bucketWidth?: '1m' | '1h' | '1d', projectIds?: Array<string>, userIds?: Array<string>, apiKeyIds?: Array<string>, models?: Array<string>, groupBy?: Array<'project_id' | 'user_id' | 'api_key_id' | 'model'>, limit?: number, page?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'startTime' is not null or undefined
        if (startTime === null || startTime === undefined) {
            throw new RequiredError("UsageApi", "usageAudioSpeeches", "startTime");
        }











        // Path Params
        const localVarPath = '/organization/usage/audio_speeches';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (startTime !== undefined) {
            requestContext.setQueryParam("start_time", ObjectSerializer.serialize(startTime, "number", ""));
        }

        // Query Params
        if (endTime !== undefined) {
            requestContext.setQueryParam("end_time", ObjectSerializer.serialize(endTime, "number", ""));
        }

        // Query Params
        if (bucketWidth !== undefined) {
            requestContext.setQueryParam("bucket_width", ObjectSerializer.serialize(bucketWidth, "'1m' | '1h' | '1d'", ""));
        }

        // Query Params
        if (projectIds !== undefined) {
            const serializedParams = ObjectSerializer.serialize(projectIds, "Array<string>", "");
            for (const serializedParam of serializedParams) {
                requestContext.appendQueryParam("project_ids", serializedParam);
            }
        }

        // Query Params
        if (userIds !== undefined) {
            const serializedParams = ObjectSerializer.serialize(userIds, "Array<string>", "");
            for (const serializedParam of serializedParams) {
                requestContext.appendQueryParam("user_ids", serializedParam);
            }
        }

        // Query Params
        if (apiKeyIds !== undefined) {
            const serializedParams = ObjectSerializer.serialize(apiKeyIds, "Array<string>", "");
            for (const serializedParam of serializedParams) {
                requestContext.appendQueryParam("api_key_ids", serializedParam);
            }
        }

        // Query Params
        if (models !== undefined) {
            const serializedParams = ObjectSerializer.serialize(models, "Array<string>", "");
            for (const serializedParam of serializedParams) {
                requestContext.appendQueryParam("models", serializedParam);
            }
        }

        // Query Params
        if (groupBy !== undefined) {
            const serializedParams = ObjectSerializer.serialize(groupBy, "Array<'project_id' | 'user_id' | 'api_key_id' | 'model'>", "");
            for (const serializedParam of serializedParams) {
                requestContext.appendQueryParam("group_by", serializedParam);
            }
        }

        // Query Params
        if (limit !== undefined) {
            requestContext.setQueryParam("limit", ObjectSerializer.serialize(limit, "number", ""));
        }

        // Query Params
        if (page !== undefined) {
            requestContext.setQueryParam("page", ObjectSerializer.serialize(page, "string", ""));
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
     * Get audio transcriptions usage details for the organization.
     * @param startTime Start time (Unix seconds) of the query time range, inclusive.
     * @param endTime End time (Unix seconds) of the query time range, exclusive.
     * @param bucketWidth Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.
     * @param projectIds Return only usage for these projects.
     * @param userIds Return only usage for these users.
     * @param apiKeyIds Return only usage for these API keys.
     * @param models Return only usage for these models.
     * @param groupBy Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them.
     * @param limit Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 
     * @param page A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.
     */
    public async usageAudioTranscriptions(startTime: number, endTime?: number, bucketWidth?: '1m' | '1h' | '1d', projectIds?: Array<string>, userIds?: Array<string>, apiKeyIds?: Array<string>, models?: Array<string>, groupBy?: Array<'project_id' | 'user_id' | 'api_key_id' | 'model'>, limit?: number, page?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'startTime' is not null or undefined
        if (startTime === null || startTime === undefined) {
            throw new RequiredError("UsageApi", "usageAudioTranscriptions", "startTime");
        }











        // Path Params
        const localVarPath = '/organization/usage/audio_transcriptions';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (startTime !== undefined) {
            requestContext.setQueryParam("start_time", ObjectSerializer.serialize(startTime, "number", ""));
        }

        // Query Params
        if (endTime !== undefined) {
            requestContext.setQueryParam("end_time", ObjectSerializer.serialize(endTime, "number", ""));
        }

        // Query Params
        if (bucketWidth !== undefined) {
            requestContext.setQueryParam("bucket_width", ObjectSerializer.serialize(bucketWidth, "'1m' | '1h' | '1d'", ""));
        }

        // Query Params
        if (projectIds !== undefined) {
            const serializedParams = ObjectSerializer.serialize(projectIds, "Array<string>", "");
            for (const serializedParam of serializedParams) {
                requestContext.appendQueryParam("project_ids", serializedParam);
            }
        }

        // Query Params
        if (userIds !== undefined) {
            const serializedParams = ObjectSerializer.serialize(userIds, "Array<string>", "");
            for (const serializedParam of serializedParams) {
                requestContext.appendQueryParam("user_ids", serializedParam);
            }
        }

        // Query Params
        if (apiKeyIds !== undefined) {
            const serializedParams = ObjectSerializer.serialize(apiKeyIds, "Array<string>", "");
            for (const serializedParam of serializedParams) {
                requestContext.appendQueryParam("api_key_ids", serializedParam);
            }
        }

        // Query Params
        if (models !== undefined) {
            const serializedParams = ObjectSerializer.serialize(models, "Array<string>", "");
            for (const serializedParam of serializedParams) {
                requestContext.appendQueryParam("models", serializedParam);
            }
        }

        // Query Params
        if (groupBy !== undefined) {
            const serializedParams = ObjectSerializer.serialize(groupBy, "Array<'project_id' | 'user_id' | 'api_key_id' | 'model'>", "");
            for (const serializedParam of serializedParams) {
                requestContext.appendQueryParam("group_by", serializedParam);
            }
        }

        // Query Params
        if (limit !== undefined) {
            requestContext.setQueryParam("limit", ObjectSerializer.serialize(limit, "number", ""));
        }

        // Query Params
        if (page !== undefined) {
            requestContext.setQueryParam("page", ObjectSerializer.serialize(page, "string", ""));
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
     * Get code interpreter sessions usage details for the organization.
     * @param startTime Start time (Unix seconds) of the query time range, inclusive.
     * @param endTime End time (Unix seconds) of the query time range, exclusive.
     * @param bucketWidth Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.
     * @param projectIds Return only usage for these projects.
     * @param groupBy Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;.
     * @param limit Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 
     * @param page A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.
     */
    public async usageCodeInterpreterSessions(startTime: number, endTime?: number, bucketWidth?: '1m' | '1h' | '1d', projectIds?: Array<string>, groupBy?: Array<'project_id'>, limit?: number, page?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'startTime' is not null or undefined
        if (startTime === null || startTime === undefined) {
            throw new RequiredError("UsageApi", "usageCodeInterpreterSessions", "startTime");
        }








        // Path Params
        const localVarPath = '/organization/usage/code_interpreter_sessions';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (startTime !== undefined) {
            requestContext.setQueryParam("start_time", ObjectSerializer.serialize(startTime, "number", ""));
        }

        // Query Params
        if (endTime !== undefined) {
            requestContext.setQueryParam("end_time", ObjectSerializer.serialize(endTime, "number", ""));
        }

        // Query Params
        if (bucketWidth !== undefined) {
            requestContext.setQueryParam("bucket_width", ObjectSerializer.serialize(bucketWidth, "'1m' | '1h' | '1d'", ""));
        }

        // Query Params
        if (projectIds !== undefined) {
            const serializedParams = ObjectSerializer.serialize(projectIds, "Array<string>", "");
            for (const serializedParam of serializedParams) {
                requestContext.appendQueryParam("project_ids", serializedParam);
            }
        }

        // Query Params
        if (groupBy !== undefined) {
            const serializedParams = ObjectSerializer.serialize(groupBy, "Array<'project_id'>", "");
            for (const serializedParam of serializedParams) {
                requestContext.appendQueryParam("group_by", serializedParam);
            }
        }

        // Query Params
        if (limit !== undefined) {
            requestContext.setQueryParam("limit", ObjectSerializer.serialize(limit, "number", ""));
        }

        // Query Params
        if (page !== undefined) {
            requestContext.setQueryParam("page", ObjectSerializer.serialize(page, "string", ""));
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
     * Get completions usage details for the organization.
     * @param startTime Start time (Unix seconds) of the query time range, inclusive.
     * @param endTime End time (Unix seconds) of the query time range, exclusive.
     * @param bucketWidth Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.
     * @param projectIds Return only usage for these projects.
     * @param userIds Return only usage for these users.
     * @param apiKeyIds Return only usage for these API keys.
     * @param models Return only usage for these models.
     * @param batch If &#x60;true&#x60;, return batch jobs only. If &#x60;false&#x60;, return non-batch jobs only. By default, return both. 
     * @param groupBy Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60;, &#x60;batch&#x60; or any combination of them.
     * @param limit Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 
     * @param page A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.
     */
    public async usageCompletions(startTime: number, endTime?: number, bucketWidth?: '1m' | '1h' | '1d', projectIds?: Array<string>, userIds?: Array<string>, apiKeyIds?: Array<string>, models?: Array<string>, batch?: boolean, groupBy?: Array<'project_id' | 'user_id' | 'api_key_id' | 'model' | 'batch'>, limit?: number, page?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'startTime' is not null or undefined
        if (startTime === null || startTime === undefined) {
            throw new RequiredError("UsageApi", "usageCompletions", "startTime");
        }












        // Path Params
        const localVarPath = '/organization/usage/completions';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (startTime !== undefined) {
            requestContext.setQueryParam("start_time", ObjectSerializer.serialize(startTime, "number", ""));
        }

        // Query Params
        if (endTime !== undefined) {
            requestContext.setQueryParam("end_time", ObjectSerializer.serialize(endTime, "number", ""));
        }

        // Query Params
        if (bucketWidth !== undefined) {
            requestContext.setQueryParam("bucket_width", ObjectSerializer.serialize(bucketWidth, "'1m' | '1h' | '1d'", ""));
        }

        // Query Params
        if (projectIds !== undefined) {
            const serializedParams = ObjectSerializer.serialize(projectIds, "Array<string>", "");
            for (const serializedParam of serializedParams) {
                requestContext.appendQueryParam("project_ids", serializedParam);
            }
        }

        // Query Params
        if (userIds !== undefined) {
            const serializedParams = ObjectSerializer.serialize(userIds, "Array<string>", "");
            for (const serializedParam of serializedParams) {
                requestContext.appendQueryParam("user_ids", serializedParam);
            }
        }

        // Query Params
        if (apiKeyIds !== undefined) {
            const serializedParams = ObjectSerializer.serialize(apiKeyIds, "Array<string>", "");
            for (const serializedParam of serializedParams) {
                requestContext.appendQueryParam("api_key_ids", serializedParam);
            }
        }

        // Query Params
        if (models !== undefined) {
            const serializedParams = ObjectSerializer.serialize(models, "Array<string>", "");
            for (const serializedParam of serializedParams) {
                requestContext.appendQueryParam("models", serializedParam);
            }
        }

        // Query Params
        if (batch !== undefined) {
            requestContext.setQueryParam("batch", ObjectSerializer.serialize(batch, "boolean", ""));
        }

        // Query Params
        if (groupBy !== undefined) {
            const serializedParams = ObjectSerializer.serialize(groupBy, "Array<'project_id' | 'user_id' | 'api_key_id' | 'model' | 'batch'>", "");
            for (const serializedParam of serializedParams) {
                requestContext.appendQueryParam("group_by", serializedParam);
            }
        }

        // Query Params
        if (limit !== undefined) {
            requestContext.setQueryParam("limit", ObjectSerializer.serialize(limit, "number", ""));
        }

        // Query Params
        if (page !== undefined) {
            requestContext.setQueryParam("page", ObjectSerializer.serialize(page, "string", ""));
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
     * Get costs details for the organization.
     * @param startTime Start time (Unix seconds) of the query time range, inclusive.
     * @param endTime End time (Unix seconds) of the query time range, exclusive.
     * @param bucketWidth Width of each time bucket in response. Currently only &#x60;1d&#x60; is supported, default to &#x60;1d&#x60;.
     * @param projectIds Return only costs for these projects.
     * @param groupBy Group the costs by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;line_item&#x60; and any combination of them.
     * @param limit A limit on the number of buckets to be returned. Limit can range between 1 and 180, and the default is 7. 
     * @param page A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.
     */
    public async usageCosts(startTime: number, endTime?: number, bucketWidth?: '1d', projectIds?: Array<string>, groupBy?: Array<'project_id' | 'line_item'>, limit?: number, page?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'startTime' is not null or undefined
        if (startTime === null || startTime === undefined) {
            throw new RequiredError("UsageApi", "usageCosts", "startTime");
        }








        // Path Params
        const localVarPath = '/organization/costs';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (startTime !== undefined) {
            requestContext.setQueryParam("start_time", ObjectSerializer.serialize(startTime, "number", ""));
        }

        // Query Params
        if (endTime !== undefined) {
            requestContext.setQueryParam("end_time", ObjectSerializer.serialize(endTime, "number", ""));
        }

        // Query Params
        if (bucketWidth !== undefined) {
            requestContext.setQueryParam("bucket_width", ObjectSerializer.serialize(bucketWidth, "'1d'", ""));
        }

        // Query Params
        if (projectIds !== undefined) {
            const serializedParams = ObjectSerializer.serialize(projectIds, "Array<string>", "");
            for (const serializedParam of serializedParams) {
                requestContext.appendQueryParam("project_ids", serializedParam);
            }
        }

        // Query Params
        if (groupBy !== undefined) {
            const serializedParams = ObjectSerializer.serialize(groupBy, "Array<'project_id' | 'line_item'>", "");
            for (const serializedParam of serializedParams) {
                requestContext.appendQueryParam("group_by", serializedParam);
            }
        }

        // Query Params
        if (limit !== undefined) {
            requestContext.setQueryParam("limit", ObjectSerializer.serialize(limit, "number", ""));
        }

        // Query Params
        if (page !== undefined) {
            requestContext.setQueryParam("page", ObjectSerializer.serialize(page, "string", ""));
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
     * Get embeddings usage details for the organization.
     * @param startTime Start time (Unix seconds) of the query time range, inclusive.
     * @param endTime End time (Unix seconds) of the query time range, exclusive.
     * @param bucketWidth Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.
     * @param projectIds Return only usage for these projects.
     * @param userIds Return only usage for these users.
     * @param apiKeyIds Return only usage for these API keys.
     * @param models Return only usage for these models.
     * @param groupBy Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them.
     * @param limit Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 
     * @param page A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.
     */
    public async usageEmbeddings(startTime: number, endTime?: number, bucketWidth?: '1m' | '1h' | '1d', projectIds?: Array<string>, userIds?: Array<string>, apiKeyIds?: Array<string>, models?: Array<string>, groupBy?: Array<'project_id' | 'user_id' | 'api_key_id' | 'model'>, limit?: number, page?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'startTime' is not null or undefined
        if (startTime === null || startTime === undefined) {
            throw new RequiredError("UsageApi", "usageEmbeddings", "startTime");
        }











        // Path Params
        const localVarPath = '/organization/usage/embeddings';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (startTime !== undefined) {
            requestContext.setQueryParam("start_time", ObjectSerializer.serialize(startTime, "number", ""));
        }

        // Query Params
        if (endTime !== undefined) {
            requestContext.setQueryParam("end_time", ObjectSerializer.serialize(endTime, "number", ""));
        }

        // Query Params
        if (bucketWidth !== undefined) {
            requestContext.setQueryParam("bucket_width", ObjectSerializer.serialize(bucketWidth, "'1m' | '1h' | '1d'", ""));
        }

        // Query Params
        if (projectIds !== undefined) {
            const serializedParams = ObjectSerializer.serialize(projectIds, "Array<string>", "");
            for (const serializedParam of serializedParams) {
                requestContext.appendQueryParam("project_ids", serializedParam);
            }
        }

        // Query Params
        if (userIds !== undefined) {
            const serializedParams = ObjectSerializer.serialize(userIds, "Array<string>", "");
            for (const serializedParam of serializedParams) {
                requestContext.appendQueryParam("user_ids", serializedParam);
            }
        }

        // Query Params
        if (apiKeyIds !== undefined) {
            const serializedParams = ObjectSerializer.serialize(apiKeyIds, "Array<string>", "");
            for (const serializedParam of serializedParams) {
                requestContext.appendQueryParam("api_key_ids", serializedParam);
            }
        }

        // Query Params
        if (models !== undefined) {
            const serializedParams = ObjectSerializer.serialize(models, "Array<string>", "");
            for (const serializedParam of serializedParams) {
                requestContext.appendQueryParam("models", serializedParam);
            }
        }

        // Query Params
        if (groupBy !== undefined) {
            const serializedParams = ObjectSerializer.serialize(groupBy, "Array<'project_id' | 'user_id' | 'api_key_id' | 'model'>", "");
            for (const serializedParam of serializedParams) {
                requestContext.appendQueryParam("group_by", serializedParam);
            }
        }

        // Query Params
        if (limit !== undefined) {
            requestContext.setQueryParam("limit", ObjectSerializer.serialize(limit, "number", ""));
        }

        // Query Params
        if (page !== undefined) {
            requestContext.setQueryParam("page", ObjectSerializer.serialize(page, "string", ""));
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
     * Get images usage details for the organization.
     * @param startTime Start time (Unix seconds) of the query time range, inclusive.
     * @param endTime End time (Unix seconds) of the query time range, exclusive.
     * @param bucketWidth Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.
     * @param sources Return only usages for these sources. Possible values are &#x60;image.generation&#x60;, &#x60;image.edit&#x60;, &#x60;image.variation&#x60; or any combination of them.
     * @param sizes Return only usages for these image sizes. Possible values are &#x60;256x256&#x60;, &#x60;512x512&#x60;, &#x60;1024x1024&#x60;, &#x60;1792x1792&#x60;, &#x60;1024x1792&#x60; or any combination of them.
     * @param projectIds Return only usage for these projects.
     * @param userIds Return only usage for these users.
     * @param apiKeyIds Return only usage for these API keys.
     * @param models Return only usage for these models.
     * @param groupBy Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60;, &#x60;size&#x60;, &#x60;source&#x60; or any combination of them.
     * @param limit Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 
     * @param page A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.
     */
    public async usageImages(startTime: number, endTime?: number, bucketWidth?: '1m' | '1h' | '1d', sources?: Array<'image.generation' | 'image.edit' | 'image.variation'>, sizes?: Array<'256x256' | '512x512' | '1024x1024' | '1792x1792' | '1024x1792'>, projectIds?: Array<string>, userIds?: Array<string>, apiKeyIds?: Array<string>, models?: Array<string>, groupBy?: Array<'project_id' | 'user_id' | 'api_key_id' | 'model' | 'size' | 'source'>, limit?: number, page?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'startTime' is not null or undefined
        if (startTime === null || startTime === undefined) {
            throw new RequiredError("UsageApi", "usageImages", "startTime");
        }













        // Path Params
        const localVarPath = '/organization/usage/images';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (startTime !== undefined) {
            requestContext.setQueryParam("start_time", ObjectSerializer.serialize(startTime, "number", ""));
        }

        // Query Params
        if (endTime !== undefined) {
            requestContext.setQueryParam("end_time", ObjectSerializer.serialize(endTime, "number", ""));
        }

        // Query Params
        if (bucketWidth !== undefined) {
            requestContext.setQueryParam("bucket_width", ObjectSerializer.serialize(bucketWidth, "'1m' | '1h' | '1d'", ""));
        }

        // Query Params
        if (sources !== undefined) {
            const serializedParams = ObjectSerializer.serialize(sources, "Array<'image.generation' | 'image.edit' | 'image.variation'>", "");
            for (const serializedParam of serializedParams) {
                requestContext.appendQueryParam("sources", serializedParam);
            }
        }

        // Query Params
        if (sizes !== undefined) {
            const serializedParams = ObjectSerializer.serialize(sizes, "Array<'256x256' | '512x512' | '1024x1024' | '1792x1792' | '1024x1792'>", "");
            for (const serializedParam of serializedParams) {
                requestContext.appendQueryParam("sizes", serializedParam);
            }
        }

        // Query Params
        if (projectIds !== undefined) {
            const serializedParams = ObjectSerializer.serialize(projectIds, "Array<string>", "");
            for (const serializedParam of serializedParams) {
                requestContext.appendQueryParam("project_ids", serializedParam);
            }
        }

        // Query Params
        if (userIds !== undefined) {
            const serializedParams = ObjectSerializer.serialize(userIds, "Array<string>", "");
            for (const serializedParam of serializedParams) {
                requestContext.appendQueryParam("user_ids", serializedParam);
            }
        }

        // Query Params
        if (apiKeyIds !== undefined) {
            const serializedParams = ObjectSerializer.serialize(apiKeyIds, "Array<string>", "");
            for (const serializedParam of serializedParams) {
                requestContext.appendQueryParam("api_key_ids", serializedParam);
            }
        }

        // Query Params
        if (models !== undefined) {
            const serializedParams = ObjectSerializer.serialize(models, "Array<string>", "");
            for (const serializedParam of serializedParams) {
                requestContext.appendQueryParam("models", serializedParam);
            }
        }

        // Query Params
        if (groupBy !== undefined) {
            const serializedParams = ObjectSerializer.serialize(groupBy, "Array<'project_id' | 'user_id' | 'api_key_id' | 'model' | 'size' | 'source'>", "");
            for (const serializedParam of serializedParams) {
                requestContext.appendQueryParam("group_by", serializedParam);
            }
        }

        // Query Params
        if (limit !== undefined) {
            requestContext.setQueryParam("limit", ObjectSerializer.serialize(limit, "number", ""));
        }

        // Query Params
        if (page !== undefined) {
            requestContext.setQueryParam("page", ObjectSerializer.serialize(page, "string", ""));
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
     * Get moderations usage details for the organization.
     * @param startTime Start time (Unix seconds) of the query time range, inclusive.
     * @param endTime End time (Unix seconds) of the query time range, exclusive.
     * @param bucketWidth Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.
     * @param projectIds Return only usage for these projects.
     * @param userIds Return only usage for these users.
     * @param apiKeyIds Return only usage for these API keys.
     * @param models Return only usage for these models.
     * @param groupBy Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them.
     * @param limit Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 
     * @param page A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.
     */
    public async usageModerations(startTime: number, endTime?: number, bucketWidth?: '1m' | '1h' | '1d', projectIds?: Array<string>, userIds?: Array<string>, apiKeyIds?: Array<string>, models?: Array<string>, groupBy?: Array<'project_id' | 'user_id' | 'api_key_id' | 'model'>, limit?: number, page?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'startTime' is not null or undefined
        if (startTime === null || startTime === undefined) {
            throw new RequiredError("UsageApi", "usageModerations", "startTime");
        }











        // Path Params
        const localVarPath = '/organization/usage/moderations';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (startTime !== undefined) {
            requestContext.setQueryParam("start_time", ObjectSerializer.serialize(startTime, "number", ""));
        }

        // Query Params
        if (endTime !== undefined) {
            requestContext.setQueryParam("end_time", ObjectSerializer.serialize(endTime, "number", ""));
        }

        // Query Params
        if (bucketWidth !== undefined) {
            requestContext.setQueryParam("bucket_width", ObjectSerializer.serialize(bucketWidth, "'1m' | '1h' | '1d'", ""));
        }

        // Query Params
        if (projectIds !== undefined) {
            const serializedParams = ObjectSerializer.serialize(projectIds, "Array<string>", "");
            for (const serializedParam of serializedParams) {
                requestContext.appendQueryParam("project_ids", serializedParam);
            }
        }

        // Query Params
        if (userIds !== undefined) {
            const serializedParams = ObjectSerializer.serialize(userIds, "Array<string>", "");
            for (const serializedParam of serializedParams) {
                requestContext.appendQueryParam("user_ids", serializedParam);
            }
        }

        // Query Params
        if (apiKeyIds !== undefined) {
            const serializedParams = ObjectSerializer.serialize(apiKeyIds, "Array<string>", "");
            for (const serializedParam of serializedParams) {
                requestContext.appendQueryParam("api_key_ids", serializedParam);
            }
        }

        // Query Params
        if (models !== undefined) {
            const serializedParams = ObjectSerializer.serialize(models, "Array<string>", "");
            for (const serializedParam of serializedParams) {
                requestContext.appendQueryParam("models", serializedParam);
            }
        }

        // Query Params
        if (groupBy !== undefined) {
            const serializedParams = ObjectSerializer.serialize(groupBy, "Array<'project_id' | 'user_id' | 'api_key_id' | 'model'>", "");
            for (const serializedParam of serializedParams) {
                requestContext.appendQueryParam("group_by", serializedParam);
            }
        }

        // Query Params
        if (limit !== undefined) {
            requestContext.setQueryParam("limit", ObjectSerializer.serialize(limit, "number", ""));
        }

        // Query Params
        if (page !== undefined) {
            requestContext.setQueryParam("page", ObjectSerializer.serialize(page, "string", ""));
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
     * Get vector stores usage details for the organization.
     * @param startTime Start time (Unix seconds) of the query time range, inclusive.
     * @param endTime End time (Unix seconds) of the query time range, exclusive.
     * @param bucketWidth Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.
     * @param projectIds Return only usage for these projects.
     * @param groupBy Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;.
     * @param limit Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 
     * @param page A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.
     */
    public async usageVectorStores(startTime: number, endTime?: number, bucketWidth?: '1m' | '1h' | '1d', projectIds?: Array<string>, groupBy?: Array<'project_id'>, limit?: number, page?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'startTime' is not null or undefined
        if (startTime === null || startTime === undefined) {
            throw new RequiredError("UsageApi", "usageVectorStores", "startTime");
        }








        // Path Params
        const localVarPath = '/organization/usage/vector_stores';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (startTime !== undefined) {
            requestContext.setQueryParam("start_time", ObjectSerializer.serialize(startTime, "number", ""));
        }

        // Query Params
        if (endTime !== undefined) {
            requestContext.setQueryParam("end_time", ObjectSerializer.serialize(endTime, "number", ""));
        }

        // Query Params
        if (bucketWidth !== undefined) {
            requestContext.setQueryParam("bucket_width", ObjectSerializer.serialize(bucketWidth, "'1m' | '1h' | '1d'", ""));
        }

        // Query Params
        if (projectIds !== undefined) {
            const serializedParams = ObjectSerializer.serialize(projectIds, "Array<string>", "");
            for (const serializedParam of serializedParams) {
                requestContext.appendQueryParam("project_ids", serializedParam);
            }
        }

        // Query Params
        if (groupBy !== undefined) {
            const serializedParams = ObjectSerializer.serialize(groupBy, "Array<'project_id'>", "");
            for (const serializedParam of serializedParams) {
                requestContext.appendQueryParam("group_by", serializedParam);
            }
        }

        // Query Params
        if (limit !== undefined) {
            requestContext.setQueryParam("limit", ObjectSerializer.serialize(limit, "number", ""));
        }

        // Query Params
        if (page !== undefined) {
            requestContext.setQueryParam("page", ObjectSerializer.serialize(page, "string", ""));
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

}

export class UsageApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to usageAudioSpeeches
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async usageAudioSpeechesWithHttpInfo(response: ResponseContext): Promise<HttpInfo<UsageResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: UsageResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "UsageResponse", ""
            ) as UsageResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: UsageResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "UsageResponse", ""
            ) as UsageResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to usageAudioTranscriptions
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async usageAudioTranscriptionsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<UsageResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: UsageResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "UsageResponse", ""
            ) as UsageResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: UsageResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "UsageResponse", ""
            ) as UsageResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to usageCodeInterpreterSessions
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async usageCodeInterpreterSessionsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<UsageResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: UsageResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "UsageResponse", ""
            ) as UsageResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: UsageResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "UsageResponse", ""
            ) as UsageResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to usageCompletions
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async usageCompletionsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<UsageResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: UsageResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "UsageResponse", ""
            ) as UsageResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: UsageResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "UsageResponse", ""
            ) as UsageResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to usageCosts
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async usageCostsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<UsageResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: UsageResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "UsageResponse", ""
            ) as UsageResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: UsageResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "UsageResponse", ""
            ) as UsageResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to usageEmbeddings
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async usageEmbeddingsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<UsageResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: UsageResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "UsageResponse", ""
            ) as UsageResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: UsageResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "UsageResponse", ""
            ) as UsageResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to usageImages
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async usageImagesWithHttpInfo(response: ResponseContext): Promise<HttpInfo<UsageResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: UsageResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "UsageResponse", ""
            ) as UsageResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: UsageResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "UsageResponse", ""
            ) as UsageResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to usageModerations
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async usageModerationsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<UsageResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: UsageResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "UsageResponse", ""
            ) as UsageResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: UsageResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "UsageResponse", ""
            ) as UsageResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to usageVectorStores
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async usageVectorStoresWithHttpInfo(response: ResponseContext): Promise<HttpInfo<UsageResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: UsageResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "UsageResponse", ""
            ) as UsageResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: UsageResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "UsageResponse", ""
            ) as UsageResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

}
