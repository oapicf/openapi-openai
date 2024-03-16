# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.open_ai_api_base import BaseOpenAIApi
import openapi_server.impl

from fastapi import (  # noqa: F401
    APIRouter,
    Body,
    Cookie,
    Depends,
    Form,
    Header,
    Path,
    Query,
    Response,
    Security,
    status,
)

from openapi_server.models.extra_models import TokenModel  # noqa: F401
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


router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.post(
    "/fine-tunes/{fine_tune_id}/cancel",
    responses={
        200: {"model": FineTune, "description": "OK"},
    },
    tags=["OpenAI"],
    summary="Immediately cancel a fine-tune job. ",
    response_model_by_alias=True,
)
async def cancel_fine_tune(
    fine_tune_id: str = Path(..., description="The ID of the fine-tune job to cancel "),
) -> FineTune:
    ...


@router.post(
    "/chat/completions",
    responses={
        200: {"model": CreateChatCompletionResponse, "description": "OK"},
    },
    tags=["OpenAI"],
    summary="Creates a model response for the given chat conversation.",
    response_model_by_alias=True,
)
async def create_chat_completion(
    create_chat_completion_request: CreateChatCompletionRequest = Body(None, description=""),
) -> CreateChatCompletionResponse:
    ...


@router.post(
    "/completions",
    responses={
        200: {"model": CreateCompletionResponse, "description": "OK"},
    },
    tags=["OpenAI"],
    summary="Creates a completion for the provided prompt and parameters.",
    response_model_by_alias=True,
)
async def create_completion(
    create_completion_request: CreateCompletionRequest = Body(None, description=""),
) -> CreateCompletionResponse:
    ...


@router.post(
    "/edits",
    responses={
        200: {"model": CreateEditResponse, "description": "OK"},
    },
    tags=["OpenAI"],
    summary="Creates a new edit for the provided input, instruction, and parameters.",
    response_model_by_alias=True,
)
async def create_edit(
    create_edit_request: CreateEditRequest = Body(None, description=""),
) -> CreateEditResponse:
    ...


@router.post(
    "/embeddings",
    responses={
        200: {"model": CreateEmbeddingResponse, "description": "OK"},
    },
    tags=["OpenAI"],
    summary="Creates an embedding vector representing the input text.",
    response_model_by_alias=True,
)
async def create_embedding(
    create_embedding_request: CreateEmbeddingRequest = Body(None, description=""),
) -> CreateEmbeddingResponse:
    ...


@router.post(
    "/files",
    responses={
        200: {"model": OpenAIFile, "description": "OK"},
    },
    tags=["OpenAI"],
    summary="Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. ",
    response_model_by_alias=True,
)
async def create_file(
    file: str = Form(None, description="Name of the [JSON Lines](https://jsonlines.readthedocs.io/en/latest/) file to be uploaded.  If the &#x60;purpose&#x60; is set to \\\&quot;fine-tune\\\&quot;, each line is a JSON record with \\\&quot;prompt\\\&quot; and \\\&quot;completion\\\&quot; fields representing your [training examples](/docs/guides/fine-tuning/prepare-training-data). "),
    purpose: str = Form(None, description="The intended purpose of the uploaded documents.  Use \\\&quot;fine-tune\\\&quot; for [Fine-tuning](/docs/api-reference/fine-tunes). This allows us to validate the format of the uploaded file. "),
) -> OpenAIFile:
    ...


@router.post(
    "/fine-tunes",
    responses={
        200: {"model": FineTune, "description": "OK"},
    },
    tags=["OpenAI"],
    summary="Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) ",
    response_model_by_alias=True,
)
async def create_fine_tune(
    create_fine_tune_request: CreateFineTuneRequest = Body(None, description=""),
) -> FineTune:
    ...


@router.post(
    "/images/generations",
    responses={
        200: {"model": ImagesResponse, "description": "OK"},
    },
    tags=["OpenAI"],
    summary="Creates an image given a prompt.",
    response_model_by_alias=True,
)
async def create_image(
    create_image_request: CreateImageRequest = Body(None, description=""),
) -> ImagesResponse:
    ...


@router.post(
    "/images/edits",
    responses={
        200: {"model": ImagesResponse, "description": "OK"},
    },
    tags=["OpenAI"],
    summary="Creates an edited or extended image given an original image and a prompt.",
    response_model_by_alias=True,
)
async def create_image_edit(
    image: str = Form(None, description="The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask."),
    prompt: str = Form(None, description="A text description of the desired image(s). The maximum length is 1000 characters."),
    mask: str = Form(None, description="An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where &#x60;image&#x60; should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as &#x60;image&#x60;."),
    n: int = Form(1, description="The number of images to generate. Must be between 1 and 10.", ge=1, le=10),
    size: str = Form('1024x1024', description="The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;."),
    response_format: str = Form('url', description="The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;."),
    user: str = Form(None, description="A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). "),
) -> ImagesResponse:
    ...


@router.post(
    "/images/variations",
    responses={
        200: {"model": ImagesResponse, "description": "OK"},
    },
    tags=["OpenAI"],
    summary="Creates a variation of a given image.",
    response_model_by_alias=True,
)
async def create_image_variation(
    image: str = Form(None, description="The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square."),
    n: int = Form(1, description="The number of images to generate. Must be between 1 and 10.", ge=1, le=10),
    size: str = Form('1024x1024', description="The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;."),
    response_format: str = Form('url', description="The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;."),
    user: str = Form(None, description="A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). "),
) -> ImagesResponse:
    ...


@router.post(
    "/moderations",
    responses={
        200: {"model": CreateModerationResponse, "description": "OK"},
    },
    tags=["OpenAI"],
    summary="Classifies if text violates OpenAI&#39;s Content Policy",
    response_model_by_alias=True,
)
async def create_moderation(
    create_moderation_request: CreateModerationRequest = Body(None, description=""),
) -> CreateModerationResponse:
    ...


@router.post(
    "/audio/transcriptions",
    responses={
        200: {"model": CreateTranscriptionResponse, "description": "OK"},
    },
    tags=["OpenAI"],
    summary="Transcribes audio into the input language.",
    response_model_by_alias=True,
)
async def create_transcription(
    file: str = Form(None, description="The audio file object (not file name) to transcribe, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm. "),
    model: CreateTranscriptionRequestModel = Form(None, description=""),
    prompt: str = Form(None, description="An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language. "),
    response_format: str = Form('json', description="The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt. "),
    temperature:  = Form(0, description="The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. "),
    language: str = Form(None, description="The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency. "),
) -> CreateTranscriptionResponse:
    ...


@router.post(
    "/audio/translations",
    responses={
        200: {"model": CreateTranslationResponse, "description": "OK"},
    },
    tags=["OpenAI"],
    summary="Translates audio into English.",
    response_model_by_alias=True,
)
async def create_translation(
    file: str = Form(None, description="The audio file object (not file name) translate, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm. "),
    model: CreateTranscriptionRequestModel = Form(None, description=""),
    prompt: str = Form(None, description="An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English. "),
    response_format: str = Form('json', description="The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt. "),
    temperature:  = Form(0, description="The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. "),
) -> CreateTranslationResponse:
    ...


@router.delete(
    "/files/{file_id}",
    responses={
        200: {"model": DeleteFileResponse, "description": "OK"},
    },
    tags=["OpenAI"],
    summary="Delete a file.",
    response_model_by_alias=True,
)
async def delete_file(
    file_id: str = Path(..., description="The ID of the file to use for this request"),
) -> DeleteFileResponse:
    ...


@router.delete(
    "/models/{model}",
    responses={
        200: {"model": DeleteModelResponse, "description": "OK"},
    },
    tags=["OpenAI"],
    summary="Delete a fine-tuned model. You must have the Owner role in your organization.",
    response_model_by_alias=True,
)
async def delete_model(
    model: str = Path(..., description="The model to delete"),
) -> DeleteModelResponse:
    ...


@router.get(
    "/files/{file_id}/content",
    responses={
        200: {"model": str, "description": "OK"},
    },
    tags=["OpenAI"],
    summary="Returns the contents of the specified file",
    response_model_by_alias=True,
)
async def download_file(
    file_id: str = Path(..., description="The ID of the file to use for this request"),
) -> str:
    ...


@router.get(
    "/files",
    responses={
        200: {"model": ListFilesResponse, "description": "OK"},
    },
    tags=["OpenAI"],
    summary="Returns a list of files that belong to the user&#39;s organization.",
    response_model_by_alias=True,
)
async def list_files(
) -> ListFilesResponse:
    ...


@router.get(
    "/fine-tunes/{fine_tune_id}/events",
    responses={
        200: {"model": ListFineTuneEventsResponse, "description": "OK"},
    },
    tags=["OpenAI"],
    summary="Get fine-grained status updates for a fine-tune job. ",
    response_model_by_alias=True,
)
async def list_fine_tune_events(
    fine_tune_id: str = Path(..., description="The ID of the fine-tune job to get events for. "),
    stream: bool = Query(False, description="Whether to stream events for the fine-tune job. If set to true, events will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available. The stream will terminate with a &#x60;data: [DONE]&#x60; message when the job is finished (succeeded, cancelled, or failed).  If set to false, only events generated so far will be returned. ", alias="stream"),
) -> ListFineTuneEventsResponse:
    ...


@router.get(
    "/fine-tunes",
    responses={
        200: {"model": ListFineTunesResponse, "description": "OK"},
    },
    tags=["OpenAI"],
    summary="List your organization&#39;s fine-tuning jobs ",
    response_model_by_alias=True,
)
async def list_fine_tunes(
) -> ListFineTunesResponse:
    ...


@router.get(
    "/models",
    responses={
        200: {"model": ListModelsResponse, "description": "OK"},
    },
    tags=["OpenAI"],
    summary="Lists the currently available models, and provides basic information about each one such as the owner and availability.",
    response_model_by_alias=True,
)
async def list_models(
) -> ListModelsResponse:
    ...


@router.get(
    "/files/{file_id}",
    responses={
        200: {"model": OpenAIFile, "description": "OK"},
    },
    tags=["OpenAI"],
    summary="Returns information about a specific file.",
    response_model_by_alias=True,
)
async def retrieve_file(
    file_id: str = Path(..., description="The ID of the file to use for this request"),
) -> OpenAIFile:
    ...


@router.get(
    "/fine-tunes/{fine_tune_id}",
    responses={
        200: {"model": FineTune, "description": "OK"},
    },
    tags=["OpenAI"],
    summary="Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) ",
    response_model_by_alias=True,
)
async def retrieve_fine_tune(
    fine_tune_id: str = Path(..., description="The ID of the fine-tune job "),
) -> FineTune:
    ...


@router.get(
    "/models/{model}",
    responses={
        200: {"model": Model, "description": "OK"},
    },
    tags=["OpenAI"],
    summary="Retrieves a model instance, providing basic information about the model such as the owner and permissioning.",
    response_model_by_alias=True,
)
async def retrieve_model(
    model: str = Path(..., description="The ID of the model to use for this request"),
) -> Model:
    ...
