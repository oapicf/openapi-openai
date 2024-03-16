package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.BigDecimal
import org.openapitools.models.CreateChatCompletionRequest
import org.openapitools.models.CreateChatCompletionResponse
import org.openapitools.models.CreateCompletionRequest
import org.openapitools.models.CreateCompletionResponse
import org.openapitools.models.CreateEditRequest
import org.openapitools.models.CreateEditResponse
import org.openapitools.models.CreateEmbeddingRequest
import org.openapitools.models.CreateEmbeddingResponse
import org.openapitools.models.CreateFineTuneRequest
import org.openapitools.models.CreateImageRequest
import org.openapitools.models.CreateModerationRequest
import org.openapitools.models.CreateModerationResponse
import org.openapitools.models.CreateTranscriptionRequestModel
import org.openapitools.models.CreateTranscriptionResponse
import org.openapitools.models.CreateTranslationResponse
import org.openapitools.models.DeleteFileResponse
import org.openapitools.models.DeleteModelResponse
import java.io.File
import org.openapitools.models.FineTune
import org.openapitools.models.ImagesResponse
import org.openapitools.models.ListFilesResponse
import org.openapitools.models.ListFineTuneEventsResponse
import org.openapitools.models.ListFineTunesResponse
import org.openapitools.models.ListModelsResponse
import org.openapitools.models.Model
import org.openapitools.models.OpenAIFile
import io.finch.circe._
import io.circe.generic.semiauto._
import com.twitter.concurrent.AsyncStream
import com.twitter.finagle.Service
import com.twitter.finagle.Http
import com.twitter.finagle.http.{Request, Response}
import com.twitter.finagle.http.exp.Multipart.{FileUpload, InMemoryFileUpload, OnDiskFileUpload}
import com.twitter.util.Future
import com.twitter.io.Buf
import io.finch._, items._
import java.io.File
import java.nio.file.Files
import java.time._

object OpenAIApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        cancelFineTune(da) :+:
        createChatCompletion(da) :+:
        createCompletion(da) :+:
        createEdit(da) :+:
        createEmbedding(da) :+:
        createFile(da) :+:
        createFineTune(da) :+:
        createImage(da) :+:
        createImageEdit(da) :+:
        createImageVariation(da) :+:
        createModeration(da) :+:
        createTranscription(da) :+:
        createTranslation(da) :+:
        deleteFile(da) :+:
        deleteModel(da) :+:
        downloadFile(da) :+:
        listFiles(da) :+:
        listFineTuneEvents(da) :+:
        listFineTunes(da) :+:
        listModels(da) :+:
        retrieveFile(da) :+:
        retrieveFineTune(da) :+:
        retrieveModel(da)


    private def checkError(e: CommonError) = e match {
      case InvalidInput(_) => BadRequest(e)
      case MissingIdentifier(_) => BadRequest(e)
      case RecordNotFound(_) => NotFound(e)
      case _ => InternalServerError(e)
    }

    implicit class StringOps(s: String) {

      import java.time.format.DateTimeFormatter

      lazy val localformatter: DateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")
      lazy val datetimeformatter: DateTimeFormatter =
      DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ")

      def toLocalDateTime: LocalDateTime = LocalDateTime.parse(s,localformatter)
      def toZonedDateTime: ZonedDateTime = ZonedDateTime.parse(s, datetimeformatter)

    }

        /**
        * 
        * @return An endpoint representing a FineTune
        */
        private def cancelFineTune(da: DataAccessor): Endpoint[FineTune] =
        post("fine-tunes" :: string :: "cancel") { (fineTuneId: String) =>
          da.OpenAI_cancelFineTune(fineTuneId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a CreateChatCompletionResponse
        */
        private def createChatCompletion(da: DataAccessor): Endpoint[CreateChatCompletionResponse] =
        post("chat" :: "completions" :: jsonBody[CreateChatCompletionRequest]) { (createChatCompletionRequest: CreateChatCompletionRequest) =>
          da.OpenAI_createChatCompletion(createChatCompletionRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a CreateCompletionResponse
        */
        private def createCompletion(da: DataAccessor): Endpoint[CreateCompletionResponse] =
        post("completions" :: jsonBody[CreateCompletionRequest]) { (createCompletionRequest: CreateCompletionRequest) =>
          da.OpenAI_createCompletion(createCompletionRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a CreateEditResponse
        */
        private def createEdit(da: DataAccessor): Endpoint[CreateEditResponse] =
        post("edits" :: jsonBody[CreateEditRequest]) { (createEditRequest: CreateEditRequest) =>
          da.OpenAI_createEdit(createEditRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a CreateEmbeddingResponse
        */
        private def createEmbedding(da: DataAccessor): Endpoint[CreateEmbeddingResponse] =
        post("embeddings" :: jsonBody[CreateEmbeddingRequest]) { (createEmbeddingRequest: CreateEmbeddingRequest) =>
          da.OpenAI_createEmbedding(createEmbeddingRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a OpenAIFile
        */
        private def createFile(da: DataAccessor): Endpoint[OpenAIFile] =
        post("files" :: fileUpload("file") :: string) { (file: FileUpload, purpose: String) =>
          da.OpenAI_createFile(file, purpose) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a FineTune
        */
        private def createFineTune(da: DataAccessor): Endpoint[FineTune] =
        post("fine-tunes" :: jsonBody[CreateFineTuneRequest]) { (createFineTuneRequest: CreateFineTuneRequest) =>
          da.OpenAI_createFineTune(createFineTuneRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a ImagesResponse
        */
        private def createImage(da: DataAccessor): Endpoint[ImagesResponse] =
        post("images" :: "generations" :: jsonBody[CreateImageRequest]) { (createImageRequest: CreateImageRequest) =>
          da.OpenAI_createImage(createImageRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a ImagesResponse
        */
        private def createImageEdit(da: DataAccessor): Endpoint[ImagesResponse] =
        post("images" :: "edits" :: fileUpload("image") :: string :: fileUpload("mask") :: paramOption("n").map(_.map(_.toInt)) :: paramOption("size") :: paramOption("response_format") :: paramOption("user")) { (image: FileUpload, prompt: String, mask: FileUpload, n: Option[Int], size: Option[String], responseFormat: Option[String], user: Option[String]) =>
          da.OpenAI_createImageEdit(image, prompt, mask, n, size, responseFormat, user) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a ImagesResponse
        */
        private def createImageVariation(da: DataAccessor): Endpoint[ImagesResponse] =
        post("images" :: "variations" :: fileUpload("image") :: paramOption("n").map(_.map(_.toInt)) :: paramOption("size") :: paramOption("response_format") :: paramOption("user")) { (image: FileUpload, n: Option[Int], size: Option[String], responseFormat: Option[String], user: Option[String]) =>
          da.OpenAI_createImageVariation(image, n, size, responseFormat, user) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a CreateModerationResponse
        */
        private def createModeration(da: DataAccessor): Endpoint[CreateModerationResponse] =
        post("moderations" :: jsonBody[CreateModerationRequest]) { (createModerationRequest: CreateModerationRequest) =>
          da.OpenAI_createModeration(createModerationRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a CreateTranscriptionResponse
        */
        private def createTranscription(da: DataAccessor): Endpoint[CreateTranscriptionResponse] =
        post("audio" :: "transcriptions" :: fileUpload("file") :: paramOption("prompt") :: paramOption("response_format") :: paramOption("temperature").map(_.map(_.toBigDecimal)) :: paramOption("language")) { (file: FileUpload, model: CreateTranscriptionRequestModel, prompt: Option[String], responseFormat: Option[String], temperature: Option[BigDecimal], language: Option[String]) =>
          da.OpenAI_createTranscription(file, model, prompt, responseFormat, temperature, language) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a CreateTranslationResponse
        */
        private def createTranslation(da: DataAccessor): Endpoint[CreateTranslationResponse] =
        post("audio" :: "translations" :: fileUpload("file") :: paramOption("prompt") :: paramOption("response_format") :: paramOption("temperature").map(_.map(_.toBigDecimal))) { (file: FileUpload, model: CreateTranscriptionRequestModel, prompt: Option[String], responseFormat: Option[String], temperature: Option[BigDecimal]) =>
          da.OpenAI_createTranslation(file, model, prompt, responseFormat, temperature) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a DeleteFileResponse
        */
        private def deleteFile(da: DataAccessor): Endpoint[DeleteFileResponse] =
        delete("files" :: string) { (fileId: String) =>
          da.OpenAI_deleteFile(fileId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a DeleteModelResponse
        */
        private def deleteModel(da: DataAccessor): Endpoint[DeleteModelResponse] =
        delete("models" :: string) { (model: String) =>
          da.OpenAI_deleteModel(model) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a String
        */
        private def downloadFile(da: DataAccessor): Endpoint[String] =
        get("files" :: string :: "content") { (fileId: String) =>
          da.OpenAI_downloadFile(fileId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a ListFilesResponse
        */
        private def listFiles(da: DataAccessor): Endpoint[ListFilesResponse] =
        get("files") { () =>
          da.OpenAI_listFiles() match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a ListFineTuneEventsResponse
        */
        private def listFineTuneEvents(da: DataAccessor): Endpoint[ListFineTuneEventsResponse] =
        get("fine-tunes" :: string :: "events" :: paramOption("stream").map(_.map(_.toBoolean))) { (fineTuneId: String, stream: Option[Boolean]) =>
          da.OpenAI_listFineTuneEvents(fineTuneId, stream) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a ListFineTunesResponse
        */
        private def listFineTunes(da: DataAccessor): Endpoint[ListFineTunesResponse] =
        get("fine-tunes") { () =>
          da.OpenAI_listFineTunes() match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a ListModelsResponse
        */
        private def listModels(da: DataAccessor): Endpoint[ListModelsResponse] =
        get("models") { () =>
          da.OpenAI_listModels() match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a OpenAIFile
        */
        private def retrieveFile(da: DataAccessor): Endpoint[OpenAIFile] =
        get("files" :: string) { (fileId: String) =>
          da.OpenAI_retrieveFile(fileId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a FineTune
        */
        private def retrieveFineTune(da: DataAccessor): Endpoint[FineTune] =
        get("fine-tunes" :: string) { (fineTuneId: String) =>
          da.OpenAI_retrieveFineTune(fineTuneId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a Model
        */
        private def retrieveModel(da: DataAccessor): Endpoint[Model] =
        get("models" :: string) { (model: String) =>
          da.OpenAI_retrieveModel(model) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }


    implicit private def fileUploadToFile(fileUpload: FileUpload) : File = {
      fileUpload match {
        case upload: InMemoryFileUpload =>
          bytesToFile(Buf.ByteArray.Owned.extract(upload.content))
        case upload: OnDiskFileUpload =>
          upload.content
        case _ => null
      }
    }

    private def bytesToFile(input: Array[Byte]): java.io.File = {
      val file = Files.createTempFile("tmpOpenAIApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
