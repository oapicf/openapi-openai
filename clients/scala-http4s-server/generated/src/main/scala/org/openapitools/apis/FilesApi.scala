package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.DeleteFileResponse
import java.io.File
import org.openapitools.models.ListFilesResponse
import org.openapitools.models.OpenAIFile


import cats.Monad
import cats.syntax.all._

import org.http4s._
import org.http4s.circe._
import org.http4s.server._
import org.http4s.headers._
import org.http4s.dsl.Http4sDsl
import org.http4s.circe.CirceEntityEncoder._

final case class FilesApiRoutes[
  F[_]: JsonDecoder: Monad, ApiKeyAuth
](delegate: FilesApiDelegate[F, ApiKeyAuth]) extends Http4sDsl[F] {
  object createFile {
    import FilesApiDelegate.createFileResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ POST -> Root / "files") as auth =>
        delegate.createFile.handle_ApiKeyAuth(auth, req, responses)

    }

    val responses: createFileResponses[F] = new createFileResponses[F] {
      def resp200(value: OpenAIFile): F[Response[F]] = Ok(value)
    }
  }
  object deleteFile {
    import FilesApiDelegate.deleteFileResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ DELETE -> Root / "files" / file_id) as auth =>
        delegate.deleteFile.handle_ApiKeyAuth(auth, req, file_id, responses)

    }

    val responses: deleteFileResponses[F] = new deleteFileResponses[F] {
      def resp200(value: DeleteFileResponse): F[Response[F]] = Ok(value)
    }
  }
  object downloadFile {
    import FilesApiDelegate.downloadFileResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ GET -> Root / "files" / file_id / "content") as auth =>
        delegate.downloadFile.handle_ApiKeyAuth(auth, req, file_id, responses)

    }

    val responses: downloadFileResponses[F] = new downloadFileResponses[F] {
      def resp200(value: String): F[Response[F]] = Ok(value)
    }
  }
  object listFiles {
    import FilesApiDelegate.listFilesResponses

    object purposeQueryParam extends OptionalQueryParamDecoderMatcher[String]("purpose")
    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object orderQueryParam extends OptionalQueryParamDecoderMatcher[String]("order")
    object afterQueryParam extends OptionalQueryParamDecoderMatcher[String]("after")

    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ GET -> Root / "files" :? purposeQueryParam(purpose) +& limitQueryParam(limit) +& orderQueryParam(order) +& afterQueryParam(after)) as auth =>
        delegate.listFiles.handle_ApiKeyAuth(auth, req, purpose, limit, order, after, responses)

    }

    val responses: listFilesResponses[F] = new listFilesResponses[F] {
      def resp200(value: ListFilesResponse): F[Response[F]] = Ok(value)
    }
  }
  object retrieveFile {
    import FilesApiDelegate.retrieveFileResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ GET -> Root / "files" / file_id) as auth =>
        delegate.retrieveFile.handle_ApiKeyAuth(auth, req, file_id, responses)

    }

    val responses: retrieveFileResponses[F] = new retrieveFileResponses[F] {
      def resp200(value: OpenAIFile): F[Response[F]] = Ok(value)
    }
  }

  val routesApiKeyAuth =
    createFile.routeApiKeyAuth <+>
    deleteFile.routeApiKeyAuth <+>
    downloadFile.routeApiKeyAuth <+>
    listFiles.routeApiKeyAuth <+>
    retrieveFile.routeApiKeyAuth
}

object FilesApiDelegate {
  trait createFileResponses[F[_]] {
    def resp200(value: OpenAIFile): F[Response[F]]
  }

  trait deleteFileResponses[F[_]] {
    def resp200(value: DeleteFileResponse): F[Response[F]]
  }

  trait downloadFileResponses[F[_]] {
    def resp200(value: String): F[Response[F]]
  }

  trait listFilesResponses[F[_]] {
    def resp200(value: ListFilesResponse): F[Response[F]]
  }

  trait retrieveFileResponses[F[_]] {
    def resp200(value: OpenAIFile): F[Response[F]]
  }

}

trait FilesApiDelegate[F[_], ApiKeyAuth] {

  trait createFile {
    import FilesApiDelegate.createFileResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      responses: createFileResponses[F]
    ): F[Response[F]]

  }
  def createFile: createFile


  trait deleteFile {
    import FilesApiDelegate.deleteFileResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      fileId: String,
      responses: deleteFileResponses[F]
    ): F[Response[F]]

  }
  def deleteFile: deleteFile


  trait downloadFile {
    import FilesApiDelegate.downloadFileResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      fileId: String,
      responses: downloadFileResponses[F]
    ): F[Response[F]]

  }
  def downloadFile: downloadFile


  trait listFiles {
    import FilesApiDelegate.listFilesResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      purpose: Option[String],
      limit: Option[Int],
      order: Option[String],
      after: Option[String],
      responses: listFilesResponses[F]
    ): F[Response[F]]

  }
  def listFiles: listFiles


  trait retrieveFile {
    import FilesApiDelegate.retrieveFileResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      fileId: String,
      responses: retrieveFileResponses[F]
    ): F[Response[F]]

  }
  def retrieveFile: retrieveFile

}