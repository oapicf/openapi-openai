package api

import play.api.libs.json._
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
trait OpenAIApi {
  /**
    * Immediately cancel a fine-tune job. 
    * @param fineTuneId The ID of the fine-tune job to cancel 
    */
  def cancelFineTune(fineTuneId: String): FineTune

  /**
    * Creates a model response for the given chat conversation.
    */
  def createChatCompletion(createChatCompletionRequest: CreateChatCompletionRequest): CreateChatCompletionResponse

  /**
    * Creates a completion for the provided prompt and parameters.
    */
  def createCompletion(createCompletionRequest: CreateCompletionRequest): CreateCompletionResponse

  /**
    * Creates a new edit for the provided input, instruction, and parameters.
    */
  def createEdit(createEditRequest: CreateEditRequest): CreateEditResponse

  /**
    * Creates an embedding vector representing the input text.
    */
  def createEmbedding(createEmbeddingRequest: CreateEmbeddingRequest): CreateEmbeddingResponse

  /**
    * Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 
    * @param file Name of the [JSON Lines](https://jsonlines.readthedocs.io/en/latest/) file to be uploaded.  If the &#x60;purpose&#x60; is set to \\\&quot;fine-tune\\\&quot;, each line is a JSON record with \\\&quot;prompt\\\&quot; and \\\&quot;completion\\\&quot; fields representing your [training examples](/docs/guides/fine-tuning/prepare-training-data). 
    * @param purpose The intended purpose of the uploaded documents.  Use \\\&quot;fine-tune\\\&quot; for [Fine-tuning](/docs/api-reference/fine-tunes). This allows us to validate the format of the uploaded file. 
    */
  def createFile(file: TemporaryFile, purpose: String): OpenAIFile

  /**
    * Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
    */
  def createFineTune(createFineTuneRequest: CreateFineTuneRequest): FineTune

  /**
    * Creates an image given a prompt.
    */
  def createImage(createImageRequest: CreateImageRequest): ImagesResponse

  /**
    * Creates an edited or extended image given an original image and a prompt.
    * @param image The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask.
    * @param prompt A text description of the desired image(s). The maximum length is 1000 characters.
    * @param mask An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where &#x60;image&#x60; should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as &#x60;image&#x60;.
    * @param n The number of images to generate. Must be between 1 and 10.
    * @param size The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;.
    * @param responseFormat The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;.
    * @param user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
    */
  def createImageEdit(image: TemporaryFile, prompt: String, mask: Option[TemporaryFile], n: Option[Int], size: Option[String], responseFormat: Option[String], user: Option[String]): ImagesResponse

  /**
    * Creates a variation of a given image.
    * @param image The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square.
    * @param n The number of images to generate. Must be between 1 and 10.
    * @param size The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;.
    * @param responseFormat The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;.
    * @param user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
    */
  def createImageVariation(image: TemporaryFile, n: Option[Int], size: Option[String], responseFormat: Option[String], user: Option[String]): ImagesResponse

  /**
    * Classifies if text violates OpenAI&#39;s Content Policy
    */
  def createModeration(createModerationRequest: CreateModerationRequest): CreateModerationResponse

  /**
    * Transcribes audio into the input language.
    * @param file The audio file object (not file name) to transcribe, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm. 
    * @param prompt An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language. 
    * @param responseFormat The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt. 
    * @param temperature The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
    * @param language The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency. 
    */
  def createTranscription(file: TemporaryFile, model: CreateTranscriptionRequestModel, prompt: Option[String], responseFormat: Option[String], temperature: Option[BigDecimal], language: Option[String]): CreateTranscriptionResponse

  /**
    * Translates audio into English.
    * @param file The audio file object (not file name) translate, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm. 
    * @param prompt An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English. 
    * @param responseFormat The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt. 
    * @param temperature The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
    */
  def createTranslation(file: TemporaryFile, model: CreateTranscriptionRequestModel, prompt: Option[String], responseFormat: Option[String], temperature: Option[BigDecimal]): CreateTranslationResponse

  /**
    * Delete a file.
    * @param fileId The ID of the file to use for this request
    */
  def deleteFile(fileId: String): DeleteFileResponse

  /**
    * Delete a fine-tuned model. You must have the Owner role in your organization.
    * @param model The model to delete
    */
  def deleteModel(model: String): DeleteModelResponse

  /**
    * Returns the contents of the specified file
    * @param fileId The ID of the file to use for this request
    */
  def downloadFile(fileId: String): String

  /**
    * Returns a list of files that belong to the user&#39;s organization.
    */
  def listFiles(): ListFilesResponse

  /**
    * Get fine-grained status updates for a fine-tune job. 
    * @param fineTuneId The ID of the fine-tune job to get events for. 
    * @param stream Whether to stream events for the fine-tune job. If set to true, events will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available. The stream will terminate with a &#x60;data: [DONE]&#x60; message when the job is finished (succeeded, cancelled, or failed).  If set to false, only events generated so far will be returned. 
    */
  def listFineTuneEvents(fineTuneId: String, stream: Option[Boolean]): ListFineTuneEventsResponse

  /**
    * List your organization&#39;s fine-tuning jobs 
    */
  def listFineTunes(): ListFineTunesResponse

  /**
    * Lists the currently available models, and provides basic information about each one such as the owner and availability.
    */
  def listModels(): ListModelsResponse

  /**
    * Returns information about a specific file.
    * @param fileId The ID of the file to use for this request
    */
  def retrieveFile(fileId: String): OpenAIFile

  /**
    * Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
    * @param fineTuneId The ID of the fine-tune job 
    */
  def retrieveFineTune(fineTuneId: String): FineTune

  /**
    * Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
    * @param model The ID of the model to use for this request
    */
  def retrieveModel(model: String): Model
}
