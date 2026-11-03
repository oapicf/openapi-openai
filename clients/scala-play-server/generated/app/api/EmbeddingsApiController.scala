package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.CreateEmbeddingRequest
import model.CreateEmbeddingResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
@Singleton
class EmbeddingsApiController @Inject()(cc: ControllerComponents, api: EmbeddingsApi) extends AbstractController(cc) {
  /**
    * POST /v1/embeddings
    */
  def createEmbedding(): Action[AnyContent] = Action { request =>
    def executeApi(): CreateEmbeddingResponse = {
      val createEmbeddingRequest = request.body.asJson.map(_.as[CreateEmbeddingRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "createEmbeddingRequest")
      }
      api.createEmbedding(createEmbeddingRequest)
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
