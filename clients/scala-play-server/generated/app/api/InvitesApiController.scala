package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.Invite
import model.InviteDeleteResponse
import model.InviteListResponse
import model.InviteRequest

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@Singleton
class InvitesApiController @Inject()(cc: ControllerComponents, api: InvitesApi) extends AbstractController(cc) {
  /**
    * DELETE /v1/organization/invites/:inviteId
    * @param inviteId The ID of the invite to delete.
    */
  def deleteInvite(inviteId: String): Action[AnyContent] = Action { request =>
    def executeApi(): InviteDeleteResponse = {
      api.deleteInvite(inviteId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v1/organization/invites
    */
  def inviteUser(): Action[AnyContent] = Action { request =>
    def executeApi(): Invite = {
      val inviteRequest = request.body.asJson.map(_.as[InviteRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "inviteRequest")
      }
      api.inviteUser(inviteRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v1/organization/invites?limit=[value]&after=[value]
    */
  def listInvites(): Action[AnyContent] = Action { request =>
    def executeApi(): InviteListResponse = {
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val after = request.getQueryString("after")
        
      api.listInvites(limit, after)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v1/organization/invites/:inviteId
    * @param inviteId The ID of the invite to retrieve.
    */
  def retrieveInvite(inviteId: String): Action[AnyContent] = Action { request =>
    def executeApi(): Invite = {
      api.retrieveInvite(inviteId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  private def splitCollectionParam(paramValues: String, collectionFormat: String): List[String] = {
    val splitBy =
      collectionFormat match {
        case "csv" => ",+"
        case "tsv" => "\t+"
        case "ssv" => " +"
        case "pipes" => "|+"
      }

    paramValues.split(splitBy).toList
  }
}
