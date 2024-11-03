package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.CreateEmbeddingRequest
import model.CreateEmbeddingResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
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
