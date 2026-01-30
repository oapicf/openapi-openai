package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import java.io.File
import java.net.URLEncoder
import java.util.UUID

import org.http4s._
import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.http4s.client._
import org.http4s.client.blaze.PooledHttp1Client
import org.http4s.headers._

import org.joda.time.DateTime

import scalaz.concurrent.Task

import HelperCodecs._

import org.openapitools.client.api.ErrorResponse
import org.openapitools.client.api.Project
import org.openapitools.client.api.ProjectApiKey
import org.openapitools.client.api.ProjectApiKeyDeleteResponse
import org.openapitools.client.api.ProjectApiKeyListResponse
import org.openapitools.client.api.ProjectCreateRequest
import org.openapitools.client.api.ProjectListResponse
import org.openapitools.client.api.ProjectRateLimit
import org.openapitools.client.api.ProjectRateLimitListResponse
import org.openapitools.client.api.ProjectRateLimitUpdateRequest
import org.openapitools.client.api.ProjectServiceAccount
import org.openapitools.client.api.ProjectServiceAccountCreateRequest
import org.openapitools.client.api.ProjectServiceAccountCreateResponse
import org.openapitools.client.api.ProjectServiceAccountDeleteResponse
import org.openapitools.client.api.ProjectServiceAccountListResponse
import org.openapitools.client.api.ProjectUpdateRequest
import org.openapitools.client.api.ProjectUser
import org.openapitools.client.api.ProjectUserCreateRequest
import org.openapitools.client.api.ProjectUserDeleteResponse
import org.openapitools.client.api.ProjectUserListResponse
import org.openapitools.client.api.ProjectUserUpdateRequest

object ProjectsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def archiveProject(host: String, projectId: String): Task[Project] = {
    implicit val returnTypeDecoder: EntityDecoder[Project] = jsonOf[Project]

    val path = "/organization/projects/{project_id}/archive".replaceAll("\\{" + "project_id" + "\\}",escape(projectId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[Project](req)

    } yield resp
  }

  def createProject(host: String, projectCreateRequest: ProjectCreateRequest): Task[Project] = {
    implicit val returnTypeDecoder: EntityDecoder[Project] = jsonOf[Project]

    val path = "/organization/projects"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(projectCreateRequest)
      resp          <- client.expect[Project](req)

    } yield resp
  }

  def createProjectServiceAccount(host: String, projectId: String, projectServiceAccountCreateRequest: ProjectServiceAccountCreateRequest): Task[ProjectServiceAccountCreateResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ProjectServiceAccountCreateResponse] = jsonOf[ProjectServiceAccountCreateResponse]

    val path = "/organization/projects/{project_id}/service_accounts".replaceAll("\\{" + "project_id" + "\\}",escape(projectId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(projectServiceAccountCreateRequest)
      resp          <- client.expect[ProjectServiceAccountCreateResponse](req)

    } yield resp
  }

  def createProjectUser(host: String, projectId: String, projectUserCreateRequest: ProjectUserCreateRequest): Task[ProjectUser] = {
    implicit val returnTypeDecoder: EntityDecoder[ProjectUser] = jsonOf[ProjectUser]

    val path = "/organization/projects/{project_id}/users".replaceAll("\\{" + "project_id" + "\\}",escape(projectId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(projectUserCreateRequest)
      resp          <- client.expect[ProjectUser](req)

    } yield resp
  }

  def deleteProjectApiKey(host: String, projectId: String, keyId: String): Task[ProjectApiKeyDeleteResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ProjectApiKeyDeleteResponse] = jsonOf[ProjectApiKeyDeleteResponse]

    val path = "/organization/projects/{project_id}/api_keys/{key_id}".replaceAll("\\{" + "project_id" + "\\}",escape(projectId.toString)).replaceAll("\\{" + "key_id" + "\\}",escape(keyId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[ProjectApiKeyDeleteResponse](req)

    } yield resp
  }

  def deleteProjectServiceAccount(host: String, projectId: String, serviceAccountId: String): Task[ProjectServiceAccountDeleteResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ProjectServiceAccountDeleteResponse] = jsonOf[ProjectServiceAccountDeleteResponse]

    val path = "/organization/projects/{project_id}/service_accounts/{service_account_id}".replaceAll("\\{" + "project_id" + "\\}",escape(projectId.toString)).replaceAll("\\{" + "service_account_id" + "\\}",escape(serviceAccountId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[ProjectServiceAccountDeleteResponse](req)

    } yield resp
  }

  def deleteProjectUser(host: String, projectId: String, userId: String): Task[ProjectUserDeleteResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ProjectUserDeleteResponse] = jsonOf[ProjectUserDeleteResponse]

    val path = "/organization/projects/{project_id}/users/{user_id}".replaceAll("\\{" + "project_id" + "\\}",escape(projectId.toString)).replaceAll("\\{" + "user_id" + "\\}",escape(userId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[ProjectUserDeleteResponse](req)

    } yield resp
  }

  def listProjectApiKeys(host: String, projectId: String, limit: Integer = 20, after: String)(implicit limitQuery: QueryParam[Integer], afterQuery: QueryParam[String]): Task[ProjectApiKeyListResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ProjectApiKeyListResponse] = jsonOf[ProjectApiKeyListResponse]

    val path = "/organization/projects/{project_id}/api_keys".replaceAll("\\{" + "project_id" + "\\}",escape(projectId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("limit", Some(limitQuery.toParamString(limit))), ("after", Some(afterQuery.toParamString(after))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[ProjectApiKeyListResponse](req)

    } yield resp
  }

  def listProjectRateLimits(host: String, projectId: String, limit: Integer = 100, after: String, before: String)(implicit limitQuery: QueryParam[Integer], afterQuery: QueryParam[String], beforeQuery: QueryParam[String]): Task[ProjectRateLimitListResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ProjectRateLimitListResponse] = jsonOf[ProjectRateLimitListResponse]

    val path = "/organization/projects/{project_id}/rate_limits".replaceAll("\\{" + "project_id" + "\\}",escape(projectId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("limit", Some(limitQuery.toParamString(limit))), ("after", Some(afterQuery.toParamString(after))), ("before", Some(beforeQuery.toParamString(before))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[ProjectRateLimitListResponse](req)

    } yield resp
  }

  def listProjectServiceAccounts(host: String, projectId: String, limit: Integer = 20, after: String)(implicit limitQuery: QueryParam[Integer], afterQuery: QueryParam[String]): Task[ProjectServiceAccountListResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ProjectServiceAccountListResponse] = jsonOf[ProjectServiceAccountListResponse]

    val path = "/organization/projects/{project_id}/service_accounts".replaceAll("\\{" + "project_id" + "\\}",escape(projectId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("limit", Some(limitQuery.toParamString(limit))), ("after", Some(afterQuery.toParamString(after))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[ProjectServiceAccountListResponse](req)

    } yield resp
  }

  def listProjectUsers(host: String, projectId: String, limit: Integer = 20, after: String)(implicit limitQuery: QueryParam[Integer], afterQuery: QueryParam[String]): Task[ProjectUserListResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ProjectUserListResponse] = jsonOf[ProjectUserListResponse]

    val path = "/organization/projects/{project_id}/users".replaceAll("\\{" + "project_id" + "\\}",escape(projectId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("limit", Some(limitQuery.toParamString(limit))), ("after", Some(afterQuery.toParamString(after))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[ProjectUserListResponse](req)

    } yield resp
  }

  def listProjects(host: String, limit: Integer = 20, after: String, includeArchived: Boolean = false)(implicit limitQuery: QueryParam[Integer], afterQuery: QueryParam[String], includeArchivedQuery: QueryParam[Boolean]): Task[ProjectListResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ProjectListResponse] = jsonOf[ProjectListResponse]

    val path = "/organization/projects"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("limit", Some(limitQuery.toParamString(limit))), ("after", Some(afterQuery.toParamString(after))), ("includeArchived", Some(include_archivedQuery.toParamString(include_archived))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[ProjectListResponse](req)

    } yield resp
  }

  def modifyProject(host: String, projectId: String, projectUpdateRequest: ProjectUpdateRequest): Task[Project] = {
    implicit val returnTypeDecoder: EntityDecoder[Project] = jsonOf[Project]

    val path = "/organization/projects/{project_id}".replaceAll("\\{" + "project_id" + "\\}",escape(projectId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(projectUpdateRequest)
      resp          <- client.expect[Project](req)

    } yield resp
  }

  def modifyProjectUser(host: String, projectId: String, userId: String, projectUserUpdateRequest: ProjectUserUpdateRequest): Task[ProjectUser] = {
    implicit val returnTypeDecoder: EntityDecoder[ProjectUser] = jsonOf[ProjectUser]

    val path = "/organization/projects/{project_id}/users/{user_id}".replaceAll("\\{" + "project_id" + "\\}",escape(projectId.toString)).replaceAll("\\{" + "user_id" + "\\}",escape(userId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(projectUserUpdateRequest)
      resp          <- client.expect[ProjectUser](req)

    } yield resp
  }

  def retrieveProject(host: String, projectId: String): Task[Project] = {
    implicit val returnTypeDecoder: EntityDecoder[Project] = jsonOf[Project]

    val path = "/organization/projects/{project_id}".replaceAll("\\{" + "project_id" + "\\}",escape(projectId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[Project](req)

    } yield resp
  }

  def retrieveProjectApiKey(host: String, projectId: String, keyId: String): Task[ProjectApiKey] = {
    implicit val returnTypeDecoder: EntityDecoder[ProjectApiKey] = jsonOf[ProjectApiKey]

    val path = "/organization/projects/{project_id}/api_keys/{key_id}".replaceAll("\\{" + "project_id" + "\\}",escape(projectId.toString)).replaceAll("\\{" + "key_id" + "\\}",escape(keyId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[ProjectApiKey](req)

    } yield resp
  }

  def retrieveProjectServiceAccount(host: String, projectId: String, serviceAccountId: String): Task[ProjectServiceAccount] = {
    implicit val returnTypeDecoder: EntityDecoder[ProjectServiceAccount] = jsonOf[ProjectServiceAccount]

    val path = "/organization/projects/{project_id}/service_accounts/{service_account_id}".replaceAll("\\{" + "project_id" + "\\}",escape(projectId.toString)).replaceAll("\\{" + "service_account_id" + "\\}",escape(serviceAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[ProjectServiceAccount](req)

    } yield resp
  }

  def retrieveProjectUser(host: String, projectId: String, userId: String): Task[ProjectUser] = {
    implicit val returnTypeDecoder: EntityDecoder[ProjectUser] = jsonOf[ProjectUser]

    val path = "/organization/projects/{project_id}/users/{user_id}".replaceAll("\\{" + "project_id" + "\\}",escape(projectId.toString)).replaceAll("\\{" + "user_id" + "\\}",escape(userId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[ProjectUser](req)

    } yield resp
  }

  def updateProjectRateLimits(host: String, projectId: String, rateLimitId: String, projectRateLimitUpdateRequest: ProjectRateLimitUpdateRequest): Task[ProjectRateLimit] = {
    implicit val returnTypeDecoder: EntityDecoder[ProjectRateLimit] = jsonOf[ProjectRateLimit]

    val path = "/organization/projects/{project_id}/rate_limits/{rate_limit_id}".replaceAll("\\{" + "project_id" + "\\}",escape(projectId.toString)).replaceAll("\\{" + "rate_limit_id" + "\\}",escape(rateLimitId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(projectRateLimitUpdateRequest)
      resp          <- client.expect[ProjectRateLimit](req)

    } yield resp
  }

}

class HttpServiceProjectsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def archiveProject(projectId: String): Task[Project] = {
    implicit val returnTypeDecoder: EntityDecoder[Project] = jsonOf[Project]

    val path = "/organization/projects/{project_id}/archive".replaceAll("\\{" + "project_id" + "\\}",escape(projectId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[Project](req)

    } yield resp
  }

  def createProject(projectCreateRequest: ProjectCreateRequest): Task[Project] = {
    implicit val returnTypeDecoder: EntityDecoder[Project] = jsonOf[Project]

    val path = "/organization/projects"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(projectCreateRequest)
      resp          <- client.expect[Project](req)

    } yield resp
  }

  def createProjectServiceAccount(projectId: String, projectServiceAccountCreateRequest: ProjectServiceAccountCreateRequest): Task[ProjectServiceAccountCreateResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ProjectServiceAccountCreateResponse] = jsonOf[ProjectServiceAccountCreateResponse]

    val path = "/organization/projects/{project_id}/service_accounts".replaceAll("\\{" + "project_id" + "\\}",escape(projectId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(projectServiceAccountCreateRequest)
      resp          <- client.expect[ProjectServiceAccountCreateResponse](req)

    } yield resp
  }

  def createProjectUser(projectId: String, projectUserCreateRequest: ProjectUserCreateRequest): Task[ProjectUser] = {
    implicit val returnTypeDecoder: EntityDecoder[ProjectUser] = jsonOf[ProjectUser]

    val path = "/organization/projects/{project_id}/users".replaceAll("\\{" + "project_id" + "\\}",escape(projectId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(projectUserCreateRequest)
      resp          <- client.expect[ProjectUser](req)

    } yield resp
  }

  def deleteProjectApiKey(projectId: String, keyId: String): Task[ProjectApiKeyDeleteResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ProjectApiKeyDeleteResponse] = jsonOf[ProjectApiKeyDeleteResponse]

    val path = "/organization/projects/{project_id}/api_keys/{key_id}".replaceAll("\\{" + "project_id" + "\\}",escape(projectId.toString)).replaceAll("\\{" + "key_id" + "\\}",escape(keyId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[ProjectApiKeyDeleteResponse](req)

    } yield resp
  }

  def deleteProjectServiceAccount(projectId: String, serviceAccountId: String): Task[ProjectServiceAccountDeleteResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ProjectServiceAccountDeleteResponse] = jsonOf[ProjectServiceAccountDeleteResponse]

    val path = "/organization/projects/{project_id}/service_accounts/{service_account_id}".replaceAll("\\{" + "project_id" + "\\}",escape(projectId.toString)).replaceAll("\\{" + "service_account_id" + "\\}",escape(serviceAccountId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[ProjectServiceAccountDeleteResponse](req)

    } yield resp
  }

  def deleteProjectUser(projectId: String, userId: String): Task[ProjectUserDeleteResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ProjectUserDeleteResponse] = jsonOf[ProjectUserDeleteResponse]

    val path = "/organization/projects/{project_id}/users/{user_id}".replaceAll("\\{" + "project_id" + "\\}",escape(projectId.toString)).replaceAll("\\{" + "user_id" + "\\}",escape(userId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[ProjectUserDeleteResponse](req)

    } yield resp
  }

  def listProjectApiKeys(projectId: String, limit: Integer = 20, after: String)(implicit limitQuery: QueryParam[Integer], afterQuery: QueryParam[String]): Task[ProjectApiKeyListResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ProjectApiKeyListResponse] = jsonOf[ProjectApiKeyListResponse]

    val path = "/organization/projects/{project_id}/api_keys".replaceAll("\\{" + "project_id" + "\\}",escape(projectId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("limit", Some(limitQuery.toParamString(limit))), ("after", Some(afterQuery.toParamString(after))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[ProjectApiKeyListResponse](req)

    } yield resp
  }

  def listProjectRateLimits(projectId: String, limit: Integer = 100, after: String, before: String)(implicit limitQuery: QueryParam[Integer], afterQuery: QueryParam[String], beforeQuery: QueryParam[String]): Task[ProjectRateLimitListResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ProjectRateLimitListResponse] = jsonOf[ProjectRateLimitListResponse]

    val path = "/organization/projects/{project_id}/rate_limits".replaceAll("\\{" + "project_id" + "\\}",escape(projectId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("limit", Some(limitQuery.toParamString(limit))), ("after", Some(afterQuery.toParamString(after))), ("before", Some(beforeQuery.toParamString(before))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[ProjectRateLimitListResponse](req)

    } yield resp
  }

  def listProjectServiceAccounts(projectId: String, limit: Integer = 20, after: String)(implicit limitQuery: QueryParam[Integer], afterQuery: QueryParam[String]): Task[ProjectServiceAccountListResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ProjectServiceAccountListResponse] = jsonOf[ProjectServiceAccountListResponse]

    val path = "/organization/projects/{project_id}/service_accounts".replaceAll("\\{" + "project_id" + "\\}",escape(projectId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("limit", Some(limitQuery.toParamString(limit))), ("after", Some(afterQuery.toParamString(after))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[ProjectServiceAccountListResponse](req)

    } yield resp
  }

  def listProjectUsers(projectId: String, limit: Integer = 20, after: String)(implicit limitQuery: QueryParam[Integer], afterQuery: QueryParam[String]): Task[ProjectUserListResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ProjectUserListResponse] = jsonOf[ProjectUserListResponse]

    val path = "/organization/projects/{project_id}/users".replaceAll("\\{" + "project_id" + "\\}",escape(projectId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("limit", Some(limitQuery.toParamString(limit))), ("after", Some(afterQuery.toParamString(after))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[ProjectUserListResponse](req)

    } yield resp
  }

  def listProjects(limit: Integer = 20, after: String, includeArchived: Boolean = false)(implicit limitQuery: QueryParam[Integer], afterQuery: QueryParam[String], includeArchivedQuery: QueryParam[Boolean]): Task[ProjectListResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ProjectListResponse] = jsonOf[ProjectListResponse]

    val path = "/organization/projects"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("limit", Some(limitQuery.toParamString(limit))), ("after", Some(afterQuery.toParamString(after))), ("includeArchived", Some(include_archivedQuery.toParamString(include_archived))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[ProjectListResponse](req)

    } yield resp
  }

  def modifyProject(projectId: String, projectUpdateRequest: ProjectUpdateRequest): Task[Project] = {
    implicit val returnTypeDecoder: EntityDecoder[Project] = jsonOf[Project]

    val path = "/organization/projects/{project_id}".replaceAll("\\{" + "project_id" + "\\}",escape(projectId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(projectUpdateRequest)
      resp          <- client.expect[Project](req)

    } yield resp
  }

  def modifyProjectUser(projectId: String, userId: String, projectUserUpdateRequest: ProjectUserUpdateRequest): Task[ProjectUser] = {
    implicit val returnTypeDecoder: EntityDecoder[ProjectUser] = jsonOf[ProjectUser]

    val path = "/organization/projects/{project_id}/users/{user_id}".replaceAll("\\{" + "project_id" + "\\}",escape(projectId.toString)).replaceAll("\\{" + "user_id" + "\\}",escape(userId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(projectUserUpdateRequest)
      resp          <- client.expect[ProjectUser](req)

    } yield resp
  }

  def retrieveProject(projectId: String): Task[Project] = {
    implicit val returnTypeDecoder: EntityDecoder[Project] = jsonOf[Project]

    val path = "/organization/projects/{project_id}".replaceAll("\\{" + "project_id" + "\\}",escape(projectId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[Project](req)

    } yield resp
  }

  def retrieveProjectApiKey(projectId: String, keyId: String): Task[ProjectApiKey] = {
    implicit val returnTypeDecoder: EntityDecoder[ProjectApiKey] = jsonOf[ProjectApiKey]

    val path = "/organization/projects/{project_id}/api_keys/{key_id}".replaceAll("\\{" + "project_id" + "\\}",escape(projectId.toString)).replaceAll("\\{" + "key_id" + "\\}",escape(keyId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[ProjectApiKey](req)

    } yield resp
  }

  def retrieveProjectServiceAccount(projectId: String, serviceAccountId: String): Task[ProjectServiceAccount] = {
    implicit val returnTypeDecoder: EntityDecoder[ProjectServiceAccount] = jsonOf[ProjectServiceAccount]

    val path = "/organization/projects/{project_id}/service_accounts/{service_account_id}".replaceAll("\\{" + "project_id" + "\\}",escape(projectId.toString)).replaceAll("\\{" + "service_account_id" + "\\}",escape(serviceAccountId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[ProjectServiceAccount](req)

    } yield resp
  }

  def retrieveProjectUser(projectId: String, userId: String): Task[ProjectUser] = {
    implicit val returnTypeDecoder: EntityDecoder[ProjectUser] = jsonOf[ProjectUser]

    val path = "/organization/projects/{project_id}/users/{user_id}".replaceAll("\\{" + "project_id" + "\\}",escape(projectId.toString)).replaceAll("\\{" + "user_id" + "\\}",escape(userId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[ProjectUser](req)

    } yield resp
  }

  def updateProjectRateLimits(projectId: String, rateLimitId: String, projectRateLimitUpdateRequest: ProjectRateLimitUpdateRequest): Task[ProjectRateLimit] = {
    implicit val returnTypeDecoder: EntityDecoder[ProjectRateLimit] = jsonOf[ProjectRateLimit]

    val path = "/organization/projects/{project_id}/rate_limits/{rate_limit_id}".replaceAll("\\{" + "project_id" + "\\}",escape(projectId.toString)).replaceAll("\\{" + "rate_limit_id" + "\\}",escape(rateLimitId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(projectRateLimitUpdateRequest)
      resp          <- client.expect[ProjectRateLimit](req)

    } yield resp
  }

}
