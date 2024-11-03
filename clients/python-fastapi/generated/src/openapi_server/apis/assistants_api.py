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

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


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
    thread_id: str = Path(..., description="The ID of the thread to which this run belongs."),
    run_id: str = Path(..., description="The ID of the run to cancel."),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> RunObject:
    if not BaseAssistantsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAssistantsApi.subclasses[0]().cancel_run(thread_id, run_id)


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


@router.post(
    "/assistants/{assistant_id}/files",
    responses={
        200: {"model": AssistantFileObject, "description": "OK"},
    },
    tags=["Assistants"],
    summary="Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants).",
    response_model_by_alias=True,
)
async def create_assistant_file(
    assistant_id: str = Path(..., description="The ID of the assistant for which to create a File. "),
    create_assistant_file_request: CreateAssistantFileRequest = Body(None, description=""),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> AssistantFileObject:
    if not BaseAssistantsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAssistantsApi.subclasses[0]().create_assistant_file(assistant_id, create_assistant_file_request)


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
    thread_id: str = Path(..., description="The ID of the [thread](/docs/api-reference/threads) to create a message for."),
    create_message_request: CreateMessageRequest = Body(None, description=""),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> MessageObject:
    if not BaseAssistantsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAssistantsApi.subclasses[0]().create_message(thread_id, create_message_request)


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
    thread_id: str = Path(..., description="The ID of the thread to run."),
    create_run_request: CreateRunRequest = Body(None, description=""),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> RunObject:
    if not BaseAssistantsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAssistantsApi.subclasses[0]().create_run(thread_id, create_run_request)


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
    create_thread_request: CreateThreadRequest = Body(None, description=""),
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
    assistant_id: str = Path(..., description="The ID of the assistant to delete."),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> DeleteAssistantResponse:
    if not BaseAssistantsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAssistantsApi.subclasses[0]().delete_assistant(assistant_id)


@router.delete(
    "/assistants/{assistant_id}/files/{file_id}",
    responses={
        200: {"model": DeleteAssistantFileResponse, "description": "OK"},
    },
    tags=["Assistants"],
    summary="Delete an assistant file.",
    response_model_by_alias=True,
)
async def delete_assistant_file(
    assistant_id: str = Path(..., description="The ID of the assistant that the file belongs to."),
    file_id: str = Path(..., description="The ID of the file to delete."),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> DeleteAssistantFileResponse:
    if not BaseAssistantsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAssistantsApi.subclasses[0]().delete_assistant_file(assistant_id, file_id)


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
    thread_id: str = Path(..., description="The ID of the thread to delete."),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> DeleteThreadResponse:
    if not BaseAssistantsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAssistantsApi.subclasses[0]().delete_thread(thread_id)


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
    assistant_id: str = Path(..., description="The ID of the assistant to retrieve."),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> AssistantObject:
    if not BaseAssistantsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAssistantsApi.subclasses[0]().get_assistant(assistant_id)


@router.get(
    "/assistants/{assistant_id}/files/{file_id}",
    responses={
        200: {"model": AssistantFileObject, "description": "OK"},
    },
    tags=["Assistants"],
    summary="Retrieves an AssistantFile.",
    response_model_by_alias=True,
)
async def get_assistant_file(
    assistant_id: str = Path(..., description="The ID of the assistant who the file belongs to."),
    file_id: str = Path(..., description="The ID of the file we&#39;re getting."),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> AssistantFileObject:
    if not BaseAssistantsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAssistantsApi.subclasses[0]().get_assistant_file(assistant_id, file_id)


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
    thread_id: str = Path(..., description="The ID of the [thread](/docs/api-reference/threads) to which this message belongs."),
    message_id: str = Path(..., description="The ID of the message to retrieve."),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> MessageObject:
    if not BaseAssistantsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAssistantsApi.subclasses[0]().get_message(thread_id, message_id)


@router.get(
    "/threads/{thread_id}/messages/{message_id}/files/{file_id}",
    responses={
        200: {"model": MessageFileObject, "description": "OK"},
    },
    tags=["Assistants"],
    summary="Retrieves a message file.",
    response_model_by_alias=True,
)
async def get_message_file(
    thread_id: str = Path(..., description="The ID of the thread to which the message and File belong."),
    message_id: str = Path(..., description="The ID of the message the file belongs to."),
    file_id: str = Path(..., description="The ID of the file being retrieved."),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> MessageFileObject:
    if not BaseAssistantsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAssistantsApi.subclasses[0]().get_message_file(thread_id, message_id, file_id)


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
    thread_id: str = Path(..., description="The ID of the [thread](/docs/api-reference/threads) that was run."),
    run_id: str = Path(..., description="The ID of the run to retrieve."),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> RunObject:
    if not BaseAssistantsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAssistantsApi.subclasses[0]().get_run(thread_id, run_id)


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
    thread_id: str = Path(..., description="The ID of the thread to which the run and run step belongs."),
    run_id: str = Path(..., description="The ID of the run to which the run step belongs."),
    step_id: str = Path(..., description="The ID of the run step to retrieve."),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> RunStepObject:
    if not BaseAssistantsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAssistantsApi.subclasses[0]().get_run_step(thread_id, run_id, step_id)


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
    thread_id: str = Path(..., description="The ID of the thread to retrieve."),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> ThreadObject:
    if not BaseAssistantsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAssistantsApi.subclasses[0]().get_thread(thread_id)


@router.get(
    "/assistants/{assistant_id}/files",
    responses={
        200: {"model": ListAssistantFilesResponse, "description": "OK"},
    },
    tags=["Assistants"],
    summary="Returns a list of assistant files.",
    response_model_by_alias=True,
)
async def list_assistant_files(
    assistant_id: str = Path(..., description="The ID of the assistant the file belongs to."),
    limit: int = Query(20, description="A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", alias="limit"),
    order: str = Query(desc, description="Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. ", alias="order"),
    after: str = Query(None, description="A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ", alias="after"),
    before: str = Query(None, description="A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. ", alias="before"),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> ListAssistantFilesResponse:
    if not BaseAssistantsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAssistantsApi.subclasses[0]().list_assistant_files(assistant_id, limit, order, after, before)


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
    limit: int = Query(20, description="A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", alias="limit"),
    order: str = Query(desc, description="Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. ", alias="order"),
    after: str = Query(None, description="A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ", alias="after"),
    before: str = Query(None, description="A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. ", alias="before"),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> ListAssistantsResponse:
    if not BaseAssistantsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAssistantsApi.subclasses[0]().list_assistants(limit, order, after, before)


@router.get(
    "/threads/{thread_id}/messages/{message_id}/files",
    responses={
        200: {"model": ListMessageFilesResponse, "description": "OK"},
    },
    tags=["Assistants"],
    summary="Returns a list of message files.",
    response_model_by_alias=True,
)
async def list_message_files(
    thread_id: str = Path(..., description="The ID of the thread that the message and files belong to."),
    message_id: str = Path(..., description="The ID of the message that the files belongs to."),
    limit: int = Query(20, description="A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", alias="limit"),
    order: str = Query(desc, description="Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. ", alias="order"),
    after: str = Query(None, description="A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ", alias="after"),
    before: str = Query(None, description="A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. ", alias="before"),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> ListMessageFilesResponse:
    if not BaseAssistantsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAssistantsApi.subclasses[0]().list_message_files(thread_id, message_id, limit, order, after, before)


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
    thread_id: str = Path(..., description="The ID of the [thread](/docs/api-reference/threads) the messages belong to."),
    limit: int = Query(20, description="A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", alias="limit"),
    order: str = Query(desc, description="Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. ", alias="order"),
    after: str = Query(None, description="A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ", alias="after"),
    before: str = Query(None, description="A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. ", alias="before"),
    run_id: str = Query(None, description="Filter messages by the run ID that generated them. ", alias="run_id"),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> ListMessagesResponse:
    if not BaseAssistantsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAssistantsApi.subclasses[0]().list_messages(thread_id, limit, order, after, before, run_id)


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
    thread_id: str = Path(..., description="The ID of the thread the run and run steps belong to."),
    run_id: str = Path(..., description="The ID of the run the run steps belong to."),
    limit: int = Query(20, description="A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", alias="limit"),
    order: str = Query(desc, description="Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. ", alias="order"),
    after: str = Query(None, description="A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ", alias="after"),
    before: str = Query(None, description="A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. ", alias="before"),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> ListRunStepsResponse:
    if not BaseAssistantsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAssistantsApi.subclasses[0]().list_run_steps(thread_id, run_id, limit, order, after, before)


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
    thread_id: str = Path(..., description="The ID of the thread the run belongs to."),
    limit: int = Query(20, description="A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", alias="limit"),
    order: str = Query(desc, description="Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. ", alias="order"),
    after: str = Query(None, description="A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ", alias="after"),
    before: str = Query(None, description="A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. ", alias="before"),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> ListRunsResponse:
    if not BaseAssistantsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAssistantsApi.subclasses[0]().list_runs(thread_id, limit, order, after, before)


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
    assistant_id: str = Path(..., description="The ID of the assistant to modify."),
    modify_assistant_request: ModifyAssistantRequest = Body(None, description=""),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> AssistantObject:
    if not BaseAssistantsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAssistantsApi.subclasses[0]().modify_assistant(assistant_id, modify_assistant_request)


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
    thread_id: str = Path(..., description="The ID of the thread to which this message belongs."),
    message_id: str = Path(..., description="The ID of the message to modify."),
    modify_message_request: ModifyMessageRequest = Body(None, description=""),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> MessageObject:
    if not BaseAssistantsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAssistantsApi.subclasses[0]().modify_message(thread_id, message_id, modify_message_request)


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
    thread_id: str = Path(..., description="The ID of the [thread](/docs/api-reference/threads) that was run."),
    run_id: str = Path(..., description="The ID of the run to modify."),
    modify_run_request: ModifyRunRequest = Body(None, description=""),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> RunObject:
    if not BaseAssistantsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAssistantsApi.subclasses[0]().modify_run(thread_id, run_id, modify_run_request)


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
    thread_id: str = Path(..., description="The ID of the thread to modify. Only the &#x60;metadata&#x60; can be modified."),
    modify_thread_request: ModifyThreadRequest = Body(None, description=""),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> ThreadObject:
    if not BaseAssistantsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAssistantsApi.subclasses[0]().modify_thread(thread_id, modify_thread_request)


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
    thread_id: str = Path(..., description="The ID of the [thread](/docs/api-reference/threads) to which this run belongs."),
    run_id: str = Path(..., description="The ID of the run that requires the tool output submission."),
    submit_tool_outputs_run_request: SubmitToolOutputsRunRequest = Body(None, description=""),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> RunObject:
    if not BaseAssistantsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAssistantsApi.subclasses[0]().submit_tool_ouputs_to_run(thread_id, run_id, submit_tool_outputs_run_request)
