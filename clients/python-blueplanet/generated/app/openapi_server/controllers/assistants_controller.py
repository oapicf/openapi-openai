import connexion

from app.openapi_server.models.assistant_file_object import AssistantFileObject  # noqa: E501
from app.openapi_server.models.assistant_object import AssistantObject  # noqa: E501
from app.openapi_server.models.create_assistant_file_request import CreateAssistantFileRequest  # noqa: E501
from app.openapi_server.models.create_assistant_request import CreateAssistantRequest  # noqa: E501
from app.openapi_server.models.create_message_request import CreateMessageRequest  # noqa: E501
from app.openapi_server.models.create_run_request import CreateRunRequest  # noqa: E501
from app.openapi_server.models.create_thread_and_run_request import CreateThreadAndRunRequest  # noqa: E501
from app.openapi_server.models.create_thread_request import CreateThreadRequest  # noqa: E501
from app.openapi_server.models.delete_assistant_file_response import DeleteAssistantFileResponse  # noqa: E501
from app.openapi_server.models.delete_assistant_response import DeleteAssistantResponse  # noqa: E501
from app.openapi_server.models.delete_thread_response import DeleteThreadResponse  # noqa: E501
from app.openapi_server.models.list_assistant_files_response import ListAssistantFilesResponse  # noqa: E501
from app.openapi_server.models.list_assistants_response import ListAssistantsResponse  # noqa: E501
from app.openapi_server.models.list_message_files_response import ListMessageFilesResponse  # noqa: E501
from app.openapi_server.models.list_messages_response import ListMessagesResponse  # noqa: E501
from app.openapi_server.models.list_run_steps_response import ListRunStepsResponse  # noqa: E501
from app.openapi_server.models.list_runs_response import ListRunsResponse  # noqa: E501
from app.openapi_server.models.message_file_object import MessageFileObject  # noqa: E501
from app.openapi_server.models.message_object import MessageObject  # noqa: E501
from app.openapi_server.models.modify_assistant_request import ModifyAssistantRequest  # noqa: E501
from app.openapi_server.models.modify_message_request import ModifyMessageRequest  # noqa: E501
from app.openapi_server.models.modify_run_request import ModifyRunRequest  # noqa: E501
from app.openapi_server.models.modify_thread_request import ModifyThreadRequest  # noqa: E501
from app.openapi_server.models.run_object import RunObject  # noqa: E501
from app.openapi_server.models.run_step_object import RunStepObject  # noqa: E501
from app.openapi_server.models.submit_tool_outputs_run_request import SubmitToolOutputsRunRequest  # noqa: E501
from app.openapi_server.models.thread_object import ThreadObject  # noqa: E501
from openapi_server import util


def cancel_run(thread_id, run_id):  # noqa: E501
    """Cancels a run that is &#x60;in_progress&#x60;.

     # noqa: E501

    :param thread_id: The ID of the thread to which this run belongs.
    :type thread_id: str
    :param run_id: The ID of the run to cancel.
    :type run_id: str

    :rtype: RunObject
    """
    return 'do some magic!'


def create_assistant(body):  # noqa: E501
    """Create an assistant with a model and instructions.

     # noqa: E501

    :param body: 
    :type body: dict | bytes

    :rtype: AssistantObject
    """
    if connexion.request.is_json:
        body = CreateAssistantRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def create_assistant_file(assistant_id, body):  # noqa: E501
    """Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants).

     # noqa: E501

    :param assistant_id: The ID of the assistant for which to create a File. 
    :type assistant_id: str
    :param body: 
    :type body: dict | bytes

    :rtype: AssistantFileObject
    """
    if connexion.request.is_json:
        body = CreateAssistantFileRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def create_message(thread_id, body):  # noqa: E501
    """Create a message.

     # noqa: E501

    :param thread_id: The ID of the [thread](/docs/api-reference/threads) to create a message for.
    :type thread_id: str
    :param body: 
    :type body: dict | bytes

    :rtype: MessageObject
    """
    if connexion.request.is_json:
        body = CreateMessageRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def create_run(thread_id, body):  # noqa: E501
    """Create a run.

     # noqa: E501

    :param thread_id: The ID of the thread to run.
    :type thread_id: str
    :param body: 
    :type body: dict | bytes

    :rtype: RunObject
    """
    if connexion.request.is_json:
        body = CreateRunRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def create_thread(body=None):  # noqa: E501
    """Create a thread.

     # noqa: E501

    :param body: 
    :type body: dict | bytes

    :rtype: ThreadObject
    """
    if connexion.request.is_json:
        body = CreateThreadRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def create_thread_and_run(body):  # noqa: E501
    """Create a thread and run it in one request.

     # noqa: E501

    :param body: 
    :type body: dict | bytes

    :rtype: RunObject
    """
    if connexion.request.is_json:
        body = CreateThreadAndRunRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_assistant(assistant_id):  # noqa: E501
    """Delete an assistant.

     # noqa: E501

    :param assistant_id: The ID of the assistant to delete.
    :type assistant_id: str

    :rtype: DeleteAssistantResponse
    """
    return 'do some magic!'


def delete_assistant_file(assistant_id, file_id):  # noqa: E501
    """Delete an assistant file.

     # noqa: E501

    :param assistant_id: The ID of the assistant that the file belongs to.
    :type assistant_id: str
    :param file_id: The ID of the file to delete.
    :type file_id: str

    :rtype: DeleteAssistantFileResponse
    """
    return 'do some magic!'


def delete_thread(thread_id):  # noqa: E501
    """Delete a thread.

     # noqa: E501

    :param thread_id: The ID of the thread to delete.
    :type thread_id: str

    :rtype: DeleteThreadResponse
    """
    return 'do some magic!'


def get_assistant(assistant_id):  # noqa: E501
    """Retrieves an assistant.

     # noqa: E501

    :param assistant_id: The ID of the assistant to retrieve.
    :type assistant_id: str

    :rtype: AssistantObject
    """
    return 'do some magic!'


def get_assistant_file(assistant_id, file_id):  # noqa: E501
    """Retrieves an AssistantFile.

     # noqa: E501

    :param assistant_id: The ID of the assistant who the file belongs to.
    :type assistant_id: str
    :param file_id: The ID of the file we&#39;re getting.
    :type file_id: str

    :rtype: AssistantFileObject
    """
    return 'do some magic!'


def get_message(thread_id, message_id):  # noqa: E501
    """Retrieve a message.

     # noqa: E501

    :param thread_id: The ID of the [thread](/docs/api-reference/threads) to which this message belongs.
    :type thread_id: str
    :param message_id: The ID of the message to retrieve.
    :type message_id: str

    :rtype: MessageObject
    """
    return 'do some magic!'


def get_message_file(thread_id, message_id, file_id):  # noqa: E501
    """Retrieves a message file.

     # noqa: E501

    :param thread_id: The ID of the thread to which the message and File belong.
    :type thread_id: str
    :param message_id: The ID of the message the file belongs to.
    :type message_id: str
    :param file_id: The ID of the file being retrieved.
    :type file_id: str

    :rtype: MessageFileObject
    """
    return 'do some magic!'


def get_run(thread_id, run_id):  # noqa: E501
    """Retrieves a run.

     # noqa: E501

    :param thread_id: The ID of the [thread](/docs/api-reference/threads) that was run.
    :type thread_id: str
    :param run_id: The ID of the run to retrieve.
    :type run_id: str

    :rtype: RunObject
    """
    return 'do some magic!'


def get_run_step(thread_id, run_id, step_id):  # noqa: E501
    """Retrieves a run step.

     # noqa: E501

    :param thread_id: The ID of the thread to which the run and run step belongs.
    :type thread_id: str
    :param run_id: The ID of the run to which the run step belongs.
    :type run_id: str
    :param step_id: The ID of the run step to retrieve.
    :type step_id: str

    :rtype: RunStepObject
    """
    return 'do some magic!'


def get_thread(thread_id):  # noqa: E501
    """Retrieves a thread.

     # noqa: E501

    :param thread_id: The ID of the thread to retrieve.
    :type thread_id: str

    :rtype: ThreadObject
    """
    return 'do some magic!'


def list_assistant_files(assistant_id, limit=None, order=None, after=None, before=None):  # noqa: E501
    """Returns a list of assistant files.

     # noqa: E501

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

    :rtype: ListAssistantFilesResponse
    """
    return 'do some magic!'


def list_assistants(limit=None, order=None, after=None, before=None):  # noqa: E501
    """Returns a list of assistants.

     # noqa: E501

    :param limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
    :type limit: int
    :param order: Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
    :type order: str
    :param after: A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
    :type after: str
    :param before: A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
    :type before: str

    :rtype: ListAssistantsResponse
    """
    return 'do some magic!'


def list_message_files(thread_id, message_id, limit=None, order=None, after=None, before=None):  # noqa: E501
    """Returns a list of message files.

     # noqa: E501

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

    :rtype: ListMessageFilesResponse
    """
    return 'do some magic!'


def list_messages(thread_id, limit=None, order=None, after=None, before=None, run_id=None):  # noqa: E501
    """Returns a list of messages for a given thread.

     # noqa: E501

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

    :rtype: ListMessagesResponse
    """
    return 'do some magic!'


def list_run_steps(thread_id, run_id, limit=None, order=None, after=None, before=None):  # noqa: E501
    """Returns a list of run steps belonging to a run.

     # noqa: E501

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

    :rtype: ListRunStepsResponse
    """
    return 'do some magic!'


def list_runs(thread_id, limit=None, order=None, after=None, before=None):  # noqa: E501
    """Returns a list of runs belonging to a thread.

     # noqa: E501

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

    :rtype: ListRunsResponse
    """
    return 'do some magic!'


def modify_assistant(assistant_id, body):  # noqa: E501
    """Modifies an assistant.

     # noqa: E501

    :param assistant_id: The ID of the assistant to modify.
    :type assistant_id: str
    :param body: 
    :type body: dict | bytes

    :rtype: AssistantObject
    """
    if connexion.request.is_json:
        body = ModifyAssistantRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def modify_message(thread_id, message_id, body):  # noqa: E501
    """Modifies a message.

     # noqa: E501

    :param thread_id: The ID of the thread to which this message belongs.
    :type thread_id: str
    :param message_id: The ID of the message to modify.
    :type message_id: str
    :param body: 
    :type body: dict | bytes

    :rtype: MessageObject
    """
    if connexion.request.is_json:
        body = ModifyMessageRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def modify_run(thread_id, run_id, body):  # noqa: E501
    """Modifies a run.

     # noqa: E501

    :param thread_id: The ID of the [thread](/docs/api-reference/threads) that was run.
    :type thread_id: str
    :param run_id: The ID of the run to modify.
    :type run_id: str
    :param body: 
    :type body: dict | bytes

    :rtype: RunObject
    """
    if connexion.request.is_json:
        body = ModifyRunRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def modify_thread(thread_id, body):  # noqa: E501
    """Modifies a thread.

     # noqa: E501

    :param thread_id: The ID of the thread to modify. Only the &#x60;metadata&#x60; can be modified.
    :type thread_id: str
    :param body: 
    :type body: dict | bytes

    :rtype: ThreadObject
    """
    if connexion.request.is_json:
        body = ModifyThreadRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def submit_tool_ouputs_to_run(thread_id, run_id, body):  # noqa: E501
    """When a run has the &#x60;status: \&quot;requires_action\&quot;&#x60; and &#x60;required_action.type&#x60; is &#x60;submit_tool_outputs&#x60;, this endpoint can be used to submit the outputs from the tool calls once they&#39;re all completed. All outputs must be submitted in a single request. 

     # noqa: E501

    :param thread_id: The ID of the [thread](/docs/api-reference/threads) to which this run belongs.
    :type thread_id: str
    :param run_id: The ID of the run that requires the tool output submission.
    :type run_id: str
    :param body: 
    :type body: dict | bytes

    :rtype: RunObject
    """
    if connexion.request.is_json:
        body = SubmitToolOutputsRunRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
