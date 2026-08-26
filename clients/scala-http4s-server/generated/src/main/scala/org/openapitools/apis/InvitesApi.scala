package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.Invite
import org.openapitools.models.InviteDeleteResponse
import org.openapitools.models.InviteListResponse
import org.openapitools.models.InviteRequest


import cats.Monad
import cats.syntax.all._

import org.http4s._
import org.http4s.circe._
import org.http4s.server._
import org.http4s.headers._
import org.http4s.dsl.Http4sDsl
import org.http4s.circe.CirceEntityEncoder._

final case class InvitesApiRoutes[
  F[_]: JsonDecoder: Monad, ApiKeyAuth
](delegate: InvitesApiDelegate[F, ApiKeyAuth]) extends Http4sDsl[F] {
  object deleteInvite {
    import InvitesApiDelegate.deleteInviteResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ DELETE -> Root / "organization" / "invites" / invite_id) as auth =>
        delegate.deleteInvite.handle_ApiKeyAuth(auth, req, invite_id, responses)

    }

    val responses: deleteInviteResponses[F] = new deleteInviteResponses[F] {
      def resp200(value: InviteDeleteResponse): F[Response[F]] = Ok(value)
    }
  }
  object inviteUser {
    import InvitesApiDelegate.inviteUserResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ POST -> Root / "organization" / "invites") as auth =>
          delegate.inviteUser.handle_ApiKeyAuth(auth, req, req.asJsonDecode[InviteRequest] , responses)

    }

    val responses: inviteUserResponses[F] = new inviteUserResponses[F] {
      def resp200(value: Invite): F[Response[F]] = Ok(value)
    }
  }
  object listInvites {
    import InvitesApiDelegate.listInvitesResponses

    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object afterQueryParam extends OptionalQueryParamDecoderMatcher[String]("after")

    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ GET -> Root / "organization" / "invites" :? limitQueryParam(limit) +& afterQueryParam(after)) as auth =>
        delegate.listInvites.handle_ApiKeyAuth(auth, req, limit, after, responses)

    }

    val responses: listInvitesResponses[F] = new listInvitesResponses[F] {
      def resp200(value: InviteListResponse): F[Response[F]] = Ok(value)
    }
  }
  object retrieveInvite {
    import InvitesApiDelegate.retrieveInviteResponses


    val routeApiKeyAuth = AuthedRoutes.of[ApiKeyAuth, F] {
      case (req @ GET -> Root / "organization" / "invites" / invite_id) as auth =>
        delegate.retrieveInvite.handle_ApiKeyAuth(auth, req, invite_id, responses)

    }

    val responses: retrieveInviteResponses[F] = new retrieveInviteResponses[F] {
      def resp200(value: Invite): F[Response[F]] = Ok(value)
    }
  }

  val routesApiKeyAuth =
    deleteInvite.routeApiKeyAuth <+>
    inviteUser.routeApiKeyAuth <+>
    listInvites.routeApiKeyAuth <+>
    retrieveInvite.routeApiKeyAuth
}

object InvitesApiDelegate {
  trait deleteInviteResponses[F[_]] {
    def resp200(value: InviteDeleteResponse): F[Response[F]]
  }

  trait inviteUserResponses[F[_]] {
    def resp200(value: Invite): F[Response[F]]
  }

  trait listInvitesResponses[F[_]] {
    def resp200(value: InviteListResponse): F[Response[F]]
  }

  trait retrieveInviteResponses[F[_]] {
    def resp200(value: Invite): F[Response[F]]
  }

}

trait InvitesApiDelegate[F[_], ApiKeyAuth] {

  trait deleteInvite {
    import InvitesApiDelegate.deleteInviteResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      inviteId: String,
      responses: deleteInviteResponses[F]
    ): F[Response[F]]

  }
  def deleteInvite: deleteInvite


  trait inviteUser {
    import InvitesApiDelegate.inviteUserResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      inviteUser: F[InviteRequest],
      responses: inviteUserResponses[F]
    ): F[Response[F]]


  }
  def inviteUser: inviteUser


  trait listInvites {
    import InvitesApiDelegate.listInvitesResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      limit: Option[Int],
      after: Option[String],
      responses: listInvitesResponses[F]
    ): F[Response[F]]

  }
  def listInvites: listInvites


  trait retrieveInvite {
    import InvitesApiDelegate.retrieveInviteResponses


    def handle_ApiKeyAuth(
      auth: ApiKeyAuth,
      req: Request[F],
      inviteId: String,
      responses: retrieveInviteResponses[F]
    ): F[Response[F]]

  }
  def retrieveInvite: retrieveInvite

}