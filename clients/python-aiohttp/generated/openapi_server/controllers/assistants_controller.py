from typing import List, Dict
from aiohttp import web

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
from openapi_server import util


async def cancel_run(request: web.Request, thread_id, run_id) -> web.Response:
    """Cancels a run that is &#x60;in_progress&#x60;.

    

    :param thread_id: The ID of the thread to which this run belongs.
    :type thread_id: str
    :param run_id: The ID of the run to cancel.
    :type run_id: str

    """
    return web.Response(status=200)


async def create_assistant(request: web.Request, body) -> web.Response:
    """Create an assistant with a model and instructions.

    

    :param body: 
    :type body: dict | bytes

    """
    body = CreateAssistantRequest.from_dict(body)
    return web.Response(status=200)


async def create_message(request: web.Request, thread_id, body) -> web.Response:
    """Create a message.

    

    :param thread_id: The ID of the [thread](/docs/api-reference/threads) to create a message for.
    :type thread_id: str
    :param body: 
    :type body: dict | bytes

    """
    body = CreateMessageRequest.from_dict(body)
    return web.Response(status=200)


async def create_run(request: web.Request, thread_id, body, include=None) -> web.Response:
    """Create a run.

    

    :param thread_id: The ID of the thread to run.
    :type thread_id: str
    :param body: 
    :type body: dict | bytes
    :param include: A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
    :type include: List[str]

    """
    body = CreateRunRequest.from_dict(body)
    return web.Response(status=200)


async def create_thread(request: web.Request, body=None) -> web.Response:
    """Create a thread.

    

    :param body: 
    :type body: dict | bytes

    """
    body = CreateThreadRequest.from_dict(body)
    return web.Response(status=200)


async def create_thread_and_run(request: web.Request, body) -> web.Response:
    """Create a thread and run it in one request.

    

    :param body: 
    :type body: dict | bytes

    """
    body = CreateThreadAndRunRequest.from_dict(body)
    return web.Response(status=200)


async def delete_assistant(request: web.Request, assistant_id) -> web.Response:
    """Delete an assistant.

    

    :param assistant_id: The ID of the assistant to delete.
    :type assistant_id: str

    """
    return web.Response(status=200)


async def delete_message(request: web.Request, thread_id, message_id) -> web.Response:
    """Deletes a message.

    

    :param thread_id: The ID of the thread to which this message belongs.
    :type thread_id: str
    :param message_id: The ID of the message to delete.
    :type message_id: str

    """
    return web.Response(status=200)


async def delete_thread(request: web.Request, thread_id) -> web.Response:
    """Delete a thread.

    

    :param thread_id: The ID of the thread to delete.
    :type thread_id: str

    """
    return web.Response(status=200)


async def get_assistant(request: web.Request, assistant_id) -> web.Response:
    """Retrieves an assistant.

    

    :param assistant_id: The ID of the assistant to retrieve.
    :type assistant_id: str

    """
    return web.Response(status=200)


async def get_message(request: web.Request, thread_id, message_id) -> web.Response:
    """Retrieve a message.

    

    :param thread_id: The ID of the [thread](/docs/api-reference/threads) to which this message belongs.
    :type thread_id: str
    :param message_id: The ID of the message to retrieve.
    :type message_id: str

    """
    return web.Response(status=200)


async def get_run(request: web.Request, thread_id, run_id) -> web.Response:
    """Retrieves a run.

    

    :param thread_id: The ID of the [thread](/docs/api-reference/threads) that was run.
    :type thread_id: str
    :param run_id: The ID of the run to retrieve.
    :type run_id: str

    """
    return web.Response(status=200)


async def get_run_step(request: web.Request, thread_id, run_id, step_id, include=None) -> web.Response:
    """Retrieves a run step.

    

    :param thread_id: The ID of the thread to which the run and run step belongs.
    :type thread_id: str
    :param run_id: The ID of the run to which the run step belongs.
    :type run_id: str
    :param step_id: The ID of the run step to retrieve.
    :type step_id: str
    :param include: A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
    :type include: List[str]

    """
    return web.Response(status=200)


async def get_thread(request: web.Request, thread_id) -> web.Response:
    """Retrieves a thread.

    

    :param thread_id: The ID of the thread to retrieve.
    :type thread_id: str

    """
    return web.Response(status=200)


async def list_assistants(request: web.Request, limit=None, order=None, after=None, before=None) -> web.Response:
    """Returns a list of assistants.

    

    :param limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
    :type limit: int
    :param order: Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
    :type order: str
    :param after: A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
    :type after: str
    :param before: A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
    :type before: str

    """
    return web.Response(status=200)


async def list_messages(request: web.Request, thread_id, limit=None, order=None, after=None, before=None, run_id=None) -> web.Response:
    """Returns a list of messages for a given thread.

    

    :param thread_id: The ID of the [thread](/docs/api-reference/threads) the messages belong to.
    :type thread_id: str
    :param limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
    :type limit: int
    :param order: Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
    :type order: str
    :param after: A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
    :type after: str
    :param before: A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
    :type before: str
    :param run_id: Filter messages by the run ID that generated them. 
    :type run_id: str

    """
    return web.Response(status=200)


async def list_run_steps(request: web.Request, thread_id, run_id, limit=None, order=None, after=None, before=None, include=None) -> web.Response:
    """Returns a list of run steps belonging to a run.

    

    :param thread_id: The ID of the thread the run and run steps belong to.
    :type thread_id: str
    :param run_id: The ID of the run the run steps belong to.
    :type run_id: str
    :param limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
    :type limit: int
    :param order: Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
    :type order: str
    :param after: A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
    :type after: str
    :param before: A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
    :type before: str
    :param include: A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
    :type include: List[str]

    """
    return web.Response(status=200)


async def list_runs(request: web.Request, thread_id, limit=None, order=None, after=None, before=None) -> web.Response:
    """Returns a list of runs belonging to a thread.

    

    :param thread_id: The ID of the thread the run belongs to.
    :type thread_id: str
    :param limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
    :type limit: int
    :param order: Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
    :type order: str
    :param after: A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
    :type after: str
    :param before: A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
    :type before: str

    """
    return web.Response(status=200)


async def modify_assistant(request: web.Request, assistant_id, body) -> web.Response:
    """Modifies an assistant.

    

    :param assistant_id: The ID of the assistant to modify.
    :type assistant_id: str
    :param body: 
    :type body: dict | bytes

    """
    body = ModifyAssistantRequest.from_dict(body)
    return web.Response(status=200)


async def modify_message(request: web.Request, thread_id, message_id, body) -> web.Response:
    """Modifies a message.

    

    :param thread_id: The ID of the thread to which this message belongs.
    :type thread_id: str
    :param message_id: The ID of the message to modify.
    :type message_id: str
    :param body: 
    :type body: dict | bytes

    """
    body = ModifyMessageRequest.from_dict(body)
    return web.Response(status=200)


async def modify_run(request: web.Request, thread_id, run_id, body) -> web.Response:
    """Modifies a run.

    

    :param thread_id: The ID of the [thread](/docs/api-reference/threads) that was run.
    :type thread_id: str
    :param run_id: The ID of the run to modify.
    :type run_id: str
    :param body: 
    :type body: dict | bytes

    """
    body = ModifyRunRequest.from_dict(body)
    return web.Response(status=200)


async def modify_thread(request: web.Request, thread_id, body) -> web.Response:
    """Modifies a thread.

    

    :param thread_id: The ID of the thread to modify. Only the &#x60;metadata&#x60; can be modified.
    :type thread_id: str
    :param body: 
    :type body: dict | bytes

    """
    body = ModifyThreadRequest.from_dict(body)
    return web.Response(status=200)


async def submit_tool_ouputs_to_run(request: web.Request, thread_id, run_id, body) -> web.Response:
    """When a run has the &#x60;status: \&quot;requires_action\&quot;&#x60; and &#x60;required_action.type&#x60; is &#x60;submit_tool_outputs&#x60;, this endpoint can be used to submit the outputs from the tool calls once they&#39;re all completed. All outputs must be submitted in a single request. 

    

    :param thread_id: The ID of the [thread](/docs/api-reference/threads) to which this run belongs.
    :type thread_id: str
    :param run_id: The ID of the run that requires the tool output submission.
    :type run_id: str
    :param body: 
    :type body: dict | bytes

    """
    body = SubmitToolOutputsRunRequest.from_dict(body)
    return web.Response(status=200)
