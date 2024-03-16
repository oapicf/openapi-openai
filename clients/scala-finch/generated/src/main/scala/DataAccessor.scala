package org.openapitools

// TODO: properly handle custom imports
import java.io._
import java.util.UUID
import java.time._
import com.twitter.finagle.http.exp.Multipart.{FileUpload, InMemoryFileUpload, OnDiskFileUpload}

import org.openapitools.models._

trait DataAccessor {
    // TODO: apiInfo -> apis -> operations = TODO error
    private object TODO extends CommonError("Not implemented") {
        def message = "Not implemented"
    }

        /**
        * 
        * @return A FineTune
        */
        def OpenAI_cancelFineTune(fineTuneId: String): Either[CommonError,FineTune] = Left(TODO)

        /**
        * 
        * @return A CreateChatCompletionResponse
        */
        def OpenAI_createChatCompletion(createChatCompletionRequest: CreateChatCompletionRequest): Either[CommonError,CreateChatCompletionResponse] = Left(TODO)

        /**
        * 
        * @return A CreateCompletionResponse
        */
        def OpenAI_createCompletion(createCompletionRequest: CreateCompletionRequest): Either[CommonError,CreateCompletionResponse] = Left(TODO)

        /**
        * 
        * @return A CreateEditResponse
        */
        def OpenAI_createEdit(createEditRequest: CreateEditRequest): Either[CommonError,CreateEditResponse] = Left(TODO)

        /**
        * 
        * @return A CreateEmbeddingResponse
        */
        def OpenAI_createEmbedding(createEmbeddingRequest: CreateEmbeddingRequest): Either[CommonError,CreateEmbeddingResponse] = Left(TODO)

        /**
        * 
        * @return A OpenAIFile
        */
        def OpenAI_createFile(file: FileUpload, purpose: String): Either[CommonError,OpenAIFile] = Left(TODO)

        /**
        * 
        * @return A FineTune
        */
        def OpenAI_createFineTune(createFineTuneRequest: CreateFineTuneRequest): Either[CommonError,FineTune] = Left(TODO)

        /**
        * 
        * @return A ImagesResponse
        */
        def OpenAI_createImage(createImageRequest: CreateImageRequest): Either[CommonError,ImagesResponse] = Left(TODO)

        /**
        * 
        * @return A ImagesResponse
        */
        def OpenAI_createImageEdit(image: FileUpload, prompt: String, mask: FileUpload, n: Option[Int], size: Option[String], responseFormat: Option[String], user: Option[String]): Either[CommonError,ImagesResponse] = Left(TODO)

        /**
        * 
        * @return A ImagesResponse
        */
        def OpenAI_createImageVariation(image: FileUpload, n: Option[Int], size: Option[String], responseFormat: Option[String], user: Option[String]): Either[CommonError,ImagesResponse] = Left(TODO)

        /**
        * 
        * @return A CreateModerationResponse
        */
        def OpenAI_createModeration(createModerationRequest: CreateModerationRequest): Either[CommonError,CreateModerationResponse] = Left(TODO)

        /**
        * 
        * @return A CreateTranscriptionResponse
        */
        def OpenAI_createTranscription(file: FileUpload, model: CreateTranscriptionRequestModel, prompt: Option[String], responseFormat: Option[String], temperature: Option[BigDecimal], language: Option[String]): Either[CommonError,CreateTranscriptionResponse] = Left(TODO)

        /**
        * 
        * @return A CreateTranslationResponse
        */
        def OpenAI_createTranslation(file: FileUpload, model: CreateTranscriptionRequestModel, prompt: Option[String], responseFormat: Option[String], temperature: Option[BigDecimal]): Either[CommonError,CreateTranslationResponse] = Left(TODO)

        /**
        * 
        * @return A DeleteFileResponse
        */
        def OpenAI_deleteFile(fileId: String): Either[CommonError,DeleteFileResponse] = Left(TODO)

        /**
        * 
        * @return A DeleteModelResponse
        */
        def OpenAI_deleteModel(model: String): Either[CommonError,DeleteModelResponse] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def OpenAI_downloadFile(fileId: String): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A ListFilesResponse
        */
        def OpenAI_listFiles(): Either[CommonError,ListFilesResponse] = Left(TODO)

        /**
        * 
        * @return A ListFineTuneEventsResponse
        */
        def OpenAI_listFineTuneEvents(fineTuneId: String, stream: Option[Boolean]): Either[CommonError,ListFineTuneEventsResponse] = Left(TODO)

        /**
        * 
        * @return A ListFineTunesResponse
        */
        def OpenAI_listFineTunes(): Either[CommonError,ListFineTunesResponse] = Left(TODO)

        /**
        * 
        * @return A ListModelsResponse
        */
        def OpenAI_listModels(): Either[CommonError,ListModelsResponse] = Left(TODO)

        /**
        * 
        * @return A OpenAIFile
        */
        def OpenAI_retrieveFile(fileId: String): Either[CommonError,OpenAIFile] = Left(TODO)

        /**
        * 
        * @return A FineTune
        */
        def OpenAI_retrieveFineTune(fineTuneId: String): Either[CommonError,FineTune] = Left(TODO)

        /**
        * 
        * @return A Model
        */
        def OpenAI_retrieveModel(model: String): Either[CommonError,Model] = Left(TODO)

}