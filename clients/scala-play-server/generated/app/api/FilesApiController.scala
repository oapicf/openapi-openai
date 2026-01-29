package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.DeleteFileResponse
import model.ListFilesResponse
import model.OpenAIFile
import play.api.libs.Files.TemporaryFile

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@Singleton
class FilesApiController @Inject()(cc: ControllerComponents, api: FilesApi) extends AbstractController(cc) {
  /**
    * POST /v1/files
    */
  def createFile(): Action[AnyContent] = Action { request =>
    def executeApi(): OpenAIFile = {
      val file = request.body.asMultipartFormData.flatMap(_.file("file").map(_.ref: TemporaryFile))
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("file", "form")
        }
        
      val purpose = (request.body.asMultipartFormData.map(_.asFormUrlEncoded) orElse request.body.asFormUrlEncoded)
        .flatMap(_.get("purpose"))
        .flatMap(_.headOption)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("purpose", "form")
        }
        
      api.createFile(file, purpose)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * DELETE /v1/files/:fileId
    * @param fileId The ID of the file to use for this request.
    */
  def deleteFile(fileId: String): Action[AnyContent] = Action { request =>
    def executeApi(): DeleteFileResponse = {
      api.deleteFile(fileId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v1/files/:fileId/content
    * @param fileId The ID of the file to use for this request.
    */
  def downloadFile(fileId: String): Action[AnyContent] = Action { request =>
    def executeApi(): String = {
      api.downloadFile(fileId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v1/files?purpose=[value]
    */
  def listFiles(): Action[AnyContent] = Action { request =>
    def executeApi(): ListFilesResponse = {
      val purpose = request.getQueryString("purpose")
        
      api.listFiles(purpose)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v1/files/:fileId
    * @param fileId The ID of the file to use for this request.
    */
  def retrieveFile(fileId: String): Action[AnyContent] = Action { request =>
    def executeApi(): OpenAIFile = {
      api.retrieveFile(fileId)
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
