package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.StringDirectives
import org.openapitools.server.MultipartDirectives
import org.openapitools.server.FileField
import org.openapitools.server.PartsAndFiles
import org.openapitools.server.model.CreateChatCompletionRequest
import org.openapitools.server.model.CreateChatCompletionResponse
import org.openapitools.server.model.CreateCompletionRequest
import org.openapitools.server.model.CreateCompletionResponse
import org.openapitools.server.model.CreateEditRequest
import org.openapitools.server.model.CreateEditResponse
import org.openapitools.server.model.CreateEmbeddingRequest
import org.openapitools.server.model.CreateEmbeddingResponse
import org.openapitools.server.model.CreateFineTuneRequest
import org.openapitools.server.model.CreateImageRequest
import org.openapitools.server.model.CreateModerationRequest
import org.openapitools.server.model.CreateModerationResponse
import org.openapitools.server.model.CreateTranscriptionRequestModel
import org.openapitools.server.model.CreateTranscriptionResponse
import org.openapitools.server.model.CreateTranslationResponse
import org.openapitools.server.model.DeleteFileResponse
import org.openapitools.server.model.DeleteModelResponse
import java.io.File
import org.openapitools.server.model.FineTune
import org.openapitools.server.model.ImagesResponse
import org.openapitools.server.model.ListFilesResponse
import org.openapitools.server.model.ListFineTuneEventsResponse
import org.openapitools.server.model.ListFineTunesResponse
import org.openapitools.server.model.ListModelsResponse
import org.openapitools.server.model.Model
import org.openapitools.server.model.OpenAIFile
import scala.util.Try
import akka.http.scaladsl.server.MalformedRequestContentRejection
import akka.http.scaladsl.server.directives.FileInfo


class OpenAIApi(
    openAIService: OpenAIApiService,
    openAIMarshaller: OpenAIApiMarshaller
)  extends MultipartDirectives with StringDirectives {

  
  import openAIMarshaller._

  lazy val route: Route =
    path("fine-tunes" / Segment / "cancel") { (fineTuneId) => 
      post {  
            openAIService.cancelFineTune(fineTuneId = fineTuneId)
      }
    } ~
    path("chat" / "completions") { 
      post {  
            entity(as[CreateChatCompletionRequest]){ createChatCompletionRequest =>
              openAIService.createChatCompletion(createChatCompletionRequest = createChatCompletionRequest)
            }
      }
    } ~
    path("completions") { 
      post {  
            entity(as[CreateCompletionRequest]){ createCompletionRequest =>
              openAIService.createCompletion(createCompletionRequest = createCompletionRequest)
            }
      }
    } ~
    path("edits") { 
      post {  
            entity(as[CreateEditRequest]){ createEditRequest =>
              openAIService.createEdit(createEditRequest = createEditRequest)
            }
      }
    } ~
    path("embeddings") { 
      post {  
            entity(as[CreateEmbeddingRequest]){ createEmbeddingRequest =>
              openAIService.createEmbedding(createEmbeddingRequest = createEmbeddingRequest)
            }
      }
    } ~
    path("files") { 
      post {  
        formAndFiles(FileField("file")),  { partsAndFiles => 
          val _____ : Try[Route] = for {
            file <- optToTry(partsAndFiles.files.get("file"), s"File file missing")
          } yield { 
            implicit val vp: StringValueProvider = partsAndFiles.form
            stringFields("purpose".as[String]) { (purpose) =>
              openAIService.createFile(file = file, purpose = purpose)
            }
          }
          _____.fold[Route](t => reject(MalformedRequestContentRejection("Missing file.", t)), identity)
        }
      }
    } ~
    path("fine-tunes") { 
      post {  
            entity(as[CreateFineTuneRequest]){ createFineTuneRequest =>
              openAIService.createFineTune(createFineTuneRequest = createFineTuneRequest)
            }
      }
    } ~
    path("images" / "generations") { 
      post {  
            entity(as[CreateImageRequest]){ createImageRequest =>
              openAIService.createImage(createImageRequest = createImageRequest)
            }
      }
    } ~
    path("images" / "edits") { 
      post {  
        formAndFiles(FileField("image"))FileField("mask")),  { partsAndFiles => 
          val _____ : Try[Route] = for {
            image <- optToTry(partsAndFiles.files.get("image"), s"File image missing")
mask <- optToTry(partsAndFiles.files.get("mask"), s"File mask missing")
          } yield { 
            implicit val vp: StringValueProvider = partsAndFiles.form
            stringFields("prompt".as[String], "n".as[Int].?, "size".as[String].?, "response_format".as[String].?, "user".as[String].?) { (prompt, n, size, responseFormat, user) =>
              openAIService.createImageEdit(image = image, prompt = prompt, mask = mask, n = n, size = size, responseFormat = responseFormat, user = user)
            }
          }
          _____.fold[Route](t => reject(MalformedRequestContentRejection("Missing file.", t)), identity)
        }
      }
    } ~
    path("images" / "variations") { 
      post {  
        formAndFiles(FileField("image")),  { partsAndFiles => 
          val _____ : Try[Route] = for {
            image <- optToTry(partsAndFiles.files.get("image"), s"File image missing")
          } yield { 
            implicit val vp: StringValueProvider = partsAndFiles.form
            stringFields("n".as[Int].?, "size".as[String].?, "response_format".as[String].?, "user".as[String].?) { (n, size, responseFormat, user) =>
              openAIService.createImageVariation(image = image, n = n, size = size, responseFormat = responseFormat, user = user)
            }
          }
          _____.fold[Route](t => reject(MalformedRequestContentRejection("Missing file.", t)), identity)
        }
      }
    } ~
    path("moderations") { 
      post {  
            entity(as[CreateModerationRequest]){ createModerationRequest =>
              openAIService.createModeration(createModerationRequest = createModerationRequest)
            }
      }
    } ~
    path("audio" / "transcriptions") { 
      post {  
        formAndFiles(FileField("file")),  { partsAndFiles => 
          val _____ : Try[Route] = for {
            file <- optToTry(partsAndFiles.files.get("file"), s"File file missing")
          } yield { 
            implicit val vp: StringValueProvider = partsAndFiles.form
            stringFields("model".as[CreateTranscriptionRequestModel], "prompt".as[String].?, "response_format".as[String].?, "temperature".as[Double].?, "language".as[String].?) { (model, prompt, responseFormat, temperature, language) =>
              openAIService.createTranscription(file = file, model = model, prompt = prompt, responseFormat = responseFormat, temperature = temperature, language = language)
            }
          }
          _____.fold[Route](t => reject(MalformedRequestContentRejection("Missing file.", t)), identity)
        }
      }
    } ~
    path("audio" / "translations") { 
      post {  
        formAndFiles(FileField("file")),  { partsAndFiles => 
          val _____ : Try[Route] = for {
            file <- optToTry(partsAndFiles.files.get("file"), s"File file missing")
          } yield { 
            implicit val vp: StringValueProvider = partsAndFiles.form
            stringFields("model".as[CreateTranscriptionRequestModel], "prompt".as[String].?, "response_format".as[String].?, "temperature".as[Double].?) { (model, prompt, responseFormat, temperature) =>
              openAIService.createTranslation(file = file, model = model, prompt = prompt, responseFormat = responseFormat, temperature = temperature)
            }
          }
          _____.fold[Route](t => reject(MalformedRequestContentRejection("Missing file.", t)), identity)
        }
      }
    } ~
    path("files" / Segment) { (fileId) => 
      delete {  
            openAIService.deleteFile(fileId = fileId)
      }
    } ~
    path("models" / Segment) { (model) => 
      delete {  
            openAIService.deleteModel(model = model)
      }
    } ~
    path("files" / Segment / "content") { (fileId) => 
      get {  
            openAIService.downloadFile(fileId = fileId)
      }
    } ~
    path("files") { 
      get {  
            openAIService.listFiles()
      }
    } ~
    path("fine-tunes" / Segment / "events") { (fineTuneId) => 
      get { 
        parameters("stream".as[Boolean].?(false)) { (stream) => 
            openAIService.listFineTuneEvents(fineTuneId = fineTuneId, stream = stream)
        }
      }
    } ~
    path("fine-tunes") { 
      get {  
            openAIService.listFineTunes()
      }
    } ~
    path("models") { 
      get {  
            openAIService.listModels()
      }
    } ~
    path("files" / Segment) { (fileId) => 
      get {  
            openAIService.retrieveFile(fileId = fileId)
      }
    } ~
    path("fine-tunes" / Segment) { (fineTuneId) => 
      get {  
            openAIService.retrieveFineTune(fineTuneId = fineTuneId)
      }
    } ~
    path("models" / Segment) { (model) => 
      get {  
            openAIService.retrieveModel(model = model)
      }
    }
}


trait OpenAIApiService {

  def cancelFineTune200(responseFineTune: FineTune)(implicit toEntityMarshallerFineTune: ToEntityMarshaller[FineTune]): Route =
    complete((200, responseFineTune))
  /**
   * Code: 200, Message: OK, DataType: FineTune
   */
  def cancelFineTune(fineTuneId: String)
      (implicit toEntityMarshallerFineTune: ToEntityMarshaller[FineTune]): Route

  def createChatCompletion200(responseCreateChatCompletionResponse: CreateChatCompletionResponse)(implicit toEntityMarshallerCreateChatCompletionResponse: ToEntityMarshaller[CreateChatCompletionResponse]): Route =
    complete((200, responseCreateChatCompletionResponse))
  /**
   * Code: 200, Message: OK, DataType: CreateChatCompletionResponse
   */
  def createChatCompletion(createChatCompletionRequest: CreateChatCompletionRequest)
      (implicit toEntityMarshallerCreateChatCompletionResponse: ToEntityMarshaller[CreateChatCompletionResponse]): Route

  def createCompletion200(responseCreateCompletionResponse: CreateCompletionResponse)(implicit toEntityMarshallerCreateCompletionResponse: ToEntityMarshaller[CreateCompletionResponse]): Route =
    complete((200, responseCreateCompletionResponse))
  /**
   * Code: 200, Message: OK, DataType: CreateCompletionResponse
   */
  def createCompletion(createCompletionRequest: CreateCompletionRequest)
      (implicit toEntityMarshallerCreateCompletionResponse: ToEntityMarshaller[CreateCompletionResponse]): Route

  def createEdit200(responseCreateEditResponse: CreateEditResponse)(implicit toEntityMarshallerCreateEditResponse: ToEntityMarshaller[CreateEditResponse]): Route =
    complete((200, responseCreateEditResponse))
  /**
   * Code: 200, Message: OK, DataType: CreateEditResponse
   */
  def createEdit(createEditRequest: CreateEditRequest)
      (implicit toEntityMarshallerCreateEditResponse: ToEntityMarshaller[CreateEditResponse]): Route

  def createEmbedding200(responseCreateEmbeddingResponse: CreateEmbeddingResponse)(implicit toEntityMarshallerCreateEmbeddingResponse: ToEntityMarshaller[CreateEmbeddingResponse]): Route =
    complete((200, responseCreateEmbeddingResponse))
  /**
   * Code: 200, Message: OK, DataType: CreateEmbeddingResponse
   */
  def createEmbedding(createEmbeddingRequest: CreateEmbeddingRequest)
      (implicit toEntityMarshallerCreateEmbeddingResponse: ToEntityMarshaller[CreateEmbeddingResponse]): Route

  def createFile200(responseOpenAIFile: OpenAIFile)(implicit toEntityMarshallerOpenAIFile: ToEntityMarshaller[OpenAIFile]): Route =
    complete((200, responseOpenAIFile))
  /**
   * Code: 200, Message: OK, DataType: OpenAIFile
   */
  def createFile(file: (FileInfo, File), purpose: String)
      (implicit toEntityMarshallerOpenAIFile: ToEntityMarshaller[OpenAIFile]): Route

  def createFineTune200(responseFineTune: FineTune)(implicit toEntityMarshallerFineTune: ToEntityMarshaller[FineTune]): Route =
    complete((200, responseFineTune))
  /**
   * Code: 200, Message: OK, DataType: FineTune
   */
  def createFineTune(createFineTuneRequest: CreateFineTuneRequest)
      (implicit toEntityMarshallerFineTune: ToEntityMarshaller[FineTune]): Route

  def createImage200(responseImagesResponse: ImagesResponse)(implicit toEntityMarshallerImagesResponse: ToEntityMarshaller[ImagesResponse]): Route =
    complete((200, responseImagesResponse))
  /**
   * Code: 200, Message: OK, DataType: ImagesResponse
   */
  def createImage(createImageRequest: CreateImageRequest)
      (implicit toEntityMarshallerImagesResponse: ToEntityMarshaller[ImagesResponse]): Route

  def createImageEdit200(responseImagesResponse: ImagesResponse)(implicit toEntityMarshallerImagesResponse: ToEntityMarshaller[ImagesResponse]): Route =
    complete((200, responseImagesResponse))
  /**
   * Code: 200, Message: OK, DataType: ImagesResponse
   */
  def createImageEdit(image: (FileInfo, File), prompt: String, mask: (FileInfo, File), n: Option[Int], size: Option[String], responseFormat: Option[String], user: Option[String])
      (implicit toEntityMarshallerImagesResponse: ToEntityMarshaller[ImagesResponse]): Route

  def createImageVariation200(responseImagesResponse: ImagesResponse)(implicit toEntityMarshallerImagesResponse: ToEntityMarshaller[ImagesResponse]): Route =
    complete((200, responseImagesResponse))
  /**
   * Code: 200, Message: OK, DataType: ImagesResponse
   */
  def createImageVariation(image: (FileInfo, File), n: Option[Int], size: Option[String], responseFormat: Option[String], user: Option[String])
      (implicit toEntityMarshallerImagesResponse: ToEntityMarshaller[ImagesResponse]): Route

  def createModeration200(responseCreateModerationResponse: CreateModerationResponse)(implicit toEntityMarshallerCreateModerationResponse: ToEntityMarshaller[CreateModerationResponse]): Route =
    complete((200, responseCreateModerationResponse))
  /**
   * Code: 200, Message: OK, DataType: CreateModerationResponse
   */
  def createModeration(createModerationRequest: CreateModerationRequest)
      (implicit toEntityMarshallerCreateModerationResponse: ToEntityMarshaller[CreateModerationResponse]): Route

  def createTranscription200(responseCreateTranscriptionResponse: CreateTranscriptionResponse)(implicit toEntityMarshallerCreateTranscriptionResponse: ToEntityMarshaller[CreateTranscriptionResponse]): Route =
    complete((200, responseCreateTranscriptionResponse))
  /**
   * Code: 200, Message: OK, DataType: CreateTranscriptionResponse
   */
  def createTranscription(file: (FileInfo, File), model: CreateTranscriptionRequestModel, prompt: Option[String], responseFormat: Option[String], temperature: Option[Double], language: Option[String])
      (implicit toEntityMarshallerCreateTranscriptionResponse: ToEntityMarshaller[CreateTranscriptionResponse]): Route

  def createTranslation200(responseCreateTranslationResponse: CreateTranslationResponse)(implicit toEntityMarshallerCreateTranslationResponse: ToEntityMarshaller[CreateTranslationResponse]): Route =
    complete((200, responseCreateTranslationResponse))
  /**
   * Code: 200, Message: OK, DataType: CreateTranslationResponse
   */
  def createTranslation(file: (FileInfo, File), model: CreateTranscriptionRequestModel, prompt: Option[String], responseFormat: Option[String], temperature: Option[Double])
      (implicit toEntityMarshallerCreateTranslationResponse: ToEntityMarshaller[CreateTranslationResponse]): Route

  def deleteFile200(responseDeleteFileResponse: DeleteFileResponse)(implicit toEntityMarshallerDeleteFileResponse: ToEntityMarshaller[DeleteFileResponse]): Route =
    complete((200, responseDeleteFileResponse))
  /**
   * Code: 200, Message: OK, DataType: DeleteFileResponse
   */
  def deleteFile(fileId: String)
      (implicit toEntityMarshallerDeleteFileResponse: ToEntityMarshaller[DeleteFileResponse]): Route

  def deleteModel200(responseDeleteModelResponse: DeleteModelResponse)(implicit toEntityMarshallerDeleteModelResponse: ToEntityMarshaller[DeleteModelResponse]): Route =
    complete((200, responseDeleteModelResponse))
  /**
   * Code: 200, Message: OK, DataType: DeleteModelResponse
   */
  def deleteModel(model: String)
      (implicit toEntityMarshallerDeleteModelResponse: ToEntityMarshaller[DeleteModelResponse]): Route

  def downloadFile200(responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((200, responseString))
  /**
   * Code: 200, Message: OK, DataType: String
   */
  def downloadFile(fileId: String): Route

  def listFiles200(responseListFilesResponse: ListFilesResponse)(implicit toEntityMarshallerListFilesResponse: ToEntityMarshaller[ListFilesResponse]): Route =
    complete((200, responseListFilesResponse))
  /**
   * Code: 200, Message: OK, DataType: ListFilesResponse
   */
  def listFiles()
      (implicit toEntityMarshallerListFilesResponse: ToEntityMarshaller[ListFilesResponse]): Route

  def listFineTuneEvents200(responseListFineTuneEventsResponse: ListFineTuneEventsResponse)(implicit toEntityMarshallerListFineTuneEventsResponse: ToEntityMarshaller[ListFineTuneEventsResponse]): Route =
    complete((200, responseListFineTuneEventsResponse))
  /**
   * Code: 200, Message: OK, DataType: ListFineTuneEventsResponse
   */
  def listFineTuneEvents(fineTuneId: String, stream: Boolean)
      (implicit toEntityMarshallerListFineTuneEventsResponse: ToEntityMarshaller[ListFineTuneEventsResponse]): Route

  def listFineTunes200(responseListFineTunesResponse: ListFineTunesResponse)(implicit toEntityMarshallerListFineTunesResponse: ToEntityMarshaller[ListFineTunesResponse]): Route =
    complete((200, responseListFineTunesResponse))
  /**
   * Code: 200, Message: OK, DataType: ListFineTunesResponse
   */
  def listFineTunes()
      (implicit toEntityMarshallerListFineTunesResponse: ToEntityMarshaller[ListFineTunesResponse]): Route

  def listModels200(responseListModelsResponse: ListModelsResponse)(implicit toEntityMarshallerListModelsResponse: ToEntityMarshaller[ListModelsResponse]): Route =
    complete((200, responseListModelsResponse))
  /**
   * Code: 200, Message: OK, DataType: ListModelsResponse
   */
  def listModels()
      (implicit toEntityMarshallerListModelsResponse: ToEntityMarshaller[ListModelsResponse]): Route

  def retrieveFile200(responseOpenAIFile: OpenAIFile)(implicit toEntityMarshallerOpenAIFile: ToEntityMarshaller[OpenAIFile]): Route =
    complete((200, responseOpenAIFile))
  /**
   * Code: 200, Message: OK, DataType: OpenAIFile
   */
  def retrieveFile(fileId: String)
      (implicit toEntityMarshallerOpenAIFile: ToEntityMarshaller[OpenAIFile]): Route

  def retrieveFineTune200(responseFineTune: FineTune)(implicit toEntityMarshallerFineTune: ToEntityMarshaller[FineTune]): Route =
    complete((200, responseFineTune))
  /**
   * Code: 200, Message: OK, DataType: FineTune
   */
  def retrieveFineTune(fineTuneId: String)
      (implicit toEntityMarshallerFineTune: ToEntityMarshaller[FineTune]): Route

  def retrieveModel200(responseModel: Model)(implicit toEntityMarshallerModel: ToEntityMarshaller[Model]): Route =
    complete((200, responseModel))
  /**
   * Code: 200, Message: OK, DataType: Model
   */
  def retrieveModel(model: String)
      (implicit toEntityMarshallerModel: ToEntityMarshaller[Model]): Route

}

trait OpenAIApiMarshaller {
  implicit def fromEntityUnmarshallerCreateEditRequest: FromEntityUnmarshaller[CreateEditRequest]

  implicit def fromEntityUnmarshallerCreateFineTuneRequest: FromEntityUnmarshaller[CreateFineTuneRequest]

  implicit def fromEntityUnmarshallerCreateEmbeddingRequest: FromEntityUnmarshaller[CreateEmbeddingRequest]

  implicit def fromEntityUnmarshallerCreateModerationRequest: FromEntityUnmarshaller[CreateModerationRequest]

  implicit def fromEntityUnmarshallerCreateImageRequest: FromEntityUnmarshaller[CreateImageRequest]

  implicit def fromEntityUnmarshallerCreateChatCompletionRequest: FromEntityUnmarshaller[CreateChatCompletionRequest]

  implicit def fromEntityUnmarshallerCreateCompletionRequest: FromEntityUnmarshaller[CreateCompletionRequest]


  implicit def fromStringUnmarshallerCreateTranscriptionRequestModel: FromStringUnmarshaller[CreateTranscriptionRequestModel]


  implicit def toEntityMarshallerCreateTranscriptionResponse: ToEntityMarshaller[CreateTranscriptionResponse]

  implicit def toEntityMarshallerModel: ToEntityMarshaller[Model]

  implicit def toEntityMarshallerCreateChatCompletionResponse: ToEntityMarshaller[CreateChatCompletionResponse]

  implicit def toEntityMarshallerListFineTuneEventsResponse: ToEntityMarshaller[ListFineTuneEventsResponse]

  implicit def toEntityMarshallerCreateEditResponse: ToEntityMarshaller[CreateEditResponse]

  implicit def toEntityMarshallerCreateCompletionResponse: ToEntityMarshaller[CreateCompletionResponse]

  implicit def toEntityMarshallerDeleteModelResponse: ToEntityMarshaller[DeleteModelResponse]

  implicit def toEntityMarshallerCreateEmbeddingResponse: ToEntityMarshaller[CreateEmbeddingResponse]

  implicit def toEntityMarshallerDeleteFileResponse: ToEntityMarshaller[DeleteFileResponse]

  implicit def toEntityMarshallerCreateModerationResponse: ToEntityMarshaller[CreateModerationResponse]

  implicit def toEntityMarshallerListFineTunesResponse: ToEntityMarshaller[ListFineTunesResponse]

  implicit def toEntityMarshallerListModelsResponse: ToEntityMarshaller[ListModelsResponse]

  implicit def toEntityMarshallerCreateTranslationResponse: ToEntityMarshaller[CreateTranslationResponse]

  implicit def toEntityMarshallerImagesResponse: ToEntityMarshaller[ImagesResponse]

  implicit def toEntityMarshallerOpenAIFile: ToEntityMarshaller[OpenAIFile]

  implicit def toEntityMarshallerFineTune: ToEntityMarshaller[FineTune]

  implicit def toEntityMarshallerListFilesResponse: ToEntityMarshaller[ListFilesResponse]

}

