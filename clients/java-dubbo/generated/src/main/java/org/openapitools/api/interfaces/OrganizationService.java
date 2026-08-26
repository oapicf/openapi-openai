package org.openapitools.api.interfaces;

import org.openapitools.model.AdminApiKey;
import org.openapitools.model.AdminApiKeysCreateRequest;
import org.openapitools.model.AdminApiKeysDelete200Response;
import org.openapitools.model.ApiKeyList;
import org.openapitools.model.AuditLogEventType;
import org.openapitools.model.ErrorResponse;
import org.openapitools.model.Invite;
import org.openapitools.model.InviteDeleteResponse;
import org.openapitools.model.InviteListResponse;
import org.openapitools.model.InviteRequest;
import org.openapitools.model.ListAuditLogsEffectiveAtParameter;
import org.openapitools.model.ListAuditLogsResponse;
import org.openapitools.model.Project;
import org.openapitools.model.ProjectApiKey;
import org.openapitools.model.ProjectApiKeyDeleteResponse;
import org.openapitools.model.ProjectApiKeyListResponse;
import org.openapitools.model.ProjectCreateRequest;
import org.openapitools.model.ProjectListResponse;
import org.openapitools.model.ProjectRateLimit;
import org.openapitools.model.ProjectRateLimitListResponse;
import org.openapitools.model.ProjectRateLimitUpdateRequest;
import org.openapitools.model.ProjectServiceAccount;
import org.openapitools.model.ProjectServiceAccountCreateRequest;
import org.openapitools.model.ProjectServiceAccountCreateResponse;
import org.openapitools.model.ProjectServiceAccountDeleteResponse;
import org.openapitools.model.ProjectServiceAccountListResponse;
import org.openapitools.model.ProjectUpdateRequest;
import org.openapitools.model.ProjectUser;
import org.openapitools.model.ProjectUserCreateRequest;
import org.openapitools.model.ProjectUserDeleteResponse;
import org.openapitools.model.ProjectUserListResponse;
import org.openapitools.model.ProjectUserUpdateRequest;
import org.openapitools.model.UsageResponse;
import org.openapitools.model.User;
import org.openapitools.model.UserDeleteResponse;
import org.openapitools.model.UserListResponse;
import org.openapitools.model.UserRoleUpdateRequest;
import org.openapitools.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public interface OrganizationService {

    /**
     * Create an organization admin API key
     * Create a new admin-level API key for the organization.
     *
     * @param adminApiKeysCreateRequest  (required)
     * @return AdminApiKey
     */
    AdminApiKey adminApiKeysCreate(
        AdminApiKeysCreateRequest adminApiKeysCreateRequest
    );

    /**
     * Delete an organization admin API key
     * Delete the specified admin API key.
     *
     * @param keyId  (required)
     * @return AdminApiKeysDelete200Response
     */
    AdminApiKeysDelete200Response adminApiKeysDelete(
        String keyId
    );

    /**
     * Retrieve a single organization API key
     * Get details for a specific organization API key by its ID.
     *
     * @param keyId  (required)
     * @return AdminApiKey
     */
    AdminApiKey adminApiKeysGet(
        String keyId
    );

    /**
     * List organization API keys
     * Retrieve a paginated list of organization admin API keys.
     *
     * @param after  (optional)
     * @param order  (optional, default to asc)
     * @param limit  (optional, default to 20)
     * @return ApiKeyList
     */
    ApiKeyList adminApiKeysList(
        String after,
        String order,
        Integer limit
    );

    /**
     * Archives a project in the organization. Archived projects cannot be used or updated.
     * 
     *
     * @param projectId The ID of the project. (required)
     * @return Project
     */
    Project archiveProject(
        String projectId
    );

    /**
     * Create a new project in the organization. Projects can be created and archived, but cannot be deleted.
     * 
     *
     * @param projectCreateRequest The project create request payload. (required)
     * @return Project
     */
    Project createProject(
        ProjectCreateRequest projectCreateRequest
    );

    /**
     * Creates a new service account in the project. This also returns an unredacted API key for the service account.
     * 
     *
     * @param projectId The ID of the project. (required)
     * @param projectServiceAccountCreateRequest The project service account create request payload. (required)
     * @return ProjectServiceAccountCreateResponse
     */
    ProjectServiceAccountCreateResponse createProjectServiceAccount(
        String projectId,
        ProjectServiceAccountCreateRequest projectServiceAccountCreateRequest
    );

    /**
     * Adds a user to the project. Users must already be members of the organization to be added to a project.
     * 
     *
     * @param projectId The ID of the project. (required)
     * @param projectUserCreateRequest The project user create request payload. (required)
     * @return ProjectUser
     */
    ProjectUser createProjectUser(
        String projectId,
        ProjectUserCreateRequest projectUserCreateRequest
    );

    /**
     * Delete an invite. If the invite has already been accepted, it cannot be deleted.
     * 
     *
     * @param inviteId The ID of the invite to delete. (required)
     * @return InviteDeleteResponse
     */
    InviteDeleteResponse deleteInvite(
        String inviteId
    );

    /**
     * Deletes an API key from the project.
     * 
     *
     * @param projectId The ID of the project. (required)
     * @param keyId The ID of the API key. (required)
     * @return ProjectApiKeyDeleteResponse
     */
    ProjectApiKeyDeleteResponse deleteProjectApiKey(
        String projectId,
        String keyId
    );

    /**
     * Deletes a service account from the project.
     * 
     *
     * @param projectId The ID of the project. (required)
     * @param serviceAccountId The ID of the service account. (required)
     * @return ProjectServiceAccountDeleteResponse
     */
    ProjectServiceAccountDeleteResponse deleteProjectServiceAccount(
        String projectId,
        String serviceAccountId
    );

    /**
     * Deletes a user from the project.
     * 
     *
     * @param projectId The ID of the project. (required)
     * @param userId The ID of the user. (required)
     * @return ProjectUserDeleteResponse
     */
    ProjectUserDeleteResponse deleteProjectUser(
        String projectId,
        String userId
    );

    /**
     * Deletes a user from the organization.
     * 
     *
     * @param userId The ID of the user. (required)
     * @return UserDeleteResponse
     */
    UserDeleteResponse deleteUser(
        String userId
    );

    /**
     * Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.
     * 
     *
     * @param inviteRequest The invite request payload. (required)
     * @return Invite
     */
    Invite inviteUser(
        InviteRequest inviteRequest
    );

    /**
     * List user actions and configuration changes within this organization.
     * 
     *
     * @param effectiveAt Return only events whose &#x60;effective_at&#x60; (Unix seconds) is in this range. (optional)
     * @param projectIds Return only events for these projects. (optional)
     * @param eventTypes Return only events with a &#x60;type&#x60; in one of these values. For example, &#x60;project.created&#x60;. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object). (optional)
     * @param actorIds Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID. (optional)
     * @param actorEmails Return only events performed by users with these emails. (optional)
     * @param resourceIds Return only events performed on these targets. For example, a project ID updated. (optional)
     * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to 20)
     * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  (optional)
     * @param before A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  (optional)
     * @return ListAuditLogsResponse
     */
    ListAuditLogsResponse listAuditLogs(
        ListAuditLogsEffectiveAtParameter effectiveAt,
        List<String> projectIds,
        List<AuditLogEventType> eventTypes,
        List<String> actorIds,
        List<String> actorEmails,
        List<String> resourceIds,
        Integer limit,
        String after,
        String before
    );

    /**
     * Returns a list of invites in the organization.
     * 
     *
     * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to 20)
     * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  (optional)
     * @return InviteListResponse
     */
    InviteListResponse listInvites(
        Integer limit,
        String after
    );

    /**
     * Returns a list of API keys in the project.
     * 
     *
     * @param projectId The ID of the project. (required)
     * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to 20)
     * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  (optional)
     * @return ProjectApiKeyListResponse
     */
    ProjectApiKeyListResponse listProjectApiKeys(
        String projectId,
        Integer limit,
        String after
    );

    /**
     * Returns the rate limits per model for a project.
     * 
     *
     * @param projectId The ID of the project. (required)
     * @param limit A limit on the number of objects to be returned. The default is 100.  (optional, default to 100)
     * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  (optional)
     * @param before A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, beginning with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  (optional)
     * @return ProjectRateLimitListResponse
     */
    ProjectRateLimitListResponse listProjectRateLimits(
        String projectId,
        Integer limit,
        String after,
        String before
    );

    /**
     * Returns a list of service accounts in the project.
     * 
     *
     * @param projectId The ID of the project. (required)
     * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to 20)
     * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  (optional)
     * @return ProjectServiceAccountListResponse
     */
    ProjectServiceAccountListResponse listProjectServiceAccounts(
        String projectId,
        Integer limit,
        String after
    );

    /**
     * Returns a list of users in the project.
     * 
     *
     * @param projectId The ID of the project. (required)
     * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to 20)
     * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  (optional)
     * @return ProjectUserListResponse
     */
    ProjectUserListResponse listProjectUsers(
        String projectId,
        Integer limit,
        String after
    );

    /**
     * Returns a list of projects.
     * 
     *
     * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to 20)
     * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  (optional)
     * @param includeArchived If &#x60;true&#x60; returns all projects including those that have been &#x60;archived&#x60;. Archived projects are not included by default. (optional, default to false)
     * @return ProjectListResponse
     */
    ProjectListResponse listProjects(
        Integer limit,
        String after,
        Boolean includeArchived
    );

    /**
     * Lists all of the users in the organization.
     * 
     *
     * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to 20)
     * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  (optional)
     * @return UserListResponse
     */
    UserListResponse listUsers(
        Integer limit,
        String after
    );

    /**
     * Modifies a project in the organization.
     * 
     *
     * @param projectId The ID of the project. (required)
     * @param projectUpdateRequest The project update request payload. (required)
     * @return Project
     */
    Project modifyProject(
        String projectId,
        ProjectUpdateRequest projectUpdateRequest
    );

    /**
     * Modifies a user&#39;s role in the project.
     * 
     *
     * @param projectId The ID of the project. (required)
     * @param userId The ID of the user. (required)
     * @param projectUserUpdateRequest The project user update request payload. (required)
     * @return ProjectUser
     */
    ProjectUser modifyProjectUser(
        String projectId,
        String userId,
        ProjectUserUpdateRequest projectUserUpdateRequest
    );

    /**
     * Modifies a user&#39;s role in the organization.
     * 
     *
     * @param userId The ID of the user. (required)
     * @param userRoleUpdateRequest The new user role to modify. This must be one of &#x60;owner&#x60; or &#x60;member&#x60;. (required)
     * @return User
     */
    User modifyUser(
        String userId,
        UserRoleUpdateRequest userRoleUpdateRequest
    );

    /**
     * Retrieves an invite.
     * 
     *
     * @param inviteId The ID of the invite to retrieve. (required)
     * @return Invite
     */
    Invite retrieveInvite(
        String inviteId
    );

    /**
     * Retrieves a project.
     * 
     *
     * @param projectId The ID of the project. (required)
     * @return Project
     */
    Project retrieveProject(
        String projectId
    );

    /**
     * Retrieves an API key in the project.
     * 
     *
     * @param projectId The ID of the project. (required)
     * @param keyId The ID of the API key. (required)
     * @return ProjectApiKey
     */
    ProjectApiKey retrieveProjectApiKey(
        String projectId,
        String keyId
    );

    /**
     * Retrieves a service account in the project.
     * 
     *
     * @param projectId The ID of the project. (required)
     * @param serviceAccountId The ID of the service account. (required)
     * @return ProjectServiceAccount
     */
    ProjectServiceAccount retrieveProjectServiceAccount(
        String projectId,
        String serviceAccountId
    );

    /**
     * Retrieves a user in the project.
     * 
     *
     * @param projectId The ID of the project. (required)
     * @param userId The ID of the user. (required)
     * @return ProjectUser
     */
    ProjectUser retrieveProjectUser(
        String projectId,
        String userId
    );

    /**
     * Retrieves a user by their identifier.
     * 
     *
     * @param userId The ID of the user. (required)
     * @return User
     */
    User retrieveUser(
        String userId
    );

    /**
     * Updates a project rate limit.
     * 
     *
     * @param projectId The ID of the project. (required)
     * @param rateLimitId The ID of the rate limit. (required)
     * @param projectRateLimitUpdateRequest The project rate limit update request payload. (required)
     * @return ProjectRateLimit
     */
    ProjectRateLimit updateProjectRateLimits(
        String projectId,
        String rateLimitId,
        ProjectRateLimitUpdateRequest projectRateLimitUpdateRequest
    );

    /**
     * Get audio speeches usage details for the organization.
     * 
     *
     * @param startTime Start time (Unix seconds) of the query time range, inclusive. (required)
     * @param endTime End time (Unix seconds) of the query time range, exclusive. (optional)
     * @param bucketWidth Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. (optional, default to 1d)
     * @param projectIds Return only usage for these projects. (optional)
     * @param userIds Return only usage for these users. (optional)
     * @param apiKeyIds Return only usage for these API keys. (optional)
     * @param models Return only usage for these models. (optional)
     * @param groupBy Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. (optional)
     * @param limit Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  (optional)
     * @param page A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. (optional)
     * @return UsageResponse
     */
    UsageResponse usageAudioSpeeches(
        Integer startTime,
        Integer endTime,
        String bucketWidth,
        List<String> projectIds,
        List<String> userIds,
        List<String> apiKeyIds,
        List<String> models,
        List<String> groupBy,
        Integer limit,
        String page
    );

    /**
     * Get audio transcriptions usage details for the organization.
     * 
     *
     * @param startTime Start time (Unix seconds) of the query time range, inclusive. (required)
     * @param endTime End time (Unix seconds) of the query time range, exclusive. (optional)
     * @param bucketWidth Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. (optional, default to 1d)
     * @param projectIds Return only usage for these projects. (optional)
     * @param userIds Return only usage for these users. (optional)
     * @param apiKeyIds Return only usage for these API keys. (optional)
     * @param models Return only usage for these models. (optional)
     * @param groupBy Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. (optional)
     * @param limit Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  (optional)
     * @param page A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. (optional)
     * @return UsageResponse
     */
    UsageResponse usageAudioTranscriptions(
        Integer startTime,
        Integer endTime,
        String bucketWidth,
        List<String> projectIds,
        List<String> userIds,
        List<String> apiKeyIds,
        List<String> models,
        List<String> groupBy,
        Integer limit,
        String page
    );

    /**
     * Get code interpreter sessions usage details for the organization.
     * 
     *
     * @param startTime Start time (Unix seconds) of the query time range, inclusive. (required)
     * @param endTime End time (Unix seconds) of the query time range, exclusive. (optional)
     * @param bucketWidth Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. (optional, default to 1d)
     * @param projectIds Return only usage for these projects. (optional)
     * @param groupBy Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;. (optional)
     * @param limit Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  (optional)
     * @param page A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. (optional)
     * @return UsageResponse
     */
    UsageResponse usageCodeInterpreterSessions(
        Integer startTime,
        Integer endTime,
        String bucketWidth,
        List<String> projectIds,
        List<String> groupBy,
        Integer limit,
        String page
    );

    /**
     * Get completions usage details for the organization.
     * 
     *
     * @param startTime Start time (Unix seconds) of the query time range, inclusive. (required)
     * @param endTime End time (Unix seconds) of the query time range, exclusive. (optional)
     * @param bucketWidth Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. (optional, default to 1d)
     * @param projectIds Return only usage for these projects. (optional)
     * @param userIds Return only usage for these users. (optional)
     * @param apiKeyIds Return only usage for these API keys. (optional)
     * @param models Return only usage for these models. (optional)
     * @param batch If &#x60;true&#x60;, return batch jobs only. If &#x60;false&#x60;, return non-batch jobs only. By default, return both.  (optional)
     * @param groupBy Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60;, &#x60;batch&#x60; or any combination of them. (optional)
     * @param limit Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  (optional)
     * @param page A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. (optional)
     * @return UsageResponse
     */
    UsageResponse usageCompletions(
        Integer startTime,
        Integer endTime,
        String bucketWidth,
        List<String> projectIds,
        List<String> userIds,
        List<String> apiKeyIds,
        List<String> models,
        Boolean batch,
        List<String> groupBy,
        Integer limit,
        String page
    );

    /**
     * Get costs details for the organization.
     * 
     *
     * @param startTime Start time (Unix seconds) of the query time range, inclusive. (required)
     * @param endTime End time (Unix seconds) of the query time range, exclusive. (optional)
     * @param bucketWidth Width of each time bucket in response. Currently only &#x60;1d&#x60; is supported, default to &#x60;1d&#x60;. (optional, default to 1d)
     * @param projectIds Return only costs for these projects. (optional)
     * @param groupBy Group the costs by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;line_item&#x60; and any combination of them. (optional)
     * @param limit A limit on the number of buckets to be returned. Limit can range between 1 and 180, and the default is 7.  (optional, default to 7)
     * @param page A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. (optional)
     * @return UsageResponse
     */
    UsageResponse usageCosts(
        Integer startTime,
        Integer endTime,
        String bucketWidth,
        List<String> projectIds,
        List<String> groupBy,
        Integer limit,
        String page
    );

    /**
     * Get embeddings usage details for the organization.
     * 
     *
     * @param startTime Start time (Unix seconds) of the query time range, inclusive. (required)
     * @param endTime End time (Unix seconds) of the query time range, exclusive. (optional)
     * @param bucketWidth Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. (optional, default to 1d)
     * @param projectIds Return only usage for these projects. (optional)
     * @param userIds Return only usage for these users. (optional)
     * @param apiKeyIds Return only usage for these API keys. (optional)
     * @param models Return only usage for these models. (optional)
     * @param groupBy Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. (optional)
     * @param limit Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  (optional)
     * @param page A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. (optional)
     * @return UsageResponse
     */
    UsageResponse usageEmbeddings(
        Integer startTime,
        Integer endTime,
        String bucketWidth,
        List<String> projectIds,
        List<String> userIds,
        List<String> apiKeyIds,
        List<String> models,
        List<String> groupBy,
        Integer limit,
        String page
    );

    /**
     * Get images usage details for the organization.
     * 
     *
     * @param startTime Start time (Unix seconds) of the query time range, inclusive. (required)
     * @param endTime End time (Unix seconds) of the query time range, exclusive. (optional)
     * @param bucketWidth Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. (optional, default to 1d)
     * @param sources Return only usages for these sources. Possible values are &#x60;image.generation&#x60;, &#x60;image.edit&#x60;, &#x60;image.variation&#x60; or any combination of them. (optional)
     * @param sizes Return only usages for these image sizes. Possible values are &#x60;256x256&#x60;, &#x60;512x512&#x60;, &#x60;1024x1024&#x60;, &#x60;1792x1792&#x60;, &#x60;1024x1792&#x60; or any combination of them. (optional)
     * @param projectIds Return only usage for these projects. (optional)
     * @param userIds Return only usage for these users. (optional)
     * @param apiKeyIds Return only usage for these API keys. (optional)
     * @param models Return only usage for these models. (optional)
     * @param groupBy Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60;, &#x60;size&#x60;, &#x60;source&#x60; or any combination of them. (optional)
     * @param limit Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  (optional)
     * @param page A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. (optional)
     * @return UsageResponse
     */
    UsageResponse usageImages(
        Integer startTime,
        Integer endTime,
        String bucketWidth,
        List<String> sources,
        List<String> sizes,
        List<String> projectIds,
        List<String> userIds,
        List<String> apiKeyIds,
        List<String> models,
        List<String> groupBy,
        Integer limit,
        String page
    );

    /**
     * Get moderations usage details for the organization.
     * 
     *
     * @param startTime Start time (Unix seconds) of the query time range, inclusive. (required)
     * @param endTime End time (Unix seconds) of the query time range, exclusive. (optional)
     * @param bucketWidth Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. (optional, default to 1d)
     * @param projectIds Return only usage for these projects. (optional)
     * @param userIds Return only usage for these users. (optional)
     * @param apiKeyIds Return only usage for these API keys. (optional)
     * @param models Return only usage for these models. (optional)
     * @param groupBy Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. (optional)
     * @param limit Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  (optional)
     * @param page A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. (optional)
     * @return UsageResponse
     */
    UsageResponse usageModerations(
        Integer startTime,
        Integer endTime,
        String bucketWidth,
        List<String> projectIds,
        List<String> userIds,
        List<String> apiKeyIds,
        List<String> models,
        List<String> groupBy,
        Integer limit,
        String page
    );

    /**
     * Get vector stores usage details for the organization.
     * 
     *
     * @param startTime Start time (Unix seconds) of the query time range, inclusive. (required)
     * @param endTime End time (Unix seconds) of the query time range, exclusive. (optional)
     * @param bucketWidth Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. (optional, default to 1d)
     * @param projectIds Return only usage for these projects. (optional)
     * @param groupBy Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;. (optional)
     * @param limit Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  (optional)
     * @param page A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. (optional)
     * @return UsageResponse
     */
    UsageResponse usageVectorStores(
        Integer startTime,
        Integer endTime,
        String bucketWidth,
        List<String> projectIds,
        List<String> groupBy,
        Integer limit,
        String page
    );
}
