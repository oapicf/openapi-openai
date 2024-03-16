from typing import List, Dict
from aiohttp import web

from openapi_server.models.create_chat_completion_request import CreateChatCompletionRequest
from openapi_server.models.create_chat_completion_response import CreateChatCompletionResponse
from openapi_server.models.create_completion_request import CreateCompletionRequest
from openapi_server.models.create_completion_response import CreateCompletionResponse
from openapi_server.models.create_edit_request import CreateEditRequest
from openapi_server.models.create_edit_response import CreateEditResponse
from openapi_server.models.create_embedding_request import CreateEmbeddingRequest
from openapi_server.models.create_embedding_response import CreateEmbeddingResponse
from openapi_server.models.create_fine_tune_request import CreateFineTuneRequest
from openapi_server.models.create_image_request import CreateImageRequest
from openapi_server.models.create_moderation_request import CreateModerationRequest
from openapi_server.models.create_moderation_response import CreateModerationResponse
from openapi_server.models.create_transcription_request_model import CreateTranscriptionRequestModel
from openapi_server.models.create_transcription_response import CreateTranscriptionResponse
from openapi_server.models.create_translation_response import CreateTranslationResponse
from openapi_server.models.delete_file_response import DeleteFileResponse
from openapi_server.models.delete_model_response import DeleteModelResponse
from openapi_server.models.fine_tune import FineTune
from openapi_server.models.images_response import ImagesResponse
from openapi_server.models.list_files_response import ListFilesResponse
from openapi_server.models.list_fine_tune_events_response import ListFineTuneEventsResponse
from openapi_server.models.list_fine_tunes_response import ListFineTunesResponse
from openapi_server.models.list_models_response import ListModelsResponse
from openapi_server.models.model import Model
from openapi_server.models.open_ai_file import OpenAIFile
from openapi_server import util


async def cancel_fine_tune(request: web.Request, fine_tune_id) -> web.Response:
    """Immediately cancel a fine-tune job. 

    

    :param fine_tune_id: The ID of the fine-tune job to cancel 
    :type fine_tune_id: str

    """
    return web.Response(status=200)


async def create_chat_completion(request: web.Request, body) -> web.Response:
    """Creates a model response for the given chat conversation.

    

    :param body: 
    :type body: dict | bytes

    """
    body = CreateChatCompletionRequest.from_dict(body)
    return web.Response(status=200)


async def create_completion(request: web.Request, body) -> web.Response:
    """Creates a completion for the provided prompt and parameters.

    

    :param body: 
    :type body: dict | bytes

    """
    body = CreateCompletionRequest.from_dict(body)
    return web.Response(status=200)


async def create_edit(request: web.Request, body) -> web.Response:
    """Creates a new edit for the provided input, instruction, and parameters.

    

    :param body: 
    :type body: dict | bytes

    """
    body = CreateEditRequest.from_dict(body)
    return web.Response(status=200)


async def create_embedding(request: web.Request, body) -> web.Response:
    """Creates an embedding vector representing the input text.

    

    :param body: 
    :type body: dict | bytes

    """
    body = CreateEmbeddingRequest.from_dict(body)
    return web.Response(status=200)


async def create_file(request: web.Request, file, purpose) -> web.Response:
    """Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 

    

    :param file: Name of the [JSON Lines](https://jsonlines.readthedocs.io/en/latest/) file to be uploaded.  If the &#x60;purpose&#x60; is set to \\\&quot;fine-tune\\\&quot;, each line is a JSON record with \\\&quot;prompt\\\&quot; and \\\&quot;completion\\\&quot; fields representing your [training examples](/docs/guides/fine-tuning/prepare-training-data). 
    :type file: str
    :param purpose: The intended purpose of the uploaded documents.  Use \\\&quot;fine-tune\\\&quot; for [Fine-tuning](/docs/api-reference/fine-tunes). This allows us to validate the format of the uploaded file. 
    :type purpose: str

    """
    return web.Response(status=200)


async def create_fine_tune(request: web.Request, body) -> web.Response:
    """Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 

    

    :param body: 
    :type body: dict | bytes

    """
    body = CreateFineTuneRequest.from_dict(body)
    return web.Response(status=200)


async def create_image(request: web.Request, body) -> web.Response:
    """Creates an image given a prompt.

    

    :param body: 
    :type body: dict | bytes

    """
    body = CreateImageRequest.from_dict(body)
    return web.Response(status=200)


async def create_image_edit(request: web.Request, image, prompt, mask=None, n=None, size=None, response_format=None, user=None) -> web.Response:
    """Creates an edited or extended image given an original image and a prompt.

    

    :param image: The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask.
    :type image: str
    :param prompt: A text description of the desired image(s). The maximum length is 1000 characters.
    :type prompt: str
    :param mask: An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where &#x60;image&#x60; should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as &#x60;image&#x60;.
    :type mask: str
    :param n: The number of images to generate. Must be between 1 and 10.
    :type n: int
    :param size: The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;.
    :type size: str
    :param response_format: The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;.
    :type response_format: str
    :param user: A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
    :type user: str

    """
    return web.Response(status=200)


async def create_image_variation(request: web.Request, image, n=None, size=None, response_format=None, user=None) -> web.Response:
    """Creates a variation of a given image.

    

    :param image: The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square.
    :type image: str
    :param n: The number of images to generate. Must be between 1 and 10.
    :type n: int
    :param size: The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;.
    :type size: str
    :param response_format: The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;.
    :type response_format: str
    :param user: A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
    :type user: str

    """
    return web.Response(status=200)


async def create_moderation(request: web.Request, body) -> web.Response:
    """Classifies if text violates OpenAI&#39;s Content Policy

    

    :param body: 
    :type body: dict | bytes

    """
    body = CreateModerationRequest.from_dict(body)
    return web.Response(status=200)


async def create_transcription(request: web.Request, file, model, prompt=None, response_format=None, temperature=None, language=None) -> web.Response:
    """Transcribes audio into the input language.

    

    :param file: The audio file object (not file name) to transcribe, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm. 
    :type file: str
    :param model: 
    :type model: dict | bytes
    :param prompt: An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language. 
    :type prompt: str
    :param response_format: The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt. 
    :type response_format: str
    :param temperature: The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
    :type temperature: 
    :param language: The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency. 
    :type language: str

    """
    model = CreateTranscriptionRequestModel.from_dict(model)
    return web.Response(status=200)


async def create_translation(request: web.Request, file, model, prompt=None, response_format=None, temperature=None) -> web.Response:
    """Translates audio into English.

    

    :param file: The audio file object (not file name) translate, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm. 
    :type file: str
    :param model: 
    :type model: dict | bytes
    :param prompt: An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English. 
    :type prompt: str
    :param response_format: The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt. 
    :type response_format: str
    :param temperature: The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
    :type temperature: 

    """
    model = CreateTranscriptionRequestModel.from_dict(model)
    return web.Response(status=200)


async def delete_file(request: web.Request, file_id) -> web.Response:
    """Delete a file.

    

    :param file_id: The ID of the file to use for this request
    :type file_id: str

    """
    return web.Response(status=200)


async def delete_model(request: web.Request, model) -> web.Response:
    """Delete a fine-tuned model. You must have the Owner role in your organization.

    

    :param model: The model to delete
    :type model: str

    """
    return web.Response(status=200)


async def download_file(request: web.Request, file_id) -> web.Response:
    """Returns the contents of the specified file

    

    :param file_id: The ID of the file to use for this request
    :type file_id: str

    """
    return web.Response(status=200)


async def list_files(request: web.Request, ) -> web.Response:
    """Returns a list of files that belong to the user&#39;s organization.

    


    """
    return web.Response(status=200)


async def list_fine_tune_events(request: web.Request, fine_tune_id, stream=None) -> web.Response:
    """Get fine-grained status updates for a fine-tune job. 

    

    :param fine_tune_id: The ID of the fine-tune job to get events for. 
    :type fine_tune_id: str
    :param stream: Whether to stream events for the fine-tune job. If set to true, events will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available. The stream will terminate with a &#x60;data: [DONE]&#x60; message when the job is finished (succeeded, cancelled, or failed).  If set to false, only events generated so far will be returned. 
    :type stream: bool

    """
    return web.Response(status=200)


async def list_fine_tunes(request: web.Request, ) -> web.Response:
    """List your organization&#39;s fine-tuning jobs 

    


    """
    return web.Response(status=200)


async def list_models(request: web.Request, ) -> web.Response:
    """Lists the currently available models, and provides basic information about each one such as the owner and availability.

    


    """
    return web.Response(status=200)


async def retrieve_file(request: web.Request, file_id) -> web.Response:
    """Returns information about a specific file.

    

    :param file_id: The ID of the file to use for this request
    :type file_id: str

    """
    return web.Response(status=200)


async def retrieve_fine_tune(request: web.Request, fine_tune_id) -> web.Response:
    """Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 

    

    :param fine_tune_id: The ID of the fine-tune job 
    :type fine_tune_id: str

    """
    return web.Response(status=200)


async def retrieve_model(request: web.Request, model) -> web.Response:
    """Retrieves a model instance, providing basic information about the model such as the owner and permissioning.

    

    :param model: The ID of the model to use for this request
    :type model: str

    """
    return web.Response(status=200)
