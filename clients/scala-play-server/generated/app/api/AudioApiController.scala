package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BigDecimal
import model.CreateSpeechRequest
import model.CreateTranscription200Response
import model.CreateTranscriptionRequestModel
import model.CreateTranslation200Response
import play.api.libs.Files.TemporaryFile

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Singleton
class AudioApiController @Inject()(cc: ControllerComponents, api: AudioApi) extends AbstractController(cc) {
  /**
    * POST /v1/audio/speech
    */
  def createSpeech(): Action[AnyContent] = Action { request =>
    def executeApi(): TemporaryFile = {
      val createSpeechRequest = request.body.asJson.map(_.as[CreateSpeechRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "createSpeechRequest")
      }
      api.createSpeech(createSpeechRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v1/audio/transcriptions
    */
  def createTranscription(): Action[AnyContent] = Action { request =>
    def executeApi(): CreateTranscription200Response = {
      val file = request.body.asMultipartFormData.flatMap(_.file("file").map(_.ref: TemporaryFile))
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("file", "form")
        }
        
      val model = (request.body.asMultipartFormData.map(_.asFormUrlEncoded) orElse request.body.asFormUrlEncoded)
        .flatMap(_.get("model"))
        .flatMap(_.headOption)
        .map(value => )
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("model", "form")
        }
        
      val language = (request.body.asMultipartFormData.map(_.asFormUrlEncoded) orElse request.body.asFormUrlEncoded)
        .flatMap(_.get("language"))
        .flatMap(_.headOption)
        
      val prompt = (request.body.asMultipartFormData.map(_.asFormUrlEncoded) orElse request.body.asFormUrlEncoded)
        .flatMap(_.get("prompt"))
        .flatMap(_.headOption)
        
      val responseFormat = (request.body.asMultipartFormData.map(_.asFormUrlEncoded) orElse request.body.asFormUrlEncoded)
        .flatMap(_.get("response_format"))
        .flatMap(_.headOption)
        
      val temperature = (request.body.asMultipartFormData.map(_.asFormUrlEncoded) orElse request.body.asFormUrlEncoded)
        .flatMap(_.get("temperature"))
        .flatMap(_.headOption)
        .map(value => BigDecimal(value))
        
      val timestampGranularitiesLeft_Square_BracketRight_Square_Bracket = (request.body.asMultipartFormData.map(_.asFormUrlEncoded) orElse request.body.asFormUrlEncoded)
        .flatMap(_.get("timestamp_granularities[]"))
        .flatMap(_.headOption)
        .map(values => splitCollectionParam(values, "csv"))
        
      api.createTranscription(file, model, language, prompt, responseFormat, temperature, timestampGranularitiesLeft_Square_BracketRight_Square_Bracket)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v1/audio/translations
    */
  def createTranslation(): Action[AnyContent] = Action { request =>
    def executeApi(): CreateTranslation200Response = {
      val file = request.body.asMultipartFormData.flatMap(_.file("file").map(_.ref: TemporaryFile))
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("file", "form")
        }
        
      val model = (request.body.asMultipartFormData.map(_.asFormUrlEncoded) orElse request.body.asFormUrlEncoded)
        .flatMap(_.get("model"))
        .flatMap(_.headOption)
        .map(value => )
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("model", "form")
        }
        
      val prompt = (request.body.asMultipartFormData.map(_.asFormUrlEncoded) orElse request.body.asFormUrlEncoded)
        .flatMap(_.get("prompt"))
        .flatMap(_.headOption)
        
      val responseFormat = (request.body.asMultipartFormData.map(_.asFormUrlEncoded) orElse request.body.asFormUrlEncoded)
        .flatMap(_.get("response_format"))
        .flatMap(_.headOption)
        
      val temperature = (request.body.asMultipartFormData.map(_.asFormUrlEncoded) orElse request.body.asFormUrlEncoded)
        .flatMap(_.get("temperature"))
        .flatMap(_.headOption)
        .map(value => BigDecimal(value))
        
      api.createTranslation(file, model, prompt, responseFormat, temperature)
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
