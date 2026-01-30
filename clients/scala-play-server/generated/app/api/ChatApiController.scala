package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.CreateChatCompletionRequest
import model.CreateChatCompletionResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@Singleton
class ChatApiController @Inject()(cc: ControllerComponents, api: ChatApi) extends AbstractController(cc) {
  /**
    * POST /v1/chat/completions
    */
  def createChatCompletion(): Action[AnyContent] = Action { request =>
    def executeApi(): CreateChatCompletionResponse = {
      val createChatCompletionRequest = request.body.asJson.map(_.as[CreateChatCompletionRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "createChatCompletionRequest")
      }
      api.createChatCompletion(createChatCompletionRequest)
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
