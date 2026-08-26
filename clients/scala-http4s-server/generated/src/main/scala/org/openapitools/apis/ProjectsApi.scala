package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

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


import cats.Monad
import cats.syntax.all._

import org.http4s._
import org.http4s.circe._
import org.http4s.server._
import org.http4s.headers._
import org.http4s.dsl.Http4sDsl
import org.http4s.circe.CirceEntityEncoder._

final case class ProjectsApiRoutes[
  F[_]: JsonDecoder: Monad, ApiKeyAuth
](delegate: ProjectsApiDelegate[F, ApiKeyAuth]) extends Http4sDsl[F] {
  object archiveProject {
    import ProjectsApiDelegate.archiveProjectResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ POST -> Root / "organization" / "projects" / project_id / "archive") as auth =>
        delegate.archiveProject.handle_ApiKeyAuth(auth, req, project_id, responses)

    }

    val responses: archiveProjectResponses[F] = new archiveProjectResponses[F] {
      def resp200(value: Project): F[Response[F]] = Ok(value)
    }
  }
  object createProject {
    import ProjectsApiDelegate.createProjectResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ POST -> Root / "organization" / "projects") as auth =>
          delegate.createProject.handle_ApiKeyAuth(auth, req, req.asJsonDecode[ProjectCreateRequest] , responses)

    }

    val responses: createProjectResponses[F] = new createProjectResponses[F] {
      def resp200(value: Project): F[Response[F]] = Ok(value)
    }
  }
  object createProjectServiceAccount {
    import ProjectsApiDelegate.createProjectServiceAccountResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ POST -> Root / "organization" / "projects" / project_id / "service_accounts") as auth =>
          delegate.createProjectServiceAccount.handle_ApiKeyAuth(auth, req, req.asJsonDecode[ProjectServiceAccountCreateRequest] , project_id, responses)

    }

    val responses: createProjectServiceAccountResponses[F] = new createProjectServiceAccountResponses[F] {
      def resp200(value: ProjectServiceAccountCreateResponse): F[Response[F]] = Ok(value)
      def resp400(value: ErrorResponse): F[Response[F]] = BadRequest(value)
    }
  }
  object createProjectUser {
    import ProjectsApiDelegate.createProjectUserResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ POST -> Root / "organization" / "projects" / project_id / "users") as auth =>
          delegate.createProjectUser.handle_ApiKeyAuth(auth, req, req.asJsonDecode[ProjectUserCreateRequest] , project_id, responses)

    }

    val responses: createProjectUserResponses[F] = new createProjectUserResponses[F] {
      def resp200(value: ProjectUser): F[Response[F]] = Ok(value)
      def resp400(value: ErrorResponse): F[Response[F]] = BadRequest(value)
    }
  }
  object deleteProjectApiKey {
    import ProjectsApiDelegate.deleteProjectApiKeyResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ DELETE -> Root / "organization" / "projects" / project_id / "api_keys" / key_id) as auth =>
        delegate.deleteProjectApiKey.handle_ApiKeyAuth(auth, req, project_id, key_id, responses)

    }

    val responses: deleteProjectApiKeyResponses[F] = new deleteProjectApiKeyResponses[F] {
      def resp200(value: ProjectApiKeyDeleteResponse): F[Response[F]] = Ok(value)
      def resp400(value: ErrorResponse): F[Response[F]] = BadRequest(value)
    }
  }
  object deleteProjectServiceAccount {
    import ProjectsApiDelegate.deleteProjectServiceAccountResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ DELETE -> Root / "organization" / "projects" / project_id / "service_accounts" / service_account_id) as auth =>
        delegate.deleteProjectServiceAccount.handle_ApiKeyAuth(auth, req, project_id, service_account_id, responses)

    }

    val responses: deleteProjectServiceAccountResponses[F] = new deleteProjectServiceAccountResponses[F] {
      def resp200(value: ProjectServiceAccountDeleteResponse): F[Response[F]] = Ok(value)
    }
  }
  object deleteProjectUser {
    import ProjectsApiDelegate.deleteProjectUserResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ DELETE -> Root / "organization" / "projects" / project_id / "users" / user_id) as auth =>
        delegate.deleteProjectUser.handle_ApiKeyAuth(auth, req, project_id, user_id, responses)

    }

    val responses: deleteProjectUserResponses[F] = new deleteProjectUserResponses[F] {
      def resp200(value: ProjectUserDeleteResponse): F[Response[F]] = Ok(value)
      def resp400(value: ErrorResponse): F[Response[F]] = BadRequest(value)
    }
  }
  object listProjectApiKeys {
    import ProjectsApiDelegate.listProjectApiKeysResponses

    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object afterQueryParam extends OptionalQueryParamDecoderMatcher[String]("after")

    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ GET -> Root / "organization" / "projects" / project_id / "api_keys" :? limitQueryParam(limit) +& afterQueryParam(after)) as auth =>
        delegate.listProjectApiKeys.handle_ApiKeyAuth(auth, req, project_id, limit, after, responses)

    }

    val responses: listProjectApiKeysResponses[F] = new listProjectApiKeysResponses[F] {
      def resp200(value: ProjectApiKeyListResponse): F[Response[F]] = Ok(value)
    }
  }
  object listProjectRateLimits {
    import ProjectsApiDelegate.listProjectRateLimitsResponses

    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object afterQueryParam extends OptionalQueryParamDecoderMatcher[String]("after")
    object beforeQueryParam extends OptionalQueryParamDecoderMatcher[String]("before")

    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ GET -> Root / "organization" / "projects" / project_id / "rate_limits" :? limitQueryParam(limit) +& afterQueryParam(after) +& beforeQueryParam(before)) as auth =>
        delegate.listProjectRateLimits.handle_ApiKeyAuth(auth, req, project_id, limit, after, before, responses)

    }

    val responses: listProjectRateLimitsResponses[F] = new listProjectRateLimitsResponses[F] {
      def resp200(value: ProjectRateLimitListResponse): F[Response[F]] = Ok(value)
    }
  }
  object listProjectServiceAccounts {
    import ProjectsApiDelegate.listProjectServiceAccountsResponses

    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object afterQueryParam extends OptionalQueryParamDecoderMatcher[String]("after")

    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ GET -> Root / "organization" / "projects" / project_id / "service_accounts" :? limitQueryParam(limit) +& afterQueryParam(after)) as auth =>
        delegate.listProjectServiceAccounts.handle_ApiKeyAuth(auth, req, project_id, limit, after, responses)

    }

    val responses: listProjectServiceAccountsResponses[F] = new listProjectServiceAccountsResponses[F] {
      def resp200(value: ProjectServiceAccountListResponse): F[Response[F]] = Ok(value)
      def resp400(value: ErrorResponse): F[Response[F]] = BadRequest(value)
    }
  }
  object listProjectUsers {
    import ProjectsApiDelegate.listProjectUsersResponses

    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object afterQueryParam extends OptionalQueryParamDecoderMatcher[String]("after")

    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ GET -> Root / "organization" / "projects" / project_id / "users" :? limitQueryParam(limit) +& afterQueryParam(after)) as auth =>
        delegate.listProjectUsers.handle_ApiKeyAuth(auth, req, project_id, limit, after, responses)

    }

    val responses: listProjectUsersResponses[F] = new listProjectUsersResponses[F] {
      def resp200(value: ProjectUserListResponse): F[Response[F]] = Ok(value)
      def resp400(value: ErrorResponse): F[Response[F]] = BadRequest(value)
    }
  }
  object listProjects {
    import ProjectsApiDelegate.listProjectsResponses

    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object afterQueryParam extends OptionalQueryParamDecoderMatcher[String]("after")
    object include_archivedQueryParam extends OptionalQueryParamDecoderMatcher[Boolean]("include_archived")

    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ GET -> Root / "organization" / "projects" :? limitQueryParam(limit) +& afterQueryParam(after) +& include_archivedQueryParam(include_archived)) as auth =>
        delegate.listProjects.handle_ApiKeyAuth(auth, req, limit, after, include_archived, responses)

    }

    val responses: listProjectsResponses[F] = new listProjectsResponses[F] {
      def resp200(value: ProjectListResponse): F[Response[F]] = Ok(value)
    }
  }
  object modifyProject {
    import ProjectsApiDelegate.modifyProjectResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ POST -> Root / "organization" / "projects" / project_id) as auth =>
          delegate.modifyProject.handle_ApiKeyAuth(auth, req, req.asJsonDecode[ProjectUpdateRequest] , project_id, responses)

    }

    val responses: modifyProjectResponses[F] = new modifyProjectResponses[F] {
      def resp200(value: Project): F[Response[F]] = Ok(value)
      def resp400(value: ErrorResponse): F[Response[F]] = BadRequest(value)
    }
  }
  object modifyProjectUser {
    import ProjectsApiDelegate.modifyProjectUserResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ POST -> Root / "organization" / "projects" / project_id / "users" / user_id) as auth =>
          delegate.modifyProjectUser.handle_ApiKeyAuth(auth, req, req.asJsonDecode[ProjectUserUpdateRequest] , project_id, user_id, responses)

    }

    val responses: modifyProjectUserResponses[F] = new modifyProjectUserResponses[F] {
      def resp200(value: ProjectUser): F[Response[F]] = Ok(value)
      def resp400(value: ErrorResponse): F[Response[F]] = BadRequest(value)
    }
  }
  object retrieveProject {
    import ProjectsApiDelegate.retrieveProjectResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ GET -> Root / "organization" / "projects" / project_id) as auth =>
        delegate.retrieveProject.handle_ApiKeyAuth(auth, req, project_id, responses)

    }

    val responses: retrieveProjectResponses[F] = new retrieveProjectResponses[F] {
      def resp200(value: Project): F[Response[F]] = Ok(value)
    }
  }
  object retrieveProjectApiKey {
    import ProjectsApiDelegate.retrieveProjectApiKeyResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ GET -> Root / "organization" / "projects" / project_id / "api_keys" / key_id) as auth =>
        delegate.retrieveProjectApiKey.handle_ApiKeyAuth(auth, req, project_id, key_id, responses)

    }

    val responses: retrieveProjectApiKeyResponses[F] = new retrieveProjectApiKeyResponses[F] {
      def resp200(value: ProjectApiKey): F[Response[F]] = Ok(value)
    }
  }
  object retrieveProjectServiceAccount {
    import ProjectsApiDelegate.retrieveProjectServiceAccountResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ GET -> Root / "organization" / "projects" / project_id / "service_accounts" / service_account_id) as auth =>
        delegate.retrieveProjectServiceAccount.handle_ApiKeyAuth(auth, req, project_id, service_account_id, responses)

    }

    val responses: retrieveProjectServiceAccountResponses[F] = new retrieveProjectServiceAccountResponses[F] {
      def resp200(value: ProjectServiceAccount): F[Response[F]] = Ok(value)
    }
  }
  object retrieveProjectUser {
    import ProjectsApiDelegate.retrieveProjectUserResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ GET -> Root / "organization" / "projects" / project_id / "users" / user_id) as auth =>
        delegate.retrieveProjectUser.handle_ApiKeyAuth(auth, req, project_id, user_id, responses)

    }

    val responses: retrieveProjectUserResponses[F] = new retrieveProjectUserResponses[F] {
      def resp200(value: ProjectUser): F[Response[F]] = Ok(value)
    }
  }
  object updateProjectRateLimits {
    import ProjectsApiDelegate.updateProjectRateLimitsResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ POST -> Root / "organization" / "projects" / project_id / "rate_limits" / rate_limit_id) as auth =>
          delegate.updateProjectRateLimits.handle_ApiKeyAuth(auth, req, req.asJsonDecode[ProjectRateLimitUpdateRequest] , project_id, rate_limit_id, responses)

    }

    val responses: updateProjectRateLimitsResponses[F] = new updateProjectRateLimitsResponses[F] {
      def resp200(value: ProjectRateLimit): F[Response[F]] = Ok(value)
      def resp400(value: ErrorResponse): F[Response[F]] = BadRequest(value)
    }
  }

  val routesApiKeyAuth =
    archiveProject.routeApiKeyAuth <+>
    createProject.routeApiKeyAuth <+>
    createProjectServiceAccount.routeApiKeyAuth <+>
    createProjectUser.routeApiKeyAuth <+>
    deleteProjectApiKey.routeApiKeyAuth <+>
    deleteProjectServiceAccount.routeApiKeyAuth <+>
    deleteProjectUser.routeApiKeyAuth <+>
    listProjectApiKeys.routeApiKeyAuth <+>
    listProjectRateLimits.routeApiKeyAuth <+>
    listProjectServiceAccounts.routeApiKeyAuth <+>
    listProjectUsers.routeApiKeyAuth <+>
    listProjects.routeApiKeyAuth <+>
    modifyProject.routeApiKeyAuth <+>
    modifyProjectUser.routeApiKeyAuth <+>
    retrieveProject.routeApiKeyAuth <+>
    retrieveProjectApiKey.routeApiKeyAuth <+>
    retrieveProjectServiceAccount.routeApiKeyAuth <+>
    retrieveProjectUser.routeApiKeyAuth <+>
    updateProjectRateLimits.routeApiKeyAuth
}

object ProjectsApiDelegate {
  trait archiveProjectResponses[F[_]] {
    def resp200(value: Project): F[Response[F]]
  }

  trait createProjectResponses[F[_]] {
    def resp200(value: Project): F[Response[F]]
  }

  trait createProjectServiceAccountResponses[F[_]] {
    def resp200(value: ProjectServiceAccountCreateResponse): F[Response[F]]
    def resp400(value: ErrorResponse): F[Response[F]]
  }

  trait createProjectUserResponses[F[_]] {
    def resp200(value: ProjectUser): F[Response[F]]
    def resp400(value: ErrorResponse): F[Response[F]]
  }

  trait deleteProjectApiKeyResponses[F[_]] {
    def resp200(value: ProjectApiKeyDeleteResponse): F[Response[F]]
    def resp400(value: ErrorResponse): F[Response[F]]
  }

  trait deleteProjectServiceAccountResponses[F[_]] {
    def resp200(value: ProjectServiceAccountDeleteResponse): F[Response[F]]
  }

  trait deleteProjectUserResponses[F[_]] {
    def resp200(value: ProjectUserDeleteResponse): F[Response[F]]
    def resp400(value: ErrorResponse): F[Response[F]]
  }

  trait listProjectApiKeysResponses[F[_]] {
    def resp200(value: ProjectApiKeyListResponse): F[Response[F]]
  }

  trait listProjectRateLimitsResponses[F[_]] {
    def resp200(value: ProjectRateLimitListResponse): F[Response[F]]
  }

  trait listProjectServiceAccountsResponses[F[_]] {
    def resp200(value: ProjectServiceAccountListResponse): F[Response[F]]
    def resp400(value: ErrorResponse): F[Response[F]]
  }

  trait listProjectUsersResponses[F[_]] {
    def resp200(value: ProjectUserListResponse): F[Response[F]]
    def resp400(value: ErrorResponse): F[Response[F]]
  }

  trait listProjectsResponses[F[_]] {
    def resp200(value: ProjectListResponse): F[Response[F]]
  }

  trait modifyProjectResponses[F[_]] {
    def resp200(value: Project): F[Response[F]]
    def resp400(value: ErrorResponse): F[Response[F]]
  }

  trait modifyProjectUserResponses[F[_]] {
    def resp200(value: ProjectUser): F[Response[F]]
    def resp400(value: ErrorResponse): F[Response[F]]
  }

  trait retrieveProjectResponses[F[_]] {
    def resp200(value: Project): F[Response[F]]
  }

  trait retrieveProjectApiKeyResponses[F[_]] {
    def resp200(value: ProjectApiKey): F[Response[F]]
  }

  trait retrieveProjectServiceAccountResponses[F[_]] {
    def resp200(value: ProjectServiceAccount): F[Response[F]]
  }

  trait retrieveProjectUserResponses[F[_]] {
    def resp200(value: ProjectUser): F[Response[F]]
  }

  trait updateProjectRateLimitsResponses[F[_]] {
    def resp200(value: ProjectRateLimit): F[Response[F]]
    def resp400(value: ErrorResponse): F[Response[F]]
  }

}

trait ProjectsApiDelegate[F[_], ApiKeyAuth] {

  trait archiveProject {
    import ProjectsApiDelegate.archiveProjectResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      projectId: String,
      responses: archiveProjectResponses[F]
    ): F[Response[F]]

  }
  def archiveProject: archiveProject


  trait createProject {
    import ProjectsApiDelegate.createProjectResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      createProject: F[ProjectCreateRequest],
      responses: createProjectResponses[F]
    ): F[Response[F]]


  }
  def createProject: createProject


  trait createProjectServiceAccount {
    import ProjectsApiDelegate.createProjectServiceAccountResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      createProjectServiceAccount: F[ProjectServiceAccountCreateRequest],
      projectId: String,
      responses: createProjectServiceAccountResponses[F]
    ): F[Response[F]]


  }
  def createProjectServiceAccount: createProjectServiceAccount


  trait createProjectUser {
    import ProjectsApiDelegate.createProjectUserResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      createProjectUser: F[ProjectUserCreateRequest],
      projectId: String,
      responses: createProjectUserResponses[F]
    ): F[Response[F]]


  }
  def createProjectUser: createProjectUser


  trait deleteProjectApiKey {
    import ProjectsApiDelegate.deleteProjectApiKeyResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      projectId: String,
      keyId: String,
      responses: deleteProjectApiKeyResponses[F]
    ): F[Response[F]]

  }
  def deleteProjectApiKey: deleteProjectApiKey


  trait deleteProjectServiceAccount {
    import ProjectsApiDelegate.deleteProjectServiceAccountResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      projectId: String,
      serviceAccountId: String,
      responses: deleteProjectServiceAccountResponses[F]
    ): F[Response[F]]

  }
  def deleteProjectServiceAccount: deleteProjectServiceAccount


  trait deleteProjectUser {
    import ProjectsApiDelegate.deleteProjectUserResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      projectId: String,
      userId: String,
      responses: deleteProjectUserResponses[F]
    ): F[Response[F]]

  }
  def deleteProjectUser: deleteProjectUser


  trait listProjectApiKeys {
    import ProjectsApiDelegate.listProjectApiKeysResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      projectId: String,
      limit: Option[Int],
      after: Option[String],
      responses: listProjectApiKeysResponses[F]
    ): F[Response[F]]

  }
  def listProjectApiKeys: listProjectApiKeys


  trait listProjectRateLimits {
    import ProjectsApiDelegate.listProjectRateLimitsResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      projectId: String,
      limit: Option[Int],
      after: Option[String],
      before: Option[String],
      responses: listProjectRateLimitsResponses[F]
    ): F[Response[F]]

  }
  def listProjectRateLimits: listProjectRateLimits


  trait listProjectServiceAccounts {
    import ProjectsApiDelegate.listProjectServiceAccountsResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      projectId: String,
      limit: Option[Int],
      after: Option[String],
      responses: listProjectServiceAccountsResponses[F]
    ): F[Response[F]]

  }
  def listProjectServiceAccounts: listProjectServiceAccounts


  trait listProjectUsers {
    import ProjectsApiDelegate.listProjectUsersResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      projectId: String,
      limit: Option[Int],
      after: Option[String],
      responses: listProjectUsersResponses[F]
    ): F[Response[F]]

  }
  def listProjectUsers: listProjectUsers


  trait listProjects {
    import ProjectsApiDelegate.listProjectsResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      limit: Option[Int],
      after: Option[String],
      includeArchived: Option[Boolean],
      responses: listProjectsResponses[F]
    ): F[Response[F]]

  }
  def listProjects: listProjects


  trait modifyProject {
    import ProjectsApiDelegate.modifyProjectResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      modifyProject: F[ProjectUpdateRequest],
      projectId: String,
      responses: modifyProjectResponses[F]
    ): F[Response[F]]


  }
  def modifyProject: modifyProject


  trait modifyProjectUser {
    import ProjectsApiDelegate.modifyProjectUserResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      modifyProjectUser: F[ProjectUserUpdateRequest],
      projectId: String,
      userId: String,
      responses: modifyProjectUserResponses[F]
    ): F[Response[F]]


  }
  def modifyProjectUser: modifyProjectUser


  trait retrieveProject {
    import ProjectsApiDelegate.retrieveProjectResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      projectId: String,
      responses: retrieveProjectResponses[F]
    ): F[Response[F]]

  }
  def retrieveProject: retrieveProject


  trait retrieveProjectApiKey {
    import ProjectsApiDelegate.retrieveProjectApiKeyResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      projectId: String,
      keyId: String,
      responses: retrieveProjectApiKeyResponses[F]
    ): F[Response[F]]

  }
  def retrieveProjectApiKey: retrieveProjectApiKey


  trait retrieveProjectServiceAccount {
    import ProjectsApiDelegate.retrieveProjectServiceAccountResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      projectId: String,
      serviceAccountId: String,
      responses: retrieveProjectServiceAccountResponses[F]
    ): F[Response[F]]

  }
  def retrieveProjectServiceAccount: retrieveProjectServiceAccount


  trait retrieveProjectUser {
    import ProjectsApiDelegate.retrieveProjectUserResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      projectId: String,
      userId: String,
      responses: retrieveProjectUserResponses[F]
    ): F[Response[F]]

  }
  def retrieveProjectUser: retrieveProjectUser


  trait updateProjectRateLimits {
    import ProjectsApiDelegate.updateProjectRateLimitsResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      updateProjectRateLimits: F[ProjectRateLimitUpdateRequest],
      projectId: String,
      rateLimitId: String,
      responses: updateProjectRateLimitsResponses[F]
    ): F[Response[F]]


  }
  def updateProjectRateLimits: updateProjectRateLimits

}