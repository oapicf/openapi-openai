package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.CompleteUploadRequest
import org.openapitools.models.CreateUploadRequest
import java.io.File
import org.openapitools.models.Upload
import org.openapitools.models.UploadPart


import cats.Monad
import cats.syntax.all._

import org.http4s._
import org.http4s.circe._
import org.http4s.server._
import org.http4s.headers._
import org.http4s.dsl.Http4sDsl
import org.http4s.circe.CirceEntityEncoder._

final case class UploadsApiRoutes[
  F[_]: JsonDecoder: Monad, ApiKeyAuth
](delegate: UploadsApiDelegate[F, ApiKeyAuth]) extends Http4sDsl[F] {
  object addUploadPart {
    import UploadsApiDelegate.addUploadPartResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ POST -> Root / "uploads" / upload_id / "parts") as auth =>
        delegate.addUploadPart.handle_ApiKeyAuth(auth, req, upload_id, responses)

    }

    val responses: addUploadPartResponses[F] = new addUploadPartResponses[F] {
      def resp200(value: UploadPart): F[Response[F]] = Ok(value)
    }
  }
  object cancelUpload {
    import UploadsApiDelegate.cancelUploadResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ POST -> Root / "uploads" / upload_id / "cancel") as auth =>
        delegate.cancelUpload.handle_ApiKeyAuth(auth, req, upload_id, responses)

    }

    val responses: cancelUploadResponses[F] = new cancelUploadResponses[F] {
      def resp200(value: Upload): F[Response[F]] = Ok(value)
    }
  }
  object completeUpload {
    import UploadsApiDelegate.completeUploadResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ POST -> Root / "uploads" / upload_id / "complete") as auth =>
          delegate.completeUpload.handle_ApiKeyAuth(auth, req, req.asJsonDecode[CompleteUploadRequest] , upload_id, responses)

    }

    val responses: completeUploadResponses[F] = new completeUploadResponses[F] {
      def resp200(value: Upload): F[Response[F]] = Ok(value)
    }
  }
  object createUpload {
    import UploadsApiDelegate.createUploadResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ POST -> Root / "uploads") as auth =>
          delegate.createUpload.handle_ApiKeyAuth(auth, req, req.asJsonDecode[CreateUploadRequest] , responses)

    }

    val responses: createUploadResponses[F] = new createUploadResponses[F] {
      def resp200(value: Upload): F[Response[F]] = Ok(value)
    }
  }

  val routesApiKeyAuth =
    addUploadPart.routeApiKeyAuth <+>
    cancelUpload.routeApiKeyAuth <+>
    completeUpload.routeApiKeyAuth <+>
    createUpload.routeApiKeyAuth
}

object UploadsApiDelegate {
  trait addUploadPartResponses[F[_]] {
    def resp200(value: UploadPart): F[Response[F]]
  }

  trait cancelUploadResponses[F[_]] {
    def resp200(value: Upload): F[Response[F]]
  }

  trait completeUploadResponses[F[_]] {
    def resp200(value: Upload): F[Response[F]]
  }

  trait createUploadResponses[F[_]] {
    def resp200(value: Upload): F[Response[F]]
  }

}

trait UploadsApiDelegate[F[_], ApiKeyAuth] {

  trait addUploadPart {
    import UploadsApiDelegate.addUploadPartResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      uploadId: String,
      responses: addUploadPartResponses[F]
    ): F[Response[F]]

  }
  def addUploadPart: addUploadPart


  trait cancelUpload {
    import UploadsApiDelegate.cancelUploadResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      uploadId: String,
      responses: cancelUploadResponses[F]
    ): F[Response[F]]

  }
  def cancelUpload: cancelUpload


  trait completeUpload {
    import UploadsApiDelegate.completeUploadResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      completeUpload: F[CompleteUploadRequest],
      uploadId: String,
      responses: completeUploadResponses[F]
    ): F[Response[F]]


  }
  def completeUpload: completeUpload


  trait createUpload {
    import UploadsApiDelegate.createUploadResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      createUpload: F[CreateUploadRequest],
      responses: createUploadResponses[F]
    ): F[Response[F]]


  }
  def createUpload: createUpload

}