# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from openapi_server.models.assistant_file_object import AssistantFileObject
from openapi_server.models.assistant_object import AssistantObject
from openapi_server.models.create_assistant_file_request import CreateAssistantFileRequest
from openapi_server.models.create_assistant_request import CreateAssistantRequest
from openapi_server.models.create_message_request import CreateMessageRequest
from openapi_server.models.create_run_request import CreateRunRequest
from openapi_server.models.create_thread_and_run_request import CreateThreadAndRunRequest
from openapi_server.models.create_thread_request import CreateThreadRequest
from openapi_server.models.delete_assistant_file_response import DeleteAssistantFileResponse
from openapi_server.models.delete_assistant_response import DeleteAssistantResponse
from openapi_server.models.delete_thread_response import DeleteThreadResponse
from openapi_server.models.list_assistant_files_response import ListAssistantFilesResponse
from openapi_server.models.list_assistants_response import ListAssistantsResponse
from openapi_server.models.list_message_files_response import ListMessageFilesResponse
from openapi_server.models.list_messages_response import ListMessagesResponse
from openapi_server.models.list_run_steps_response import ListRunStepsResponse
from openapi_server.models.list_runs_response import ListRunsResponse
from openapi_server.models.message_file_object import MessageFileObject
from openapi_server.models.message_object import MessageObject
from openapi_server.models.modify_assistant_request import ModifyAssistantRequest
from openapi_server.models.modify_message_request import ModifyMessageRequest
from openapi_server.models.modify_run_request import ModifyRunRequest
from openapi_server.models.modify_thread_request import ModifyThreadRequest
from openapi_server.models.run_object import RunObject
from openapi_server.models.run_step_object import RunStepObject
from openapi_server.models.submit_tool_outputs_run_request import SubmitToolOutputsRunRequest
from openapi_server.models.thread_object import ThreadObject
from openapi_server.security_api import get_token_ApiKeyAuth

class BaseAssistantsApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseAssistantsApi.subclasses = BaseAssistantsApi.subclasses + (cls,)
    async def cancel_run(
        self,
        thread_id: str,
        run_id: str,
    ) -> RunObject:
        ...


    async def create_assistant(
        self,
        create_assistant_request: CreateAssistantRequest,
    ) -> AssistantObject:
        ...


    async def create_assistant_file(
        self,
        assistant_id: str,
        create_assistant_file_request: CreateAssistantFileRequest,
    ) -> AssistantFileObject:
        ...


    async def create_message(
        self,
        thread_id: str,
        create_message_request: CreateMessageRequest,
    ) -> MessageObject:
        ...


    async def create_run(
        self,
        thread_id: str,
        create_run_request: CreateRunRequest,
    ) -> RunObject:
        ...


    async def create_thread(
        self,
        create_thread_request: CreateThreadRequest,
    ) -> ThreadObject:
        ...


    async def create_thread_and_run(
        self,
        create_thread_and_run_request: CreateThreadAndRunRequest,
    ) -> RunObject:
        ...


    async def delete_assistant(
        self,
        assistant_id: str,
    ) -> DeleteAssistantResponse:
        ...


    async def delete_assistant_file(
        self,
        assistant_id: str,
        file_id: str,
    ) -> DeleteAssistantFileResponse:
        ...


    async def delete_thread(
        self,
        thread_id: str,
    ) -> DeleteThreadResponse:
        ...


    async def get_assistant(
        self,
        assistant_id: str,
    ) -> AssistantObject:
        ...


    async def get_assistant_file(
        self,
        assistant_id: str,
        file_id: str,
    ) -> AssistantFileObject:
        ...


    async def get_message(
        self,
        thread_id: str,
        message_id: str,
    ) -> MessageObject:
        ...


    async def get_message_file(
        self,
        thread_id: str,
        message_id: str,
        file_id: str,
    ) -> MessageFileObject:
        ...


    async def get_run(
        self,
        thread_id: str,
        run_id: str,
    ) -> RunObject:
        ...


    async def get_run_step(
        self,
        thread_id: str,
        run_id: str,
        step_id: str,
    ) -> RunStepObject:
        ...


    async def get_thread(
        self,
        thread_id: str,
    ) -> ThreadObject:
        ...


    async def list_assistant_files(
        self,
        assistant_id: str,
        limit: int,
        order: str,
        after: str,
        before: str,
    ) -> ListAssistantFilesResponse:
        ...


    async def list_assistants(
        self,
        limit: int,
        order: str,
        after: str,
        before: str,
    ) -> ListAssistantsResponse:
        ...


    async def list_message_files(
        self,
        thread_id: str,
        message_id: str,
        limit: int,
        order: str,
        after: str,
        before: str,
    ) -> ListMessageFilesResponse:
        ...


    async def list_messages(
        self,
        thread_id: str,
        limit: int,
        order: str,
        after: str,
        before: str,
        run_id: str,
    ) -> ListMessagesResponse:
        ...


    async def list_run_steps(
        self,
        thread_id: str,
        run_id: str,
        limit: int,
        order: str,
        after: str,
        before: str,
    ) -> ListRunStepsResponse:
        ...


    async def list_runs(
        self,
        thread_id: str,
        limit: int,
        order: str,
        after: str,
        before: str,
    ) -> ListRunsResponse:
        ...


    async def modify_assistant(
        self,
        assistant_id: str,
        modify_assistant_request: ModifyAssistantRequest,
    ) -> AssistantObject:
        ...


    async def modify_message(
        self,
        thread_id: str,
        message_id: str,
        modify_message_request: ModifyMessageRequest,
    ) -> MessageObject:
        ...


    async def modify_run(
        self,
        thread_id: str,
        run_id: str,
        modify_run_request: ModifyRunRequest,
    ) -> RunObject:
        ...


    async def modify_thread(
        self,
        thread_id: str,
        modify_thread_request: ModifyThreadRequest,
    ) -> ThreadObject:
        ...


    async def submit_tool_ouputs_to_run(
        self,
        thread_id: str,
        run_id: str,
        submit_tool_outputs_run_request: SubmitToolOutputsRunRequest,
    ) -> RunObject:
        ...
