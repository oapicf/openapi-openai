package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BigDecimal
import model.CreateChatCompletionRequest
import model.CreateChatCompletionResponse
import model.CreateCompletionRequest
import model.CreateCompletionResponse
import model.CreateEditRequest
import model.CreateEditResponse
import model.CreateEmbeddingRequest
import model.CreateEmbeddingResponse
import model.CreateFineTuneRequest
import model.CreateImageRequest
import model.CreateModerationRequest
import model.CreateModerationResponse
import model.CreateTranscriptionRequestModel
import model.CreateTranscriptionResponse
import model.CreateTranslationResponse
import model.DeleteFileResponse
import model.DeleteModelResponse
import model.FineTune
import model.ImagesResponse
import model.ListFilesResponse
import model.ListFineTuneEventsResponse
import model.ListFineTunesResponse
import model.ListModelsResponse
import model.Model
import model.OpenAIFile
import play.api.libs.Files.TemporaryFile

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-16T01:17:28.392125286Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Singleton
class OpenAIApiController @Inject()(cc: ControllerComponents, api: OpenAIApi) extends AbstractController(cc) {
  /**
    * POST /v1/fine-tunes/:fineTuneId/cancel
    * @param fineTuneId The ID of the fine-tune job to cancel 
    */
  def cancelFineTune(fineTuneId: String): Action[AnyContent] = Action { request =>
    def executeApi(): FineTune = {
      api.cancelFineTune(fineTuneId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

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

  /**
    * POST /v1/edits
    */
  def createEdit(): Action[AnyContent] = Action { request =>
    def executeApi(): CreateEditResponse = {
      val createEditRequest = request.body.asJson.map(_.as[CreateEditRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "createEditRequest")
      }
      api.createEdit(createEditRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

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
    * POST /v1/fine-tunes
    */
  def createFineTune(): Action[AnyContent] = Action { request =>
    def executeApi(): FineTune = {
      val createFineTuneRequest = request.body.asJson.map(_.as[CreateFineTuneRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "createFineTuneRequest")
      }
      api.createFineTune(createFineTuneRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

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
        
      val mask = request.body.asMultipartFormData.flatMap(_.file("mask").map(_.ref: TemporaryFile))
        
      val prompt = (request.body.asMultipartFormData.map(_.asFormUrlEncoded) orElse request.body.asFormUrlEncoded)
        .flatMap(_.get("prompt"))
        .flatMap(_.headOption)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("prompt", "form")
        }
        
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
        
      api.createImageEdit(image, prompt, mask, n, size, responseFormat, user)
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
        
      api.createImageVariation(image, n, size, responseFormat, user)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

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

  /**
    * POST /v1/audio/transcriptions
    */
  def createTranscription(): Action[AnyContent] = Action { request =>
    def executeApi(): CreateTranscriptionResponse = {
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
        
      val language = (request.body.asMultipartFormData.map(_.asFormUrlEncoded) orElse request.body.asFormUrlEncoded)
        .flatMap(_.get("language"))
        .flatMap(_.headOption)
        
      api.createTranscription(file, model, prompt, responseFormat, temperature, language)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v1/audio/translations
    */
  def createTranslation(): Action[AnyContent] = Action { request =>
    def executeApi(): CreateTranslationResponse = {
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

  /**
    * DELETE /v1/files/:fileId
    * @param fileId The ID of the file to use for this request
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
    * GET /v1/files/:fileId/content
    * @param fileId The ID of the file to use for this request
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
    * GET /v1/files
    */
  def listFiles(): Action[AnyContent] = Action { request =>
    def executeApi(): ListFilesResponse = {
      api.listFiles()
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v1/fine-tunes/:fineTuneId/events?stream=[value]
    * @param fineTuneId The ID of the fine-tune job to get events for. 
    */
  def listFineTuneEvents(fineTuneId: String): Action[AnyContent] = Action { request =>
    def executeApi(): ListFineTuneEventsResponse = {
      val stream = request.getQueryString("stream")
        .map(value => value.toBoolean)
        
      api.listFineTuneEvents(fineTuneId, stream)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v1/fine-tunes
    */
  def listFineTunes(): Action[AnyContent] = Action { request =>
    def executeApi(): ListFineTunesResponse = {
      api.listFineTunes()
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
    * GET /v1/files/:fileId
    * @param fileId The ID of the file to use for this request
    */
  def retrieveFile(fileId: String): Action[AnyContent] = Action { request =>
    def executeApi(): OpenAIFile = {
      api.retrieveFile(fileId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v1/fine-tunes/:fineTuneId
    * @param fineTuneId The ID of the fine-tune job 
    */
  def retrieveFineTune(fineTuneId: String): Action[AnyContent] = Action { request =>
    def executeApi(): FineTune = {
      api.retrieveFineTune(fineTuneId)
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
