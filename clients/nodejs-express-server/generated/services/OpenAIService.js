/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Immediately cancel a fine-tune job. 
*
* fineUnderscoretuneUnderscoreid String The ID of the fine-tune job to cancel 
* returns FineTune
* */
const cancelFineTune = ({ fineUnderscoretuneUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        fineUnderscoretuneUnderscoreid,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Creates a model response for the given chat conversation.
*
* createChatCompletionRequest CreateChatCompletionRequest 
* returns CreateChatCompletionResponse
* */
const createChatCompletion = ({ createChatCompletionRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        createChatCompletionRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Creates a completion for the provided prompt and parameters.
*
* createCompletionRequest CreateCompletionRequest 
* returns CreateCompletionResponse
* */
const createCompletion = ({ createCompletionRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        createCompletionRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Creates a new edit for the provided input, instruction, and parameters.
*
* createEditRequest CreateEditRequest 
* returns CreateEditResponse
* */
const createEdit = ({ createEditRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        createEditRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Creates an embedding vector representing the input text.
*
* createEmbeddingRequest CreateEmbeddingRequest 
* returns CreateEmbeddingResponse
* */
const createEmbedding = ({ createEmbeddingRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        createEmbeddingRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 
*
* file File Name of the [JSON Lines](https://jsonlines.readthedocs.io/en/latest/) file to be uploaded.  If the `purpose` is set to \\\"fine-tune\\\", each line is a JSON record with \\\"prompt\\\" and \\\"completion\\\" fields representing your [training examples](/docs/guides/fine-tuning/prepare-training-data). 
* purpose String The intended purpose of the uploaded documents.  Use \\\"fine-tune\\\" for [Fine-tuning](/docs/api-reference/fine-tunes). This allows us to validate the format of the uploaded file. 
* returns OpenAIFile
* */
const createFile = ({ file, purpose }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        file,
        purpose,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
*
* createFineTuneRequest CreateFineTuneRequest 
* returns FineTune
* */
const createFineTune = ({ createFineTuneRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        createFineTuneRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Creates an image given a prompt.
*
* createImageRequest CreateImageRequest 
* returns ImagesResponse
* */
const createImage = ({ createImageRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        createImageRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Creates an edited or extended image given an original image and a prompt.
*
* image File The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask.
* prompt String A text description of the desired image(s). The maximum length is 1000 characters.
* mask File An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where `image` should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as `image`. (optional)
* n Integer The number of images to generate. Must be between 1 and 10. (optional)
* size String The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`. (optional)
* responseUnderscoreformat String The format in which the generated images are returned. Must be one of `url` or `b64_json`. (optional)
* user String A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  (optional)
* returns ImagesResponse
* */
const createImageEdit = ({ image, prompt, mask, n, size, responseUnderscoreformat, user }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        image,
        prompt,
        mask,
        n,
        size,
        responseUnderscoreformat,
        user,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Creates a variation of a given image.
*
* image File The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square.
* n Integer The number of images to generate. Must be between 1 and 10. (optional)
* size String The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`. (optional)
* responseUnderscoreformat String The format in which the generated images are returned. Must be one of `url` or `b64_json`. (optional)
* user String A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  (optional)
* returns ImagesResponse
* */
const createImageVariation = ({ image, n, size, responseUnderscoreformat, user }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        image,
        n,
        size,
        responseUnderscoreformat,
        user,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Classifies if text violates OpenAI's Content Policy
*
* createModerationRequest CreateModerationRequest 
* returns CreateModerationResponse
* */
const createModeration = ({ createModerationRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        createModerationRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Transcribes audio into the input language.
*
* file File The audio file object (not file name) to transcribe, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm. 
* model CreateTranscriptionRequest_model 
* prompt String An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language.  (optional)
* responseUnderscoreformat String The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.  (optional)
* temperature BigDecimal The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  (optional)
* language String The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency.  (optional)
* returns CreateTranscriptionResponse
* */
const createTranscription = ({ file, model, prompt, responseUnderscoreformat, temperature, language }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        file,
        model,
        prompt,
        responseUnderscoreformat,
        temperature,
        language,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Translates audio into English.
*
* file File The audio file object (not file name) translate, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm. 
* model CreateTranscriptionRequest_model 
* prompt String An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English.  (optional)
* responseUnderscoreformat String The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.  (optional)
* temperature BigDecimal The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  (optional)
* returns CreateTranslationResponse
* */
const createTranslation = ({ file, model, prompt, responseUnderscoreformat, temperature }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        file,
        model,
        prompt,
        responseUnderscoreformat,
        temperature,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Delete a file.
*
* fileUnderscoreid String The ID of the file to use for this request
* returns DeleteFileResponse
* */
const deleteFile = ({ fileUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        fileUnderscoreid,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Delete a fine-tuned model. You must have the Owner role in your organization.
*
* model String The model to delete
* returns DeleteModelResponse
* */
const deleteModel = ({ model }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        model,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Returns the contents of the specified file
*
* fileUnderscoreid String The ID of the file to use for this request
* returns String
* */
const downloadFile = ({ fileUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        fileUnderscoreid,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Returns a list of files that belong to the user's organization.
*
* returns ListFilesResponse
* */
const listFiles = () => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get fine-grained status updates for a fine-tune job. 
*
* fineUnderscoretuneUnderscoreid String The ID of the fine-tune job to get events for. 
* stream Boolean Whether to stream events for the fine-tune job. If set to true, events will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available. The stream will terminate with a `data: [DONE]` message when the job is finished (succeeded, cancelled, or failed).  If set to false, only events generated so far will be returned.  (optional)
* returns ListFineTuneEventsResponse
* */
const listFineTuneEvents = ({ fineUnderscoretuneUnderscoreid, stream }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        fineUnderscoretuneUnderscoreid,
        stream,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* List your organization's fine-tuning jobs 
*
* returns ListFineTunesResponse
* */
const listFineTunes = () => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Lists the currently available models, and provides basic information about each one such as the owner and availability.
*
* returns ListModelsResponse
* */
const listModels = () => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Returns information about a specific file.
*
* fileUnderscoreid String The ID of the file to use for this request
* returns OpenAIFile
* */
const retrieveFile = ({ fileUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        fileUnderscoreid,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
*
* fineUnderscoretuneUnderscoreid String The ID of the fine-tune job 
* returns FineTune
* */
const retrieveFineTune = ({ fineUnderscoretuneUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        fineUnderscoretuneUnderscoreid,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
*
* model String The ID of the model to use for this request
* returns Model
* */
const retrieveModel = ({ model }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        model,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);

module.exports = {
  cancelFineTune,
  createChatCompletion,
  createCompletion,
  createEdit,
  createEmbedding,
  createFile,
  createFineTune,
  createImage,
  createImageEdit,
  createImageVariation,
  createModeration,
  createTranscription,
  createTranslation,
  deleteFile,
  deleteModel,
  downloadFile,
  listFiles,
  listFineTuneEvents,
  listFineTunes,
  listModels,
  retrieveFile,
  retrieveFineTune,
  retrieveModel,
};
