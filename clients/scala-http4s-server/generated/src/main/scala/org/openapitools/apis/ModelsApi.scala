package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.DeleteModelResponse
import org.openapitools.models.ListModelsResponse
import org.openapitools.models.Model


import cats.Monad
import cats.syntax.all._

import org.http4s._
import org.http4s.circe._
import org.http4s.server._
import org.http4s.headers._
import org.http4s.dsl.Http4sDsl
import org.http4s.circe.CirceEntityEncoder._

final case class ModelsApiRoutes[
  F[_]: JsonDecoder: Monad, ApiKeyAuth
](delegate: ModelsApiDelegate[F, ApiKeyAuth]) extends Http4sDsl[F] {
  object deleteModel {
    import ModelsApiDelegate.deleteModelResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ DELETE -> Root / "models" / model) as auth =>
        delegate.deleteModel.handle_ApiKeyAuth(auth, req, model, responses)

    }

    val responses: deleteModelResponses[F] = new deleteModelResponses[F] {
      def resp200(value: DeleteModelResponse): F[Response[F]] = Ok(value)
    }
  }
  object listModels {
    import ModelsApiDelegate.listModelsResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ GET -> Root / "models") as auth =>
        delegate.listModels.handle_ApiKeyAuth(auth, req, responses)

    }

    val responses: listModelsResponses[F] = new listModelsResponses[F] {
      def resp200(value: ListModelsResponse): F[Response[F]] = Ok(value)
    }
  }
  object retrieveModel {
    import ModelsApiDelegate.retrieveModelResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ GET -> Root / "models" / model) as auth =>
        delegate.retrieveModel.handle_ApiKeyAuth(auth, req, model, responses)

    }

    val responses: retrieveModelResponses[F] = new retrieveModelResponses[F] {
      def resp200(value: Model): F[Response[F]] = Ok(value)
    }
  }

  val routesApiKeyAuth =
    deleteModel.routeApiKeyAuth <+>
    listModels.routeApiKeyAuth <+>
    retrieveModel.routeApiKeyAuth
}

object ModelsApiDelegate {
  trait deleteModelResponses[F[_]] {
    def resp200(value: DeleteModelResponse): F[Response[F]]
  }

  trait listModelsResponses[F[_]] {
    def resp200(value: ListModelsResponse): F[Response[F]]
  }

  trait retrieveModelResponses[F[_]] {
    def resp200(value: Model): F[Response[F]]
  }

}

trait ModelsApiDelegate[F[_], ApiKeyAuth] {

  trait deleteModel {
    import ModelsApiDelegate.deleteModelResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      model: String,
      responses: deleteModelResponses[F]
    ): F[Response[F]]

  }
  def deleteModel: deleteModel


  trait listModels {
    import ModelsApiDelegate.listModelsResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      responses: listModelsResponses[F]
    ): F[Response[F]]

  }
  def listModels: listModels


  trait retrieveModel {
    import ModelsApiDelegate.retrieveModelResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      model: String,
      responses: retrieveModelResponses[F]
    ): F[Response[F]]

  }
  def retrieveModel: retrieveModel

}