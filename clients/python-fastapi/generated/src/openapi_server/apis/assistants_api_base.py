# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import Field, StrictInt, StrictStr, field_validator
from typing import List, Optional
from typing_extensions import Annotated
from openapi_server.models.assistant_object import AssistantObject
from openapi_server.models.create_assistant_request import CreateAssistantRequest
from openapi_server.models.create_message_request import CreateMessageRequest
from openapi_server.models.create_run_request import CreateRunRequest
from openapi_server.models.create_thread_and_run_request import CreateThreadAndRunRequest
from openapi_server.models.create_thread_request import CreateThreadRequest
from openapi_server.models.delete_assistant_response import DeleteAssistantResponse
from openapi_server.models.delete_message_response import DeleteMessageResponse
from openapi_server.models.delete_thread_response import DeleteThreadResponse
from openapi_server.models.list_assistants_response import ListAssistantsResponse
from openapi_server.models.list_messages_response import ListMessagesResponse
from openapi_server.models.list_run_steps_response import ListRunStepsResponse
from openapi_server.models.list_runs_response import ListRunsResponse
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
    async def list_assistants(
        self,
        limit: Annotated[Optional[StrictInt], Field(description="A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ")],
        order: Annotated[Optional[StrictStr], Field(description="Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. ")],
        after: Annotated[Optional[StrictStr], Field(description="A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ")],
        before: Annotated[Optional[StrictStr], Field(description="A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. ")],
    ) -> ListAssistantsResponse:
        ...


    async def create_assistant(
        self,
        create_assistant_request: CreateAssistantRequest,
    ) -> AssistantObject:
        ...


    async def get_assistant(
        self,
        assistant_id: Annotated[StrictStr, Field(description="The ID of the assistant to retrieve.")],
    ) -> AssistantObject:
        ...


    async def modify_assistant(
        self,
        assistant_id: Annotated[StrictStr, Field(description="The ID of the assistant to modify.")],
        modify_assistant_request: ModifyAssistantRequest,
    ) -> AssistantObject:
        ...


    async def delete_assistant(
        self,
        assistant_id: Annotated[StrictStr, Field(description="The ID of the assistant to delete.")],
    ) -> DeleteAssistantResponse:
        ...


    async def create_thread(
        self,
        create_thread_request: Optional[CreateThreadRequest],
    ) -> ThreadObject:
        ...


    async def create_thread_and_run(
        self,
        create_thread_and_run_request: CreateThreadAndRunRequest,
    ) -> RunObject:
        ...


    async def get_thread(
        self,
        thread_id: Annotated[StrictStr, Field(description="The ID of the thread to retrieve.")],
    ) -> ThreadObject:
        ...


    async def modify_thread(
        self,
        thread_id: Annotated[StrictStr, Field(description="The ID of the thread to modify. Only the `metadata` can be modified.")],
        modify_thread_request: ModifyThreadRequest,
    ) -> ThreadObject:
        ...


    async def delete_thread(
        self,
        thread_id: Annotated[StrictStr, Field(description="The ID of the thread to delete.")],
    ) -> DeleteThreadResponse:
        ...


    async def list_messages(
        self,
        thread_id: Annotated[StrictStr, Field(description="The ID of the [thread](/docs/api-reference/threads) the messages belong to.")],
        limit: Annotated[Optional[StrictInt], Field(description="A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ")],
        order: Annotated[Optional[StrictStr], Field(description="Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. ")],
        after: Annotated[Optional[StrictStr], Field(description="A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ")],
        before: Annotated[Optional[StrictStr], Field(description="A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. ")],
        run_id: Annotated[Optional[StrictStr], Field(description="Filter messages by the run ID that generated them. ")],
    ) -> ListMessagesResponse:
        ...


    async def create_message(
        self,
        thread_id: Annotated[StrictStr, Field(description="The ID of the [thread](/docs/api-reference/threads) to create a message for.")],
        create_message_request: CreateMessageRequest,
    ) -> MessageObject:
        ...


    async def get_message(
        self,
        thread_id: Annotated[StrictStr, Field(description="The ID of the [thread](/docs/api-reference/threads) to which this message belongs.")],
        message_id: Annotated[StrictStr, Field(description="The ID of the message to retrieve.")],
    ) -> MessageObject:
        ...


    async def modify_message(
        self,
        thread_id: Annotated[StrictStr, Field(description="The ID of the thread to which this message belongs.")],
        message_id: Annotated[StrictStr, Field(description="The ID of the message to modify.")],
        modify_message_request: ModifyMessageRequest,
    ) -> MessageObject:
        ...


    async def delete_message(
        self,
        thread_id: Annotated[StrictStr, Field(description="The ID of the thread to which this message belongs.")],
        message_id: Annotated[StrictStr, Field(description="The ID of the message to delete.")],
    ) -> DeleteMessageResponse:
        ...


    async def list_runs(
        self,
        thread_id: Annotated[StrictStr, Field(description="The ID of the thread the run belongs to.")],
        limit: Annotated[Optional[StrictInt], Field(description="A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ")],
        order: Annotated[Optional[StrictStr], Field(description="Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. ")],
        after: Annotated[Optional[StrictStr], Field(description="A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ")],
        before: Annotated[Optional[StrictStr], Field(description="A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. ")],
    ) -> ListRunsResponse:
        ...


    async def create_run(
        self,
        thread_id: Annotated[StrictStr, Field(description="The ID of the thread to run.")],
        create_run_request: CreateRunRequest,
        include: Annotated[Optional[List[StrictStr]], Field(description="A list of additional fields to include in the response. Currently the only supported value is `step_details.tool_calls[*].file_search.results[*].content` to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. ")],
    ) -> RunObject:
        ...


    async def get_run(
        self,
        thread_id: Annotated[StrictStr, Field(description="The ID of the [thread](/docs/api-reference/threads) that was run.")],
        run_id: Annotated[StrictStr, Field(description="The ID of the run to retrieve.")],
    ) -> RunObject:
        ...


    async def modify_run(
        self,
        thread_id: Annotated[StrictStr, Field(description="The ID of the [thread](/docs/api-reference/threads) that was run.")],
        run_id: Annotated[StrictStr, Field(description="The ID of the run to modify.")],
        modify_run_request: ModifyRunRequest,
    ) -> RunObject:
        ...


    async def cancel_run(
        self,
        thread_id: Annotated[StrictStr, Field(description="The ID of the thread to which this run belongs.")],
        run_id: Annotated[StrictStr, Field(description="The ID of the run to cancel.")],
    ) -> RunObject:
        ...


    async def list_run_steps(
        self,
        thread_id: Annotated[StrictStr, Field(description="The ID of the thread the run and run steps belong to.")],
        run_id: Annotated[StrictStr, Field(description="The ID of the run the run steps belong to.")],
        limit: Annotated[Optional[StrictInt], Field(description="A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ")],
        order: Annotated[Optional[StrictStr], Field(description="Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. ")],
        after: Annotated[Optional[StrictStr], Field(description="A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ")],
        before: Annotated[Optional[StrictStr], Field(description="A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. ")],
        include: Annotated[Optional[List[StrictStr]], Field(description="A list of additional fields to include in the response. Currently the only supported value is `step_details.tool_calls[*].file_search.results[*].content` to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. ")],
    ) -> ListRunStepsResponse:
        ...


    async def get_run_step(
        self,
        thread_id: Annotated[StrictStr, Field(description="The ID of the thread to which the run and run step belongs.")],
        run_id: Annotated[StrictStr, Field(description="The ID of the run to which the run step belongs.")],
        step_id: Annotated[StrictStr, Field(description="The ID of the run step to retrieve.")],
        include: Annotated[Optional[List[StrictStr]], Field(description="A list of additional fields to include in the response. Currently the only supported value is `step_details.tool_calls[*].file_search.results[*].content` to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. ")],
    ) -> RunStepObject:
        ...


    async def submit_tool_ouputs_to_run(
        self,
        thread_id: Annotated[StrictStr, Field(description="The ID of the [thread](/docs/api-reference/threads) to which this run belongs.")],
        run_id: Annotated[StrictStr, Field(description="The ID of the run that requires the tool output submission.")],
        submit_tool_outputs_run_request: SubmitToolOutputsRunRequest,
    ) -> RunObject:
        ...
