package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.ErrorResponse
import org.openapitools.models.Project
import org.openapitools.models.ProjectApiKey
import org.openapitools.models.ProjectApiKeyDeleteResponse
import org.openapitools.models.ProjectApiKeyListResponse
import org.openapitools.models.ProjectCreateRequest
import org.openapitools.models.ProjectListResponse
import org.openapitools.models.ProjectRateLimit
import org.openapitools.models.ProjectRateLimitListResponse
import org.openapitools.models.ProjectRateLimitUpdateRequest
import org.openapitools.models.ProjectServiceAccount
import org.openapitools.models.ProjectServiceAccountCreateRequest
import org.openapitools.models.ProjectServiceAccountCreateResponse
import org.openapitools.models.ProjectServiceAccountDeleteResponse
import org.openapitools.models.ProjectServiceAccountListResponse
import org.openapitools.models.ProjectUpdateRequest
import org.openapitools.models.ProjectUser
import org.openapitools.models.ProjectUserCreateRequest
import org.openapitools.models.ProjectUserDeleteResponse
import org.openapitools.models.ProjectUserListResponse
import org.openapitools.models.ProjectUserUpdateRequest
import io.finch.circe._
import io.circe.generic.semiauto._
import com.twitter.concurrent.AsyncStream
import com.twitter.finagle.Service
import com.twitter.finagle.Http
import com.twitter.finagle.http.{Request, Response}
import com.twitter.finagle.http.exp.Multipart.{FileUpload, InMemoryFileUpload, OnDiskFileUpload}
import com.twitter.util.Future
import com.twitter.io.Buf
import io.finch._, items._
import java.io.File
import java.nio.file.Files
import java.time._

object ProjectsApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        archiveProject(da) :+:
        createProject(da) :+:
        createProjectServiceAccount(da) :+:
        createProjectUser(da) :+:
        deleteProjectApiKey(da) :+:
        deleteProjectServiceAccount(da) :+:
        deleteProjectUser(da) :+:
        listProjectApiKeys(da) :+:
        listProjectRateLimits(da) :+:
        listProjectServiceAccounts(da) :+:
        listProjectUsers(da) :+:
        listProjects(da) :+:
        modifyProject(da) :+:
        modifyProjectUser(da) :+:
        retrieveProject(da) :+:
        retrieveProjectApiKey(da) :+:
        retrieveProjectServiceAccount(da) :+:
        retrieveProjectUser(da) :+:
        updateProjectRateLimits(da)


    private def checkError(e: CommonError) = e match {
      case InvalidInput(_) => BadRequest(e)
      case MissingIdentifier(_) => BadRequest(e)
      case RecordNotFound(_) => NotFound(e)
      case _ => InternalServerError(e)
    }

    implicit class StringOps(s: String) {

      import java.time.format.DateTimeFormatter

      lazy val localformatter: DateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")
      lazy val datetimeformatter: DateTimeFormatter =
      DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ")

      def toLocalDateTime: LocalDateTime = LocalDateTime.parse(s,localformatter)
      def toZonedDateTime: ZonedDateTime = ZonedDateTime.parse(s, datetimeformatter)

    }

        /**
        * 
        * @return An endpoint representing a Project
        */
        private def archiveProject(da: DataAccessor): Endpoint[Project] =
        post("organization" :: "projects" :: string :: "archive") { (projectId: String) =>
          da.Projects_archiveProject(projectId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a Project
        */
        private def createProject(da: DataAccessor): Endpoint[Project] =
        post("organization" :: "projects" :: jsonBody[ProjectCreateRequest]) { (projectCreateRequest: ProjectCreateRequest) =>
          da.Projects_createProject(projectCreateRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a ProjectServiceAccountCreateResponse
        */
        private def createProjectServiceAccount(da: DataAccessor): Endpoint[ProjectServiceAccountCreateResponse] =
        post("organization" :: "projects" :: string :: "service_accounts" :: jsonBody[ProjectServiceAccountCreateRequest]) { (projectId: String, projectServiceAccountCreateRequest: ProjectServiceAccountCreateRequest) =>
          da.Projects_createProjectServiceAccount(projectId, projectServiceAccountCreateRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a ProjectUser
        */
        private def createProjectUser(da: DataAccessor): Endpoint[ProjectUser] =
        post("organization" :: "projects" :: string :: "users" :: jsonBody[ProjectUserCreateRequest]) { (projectId: String, projectUserCreateRequest: ProjectUserCreateRequest) =>
          da.Projects_createProjectUser(projectId, projectUserCreateRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a ProjectApiKeyDeleteResponse
        */
        private def deleteProjectApiKey(da: DataAccessor): Endpoint[ProjectApiKeyDeleteResponse] =
        delete("organization" :: "projects" :: string :: "api_keys" :: string) { (projectId: String, keyId: String) =>
          da.Projects_deleteProjectApiKey(projectId, keyId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a ProjectServiceAccountDeleteResponse
        */
        private def deleteProjectServiceAccount(da: DataAccessor): Endpoint[ProjectServiceAccountDeleteResponse] =
        delete("organization" :: "projects" :: string :: "service_accounts" :: string) { (projectId: String, serviceAccountId: String) =>
          da.Projects_deleteProjectServiceAccount(projectId, serviceAccountId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a ProjectUserDeleteResponse
        */
        private def deleteProjectUser(da: DataAccessor): Endpoint[ProjectUserDeleteResponse] =
        delete("organization" :: "projects" :: string :: "users" :: string) { (projectId: String, userId: String) =>
          da.Projects_deleteProjectUser(projectId, userId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a ProjectApiKeyListResponse
        */
        private def listProjectApiKeys(da: DataAccessor): Endpoint[ProjectApiKeyListResponse] =
        get("organization" :: "projects" :: string :: "api_keys" :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("after")) { (projectId: String, limit: Option[Int], after: Option[String]) =>
          da.Projects_listProjectApiKeys(projectId, limit, after) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a ProjectRateLimitListResponse
        */
        private def listProjectRateLimits(da: DataAccessor): Endpoint[ProjectRateLimitListResponse] =
        get("organization" :: "projects" :: string :: "rate_limits" :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("after") :: paramOption("before")) { (projectId: String, limit: Option[Int], after: Option[String], before: Option[String]) =>
          da.Projects_listProjectRateLimits(projectId, limit, after, before) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a ProjectServiceAccountListResponse
        */
        private def listProjectServiceAccounts(da: DataAccessor): Endpoint[ProjectServiceAccountListResponse] =
        get("organization" :: "projects" :: string :: "service_accounts" :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("after")) { (projectId: String, limit: Option[Int], after: Option[String]) =>
          da.Projects_listProjectServiceAccounts(projectId, limit, after) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a ProjectUserListResponse
        */
        private def listProjectUsers(da: DataAccessor): Endpoint[ProjectUserListResponse] =
        get("organization" :: "projects" :: string :: "users" :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("after")) { (projectId: String, limit: Option[Int], after: Option[String]) =>
          da.Projects_listProjectUsers(projectId, limit, after) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a ProjectListResponse
        */
        private def listProjects(da: DataAccessor): Endpoint[ProjectListResponse] =
        get("organization" :: "projects" :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("after") :: paramOption("include_archived").map(_.map(_.toBoolean))) { (limit: Option[Int], after: Option[String], includeArchived: Option[Boolean]) =>
          da.Projects_listProjects(limit, after, includeArchived) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a Project
        */
        private def modifyProject(da: DataAccessor): Endpoint[Project] =
        post("organization" :: "projects" :: string :: jsonBody[ProjectUpdateRequest]) { (projectId: String, projectUpdateRequest: ProjectUpdateRequest) =>
          da.Projects_modifyProject(projectId, projectUpdateRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a ProjectUser
        */
        private def modifyProjectUser(da: DataAccessor): Endpoint[ProjectUser] =
        post("organization" :: "projects" :: string :: "users" :: string :: jsonBody[ProjectUserUpdateRequest]) { (projectId: String, userId: String, projectUserUpdateRequest: ProjectUserUpdateRequest) =>
          da.Projects_modifyProjectUser(projectId, userId, projectUserUpdateRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a Project
        */
        private def retrieveProject(da: DataAccessor): Endpoint[Project] =
        get("organization" :: "projects" :: string) { (projectId: String) =>
          da.Projects_retrieveProject(projectId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a ProjectApiKey
        */
        private def retrieveProjectApiKey(da: DataAccessor): Endpoint[ProjectApiKey] =
        get("organization" :: "projects" :: string :: "api_keys" :: string) { (projectId: String, keyId: String) =>
          da.Projects_retrieveProjectApiKey(projectId, keyId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a ProjectServiceAccount
        */
        private def retrieveProjectServiceAccount(da: DataAccessor): Endpoint[ProjectServiceAccount] =
        get("organization" :: "projects" :: string :: "service_accounts" :: string) { (projectId: String, serviceAccountId: String) =>
          da.Projects_retrieveProjectServiceAccount(projectId, serviceAccountId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a ProjectUser
        */
        private def retrieveProjectUser(da: DataAccessor): Endpoint[ProjectUser] =
        get("organization" :: "projects" :: string :: "users" :: string) { (projectId: String, userId: String) =>
          da.Projects_retrieveProjectUser(projectId, userId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a ProjectRateLimit
        */
        private def updateProjectRateLimits(da: DataAccessor): Endpoint[ProjectRateLimit] =
        post("organization" :: "projects" :: string :: "rate_limits" :: string :: jsonBody[ProjectRateLimitUpdateRequest]) { (projectId: String, rateLimitId: String, projectRateLimitUpdateRequest: ProjectRateLimitUpdateRequest) =>
          da.Projects_updateProjectRateLimits(projectId, rateLimitId, projectRateLimitUpdateRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }


    implicit private def fileUploadToFile(fileUpload: FileUpload) : File = {
      fileUpload match {
        case upload: InMemoryFileUpload =>
          bytesToFile(Buf.ByteArray.Owned.extract(upload.content))
        case upload: OnDiskFileUpload =>
          upload.content
        case _ => null
      }
    }

    private def bytesToFile(input: Array[Byte]): java.io.File = {
      val file = Files.createTempFile("tmpProjectsApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
