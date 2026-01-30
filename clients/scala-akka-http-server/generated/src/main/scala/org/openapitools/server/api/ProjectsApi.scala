package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.ErrorResponse
import org.openapitools.server.model.Project
import org.openapitools.server.model.ProjectApiKey
import org.openapitools.server.model.ProjectApiKeyDeleteResponse
import org.openapitools.server.model.ProjectApiKeyListResponse
import org.openapitools.server.model.ProjectCreateRequest
import org.openapitools.server.model.ProjectListResponse
import org.openapitools.server.model.ProjectRateLimit
import org.openapitools.server.model.ProjectRateLimitListResponse
import org.openapitools.server.model.ProjectRateLimitUpdateRequest
import org.openapitools.server.model.ProjectServiceAccount
import org.openapitools.server.model.ProjectServiceAccountCreateRequest
import org.openapitools.server.model.ProjectServiceAccountCreateResponse
import org.openapitools.server.model.ProjectServiceAccountDeleteResponse
import org.openapitools.server.model.ProjectServiceAccountListResponse
import org.openapitools.server.model.ProjectUpdateRequest
import org.openapitools.server.model.ProjectUser
import org.openapitools.server.model.ProjectUserCreateRequest
import org.openapitools.server.model.ProjectUserDeleteResponse
import org.openapitools.server.model.ProjectUserListResponse
import org.openapitools.server.model.ProjectUserUpdateRequest


class ProjectsApi(
    projectsService: ProjectsApiService,
    projectsMarshaller: ProjectsApiMarshaller
) {

  
  import projectsMarshaller._

  lazy val route: Route =
    path("organization" / "projects" / Segment / "archive") { (projectId) => 
      post {  
            projectsService.archiveProject(projectId = projectId)
      }
    } ~
    path("organization" / "projects") { 
      post {  
            entity(as[ProjectCreateRequest]){ projectCreateRequest =>
              projectsService.createProject(projectCreateRequest = projectCreateRequest)
            }
      }
    } ~
    path("organization" / "projects" / Segment / "service_accounts") { (projectId) => 
      post {  
            entity(as[ProjectServiceAccountCreateRequest]){ projectServiceAccountCreateRequest =>
              projectsService.createProjectServiceAccount(projectId = projectId, projectServiceAccountCreateRequest = projectServiceAccountCreateRequest)
            }
      }
    } ~
    path("organization" / "projects" / Segment / "users") { (projectId) => 
      post {  
            entity(as[ProjectUserCreateRequest]){ projectUserCreateRequest =>
              projectsService.createProjectUser(projectId = projectId, projectUserCreateRequest = projectUserCreateRequest)
            }
      }
    } ~
    path("organization" / "projects" / Segment / "api_keys" / Segment) { (projectId, keyId) => 
      delete {  
            projectsService.deleteProjectApiKey(projectId = projectId, keyId = keyId)
      }
    } ~
    path("organization" / "projects" / Segment / "service_accounts" / Segment) { (projectId, serviceAccountId) => 
      delete {  
            projectsService.deleteProjectServiceAccount(projectId = projectId, serviceAccountId = serviceAccountId)
      }
    } ~
    path("organization" / "projects" / Segment / "users" / Segment) { (projectId, userId) => 
      delete {  
            projectsService.deleteProjectUser(projectId = projectId, userId = userId)
      }
    } ~
    path("organization" / "projects" / Segment / "api_keys") { (projectId) => 
      get { 
        parameters("limit".as[Int].?(20), "after".as[String].?) { (limit, after) => 
            projectsService.listProjectApiKeys(projectId = projectId, limit = limit, after = after)
        }
      }
    } ~
    path("organization" / "projects" / Segment / "rate_limits") { (projectId) => 
      get { 
        parameters("limit".as[Int].?(100), "after".as[String].?, "before".as[String].?) { (limit, after, before) => 
            projectsService.listProjectRateLimits(projectId = projectId, limit = limit, after = after, before = before)
        }
      }
    } ~
    path("organization" / "projects" / Segment / "service_accounts") { (projectId) => 
      get { 
        parameters("limit".as[Int].?(20), "after".as[String].?) { (limit, after) => 
            projectsService.listProjectServiceAccounts(projectId = projectId, limit = limit, after = after)
        }
      }
    } ~
    path("organization" / "projects" / Segment / "users") { (projectId) => 
      get { 
        parameters("limit".as[Int].?(20), "after".as[String].?) { (limit, after) => 
            projectsService.listProjectUsers(projectId = projectId, limit = limit, after = after)
        }
      }
    } ~
    path("organization" / "projects") { 
      get { 
        parameters("limit".as[Int].?(20), "after".as[String].?, "include_archived".as[Boolean].?(false)) { (limit, after, includeArchived) => 
            projectsService.listProjects(limit = limit, after = after, includeArchived = includeArchived)
        }
      }
    } ~
    path("organization" / "projects" / Segment) { (projectId) => 
      post {  
            entity(as[ProjectUpdateRequest]){ projectUpdateRequest =>
              projectsService.modifyProject(projectId = projectId, projectUpdateRequest = projectUpdateRequest)
            }
      }
    } ~
    path("organization" / "projects" / Segment / "users" / Segment) { (projectId, userId) => 
      post {  
            entity(as[ProjectUserUpdateRequest]){ projectUserUpdateRequest =>
              projectsService.modifyProjectUser(projectId = projectId, userId = userId, projectUserUpdateRequest = projectUserUpdateRequest)
            }
      }
    } ~
    path("organization" / "projects" / Segment) { (projectId) => 
      get {  
            projectsService.retrieveProject(projectId = projectId)
      }
    } ~
    path("organization" / "projects" / Segment / "api_keys" / Segment) { (projectId, keyId) => 
      get {  
            projectsService.retrieveProjectApiKey(projectId = projectId, keyId = keyId)
      }
    } ~
    path("organization" / "projects" / Segment / "service_accounts" / Segment) { (projectId, serviceAccountId) => 
      get {  
            projectsService.retrieveProjectServiceAccount(projectId = projectId, serviceAccountId = serviceAccountId)
      }
    } ~
    path("organization" / "projects" / Segment / "users" / Segment) { (projectId, userId) => 
      get {  
            projectsService.retrieveProjectUser(projectId = projectId, userId = userId)
      }
    } ~
    path("organization" / "projects" / Segment / "rate_limits" / Segment) { (projectId, rateLimitId) => 
      post {  
            entity(as[ProjectRateLimitUpdateRequest]){ projectRateLimitUpdateRequest =>
              projectsService.updateProjectRateLimits(projectId = projectId, rateLimitId = rateLimitId, projectRateLimitUpdateRequest = projectRateLimitUpdateRequest)
            }
      }
    }
}


trait ProjectsApiService {

  def archiveProject200(responseProject: Project)(implicit toEntityMarshallerProject: ToEntityMarshaller[Project]): Route =
    complete((200, responseProject))
  /**
   * Code: 200, Message: Project archived successfully., DataType: Project
   */
  def archiveProject(projectId: String)
      (implicit toEntityMarshallerProject: ToEntityMarshaller[Project]): Route

  def createProject200(responseProject: Project)(implicit toEntityMarshallerProject: ToEntityMarshaller[Project]): Route =
    complete((200, responseProject))
  /**
   * Code: 200, Message: Project created successfully., DataType: Project
   */
  def createProject(projectCreateRequest: ProjectCreateRequest)
      (implicit toEntityMarshallerProject: ToEntityMarshaller[Project]): Route

  def createProjectServiceAccount200(responseProjectServiceAccountCreateResponse: ProjectServiceAccountCreateResponse)(implicit toEntityMarshallerProjectServiceAccountCreateResponse: ToEntityMarshaller[ProjectServiceAccountCreateResponse]): Route =
    complete((200, responseProjectServiceAccountCreateResponse))
  def createProjectServiceAccount400(responseErrorResponse: ErrorResponse)(implicit toEntityMarshallerErrorResponse: ToEntityMarshaller[ErrorResponse]): Route =
    complete((400, responseErrorResponse))
  /**
   * Code: 200, Message: Project service account created successfully., DataType: ProjectServiceAccountCreateResponse
   * Code: 400, Message: Error response when project is archived., DataType: ErrorResponse
   */
  def createProjectServiceAccount(projectId: String, projectServiceAccountCreateRequest: ProjectServiceAccountCreateRequest)
      (implicit toEntityMarshallerProjectServiceAccountCreateResponse: ToEntityMarshaller[ProjectServiceAccountCreateResponse], toEntityMarshallerErrorResponse: ToEntityMarshaller[ErrorResponse]): Route

  def createProjectUser200(responseProjectUser: ProjectUser)(implicit toEntityMarshallerProjectUser: ToEntityMarshaller[ProjectUser]): Route =
    complete((200, responseProjectUser))
  def createProjectUser400(responseErrorResponse: ErrorResponse)(implicit toEntityMarshallerErrorResponse: ToEntityMarshaller[ErrorResponse]): Route =
    complete((400, responseErrorResponse))
  /**
   * Code: 200, Message: User added to project successfully., DataType: ProjectUser
   * Code: 400, Message: Error response for various conditions., DataType: ErrorResponse
   */
  def createProjectUser(projectId: String, projectUserCreateRequest: ProjectUserCreateRequest)
      (implicit toEntityMarshallerProjectUser: ToEntityMarshaller[ProjectUser], toEntityMarshallerErrorResponse: ToEntityMarshaller[ErrorResponse]): Route

  def deleteProjectApiKey200(responseProjectApiKeyDeleteResponse: ProjectApiKeyDeleteResponse)(implicit toEntityMarshallerProjectApiKeyDeleteResponse: ToEntityMarshaller[ProjectApiKeyDeleteResponse]): Route =
    complete((200, responseProjectApiKeyDeleteResponse))
  def deleteProjectApiKey400(responseErrorResponse: ErrorResponse)(implicit toEntityMarshallerErrorResponse: ToEntityMarshaller[ErrorResponse]): Route =
    complete((400, responseErrorResponse))
  /**
   * Code: 200, Message: Project API key deleted successfully., DataType: ProjectApiKeyDeleteResponse
   * Code: 400, Message: Error response for various conditions., DataType: ErrorResponse
   */
  def deleteProjectApiKey(projectId: String, keyId: String)
      (implicit toEntityMarshallerProjectApiKeyDeleteResponse: ToEntityMarshaller[ProjectApiKeyDeleteResponse], toEntityMarshallerErrorResponse: ToEntityMarshaller[ErrorResponse]): Route

  def deleteProjectServiceAccount200(responseProjectServiceAccountDeleteResponse: ProjectServiceAccountDeleteResponse)(implicit toEntityMarshallerProjectServiceAccountDeleteResponse: ToEntityMarshaller[ProjectServiceAccountDeleteResponse]): Route =
    complete((200, responseProjectServiceAccountDeleteResponse))
  /**
   * Code: 200, Message: Project service account deleted successfully., DataType: ProjectServiceAccountDeleteResponse
   */
  def deleteProjectServiceAccount(projectId: String, serviceAccountId: String)
      (implicit toEntityMarshallerProjectServiceAccountDeleteResponse: ToEntityMarshaller[ProjectServiceAccountDeleteResponse]): Route

  def deleteProjectUser200(responseProjectUserDeleteResponse: ProjectUserDeleteResponse)(implicit toEntityMarshallerProjectUserDeleteResponse: ToEntityMarshaller[ProjectUserDeleteResponse]): Route =
    complete((200, responseProjectUserDeleteResponse))
  def deleteProjectUser400(responseErrorResponse: ErrorResponse)(implicit toEntityMarshallerErrorResponse: ToEntityMarshaller[ErrorResponse]): Route =
    complete((400, responseErrorResponse))
  /**
   * Code: 200, Message: Project user deleted successfully., DataType: ProjectUserDeleteResponse
   * Code: 400, Message: Error response for various conditions., DataType: ErrorResponse
   */
  def deleteProjectUser(projectId: String, userId: String)
      (implicit toEntityMarshallerProjectUserDeleteResponse: ToEntityMarshaller[ProjectUserDeleteResponse], toEntityMarshallerErrorResponse: ToEntityMarshaller[ErrorResponse]): Route

  def listProjectApiKeys200(responseProjectApiKeyListResponse: ProjectApiKeyListResponse)(implicit toEntityMarshallerProjectApiKeyListResponse: ToEntityMarshaller[ProjectApiKeyListResponse]): Route =
    complete((200, responseProjectApiKeyListResponse))
  /**
   * Code: 200, Message: Project API keys listed successfully., DataType: ProjectApiKeyListResponse
   */
  def listProjectApiKeys(projectId: String, limit: Int, after: Option[String])
      (implicit toEntityMarshallerProjectApiKeyListResponse: ToEntityMarshaller[ProjectApiKeyListResponse]): Route

  def listProjectRateLimits200(responseProjectRateLimitListResponse: ProjectRateLimitListResponse)(implicit toEntityMarshallerProjectRateLimitListResponse: ToEntityMarshaller[ProjectRateLimitListResponse]): Route =
    complete((200, responseProjectRateLimitListResponse))
  /**
   * Code: 200, Message: Project rate limits listed successfully., DataType: ProjectRateLimitListResponse
   */
  def listProjectRateLimits(projectId: String, limit: Int, after: Option[String], before: Option[String])
      (implicit toEntityMarshallerProjectRateLimitListResponse: ToEntityMarshaller[ProjectRateLimitListResponse]): Route

  def listProjectServiceAccounts200(responseProjectServiceAccountListResponse: ProjectServiceAccountListResponse)(implicit toEntityMarshallerProjectServiceAccountListResponse: ToEntityMarshaller[ProjectServiceAccountListResponse]): Route =
    complete((200, responseProjectServiceAccountListResponse))
  def listProjectServiceAccounts400(responseErrorResponse: ErrorResponse)(implicit toEntityMarshallerErrorResponse: ToEntityMarshaller[ErrorResponse]): Route =
    complete((400, responseErrorResponse))
  /**
   * Code: 200, Message: Project service accounts listed successfully., DataType: ProjectServiceAccountListResponse
   * Code: 400, Message: Error response when project is archived., DataType: ErrorResponse
   */
  def listProjectServiceAccounts(projectId: String, limit: Int, after: Option[String])
      (implicit toEntityMarshallerProjectServiceAccountListResponse: ToEntityMarshaller[ProjectServiceAccountListResponse], toEntityMarshallerErrorResponse: ToEntityMarshaller[ErrorResponse]): Route

  def listProjectUsers200(responseProjectUserListResponse: ProjectUserListResponse)(implicit toEntityMarshallerProjectUserListResponse: ToEntityMarshaller[ProjectUserListResponse]): Route =
    complete((200, responseProjectUserListResponse))
  def listProjectUsers400(responseErrorResponse: ErrorResponse)(implicit toEntityMarshallerErrorResponse: ToEntityMarshaller[ErrorResponse]): Route =
    complete((400, responseErrorResponse))
  /**
   * Code: 200, Message: Project users listed successfully., DataType: ProjectUserListResponse
   * Code: 400, Message: Error response when project is archived., DataType: ErrorResponse
   */
  def listProjectUsers(projectId: String, limit: Int, after: Option[String])
      (implicit toEntityMarshallerProjectUserListResponse: ToEntityMarshaller[ProjectUserListResponse], toEntityMarshallerErrorResponse: ToEntityMarshaller[ErrorResponse]): Route

  def listProjects200(responseProjectListResponse: ProjectListResponse)(implicit toEntityMarshallerProjectListResponse: ToEntityMarshaller[ProjectListResponse]): Route =
    complete((200, responseProjectListResponse))
  /**
   * Code: 200, Message: Projects listed successfully., DataType: ProjectListResponse
   */
  def listProjects(limit: Int, after: Option[String], includeArchived: Boolean)
      (implicit toEntityMarshallerProjectListResponse: ToEntityMarshaller[ProjectListResponse]): Route

  def modifyProject200(responseProject: Project)(implicit toEntityMarshallerProject: ToEntityMarshaller[Project]): Route =
    complete((200, responseProject))
  def modifyProject400(responseErrorResponse: ErrorResponse)(implicit toEntityMarshallerErrorResponse: ToEntityMarshaller[ErrorResponse]): Route =
    complete((400, responseErrorResponse))
  /**
   * Code: 200, Message: Project updated successfully., DataType: Project
   * Code: 400, Message: Error response when updating the default project., DataType: ErrorResponse
   */
  def modifyProject(projectId: String, projectUpdateRequest: ProjectUpdateRequest)
      (implicit toEntityMarshallerProject: ToEntityMarshaller[Project], toEntityMarshallerErrorResponse: ToEntityMarshaller[ErrorResponse]): Route

  def modifyProjectUser200(responseProjectUser: ProjectUser)(implicit toEntityMarshallerProjectUser: ToEntityMarshaller[ProjectUser]): Route =
    complete((200, responseProjectUser))
  def modifyProjectUser400(responseErrorResponse: ErrorResponse)(implicit toEntityMarshallerErrorResponse: ToEntityMarshaller[ErrorResponse]): Route =
    complete((400, responseErrorResponse))
  /**
   * Code: 200, Message: Project user&#39;s role updated successfully., DataType: ProjectUser
   * Code: 400, Message: Error response for various conditions., DataType: ErrorResponse
   */
  def modifyProjectUser(projectId: String, userId: String, projectUserUpdateRequest: ProjectUserUpdateRequest)
      (implicit toEntityMarshallerProjectUser: ToEntityMarshaller[ProjectUser], toEntityMarshallerErrorResponse: ToEntityMarshaller[ErrorResponse]): Route

  def retrieveProject200(responseProject: Project)(implicit toEntityMarshallerProject: ToEntityMarshaller[Project]): Route =
    complete((200, responseProject))
  /**
   * Code: 200, Message: Project retrieved successfully., DataType: Project
   */
  def retrieveProject(projectId: String)
      (implicit toEntityMarshallerProject: ToEntityMarshaller[Project]): Route

  def retrieveProjectApiKey200(responseProjectApiKey: ProjectApiKey)(implicit toEntityMarshallerProjectApiKey: ToEntityMarshaller[ProjectApiKey]): Route =
    complete((200, responseProjectApiKey))
  /**
   * Code: 200, Message: Project API key retrieved successfully., DataType: ProjectApiKey
   */
  def retrieveProjectApiKey(projectId: String, keyId: String)
      (implicit toEntityMarshallerProjectApiKey: ToEntityMarshaller[ProjectApiKey]): Route

  def retrieveProjectServiceAccount200(responseProjectServiceAccount: ProjectServiceAccount)(implicit toEntityMarshallerProjectServiceAccount: ToEntityMarshaller[ProjectServiceAccount]): Route =
    complete((200, responseProjectServiceAccount))
  /**
   * Code: 200, Message: Project service account retrieved successfully., DataType: ProjectServiceAccount
   */
  def retrieveProjectServiceAccount(projectId: String, serviceAccountId: String)
      (implicit toEntityMarshallerProjectServiceAccount: ToEntityMarshaller[ProjectServiceAccount]): Route

  def retrieveProjectUser200(responseProjectUser: ProjectUser)(implicit toEntityMarshallerProjectUser: ToEntityMarshaller[ProjectUser]): Route =
    complete((200, responseProjectUser))
  /**
   * Code: 200, Message: Project user retrieved successfully., DataType: ProjectUser
   */
  def retrieveProjectUser(projectId: String, userId: String)
      (implicit toEntityMarshallerProjectUser: ToEntityMarshaller[ProjectUser]): Route

  def updateProjectRateLimits200(responseProjectRateLimit: ProjectRateLimit)(implicit toEntityMarshallerProjectRateLimit: ToEntityMarshaller[ProjectRateLimit]): Route =
    complete((200, responseProjectRateLimit))
  def updateProjectRateLimits400(responseErrorResponse: ErrorResponse)(implicit toEntityMarshallerErrorResponse: ToEntityMarshaller[ErrorResponse]): Route =
    complete((400, responseErrorResponse))
  /**
   * Code: 200, Message: Project rate limit updated successfully., DataType: ProjectRateLimit
   * Code: 400, Message: Error response for various conditions., DataType: ErrorResponse
   */
  def updateProjectRateLimits(projectId: String, rateLimitId: String, projectRateLimitUpdateRequest: ProjectRateLimitUpdateRequest)
      (implicit toEntityMarshallerProjectRateLimit: ToEntityMarshaller[ProjectRateLimit], toEntityMarshallerErrorResponse: ToEntityMarshaller[ErrorResponse]): Route

}

trait ProjectsApiMarshaller {
  implicit def fromEntityUnmarshallerProjectUserCreateRequest: FromEntityUnmarshaller[ProjectUserCreateRequest]

  implicit def fromEntityUnmarshallerProjectUserUpdateRequest: FromEntityUnmarshaller[ProjectUserUpdateRequest]

  implicit def fromEntityUnmarshallerProjectCreateRequest: FromEntityUnmarshaller[ProjectCreateRequest]

  implicit def fromEntityUnmarshallerProjectUpdateRequest: FromEntityUnmarshaller[ProjectUpdateRequest]

  implicit def fromEntityUnmarshallerProjectRateLimitUpdateRequest: FromEntityUnmarshaller[ProjectRateLimitUpdateRequest]

  implicit def fromEntityUnmarshallerProjectServiceAccountCreateRequest: FromEntityUnmarshaller[ProjectServiceAccountCreateRequest]



  implicit def toEntityMarshallerProjectUserDeleteResponse: ToEntityMarshaller[ProjectUserDeleteResponse]

  implicit def toEntityMarshallerProjectRateLimitListResponse: ToEntityMarshaller[ProjectRateLimitListResponse]

  implicit def toEntityMarshallerProjectUser: ToEntityMarshaller[ProjectUser]

  implicit def toEntityMarshallerProjectServiceAccountDeleteResponse: ToEntityMarshaller[ProjectServiceAccountDeleteResponse]

  implicit def toEntityMarshallerProjectApiKey: ToEntityMarshaller[ProjectApiKey]

  implicit def toEntityMarshallerProjectListResponse: ToEntityMarshaller[ProjectListResponse]

  implicit def toEntityMarshallerProjectApiKeyDeleteResponse: ToEntityMarshaller[ProjectApiKeyDeleteResponse]

  implicit def toEntityMarshallerProjectServiceAccountCreateResponse: ToEntityMarshaller[ProjectServiceAccountCreateResponse]

  implicit def toEntityMarshallerProjectRateLimit: ToEntityMarshaller[ProjectRateLimit]

  implicit def toEntityMarshallerProjectUserListResponse: ToEntityMarshaller[ProjectUserListResponse]

  implicit def toEntityMarshallerProjectServiceAccountListResponse: ToEntityMarshaller[ProjectServiceAccountListResponse]

  implicit def toEntityMarshallerProjectApiKeyListResponse: ToEntityMarshaller[ProjectApiKeyListResponse]

  implicit def toEntityMarshallerProjectServiceAccount: ToEntityMarshaller[ProjectServiceAccount]

  implicit def toEntityMarshallerProject: ToEntityMarshaller[Project]

  implicit def toEntityMarshallerErrorResponse: ToEntityMarshaller[ErrorResponse]

}

