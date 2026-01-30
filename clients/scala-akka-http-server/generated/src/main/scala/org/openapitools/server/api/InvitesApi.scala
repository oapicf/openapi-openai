package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.Invite
import org.openapitools.server.model.InviteDeleteResponse
import org.openapitools.server.model.InviteListResponse
import org.openapitools.server.model.InviteRequest


class InvitesApi(
    invitesService: InvitesApiService,
    invitesMarshaller: InvitesApiMarshaller
) {

  
  import invitesMarshaller._

  lazy val route: Route =
    path("organization" / "invites" / Segment) { (inviteId) => 
      delete {  
            invitesService.deleteInvite(inviteId = inviteId)
      }
    } ~
    path("organization" / "invites") { 
      post {  
            entity(as[InviteRequest]){ inviteRequest =>
              invitesService.inviteUser(inviteRequest = inviteRequest)
            }
      }
    } ~
    path("organization" / "invites") { 
      get { 
        parameters("limit".as[Int].?(20), "after".as[String].?) { (limit, after) => 
            invitesService.listInvites(limit = limit, after = after)
        }
      }
    } ~
    path("organization" / "invites" / Segment) { (inviteId) => 
      get {  
            invitesService.retrieveInvite(inviteId = inviteId)
      }
    }
}


trait InvitesApiService {

  def deleteInvite200(responseInviteDeleteResponse: InviteDeleteResponse)(implicit toEntityMarshallerInviteDeleteResponse: ToEntityMarshaller[InviteDeleteResponse]): Route =
    complete((200, responseInviteDeleteResponse))
  /**
   * Code: 200, Message: Invite deleted successfully., DataType: InviteDeleteResponse
   */
  def deleteInvite(inviteId: String)
      (implicit toEntityMarshallerInviteDeleteResponse: ToEntityMarshaller[InviteDeleteResponse]): Route

  def inviteUser200(responseInvite: Invite)(implicit toEntityMarshallerInvite: ToEntityMarshaller[Invite]): Route =
    complete((200, responseInvite))
  /**
   * Code: 200, Message: User invited successfully., DataType: Invite
   */
  def inviteUser(inviteRequest: InviteRequest)
      (implicit toEntityMarshallerInvite: ToEntityMarshaller[Invite]): Route

  def listInvites200(responseInviteListResponse: InviteListResponse)(implicit toEntityMarshallerInviteListResponse: ToEntityMarshaller[InviteListResponse]): Route =
    complete((200, responseInviteListResponse))
  /**
   * Code: 200, Message: Invites listed successfully., DataType: InviteListResponse
   */
  def listInvites(limit: Int, after: Option[String])
      (implicit toEntityMarshallerInviteListResponse: ToEntityMarshaller[InviteListResponse]): Route

  def retrieveInvite200(responseInvite: Invite)(implicit toEntityMarshallerInvite: ToEntityMarshaller[Invite]): Route =
    complete((200, responseInvite))
  /**
   * Code: 200, Message: Invite retrieved successfully., DataType: Invite
   */
  def retrieveInvite(inviteId: String)
      (implicit toEntityMarshallerInvite: ToEntityMarshaller[Invite]): Route

}

trait InvitesApiMarshaller {
  implicit def fromEntityUnmarshallerInviteRequest: FromEntityUnmarshaller[InviteRequest]



  implicit def toEntityMarshallerInvite: ToEntityMarshaller[Invite]

  implicit def toEntityMarshallerInviteListResponse: ToEntityMarshaller[InviteListResponse]

  implicit def toEntityMarshallerInviteDeleteResponse: ToEntityMarshaller[InviteDeleteResponse]

}

