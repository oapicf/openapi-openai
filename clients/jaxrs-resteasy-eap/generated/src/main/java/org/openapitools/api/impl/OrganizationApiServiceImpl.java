package org.openapitools.api.impl;

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

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-01-29T14:09:29.020322047Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class OrganizationApiServiceImpl implements OrganizationApi {
      public Response adminApiKeysCreate(AdminApiKeysCreateRequest adminApiKeysCreateRequest,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response adminApiKeysDelete(String keyId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response adminApiKeysGet(String keyId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response adminApiKeysList(String after,String order,Integer limit,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response archiveProject(String projectId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response createProject(ProjectCreateRequest projectCreateRequest,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response createProjectServiceAccount(String projectId,ProjectServiceAccountCreateRequest projectServiceAccountCreateRequest,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response createProjectUser(String projectId,ProjectUserCreateRequest projectUserCreateRequest,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response deleteInvite(String inviteId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response deleteProjectApiKey(String projectId,String keyId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response deleteProjectServiceAccount(String projectId,String serviceAccountId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response deleteProjectUser(String projectId,String userId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response deleteUser(String userId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response inviteUser(InviteRequest inviteRequest,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response listAuditLogs(ListAuditLogsEffectiveAtParameter effectiveAt,List<String> projectIds,List<AuditLogEventType> eventTypes,List<String> actorIds,List<String> actorEmails,List<String> resourceIds,Integer limit,String after,String before,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response listInvites(Integer limit,String after,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response listProjectApiKeys(String projectId,Integer limit,String after,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response listProjectRateLimits(String projectId,Integer limit,String after,String before,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response listProjectServiceAccounts(String projectId,Integer limit,String after,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response listProjectUsers(String projectId,Integer limit,String after,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response listProjects(Integer limit,String after,Boolean includeArchived,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response listUsers(Integer limit,String after,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response modifyProject(String projectId,ProjectUpdateRequest projectUpdateRequest,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response modifyProjectUser(String projectId,String userId,ProjectUserUpdateRequest projectUserUpdateRequest,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response modifyUser(String userId,UserRoleUpdateRequest userRoleUpdateRequest,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response retrieveInvite(String inviteId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response retrieveProject(String projectId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response retrieveProjectApiKey(String projectId,String keyId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response retrieveProjectServiceAccount(String projectId,String serviceAccountId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response retrieveProjectUser(String projectId,String userId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response retrieveUser(String userId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response updateProjectRateLimits(String projectId,String rateLimitId,ProjectRateLimitUpdateRequest projectRateLimitUpdateRequest,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response usageAudioSpeeches(Integer startTime,Integer endTime,String bucketWidth,List<String> projectIds,List<String> userIds,List<String> apiKeyIds,List<String> models,List<String> groupBy,Integer limit,String page,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response usageAudioTranscriptions(Integer startTime,Integer endTime,String bucketWidth,List<String> projectIds,List<String> userIds,List<String> apiKeyIds,List<String> models,List<String> groupBy,Integer limit,String page,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response usageCodeInterpreterSessions(Integer startTime,Integer endTime,String bucketWidth,List<String> projectIds,List<String> groupBy,Integer limit,String page,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response usageCompletions(Integer startTime,Integer endTime,String bucketWidth,List<String> projectIds,List<String> userIds,List<String> apiKeyIds,List<String> models,Boolean batch,List<String> groupBy,Integer limit,String page,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response usageCosts(Integer startTime,Integer endTime,String bucketWidth,List<String> projectIds,List<String> groupBy,Integer limit,String page,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response usageEmbeddings(Integer startTime,Integer endTime,String bucketWidth,List<String> projectIds,List<String> userIds,List<String> apiKeyIds,List<String> models,List<String> groupBy,Integer limit,String page,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response usageImages(Integer startTime,Integer endTime,String bucketWidth,List<String> sources,List<String> sizes,List<String> projectIds,List<String> userIds,List<String> apiKeyIds,List<String> models,List<String> groupBy,Integer limit,String page,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response usageModerations(Integer startTime,Integer endTime,String bucketWidth,List<String> projectIds,List<String> userIds,List<String> apiKeyIds,List<String> models,List<String> groupBy,Integer limit,String page,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response usageVectorStores(Integer startTime,Integer endTime,String bucketWidth,List<String> projectIds,List<String> groupBy,Integer limit,String page,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
}
