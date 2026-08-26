package org.openapitools.api.consumer;

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
import org.openapitools.api.interfaces.OrganizationService;
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
@RequestMapping("/organization")
public class OrganizationServiceController {

    @DubboReference
    private OrganizationService organizationService;

    @RequestMapping(method = RequestMethod.POST, value = "/admin_api_keys")
    public AdminApiKey adminApiKeysCreate(
        @RequestParam(name = "adminApiKeysCreateRequest") AdminApiKeysCreateRequest adminApiKeysCreateRequest
    ) {
        return organizationService.adminApiKeysCreate(adminApiKeysCreateRequest);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/admin_api_keys/{key_id}")
    public AdminApiKeysDelete200Response adminApiKeysDelete(
        @RequestParam(name = "keyId") String keyId
    ) {
        return organizationService.adminApiKeysDelete(keyId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/admin_api_keys/{key_id}")
    public AdminApiKey adminApiKeysGet(
        @RequestParam(name = "keyId") String keyId
    ) {
        return organizationService.adminApiKeysGet(keyId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/admin_api_keys")
    public ApiKeyList adminApiKeysList(
        @RequestParam(name = "after") String after,
        @RequestParam(name = "order", defaultValue = "asc") String order,
        @RequestParam(name = "limit", defaultValue = "20") Integer limit
    ) {
        return organizationService.adminApiKeysList(after, order, limit);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/projects/{project_id}/archive")
    public Project archiveProject(
        @RequestParam(name = "projectId") String projectId
    ) {
        return organizationService.archiveProject(projectId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/projects")
    public Project createProject(
        @RequestParam(name = "projectCreateRequest") ProjectCreateRequest projectCreateRequest
    ) {
        return organizationService.createProject(projectCreateRequest);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/projects/{project_id}/service_accounts")
    public ProjectServiceAccountCreateResponse createProjectServiceAccount(
        @RequestParam(name = "projectId") String projectId,
        @RequestParam(name = "projectServiceAccountCreateRequest") ProjectServiceAccountCreateRequest projectServiceAccountCreateRequest
    ) {
        return organizationService.createProjectServiceAccount(projectId, projectServiceAccountCreateRequest);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/projects/{project_id}/users")
    public ProjectUser createProjectUser(
        @RequestParam(name = "projectId") String projectId,
        @RequestParam(name = "projectUserCreateRequest") ProjectUserCreateRequest projectUserCreateRequest
    ) {
        return organizationService.createProjectUser(projectId, projectUserCreateRequest);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/invites/{invite_id}")
    public InviteDeleteResponse deleteInvite(
        @RequestParam(name = "inviteId") String inviteId
    ) {
        return organizationService.deleteInvite(inviteId);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/projects/{project_id}/api_keys/{key_id}")
    public ProjectApiKeyDeleteResponse deleteProjectApiKey(
        @RequestParam(name = "projectId") String projectId,
        @RequestParam(name = "keyId") String keyId
    ) {
        return organizationService.deleteProjectApiKey(projectId, keyId);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/projects/{project_id}/service_accounts/{service_account_id}")
    public ProjectServiceAccountDeleteResponse deleteProjectServiceAccount(
        @RequestParam(name = "projectId") String projectId,
        @RequestParam(name = "serviceAccountId") String serviceAccountId
    ) {
        return organizationService.deleteProjectServiceAccount(projectId, serviceAccountId);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/projects/{project_id}/users/{user_id}")
    public ProjectUserDeleteResponse deleteProjectUser(
        @RequestParam(name = "projectId") String projectId,
        @RequestParam(name = "userId") String userId
    ) {
        return organizationService.deleteProjectUser(projectId, userId);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/users/{user_id}")
    public UserDeleteResponse deleteUser(
        @RequestParam(name = "userId") String userId
    ) {
        return organizationService.deleteUser(userId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/invites")
    public Invite inviteUser(
        @RequestParam(name = "inviteRequest") InviteRequest inviteRequest
    ) {
        return organizationService.inviteUser(inviteRequest);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/audit_logs")
    public ListAuditLogsResponse listAuditLogs(
        @RequestParam(name = "effectiveAt") ListAuditLogsEffectiveAtParameter effectiveAt,
        @RequestParam(name = "projectIds") List<String> projectIds,
        @RequestParam(name = "eventTypes") List<AuditLogEventType> eventTypes,
        @RequestParam(name = "actorIds") List<String> actorIds,
        @RequestParam(name = "actorEmails") List<String> actorEmails,
        @RequestParam(name = "resourceIds") List<String> resourceIds,
        @RequestParam(name = "limit", defaultValue = "20") Integer limit,
        @RequestParam(name = "after") String after,
        @RequestParam(name = "before") String before
    ) {
        return organizationService.listAuditLogs(effectiveAt, projectIds, eventTypes, actorIds, actorEmails, resourceIds, limit, after, before);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/invites")
    public InviteListResponse listInvites(
        @RequestParam(name = "limit", defaultValue = "20") Integer limit,
        @RequestParam(name = "after") String after
    ) {
        return organizationService.listInvites(limit, after);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/projects/{project_id}/api_keys")
    public ProjectApiKeyListResponse listProjectApiKeys(
        @RequestParam(name = "projectId") String projectId,
        @RequestParam(name = "limit", defaultValue = "20") Integer limit,
        @RequestParam(name = "after") String after
    ) {
        return organizationService.listProjectApiKeys(projectId, limit, after);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/projects/{project_id}/rate_limits")
    public ProjectRateLimitListResponse listProjectRateLimits(
        @RequestParam(name = "projectId") String projectId,
        @RequestParam(name = "limit", defaultValue = "100") Integer limit,
        @RequestParam(name = "after") String after,
        @RequestParam(name = "before") String before
    ) {
        return organizationService.listProjectRateLimits(projectId, limit, after, before);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/projects/{project_id}/service_accounts")
    public ProjectServiceAccountListResponse listProjectServiceAccounts(
        @RequestParam(name = "projectId") String projectId,
        @RequestParam(name = "limit", defaultValue = "20") Integer limit,
        @RequestParam(name = "after") String after
    ) {
        return organizationService.listProjectServiceAccounts(projectId, limit, after);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/projects/{project_id}/users")
    public ProjectUserListResponse listProjectUsers(
        @RequestParam(name = "projectId") String projectId,
        @RequestParam(name = "limit", defaultValue = "20") Integer limit,
        @RequestParam(name = "after") String after
    ) {
        return organizationService.listProjectUsers(projectId, limit, after);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/projects")
    public ProjectListResponse listProjects(
        @RequestParam(name = "limit", defaultValue = "20") Integer limit,
        @RequestParam(name = "after") String after,
        @RequestParam(name = "includeArchived", defaultValue = "false") Boolean includeArchived
    ) {
        return organizationService.listProjects(limit, after, includeArchived);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/users")
    public UserListResponse listUsers(
        @RequestParam(name = "limit", defaultValue = "20") Integer limit,
        @RequestParam(name = "after") String after
    ) {
        return organizationService.listUsers(limit, after);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/projects/{project_id}")
    public Project modifyProject(
        @RequestParam(name = "projectId") String projectId,
        @RequestParam(name = "projectUpdateRequest") ProjectUpdateRequest projectUpdateRequest
    ) {
        return organizationService.modifyProject(projectId, projectUpdateRequest);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/projects/{project_id}/users/{user_id}")
    public ProjectUser modifyProjectUser(
        @RequestParam(name = "projectId") String projectId,
        @RequestParam(name = "userId") String userId,
        @RequestParam(name = "projectUserUpdateRequest") ProjectUserUpdateRequest projectUserUpdateRequest
    ) {
        return organizationService.modifyProjectUser(projectId, userId, projectUserUpdateRequest);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/users/{user_id}")
    public User modifyUser(
        @RequestParam(name = "userId") String userId,
        @RequestParam(name = "userRoleUpdateRequest") UserRoleUpdateRequest userRoleUpdateRequest
    ) {
        return organizationService.modifyUser(userId, userRoleUpdateRequest);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/invites/{invite_id}")
    public Invite retrieveInvite(
        @RequestParam(name = "inviteId") String inviteId
    ) {
        return organizationService.retrieveInvite(inviteId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/projects/{project_id}")
    public Project retrieveProject(
        @RequestParam(name = "projectId") String projectId
    ) {
        return organizationService.retrieveProject(projectId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/projects/{project_id}/api_keys/{key_id}")
    public ProjectApiKey retrieveProjectApiKey(
        @RequestParam(name = "projectId") String projectId,
        @RequestParam(name = "keyId") String keyId
    ) {
        return organizationService.retrieveProjectApiKey(projectId, keyId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/projects/{project_id}/service_accounts/{service_account_id}")
    public ProjectServiceAccount retrieveProjectServiceAccount(
        @RequestParam(name = "projectId") String projectId,
        @RequestParam(name = "serviceAccountId") String serviceAccountId
    ) {
        return organizationService.retrieveProjectServiceAccount(projectId, serviceAccountId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/projects/{project_id}/users/{user_id}")
    public ProjectUser retrieveProjectUser(
        @RequestParam(name = "projectId") String projectId,
        @RequestParam(name = "userId") String userId
    ) {
        return organizationService.retrieveProjectUser(projectId, userId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/users/{user_id}")
    public User retrieveUser(
        @RequestParam(name = "userId") String userId
    ) {
        return organizationService.retrieveUser(userId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/projects/{project_id}/rate_limits/{rate_limit_id}")
    public ProjectRateLimit updateProjectRateLimits(
        @RequestParam(name = "projectId") String projectId,
        @RequestParam(name = "rateLimitId") String rateLimitId,
        @RequestParam(name = "projectRateLimitUpdateRequest") ProjectRateLimitUpdateRequest projectRateLimitUpdateRequest
    ) {
        return organizationService.updateProjectRateLimits(projectId, rateLimitId, projectRateLimitUpdateRequest);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/usage/audio_speeches")
    public UsageResponse usageAudioSpeeches(
        @RequestParam(name = "startTime") Integer startTime,
        @RequestParam(name = "endTime") Integer endTime,
        @RequestParam(name = "bucketWidth", defaultValue = "1d") String bucketWidth,
        @RequestParam(name = "projectIds") List<String> projectIds,
        @RequestParam(name = "userIds") List<String> userIds,
        @RequestParam(name = "apiKeyIds") List<String> apiKeyIds,
        @RequestParam(name = "models") List<String> models,
        @RequestParam(name = "groupBy") List<String> groupBy,
        @RequestParam(name = "limit") Integer limit,
        @RequestParam(name = "page") String page
    ) {
        return organizationService.usageAudioSpeeches(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/usage/audio_transcriptions")
    public UsageResponse usageAudioTranscriptions(
        @RequestParam(name = "startTime") Integer startTime,
        @RequestParam(name = "endTime") Integer endTime,
        @RequestParam(name = "bucketWidth", defaultValue = "1d") String bucketWidth,
        @RequestParam(name = "projectIds") List<String> projectIds,
        @RequestParam(name = "userIds") List<String> userIds,
        @RequestParam(name = "apiKeyIds") List<String> apiKeyIds,
        @RequestParam(name = "models") List<String> models,
        @RequestParam(name = "groupBy") List<String> groupBy,
        @RequestParam(name = "limit") Integer limit,
        @RequestParam(name = "page") String page
    ) {
        return organizationService.usageAudioTranscriptions(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/usage/code_interpreter_sessions")
    public UsageResponse usageCodeInterpreterSessions(
        @RequestParam(name = "startTime") Integer startTime,
        @RequestParam(name = "endTime") Integer endTime,
        @RequestParam(name = "bucketWidth", defaultValue = "1d") String bucketWidth,
        @RequestParam(name = "projectIds") List<String> projectIds,
        @RequestParam(name = "groupBy") List<String> groupBy,
        @RequestParam(name = "limit") Integer limit,
        @RequestParam(name = "page") String page
    ) {
        return organizationService.usageCodeInterpreterSessions(startTime, endTime, bucketWidth, projectIds, groupBy, limit, page);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/usage/completions")
    public UsageResponse usageCompletions(
        @RequestParam(name = "startTime") Integer startTime,
        @RequestParam(name = "endTime") Integer endTime,
        @RequestParam(name = "bucketWidth", defaultValue = "1d") String bucketWidth,
        @RequestParam(name = "projectIds") List<String> projectIds,
        @RequestParam(name = "userIds") List<String> userIds,
        @RequestParam(name = "apiKeyIds") List<String> apiKeyIds,
        @RequestParam(name = "models") List<String> models,
        @RequestParam(name = "batch") Boolean batch,
        @RequestParam(name = "groupBy") List<String> groupBy,
        @RequestParam(name = "limit") Integer limit,
        @RequestParam(name = "page") String page
    ) {
        return organizationService.usageCompletions(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, batch, groupBy, limit, page);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/costs")
    public UsageResponse usageCosts(
        @RequestParam(name = "startTime") Integer startTime,
        @RequestParam(name = "endTime") Integer endTime,
        @RequestParam(name = "bucketWidth", defaultValue = "1d") String bucketWidth,
        @RequestParam(name = "projectIds") List<String> projectIds,
        @RequestParam(name = "groupBy") List<String> groupBy,
        @RequestParam(name = "limit", defaultValue = "7") Integer limit,
        @RequestParam(name = "page") String page
    ) {
        return organizationService.usageCosts(startTime, endTime, bucketWidth, projectIds, groupBy, limit, page);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/usage/embeddings")
    public UsageResponse usageEmbeddings(
        @RequestParam(name = "startTime") Integer startTime,
        @RequestParam(name = "endTime") Integer endTime,
        @RequestParam(name = "bucketWidth", defaultValue = "1d") String bucketWidth,
        @RequestParam(name = "projectIds") List<String> projectIds,
        @RequestParam(name = "userIds") List<String> userIds,
        @RequestParam(name = "apiKeyIds") List<String> apiKeyIds,
        @RequestParam(name = "models") List<String> models,
        @RequestParam(name = "groupBy") List<String> groupBy,
        @RequestParam(name = "limit") Integer limit,
        @RequestParam(name = "page") String page
    ) {
        return organizationService.usageEmbeddings(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/usage/images")
    public UsageResponse usageImages(
        @RequestParam(name = "startTime") Integer startTime,
        @RequestParam(name = "endTime") Integer endTime,
        @RequestParam(name = "bucketWidth", defaultValue = "1d") String bucketWidth,
        @RequestParam(name = "sources") List<String> sources,
        @RequestParam(name = "sizes") List<String> sizes,
        @RequestParam(name = "projectIds") List<String> projectIds,
        @RequestParam(name = "userIds") List<String> userIds,
        @RequestParam(name = "apiKeyIds") List<String> apiKeyIds,
        @RequestParam(name = "models") List<String> models,
        @RequestParam(name = "groupBy") List<String> groupBy,
        @RequestParam(name = "limit") Integer limit,
        @RequestParam(name = "page") String page
    ) {
        return organizationService.usageImages(startTime, endTime, bucketWidth, sources, sizes, projectIds, userIds, apiKeyIds, models, groupBy, limit, page);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/usage/moderations")
    public UsageResponse usageModerations(
        @RequestParam(name = "startTime") Integer startTime,
        @RequestParam(name = "endTime") Integer endTime,
        @RequestParam(name = "bucketWidth", defaultValue = "1d") String bucketWidth,
        @RequestParam(name = "projectIds") List<String> projectIds,
        @RequestParam(name = "userIds") List<String> userIds,
        @RequestParam(name = "apiKeyIds") List<String> apiKeyIds,
        @RequestParam(name = "models") List<String> models,
        @RequestParam(name = "groupBy") List<String> groupBy,
        @RequestParam(name = "limit") Integer limit,
        @RequestParam(name = "page") String page
    ) {
        return organizationService.usageModerations(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/usage/vector_stores")
    public UsageResponse usageVectorStores(
        @RequestParam(name = "startTime") Integer startTime,
        @RequestParam(name = "endTime") Integer endTime,
        @RequestParam(name = "bucketWidth", defaultValue = "1d") String bucketWidth,
        @RequestParam(name = "projectIds") List<String> projectIds,
        @RequestParam(name = "groupBy") List<String> groupBy,
        @RequestParam(name = "limit") Integer limit,
        @RequestParam(name = "page") String page
    ) {
        return organizationService.usageVectorStores(startTime, endTime, bucketWidth, projectIds, groupBy, limit, page);
    }
}
