#ifndef _OpenAIManager_H_
#define _OpenAIManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "CreateChatCompletionRequest.h"
#include "CreateChatCompletionResponse.h"
#include "CreateCompletionRequest.h"
#include "CreateCompletionResponse.h"
#include "CreateEditRequest.h"
#include "CreateEditResponse.h"
#include "CreateEmbeddingRequest.h"
#include "CreateEmbeddingResponse.h"
#include "CreateFineTuneRequest.h"
#include "CreateImageRequest.h"
#include "CreateModerationRequest.h"
#include "CreateModerationResponse.h"
#include "CreateTranscriptionRequest_model.h"
#include "CreateTranscriptionResponse.h"
#include "CreateTranslationResponse.h"
#include "DeleteFileResponse.h"
#include "DeleteModelResponse.h"
#include "FineTune.h"
#include "ImagesResponse.h"
#include "ListFilesResponse.h"
#include "ListFineTuneEventsResponse.h"
#include "ListFineTunesResponse.h"
#include "ListModelsResponse.h"
#include "Model.h"
#include "OpenAIFile.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup OpenAI OpenAI
 * \ingroup Operations
 *  @{
 */
class OpenAIManager {
public:
	OpenAIManager();
	virtual ~OpenAIManager();

/*! \brief Immediately cancel a fine-tune job. . *Synchronous*
 *
 * 
 * \param fineTuneId The ID of the fine-tune job to cancel  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool cancelFineTuneSync(char * accessToken,
	std::string fineTuneId, 
	void(* handler)(FineTune, Error, void* )
	, void* userData);

/*! \brief Immediately cancel a fine-tune job. . *Asynchronous*
 *
 * 
 * \param fineTuneId The ID of the fine-tune job to cancel  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool cancelFineTuneAsync(char * accessToken,
	std::string fineTuneId, 
	void(* handler)(FineTune, Error, void* )
	, void* userData);


/*! \brief Creates a model response for the given chat conversation.. *Synchronous*
 *
 * 
 * \param createChatCompletionRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createChatCompletionSync(char * accessToken,
	std::shared_ptr<CreateChatCompletionRequest> createChatCompletionRequest, 
	void(* handler)(CreateChatCompletionResponse, Error, void* )
	, void* userData);

/*! \brief Creates a model response for the given chat conversation.. *Asynchronous*
 *
 * 
 * \param createChatCompletionRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createChatCompletionAsync(char * accessToken,
	std::shared_ptr<CreateChatCompletionRequest> createChatCompletionRequest, 
	void(* handler)(CreateChatCompletionResponse, Error, void* )
	, void* userData);


/*! \brief Creates a completion for the provided prompt and parameters.. *Synchronous*
 *
 * 
 * \param createCompletionRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createCompletionSync(char * accessToken,
	std::shared_ptr<CreateCompletionRequest> createCompletionRequest, 
	void(* handler)(CreateCompletionResponse, Error, void* )
	, void* userData);

/*! \brief Creates a completion for the provided prompt and parameters.. *Asynchronous*
 *
 * 
 * \param createCompletionRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createCompletionAsync(char * accessToken,
	std::shared_ptr<CreateCompletionRequest> createCompletionRequest, 
	void(* handler)(CreateCompletionResponse, Error, void* )
	, void* userData);


/*! \brief Creates a new edit for the provided input, instruction, and parameters.. *Synchronous*
 *
 * 
 * \param createEditRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createEditSync(char * accessToken,
	std::shared_ptr<CreateEditRequest> createEditRequest, 
	void(* handler)(CreateEditResponse, Error, void* )
	, void* userData);

/*! \brief Creates a new edit for the provided input, instruction, and parameters.. *Asynchronous*
 *
 * 
 * \param createEditRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createEditAsync(char * accessToken,
	std::shared_ptr<CreateEditRequest> createEditRequest, 
	void(* handler)(CreateEditResponse, Error, void* )
	, void* userData);


/*! \brief Creates an embedding vector representing the input text.. *Synchronous*
 *
 * 
 * \param createEmbeddingRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createEmbeddingSync(char * accessToken,
	std::shared_ptr<CreateEmbeddingRequest> createEmbeddingRequest, 
	void(* handler)(CreateEmbeddingResponse, Error, void* )
	, void* userData);

/*! \brief Creates an embedding vector representing the input text.. *Asynchronous*
 *
 * 
 * \param createEmbeddingRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createEmbeddingAsync(char * accessToken,
	std::shared_ptr<CreateEmbeddingRequest> createEmbeddingRequest, 
	void(* handler)(CreateEmbeddingResponse, Error, void* )
	, void* userData);


/*! \brief Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. . *Synchronous*
 *
 * 
 * \param file Name of the [JSON Lines](https://jsonlines.readthedocs.io/en/latest/) file to be uploaded.  If the `purpose` is set to \\\"fine-tune\\\", each line is a JSON record with \\\"prompt\\\" and \\\"completion\\\" fields representing your [training examples](/docs/guides/fine-tuning/prepare-training-data).  *Required*
 * \param purpose The intended purpose of the uploaded documents.  Use \\\"fine-tune\\\" for [Fine-tuning](/docs/api-reference/fine-tunes). This allows us to validate the format of the uploaded file.  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createFileSync(char * accessToken,
	std::string file, std::string purpose, 
	void(* handler)(OpenAIFile, Error, void* )
	, void* userData);

/*! \brief Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. . *Asynchronous*
 *
 * 
 * \param file Name of the [JSON Lines](https://jsonlines.readthedocs.io/en/latest/) file to be uploaded.  If the `purpose` is set to \\\"fine-tune\\\", each line is a JSON record with \\\"prompt\\\" and \\\"completion\\\" fields representing your [training examples](/docs/guides/fine-tuning/prepare-training-data).  *Required*
 * \param purpose The intended purpose of the uploaded documents.  Use \\\"fine-tune\\\" for [Fine-tuning](/docs/api-reference/fine-tunes). This allows us to validate the format of the uploaded file.  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createFileAsync(char * accessToken,
	std::string file, std::string purpose, 
	void(* handler)(OpenAIFile, Error, void* )
	, void* userData);


/*! \brief Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) . *Synchronous*
 *
 * 
 * \param createFineTuneRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createFineTuneSync(char * accessToken,
	std::shared_ptr<CreateFineTuneRequest> createFineTuneRequest, 
	void(* handler)(FineTune, Error, void* )
	, void* userData);

/*! \brief Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) . *Asynchronous*
 *
 * 
 * \param createFineTuneRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createFineTuneAsync(char * accessToken,
	std::shared_ptr<CreateFineTuneRequest> createFineTuneRequest, 
	void(* handler)(FineTune, Error, void* )
	, void* userData);


/*! \brief Creates an image given a prompt.. *Synchronous*
 *
 * 
 * \param createImageRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createImageSync(char * accessToken,
	std::shared_ptr<CreateImageRequest> createImageRequest, 
	void(* handler)(ImagesResponse, Error, void* )
	, void* userData);

/*! \brief Creates an image given a prompt.. *Asynchronous*
 *
 * 
 * \param createImageRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createImageAsync(char * accessToken,
	std::shared_ptr<CreateImageRequest> createImageRequest, 
	void(* handler)(ImagesResponse, Error, void* )
	, void* userData);


/*! \brief Creates an edited or extended image given an original image and a prompt.. *Synchronous*
 *
 * 
 * \param image The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask. *Required*
 * \param prompt A text description of the desired image(s). The maximum length is 1000 characters. *Required*
 * \param mask An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where `image` should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as `image`.
 * \param n The number of images to generate. Must be between 1 and 10.
 * \param size The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.
 * \param responseFormat The format in which the generated images are returned. Must be one of `url` or `b64_json`.
 * \param user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createImageEditSync(char * accessToken,
	std::string image, std::string prompt, std::string mask, int n, std::string size, std::string responseFormat, std::string user, 
	void(* handler)(ImagesResponse, Error, void* )
	, void* userData);

/*! \brief Creates an edited or extended image given an original image and a prompt.. *Asynchronous*
 *
 * 
 * \param image The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask. *Required*
 * \param prompt A text description of the desired image(s). The maximum length is 1000 characters. *Required*
 * \param mask An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where `image` should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as `image`.
 * \param n The number of images to generate. Must be between 1 and 10.
 * \param size The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.
 * \param responseFormat The format in which the generated images are returned. Must be one of `url` or `b64_json`.
 * \param user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createImageEditAsync(char * accessToken,
	std::string image, std::string prompt, std::string mask, int n, std::string size, std::string responseFormat, std::string user, 
	void(* handler)(ImagesResponse, Error, void* )
	, void* userData);


/*! \brief Creates a variation of a given image.. *Synchronous*
 *
 * 
 * \param image The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square. *Required*
 * \param n The number of images to generate. Must be between 1 and 10.
 * \param size The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.
 * \param responseFormat The format in which the generated images are returned. Must be one of `url` or `b64_json`.
 * \param user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createImageVariationSync(char * accessToken,
	std::string image, int n, std::string size, std::string responseFormat, std::string user, 
	void(* handler)(ImagesResponse, Error, void* )
	, void* userData);

/*! \brief Creates a variation of a given image.. *Asynchronous*
 *
 * 
 * \param image The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square. *Required*
 * \param n The number of images to generate. Must be between 1 and 10.
 * \param size The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.
 * \param responseFormat The format in which the generated images are returned. Must be one of `url` or `b64_json`.
 * \param user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createImageVariationAsync(char * accessToken,
	std::string image, int n, std::string size, std::string responseFormat, std::string user, 
	void(* handler)(ImagesResponse, Error, void* )
	, void* userData);


/*! \brief Classifies if text violates OpenAI's Content Policy. *Synchronous*
 *
 * 
 * \param createModerationRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createModerationSync(char * accessToken,
	std::shared_ptr<CreateModerationRequest> createModerationRequest, 
	void(* handler)(CreateModerationResponse, Error, void* )
	, void* userData);

/*! \brief Classifies if text violates OpenAI's Content Policy. *Asynchronous*
 *
 * 
 * \param createModerationRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createModerationAsync(char * accessToken,
	std::shared_ptr<CreateModerationRequest> createModerationRequest, 
	void(* handler)(CreateModerationResponse, Error, void* )
	, void* userData);


/*! \brief Transcribes audio into the input language.. *Synchronous*
 *
 * 
 * \param file The audio file object (not file name) to transcribe, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm.  *Required*
 * \param model  *Required*
 * \param prompt An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language. 
 * \param responseFormat The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt. 
 * \param temperature The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
 * \param language The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createTranscriptionSync(char * accessToken,
	std::string file, CreateTranscriptionRequest_model model, std::string prompt, std::string responseFormat, long long temperature, std::string language, 
	void(* handler)(CreateTranscriptionResponse, Error, void* )
	, void* userData);

/*! \brief Transcribes audio into the input language.. *Asynchronous*
 *
 * 
 * \param file The audio file object (not file name) to transcribe, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm.  *Required*
 * \param model  *Required*
 * \param prompt An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language. 
 * \param responseFormat The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt. 
 * \param temperature The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
 * \param language The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createTranscriptionAsync(char * accessToken,
	std::string file, CreateTranscriptionRequest_model model, std::string prompt, std::string responseFormat, long long temperature, std::string language, 
	void(* handler)(CreateTranscriptionResponse, Error, void* )
	, void* userData);


/*! \brief Translates audio into English.. *Synchronous*
 *
 * 
 * \param file The audio file object (not file name) translate, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm.  *Required*
 * \param model  *Required*
 * \param prompt An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English. 
 * \param responseFormat The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt. 
 * \param temperature The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createTranslationSync(char * accessToken,
	std::string file, CreateTranscriptionRequest_model model, std::string prompt, std::string responseFormat, long long temperature, 
	void(* handler)(CreateTranslationResponse, Error, void* )
	, void* userData);

/*! \brief Translates audio into English.. *Asynchronous*
 *
 * 
 * \param file The audio file object (not file name) translate, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm.  *Required*
 * \param model  *Required*
 * \param prompt An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English. 
 * \param responseFormat The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt. 
 * \param temperature The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createTranslationAsync(char * accessToken,
	std::string file, CreateTranscriptionRequest_model model, std::string prompt, std::string responseFormat, long long temperature, 
	void(* handler)(CreateTranslationResponse, Error, void* )
	, void* userData);


/*! \brief Delete a file.. *Synchronous*
 *
 * 
 * \param fileId The ID of the file to use for this request *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool deleteFileSync(char * accessToken,
	std::string fileId, 
	void(* handler)(DeleteFileResponse, Error, void* )
	, void* userData);

/*! \brief Delete a file.. *Asynchronous*
 *
 * 
 * \param fileId The ID of the file to use for this request *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool deleteFileAsync(char * accessToken,
	std::string fileId, 
	void(* handler)(DeleteFileResponse, Error, void* )
	, void* userData);


/*! \brief Delete a fine-tuned model. You must have the Owner role in your organization.. *Synchronous*
 *
 * 
 * \param model The model to delete *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool deleteModelSync(char * accessToken,
	std::string model, 
	void(* handler)(DeleteModelResponse, Error, void* )
	, void* userData);

/*! \brief Delete a fine-tuned model. You must have the Owner role in your organization.. *Asynchronous*
 *
 * 
 * \param model The model to delete *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool deleteModelAsync(char * accessToken,
	std::string model, 
	void(* handler)(DeleteModelResponse, Error, void* )
	, void* userData);


/*! \brief Returns the contents of the specified file. *Synchronous*
 *
 * 
 * \param fileId The ID of the file to use for this request *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool downloadFileSync(char * accessToken,
	std::string fileId, 
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief Returns the contents of the specified file. *Asynchronous*
 *
 * 
 * \param fileId The ID of the file to use for this request *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool downloadFileAsync(char * accessToken,
	std::string fileId, 
	void(* handler)(std::string, Error, void* )
	, void* userData);


/*! \brief Returns a list of files that belong to the user's organization.. *Synchronous*
 *
 * 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool listFilesSync(char * accessToken,
	
	void(* handler)(ListFilesResponse, Error, void* )
	, void* userData);

/*! \brief Returns a list of files that belong to the user's organization.. *Asynchronous*
 *
 * 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool listFilesAsync(char * accessToken,
	
	void(* handler)(ListFilesResponse, Error, void* )
	, void* userData);


/*! \brief Get fine-grained status updates for a fine-tune job. . *Synchronous*
 *
 * 
 * \param fineTuneId The ID of the fine-tune job to get events for.  *Required*
 * \param stream Whether to stream events for the fine-tune job. If set to true, events will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available. The stream will terminate with a `data: [DONE]` message when the job is finished (succeeded, cancelled, or failed).  If set to false, only events generated so far will be returned. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool listFineTuneEventsSync(char * accessToken,
	std::string fineTuneId, bool stream, 
	void(* handler)(ListFineTuneEventsResponse, Error, void* )
	, void* userData);

/*! \brief Get fine-grained status updates for a fine-tune job. . *Asynchronous*
 *
 * 
 * \param fineTuneId The ID of the fine-tune job to get events for.  *Required*
 * \param stream Whether to stream events for the fine-tune job. If set to true, events will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available. The stream will terminate with a `data: [DONE]` message when the job is finished (succeeded, cancelled, or failed).  If set to false, only events generated so far will be returned. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool listFineTuneEventsAsync(char * accessToken,
	std::string fineTuneId, bool stream, 
	void(* handler)(ListFineTuneEventsResponse, Error, void* )
	, void* userData);


/*! \brief List your organization's fine-tuning jobs . *Synchronous*
 *
 * 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool listFineTunesSync(char * accessToken,
	
	void(* handler)(ListFineTunesResponse, Error, void* )
	, void* userData);

/*! \brief List your organization's fine-tuning jobs . *Asynchronous*
 *
 * 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool listFineTunesAsync(char * accessToken,
	
	void(* handler)(ListFineTunesResponse, Error, void* )
	, void* userData);


/*! \brief Lists the currently available models, and provides basic information about each one such as the owner and availability.. *Synchronous*
 *
 * 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool listModelsSync(char * accessToken,
	
	void(* handler)(ListModelsResponse, Error, void* )
	, void* userData);

/*! \brief Lists the currently available models, and provides basic information about each one such as the owner and availability.. *Asynchronous*
 *
 * 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool listModelsAsync(char * accessToken,
	
	void(* handler)(ListModelsResponse, Error, void* )
	, void* userData);


/*! \brief Returns information about a specific file.. *Synchronous*
 *
 * 
 * \param fileId The ID of the file to use for this request *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool retrieveFileSync(char * accessToken,
	std::string fileId, 
	void(* handler)(OpenAIFile, Error, void* )
	, void* userData);

/*! \brief Returns information about a specific file.. *Asynchronous*
 *
 * 
 * \param fileId The ID of the file to use for this request *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool retrieveFileAsync(char * accessToken,
	std::string fileId, 
	void(* handler)(OpenAIFile, Error, void* )
	, void* userData);


/*! \brief Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) . *Synchronous*
 *
 * 
 * \param fineTuneId The ID of the fine-tune job  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool retrieveFineTuneSync(char * accessToken,
	std::string fineTuneId, 
	void(* handler)(FineTune, Error, void* )
	, void* userData);

/*! \brief Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) . *Asynchronous*
 *
 * 
 * \param fineTuneId The ID of the fine-tune job  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool retrieveFineTuneAsync(char * accessToken,
	std::string fineTuneId, 
	void(* handler)(FineTune, Error, void* )
	, void* userData);


/*! \brief Retrieves a model instance, providing basic information about the model such as the owner and permissioning.. *Synchronous*
 *
 * 
 * \param model The ID of the model to use for this request *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool retrieveModelSync(char * accessToken,
	std::string model, 
	void(* handler)(Model, Error, void* )
	, void* userData);

/*! \brief Retrieves a model instance, providing basic information about the model such as the owner and permissioning.. *Asynchronous*
 *
 * 
 * \param model The ID of the model to use for this request *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool retrieveModelAsync(char * accessToken,
	std::string model, 
	void(* handler)(Model, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.openai.com/v1";
	}
};
/** @}*/

}
}
#endif /* OpenAIManager_H_ */
