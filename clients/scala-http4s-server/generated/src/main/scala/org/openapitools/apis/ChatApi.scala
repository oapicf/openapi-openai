package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.CreateChatCompletionRequest
import org.openapitools.models.CreateChatCompletionResponse


import cats.Monad
import cats.syntax.all._

import org.http4s._
import org.http4s.circe._
import org.http4s.server._
import org.http4s.headers._
import org.http4s.dsl.Http4sDsl
import org.http4s.circe.CirceEntityEncoder._

final case class ChatApiRoutes[
  F[_]: JsonDecoder: Monad, ApiKeyAuth
](delegate: ChatApiDelegate[F, ApiKeyAuth]) extends Http4sDsl[F] {
  object createChatCompletion {
    import ChatApiDelegate.createChatCompletionResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ POST -> Root / "chat" / "completions") as auth =>
          delegate.createChatCompletion.handle_ApiKeyAuth(auth, req, req.asJsonDecode[CreateChatCompletionRequest] , responses)

    }

    val responses: createChatCompletionResponses[F] = new createChatCompletionResponses[F] {
      def resp200(value: CreateChatCompletionResponse): F[Response[F]] = Ok(value)
    }
  }

  val routesApiKeyAuth =
    createChatCompletion.routeApiKeyAuth
}

object ChatApiDelegate {
  trait createChatCompletionResponses[F[_]] {
    def resp200(value: CreateChatCompletionResponse): F[Response[F]]
  }

}

trait ChatApiDelegate[F[_], ApiKeyAuth] {

  trait createChatCompletion {
    import ChatApiDelegate.createChatCompletionResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      createChatCompletion: F[CreateChatCompletionRequest],
      responses: createChatCompletionResponses[F]
    ): F[Response[F]]


  }
  def createChatCompletion: createChatCompletion

}