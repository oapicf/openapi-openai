package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.RealtimeSessionCreateRequest
import org.openapitools.models.RealtimeSessionCreateResponse


import cats.Monad
import cats.syntax.all._

import org.http4s._
import org.http4s.circe._
import org.http4s.server._
import org.http4s.headers._
import org.http4s.dsl.Http4sDsl
import org.http4s.circe.CirceEntityEncoder._

final case class RealtimeApiRoutes[
  F[_]: JsonDecoder: Monad, ApiKeyAuth
](delegate: RealtimeApiDelegate[F, ApiKeyAuth]) extends Http4sDsl[F] {
  object createRealtimeSession {
    import RealtimeApiDelegate.createRealtimeSessionResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ POST -> Root / "realtime" / "sessions") as auth =>
          delegate.createRealtimeSession.handle_ApiKeyAuth(auth, req, req.asJsonDecode[RealtimeSessionCreateRequest] , responses)

    }

    val responses: createRealtimeSessionResponses[F] = new createRealtimeSessionResponses[F] {
      def resp200(value: RealtimeSessionCreateResponse): F[Response[F]] = Ok(value)
    }
  }

  val routesApiKeyAuth =
    createRealtimeSession.routeApiKeyAuth
}

object RealtimeApiDelegate {
  trait createRealtimeSessionResponses[F[_]] {
    def resp200(value: RealtimeSessionCreateResponse): F[Response[F]]
  }

}

trait RealtimeApiDelegate[F[_], ApiKeyAuth] {

  trait createRealtimeSession {
    import RealtimeApiDelegate.createRealtimeSessionResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      createRealtimeSession: F[RealtimeSessionCreateRequest],
      responses: createRealtimeSessionResponses[F]
    ): F[Response[F]]


  }
  def createRealtimeSession: createRealtimeSession

}