package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.CreateImageEditRequestModel
import model.CreateImageRequest
import model.ImagesResponse
import play.api.libs.Files.TemporaryFile

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@Singleton
class ImagesApiController @Inject()(cc: ControllerComponents, api: ImagesApi) extends AbstractController(cc) {
  /**
    * POST /v1/images/generations
    */
  def createImage(): Action[AnyContent] = Action { request =>
    def executeApi(): ImagesResponse = {
      val createImageRequest = request.body.asJson.map(_.as[CreateImageRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "createImageRequest")
      }
      api.createImage(createImageRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v1/images/edits
    */
  def createImageEdit(): Action[AnyContent] = Action { request =>
    def executeApi(): ImagesResponse = {
      val image = request.body.asMultipartFormData.flatMap(_.file("image").map(_.ref: TemporaryFile))
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("image", "form")
        }
        
      val prompt = (request.body.asMultipartFormData.map(_.asFormUrlEncoded) orElse request.body.asFormUrlEncoded)
        .flatMap(_.get("prompt"))
        .flatMap(_.headOption)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("prompt", "form")
        }
        
      val mask = request.body.asMultipartFormData.flatMap(_.file("mask").map(_.ref: TemporaryFile))
        
      val model = (request.body.asMultipartFormData.map(_.asFormUrlEncoded) orElse request.body.asFormUrlEncoded)
        .flatMap(_.get("model"))
        .flatMap(_.headOption)
        .map(value => )
        
      val n = (request.body.asMultipartFormData.map(_.asFormUrlEncoded) orElse request.body.asFormUrlEncoded)
        .flatMap(_.get("n"))
        .flatMap(_.headOption)
        .map(value => value.toInt)
        
      val size = (request.body.asMultipartFormData.map(_.asFormUrlEncoded) orElse request.body.asFormUrlEncoded)
        .flatMap(_.get("size"))
        .flatMap(_.headOption)
        
      val responseFormat = (request.body.asMultipartFormData.map(_.asFormUrlEncoded) orElse request.body.asFormUrlEncoded)
        .flatMap(_.get("response_format"))
        .flatMap(_.headOption)
        
      val user = (request.body.asMultipartFormData.map(_.asFormUrlEncoded) orElse request.body.asFormUrlEncoded)
        .flatMap(_.get("user"))
        .flatMap(_.headOption)
        
      api.createImageEdit(image, prompt, mask, model, n, size, responseFormat, user)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v1/images/variations
    */
  def createImageVariation(): Action[AnyContent] = Action { request =>
    def executeApi(): ImagesResponse = {
      val image = request.body.asMultipartFormData.flatMap(_.file("image").map(_.ref: TemporaryFile))
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("image", "form")
        }
        
      val model = (request.body.asMultipartFormData.map(_.asFormUrlEncoded) orElse request.body.asFormUrlEncoded)
        .flatMap(_.get("model"))
        .flatMap(_.headOption)
        .map(value => )
        
      val n = (request.body.asMultipartFormData.map(_.asFormUrlEncoded) orElse request.body.asFormUrlEncoded)
        .flatMap(_.get("n"))
        .flatMap(_.headOption)
        .map(value => value.toInt)
        
      val responseFormat = (request.body.asMultipartFormData.map(_.asFormUrlEncoded) orElse request.body.asFormUrlEncoded)
        .flatMap(_.get("response_format"))
        .flatMap(_.headOption)
        
      val size = (request.body.asMultipartFormData.map(_.asFormUrlEncoded) orElse request.body.asFormUrlEncoded)
        .flatMap(_.get("size"))
        .flatMap(_.headOption)
        
      val user = (request.body.asMultipartFormData.map(_.asFormUrlEncoded) orElse request.body.asFormUrlEncoded)
        .flatMap(_.get("user"))
        .flatMap(_.headOption)
        
      api.createImageVariation(image, model, n, responseFormat, size, user)
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
