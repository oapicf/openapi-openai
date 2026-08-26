package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.Batch
import org.openapitools.models.CreateBatchRequest
import org.openapitools.models.ListBatchesResponse


import cats.Monad
import cats.syntax.all._

import org.http4s._
import org.http4s.circe._
import org.http4s.server._
import org.http4s.headers._
import org.http4s.dsl.Http4sDsl
import org.http4s.circe.CirceEntityEncoder._

final case class BatchApiRoutes[
  F[_]: JsonDecoder: Monad, ApiKeyAuth
](delegate: BatchApiDelegate[F, ApiKeyAuth]) extends Http4sDsl[F] {
  object cancelBatch {
    import BatchApiDelegate.cancelBatchResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ POST -> Root / "batches" / batch_id / "cancel") as auth =>
        delegate.cancelBatch.handle_ApiKeyAuth(auth, req, batch_id, responses)

    }

    val responses: cancelBatchResponses[F] = new cancelBatchResponses[F] {
      def resp200(value: Batch): F[Response[F]] = Ok(value)
    }
  }
  object createBatch {
    import BatchApiDelegate.createBatchResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ POST -> Root / "batches") as auth =>
          delegate.createBatch.handle_ApiKeyAuth(auth, req, req.asJsonDecode[CreateBatchRequest] , responses)

    }

    val responses: createBatchResponses[F] = new createBatchResponses[F] {
      def resp200(value: Batch): F[Response[F]] = Ok(value)
    }
  }
  object listBatches {
    import BatchApiDelegate.listBatchesResponses

    object afterQueryParam extends OptionalQueryParamDecoderMatcher[String]("after")
    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")

    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ GET -> Root / "batches" :? afterQueryParam(after) +& limitQueryParam(limit)) as auth =>
        delegate.listBatches.handle_ApiKeyAuth(auth, req, after, limit, responses)

    }

    val responses: listBatchesResponses[F] = new listBatchesResponses[F] {
      def resp200(value: ListBatchesResponse): F[Response[F]] = Ok(value)
    }
  }
  object retrieveBatch {
    import BatchApiDelegate.retrieveBatchResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ GET -> Root / "batches" / batch_id) as auth =>
        delegate.retrieveBatch.handle_ApiKeyAuth(auth, req, batch_id, responses)

    }

    val responses: retrieveBatchResponses[F] = new retrieveBatchResponses[F] {
      def resp200(value: Batch): F[Response[F]] = Ok(value)
    }
  }

  val routesApiKeyAuth =
    cancelBatch.routeApiKeyAuth <+>
    createBatch.routeApiKeyAuth <+>
    listBatches.routeApiKeyAuth <+>
    retrieveBatch.routeApiKeyAuth
}

object BatchApiDelegate {
  trait cancelBatchResponses[F[_]] {
    def resp200(value: Batch): F[Response[F]]
  }

  trait createBatchResponses[F[_]] {
    def resp200(value: Batch): F[Response[F]]
  }

  trait listBatchesResponses[F[_]] {
    def resp200(value: ListBatchesResponse): F[Response[F]]
  }

  trait retrieveBatchResponses[F[_]] {
    def resp200(value: Batch): F[Response[F]]
  }

}

trait BatchApiDelegate[F[_], ApiKeyAuth] {

  trait cancelBatch {
    import BatchApiDelegate.cancelBatchResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      batchId: String,
      responses: cancelBatchResponses[F]
    ): F[Response[F]]

  }
  def cancelBatch: cancelBatch


  trait createBatch {
    import BatchApiDelegate.createBatchResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      createBatch: F[CreateBatchRequest],
      responses: createBatchResponses[F]
    ): F[Response[F]]


  }
  def createBatch: createBatch


  trait listBatches {
    import BatchApiDelegate.listBatchesResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      after: Option[String],
      limit: Option[Int],
      responses: listBatchesResponses[F]
    ): F[Response[F]]

  }
  def listBatches: listBatches


  trait retrieveBatch {
    import BatchApiDelegate.retrieveBatchResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      batchId: String,
      responses: retrieveBatchResponses[F]
    ): F[Response[F]]

  }
  def retrieveBatch: retrieveBatch

}