package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.AdminApiKey
import org.openapitools.models.AdminApiKeysCreateRequest
import org.openapitools.models.AdminApiKeysDelete200Response
import org.openapitools.models.ApiKeyList


import cats.Monad
import cats.syntax.all._

import org.http4s._
import org.http4s.circe._
import org.http4s.server._
import org.http4s.headers._
import org.http4s.dsl.Http4sDsl
import org.http4s.circe.CirceEntityEncoder._

final case class DefaultApiRoutes[
  F[_]: JsonDecoder: Monad, ApiKeyAuth
](delegate: DefaultApiDelegate[F, ApiKeyAuth]) extends Http4sDsl[F] {
  object adminApiKeysCreate {
    import DefaultApiDelegate.adminApiKeysCreateResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ POST -> Root / "organization" / "admin_api_keys") as auth =>
          delegate.adminApiKeysCreate.handle_ApiKeyAuth(auth, req, req.asJsonDecode[AdminApiKeysCreateRequest] , responses)

    }

    val responses: adminApiKeysCreateResponses[F] = new adminApiKeysCreateResponses[F] {
      def resp200(value: AdminApiKey): F[Response[F]] = Ok(value)
    }
  }
  object adminApiKeysDelete {
    import DefaultApiDelegate.adminApiKeysDeleteResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ DELETE -> Root / "organization" / "admin_api_keys" / key_id) as auth =>
        delegate.adminApiKeysDelete.handle_ApiKeyAuth(auth, req, key_id, responses)

    }

    val responses: adminApiKeysDeleteResponses[F] = new adminApiKeysDeleteResponses[F] {
      def resp200(value: AdminApiKeysDelete200Response): F[Response[F]] = Ok(value)
    }
  }
  object adminApiKeysGet {
    import DefaultApiDelegate.adminApiKeysGetResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ GET -> Root / "organization" / "admin_api_keys" / key_id) as auth =>
        delegate.adminApiKeysGet.handle_ApiKeyAuth(auth, req, key_id, responses)

    }

    val responses: adminApiKeysGetResponses[F] = new adminApiKeysGetResponses[F] {
      def resp200(value: AdminApiKey): F[Response[F]] = Ok(value)
    }
  }
  object adminApiKeysList {
    import DefaultApiDelegate.adminApiKeysListResponses

    object afterQueryParam extends OptionalQueryParamDecoderMatcher[String]("after")
    object orderQueryParam extends OptionalQueryParamDecoderMatcher[String]("order")
    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")

    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ GET -> Root / "organization" / "admin_api_keys" :? afterQueryParam(after) +& orderQueryParam(order) +& limitQueryParam(limit)) as auth =>
        delegate.adminApiKeysList.handle_ApiKeyAuth(auth, req, after, order, limit, responses)

    }

    val responses: adminApiKeysListResponses[F] = new adminApiKeysListResponses[F] {
      def resp200(value: ApiKeyList): F[Response[F]] = Ok(value)
    }
  }

  val routesApiKeyAuth =
    adminApiKeysCreate.routeApiKeyAuth <+>
    adminApiKeysDelete.routeApiKeyAuth <+>
    adminApiKeysGet.routeApiKeyAuth <+>
    adminApiKeysList.routeApiKeyAuth
}

object DefaultApiDelegate {
  trait adminApiKeysCreateResponses[F[_]] {
    def resp200(value: AdminApiKey): F[Response[F]]
  }

  trait adminApiKeysDeleteResponses[F[_]] {
    def resp200(value: AdminApiKeysDelete200Response): F[Response[F]]
  }

  trait adminApiKeysGetResponses[F[_]] {
    def resp200(value: AdminApiKey): F[Response[F]]
  }

  trait adminApiKeysListResponses[F[_]] {
    def resp200(value: ApiKeyList): F[Response[F]]
  }

}

trait DefaultApiDelegate[F[_], ApiKeyAuth] {

  trait adminApiKeysCreate {
    import DefaultApiDelegate.adminApiKeysCreateResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      adminApiKeysCreate: F[AdminApiKeysCreateRequest],
      responses: adminApiKeysCreateResponses[F]
    ): F[Response[F]]


  }
  def adminApiKeysCreate: adminApiKeysCreate


  trait adminApiKeysDelete {
    import DefaultApiDelegate.adminApiKeysDeleteResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      keyId: String,
      responses: adminApiKeysDeleteResponses[F]
    ): F[Response[F]]

  }
  def adminApiKeysDelete: adminApiKeysDelete


  trait adminApiKeysGet {
    import DefaultApiDelegate.adminApiKeysGetResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      keyId: String,
      responses: adminApiKeysGetResponses[F]
    ): F[Response[F]]

  }
  def adminApiKeysGet: adminApiKeysGet


  trait adminApiKeysList {
    import DefaultApiDelegate.adminApiKeysListResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      after: Option[String],
      order: Option[String],
      limit: Option[Int],
      responses: adminApiKeysListResponses[F]
    ): F[Response[F]]

  }
  def adminApiKeysList: adminApiKeysList

}