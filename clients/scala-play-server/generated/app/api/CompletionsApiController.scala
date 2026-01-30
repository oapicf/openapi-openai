package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.CreateCompletionRequest
import model.CreateCompletionResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@Singleton
class CompletionsApiController @Inject()(cc: ControllerComponents, api: CompletionsApi) extends AbstractController(cc) {
  /**
    * POST /v1/completions
    */
  def createCompletion(): Action[AnyContent] = Action { request =>
    def executeApi(): CreateCompletionResponse = {
      val createCompletionRequest = request.body.asJson.map(_.as[CreateCompletionRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "createCompletionRequest")
      }
      api.createCompletion(createCompletionRequest)
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
