package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.AdminApiKey
import model.AdminApiKeysCreateRequest
import model.AdminApiKeysDelete200Response
import model.ApiKeyList

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@Singleton
class DefaultApiController @Inject()(cc: ControllerComponents, api: DefaultApi) extends AbstractController(cc) {
  /**
    * POST /v1/organization/admin_api_keys
    */
  def adminApiKeysCreate(): Action[AnyContent] = Action { request =>
    def executeApi(): AdminApiKey = {
      val adminApiKeysCreateRequest = request.body.asJson.map(_.as[AdminApiKeysCreateRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "adminApiKeysCreateRequest")
      }
      api.adminApiKeysCreate(adminApiKeysCreateRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * DELETE /v1/organization/admin_api_keys/:keyId
    */
  def adminApiKeysDelete(keyId: String): Action[AnyContent] = Action { request =>
    def executeApi(): AdminApiKeysDelete200Response = {
      api.adminApiKeysDelete(keyId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v1/organization/admin_api_keys/:keyId
    */
  def adminApiKeysGet(keyId: String): Action[AnyContent] = Action { request =>
    def executeApi(): AdminApiKey = {
      api.adminApiKeysGet(keyId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v1/organization/admin_api_keys?after=[value]&order=[value]&limit=[value]
    */
  def adminApiKeysList(): Action[AnyContent] = Action { request =>
    def executeApi(): ApiKeyList = {
      val after = request.getQueryString("after")
        
      val order = request.getQueryString("order")
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.adminApiKeysList(after, order, limit)
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
