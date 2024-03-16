import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.create_chat_completion_request import CreateChatCompletionRequest  # noqa: E501
from openapi_server.models.create_chat_completion_response import CreateChatCompletionResponse  # noqa: E501
from openapi_server.models.create_completion_request import CreateCompletionRequest  # noqa: E501
from openapi_server.models.create_completion_response import CreateCompletionResponse  # noqa: E501
from openapi_server.models.create_edit_request import CreateEditRequest  # noqa: E501
from openapi_server.models.create_edit_response import CreateEditResponse  # noqa: E501
from openapi_server.models.create_embedding_request import CreateEmbeddingRequest  # noqa: E501
from openapi_server.models.create_embedding_response import CreateEmbeddingResponse  # noqa: E501
from openapi_server.models.create_fine_tune_request import CreateFineTuneRequest  # noqa: E501
from openapi_server.models.create_image_request import CreateImageRequest  # noqa: E501
from openapi_server.models.create_moderation_request import CreateModerationRequest  # noqa: E501
from openapi_server.models.create_moderation_response import CreateModerationResponse  # noqa: E501
from openapi_server.models.create_transcription_request_model import CreateTranscriptionRequestModel  # noqa: E501
from openapi_server.models.create_transcription_response import CreateTranscriptionResponse  # noqa: E501
from openapi_server.models.create_translation_response import CreateTranslationResponse  # noqa: E501
from openapi_server.models.delete_file_response import DeleteFileResponse  # noqa: E501
from openapi_server.models.delete_model_response import DeleteModelResponse  # noqa: E501
from openapi_server.models.fine_tune import FineTune  # noqa: E501
from openapi_server.models.images_response import ImagesResponse  # noqa: E501
from openapi_server.models.list_files_response import ListFilesResponse  # noqa: E501
from openapi_server.models.list_fine_tune_events_response import ListFineTuneEventsResponse  # noqa: E501
from openapi_server.models.list_fine_tunes_response import ListFineTunesResponse  # noqa: E501
from openapi_server.models.list_models_response import ListModelsResponse  # noqa: E501
from openapi_server.models.model import Model  # noqa: E501
from openapi_server.models.open_ai_file import OpenAIFile  # noqa: E501
from openapi_server import util


def cancel_fine_tune(fine_tune_id):  # noqa: E501
    """Immediately cancel a fine-tune job. 

     # noqa: E501

    :param fine_tune_id: The ID of the fine-tune job to cancel 
    :type fine_tune_id: str

    :rtype: Union[FineTune, Tuple[FineTune, int], Tuple[FineTune, int, Dict[str, str]]
    """
    return 'do some magic!'


def create_chat_completion(create_chat_completion_request):  # noqa: E501
    """Creates a model response for the given chat conversation.

     # noqa: E501

    :param create_chat_completion_request: 
    :type create_chat_completion_request: dict | bytes

    :rtype: Union[CreateChatCompletionResponse, Tuple[CreateChatCompletionResponse, int], Tuple[CreateChatCompletionResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        create_chat_completion_request = CreateChatCompletionRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def create_completion(create_completion_request):  # noqa: E501
    """Creates a completion for the provided prompt and parameters.

     # noqa: E501

    :param create_completion_request: 
    :type create_completion_request: dict | bytes

    :rtype: Union[CreateCompletionResponse, Tuple[CreateCompletionResponse, int], Tuple[CreateCompletionResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        create_completion_request = CreateCompletionRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def create_edit(create_edit_request):  # noqa: E501
    """Creates a new edit for the provided input, instruction, and parameters.

     # noqa: E501

    :param create_edit_request: 
    :type create_edit_request: dict | bytes

    :rtype: Union[CreateEditResponse, Tuple[CreateEditResponse, int], Tuple[CreateEditResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        create_edit_request = CreateEditRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def create_embedding(create_embedding_request):  # noqa: E501
    """Creates an embedding vector representing the input text.

     # noqa: E501

    :param create_embedding_request: 
    :type create_embedding_request: dict | bytes

    :rtype: Union[CreateEmbeddingResponse, Tuple[CreateEmbeddingResponse, int], Tuple[CreateEmbeddingResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        create_embedding_request = CreateEmbeddingRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def create_file(file, purpose):  # noqa: E501
    """Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 

     # noqa: E501

    :param file: Name of the [JSON Lines](https://jsonlines.readthedocs.io/en/latest/) file to be uploaded.  If the &#x60;purpose&#x60; is set to \\\&quot;fine-tune\\\&quot;, each line is a JSON record with \\\&quot;prompt\\\&quot; and \\\&quot;completion\\\&quot; fields representing your [training examples](/docs/guides/fine-tuning/prepare-training-data). 
    :type file: str
    :param purpose: The intended purpose of the uploaded documents.  Use \\\&quot;fine-tune\\\&quot; for [Fine-tuning](/docs/api-reference/fine-tunes). This allows us to validate the format of the uploaded file. 
    :type purpose: str

    :rtype: Union[OpenAIFile, Tuple[OpenAIFile, int], Tuple[OpenAIFile, int, Dict[str, str]]
    """
    return 'do some magic!'


def create_fine_tune(create_fine_tune_request):  # noqa: E501
    """Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 

     # noqa: E501

    :param create_fine_tune_request: 
    :type create_fine_tune_request: dict | bytes

    :rtype: Union[FineTune, Tuple[FineTune, int], Tuple[FineTune, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        create_fine_tune_request = CreateFineTuneRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def create_image(create_image_request):  # noqa: E501
    """Creates an image given a prompt.

     # noqa: E501

    :param create_image_request: 
    :type create_image_request: dict | bytes

    :rtype: Union[ImagesResponse, Tuple[ImagesResponse, int], Tuple[ImagesResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        create_image_request = CreateImageRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def create_image_edit(image, prompt, mask=None, n=None, size=None, response_format=None, user=None):  # noqa: E501
    """Creates an edited or extended image given an original image and a prompt.

     # noqa: E501

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

    :rtype: Union[ImagesResponse, Tuple[ImagesResponse, int], Tuple[ImagesResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def create_image_variation(image, n=None, size=None, response_format=None, user=None):  # noqa: E501
    """Creates a variation of a given image.

     # noqa: E501

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

    :rtype: Union[ImagesResponse, Tuple[ImagesResponse, int], Tuple[ImagesResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def create_moderation(create_moderation_request):  # noqa: E501
    """Classifies if text violates OpenAI&#39;s Content Policy

     # noqa: E501

    :param create_moderation_request: 
    :type create_moderation_request: dict | bytes

    :rtype: Union[CreateModerationResponse, Tuple[CreateModerationResponse, int], Tuple[CreateModerationResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        create_moderation_request = CreateModerationRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def create_transcription(file, model, prompt=None, response_format=None, temperature=None, language=None):  # noqa: E501
    """Transcribes audio into the input language.

     # noqa: E501

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

    :rtype: Union[CreateTranscriptionResponse, Tuple[CreateTranscriptionResponse, int], Tuple[CreateTranscriptionResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        model = CreateTranscriptionRequestModel.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def create_translation(file, model, prompt=None, response_format=None, temperature=None):  # noqa: E501
    """Translates audio into English.

     # noqa: E501

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

    :rtype: Union[CreateTranslationResponse, Tuple[CreateTranslationResponse, int], Tuple[CreateTranslationResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        model = CreateTranscriptionRequestModel.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_file(file_id):  # noqa: E501
    """Delete a file.

     # noqa: E501

    :param file_id: The ID of the file to use for this request
    :type file_id: str

    :rtype: Union[DeleteFileResponse, Tuple[DeleteFileResponse, int], Tuple[DeleteFileResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_model(model):  # noqa: E501
    """Delete a fine-tuned model. You must have the Owner role in your organization.

     # noqa: E501

    :param model: The model to delete
    :type model: str

    :rtype: Union[DeleteModelResponse, Tuple[DeleteModelResponse, int], Tuple[DeleteModelResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def download_file(file_id):  # noqa: E501
    """Returns the contents of the specified file

     # noqa: E501

    :param file_id: The ID of the file to use for this request
    :type file_id: str

    :rtype: Union[str, Tuple[str, int], Tuple[str, int, Dict[str, str]]
    """
    return 'do some magic!'


def list_files():  # noqa: E501
    """Returns a list of files that belong to the user&#39;s organization.

     # noqa: E501


    :rtype: Union[ListFilesResponse, Tuple[ListFilesResponse, int], Tuple[ListFilesResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def list_fine_tune_events(fine_tune_id, stream=None):  # noqa: E501
    """Get fine-grained status updates for a fine-tune job. 

     # noqa: E501

    :param fine_tune_id: The ID of the fine-tune job to get events for. 
    :type fine_tune_id: str
    :param stream: Whether to stream events for the fine-tune job. If set to true, events will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available. The stream will terminate with a &#x60;data: [DONE]&#x60; message when the job is finished (succeeded, cancelled, or failed).  If set to false, only events generated so far will be returned. 
    :type stream: bool

    :rtype: Union[ListFineTuneEventsResponse, Tuple[ListFineTuneEventsResponse, int], Tuple[ListFineTuneEventsResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def list_fine_tunes():  # noqa: E501
    """List your organization&#39;s fine-tuning jobs 

     # noqa: E501


    :rtype: Union[ListFineTunesResponse, Tuple[ListFineTunesResponse, int], Tuple[ListFineTunesResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def list_models():  # noqa: E501
    """Lists the currently available models, and provides basic information about each one such as the owner and availability.

     # noqa: E501


    :rtype: Union[ListModelsResponse, Tuple[ListModelsResponse, int], Tuple[ListModelsResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def retrieve_file(file_id):  # noqa: E501
    """Returns information about a specific file.

     # noqa: E501

    :param file_id: The ID of the file to use for this request
    :type file_id: str

    :rtype: Union[OpenAIFile, Tuple[OpenAIFile, int], Tuple[OpenAIFile, int, Dict[str, str]]
    """
    return 'do some magic!'


def retrieve_fine_tune(fine_tune_id):  # noqa: E501
    """Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 

     # noqa: E501

    :param fine_tune_id: The ID of the fine-tune job 
    :type fine_tune_id: str

    :rtype: Union[FineTune, Tuple[FineTune, int], Tuple[FineTune, int, Dict[str, str]]
    """
    return 'do some magic!'


def retrieve_model(model):  # noqa: E501
    """Retrieves a model instance, providing basic information about the model such as the owner and permissioning.

     # noqa: E501

    :param model: The ID of the model to use for this request
    :type model: str

    :rtype: Union[Model, Tuple[Model, int], Tuple[Model, int, Dict[str, str]]
    """
    return 'do some magic!'
