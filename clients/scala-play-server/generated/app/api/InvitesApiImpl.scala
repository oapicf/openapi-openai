package api

import model.Invite
import model.InviteDeleteResponse
import model.InviteListResponse
import model.InviteRequest

/**
  * Provides a default implementation for [[InvitesApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
class InvitesApiImpl extends InvitesApi {
  /**
    * @inheritdoc
    */
  override def deleteInvite(inviteId: String): InviteDeleteResponse = {
    // TODO: Implement better logic

    InviteDeleteResponse("", "", false)
  }

  /**
    * @inheritdoc
    */
  override def inviteUser(inviteRequest: InviteRequest): Invite = {
    // TODO: Implement better logic

    Invite("", "", "", "", "", 0, 0, None, None)
  }

  /**
    * @inheritdoc
    */
  override def listInvites(limit: Option[Int], after: Option[String]): InviteListResponse = {
    // TODO: Implement better logic

    InviteListResponse("", List.empty[Invite], None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def retrieveInvite(inviteId: String): Invite = {
    // TODO: Implement better logic

    Invite("", "", "", "", "", 0, 0, None, None)
  }
}
