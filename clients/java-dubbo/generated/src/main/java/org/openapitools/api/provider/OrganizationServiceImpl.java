package org.openapitools.api.provider;

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
import org.apache.dubbo.config.annotation.DubboService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

@DubboService
public class OrganizationServiceImpl implements OrganizationService {

    private static final Logger logger = LoggerFactory.getLogger(OrganizationServiceImpl.class);

    @Override
    public AdminApiKey adminApiKeysCreate(
        AdminApiKeysCreateRequest adminApiKeysCreateRequest
    ) {
        logger.info("Dubbo service method adminApiKeysCreate called with parameters: adminApiKeysCreateRequest={}", adminApiKeysCreateRequest);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public AdminApiKeysDelete200Response adminApiKeysDelete(
        String keyId
    ) {
        logger.info("Dubbo service method adminApiKeysDelete called with parameters: keyId={}", keyId);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public AdminApiKey adminApiKeysGet(
        String keyId
    ) {
        logger.info("Dubbo service method adminApiKeysGet called with parameters: keyId={}", keyId);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public ApiKeyList adminApiKeysList(
        String after,
        String order,
        Integer limit
    ) {
        logger.info("Dubbo service method adminApiKeysList called with parameters: after={}, order={}, limit={}", after, order, limit);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public Project archiveProject(
        String projectId
    ) {
        logger.info("Dubbo service method archiveProject called with parameters: projectId={}", projectId);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public Project createProject(
        ProjectCreateRequest projectCreateRequest
    ) {
        logger.info("Dubbo service method createProject called with parameters: projectCreateRequest={}", projectCreateRequest);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public ProjectServiceAccountCreateResponse createProjectServiceAccount(
        String projectId,
        ProjectServiceAccountCreateRequest projectServiceAccountCreateRequest
    ) {
        logger.info("Dubbo service method createProjectServiceAccount called with parameters: projectId={}, projectServiceAccountCreateRequest={}", projectId, projectServiceAccountCreateRequest);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public ProjectUser createProjectUser(
        String projectId,
        ProjectUserCreateRequest projectUserCreateRequest
    ) {
        logger.info("Dubbo service method createProjectUser called with parameters: projectId={}, projectUserCreateRequest={}", projectId, projectUserCreateRequest);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public InviteDeleteResponse deleteInvite(
        String inviteId
    ) {
        logger.info("Dubbo service method deleteInvite called with parameters: inviteId={}", inviteId);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public ProjectApiKeyDeleteResponse deleteProjectApiKey(
        String projectId,
        String keyId
    ) {
        logger.info("Dubbo service method deleteProjectApiKey called with parameters: projectId={}, keyId={}", projectId, keyId);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public ProjectServiceAccountDeleteResponse deleteProjectServiceAccount(
        String projectId,
        String serviceAccountId
    ) {
        logger.info("Dubbo service method deleteProjectServiceAccount called with parameters: projectId={}, serviceAccountId={}", projectId, serviceAccountId);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public ProjectUserDeleteResponse deleteProjectUser(
        String projectId,
        String userId
    ) {
        logger.info("Dubbo service method deleteProjectUser called with parameters: projectId={}, userId={}", projectId, userId);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public UserDeleteResponse deleteUser(
        String userId
    ) {
        logger.info("Dubbo service method deleteUser called with parameters: userId={}", userId);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public Invite inviteUser(
        InviteRequest inviteRequest
    ) {
        logger.info("Dubbo service method inviteUser called with parameters: inviteRequest={}", inviteRequest);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public ListAuditLogsResponse listAuditLogs(
        ListAuditLogsEffectiveAtParameter effectiveAt,
        List<String> projectIds,
        List<AuditLogEventType> eventTypes,
        List<String> actorIds,
        List<String> actorEmails,
        List<String> resourceIds,
        Integer limit,
        String after,
        String before
    ) {
        logger.info("Dubbo service method listAuditLogs called with parameters: effectiveAt={}, projectIds={}, eventTypes={}, actorIds={}, actorEmails={}, resourceIds={}, limit={}, after={}, before={}", effectiveAt, projectIds, eventTypes, actorIds, actorEmails, resourceIds, limit, after, before);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public InviteListResponse listInvites(
        Integer limit,
        String after
    ) {
        logger.info("Dubbo service method listInvites called with parameters: limit={}, after={}", limit, after);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public ProjectApiKeyListResponse listProjectApiKeys(
        String projectId,
        Integer limit,
        String after
    ) {
        logger.info("Dubbo service method listProjectApiKeys called with parameters: projectId={}, limit={}, after={}", projectId, limit, after);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public ProjectRateLimitListResponse listProjectRateLimits(
        String projectId,
        Integer limit,
        String after,
        String before
    ) {
        logger.info("Dubbo service method listProjectRateLimits called with parameters: projectId={}, limit={}, after={}, before={}", projectId, limit, after, before);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public ProjectServiceAccountListResponse listProjectServiceAccounts(
        String projectId,
        Integer limit,
        String after
    ) {
        logger.info("Dubbo service method listProjectServiceAccounts called with parameters: projectId={}, limit={}, after={}", projectId, limit, after);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public ProjectUserListResponse listProjectUsers(
        String projectId,
        Integer limit,
        String after
    ) {
        logger.info("Dubbo service method listProjectUsers called with parameters: projectId={}, limit={}, after={}", projectId, limit, after);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public ProjectListResponse listProjects(
        Integer limit,
        String after,
        Boolean includeArchived
    ) {
        logger.info("Dubbo service method listProjects called with parameters: limit={}, after={}, includeArchived={}", limit, after, includeArchived);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public UserListResponse listUsers(
        Integer limit,
        String after
    ) {
        logger.info("Dubbo service method listUsers called with parameters: limit={}, after={}", limit, after);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public Project modifyProject(
        String projectId,
        ProjectUpdateRequest projectUpdateRequest
    ) {
        logger.info("Dubbo service method modifyProject called with parameters: projectId={}, projectUpdateRequest={}", projectId, projectUpdateRequest);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public ProjectUser modifyProjectUser(
        String projectId,
        String userId,
        ProjectUserUpdateRequest projectUserUpdateRequest
    ) {
        logger.info("Dubbo service method modifyProjectUser called with parameters: projectId={}, userId={}, projectUserUpdateRequest={}", projectId, userId, projectUserUpdateRequest);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public User modifyUser(
        String userId,
        UserRoleUpdateRequest userRoleUpdateRequest
    ) {
        logger.info("Dubbo service method modifyUser called with parameters: userId={}, userRoleUpdateRequest={}", userId, userRoleUpdateRequest);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public Invite retrieveInvite(
        String inviteId
    ) {
        logger.info("Dubbo service method retrieveInvite called with parameters: inviteId={}", inviteId);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public Project retrieveProject(
        String projectId
    ) {
        logger.info("Dubbo service method retrieveProject called with parameters: projectId={}", projectId);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public ProjectApiKey retrieveProjectApiKey(
        String projectId,
        String keyId
    ) {
        logger.info("Dubbo service method retrieveProjectApiKey called with parameters: projectId={}, keyId={}", projectId, keyId);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public ProjectServiceAccount retrieveProjectServiceAccount(
        String projectId,
        String serviceAccountId
    ) {
        logger.info("Dubbo service method retrieveProjectServiceAccount called with parameters: projectId={}, serviceAccountId={}", projectId, serviceAccountId);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public ProjectUser retrieveProjectUser(
        String projectId,
        String userId
    ) {
        logger.info("Dubbo service method retrieveProjectUser called with parameters: projectId={}, userId={}", projectId, userId);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public User retrieveUser(
        String userId
    ) {
        logger.info("Dubbo service method retrieveUser called with parameters: userId={}", userId);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public ProjectRateLimit updateProjectRateLimits(
        String projectId,
        String rateLimitId,
        ProjectRateLimitUpdateRequest projectRateLimitUpdateRequest
    ) {
        logger.info("Dubbo service method updateProjectRateLimits called with parameters: projectId={}, rateLimitId={}, projectRateLimitUpdateRequest={}", projectId, rateLimitId, projectRateLimitUpdateRequest);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public UsageResponse usageAudioSpeeches(
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
    ) {
        logger.info("Dubbo service method usageAudioSpeeches called with parameters: startTime={}, endTime={}, bucketWidth={}, projectIds={}, userIds={}, apiKeyIds={}, models={}, groupBy={}, limit={}, page={}", startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public UsageResponse usageAudioTranscriptions(
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
    ) {
        logger.info("Dubbo service method usageAudioTranscriptions called with parameters: startTime={}, endTime={}, bucketWidth={}, projectIds={}, userIds={}, apiKeyIds={}, models={}, groupBy={}, limit={}, page={}", startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public UsageResponse usageCodeInterpreterSessions(
        Integer startTime,
        Integer endTime,
        String bucketWidth,
        List<String> projectIds,
        List<String> groupBy,
        Integer limit,
        String page
    ) {
        logger.info("Dubbo service method usageCodeInterpreterSessions called with parameters: startTime={}, endTime={}, bucketWidth={}, projectIds={}, groupBy={}, limit={}, page={}", startTime, endTime, bucketWidth, projectIds, groupBy, limit, page);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public UsageResponse usageCompletions(
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
    ) {
        logger.info("Dubbo service method usageCompletions called with parameters: startTime={}, endTime={}, bucketWidth={}, projectIds={}, userIds={}, apiKeyIds={}, models={}, batch={}, groupBy={}, limit={}, page={}", startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, batch, groupBy, limit, page);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public UsageResponse usageCosts(
        Integer startTime,
        Integer endTime,
        String bucketWidth,
        List<String> projectIds,
        List<String> groupBy,
        Integer limit,
        String page
    ) {
        logger.info("Dubbo service method usageCosts called with parameters: startTime={}, endTime={}, bucketWidth={}, projectIds={}, groupBy={}, limit={}, page={}", startTime, endTime, bucketWidth, projectIds, groupBy, limit, page);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public UsageResponse usageEmbeddings(
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
    ) {
        logger.info("Dubbo service method usageEmbeddings called with parameters: startTime={}, endTime={}, bucketWidth={}, projectIds={}, userIds={}, apiKeyIds={}, models={}, groupBy={}, limit={}, page={}", startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public UsageResponse usageImages(
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
    ) {
        logger.info("Dubbo service method usageImages called with parameters: startTime={}, endTime={}, bucketWidth={}, sources={}, sizes={}, projectIds={}, userIds={}, apiKeyIds={}, models={}, groupBy={}, limit={}, page={}", startTime, endTime, bucketWidth, sources, sizes, projectIds, userIds, apiKeyIds, models, groupBy, limit, page);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public UsageResponse usageModerations(
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
    ) {
        logger.info("Dubbo service method usageModerations called with parameters: startTime={}, endTime={}, bucketWidth={}, projectIds={}, userIds={}, apiKeyIds={}, models={}, groupBy={}, limit={}, page={}", startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public UsageResponse usageVectorStores(
        Integer startTime,
        Integer endTime,
        String bucketWidth,
        List<String> projectIds,
        List<String> groupBy,
        Integer limit,
        String page
    ) {
        logger.info("Dubbo service method usageVectorStores called with parameters: startTime={}, endTime={}, bucketWidth={}, projectIds={}, groupBy={}, limit={}, page={}", startTime, endTime, bucketWidth, projectIds, groupBy, limit, page);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }
}
