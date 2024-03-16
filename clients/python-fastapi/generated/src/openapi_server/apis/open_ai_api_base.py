# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

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


class BaseOpenAIApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseOpenAIApi.subclasses = BaseOpenAIApi.subclasses + (cls,)
    def cancel_fine_tune(
        self,
        fine_tune_id: str,
    ) -> FineTune:
        ...


    def create_chat_completion(
        self,
        create_chat_completion_request: CreateChatCompletionRequest,
    ) -> CreateChatCompletionResponse:
        ...


    def create_completion(
        self,
        create_completion_request: CreateCompletionRequest,
    ) -> CreateCompletionResponse:
        ...


    def create_edit(
        self,
        create_edit_request: CreateEditRequest,
    ) -> CreateEditResponse:
        ...


    def create_embedding(
        self,
        create_embedding_request: CreateEmbeddingRequest,
    ) -> CreateEmbeddingResponse:
        ...


    def create_file(
        self,
        file: str,
        purpose: str,
    ) -> OpenAIFile:
        ...


    def create_fine_tune(
        self,
        create_fine_tune_request: CreateFineTuneRequest,
    ) -> FineTune:
        ...


    def create_image(
        self,
        create_image_request: CreateImageRequest,
    ) -> ImagesResponse:
        ...


    def create_image_edit(
        self,
        image: str,
        prompt: str,
        mask: str,
        n: int,
        size: str,
        response_format: str,
        user: str,
    ) -> ImagesResponse:
        ...


    def create_image_variation(
        self,
        image: str,
        n: int,
        size: str,
        response_format: str,
        user: str,
    ) -> ImagesResponse:
        ...


    def create_moderation(
        self,
        create_moderation_request: CreateModerationRequest,
    ) -> CreateModerationResponse:
        ...


    def create_transcription(
        self,
        file: str,
        model: CreateTranscriptionRequestModel,
        prompt: str,
        response_format: str,
        temperature: ,
        language: str,
    ) -> CreateTranscriptionResponse:
        ...


    def create_translation(
        self,
        file: str,
        model: CreateTranscriptionRequestModel,
        prompt: str,
        response_format: str,
        temperature: ,
    ) -> CreateTranslationResponse:
        ...


    def delete_file(
        self,
        file_id: str,
    ) -> DeleteFileResponse:
        ...


    def delete_model(
        self,
        model: str,
    ) -> DeleteModelResponse:
        ...


    def download_file(
        self,
        file_id: str,
    ) -> str:
        ...


    def list_files(
        self,
    ) -> ListFilesResponse:
        ...


    def list_fine_tune_events(
        self,
        fine_tune_id: str,
        stream: bool,
    ) -> ListFineTuneEventsResponse:
        ...


    def list_fine_tunes(
        self,
    ) -> ListFineTunesResponse:
        ...


    def list_models(
        self,
    ) -> ListModelsResponse:
        ...


    def retrieve_file(
        self,
        file_id: str,
    ) -> OpenAIFile:
        ...


    def retrieve_fine_tune(
        self,
        fine_tune_id: str,
    ) -> FineTune:
        ...


    def retrieve_model(
        self,
        model: str,
    ) -> Model:
        ...
