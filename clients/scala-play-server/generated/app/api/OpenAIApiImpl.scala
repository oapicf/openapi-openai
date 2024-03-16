package api

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

/**
  * Provides a default implementation for [[OpenAIApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-16T01:17:28.392125286Z[Etc/UTC]", comments = "Generator version: 7.4.0")
class OpenAIApiImpl extends OpenAIApi {
  /**
    * @inheritdoc
    */
  override def cancelFineTune(fineTuneId: String): FineTune = {
    // TODO: Implement better logic

    FineTune("", "", 0, 0, "", "", "", "", null, List.empty[OpenAIFile], List.empty[OpenAIFile], List.empty[OpenAIFile], None)
  }

  /**
    * @inheritdoc
    */
  override def createChatCompletion(createChatCompletionRequest: CreateChatCompletionRequest): CreateChatCompletionResponse = {
    // TODO: Implement better logic

    CreateChatCompletionResponse("", "", 0, "", List.empty[CreateChatCompletionResponseChoicesInner], None)
  }

  /**
    * @inheritdoc
    */
  override def createCompletion(createCompletionRequest: CreateCompletionRequest): CreateCompletionResponse = {
    // TODO: Implement better logic

    CreateCompletionResponse("", "", 0, "", List.empty[CreateCompletionResponseChoicesInner], None)
  }

  /**
    * @inheritdoc
    */
  override def createEdit(createEditRequest: CreateEditRequest): CreateEditResponse = {
    // TODO: Implement better logic

    CreateEditResponse("", 0, List.empty[CreateEditResponseChoicesInner], CreateCompletionResponseUsage(0, 0, 0))
  }

  /**
    * @inheritdoc
    */
  override def createEmbedding(createEmbeddingRequest: CreateEmbeddingRequest): CreateEmbeddingResponse = {
    // TODO: Implement better logic

    CreateEmbeddingResponse("", "", List.empty[CreateEmbeddingResponseDataInner], CreateEmbeddingResponseUsage(0, 0))
  }

  /**
    * @inheritdoc
    */
  override def createFile(file: TemporaryFile, purpose: String): OpenAIFile = {
    // TODO: Implement better logic

    OpenAIFile("", "", 0, 0, "", "", None, None)
  }

  /**
    * @inheritdoc
    */
  override def createFineTune(createFineTuneRequest: CreateFineTuneRequest): FineTune = {
    // TODO: Implement better logic

    FineTune("", "", 0, 0, "", "", "", "", null, List.empty[OpenAIFile], List.empty[OpenAIFile], List.empty[OpenAIFile], None)
  }

  /**
    * @inheritdoc
    */
  override def createImage(createImageRequest: CreateImageRequest): ImagesResponse = {
    // TODO: Implement better logic

    ImagesResponse(0, List.empty[ImagesResponseDataInner])
  }

  /**
    * @inheritdoc
    */
  override def createImageEdit(image: TemporaryFile, prompt: String, mask: Option[TemporaryFile], n: Option[Int], size: Option[String], responseFormat: Option[String], user: Option[String]): ImagesResponse = {
    // TODO: Implement better logic

    ImagesResponse(0, List.empty[ImagesResponseDataInner])
  }

  /**
    * @inheritdoc
    */
  override def createImageVariation(image: TemporaryFile, n: Option[Int], size: Option[String], responseFormat: Option[String], user: Option[String]): ImagesResponse = {
    // TODO: Implement better logic

    ImagesResponse(0, List.empty[ImagesResponseDataInner])
  }

  /**
    * @inheritdoc
    */
  override def createModeration(createModerationRequest: CreateModerationRequest): CreateModerationResponse = {
    // TODO: Implement better logic

    CreateModerationResponse("", "", List.empty[CreateModerationResponseResultsInner])
  }

  /**
    * @inheritdoc
    */
  override def createTranscription(file: TemporaryFile, model: CreateTranscriptionRequestModel, prompt: Option[String], responseFormat: Option[String], temperature: Option[BigDecimal], language: Option[String]): CreateTranscriptionResponse = {
    // TODO: Implement better logic

    CreateTranscriptionResponse("")
  }

  /**
    * @inheritdoc
    */
  override def createTranslation(file: TemporaryFile, model: CreateTranscriptionRequestModel, prompt: Option[String], responseFormat: Option[String], temperature: Option[BigDecimal]): CreateTranslationResponse = {
    // TODO: Implement better logic

    CreateTranslationResponse("")
  }

  /**
    * @inheritdoc
    */
  override def deleteFile(fileId: String): DeleteFileResponse = {
    // TODO: Implement better logic

    DeleteFileResponse("", "", false)
  }

  /**
    * @inheritdoc
    */
  override def deleteModel(model: String): DeleteModelResponse = {
    // TODO: Implement better logic

    DeleteModelResponse("", "", false)
  }

  /**
    * @inheritdoc
    */
  override def downloadFile(fileId: String): String = {
    // TODO: Implement better logic

    ""
  }

  /**
    * @inheritdoc
    */
  override def listFiles(): ListFilesResponse = {
    // TODO: Implement better logic

    ListFilesResponse("", List.empty[OpenAIFile])
  }

  /**
    * @inheritdoc
    */
  override def listFineTuneEvents(fineTuneId: String, stream: Option[Boolean]): ListFineTuneEventsResponse = {
    // TODO: Implement better logic

    ListFineTuneEventsResponse("", List.empty[FineTuneEvent])
  }

  /**
    * @inheritdoc
    */
  override def listFineTunes(): ListFineTunesResponse = {
    // TODO: Implement better logic

    ListFineTunesResponse("", List.empty[FineTune])
  }

  /**
    * @inheritdoc
    */
  override def listModels(): ListModelsResponse = {
    // TODO: Implement better logic

    ListModelsResponse("", List.empty[Model])
  }

  /**
    * @inheritdoc
    */
  override def retrieveFile(fileId: String): OpenAIFile = {
    // TODO: Implement better logic

    OpenAIFile("", "", 0, 0, "", "", None, None)
  }

  /**
    * @inheritdoc
    */
  override def retrieveFineTune(fineTuneId: String): FineTune = {
    // TODO: Implement better logic

    FineTune("", "", 0, 0, "", "", "", "", null, List.empty[OpenAIFile], List.empty[OpenAIFile], List.empty[OpenAIFile], None)
  }

  /**
    * @inheritdoc
    */
  override def retrieveModel(model: String): Model = {
    // TODO: Implement better logic

    Model("", "", 0, "")
  }
}
