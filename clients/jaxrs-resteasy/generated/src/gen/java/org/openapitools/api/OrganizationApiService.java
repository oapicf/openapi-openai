package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



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

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-01-29T14:09:21.247747647Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public interface OrganizationApiService {
      Response adminApiKeysCreate(AdminApiKeysCreateRequest adminApiKeysCreateRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response adminApiKeysDelete(String keyId,SecurityContext securityContext)
      throws NotFoundException;
      Response adminApiKeysGet(String keyId,SecurityContext securityContext)
      throws NotFoundException;
      Response adminApiKeysList(String after,String order,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response archiveProject(String projectId,SecurityContext securityContext)
      throws NotFoundException;
      Response createProject(ProjectCreateRequest projectCreateRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response createProjectServiceAccount(String projectId,ProjectServiceAccountCreateRequest projectServiceAccountCreateRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response createProjectUser(String projectId,ProjectUserCreateRequest projectUserCreateRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteInvite(String inviteId,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteProjectApiKey(String projectId,String keyId,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteProjectServiceAccount(String projectId,String serviceAccountId,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteProjectUser(String projectId,String userId,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteUser(String userId,SecurityContext securityContext)
      throws NotFoundException;
      Response inviteUser(InviteRequest inviteRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response listAuditLogs(ListAuditLogsEffectiveAtParameter effectiveAt,List<String> projectIds,List<AuditLogEventType> eventTypes,List<String> actorIds,List<String> actorEmails,List<String> resourceIds,Integer limit,String after,String before,SecurityContext securityContext)
      throws NotFoundException;
      Response listInvites(Integer limit,String after,SecurityContext securityContext)
      throws NotFoundException;
      Response listProjectApiKeys(String projectId,Integer limit,String after,SecurityContext securityContext)
      throws NotFoundException;
      Response listProjectRateLimits(String projectId,Integer limit,String after,String before,SecurityContext securityContext)
      throws NotFoundException;
      Response listProjectServiceAccounts(String projectId,Integer limit,String after,SecurityContext securityContext)
      throws NotFoundException;
      Response listProjectUsers(String projectId,Integer limit,String after,SecurityContext securityContext)
      throws NotFoundException;
      Response listProjects(Integer limit,String after,Boolean includeArchived,SecurityContext securityContext)
      throws NotFoundException;
      Response listUsers(Integer limit,String after,SecurityContext securityContext)
      throws NotFoundException;
      Response modifyProject(String projectId,ProjectUpdateRequest projectUpdateRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response modifyProjectUser(String projectId,String userId,ProjectUserUpdateRequest projectUserUpdateRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response modifyUser(String userId,UserRoleUpdateRequest userRoleUpdateRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response retrieveInvite(String inviteId,SecurityContext securityContext)
      throws NotFoundException;
      Response retrieveProject(String projectId,SecurityContext securityContext)
      throws NotFoundException;
      Response retrieveProjectApiKey(String projectId,String keyId,SecurityContext securityContext)
      throws NotFoundException;
      Response retrieveProjectServiceAccount(String projectId,String serviceAccountId,SecurityContext securityContext)
      throws NotFoundException;
      Response retrieveProjectUser(String projectId,String userId,SecurityContext securityContext)
      throws NotFoundException;
      Response retrieveUser(String userId,SecurityContext securityContext)
      throws NotFoundException;
      Response updateProjectRateLimits(String projectId,String rateLimitId,ProjectRateLimitUpdateRequest projectRateLimitUpdateRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response usageAudioSpeeches(Integer startTime,Integer endTime,String bucketWidth,List<String> projectIds,List<String> userIds,List<String> apiKeyIds,List<String> models,List<String> groupBy,Integer limit,String page,SecurityContext securityContext)
      throws NotFoundException;
      Response usageAudioTranscriptions(Integer startTime,Integer endTime,String bucketWidth,List<String> projectIds,List<String> userIds,List<String> apiKeyIds,List<String> models,List<String> groupBy,Integer limit,String page,SecurityContext securityContext)
      throws NotFoundException;
      Response usageCodeInterpreterSessions(Integer startTime,Integer endTime,String bucketWidth,List<String> projectIds,List<String> groupBy,Integer limit,String page,SecurityContext securityContext)
      throws NotFoundException;
      Response usageCompletions(Integer startTime,Integer endTime,String bucketWidth,List<String> projectIds,List<String> userIds,List<String> apiKeyIds,List<String> models,Boolean batch,List<String> groupBy,Integer limit,String page,SecurityContext securityContext)
      throws NotFoundException;
      Response usageCosts(Integer startTime,Integer endTime,String bucketWidth,List<String> projectIds,List<String> groupBy,Integer limit,String page,SecurityContext securityContext)
      throws NotFoundException;
      Response usageEmbeddings(Integer startTime,Integer endTime,String bucketWidth,List<String> projectIds,List<String> userIds,List<String> apiKeyIds,List<String> models,List<String> groupBy,Integer limit,String page,SecurityContext securityContext)
      throws NotFoundException;
      Response usageImages(Integer startTime,Integer endTime,String bucketWidth,List<String> sources,List<String> sizes,List<String> projectIds,List<String> userIds,List<String> apiKeyIds,List<String> models,List<String> groupBy,Integer limit,String page,SecurityContext securityContext)
      throws NotFoundException;
      Response usageModerations(Integer startTime,Integer endTime,String bucketWidth,List<String> projectIds,List<String> userIds,List<String> apiKeyIds,List<String> models,List<String> groupBy,Integer limit,String page,SecurityContext securityContext)
      throws NotFoundException;
      Response usageVectorStores(Integer startTime,Integer endTime,String bucketWidth,List<String> projectIds,List<String> groupBy,Integer limit,String page,SecurityContext securityContext)
      throws NotFoundException;


}
