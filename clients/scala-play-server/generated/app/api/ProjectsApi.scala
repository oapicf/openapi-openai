package api

import play.api.libs.json._
import model.ErrorResponse
import model.Project
import model.ProjectApiKey
import model.ProjectApiKeyDeleteResponse
import model.ProjectApiKeyListResponse
import model.ProjectCreateRequest
import model.ProjectListResponse
import model.ProjectRateLimit
import model.ProjectRateLimitListResponse
import model.ProjectRateLimitUpdateRequest
import model.ProjectServiceAccount
import model.ProjectServiceAccountCreateRequest
import model.ProjectServiceAccountCreateResponse
import model.ProjectServiceAccountDeleteResponse
import model.ProjectServiceAccountListResponse
import model.ProjectUpdateRequest
import model.ProjectUser
import model.ProjectUserCreateRequest
import model.ProjectUserDeleteResponse
import model.ProjectUserListResponse
import model.ProjectUserUpdateRequest

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
trait ProjectsApi {
  /**
    * Archives a project in the organization. Archived projects cannot be used or updated.
    * @param projectId The ID of the project.
    */
  def archiveProject(projectId: String): Project

  /**
    * Create a new project in the organization. Projects can be created and archived, but cannot be deleted.
    * @param projectCreateRequest The project create request payload.
    */
  def createProject(projectCreateRequest: ProjectCreateRequest): Project

  /**
    * Creates a new service account in the project. This also returns an unredacted API key for the service account.
    * @param projectId The ID of the project.
    * @param projectServiceAccountCreateRequest The project service account create request payload.
    */
  def createProjectServiceAccount(projectId: String, projectServiceAccountCreateRequest: ProjectServiceAccountCreateRequest): ProjectServiceAccountCreateResponse

  /**
    * Adds a user to the project. Users must already be members of the organization to be added to a project.
    * @param projectId The ID of the project.
    * @param projectUserCreateRequest The project user create request payload.
    */
  def createProjectUser(projectId: String, projectUserCreateRequest: ProjectUserCreateRequest): ProjectUser

  /**
    * Deletes an API key from the project.
    * @param projectId The ID of the project.
    * @param keyId The ID of the API key.
    */
  def deleteProjectApiKey(projectId: String, keyId: String): ProjectApiKeyDeleteResponse

  /**
    * Deletes a service account from the project.
    * @param projectId The ID of the project.
    * @param serviceAccountId The ID of the service account.
    */
  def deleteProjectServiceAccount(projectId: String, serviceAccountId: String): ProjectServiceAccountDeleteResponse

  /**
    * Deletes a user from the project.
    * @param projectId The ID of the project.
    * @param userId The ID of the user.
    */
  def deleteProjectUser(projectId: String, userId: String): ProjectUserDeleteResponse

  /**
    * Returns a list of API keys in the project.
    * @param projectId The ID of the project.
    * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
    * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
    */
  def listProjectApiKeys(projectId: String, limit: Option[Int], after: Option[String]): ProjectApiKeyListResponse

  /**
    * Returns the rate limits per model for a project.
    * @param projectId The ID of the project.
    * @param limit A limit on the number of objects to be returned. The default is 100. 
    * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
    * @param before A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, beginning with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
    */
  def listProjectRateLimits(projectId: String, limit: Option[Int], after: Option[String], before: Option[String]): ProjectRateLimitListResponse

  /**
    * Returns a list of service accounts in the project.
    * @param projectId The ID of the project.
    * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
    * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
    */
  def listProjectServiceAccounts(projectId: String, limit: Option[Int], after: Option[String]): ProjectServiceAccountListResponse

  /**
    * Returns a list of users in the project.
    * @param projectId The ID of the project.
    * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
    * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
    */
  def listProjectUsers(projectId: String, limit: Option[Int], after: Option[String]): ProjectUserListResponse

  /**
    * Returns a list of projects.
    * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
    * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
    * @param includeArchived If &#x60;true&#x60; returns all projects including those that have been &#x60;archived&#x60;. Archived projects are not included by default.
    */
  def listProjects(limit: Option[Int], after: Option[String], includeArchived: Option[Boolean]): ProjectListResponse

  /**
    * Modifies a project in the organization.
    * @param projectId The ID of the project.
    * @param projectUpdateRequest The project update request payload.
    */
  def modifyProject(projectId: String, projectUpdateRequest: ProjectUpdateRequest): Project

  /**
    * Modifies a user&#39;s role in the project.
    * @param projectId The ID of the project.
    * @param userId The ID of the user.
    * @param projectUserUpdateRequest The project user update request payload.
    */
  def modifyProjectUser(projectId: String, userId: String, projectUserUpdateRequest: ProjectUserUpdateRequest): ProjectUser

  /**
    * Retrieves a project.
    * @param projectId The ID of the project.
    */
  def retrieveProject(projectId: String): Project

  /**
    * Retrieves an API key in the project.
    * @param projectId The ID of the project.
    * @param keyId The ID of the API key.
    */
  def retrieveProjectApiKey(projectId: String, keyId: String): ProjectApiKey

  /**
    * Retrieves a service account in the project.
    * @param projectId The ID of the project.
    * @param serviceAccountId The ID of the service account.
    */
  def retrieveProjectServiceAccount(projectId: String, serviceAccountId: String): ProjectServiceAccount

  /**
    * Retrieves a user in the project.
    * @param projectId The ID of the project.
    * @param userId The ID of the user.
    */
  def retrieveProjectUser(projectId: String, userId: String): ProjectUser

  /**
    * Updates a project rate limit.
    * @param projectId The ID of the project.
    * @param rateLimitId The ID of the rate limit.
    * @param projectRateLimitUpdateRequest The project rate limit update request payload.
    */
  def updateProjectRateLimits(projectId: String, rateLimitId: String, projectRateLimitUpdateRequest: ProjectRateLimitUpdateRequest): ProjectRateLimit
}
