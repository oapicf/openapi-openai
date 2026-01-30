package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

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

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-01-29T14:09:10.882541726Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public abstract class OrganizationApiService {
    public abstract Response adminApiKeysCreate(AdminApiKeysCreateRequest adminApiKeysCreateRequest,SecurityContext securityContext) throws NotFoundException;
    public abstract Response adminApiKeysDelete(String keyId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response adminApiKeysGet(String keyId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response adminApiKeysList( @Nullable String after,String order,Integer limit,SecurityContext securityContext) throws NotFoundException;
    public abstract Response archiveProject(String projectId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response createProject(ProjectCreateRequest projectCreateRequest,SecurityContext securityContext) throws NotFoundException;
    public abstract Response createProjectServiceAccount(String projectId,ProjectServiceAccountCreateRequest projectServiceAccountCreateRequest,SecurityContext securityContext) throws NotFoundException;
    public abstract Response createProjectUser(String projectId,ProjectUserCreateRequest projectUserCreateRequest,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteInvite(String inviteId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteProjectApiKey(String projectId,String keyId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteProjectServiceAccount(String projectId,String serviceAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteProjectUser(String projectId,String userId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteUser(String userId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response inviteUser(InviteRequest inviteRequest,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listAuditLogs(ListAuditLogsEffectiveAtParameter effectiveAt,List<String> projectIds,List<AuditLogEventType> eventTypes,List<String> actorIds,List<String> actorEmails,List<String> resourceIds,Integer limit,String after,String before,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listInvites(Integer limit,String after,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listProjectApiKeys(String projectId,Integer limit,String after,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listProjectRateLimits(String projectId,Integer limit,String after,String before,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listProjectServiceAccounts(String projectId,Integer limit,String after,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listProjectUsers(String projectId,Integer limit,String after,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listProjects(Integer limit,String after,Boolean includeArchived,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listUsers(Integer limit,String after,SecurityContext securityContext) throws NotFoundException;
    public abstract Response modifyProject(String projectId,ProjectUpdateRequest projectUpdateRequest,SecurityContext securityContext) throws NotFoundException;
    public abstract Response modifyProjectUser(String projectId,String userId,ProjectUserUpdateRequest projectUserUpdateRequest,SecurityContext securityContext) throws NotFoundException;
    public abstract Response modifyUser(String userId,UserRoleUpdateRequest userRoleUpdateRequest,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveInvite(String inviteId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveProject(String projectId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveProjectApiKey(String projectId,String keyId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveProjectServiceAccount(String projectId,String serviceAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveProjectUser(String projectId,String userId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveUser(String userId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateProjectRateLimits(String projectId,String rateLimitId,ProjectRateLimitUpdateRequest projectRateLimitUpdateRequest,SecurityContext securityContext) throws NotFoundException;
    public abstract Response usageAudioSpeeches( @NotNull Integer startTime,Integer endTime,String bucketWidth,List<String> projectIds,List<String> userIds,List<String> apiKeyIds,List<String> models,List<String> groupBy,Integer limit,String page,SecurityContext securityContext) throws NotFoundException;
    public abstract Response usageAudioTranscriptions( @NotNull Integer startTime,Integer endTime,String bucketWidth,List<String> projectIds,List<String> userIds,List<String> apiKeyIds,List<String> models,List<String> groupBy,Integer limit,String page,SecurityContext securityContext) throws NotFoundException;
    public abstract Response usageCodeInterpreterSessions( @NotNull Integer startTime,Integer endTime,String bucketWidth,List<String> projectIds,List<String> groupBy,Integer limit,String page,SecurityContext securityContext) throws NotFoundException;
    public abstract Response usageCompletions( @NotNull Integer startTime,Integer endTime,String bucketWidth,List<String> projectIds,List<String> userIds,List<String> apiKeyIds,List<String> models,Boolean batch,List<String> groupBy,Integer limit,String page,SecurityContext securityContext) throws NotFoundException;
    public abstract Response usageCosts( @NotNull Integer startTime,Integer endTime,String bucketWidth,List<String> projectIds,List<String> groupBy,Integer limit,String page,SecurityContext securityContext) throws NotFoundException;
    public abstract Response usageEmbeddings( @NotNull Integer startTime,Integer endTime,String bucketWidth,List<String> projectIds,List<String> userIds,List<String> apiKeyIds,List<String> models,List<String> groupBy,Integer limit,String page,SecurityContext securityContext) throws NotFoundException;
    public abstract Response usageImages( @NotNull Integer startTime,Integer endTime,String bucketWidth,List<String> sources,List<String> sizes,List<String> projectIds,List<String> userIds,List<String> apiKeyIds,List<String> models,List<String> groupBy,Integer limit,String page,SecurityContext securityContext) throws NotFoundException;
    public abstract Response usageModerations( @NotNull Integer startTime,Integer endTime,String bucketWidth,List<String> projectIds,List<String> userIds,List<String> apiKeyIds,List<String> models,List<String> groupBy,Integer limit,String page,SecurityContext securityContext) throws NotFoundException;
    public abstract Response usageVectorStores( @NotNull Integer startTime,Integer endTime,String bucketWidth,List<String> projectIds,List<String> groupBy,Integer limit,String page,SecurityContext securityContext) throws NotFoundException;
}
