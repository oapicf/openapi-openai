package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.CompleteUploadRequest
import model.CreateUploadRequest
import play.api.libs.Files.TemporaryFile
import model.Upload
import model.UploadPart

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@Singleton
class UploadsApiController @Inject()(cc: ControllerComponents, api: UploadsApi) extends AbstractController(cc) {
  /**
    * POST /v1/uploads/:uploadId/parts
    * @param uploadId The ID of the Upload. 
    */
  def addUploadPart(uploadId: String): Action[AnyContent] = Action { request =>
    def executeApi(): UploadPart = {
      val data = request.body.asMultipartFormData.flatMap(_.file("data").map(_.ref: TemporaryFile))
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("data", "form")
        }
        
      api.addUploadPart(uploadId, data)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v1/uploads/:uploadId/cancel
    * @param uploadId The ID of the Upload. 
    */
  def cancelUpload(uploadId: String): Action[AnyContent] = Action { request =>
    def executeApi(): Upload = {
      api.cancelUpload(uploadId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v1/uploads/:uploadId/complete
    * @param uploadId The ID of the Upload. 
    */
  def completeUpload(uploadId: String): Action[AnyContent] = Action { request =>
    def executeApi(): Upload = {
      val completeUploadRequest = request.body.asJson.map(_.as[CompleteUploadRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "completeUploadRequest")
      }
      api.completeUpload(uploadId, completeUploadRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v1/uploads
    */
  def createUpload(): Action[AnyContent] = Action { request =>
    def executeApi(): Upload = {
      val createUploadRequest = request.body.asJson.map(_.as[CreateUploadRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "createUploadRequest")
      }
      api.createUpload(createUploadRequest)
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
