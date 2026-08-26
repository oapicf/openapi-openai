package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.CreateCompletionRequest
import org.openapitools.models.CreateCompletionResponse


import cats.Monad
import cats.syntax.all._

import org.http4s._
import org.http4s.circe._
import org.http4s.server._
import org.http4s.headers._
import org.http4s.dsl.Http4sDsl
import org.http4s.circe.CirceEntityEncoder._

final case class CompletionsApiRoutes[
  F[_]: JsonDecoder: Monad, ApiKeyAuth
](delegate: CompletionsApiDelegate[F, ApiKeyAuth]) extends Http4sDsl[F] {
  object createCompletion {
    import CompletionsApiDelegate.createCompletionResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ POST -> Root / "completions") as auth =>
          delegate.createCompletion.handle_ApiKeyAuth(auth, req, req.asJsonDecode[CreateCompletionRequest] , responses)

    }

    val responses: createCompletionResponses[F] = new createCompletionResponses[F] {
      def resp200(value: CreateCompletionResponse): F[Response[F]] = Ok(value)
    }
  }

  val routesApiKeyAuth =
    createCompletion.routeApiKeyAuth
}

object CompletionsApiDelegate {
  trait createCompletionResponses[F[_]] {
    def resp200(value: CreateCompletionResponse): F[Response[F]]
  }

}

trait CompletionsApiDelegate[F[_], ApiKeyAuth] {

  trait createCompletion {
    import CompletionsApiDelegate.createCompletionResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      createCompletion: F[CreateCompletionRequest],
      responses: createCompletionResponses[F]
    ): F[Response[F]]


  }
  def createCompletion: createCompletion

}