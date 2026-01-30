// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile, HttpInfo} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';


import { AuditLogEventType } from '../models/AuditLogEventType';
import { ListAuditLogsEffectiveAtParameter } from '../models/ListAuditLogsEffectiveAtParameter';
import { ListAuditLogsResponse } from '../models/ListAuditLogsResponse';

/**
 * no description
 */
export class AuditLogsApiRequestFactory extends BaseAPIRequestFactory {

    /**
     * List user actions and configuration changes within this organization.
     * @param effectiveAt Return only events whose &#x60;effective_at&#x60; (Unix seconds) is in this range.
     * @param projectIds Return only events for these projects.
     * @param eventTypes Return only events with a &#x60;type&#x60; in one of these values. For example, &#x60;project.created&#x60;. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object).
     * @param actorIds Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID.
     * @param actorEmails Return only events performed by users with these emails.
     * @param resourceIds Return only events performed on these targets. For example, a project ID updated.
     * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     * @param before A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
     */
    public async listAuditLogs(effectiveAt?: ListAuditLogsEffectiveAtParameter, projectIds?: Array<string>, eventTypes?: Array<AuditLogEventType>, actorIds?: Array<string>, actorEmails?: Array<string>, resourceIds?: Array<string>, limit?: number, after?: string, before?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;










        // Path Params
        const localVarPath = '/organization/audit_logs';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (effectiveAt !== undefined) {
            const serializedParams = ObjectSerializer.serialize(effectiveAt, "ListAuditLogsEffectiveAtParameter", "");
            for (const key of Object.keys(serializedParams)) {
                requestContext.setQueryParam(key, serializedParams[key]);
            }
        }

        // Query Params
        if (projectIds !== undefined) {
            const serializedParams = ObjectSerializer.serialize(projectIds, "Array<string>", "");
            for (const serializedParam of serializedParams) {
                requestContext.appendQueryParam("project_ids[]", serializedParam);
            }
        }

        // Query Params
        if (eventTypes !== undefined) {
            const serializedParams = ObjectSerializer.serialize(eventTypes, "Array<AuditLogEventType>", "");
            for (const serializedParam of serializedParams) {
                requestContext.appendQueryParam("event_types[]", serializedParam);
            }
        }

        // Query Params
        if (actorIds !== undefined) {
            const serializedParams = ObjectSerializer.serialize(actorIds, "Array<string>", "");
            for (const serializedParam of serializedParams) {
                requestContext.appendQueryParam("actor_ids[]", serializedParam);
            }
        }

        // Query Params
        if (actorEmails !== undefined) {
            const serializedParams = ObjectSerializer.serialize(actorEmails, "Array<string>", "");
            for (const serializedParam of serializedParams) {
                requestContext.appendQueryParam("actor_emails[]", serializedParam);
            }
        }

        // Query Params
        if (resourceIds !== undefined) {
            const serializedParams = ObjectSerializer.serialize(resourceIds, "Array<string>", "");
            for (const serializedParam of serializedParams) {
                requestContext.appendQueryParam("resource_ids[]", serializedParam);
            }
        }

        // Query Params
        if (limit !== undefined) {
            requestContext.setQueryParam("limit", ObjectSerializer.serialize(limit, "number", ""));
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

}

export class AuditLogsApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to listAuditLogs
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async listAuditLogsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<ListAuditLogsResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: ListAuditLogsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ListAuditLogsResponse", ""
            ) as ListAuditLogsResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: ListAuditLogsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "ListAuditLogsResponse", ""
            ) as ListAuditLogsResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

}
