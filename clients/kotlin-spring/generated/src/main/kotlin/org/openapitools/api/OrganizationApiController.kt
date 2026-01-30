package org.openapitools.api

import org.openapitools.model.AdminApiKey
import org.openapitools.model.AdminApiKeysCreateRequest
import org.openapitools.model.AdminApiKeysDelete200Response
import org.openapitools.model.ApiKeyList
import org.openapitools.model.AuditLogEventType
import org.openapitools.model.ErrorResponse
import org.openapitools.model.Invite
import org.openapitools.model.InviteDeleteResponse
import org.openapitools.model.InviteListResponse
import org.openapitools.model.InviteRequest
import org.openapitools.model.ListAuditLogsEffectiveAtParameter
import org.openapitools.model.ListAuditLogsResponse
import org.openapitools.model.Project
import org.openapitools.model.ProjectApiKey
import org.openapitools.model.ProjectApiKeyDeleteResponse
import org.openapitools.model.ProjectApiKeyListResponse
import org.openapitools.model.ProjectCreateRequest
import org.openapitools.model.ProjectListResponse
import org.openapitools.model.ProjectRateLimit
import org.openapitools.model.ProjectRateLimitListResponse
import org.openapitools.model.ProjectRateLimitUpdateRequest
import org.openapitools.model.ProjectServiceAccount
import org.openapitools.model.ProjectServiceAccountCreateRequest
import org.openapitools.model.ProjectServiceAccountCreateResponse
import org.openapitools.model.ProjectServiceAccountDeleteResponse
import org.openapitools.model.ProjectServiceAccountListResponse
import org.openapitools.model.ProjectUpdateRequest
import org.openapitools.model.ProjectUser
import org.openapitools.model.ProjectUserCreateRequest
import org.openapitools.model.ProjectUserDeleteResponse
import org.openapitools.model.ProjectUserListResponse
import org.openapitools.model.ProjectUserUpdateRequest
import org.openapitools.model.UsageResponse
import org.openapitools.model.User
import org.openapitools.model.UserDeleteResponse
import org.openapitools.model.UserListResponse
import org.openapitools.model.UserRoleUpdateRequest
import io.swagger.v3.oas.annotations.*
import io.swagger.v3.oas.annotations.enums.*
import io.swagger.v3.oas.annotations.media.*
import io.swagger.v3.oas.annotations.responses.*
import io.swagger.v3.oas.annotations.security.*
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity

import org.springframework.web.bind.annotation.*
import org.springframework.validation.annotation.Validated
import org.springframework.web.context.request.NativeWebRequest
import org.springframework.beans.factory.annotation.Autowired
import org.openapitools.api.OrganizationApiController.Companion.BASE_PATH

import javax.validation.Valid
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

import kotlin.collections.List
import kotlin.collections.Map

@RestController
@Validated
@RequestMapping("\${openapi.openAI.base-path:\${api.base-path:$BASE_PATH}}")
class OrganizationApiController() {

    @Operation(
        summary = "Create an organization admin API key",
        operationId = "adminApiKeysCreate",
        description = """Create a new admin-level API key for the organization.""",
        responses = [
            ApiResponse(responseCode = "200", description = "The newly created admin API key.", content = [Content(schema = Schema(implementation = AdminApiKey::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = [PATH_ADMIN_API_KEYS_CREATE /* "/organization/admin_api_keys" */],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun adminApiKeysCreate(
        @Parameter(description = "", required = true) @Valid @RequestBody adminApiKeysCreateRequest: AdminApiKeysCreateRequest
    ): ResponseEntity<AdminApiKey> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete an organization admin API key",
        operationId = "adminApiKeysDelete",
        description = """Delete the specified admin API key.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Confirmation that the API key was deleted.", content = [Content(schema = Schema(implementation = AdminApiKeysDelete200Response::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.DELETE],
        value = [PATH_ADMIN_API_KEYS_DELETE /* "/organization/admin_api_keys/{key_id}" */],
        produces = ["application/json"]
    )
    fun adminApiKeysDelete(
        @Parameter(description = "", required = true) @PathVariable("key_id") keyId: kotlin.String
    ): ResponseEntity<AdminApiKeysDelete200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Retrieve a single organization API key",
        operationId = "adminApiKeysGet",
        description = """Get details for a specific organization API key by its ID.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Details of the requested API key.", content = [Content(schema = Schema(implementation = AdminApiKey::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_ADMIN_API_KEYS_GET /* "/organization/admin_api_keys/{key_id}" */],
        produces = ["application/json"]
    )
    fun adminApiKeysGet(
        @Parameter(description = "", required = true) @PathVariable("key_id") keyId: kotlin.String
    ): ResponseEntity<AdminApiKey> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List organization API keys",
        operationId = "adminApiKeysList",
        description = """Retrieve a paginated list of organization admin API keys.""",
        responses = [
            ApiResponse(responseCode = "200", description = "A list of organization API keys.", content = [Content(schema = Schema(implementation = ApiKeyList::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_ADMIN_API_KEYS_LIST /* "/organization/admin_api_keys" */],
        produces = ["application/json"]
    )
    fun adminApiKeysList(
        @Parameter(description = "") @Valid @RequestParam(value = "after", required = false) after: kotlin.String?,
        @Parameter(description = "", schema = Schema(allowableValues = ["asc", "desc"], defaultValue = "asc")) @Valid @RequestParam(value = "order", required = false, defaultValue = "asc") order: kotlin.String,
        @Parameter(description = "", schema = Schema(defaultValue = "20")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "20") limit: kotlin.Int
    ): ResponseEntity<ApiKeyList> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Archives a project in the organization. Archived projects cannot be used or updated.",
        operationId = "archiveProject",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "Project archived successfully.", content = [Content(schema = Schema(implementation = Project::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = [PATH_ARCHIVE_PROJECT /* "/organization/projects/{project_id}/archive" */],
        produces = ["application/json"]
    )
    fun archiveProject(
        @Parameter(description = "The ID of the project.", required = true) @PathVariable("project_id") projectId: kotlin.String
    ): ResponseEntity<Project> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create a new project in the organization. Projects can be created and archived, but cannot be deleted.",
        operationId = "createProject",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "Project created successfully.", content = [Content(schema = Schema(implementation = Project::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = [PATH_CREATE_PROJECT /* "/organization/projects" */],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun createProject(
        @Parameter(description = "The project create request payload.", required = true) @Valid @RequestBody projectCreateRequest: ProjectCreateRequest
    ): ResponseEntity<Project> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Creates a new service account in the project. This also returns an unredacted API key for the service account.",
        operationId = "createProjectServiceAccount",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "Project service account created successfully.", content = [Content(schema = Schema(implementation = ProjectServiceAccountCreateResponse::class))]),
            ApiResponse(responseCode = "400", description = "Error response when project is archived.", content = [Content(schema = Schema(implementation = ErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = [PATH_CREATE_PROJECT_SERVICE_ACCOUNT /* "/organization/projects/{project_id}/service_accounts" */],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun createProjectServiceAccount(
        @Parameter(description = "The ID of the project.", required = true) @PathVariable("project_id") projectId: kotlin.String,
        @Parameter(description = "The project service account create request payload.", required = true) @Valid @RequestBody projectServiceAccountCreateRequest: ProjectServiceAccountCreateRequest
    ): ResponseEntity<ProjectServiceAccountCreateResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Adds a user to the project. Users must already be members of the organization to be added to a project.",
        operationId = "createProjectUser",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "User added to project successfully.", content = [Content(schema = Schema(implementation = ProjectUser::class))]),
            ApiResponse(responseCode = "400", description = "Error response for various conditions.", content = [Content(schema = Schema(implementation = ErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = [PATH_CREATE_PROJECT_USER /* "/organization/projects/{project_id}/users" */],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun createProjectUser(
        @Parameter(description = "The ID of the project.", required = true) @PathVariable("project_id") projectId: kotlin.String,
        @Parameter(description = "The project user create request payload.", required = true) @Valid @RequestBody projectUserCreateRequest: ProjectUserCreateRequest
    ): ResponseEntity<ProjectUser> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete an invite. If the invite has already been accepted, it cannot be deleted.",
        operationId = "deleteInvite",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "Invite deleted successfully.", content = [Content(schema = Schema(implementation = InviteDeleteResponse::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.DELETE],
        value = [PATH_DELETE_INVITE /* "/organization/invites/{invite_id}" */],
        produces = ["application/json"]
    )
    fun deleteInvite(
        @Parameter(description = "The ID of the invite to delete.", required = true) @PathVariable("invite_id") inviteId: kotlin.String
    ): ResponseEntity<InviteDeleteResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Deletes an API key from the project.",
        operationId = "deleteProjectApiKey",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "Project API key deleted successfully.", content = [Content(schema = Schema(implementation = ProjectApiKeyDeleteResponse::class))]),
            ApiResponse(responseCode = "400", description = "Error response for various conditions.", content = [Content(schema = Schema(implementation = ErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.DELETE],
        value = [PATH_DELETE_PROJECT_API_KEY /* "/organization/projects/{project_id}/api_keys/{key_id}" */],
        produces = ["application/json"]
    )
    fun deleteProjectApiKey(
        @Parameter(description = "The ID of the project.", required = true) @PathVariable("project_id") projectId: kotlin.String,
        @Parameter(description = "The ID of the API key.", required = true) @PathVariable("key_id") keyId: kotlin.String
    ): ResponseEntity<ProjectApiKeyDeleteResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Deletes a service account from the project.",
        operationId = "deleteProjectServiceAccount",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "Project service account deleted successfully.", content = [Content(schema = Schema(implementation = ProjectServiceAccountDeleteResponse::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.DELETE],
        value = [PATH_DELETE_PROJECT_SERVICE_ACCOUNT /* "/organization/projects/{project_id}/service_accounts/{service_account_id}" */],
        produces = ["application/json"]
    )
    fun deleteProjectServiceAccount(
        @Parameter(description = "The ID of the project.", required = true) @PathVariable("project_id") projectId: kotlin.String,
        @Parameter(description = "The ID of the service account.", required = true) @PathVariable("service_account_id") serviceAccountId: kotlin.String
    ): ResponseEntity<ProjectServiceAccountDeleteResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Deletes a user from the project.",
        operationId = "deleteProjectUser",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "Project user deleted successfully.", content = [Content(schema = Schema(implementation = ProjectUserDeleteResponse::class))]),
            ApiResponse(responseCode = "400", description = "Error response for various conditions.", content = [Content(schema = Schema(implementation = ErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.DELETE],
        value = [PATH_DELETE_PROJECT_USER /* "/organization/projects/{project_id}/users/{user_id}" */],
        produces = ["application/json"]
    )
    fun deleteProjectUser(
        @Parameter(description = "The ID of the project.", required = true) @PathVariable("project_id") projectId: kotlin.String,
        @Parameter(description = "The ID of the user.", required = true) @PathVariable("user_id") userId: kotlin.String
    ): ResponseEntity<ProjectUserDeleteResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Deletes a user from the organization.",
        operationId = "deleteUser",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "User deleted successfully.", content = [Content(schema = Schema(implementation = UserDeleteResponse::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.DELETE],
        value = [PATH_DELETE_USER /* "/organization/users/{user_id}" */],
        produces = ["application/json"]
    )
    fun deleteUser(
        @Parameter(description = "The ID of the user.", required = true) @PathVariable("user_id") userId: kotlin.String
    ): ResponseEntity<UserDeleteResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.",
        operationId = "inviteUser",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "User invited successfully.", content = [Content(schema = Schema(implementation = Invite::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = [PATH_INVITE_USER /* "/organization/invites" */],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun inviteUser(
        @Parameter(description = "The invite request payload.", required = true) @Valid @RequestBody inviteRequest: InviteRequest
    ): ResponseEntity<Invite> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List user actions and configuration changes within this organization.",
        operationId = "listAuditLogs",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "Audit logs listed successfully.", content = [Content(schema = Schema(implementation = ListAuditLogsResponse::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_LIST_AUDIT_LOGS /* "/organization/audit_logs" */],
        produces = ["application/json"]
    )
    fun listAuditLogs(
        @Parameter(description = "Return only events whose `effective_at` (Unix seconds) is in this range.") @Valid effectiveAt: ListAuditLogsEffectiveAtParameter?,
        @Parameter(description = "Return only events for these projects.") @Valid @RequestParam(value = "project_ids[]", required = false) projectIds: kotlin.collections.List<kotlin.String>?,
        @Parameter(description = "Return only events with a `type` in one of these values. For example, `project.created`. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object).") @Valid @RequestParam(value = "event_types[]", required = false) eventTypes: kotlin.collections.List<AuditLogEventType>?,
        @Parameter(description = "Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID.") @Valid @RequestParam(value = "actor_ids[]", required = false) actorIds: kotlin.collections.List<kotlin.String>?,
        @Parameter(description = "Return only events performed by users with these emails.") @Valid @RequestParam(value = "actor_emails[]", required = false) actorEmails: kotlin.collections.List<kotlin.String>?,
        @Parameter(description = "Return only events performed on these targets. For example, a project ID updated.") @Valid @RequestParam(value = "resource_ids[]", required = false) resourceIds: kotlin.collections.List<kotlin.String>?,
        @Parameter(description = "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", schema = Schema(defaultValue = "20")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "20") limit: kotlin.Int,
        @Parameter(description = "A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ") @Valid @RequestParam(value = "after", required = false) after: kotlin.String?,
        @Parameter(description = "A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. ") @Valid @RequestParam(value = "before", required = false) before: kotlin.String?
    ): ResponseEntity<ListAuditLogsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Returns a list of invites in the organization.",
        operationId = "listInvites",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "Invites listed successfully.", content = [Content(schema = Schema(implementation = InviteListResponse::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_LIST_INVITES /* "/organization/invites" */],
        produces = ["application/json"]
    )
    fun listInvites(
        @Parameter(description = "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", schema = Schema(defaultValue = "20")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "20") limit: kotlin.Int,
        @Parameter(description = "A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ") @Valid @RequestParam(value = "after", required = false) after: kotlin.String?
    ): ResponseEntity<InviteListResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Returns a list of API keys in the project.",
        operationId = "listProjectApiKeys",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "Project API keys listed successfully.", content = [Content(schema = Schema(implementation = ProjectApiKeyListResponse::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_LIST_PROJECT_API_KEYS /* "/organization/projects/{project_id}/api_keys" */],
        produces = ["application/json"]
    )
    fun listProjectApiKeys(
        @Parameter(description = "The ID of the project.", required = true) @PathVariable("project_id") projectId: kotlin.String,
        @Parameter(description = "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", schema = Schema(defaultValue = "20")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "20") limit: kotlin.Int,
        @Parameter(description = "A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ") @Valid @RequestParam(value = "after", required = false) after: kotlin.String?
    ): ResponseEntity<ProjectApiKeyListResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Returns the rate limits per model for a project.",
        operationId = "listProjectRateLimits",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "Project rate limits listed successfully.", content = [Content(schema = Schema(implementation = ProjectRateLimitListResponse::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_LIST_PROJECT_RATE_LIMITS /* "/organization/projects/{project_id}/rate_limits" */],
        produces = ["application/json"]
    )
    fun listProjectRateLimits(
        @Parameter(description = "The ID of the project.", required = true) @PathVariable("project_id") projectId: kotlin.String,
        @Parameter(description = "A limit on the number of objects to be returned. The default is 100. ", schema = Schema(defaultValue = "100")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "100") limit: kotlin.Int,
        @Parameter(description = "A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ") @Valid @RequestParam(value = "after", required = false) after: kotlin.String?,
        @Parameter(description = "A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, beginning with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. ") @Valid @RequestParam(value = "before", required = false) before: kotlin.String?
    ): ResponseEntity<ProjectRateLimitListResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Returns a list of service accounts in the project.",
        operationId = "listProjectServiceAccounts",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "Project service accounts listed successfully.", content = [Content(schema = Schema(implementation = ProjectServiceAccountListResponse::class))]),
            ApiResponse(responseCode = "400", description = "Error response when project is archived.", content = [Content(schema = Schema(implementation = ErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_LIST_PROJECT_SERVICE_ACCOUNTS /* "/organization/projects/{project_id}/service_accounts" */],
        produces = ["application/json"]
    )
    fun listProjectServiceAccounts(
        @Parameter(description = "The ID of the project.", required = true) @PathVariable("project_id") projectId: kotlin.String,
        @Parameter(description = "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", schema = Schema(defaultValue = "20")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "20") limit: kotlin.Int,
        @Parameter(description = "A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ") @Valid @RequestParam(value = "after", required = false) after: kotlin.String?
    ): ResponseEntity<ProjectServiceAccountListResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Returns a list of users in the project.",
        operationId = "listProjectUsers",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "Project users listed successfully.", content = [Content(schema = Schema(implementation = ProjectUserListResponse::class))]),
            ApiResponse(responseCode = "400", description = "Error response when project is archived.", content = [Content(schema = Schema(implementation = ErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_LIST_PROJECT_USERS /* "/organization/projects/{project_id}/users" */],
        produces = ["application/json"]
    )
    fun listProjectUsers(
        @Parameter(description = "The ID of the project.", required = true) @PathVariable("project_id") projectId: kotlin.String,
        @Parameter(description = "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", schema = Schema(defaultValue = "20")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "20") limit: kotlin.Int,
        @Parameter(description = "A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ") @Valid @RequestParam(value = "after", required = false) after: kotlin.String?
    ): ResponseEntity<ProjectUserListResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Returns a list of projects.",
        operationId = "listProjects",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "Projects listed successfully.", content = [Content(schema = Schema(implementation = ProjectListResponse::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_LIST_PROJECTS /* "/organization/projects" */],
        produces = ["application/json"]
    )
    fun listProjects(
        @Parameter(description = "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", schema = Schema(defaultValue = "20")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "20") limit: kotlin.Int,
        @Parameter(description = "A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ") @Valid @RequestParam(value = "after", required = false) after: kotlin.String?,
        @Parameter(description = "If `true` returns all projects including those that have been `archived`. Archived projects are not included by default.", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "include_archived", required = false, defaultValue = "false") includeArchived: kotlin.Boolean
    ): ResponseEntity<ProjectListResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Lists all of the users in the organization.",
        operationId = "listUsers",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "Users listed successfully.", content = [Content(schema = Schema(implementation = UserListResponse::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_LIST_USERS /* "/organization/users" */],
        produces = ["application/json"]
    )
    fun listUsers(
        @Parameter(description = "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", schema = Schema(defaultValue = "20")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "20") limit: kotlin.Int,
        @Parameter(description = "A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ") @Valid @RequestParam(value = "after", required = false) after: kotlin.String?
    ): ResponseEntity<UserListResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Modifies a project in the organization.",
        operationId = "modifyProject",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "Project updated successfully.", content = [Content(schema = Schema(implementation = Project::class))]),
            ApiResponse(responseCode = "400", description = "Error response when updating the default project.", content = [Content(schema = Schema(implementation = ErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = [PATH_MODIFY_PROJECT /* "/organization/projects/{project_id}" */],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun modifyProject(
        @Parameter(description = "The ID of the project.", required = true) @PathVariable("project_id") projectId: kotlin.String,
        @Parameter(description = "The project update request payload.", required = true) @Valid @RequestBody projectUpdateRequest: ProjectUpdateRequest
    ): ResponseEntity<Project> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Modifies a user's role in the project.",
        operationId = "modifyProjectUser",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "Project user's role updated successfully.", content = [Content(schema = Schema(implementation = ProjectUser::class))]),
            ApiResponse(responseCode = "400", description = "Error response for various conditions.", content = [Content(schema = Schema(implementation = ErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = [PATH_MODIFY_PROJECT_USER /* "/organization/projects/{project_id}/users/{user_id}" */],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun modifyProjectUser(
        @Parameter(description = "The ID of the project.", required = true) @PathVariable("project_id") projectId: kotlin.String,
        @Parameter(description = "The ID of the user.", required = true) @PathVariable("user_id") userId: kotlin.String,
        @Parameter(description = "The project user update request payload.", required = true) @Valid @RequestBody projectUserUpdateRequest: ProjectUserUpdateRequest
    ): ResponseEntity<ProjectUser> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Modifies a user's role in the organization.",
        operationId = "modifyUser",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "User role updated successfully.", content = [Content(schema = Schema(implementation = User::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = [PATH_MODIFY_USER /* "/organization/users/{user_id}" */],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun modifyUser(
        @Parameter(description = "The ID of the user.", required = true) @PathVariable("user_id") userId: kotlin.String,
        @Parameter(description = "The new user role to modify. This must be one of `owner` or `member`.", required = true) @Valid @RequestBody userRoleUpdateRequest: UserRoleUpdateRequest
    ): ResponseEntity<User> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Retrieves an invite.",
        operationId = "retrieveInvite",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "Invite retrieved successfully.", content = [Content(schema = Schema(implementation = Invite::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_RETRIEVE_INVITE /* "/organization/invites/{invite_id}" */],
        produces = ["application/json"]
    )
    fun retrieveInvite(
        @Parameter(description = "The ID of the invite to retrieve.", required = true) @PathVariable("invite_id") inviteId: kotlin.String
    ): ResponseEntity<Invite> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Retrieves a project.",
        operationId = "retrieveProject",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "Project retrieved successfully.", content = [Content(schema = Schema(implementation = Project::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_RETRIEVE_PROJECT /* "/organization/projects/{project_id}" */],
        produces = ["application/json"]
    )
    fun retrieveProject(
        @Parameter(description = "The ID of the project.", required = true) @PathVariable("project_id") projectId: kotlin.String
    ): ResponseEntity<Project> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Retrieves an API key in the project.",
        operationId = "retrieveProjectApiKey",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "Project API key retrieved successfully.", content = [Content(schema = Schema(implementation = ProjectApiKey::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_RETRIEVE_PROJECT_API_KEY /* "/organization/projects/{project_id}/api_keys/{key_id}" */],
        produces = ["application/json"]
    )
    fun retrieveProjectApiKey(
        @Parameter(description = "The ID of the project.", required = true) @PathVariable("project_id") projectId: kotlin.String,
        @Parameter(description = "The ID of the API key.", required = true) @PathVariable("key_id") keyId: kotlin.String
    ): ResponseEntity<ProjectApiKey> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Retrieves a service account in the project.",
        operationId = "retrieveProjectServiceAccount",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "Project service account retrieved successfully.", content = [Content(schema = Schema(implementation = ProjectServiceAccount::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_RETRIEVE_PROJECT_SERVICE_ACCOUNT /* "/organization/projects/{project_id}/service_accounts/{service_account_id}" */],
        produces = ["application/json"]
    )
    fun retrieveProjectServiceAccount(
        @Parameter(description = "The ID of the project.", required = true) @PathVariable("project_id") projectId: kotlin.String,
        @Parameter(description = "The ID of the service account.", required = true) @PathVariable("service_account_id") serviceAccountId: kotlin.String
    ): ResponseEntity<ProjectServiceAccount> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Retrieves a user in the project.",
        operationId = "retrieveProjectUser",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "Project user retrieved successfully.", content = [Content(schema = Schema(implementation = ProjectUser::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_RETRIEVE_PROJECT_USER /* "/organization/projects/{project_id}/users/{user_id}" */],
        produces = ["application/json"]
    )
    fun retrieveProjectUser(
        @Parameter(description = "The ID of the project.", required = true) @PathVariable("project_id") projectId: kotlin.String,
        @Parameter(description = "The ID of the user.", required = true) @PathVariable("user_id") userId: kotlin.String
    ): ResponseEntity<ProjectUser> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Retrieves a user by their identifier.",
        operationId = "retrieveUser",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "User retrieved successfully.", content = [Content(schema = Schema(implementation = User::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_RETRIEVE_USER /* "/organization/users/{user_id}" */],
        produces = ["application/json"]
    )
    fun retrieveUser(
        @Parameter(description = "The ID of the user.", required = true) @PathVariable("user_id") userId: kotlin.String
    ): ResponseEntity<User> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Updates a project rate limit.",
        operationId = "updateProjectRateLimits",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "Project rate limit updated successfully.", content = [Content(schema = Schema(implementation = ProjectRateLimit::class))]),
            ApiResponse(responseCode = "400", description = "Error response for various conditions.", content = [Content(schema = Schema(implementation = ErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = [PATH_UPDATE_PROJECT_RATE_LIMITS /* "/organization/projects/{project_id}/rate_limits/{rate_limit_id}" */],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun updateProjectRateLimits(
        @Parameter(description = "The ID of the project.", required = true) @PathVariable("project_id") projectId: kotlin.String,
        @Parameter(description = "The ID of the rate limit.", required = true) @PathVariable("rate_limit_id") rateLimitId: kotlin.String,
        @Parameter(description = "The project rate limit update request payload.", required = true) @Valid @RequestBody projectRateLimitUpdateRequest: ProjectRateLimitUpdateRequest
    ): ResponseEntity<ProjectRateLimit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get audio speeches usage details for the organization.",
        operationId = "usageAudioSpeeches",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "Usage data retrieved successfully.", content = [Content(schema = Schema(implementation = UsageResponse::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_USAGE_AUDIO_SPEECHES /* "/organization/usage/audio_speeches" */],
        produces = ["application/json"]
    )
    fun usageAudioSpeeches(
        @NotNull @Parameter(description = "Start time (Unix seconds) of the query time range, inclusive.", required = true) @Valid @RequestParam(value = "start_time", required = true) startTime: kotlin.Int,
        @Parameter(description = "End time (Unix seconds) of the query time range, exclusive.") @Valid @RequestParam(value = "end_time", required = false) endTime: kotlin.Int?,
        @Parameter(description = "Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.", schema = Schema(allowableValues = ["1m", "1h", "1d"], defaultValue = "1d")) @Valid @RequestParam(value = "bucket_width", required = false, defaultValue = "1d") bucketWidth: kotlin.String,
        @Parameter(description = "Return only usage for these projects.") @Valid @RequestParam(value = "project_ids", required = false) projectIds: kotlin.collections.List<kotlin.String>?,
        @Parameter(description = "Return only usage for these users.") @Valid @RequestParam(value = "user_ids", required = false) userIds: kotlin.collections.List<kotlin.String>?,
        @Parameter(description = "Return only usage for these API keys.") @Valid @RequestParam(value = "api_key_ids", required = false) apiKeyIds: kotlin.collections.List<kotlin.String>?,
        @Parameter(description = "Return only usage for these models.") @Valid @RequestParam(value = "models", required = false) models: kotlin.collections.List<kotlin.String>?,
        @Parameter(description = "Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.", schema = Schema(allowableValues = ["project_id", "user_id", "api_key_id", "model"])) @Valid @RequestParam(value = "group_by", required = false) groupBy: kotlin.collections.List<kotlin.String>?,
        @Parameter(description = "Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 ") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.") @Valid @RequestParam(value = "page", required = false) page: kotlin.String?
    ): ResponseEntity<UsageResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get audio transcriptions usage details for the organization.",
        operationId = "usageAudioTranscriptions",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "Usage data retrieved successfully.", content = [Content(schema = Schema(implementation = UsageResponse::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_USAGE_AUDIO_TRANSCRIPTIONS /* "/organization/usage/audio_transcriptions" */],
        produces = ["application/json"]
    )
    fun usageAudioTranscriptions(
        @NotNull @Parameter(description = "Start time (Unix seconds) of the query time range, inclusive.", required = true) @Valid @RequestParam(value = "start_time", required = true) startTime: kotlin.Int,
        @Parameter(description = "End time (Unix seconds) of the query time range, exclusive.") @Valid @RequestParam(value = "end_time", required = false) endTime: kotlin.Int?,
        @Parameter(description = "Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.", schema = Schema(allowableValues = ["1m", "1h", "1d"], defaultValue = "1d")) @Valid @RequestParam(value = "bucket_width", required = false, defaultValue = "1d") bucketWidth: kotlin.String,
        @Parameter(description = "Return only usage for these projects.") @Valid @RequestParam(value = "project_ids", required = false) projectIds: kotlin.collections.List<kotlin.String>?,
        @Parameter(description = "Return only usage for these users.") @Valid @RequestParam(value = "user_ids", required = false) userIds: kotlin.collections.List<kotlin.String>?,
        @Parameter(description = "Return only usage for these API keys.") @Valid @RequestParam(value = "api_key_ids", required = false) apiKeyIds: kotlin.collections.List<kotlin.String>?,
        @Parameter(description = "Return only usage for these models.") @Valid @RequestParam(value = "models", required = false) models: kotlin.collections.List<kotlin.String>?,
        @Parameter(description = "Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.", schema = Schema(allowableValues = ["project_id", "user_id", "api_key_id", "model"])) @Valid @RequestParam(value = "group_by", required = false) groupBy: kotlin.collections.List<kotlin.String>?,
        @Parameter(description = "Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 ") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.") @Valid @RequestParam(value = "page", required = false) page: kotlin.String?
    ): ResponseEntity<UsageResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get code interpreter sessions usage details for the organization.",
        operationId = "usageCodeInterpreterSessions",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "Usage data retrieved successfully.", content = [Content(schema = Schema(implementation = UsageResponse::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_USAGE_CODE_INTERPRETER_SESSIONS /* "/organization/usage/code_interpreter_sessions" */],
        produces = ["application/json"]
    )
    fun usageCodeInterpreterSessions(
        @NotNull @Parameter(description = "Start time (Unix seconds) of the query time range, inclusive.", required = true) @Valid @RequestParam(value = "start_time", required = true) startTime: kotlin.Int,
        @Parameter(description = "End time (Unix seconds) of the query time range, exclusive.") @Valid @RequestParam(value = "end_time", required = false) endTime: kotlin.Int?,
        @Parameter(description = "Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.", schema = Schema(allowableValues = ["1m", "1h", "1d"], defaultValue = "1d")) @Valid @RequestParam(value = "bucket_width", required = false, defaultValue = "1d") bucketWidth: kotlin.String,
        @Parameter(description = "Return only usage for these projects.") @Valid @RequestParam(value = "project_ids", required = false) projectIds: kotlin.collections.List<kotlin.String>?,
        @Parameter(description = "Group the usage data by the specified fields. Support fields include `project_id`.", schema = Schema(allowableValues = ["project_id"])) @Valid @RequestParam(value = "group_by", required = false) groupBy: kotlin.collections.List<kotlin.String>?,
        @Parameter(description = "Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 ") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.") @Valid @RequestParam(value = "page", required = false) page: kotlin.String?
    ): ResponseEntity<UsageResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get completions usage details for the organization.",
        operationId = "usageCompletions",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "Usage data retrieved successfully.", content = [Content(schema = Schema(implementation = UsageResponse::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_USAGE_COMPLETIONS /* "/organization/usage/completions" */],
        produces = ["application/json"]
    )
    fun usageCompletions(
        @NotNull @Parameter(description = "Start time (Unix seconds) of the query time range, inclusive.", required = true) @Valid @RequestParam(value = "start_time", required = true) startTime: kotlin.Int,
        @Parameter(description = "End time (Unix seconds) of the query time range, exclusive.") @Valid @RequestParam(value = "end_time", required = false) endTime: kotlin.Int?,
        @Parameter(description = "Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.", schema = Schema(allowableValues = ["1m", "1h", "1d"], defaultValue = "1d")) @Valid @RequestParam(value = "bucket_width", required = false, defaultValue = "1d") bucketWidth: kotlin.String,
        @Parameter(description = "Return only usage for these projects.") @Valid @RequestParam(value = "project_ids", required = false) projectIds: kotlin.collections.List<kotlin.String>?,
        @Parameter(description = "Return only usage for these users.") @Valid @RequestParam(value = "user_ids", required = false) userIds: kotlin.collections.List<kotlin.String>?,
        @Parameter(description = "Return only usage for these API keys.") @Valid @RequestParam(value = "api_key_ids", required = false) apiKeyIds: kotlin.collections.List<kotlin.String>?,
        @Parameter(description = "Return only usage for these models.") @Valid @RequestParam(value = "models", required = false) models: kotlin.collections.List<kotlin.String>?,
        @Parameter(description = "If `true`, return batch jobs only. If `false`, return non-batch jobs only. By default, return both. ") @Valid @RequestParam(value = "batch", required = false) batch: kotlin.Boolean?,
        @Parameter(description = "Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model`, `batch` or any combination of them.", schema = Schema(allowableValues = ["project_id", "user_id", "api_key_id", "model", "batch"])) @Valid @RequestParam(value = "group_by", required = false) groupBy: kotlin.collections.List<kotlin.String>?,
        @Parameter(description = "Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 ") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.") @Valid @RequestParam(value = "page", required = false) page: kotlin.String?
    ): ResponseEntity<UsageResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get costs details for the organization.",
        operationId = "usageCosts",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "Costs data retrieved successfully.", content = [Content(schema = Schema(implementation = UsageResponse::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_USAGE_COSTS /* "/organization/costs" */],
        produces = ["application/json"]
    )
    fun usageCosts(
        @NotNull @Parameter(description = "Start time (Unix seconds) of the query time range, inclusive.", required = true) @Valid @RequestParam(value = "start_time", required = true) startTime: kotlin.Int,
        @Parameter(description = "End time (Unix seconds) of the query time range, exclusive.") @Valid @RequestParam(value = "end_time", required = false) endTime: kotlin.Int?,
        @Parameter(description = "Width of each time bucket in response. Currently only `1d` is supported, default to `1d`.", schema = Schema(allowableValues = ["1d"], defaultValue = "1d")) @Valid @RequestParam(value = "bucket_width", required = false, defaultValue = "1d") bucketWidth: kotlin.String,
        @Parameter(description = "Return only costs for these projects.") @Valid @RequestParam(value = "project_ids", required = false) projectIds: kotlin.collections.List<kotlin.String>?,
        @Parameter(description = "Group the costs by the specified fields. Support fields include `project_id`, `line_item` and any combination of them.", schema = Schema(allowableValues = ["project_id", "line_item"])) @Valid @RequestParam(value = "group_by", required = false) groupBy: kotlin.collections.List<kotlin.String>?,
        @Parameter(description = "A limit on the number of buckets to be returned. Limit can range between 1 and 180, and the default is 7. ", schema = Schema(defaultValue = "7")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "7") limit: kotlin.Int,
        @Parameter(description = "A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.") @Valid @RequestParam(value = "page", required = false) page: kotlin.String?
    ): ResponseEntity<UsageResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get embeddings usage details for the organization.",
        operationId = "usageEmbeddings",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "Usage data retrieved successfully.", content = [Content(schema = Schema(implementation = UsageResponse::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_USAGE_EMBEDDINGS /* "/organization/usage/embeddings" */],
        produces = ["application/json"]
    )
    fun usageEmbeddings(
        @NotNull @Parameter(description = "Start time (Unix seconds) of the query time range, inclusive.", required = true) @Valid @RequestParam(value = "start_time", required = true) startTime: kotlin.Int,
        @Parameter(description = "End time (Unix seconds) of the query time range, exclusive.") @Valid @RequestParam(value = "end_time", required = false) endTime: kotlin.Int?,
        @Parameter(description = "Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.", schema = Schema(allowableValues = ["1m", "1h", "1d"], defaultValue = "1d")) @Valid @RequestParam(value = "bucket_width", required = false, defaultValue = "1d") bucketWidth: kotlin.String,
        @Parameter(description = "Return only usage for these projects.") @Valid @RequestParam(value = "project_ids", required = false) projectIds: kotlin.collections.List<kotlin.String>?,
        @Parameter(description = "Return only usage for these users.") @Valid @RequestParam(value = "user_ids", required = false) userIds: kotlin.collections.List<kotlin.String>?,
        @Parameter(description = "Return only usage for these API keys.") @Valid @RequestParam(value = "api_key_ids", required = false) apiKeyIds: kotlin.collections.List<kotlin.String>?,
        @Parameter(description = "Return only usage for these models.") @Valid @RequestParam(value = "models", required = false) models: kotlin.collections.List<kotlin.String>?,
        @Parameter(description = "Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.", schema = Schema(allowableValues = ["project_id", "user_id", "api_key_id", "model"])) @Valid @RequestParam(value = "group_by", required = false) groupBy: kotlin.collections.List<kotlin.String>?,
        @Parameter(description = "Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 ") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.") @Valid @RequestParam(value = "page", required = false) page: kotlin.String?
    ): ResponseEntity<UsageResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get images usage details for the organization.",
        operationId = "usageImages",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "Usage data retrieved successfully.", content = [Content(schema = Schema(implementation = UsageResponse::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_USAGE_IMAGES /* "/organization/usage/images" */],
        produces = ["application/json"]
    )
    fun usageImages(
        @NotNull @Parameter(description = "Start time (Unix seconds) of the query time range, inclusive.", required = true) @Valid @RequestParam(value = "start_time", required = true) startTime: kotlin.Int,
        @Parameter(description = "End time (Unix seconds) of the query time range, exclusive.") @Valid @RequestParam(value = "end_time", required = false) endTime: kotlin.Int?,
        @Parameter(description = "Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.", schema = Schema(allowableValues = ["1m", "1h", "1d"], defaultValue = "1d")) @Valid @RequestParam(value = "bucket_width", required = false, defaultValue = "1d") bucketWidth: kotlin.String,
        @Parameter(description = "Return only usages for these sources. Possible values are `image.generation`, `image.edit`, `image.variation` or any combination of them.", schema = Schema(allowableValues = ["image.generation", "image.edit", "image.variation"])) @Valid @RequestParam(value = "sources", required = false) sources: kotlin.collections.List<kotlin.String>?,
        @Parameter(description = "Return only usages for these image sizes. Possible values are `256x256`, `512x512`, `1024x1024`, `1792x1792`, `1024x1792` or any combination of them.", schema = Schema(allowableValues = ["256x256", "512x512", "1024x1024", "1792x1792", "1024x1792"])) @Valid @RequestParam(value = "sizes", required = false) sizes: kotlin.collections.List<kotlin.String>?,
        @Parameter(description = "Return only usage for these projects.") @Valid @RequestParam(value = "project_ids", required = false) projectIds: kotlin.collections.List<kotlin.String>?,
        @Parameter(description = "Return only usage for these users.") @Valid @RequestParam(value = "user_ids", required = false) userIds: kotlin.collections.List<kotlin.String>?,
        @Parameter(description = "Return only usage for these API keys.") @Valid @RequestParam(value = "api_key_ids", required = false) apiKeyIds: kotlin.collections.List<kotlin.String>?,
        @Parameter(description = "Return only usage for these models.") @Valid @RequestParam(value = "models", required = false) models: kotlin.collections.List<kotlin.String>?,
        @Parameter(description = "Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model`, `size`, `source` or any combination of them.", schema = Schema(allowableValues = ["project_id", "user_id", "api_key_id", "model", "size", "source"])) @Valid @RequestParam(value = "group_by", required = false) groupBy: kotlin.collections.List<kotlin.String>?,
        @Parameter(description = "Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 ") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.") @Valid @RequestParam(value = "page", required = false) page: kotlin.String?
    ): ResponseEntity<UsageResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get moderations usage details for the organization.",
        operationId = "usageModerations",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "Usage data retrieved successfully.", content = [Content(schema = Schema(implementation = UsageResponse::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_USAGE_MODERATIONS /* "/organization/usage/moderations" */],
        produces = ["application/json"]
    )
    fun usageModerations(
        @NotNull @Parameter(description = "Start time (Unix seconds) of the query time range, inclusive.", required = true) @Valid @RequestParam(value = "start_time", required = true) startTime: kotlin.Int,
        @Parameter(description = "End time (Unix seconds) of the query time range, exclusive.") @Valid @RequestParam(value = "end_time", required = false) endTime: kotlin.Int?,
        @Parameter(description = "Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.", schema = Schema(allowableValues = ["1m", "1h", "1d"], defaultValue = "1d")) @Valid @RequestParam(value = "bucket_width", required = false, defaultValue = "1d") bucketWidth: kotlin.String,
        @Parameter(description = "Return only usage for these projects.") @Valid @RequestParam(value = "project_ids", required = false) projectIds: kotlin.collections.List<kotlin.String>?,
        @Parameter(description = "Return only usage for these users.") @Valid @RequestParam(value = "user_ids", required = false) userIds: kotlin.collections.List<kotlin.String>?,
        @Parameter(description = "Return only usage for these API keys.") @Valid @RequestParam(value = "api_key_ids", required = false) apiKeyIds: kotlin.collections.List<kotlin.String>?,
        @Parameter(description = "Return only usage for these models.") @Valid @RequestParam(value = "models", required = false) models: kotlin.collections.List<kotlin.String>?,
        @Parameter(description = "Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.", schema = Schema(allowableValues = ["project_id", "user_id", "api_key_id", "model"])) @Valid @RequestParam(value = "group_by", required = false) groupBy: kotlin.collections.List<kotlin.String>?,
        @Parameter(description = "Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 ") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.") @Valid @RequestParam(value = "page", required = false) page: kotlin.String?
    ): ResponseEntity<UsageResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get vector stores usage details for the organization.",
        operationId = "usageVectorStores",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "Usage data retrieved successfully.", content = [Content(schema = Schema(implementation = UsageResponse::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_USAGE_VECTOR_STORES /* "/organization/usage/vector_stores" */],
        produces = ["application/json"]
    )
    fun usageVectorStores(
        @NotNull @Parameter(description = "Start time (Unix seconds) of the query time range, inclusive.", required = true) @Valid @RequestParam(value = "start_time", required = true) startTime: kotlin.Int,
        @Parameter(description = "End time (Unix seconds) of the query time range, exclusive.") @Valid @RequestParam(value = "end_time", required = false) endTime: kotlin.Int?,
        @Parameter(description = "Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.", schema = Schema(allowableValues = ["1m", "1h", "1d"], defaultValue = "1d")) @Valid @RequestParam(value = "bucket_width", required = false, defaultValue = "1d") bucketWidth: kotlin.String,
        @Parameter(description = "Return only usage for these projects.") @Valid @RequestParam(value = "project_ids", required = false) projectIds: kotlin.collections.List<kotlin.String>?,
        @Parameter(description = "Group the usage data by the specified fields. Support fields include `project_id`.", schema = Schema(allowableValues = ["project_id"])) @Valid @RequestParam(value = "group_by", required = false) groupBy: kotlin.collections.List<kotlin.String>?,
        @Parameter(description = "Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 ") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.") @Valid @RequestParam(value = "page", required = false) page: kotlin.String?
    ): ResponseEntity<UsageResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/v1"
        const val PATH_ADMIN_API_KEYS_CREATE: String = "/organization/admin_api_keys"
        const val PATH_ADMIN_API_KEYS_DELETE: String = "/organization/admin_api_keys/{key_id}"
        const val PATH_ADMIN_API_KEYS_GET: String = "/organization/admin_api_keys/{key_id}"
        const val PATH_ADMIN_API_KEYS_LIST: String = "/organization/admin_api_keys"
        const val PATH_ARCHIVE_PROJECT: String = "/organization/projects/{project_id}/archive"
        const val PATH_CREATE_PROJECT: String = "/organization/projects"
        const val PATH_CREATE_PROJECT_SERVICE_ACCOUNT: String = "/organization/projects/{project_id}/service_accounts"
        const val PATH_CREATE_PROJECT_USER: String = "/organization/projects/{project_id}/users"
        const val PATH_DELETE_INVITE: String = "/organization/invites/{invite_id}"
        const val PATH_DELETE_PROJECT_API_KEY: String = "/organization/projects/{project_id}/api_keys/{key_id}"
        const val PATH_DELETE_PROJECT_SERVICE_ACCOUNT: String = "/organization/projects/{project_id}/service_accounts/{service_account_id}"
        const val PATH_DELETE_PROJECT_USER: String = "/organization/projects/{project_id}/users/{user_id}"
        const val PATH_DELETE_USER: String = "/organization/users/{user_id}"
        const val PATH_INVITE_USER: String = "/organization/invites"
        const val PATH_LIST_AUDIT_LOGS: String = "/organization/audit_logs"
        const val PATH_LIST_INVITES: String = "/organization/invites"
        const val PATH_LIST_PROJECT_API_KEYS: String = "/organization/projects/{project_id}/api_keys"
        const val PATH_LIST_PROJECT_RATE_LIMITS: String = "/organization/projects/{project_id}/rate_limits"
        const val PATH_LIST_PROJECT_SERVICE_ACCOUNTS: String = "/organization/projects/{project_id}/service_accounts"
        const val PATH_LIST_PROJECT_USERS: String = "/organization/projects/{project_id}/users"
        const val PATH_LIST_PROJECTS: String = "/organization/projects"
        const val PATH_LIST_USERS: String = "/organization/users"
        const val PATH_MODIFY_PROJECT: String = "/organization/projects/{project_id}"
        const val PATH_MODIFY_PROJECT_USER: String = "/organization/projects/{project_id}/users/{user_id}"
        const val PATH_MODIFY_USER: String = "/organization/users/{user_id}"
        const val PATH_RETRIEVE_INVITE: String = "/organization/invites/{invite_id}"
        const val PATH_RETRIEVE_PROJECT: String = "/organization/projects/{project_id}"
        const val PATH_RETRIEVE_PROJECT_API_KEY: String = "/organization/projects/{project_id}/api_keys/{key_id}"
        const val PATH_RETRIEVE_PROJECT_SERVICE_ACCOUNT: String = "/organization/projects/{project_id}/service_accounts/{service_account_id}"
        const val PATH_RETRIEVE_PROJECT_USER: String = "/organization/projects/{project_id}/users/{user_id}"
        const val PATH_RETRIEVE_USER: String = "/organization/users/{user_id}"
        const val PATH_UPDATE_PROJECT_RATE_LIMITS: String = "/organization/projects/{project_id}/rate_limits/{rate_limit_id}"
        const val PATH_USAGE_AUDIO_SPEECHES: String = "/organization/usage/audio_speeches"
        const val PATH_USAGE_AUDIO_TRANSCRIPTIONS: String = "/organization/usage/audio_transcriptions"
        const val PATH_USAGE_CODE_INTERPRETER_SESSIONS: String = "/organization/usage/code_interpreter_sessions"
        const val PATH_USAGE_COMPLETIONS: String = "/organization/usage/completions"
        const val PATH_USAGE_COSTS: String = "/organization/costs"
        const val PATH_USAGE_EMBEDDINGS: String = "/organization/usage/embeddings"
        const val PATH_USAGE_IMAGES: String = "/organization/usage/images"
        const val PATH_USAGE_MODERATIONS: String = "/organization/usage/moderations"
        const val PATH_USAGE_VECTOR_STORES: String = "/organization/usage/vector_stores"
    }
}
