package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.DeleteModelResponse
import model.ListModelsResponse
import model.Model

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@Singleton
class ModelsApiController @Inject()(cc: ControllerComponents, api: ModelsApi) extends AbstractController(cc) {
  /**
    * DELETE /v1/models/:model
    * @param model The model to delete
    */
  def deleteModel(model: String): Action[AnyContent] = Action { request =>
    def executeApi(): DeleteModelResponse = {
      api.deleteModel(model)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v1/models
    */
  def listModels(): Action[AnyContent] = Action { request =>
    def executeApi(): ListModelsResponse = {
      api.listModels()
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v1/models/:model
    * @param model The ID of the model to use for this request
    */
  def retrieveModel(model: String): Action[AnyContent] = Action { request =>
    def executeApi(): Model = {
      api.retrieveModel(model)
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
