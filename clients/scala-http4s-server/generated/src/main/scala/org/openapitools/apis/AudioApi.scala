package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.AudioResponseFormat
import org.openapitools.models.CreateSpeechRequest
import org.openapitools.models.CreateTranscription200Response
import org.openapitools.models.CreateTranscriptionRequestModel
import org.openapitools.models.CreateTranslation200Response
import org.openapitools.models.CreateTranslationRequestModel
import java.io.File


import cats.Monad
import cats.syntax.all._

import org.http4s._
import org.http4s.circe._
import org.http4s.server._
import org.http4s.headers._
import org.http4s.dsl.Http4sDsl
import org.http4s.circe.CirceEntityEncoder._

final case class AudioApiRoutes[
  F[_]: JsonDecoder: Monad, ApiKeyAuth
](delegate: AudioApiDelegate[F, ApiKeyAuth]) extends Http4sDsl[F] {
  object createSpeech {
    import AudioApiDelegate.createSpeechResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ POST -> Root / "audio" / "speech") as auth =>
          delegate.createSpeech.handle_ApiKeyAuth(auth, req, req.asJsonDecode[CreateSpeechRequest] , responses)

    }

    val responses: createSpeechResponses[F] = new createSpeechResponses[F] {
      def resp200(): F[Response[F]] = Ok()
    }
  }
  object createTranscription {
    import AudioApiDelegate.createTranscriptionResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ POST -> Root / "audio" / "transcriptions") as auth =>
        delegate.createTranscription.handle_ApiKeyAuth(auth, req, responses)

    }

    val responses: createTranscriptionResponses[F] = new createTranscriptionResponses[F] {
      def resp200(value: CreateTranscription200Response): F[Response[F]] = Ok(value)
    }
  }
  object createTranslation {
    import AudioApiDelegate.createTranslationResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ POST -> Root / "audio" / "translations") as auth =>
        delegate.createTranslation.handle_ApiKeyAuth(auth, req, responses)

    }

    val responses: createTranslationResponses[F] = new createTranslationResponses[F] {
      def resp200(value: CreateTranslation200Response): F[Response[F]] = Ok(value)
    }
  }

  val routesApiKeyAuth =
    createSpeech.routeApiKeyAuth <+>
    createTranscription.routeApiKeyAuth <+>
    createTranslation.routeApiKeyAuth
}

object AudioApiDelegate {
  trait createSpeechResponses[F[_]] {
    def resp200(): F[Response[F]]
  }

  trait createTranscriptionResponses[F[_]] {
    def resp200(value: CreateTranscription200Response): F[Response[F]]
  }

  trait createTranslationResponses[F[_]] {
    def resp200(value: CreateTranslation200Response): F[Response[F]]
  }

}

trait AudioApiDelegate[F[_], ApiKeyAuth] {

  trait createSpeech {
    import AudioApiDelegate.createSpeechResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      createSpeech: F[CreateSpeechRequest],
      responses: createSpeechResponses[F]
    ): F[Response[F]]


  }
  def createSpeech: createSpeech


  trait createTranscription {
    import AudioApiDelegate.createTranscriptionResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      responses: createTranscriptionResponses[F]
    ): F[Response[F]]

  }
  def createTranscription: createTranscription


  trait createTranslation {
    import AudioApiDelegate.createTranslationResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      responses: createTranslationResponses[F]
    ): F[Response[F]]

  }
  def createTranslation: createTranslation

}