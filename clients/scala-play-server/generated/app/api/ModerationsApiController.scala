package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.CreateModerationRequest
import model.CreateModerationResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@Singleton
class ModerationsApiController @Inject()(cc: ControllerComponents, api: ModerationsApi) extends AbstractController(cc) {
  /**
    * POST /v1/moderations
    */
  def createModeration(): Action[AnyContent] = Action { request =>
    def executeApi(): CreateModerationResponse = {
      val createModerationRequest = request.body.asJson.map(_.as[CreateModerationRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "createModerationRequest")
      }
      api.createModeration(createModerationRequest)
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
