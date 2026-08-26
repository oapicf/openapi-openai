package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.CreateImageEditRequestModel
import org.openapitools.models.CreateImageRequest
import org.openapitools.models.CreateImageVariationRequestModel
import java.io.File
import org.openapitools.models.ImagesResponse


import cats.Monad
import cats.syntax.all._

import org.http4s._
import org.http4s.circe._
import org.http4s.server._
import org.http4s.headers._
import org.http4s.dsl.Http4sDsl
import org.http4s.circe.CirceEntityEncoder._

final case class ImagesApiRoutes[
  F[_]: JsonDecoder: Monad, ApiKeyAuth
](delegate: ImagesApiDelegate[F, ApiKeyAuth]) extends Http4sDsl[F] {
  object createImage {
    import ImagesApiDelegate.createImageResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ POST -> Root / "images" / "generations") as auth =>
          delegate.createImage.handle_ApiKeyAuth(auth, req, req.asJsonDecode[CreateImageRequest] , responses)

    }

    val responses: createImageResponses[F] = new createImageResponses[F] {
      def resp200(value: ImagesResponse): F[Response[F]] = Ok(value)
    }
  }
  object createImageEdit {
    import ImagesApiDelegate.createImageEditResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ POST -> Root / "images" / "edits") as auth =>
        delegate.createImageEdit.handle_ApiKeyAuth(auth, req, responses)

    }

    val responses: createImageEditResponses[F] = new createImageEditResponses[F] {
      def resp200(value: ImagesResponse): F[Response[F]] = Ok(value)
    }
  }
  object createImageVariation {
    import ImagesApiDelegate.createImageVariationResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ POST -> Root / "images" / "variations") as auth =>
        delegate.createImageVariation.handle_ApiKeyAuth(auth, req, responses)

    }

    val responses: createImageVariationResponses[F] = new createImageVariationResponses[F] {
      def resp200(value: ImagesResponse): F[Response[F]] = Ok(value)
    }
  }

  val routesApiKeyAuth =
    createImage.routeApiKeyAuth <+>
    createImageEdit.routeApiKeyAuth <+>
    createImageVariation.routeApiKeyAuth
}

object ImagesApiDelegate {
  trait createImageResponses[F[_]] {
    def resp200(value: ImagesResponse): F[Response[F]]
  }

  trait createImageEditResponses[F[_]] {
    def resp200(value: ImagesResponse): F[Response[F]]
  }

  trait createImageVariationResponses[F[_]] {
    def resp200(value: ImagesResponse): F[Response[F]]
  }

}

trait ImagesApiDelegate[F[_], ApiKeyAuth] {

  trait createImage {
    import ImagesApiDelegate.createImageResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      createImage: F[CreateImageRequest],
      responses: createImageResponses[F]
    ): F[Response[F]]


  }
  def createImage: createImage


  trait createImageEdit {
    import ImagesApiDelegate.createImageEditResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      responses: createImageEditResponses[F]
    ): F[Response[F]]

  }
  def createImageEdit: createImageEdit


  trait createImageVariation {
    import ImagesApiDelegate.createImageVariationResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      responses: createImageVariationResponses[F]
    ): F[Response[F]]

  }
  def createImageVariation: createImageVariation

}