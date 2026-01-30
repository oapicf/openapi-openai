package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
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
@Singleton
class ProjectsApiController @Inject()(cc: ControllerComponents, api: ProjectsApi) extends AbstractController(cc) {
  /**
    * POST /v1/organization/projects/:projectId/archive
    * @param projectId The ID of the project.
    */
  def archiveProject(projectId: String): Action[AnyContent] = Action { request =>
    def executeApi(): Project = {
      api.archiveProject(projectId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v1/organization/projects
    */
  def createProject(): Action[AnyContent] = Action { request =>
    def executeApi(): Project = {
      val projectCreateRequest = request.body.asJson.map(_.as[ProjectCreateRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "projectCreateRequest")
      }
      api.createProject(projectCreateRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v1/organization/projects/:projectId/service_accounts
    * @param projectId The ID of the project.
    */
  def createProjectServiceAccount(projectId: String): Action[AnyContent] = Action { request =>
    def executeApi(): ProjectServiceAccountCreateResponse = {
      val projectServiceAccountCreateRequest = request.body.asJson.map(_.as[ProjectServiceAccountCreateRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "projectServiceAccountCreateRequest")
      }
      api.createProjectServiceAccount(projectId, projectServiceAccountCreateRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v1/organization/projects/:projectId/users
    * @param projectId The ID of the project.
    */
  def createProjectUser(projectId: String): Action[AnyContent] = Action { request =>
    def executeApi(): ProjectUser = {
      val projectUserCreateRequest = request.body.asJson.map(_.as[ProjectUserCreateRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "projectUserCreateRequest")
      }
      api.createProjectUser(projectId, projectUserCreateRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * DELETE /v1/organization/projects/:projectId/api_keys/:keyId
    * @param projectId The ID of the project.
    * @param keyId The ID of the API key.
    */
  def deleteProjectApiKey(projectId: String, keyId: String): Action[AnyContent] = Action { request =>
    def executeApi(): ProjectApiKeyDeleteResponse = {
      api.deleteProjectApiKey(projectId, keyId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * DELETE /v1/organization/projects/:projectId/service_accounts/:serviceAccountId
    * @param projectId The ID of the project.
    * @param serviceAccountId The ID of the service account.
    */
  def deleteProjectServiceAccount(projectId: String, serviceAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): ProjectServiceAccountDeleteResponse = {
      api.deleteProjectServiceAccount(projectId, serviceAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * DELETE /v1/organization/projects/:projectId/users/:userId
    * @param projectId The ID of the project.
    * @param userId The ID of the user.
    */
  def deleteProjectUser(projectId: String, userId: String): Action[AnyContent] = Action { request =>
    def executeApi(): ProjectUserDeleteResponse = {
      api.deleteProjectUser(projectId, userId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v1/organization/projects/:projectId/api_keys?limit=[value]&after=[value]
    * @param projectId The ID of the project.
    */
  def listProjectApiKeys(projectId: String): Action[AnyContent] = Action { request =>
    def executeApi(): ProjectApiKeyListResponse = {
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val after = request.getQueryString("after")
        
      api.listProjectApiKeys(projectId, limit, after)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v1/organization/projects/:projectId/rate_limits?limit=[value]&after=[value]&before=[value]
    * @param projectId The ID of the project.
    */
  def listProjectRateLimits(projectId: String): Action[AnyContent] = Action { request =>
    def executeApi(): ProjectRateLimitListResponse = {
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val after = request.getQueryString("after")
        
      val before = request.getQueryString("before")
        
      api.listProjectRateLimits(projectId, limit, after, before)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v1/organization/projects/:projectId/service_accounts?limit=[value]&after=[value]
    * @param projectId The ID of the project.
    */
  def listProjectServiceAccounts(projectId: String): Action[AnyContent] = Action { request =>
    def executeApi(): ProjectServiceAccountListResponse = {
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val after = request.getQueryString("after")
        
      api.listProjectServiceAccounts(projectId, limit, after)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v1/organization/projects/:projectId/users?limit=[value]&after=[value]
    * @param projectId The ID of the project.
    */
  def listProjectUsers(projectId: String): Action[AnyContent] = Action { request =>
    def executeApi(): ProjectUserListResponse = {
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val after = request.getQueryString("after")
        
      api.listProjectUsers(projectId, limit, after)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v1/organization/projects?limit=[value]&after=[value]&includeArchived=[value]
    */
  def listProjects(): Action[AnyContent] = Action { request =>
    def executeApi(): ProjectListResponse = {
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val after = request.getQueryString("after")
        
      val includeArchived = request.getQueryString("include_archived")
        .map(value => value.toBoolean)
        
      api.listProjects(limit, after, includeArchived)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v1/organization/projects/:projectId
    * @param projectId The ID of the project.
    */
  def modifyProject(projectId: String): Action[AnyContent] = Action { request =>
    def executeApi(): Project = {
      val projectUpdateRequest = request.body.asJson.map(_.as[ProjectUpdateRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "projectUpdateRequest")
      }
      api.modifyProject(projectId, projectUpdateRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v1/organization/projects/:projectId/users/:userId
    * @param projectId The ID of the project.
    * @param userId The ID of the user.
    */
  def modifyProjectUser(projectId: String, userId: String): Action[AnyContent] = Action { request =>
    def executeApi(): ProjectUser = {
      val projectUserUpdateRequest = request.body.asJson.map(_.as[ProjectUserUpdateRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "projectUserUpdateRequest")
      }
      api.modifyProjectUser(projectId, userId, projectUserUpdateRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v1/organization/projects/:projectId
    * @param projectId The ID of the project.
    */
  def retrieveProject(projectId: String): Action[AnyContent] = Action { request =>
    def executeApi(): Project = {
      api.retrieveProject(projectId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v1/organization/projects/:projectId/api_keys/:keyId
    * @param projectId The ID of the project.
    * @param keyId The ID of the API key.
    */
  def retrieveProjectApiKey(projectId: String, keyId: String): Action[AnyContent] = Action { request =>
    def executeApi(): ProjectApiKey = {
      api.retrieveProjectApiKey(projectId, keyId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v1/organization/projects/:projectId/service_accounts/:serviceAccountId
    * @param projectId The ID of the project.
    * @param serviceAccountId The ID of the service account.
    */
  def retrieveProjectServiceAccount(projectId: String, serviceAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): ProjectServiceAccount = {
      api.retrieveProjectServiceAccount(projectId, serviceAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v1/organization/projects/:projectId/users/:userId
    * @param projectId The ID of the project.
    * @param userId The ID of the user.
    */
  def retrieveProjectUser(projectId: String, userId: String): Action[AnyContent] = Action { request =>
    def executeApi(): ProjectUser = {
      api.retrieveProjectUser(projectId, userId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v1/organization/projects/:projectId/rate_limits/:rateLimitId
    * @param projectId The ID of the project.
    * @param rateLimitId The ID of the rate limit.
    */
  def updateProjectRateLimits(projectId: String, rateLimitId: String): Action[AnyContent] = Action { request =>
    def executeApi(): ProjectRateLimit = {
      val projectRateLimitUpdateRequest = request.body.asJson.map(_.as[ProjectRateLimitUpdateRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "projectRateLimitUpdateRequest")
      }
      api.updateProjectRateLimits(projectId, rateLimitId, projectRateLimitUpdateRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  private def splitCollectionParam(paramValues: String, collectionFormat: String): List[String] = {
    val splitBy =
      collectionFormat match {
        case "csv" => ",+"
        case "tsv" => "\t+"
        case "ssv" => " +"
        case "pipes" => "|+"
      }

    paramValues.split(splitBy).toList
  }
}
