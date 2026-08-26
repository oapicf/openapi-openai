package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.CreateVectorStoreFileBatchRequest
import org.openapitools.models.CreateVectorStoreFileRequest
import org.openapitools.models.CreateVectorStoreRequest
import org.openapitools.models.DeleteVectorStoreFileResponse
import org.openapitools.models.DeleteVectorStoreResponse
import org.openapitools.models.ListVectorStoreFilesResponse
import org.openapitools.models.ListVectorStoresResponse
import org.openapitools.models.UpdateVectorStoreRequest
import org.openapitools.models.VectorStoreFileBatchObject
import org.openapitools.models.VectorStoreFileObject
import org.openapitools.models.VectorStoreObject


import cats.Monad
import cats.syntax.all._

import org.http4s._
import org.http4s.circe._
import org.http4s.server._
import org.http4s.headers._
import org.http4s.dsl.Http4sDsl
import org.http4s.circe.CirceEntityEncoder._

final case class VectorStoresApiRoutes[
  F[_]: JsonDecoder: Monad, ApiKeyAuth
](delegate: VectorStoresApiDelegate[F, ApiKeyAuth]) extends Http4sDsl[F] {
  object cancelVectorStoreFileBatch {
    import VectorStoresApiDelegate.cancelVectorStoreFileBatchResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ POST -> Root / "vector_stores" / vector_store_id / "file_batches" / batch_id / "cancel") as auth =>
        delegate.cancelVectorStoreFileBatch.handle_ApiKeyAuth(auth, req, vector_store_id, batch_id, responses)

    }

    val responses: cancelVectorStoreFileBatchResponses[F] = new cancelVectorStoreFileBatchResponses[F] {
      def resp200(value: VectorStoreFileBatchObject): F[Response[F]] = Ok(value)
    }
  }
  object createVectorStore {
    import VectorStoresApiDelegate.createVectorStoreResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ POST -> Root / "vector_stores") as auth =>
          delegate.createVectorStore.handle_ApiKeyAuth(auth, req, req.asJsonDecode[CreateVectorStoreRequest] , responses)

    }

    val responses: createVectorStoreResponses[F] = new createVectorStoreResponses[F] {
      def resp200(value: VectorStoreObject): F[Response[F]] = Ok(value)
    }
  }
  object createVectorStoreFile {
    import VectorStoresApiDelegate.createVectorStoreFileResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ POST -> Root / "vector_stores" / vector_store_id / "files") as auth =>
          delegate.createVectorStoreFile.handle_ApiKeyAuth(auth, req, req.asJsonDecode[CreateVectorStoreFileRequest] , vector_store_id, responses)

    }

    val responses: createVectorStoreFileResponses[F] = new createVectorStoreFileResponses[F] {
      def resp200(value: VectorStoreFileObject): F[Response[F]] = Ok(value)
    }
  }
  object createVectorStoreFileBatch {
    import VectorStoresApiDelegate.createVectorStoreFileBatchResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ POST -> Root / "vector_stores" / vector_store_id / "file_batches") as auth =>
          delegate.createVectorStoreFileBatch.handle_ApiKeyAuth(auth, req, req.asJsonDecode[CreateVectorStoreFileBatchRequest] , vector_store_id, responses)

    }

    val responses: createVectorStoreFileBatchResponses[F] = new createVectorStoreFileBatchResponses[F] {
      def resp200(value: VectorStoreFileBatchObject): F[Response[F]] = Ok(value)
    }
  }
  object deleteVectorStore {
    import VectorStoresApiDelegate.deleteVectorStoreResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ DELETE -> Root / "vector_stores" / vector_store_id) as auth =>
        delegate.deleteVectorStore.handle_ApiKeyAuth(auth, req, vector_store_id, responses)

    }

    val responses: deleteVectorStoreResponses[F] = new deleteVectorStoreResponses[F] {
      def resp200(value: DeleteVectorStoreResponse): F[Response[F]] = Ok(value)
    }
  }
  object deleteVectorStoreFile {
    import VectorStoresApiDelegate.deleteVectorStoreFileResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ DELETE -> Root / "vector_stores" / vector_store_id / "files" / file_id) as auth =>
        delegate.deleteVectorStoreFile.handle_ApiKeyAuth(auth, req, vector_store_id, file_id, responses)

    }

    val responses: deleteVectorStoreFileResponses[F] = new deleteVectorStoreFileResponses[F] {
      def resp200(value: DeleteVectorStoreFileResponse): F[Response[F]] = Ok(value)
    }
  }
  object getVectorStore {
    import VectorStoresApiDelegate.getVectorStoreResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ GET -> Root / "vector_stores" / vector_store_id) as auth =>
        delegate.getVectorStore.handle_ApiKeyAuth(auth, req, vector_store_id, responses)

    }

    val responses: getVectorStoreResponses[F] = new getVectorStoreResponses[F] {
      def resp200(value: VectorStoreObject): F[Response[F]] = Ok(value)
    }
  }
  object getVectorStoreFile {
    import VectorStoresApiDelegate.getVectorStoreFileResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ GET -> Root / "vector_stores" / vector_store_id / "files" / file_id) as auth =>
        delegate.getVectorStoreFile.handle_ApiKeyAuth(auth, req, vector_store_id, file_id, responses)

    }

    val responses: getVectorStoreFileResponses[F] = new getVectorStoreFileResponses[F] {
      def resp200(value: VectorStoreFileObject): F[Response[F]] = Ok(value)
    }
  }
  object getVectorStoreFileBatch {
    import VectorStoresApiDelegate.getVectorStoreFileBatchResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ GET -> Root / "vector_stores" / vector_store_id / "file_batches" / batch_id) as auth =>
        delegate.getVectorStoreFileBatch.handle_ApiKeyAuth(auth, req, vector_store_id, batch_id, responses)

    }

    val responses: getVectorStoreFileBatchResponses[F] = new getVectorStoreFileBatchResponses[F] {
      def resp200(value: VectorStoreFileBatchObject): F[Response[F]] = Ok(value)
    }
  }
  object listFilesInVectorStoreBatch {
    import VectorStoresApiDelegate.listFilesInVectorStoreBatchResponses

    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object orderQueryParam extends OptionalQueryParamDecoderMatcher[String]("order")
    object afterQueryParam extends OptionalQueryParamDecoderMatcher[String]("after")
    object beforeQueryParam extends OptionalQueryParamDecoderMatcher[String]("before")
    object filterQueryParam extends OptionalQueryParamDecoderMatcher[String]("filter")

    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ GET -> Root / "vector_stores" / vector_store_id / "file_batches" / batch_id / "files" :? limitQueryParam(limit) +& orderQueryParam(order) +& afterQueryParam(after) +& beforeQueryParam(before) +& filterQueryParam(filter)) as auth =>
        delegate.listFilesInVectorStoreBatch.handle_ApiKeyAuth(auth, req, vector_store_id, batch_id, limit, order, after, before, filter, responses)

    }

    val responses: listFilesInVectorStoreBatchResponses[F] = new listFilesInVectorStoreBatchResponses[F] {
      def resp200(value: ListVectorStoreFilesResponse): F[Response[F]] = Ok(value)
    }
  }
  object listVectorStoreFiles {
    import VectorStoresApiDelegate.listVectorStoreFilesResponses

    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object orderQueryParam extends OptionalQueryParamDecoderMatcher[String]("order")
    object afterQueryParam extends OptionalQueryParamDecoderMatcher[String]("after")
    object beforeQueryParam extends OptionalQueryParamDecoderMatcher[String]("before")
    object filterQueryParam extends OptionalQueryParamDecoderMatcher[String]("filter")

    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ GET -> Root / "vector_stores" / vector_store_id / "files" :? limitQueryParam(limit) +& orderQueryParam(order) +& afterQueryParam(after) +& beforeQueryParam(before) +& filterQueryParam(filter)) as auth =>
        delegate.listVectorStoreFiles.handle_ApiKeyAuth(auth, req, vector_store_id, limit, order, after, before, filter, responses)

    }

    val responses: listVectorStoreFilesResponses[F] = new listVectorStoreFilesResponses[F] {
      def resp200(value: ListVectorStoreFilesResponse): F[Response[F]] = Ok(value)
    }
  }
  object listVectorStores {
    import VectorStoresApiDelegate.listVectorStoresResponses

    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object orderQueryParam extends OptionalQueryParamDecoderMatcher[String]("order")
    object afterQueryParam extends OptionalQueryParamDecoderMatcher[String]("after")
    object beforeQueryParam extends OptionalQueryParamDecoderMatcher[String]("before")

    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ GET -> Root / "vector_stores" :? limitQueryParam(limit) +& orderQueryParam(order) +& afterQueryParam(after) +& beforeQueryParam(before)) as auth =>
        delegate.listVectorStores.handle_ApiKeyAuth(auth, req, limit, order, after, before, responses)

    }

    val responses: listVectorStoresResponses[F] = new listVectorStoresResponses[F] {
      def resp200(value: ListVectorStoresResponse): F[Response[F]] = Ok(value)
    }
  }
  object modifyVectorStore {
    import VectorStoresApiDelegate.modifyVectorStoreResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ POST -> Root / "vector_stores" / vector_store_id) as auth =>
          delegate.modifyVectorStore.handle_ApiKeyAuth(auth, req, req.asJsonDecode[UpdateVectorStoreRequest] , vector_store_id, responses)

    }

    val responses: modifyVectorStoreResponses[F] = new modifyVectorStoreResponses[F] {
      def resp200(value: VectorStoreObject): F[Response[F]] = Ok(value)
    }
  }

  val routesApiKeyAuth =
    cancelVectorStoreFileBatch.routeApiKeyAuth <+>
    createVectorStore.routeApiKeyAuth <+>
    createVectorStoreFile.routeApiKeyAuth <+>
    createVectorStoreFileBatch.routeApiKeyAuth <+>
    deleteVectorStore.routeApiKeyAuth <+>
    deleteVectorStoreFile.routeApiKeyAuth <+>
    getVectorStore.routeApiKeyAuth <+>
    getVectorStoreFile.routeApiKeyAuth <+>
    getVectorStoreFileBatch.routeApiKeyAuth <+>
    listFilesInVectorStoreBatch.routeApiKeyAuth <+>
    listVectorStoreFiles.routeApiKeyAuth <+>
    listVectorStores.routeApiKeyAuth <+>
    modifyVectorStore.routeApiKeyAuth
}

object VectorStoresApiDelegate {
  trait cancelVectorStoreFileBatchResponses[F[_]] {
    def resp200(value: VectorStoreFileBatchObject): F[Response[F]]
  }

  trait createVectorStoreResponses[F[_]] {
    def resp200(value: VectorStoreObject): F[Response[F]]
  }

  trait createVectorStoreFileResponses[F[_]] {
    def resp200(value: VectorStoreFileObject): F[Response[F]]
  }

  trait createVectorStoreFileBatchResponses[F[_]] {
    def resp200(value: VectorStoreFileBatchObject): F[Response[F]]
  }

  trait deleteVectorStoreResponses[F[_]] {
    def resp200(value: DeleteVectorStoreResponse): F[Response[F]]
  }

  trait deleteVectorStoreFileResponses[F[_]] {
    def resp200(value: DeleteVectorStoreFileResponse): F[Response[F]]
  }

  trait getVectorStoreResponses[F[_]] {
    def resp200(value: VectorStoreObject): F[Response[F]]
  }

  trait getVectorStoreFileResponses[F[_]] {
    def resp200(value: VectorStoreFileObject): F[Response[F]]
  }

  trait getVectorStoreFileBatchResponses[F[_]] {
    def resp200(value: VectorStoreFileBatchObject): F[Response[F]]
  }

  trait listFilesInVectorStoreBatchResponses[F[_]] {
    def resp200(value: ListVectorStoreFilesResponse): F[Response[F]]
  }

  trait listVectorStoreFilesResponses[F[_]] {
    def resp200(value: ListVectorStoreFilesResponse): F[Response[F]]
  }

  trait listVectorStoresResponses[F[_]] {
    def resp200(value: ListVectorStoresResponse): F[Response[F]]
  }

  trait modifyVectorStoreResponses[F[_]] {
    def resp200(value: VectorStoreObject): F[Response[F]]
  }

}

trait VectorStoresApiDelegate[F[_], ApiKeyAuth] {

  trait cancelVectorStoreFileBatch {
    import VectorStoresApiDelegate.cancelVectorStoreFileBatchResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      vectorStoreId: String,
      batchId: String,
      responses: cancelVectorStoreFileBatchResponses[F]
    ): F[Response[F]]

  }
  def cancelVectorStoreFileBatch: cancelVectorStoreFileBatch


  trait createVectorStore {
    import VectorStoresApiDelegate.createVectorStoreResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      createVectorStore: F[CreateVectorStoreRequest],
      responses: createVectorStoreResponses[F]
    ): F[Response[F]]


  }
  def createVectorStore: createVectorStore


  trait createVectorStoreFile {
    import VectorStoresApiDelegate.createVectorStoreFileResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      createVectorStoreFile: F[CreateVectorStoreFileRequest],
      vectorStoreId: String,
      responses: createVectorStoreFileResponses[F]
    ): F[Response[F]]


  }
  def createVectorStoreFile: createVectorStoreFile


  trait createVectorStoreFileBatch {
    import VectorStoresApiDelegate.createVectorStoreFileBatchResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      createVectorStoreFileBatch: F[CreateVectorStoreFileBatchRequest],
      vectorStoreId: String,
      responses: createVectorStoreFileBatchResponses[F]
    ): F[Response[F]]


  }
  def createVectorStoreFileBatch: createVectorStoreFileBatch


  trait deleteVectorStore {
    import VectorStoresApiDelegate.deleteVectorStoreResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      vectorStoreId: String,
      responses: deleteVectorStoreResponses[F]
    ): F[Response[F]]

  }
  def deleteVectorStore: deleteVectorStore


  trait deleteVectorStoreFile {
    import VectorStoresApiDelegate.deleteVectorStoreFileResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      vectorStoreId: String,
      fileId: String,
      responses: deleteVectorStoreFileResponses[F]
    ): F[Response[F]]

  }
  def deleteVectorStoreFile: deleteVectorStoreFile


  trait getVectorStore {
    import VectorStoresApiDelegate.getVectorStoreResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      vectorStoreId: String,
      responses: getVectorStoreResponses[F]
    ): F[Response[F]]

  }
  def getVectorStore: getVectorStore


  trait getVectorStoreFile {
    import VectorStoresApiDelegate.getVectorStoreFileResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      vectorStoreId: String,
      fileId: String,
      responses: getVectorStoreFileResponses[F]
    ): F[Response[F]]

  }
  def getVectorStoreFile: getVectorStoreFile


  trait getVectorStoreFileBatch {
    import VectorStoresApiDelegate.getVectorStoreFileBatchResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      vectorStoreId: String,
      batchId: String,
      responses: getVectorStoreFileBatchResponses[F]
    ): F[Response[F]]

  }
  def getVectorStoreFileBatch: getVectorStoreFileBatch


  trait listFilesInVectorStoreBatch {
    import VectorStoresApiDelegate.listFilesInVectorStoreBatchResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      vectorStoreId: String,
      batchId: String,
      limit: Option[Int],
      order: Option[String],
      after: Option[String],
      before: Option[String],
      filter: Option[String],
      responses: listFilesInVectorStoreBatchResponses[F]
    ): F[Response[F]]

  }
  def listFilesInVectorStoreBatch: listFilesInVectorStoreBatch


  trait listVectorStoreFiles {
    import VectorStoresApiDelegate.listVectorStoreFilesResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      vectorStoreId: String,
      limit: Option[Int],
      order: Option[String],
      after: Option[String],
      before: Option[String],
      filter: Option[String],
      responses: listVectorStoreFilesResponses[F]
    ): F[Response[F]]

  }
  def listVectorStoreFiles: listVectorStoreFiles


  trait listVectorStores {
    import VectorStoresApiDelegate.listVectorStoresResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      limit: Option[Int],
      order: Option[String],
      after: Option[String],
      before: Option[String],
      responses: listVectorStoresResponses[F]
    ): F[Response[F]]

  }
  def listVectorStores: listVectorStores


  trait modifyVectorStore {
    import VectorStoresApiDelegate.modifyVectorStoreResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      modifyVectorStore: F[UpdateVectorStoreRequest],
      vectorStoreId: String,
      responses: modifyVectorStoreResponses[F]
    ): F[Response[F]]


  }
  def modifyVectorStore: modifyVectorStore

}