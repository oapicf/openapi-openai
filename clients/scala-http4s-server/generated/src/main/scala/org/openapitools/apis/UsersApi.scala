package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.User
import org.openapitools.models.UserDeleteResponse
import org.openapitools.models.UserListResponse
import org.openapitools.models.UserRoleUpdateRequest


import cats.Monad
import cats.syntax.all._

import org.http4s._
import org.http4s.circe._
import org.http4s.server._
import org.http4s.headers._
import org.http4s.dsl.Http4sDsl
import org.http4s.circe.CirceEntityEncoder._

final case class UsersApiRoutes[
  F[_]: JsonDecoder: Monad, ApiKeyAuth
](delegate: UsersApiDelegate[F, ApiKeyAuth]) extends Http4sDsl[F] {
  object deleteUser {
    import UsersApiDelegate.deleteUserResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ DELETE -> Root / "organization" / "users" / user_id) as auth =>
        delegate.deleteUser.handle_ApiKeyAuth(auth, req, user_id, responses)

    }

    val responses: deleteUserResponses[F] = new deleteUserResponses[F] {
      def resp200(value: UserDeleteResponse): F[Response[F]] = Ok(value)
    }
  }
  object listUsers {
    import UsersApiDelegate.listUsersResponses

    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object afterQueryParam extends OptionalQueryParamDecoderMatcher[String]("after")

    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ GET -> Root / "organization" / "users" :? limitQueryParam(limit) +& afterQueryParam(after)) as auth =>
        delegate.listUsers.handle_ApiKeyAuth(auth, req, limit, after, responses)

    }

    val responses: listUsersResponses[F] = new listUsersResponses[F] {
      def resp200(value: UserListResponse): F[Response[F]] = Ok(value)
    }
  }
  object modifyUser {
    import UsersApiDelegate.modifyUserResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ POST -> Root / "organization" / "users" / user_id) as auth =>
          delegate.modifyUser.handle_ApiKeyAuth(auth, req, req.asJsonDecode[UserRoleUpdateRequest] , user_id, responses)

    }

    val responses: modifyUserResponses[F] = new modifyUserResponses[F] {
      def resp200(value: User): F[Response[F]] = Ok(value)
    }
  }
  object retrieveUser {
    import UsersApiDelegate.retrieveUserResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ GET -> Root / "organization" / "users" / user_id) as auth =>
        delegate.retrieveUser.handle_ApiKeyAuth(auth, req, user_id, responses)

    }

    val responses: retrieveUserResponses[F] = new retrieveUserResponses[F] {
      def resp200(value: User): F[Response[F]] = Ok(value)
    }
  }

  val routesApiKeyAuth =
    deleteUser.routeApiKeyAuth <+>
    listUsers.routeApiKeyAuth <+>
    modifyUser.routeApiKeyAuth <+>
    retrieveUser.routeApiKeyAuth
}

object UsersApiDelegate {
  trait deleteUserResponses[F[_]] {
    def resp200(value: UserDeleteResponse): F[Response[F]]
  }

  trait listUsersResponses[F[_]] {
    def resp200(value: UserListResponse): F[Response[F]]
  }

  trait modifyUserResponses[F[_]] {
    def resp200(value: User): F[Response[F]]
  }

  trait retrieveUserResponses[F[_]] {
    def resp200(value: User): F[Response[F]]
  }

}

trait UsersApiDelegate[F[_], ApiKeyAuth] {

  trait deleteUser {
    import UsersApiDelegate.deleteUserResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      userId: String,
      responses: deleteUserResponses[F]
    ): F[Response[F]]

  }
  def deleteUser: deleteUser


  trait listUsers {
    import UsersApiDelegate.listUsersResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      limit: Option[Int],
      after: Option[String],
      responses: listUsersResponses[F]
    ): F[Response[F]]

  }
  def listUsers: listUsers


  trait modifyUser {
    import UsersApiDelegate.modifyUserResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      modifyUser: F[UserRoleUpdateRequest],
      userId: String,
      responses: modifyUserResponses[F]
    ): F[Response[F]]


  }
  def modifyUser: modifyUser


  trait retrieveUser {
    import UsersApiDelegate.retrieveUserResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      userId: String,
      responses: retrieveUserResponses[F]
    ): F[Response[F]]

  }
  def retrieveUser: retrieveUser

}