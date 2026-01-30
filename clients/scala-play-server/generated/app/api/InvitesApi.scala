package api

import play.api.libs.json._
import model.Invite
import model.InviteDeleteResponse
import model.InviteListResponse
import model.InviteRequest

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
trait InvitesApi {
  /**
    * Delete an invite. If the invite has already been accepted, it cannot be deleted.
    * @param inviteId The ID of the invite to delete.
    */
  def deleteInvite(inviteId: String): InviteDeleteResponse

  /**
    * Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.
    * @param inviteRequest The invite request payload.
    */
  def inviteUser(inviteRequest: InviteRequest): Invite

  /**
    * Returns a list of invites in the organization.
    * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
    * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
    */
  def listInvites(limit: Option[Int], after: Option[String]): InviteListResponse

  /**
    * Retrieves an invite.
    * @param inviteId The ID of the invite to retrieve.
    */
  def retrieveInvite(inviteId: String): Invite
}
