package api

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

/**
  * Provides a default implementation for [[ProjectsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
class ProjectsApiImpl extends ProjectsApi {
  /**
    * @inheritdoc
    */
  override def archiveProject(projectId: String): Project = {
    // TODO: Implement better logic

    Project("", "", "", 0, None, "")
  }

  /**
    * @inheritdoc
    */
  override def createProject(projectCreateRequest: ProjectCreateRequest): Project = {
    // TODO: Implement better logic

    Project("", "", "", 0, None, "")
  }

  /**
    * @inheritdoc
    */
  override def createProjectServiceAccount(projectId: String, projectServiceAccountCreateRequest: ProjectServiceAccountCreateRequest): ProjectServiceAccountCreateResponse = {
    // TODO: Implement better logic

    ProjectServiceAccountCreateResponse("", "", "", "", 0, ProjectServiceAccountApiKey("", "", "", 0, ""))
  }

  /**
    * @inheritdoc
    */
  override def createProjectUser(projectId: String, projectUserCreateRequest: ProjectUserCreateRequest): ProjectUser = {
    // TODO: Implement better logic

    ProjectUser("", "", "", "", "", 0)
  }

  /**
    * @inheritdoc
    */
  override def deleteProjectApiKey(projectId: String, keyId: String): ProjectApiKeyDeleteResponse = {
    // TODO: Implement better logic

    ProjectApiKeyDeleteResponse("", "", false)
  }

  /**
    * @inheritdoc
    */
  override def deleteProjectServiceAccount(projectId: String, serviceAccountId: String): ProjectServiceAccountDeleteResponse = {
    // TODO: Implement better logic

    ProjectServiceAccountDeleteResponse("", "", false)
  }

  /**
    * @inheritdoc
    */
  override def deleteProjectUser(projectId: String, userId: String): ProjectUserDeleteResponse = {
    // TODO: Implement better logic

    ProjectUserDeleteResponse("", "", false)
  }

  /**
    * @inheritdoc
    */
  override def listProjectApiKeys(projectId: String, limit: Option[Int], after: Option[String]): ProjectApiKeyListResponse = {
    // TODO: Implement better logic

    ProjectApiKeyListResponse("", List.empty[ProjectApiKey], "", "", false)
  }

  /**
    * @inheritdoc
    */
  override def listProjectRateLimits(projectId: String, limit: Option[Int], after: Option[String], before: Option[String]): ProjectRateLimitListResponse = {
    // TODO: Implement better logic

    ProjectRateLimitListResponse("", List.empty[ProjectRateLimit], "", "", false)
  }

  /**
    * @inheritdoc
    */
  override def listProjectServiceAccounts(projectId: String, limit: Option[Int], after: Option[String]): ProjectServiceAccountListResponse = {
    // TODO: Implement better logic

    ProjectServiceAccountListResponse("", List.empty[ProjectServiceAccount], "", "", false)
  }

  /**
    * @inheritdoc
    */
  override def listProjectUsers(projectId: String, limit: Option[Int], after: Option[String]): ProjectUserListResponse = {
    // TODO: Implement better logic

    ProjectUserListResponse("", List.empty[ProjectUser], "", "", false)
  }

  /**
    * @inheritdoc
    */
  override def listProjects(limit: Option[Int], after: Option[String], includeArchived: Option[Boolean]): ProjectListResponse = {
    // TODO: Implement better logic

    ProjectListResponse("", List.empty[Project], "", "", false)
  }

  /**
    * @inheritdoc
    */
  override def modifyProject(projectId: String, projectUpdateRequest: ProjectUpdateRequest): Project = {
    // TODO: Implement better logic

    Project("", "", "", 0, None, "")
  }

  /**
    * @inheritdoc
    */
  override def modifyProjectUser(projectId: String, userId: String, projectUserUpdateRequest: ProjectUserUpdateRequest): ProjectUser = {
    // TODO: Implement better logic

    ProjectUser("", "", "", "", "", 0)
  }

  /**
    * @inheritdoc
    */
  override def retrieveProject(projectId: String): Project = {
    // TODO: Implement better logic

    Project("", "", "", 0, None, "")
  }

  /**
    * @inheritdoc
    */
  override def retrieveProjectApiKey(projectId: String, keyId: String): ProjectApiKey = {
    // TODO: Implement better logic

    ProjectApiKey("", "", "", 0, "", ProjectApiKeyOwner(None, None, None))
  }

  /**
    * @inheritdoc
    */
  override def retrieveProjectServiceAccount(projectId: String, serviceAccountId: String): ProjectServiceAccount = {
    // TODO: Implement better logic

    ProjectServiceAccount("", "", "", "", 0)
  }

  /**
    * @inheritdoc
    */
  override def retrieveProjectUser(projectId: String, userId: String): ProjectUser = {
    // TODO: Implement better logic

    ProjectUser("", "", "", "", "", 0)
  }

  /**
    * @inheritdoc
    */
  override def updateProjectRateLimits(projectId: String, rateLimitId: String, projectRateLimitUpdateRequest: ProjectRateLimitUpdateRequest): ProjectRateLimit = {
    // TODO: Implement better logic

    ProjectRateLimit("", "", "", 0, 0, None, None, None, None)
  }
}
