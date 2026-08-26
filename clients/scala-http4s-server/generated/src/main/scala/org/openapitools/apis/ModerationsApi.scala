package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.CreateModerationRequest
import org.openapitools.models.CreateModerationResponse


import cats.Monad
import cats.syntax.all._

import org.http4s._
import org.http4s.circe._
import org.http4s.server._
import org.http4s.headers._
import org.http4s.dsl.Http4sDsl
import org.http4s.circe.CirceEntityEncoder._

final case class ModerationsApiRoutes[
  F[_]: JsonDecoder: Monad, ApiKeyAuth
](delegate: ModerationsApiDelegate[F, ApiKeyAuth]) extends Http4sDsl[F] {
  object createModeration {
    import ModerationsApiDelegate.createModerationResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ POST -> Root / "moderations") as auth =>
          delegate.createModeration.handle_ApiKeyAuth(auth, req, req.asJsonDecode[CreateModerationRequest] , responses)

    }

    val responses: createModerationResponses[F] = new createModerationResponses[F] {
      def resp200(value: CreateModerationResponse): F[Response[F]] = Ok(value)
    }
  }

  val routesApiKeyAuth =
    createModeration.routeApiKeyAuth
}

object ModerationsApiDelegate {
  trait createModerationResponses[F[_]] {
    def resp200(value: CreateModerationResponse): F[Response[F]]
  }

}

trait ModerationsApiDelegate[F[_], ApiKeyAuth] {

  trait createModeration {
    import ModerationsApiDelegate.createModerationResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      createModeration: F[CreateModerationRequest],
      responses: createModerationResponses[F]
    ): F[Response[F]]


  }
  def createModeration: createModeration

}