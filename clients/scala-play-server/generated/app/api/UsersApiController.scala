package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.User
import model.UserDeleteResponse
import model.UserListResponse
import model.UserRoleUpdateRequest

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@Singleton
class UsersApiController @Inject()(cc: ControllerComponents, api: UsersApi) extends AbstractController(cc) {
  /**
    * DELETE /v1/organization/users/:userId
    * @param userId The ID of the user.
    */
  def deleteUser(userId: String): Action[AnyContent] = Action { request =>
    def executeApi(): UserDeleteResponse = {
      api.deleteUser(userId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v1/organization/users?limit=[value]&after=[value]
    */
  def listUsers(): Action[AnyContent] = Action { request =>
    def executeApi(): UserListResponse = {
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val after = request.getQueryString("after")
        
      api.listUsers(limit, after)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v1/organization/users/:userId
    * @param userId The ID of the user.
    */
  def modifyUser(userId: String): Action[AnyContent] = Action { request =>
    def executeApi(): User = {
      val userRoleUpdateRequest = request.body.asJson.map(_.as[UserRoleUpdateRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "userRoleUpdateRequest")
      }
      api.modifyUser(userId, userRoleUpdateRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v1/organization/users/:userId
    * @param userId The ID of the user.
    */
  def retrieveUser(userId: String): Action[AnyContent] = Action { request =>
    def executeApi(): User = {
      api.retrieveUser(userId)
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
