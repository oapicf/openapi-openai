from typing import List, Dict
from aiohttp import web

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


async def create_assistant_file(request: web.Request, assistant_id, body) -> web.Response:
    """Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants).

    

    :param assistant_id: The ID of the assistant for which to create a File. 
    :type assistant_id: str
    :param body: 
    :type body: dict | bytes

    """
    body = CreateAssistantFileRequest.from_dict(body)
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


async def create_run(request: web.Request, thread_id, body) -> web.Response:
    """Create a run.

    

    :param thread_id: The ID of the thread to run.
    :type thread_id: str
    :param body: 
    :type body: dict | bytes

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


async def delete_assistant_file(request: web.Request, assistant_id, file_id) -> web.Response:
    """Delete an assistant file.

    

    :param assistant_id: The ID of the assistant that the file belongs to.
    :type assistant_id: str
    :param file_id: The ID of the file to delete.
    :type file_id: str

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


async def get_assistant_file(request: web.Request, assistant_id, file_id) -> web.Response:
    """Retrieves an AssistantFile.

    

    :param assistant_id: The ID of the assistant who the file belongs to.
    :type assistant_id: str
    :param file_id: The ID of the file we&#39;re getting.
    :type file_id: str

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


async def get_message_file(request: web.Request, thread_id, message_id, file_id) -> web.Response:
    """Retrieves a message file.

    

    :param thread_id: The ID of the thread to which the message and File belong.
    :type thread_id: str
    :param message_id: The ID of the message the file belongs to.
    :type message_id: str
    :param file_id: The ID of the file being retrieved.
    :type file_id: str

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


async def get_run_step(request: web.Request, thread_id, run_id, step_id) -> web.Response:
    """Retrieves a run step.

    

    :param thread_id: The ID of the thread to which the run and run step belongs.
    :type thread_id: str
    :param run_id: The ID of the run to which the run step belongs.
    :type run_id: str
    :param step_id: The ID of the run step to retrieve.
    :type step_id: str

    """
    return web.Response(status=200)


async def get_thread(request: web.Request, thread_id) -> web.Response:
    """Retrieves a thread.

    

    :param thread_id: The ID of the thread to retrieve.
    :type thread_id: str

    """
    return web.Response(status=200)


async def list_assistant_files(request: web.Request, assistant_id, limit=None, order=None, after=None, before=None) -> web.Response:
    """Returns a list of assistant files.

    

    :param assistant_id: The ID of the assistant the file belongs to.
    :type assistant_id: str
    :param limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
    :type limit: int
    :param order: Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
    :type order: str
    :param after: A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
    :type after: str
    :param before: A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
    :type before: str

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
    :param before: A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
    :type before: str

    """
    return web.Response(status=200)


async def list_message_files(request: web.Request, thread_id, message_id, limit=None, order=None, after=None, before=None) -> web.Response:
    """Returns a list of message files.

    

    :param thread_id: The ID of the thread that the message and files belong to.
    :type thread_id: str
    :param message_id: The ID of the message that the files belongs to.
    :type message_id: str
    :param limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
    :type limit: int
    :param order: Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
    :type order: str
    :param after: A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
    :type after: str
    :param before: A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
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
    :param before: A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
    :type before: str
    :param run_id: Filter messages by the run ID that generated them. 
    :type run_id: str

    """
    return web.Response(status=200)


async def list_run_steps(request: web.Request, thread_id, run_id, limit=None, order=None, after=None, before=None) -> web.Response:
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
    :param before: A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
    :type before: str

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
    :param before: A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
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
