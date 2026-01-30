# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.assistants_api_base import BaseAssistantsApi
import openapi_server.impl

from fastapi import (  # noqa: F401
    APIRouter,
    Body,
    Cookie,
    Depends,
    Form,
    Header,
    HTTPException,
    Path,
    Query,
    Response,
    Security,
    status,
)

from openapi_server.models.extra_models import TokenModel  # noqa: F401
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

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/assistants",
    responses={
        200: {"model": ListAssistantsResponse, "description": "OK"},
    },
    tags=["Assistants"],
    summary="Returns a list of assistants.",
    response_model_by_alias=True,
)
async def list_assistants(
    limit: Annotated[Optional[StrictInt], Field(description="A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ")] = Query(20, description="A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", alias="limit"),
    order: Annotated[Optional[StrictStr], Field(description="Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. ")] = Query(desc, description="Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. ", alias="order"),
    after: Annotated[Optional[StrictStr], Field(description="A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ")] = Query(None, description="A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ", alias="after"),
    before: Annotated[Optional[StrictStr], Field(description="A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. ")] = Query(None, description="A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. ", alias="before"),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> ListAssistantsResponse:
    if not BaseAssistantsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAssistantsApi.subclasses[0]().list_assistants(limit, order, after, before)


@router.post(
    "/assistants",
    responses={
        200: {"model": AssistantObject, "description": "OK"},
    },
    tags=["Assistants"],
    summary="Create an assistant with a model and instructions.",
    response_model_by_alias=True,
)
async def create_assistant(
    create_assistant_request: CreateAssistantRequest = Body(None, description=""),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> AssistantObject:
    if not BaseAssistantsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAssistantsApi.subclasses[0]().create_assistant(create_assistant_request)


@router.get(
    "/assistants/{assistant_id}",
    responses={
        200: {"model": AssistantObject, "description": "OK"},
    },
    tags=["Assistants"],
    summary="Retrieves an assistant.",
    response_model_by_alias=True,
)
async def get_assistant(
    assistant_id: Annotated[StrictStr, Field(description="The ID of the assistant to retrieve.")] = Path(..., description="The ID of the assistant to retrieve."),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> AssistantObject:
    if not BaseAssistantsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAssistantsApi.subclasses[0]().get_assistant(assistant_id)


@router.post(
    "/assistants/{assistant_id}",
    responses={
        200: {"model": AssistantObject, "description": "OK"},
    },
    tags=["Assistants"],
    summary="Modifies an assistant.",
    response_model_by_alias=True,
)
async def modify_assistant(
    assistant_id: Annotated[StrictStr, Field(description="The ID of the assistant to modify.")] = Path(..., description="The ID of the assistant to modify."),
    modify_assistant_request: ModifyAssistantRequest = Body(None, description=""),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> AssistantObject:
    if not BaseAssistantsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAssistantsApi.subclasses[0]().modify_assistant(assistant_id, modify_assistant_request)


@router.delete(
    "/assistants/{assistant_id}",
    responses={
        200: {"model": DeleteAssistantResponse, "description": "OK"},
    },
    tags=["Assistants"],
    summary="Delete an assistant.",
    response_model_by_alias=True,
)
async def delete_assistant(
    assistant_id: Annotated[StrictStr, Field(description="The ID of the assistant to delete.")] = Path(..., description="The ID of the assistant to delete."),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> DeleteAssistantResponse:
    if not BaseAssistantsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAssistantsApi.subclasses[0]().delete_assistant(assistant_id)


@router.post(
    "/threads",
    responses={
        200: {"model": ThreadObject, "description": "OK"},
    },
    tags=["Assistants"],
    summary="Create a thread.",
    response_model_by_alias=True,
)
async def create_thread(
    create_thread_request: Optional[CreateThreadRequest] = Body(None, description=""),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> ThreadObject:
    if not BaseAssistantsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAssistantsApi.subclasses[0]().create_thread(create_thread_request)


@router.post(
    "/threads/runs",
    responses={
        200: {"model": RunObject, "description": "OK"},
    },
    tags=["Assistants"],
    summary="Create a thread and run it in one request.",
    response_model_by_alias=True,
)
async def create_thread_and_run(
    create_thread_and_run_request: CreateThreadAndRunRequest = Body(None, description=""),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> RunObject:
    if not BaseAssistantsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAssistantsApi.subclasses[0]().create_thread_and_run(create_thread_and_run_request)


@router.get(
    "/threads/{thread_id}",
    responses={
        200: {"model": ThreadObject, "description": "OK"},
    },
    tags=["Assistants"],
    summary="Retrieves a thread.",
    response_model_by_alias=True,
)
async def get_thread(
    thread_id: Annotated[StrictStr, Field(description="The ID of the thread to retrieve.")] = Path(..., description="The ID of the thread to retrieve."),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> ThreadObject:
    if not BaseAssistantsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAssistantsApi.subclasses[0]().get_thread(thread_id)


@router.post(
    "/threads/{thread_id}",
    responses={
        200: {"model": ThreadObject, "description": "OK"},
    },
    tags=["Assistants"],
    summary="Modifies a thread.",
    response_model_by_alias=True,
)
async def modify_thread(
    thread_id: Annotated[StrictStr, Field(description="The ID of the thread to modify. Only the `metadata` can be modified.")] = Path(..., description="The ID of the thread to modify. Only the &#x60;metadata&#x60; can be modified."),
    modify_thread_request: ModifyThreadRequest = Body(None, description=""),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> ThreadObject:
    if not BaseAssistantsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAssistantsApi.subclasses[0]().modify_thread(thread_id, modify_thread_request)


@router.delete(
    "/threads/{thread_id}",
    responses={
        200: {"model": DeleteThreadResponse, "description": "OK"},
    },
    tags=["Assistants"],
    summary="Delete a thread.",
    response_model_by_alias=True,
)
async def delete_thread(
    thread_id: Annotated[StrictStr, Field(description="The ID of the thread to delete.")] = Path(..., description="The ID of the thread to delete."),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> DeleteThreadResponse:
    if not BaseAssistantsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAssistantsApi.subclasses[0]().delete_thread(thread_id)


@router.get(
    "/threads/{thread_id}/messages",
    responses={
        200: {"model": ListMessagesResponse, "description": "OK"},
    },
    tags=["Assistants"],
    summary="Returns a list of messages for a given thread.",
    response_model_by_alias=True,
)
async def list_messages(
    thread_id: Annotated[StrictStr, Field(description="The ID of the [thread](/docs/api-reference/threads) the messages belong to.")] = Path(..., description="The ID of the [thread](/docs/api-reference/threads) the messages belong to."),
    limit: Annotated[Optional[StrictInt], Field(description="A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ")] = Query(20, description="A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", alias="limit"),
    order: Annotated[Optional[StrictStr], Field(description="Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. ")] = Query(desc, description="Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. ", alias="order"),
    after: Annotated[Optional[StrictStr], Field(description="A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ")] = Query(None, description="A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ", alias="after"),
    before: Annotated[Optional[StrictStr], Field(description="A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. ")] = Query(None, description="A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. ", alias="before"),
    run_id: Annotated[Optional[StrictStr], Field(description="Filter messages by the run ID that generated them. ")] = Query(None, description="Filter messages by the run ID that generated them. ", alias="run_id"),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> ListMessagesResponse:
    if not BaseAssistantsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAssistantsApi.subclasses[0]().list_messages(thread_id, limit, order, after, before, run_id)


@router.post(
    "/threads/{thread_id}/messages",
    responses={
        200: {"model": MessageObject, "description": "OK"},
    },
    tags=["Assistants"],
    summary="Create a message.",
    response_model_by_alias=True,
)
async def create_message(
    thread_id: Annotated[StrictStr, Field(description="The ID of the [thread](/docs/api-reference/threads) to create a message for.")] = Path(..., description="The ID of the [thread](/docs/api-reference/threads) to create a message for."),
    create_message_request: CreateMessageRequest = Body(None, description=""),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> MessageObject:
    if not BaseAssistantsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAssistantsApi.subclasses[0]().create_message(thread_id, create_message_request)


@router.get(
    "/threads/{thread_id}/messages/{message_id}",
    responses={
        200: {"model": MessageObject, "description": "OK"},
    },
    tags=["Assistants"],
    summary="Retrieve a message.",
    response_model_by_alias=True,
)
async def get_message(
    thread_id: Annotated[StrictStr, Field(description="The ID of the [thread](/docs/api-reference/threads) to which this message belongs.")] = Path(..., description="The ID of the [thread](/docs/api-reference/threads) to which this message belongs."),
    message_id: Annotated[StrictStr, Field(description="The ID of the message to retrieve.")] = Path(..., description="The ID of the message to retrieve."),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> MessageObject:
    if not BaseAssistantsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAssistantsApi.subclasses[0]().get_message(thread_id, message_id)


@router.post(
    "/threads/{thread_id}/messages/{message_id}",
    responses={
        200: {"model": MessageObject, "description": "OK"},
    },
    tags=["Assistants"],
    summary="Modifies a message.",
    response_model_by_alias=True,
)
async def modify_message(
    thread_id: Annotated[StrictStr, Field(description="The ID of the thread to which this message belongs.")] = Path(..., description="The ID of the thread to which this message belongs."),
    message_id: Annotated[StrictStr, Field(description="The ID of the message to modify.")] = Path(..., description="The ID of the message to modify."),
    modify_message_request: ModifyMessageRequest = Body(None, description=""),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> MessageObject:
    if not BaseAssistantsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAssistantsApi.subclasses[0]().modify_message(thread_id, message_id, modify_message_request)


@router.delete(
    "/threads/{thread_id}/messages/{message_id}",
    responses={
        200: {"model": DeleteMessageResponse, "description": "OK"},
    },
    tags=["Assistants"],
    summary="Deletes a message.",
    response_model_by_alias=True,
)
async def delete_message(
    thread_id: Annotated[StrictStr, Field(description="The ID of the thread to which this message belongs.")] = Path(..., description="The ID of the thread to which this message belongs."),
    message_id: Annotated[StrictStr, Field(description="The ID of the message to delete.")] = Path(..., description="The ID of the message to delete."),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> DeleteMessageResponse:
    if not BaseAssistantsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAssistantsApi.subclasses[0]().delete_message(thread_id, message_id)


@router.get(
    "/threads/{thread_id}/runs",
    responses={
        200: {"model": ListRunsResponse, "description": "OK"},
    },
    tags=["Assistants"],
    summary="Returns a list of runs belonging to a thread.",
    response_model_by_alias=True,
)
async def list_runs(
    thread_id: Annotated[StrictStr, Field(description="The ID of the thread the run belongs to.")] = Path(..., description="The ID of the thread the run belongs to."),
    limit: Annotated[Optional[StrictInt], Field(description="A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ")] = Query(20, description="A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", alias="limit"),
    order: Annotated[Optional[StrictStr], Field(description="Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. ")] = Query(desc, description="Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. ", alias="order"),
    after: Annotated[Optional[StrictStr], Field(description="A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ")] = Query(None, description="A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ", alias="after"),
    before: Annotated[Optional[StrictStr], Field(description="A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. ")] = Query(None, description="A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. ", alias="before"),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> ListRunsResponse:
    if not BaseAssistantsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAssistantsApi.subclasses[0]().list_runs(thread_id, limit, order, after, before)


@router.post(
    "/threads/{thread_id}/runs",
    responses={
        200: {"model": RunObject, "description": "OK"},
    },
    tags=["Assistants"],
    summary="Create a run.",
    response_model_by_alias=True,
)
async def create_run(
    thread_id: Annotated[StrictStr, Field(description="The ID of the thread to run.")] = Path(..., description="The ID of the thread to run."),
    create_run_request: CreateRunRequest = Body(None, description=""),
    include: Annotated[Optional[List[StrictStr]], Field(description="A list of additional fields to include in the response. Currently the only supported value is `step_details.tool_calls[*].file_search.results[*].content` to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. ")] = Query(None, description="A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. ", alias="include[]"),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> RunObject:
    if not BaseAssistantsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAssistantsApi.subclasses[0]().create_run(thread_id, create_run_request, include)


@router.get(
    "/threads/{thread_id}/runs/{run_id}",
    responses={
        200: {"model": RunObject, "description": "OK"},
    },
    tags=["Assistants"],
    summary="Retrieves a run.",
    response_model_by_alias=True,
)
async def get_run(
    thread_id: Annotated[StrictStr, Field(description="The ID of the [thread](/docs/api-reference/threads) that was run.")] = Path(..., description="The ID of the [thread](/docs/api-reference/threads) that was run."),
    run_id: Annotated[StrictStr, Field(description="The ID of the run to retrieve.")] = Path(..., description="The ID of the run to retrieve."),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> RunObject:
    if not BaseAssistantsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAssistantsApi.subclasses[0]().get_run(thread_id, run_id)


@router.post(
    "/threads/{thread_id}/runs/{run_id}",
    responses={
        200: {"model": RunObject, "description": "OK"},
    },
    tags=["Assistants"],
    summary="Modifies a run.",
    response_model_by_alias=True,
)
async def modify_run(
    thread_id: Annotated[StrictStr, Field(description="The ID of the [thread](/docs/api-reference/threads) that was run.")] = Path(..., description="The ID of the [thread](/docs/api-reference/threads) that was run."),
    run_id: Annotated[StrictStr, Field(description="The ID of the run to modify.")] = Path(..., description="The ID of the run to modify."),
    modify_run_request: ModifyRunRequest = Body(None, description=""),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> RunObject:
    if not BaseAssistantsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAssistantsApi.subclasses[0]().modify_run(thread_id, run_id, modify_run_request)


@router.post(
    "/threads/{thread_id}/runs/{run_id}/cancel",
    responses={
        200: {"model": RunObject, "description": "OK"},
    },
    tags=["Assistants"],
    summary="Cancels a run that is &#x60;in_progress&#x60;.",
    response_model_by_alias=True,
)
async def cancel_run(
    thread_id: Annotated[StrictStr, Field(description="The ID of the thread to which this run belongs.")] = Path(..., description="The ID of the thread to which this run belongs."),
    run_id: Annotated[StrictStr, Field(description="The ID of the run to cancel.")] = Path(..., description="The ID of the run to cancel."),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> RunObject:
    if not BaseAssistantsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAssistantsApi.subclasses[0]().cancel_run(thread_id, run_id)


@router.get(
    "/threads/{thread_id}/runs/{run_id}/steps",
    responses={
        200: {"model": ListRunStepsResponse, "description": "OK"},
    },
    tags=["Assistants"],
    summary="Returns a list of run steps belonging to a run.",
    response_model_by_alias=True,
)
async def list_run_steps(
    thread_id: Annotated[StrictStr, Field(description="The ID of the thread the run and run steps belong to.")] = Path(..., description="The ID of the thread the run and run steps belong to."),
    run_id: Annotated[StrictStr, Field(description="The ID of the run the run steps belong to.")] = Path(..., description="The ID of the run the run steps belong to."),
    limit: Annotated[Optional[StrictInt], Field(description="A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ")] = Query(20, description="A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", alias="limit"),
    order: Annotated[Optional[StrictStr], Field(description="Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. ")] = Query(desc, description="Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. ", alias="order"),
    after: Annotated[Optional[StrictStr], Field(description="A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ")] = Query(None, description="A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ", alias="after"),
    before: Annotated[Optional[StrictStr], Field(description="A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. ")] = Query(None, description="A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. ", alias="before"),
    include: Annotated[Optional[List[StrictStr]], Field(description="A list of additional fields to include in the response. Currently the only supported value is `step_details.tool_calls[*].file_search.results[*].content` to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. ")] = Query(None, description="A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. ", alias="include[]"),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> ListRunStepsResponse:
    if not BaseAssistantsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAssistantsApi.subclasses[0]().list_run_steps(thread_id, run_id, limit, order, after, before, include)


@router.get(
    "/threads/{thread_id}/runs/{run_id}/steps/{step_id}",
    responses={
        200: {"model": RunStepObject, "description": "OK"},
    },
    tags=["Assistants"],
    summary="Retrieves a run step.",
    response_model_by_alias=True,
)
async def get_run_step(
    thread_id: Annotated[StrictStr, Field(description="The ID of the thread to which the run and run step belongs.")] = Path(..., description="The ID of the thread to which the run and run step belongs."),
    run_id: Annotated[StrictStr, Field(description="The ID of the run to which the run step belongs.")] = Path(..., description="The ID of the run to which the run step belongs."),
    step_id: Annotated[StrictStr, Field(description="The ID of the run step to retrieve.")] = Path(..., description="The ID of the run step to retrieve."),
    include: Annotated[Optional[List[StrictStr]], Field(description="A list of additional fields to include in the response. Currently the only supported value is `step_details.tool_calls[*].file_search.results[*].content` to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. ")] = Query(None, description="A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. ", alias="include[]"),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> RunStepObject:
    if not BaseAssistantsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAssistantsApi.subclasses[0]().get_run_step(thread_id, run_id, step_id, include)


@router.post(
    "/threads/{thread_id}/runs/{run_id}/submit_tool_outputs",
    responses={
        200: {"model": RunObject, "description": "OK"},
    },
    tags=["Assistants"],
    summary="When a run has the &#x60;status: \&quot;requires_action\&quot;&#x60; and &#x60;required_action.type&#x60; is &#x60;submit_tool_outputs&#x60;, this endpoint can be used to submit the outputs from the tool calls once they&#39;re all completed. All outputs must be submitted in a single request. ",
    response_model_by_alias=True,
)
async def submit_tool_ouputs_to_run(
    thread_id: Annotated[StrictStr, Field(description="The ID of the [thread](/docs/api-reference/threads) to which this run belongs.")] = Path(..., description="The ID of the [thread](/docs/api-reference/threads) to which this run belongs."),
    run_id: Annotated[StrictStr, Field(description="The ID of the run that requires the tool output submission.")] = Path(..., description="The ID of the run that requires the tool output submission."),
    submit_tool_outputs_run_request: SubmitToolOutputsRunRequest = Body(None, description=""),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> RunObject:
    if not BaseAssistantsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAssistantsApi.subclasses[0]().submit_tool_ouputs_to_run(thread_id, run_id, submit_tool_outputs_run_request)
