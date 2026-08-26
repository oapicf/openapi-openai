package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.CreateEmbeddingRequest
import org.openapitools.models.CreateEmbeddingResponse


import cats.Monad
import cats.syntax.all._

import org.http4s._
import org.http4s.circe._
import org.http4s.server._
import org.http4s.headers._
import org.http4s.dsl.Http4sDsl
import org.http4s.circe.CirceEntityEncoder._

final case class EmbeddingsApiRoutes[
  F[_]: JsonDecoder: Monad, ApiKeyAuth
](delegate: EmbeddingsApiDelegate[F, ApiKeyAuth]) extends Http4sDsl[F] {
  object createEmbedding {
    import EmbeddingsApiDelegate.createEmbeddingResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ POST -> Root / "embeddings") as auth =>
          delegate.createEmbedding.handle_ApiKeyAuth(auth, req, req.asJsonDecode[CreateEmbeddingRequest] , responses)

    }

    val responses: createEmbeddingResponses[F] = new createEmbeddingResponses[F] {
      def resp200(value: CreateEmbeddingResponse): F[Response[F]] = Ok(value)
    }
  }

  val routesApiKeyAuth =
    createEmbedding.routeApiKeyAuth
}

object EmbeddingsApiDelegate {
  trait createEmbeddingResponses[F[_]] {
    def resp200(value: CreateEmbeddingResponse): F[Response[F]]
  }

}

trait EmbeddingsApiDelegate[F[_], ApiKeyAuth] {

  trait createEmbedding {
    import EmbeddingsApiDelegate.createEmbeddingResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      createEmbedding: F[CreateEmbeddingRequest],
      responses: createEmbeddingResponses[F]
    ): F[Response[F]]


  }
  def createEmbedding: createEmbedding

}