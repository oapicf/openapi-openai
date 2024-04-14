# coding: utf-8

from fastapi.testclient import TestClient


from openapi_server.models.assistant_file_object import AssistantFileObject  # noqa: F401
from openapi_server.models.assistant_object import AssistantObject  # noqa: F401
from openapi_server.models.create_assistant_file_request import CreateAssistantFileRequest  # noqa: F401
from openapi_server.models.create_assistant_request import CreateAssistantRequest  # noqa: F401
from openapi_server.models.create_message_request import CreateMessageRequest  # noqa: F401
from openapi_server.models.create_run_request import CreateRunRequest  # noqa: F401
from openapi_server.models.create_thread_and_run_request import CreateThreadAndRunRequest  # noqa: F401
from openapi_server.models.create_thread_request import CreateThreadRequest  # noqa: F401
from openapi_server.models.delete_assistant_file_response import DeleteAssistantFileResponse  # noqa: F401
from openapi_server.models.delete_assistant_response import DeleteAssistantResponse  # noqa: F401
from openapi_server.models.delete_thread_response import DeleteThreadResponse  # noqa: F401
from openapi_server.models.list_assistant_files_response import ListAssistantFilesResponse  # noqa: F401
from openapi_server.models.list_assistants_response import ListAssistantsResponse  # noqa: F401
from openapi_server.models.list_message_files_response import ListMessageFilesResponse  # noqa: F401
from openapi_server.models.list_messages_response import ListMessagesResponse  # noqa: F401
from openapi_server.models.list_run_steps_response import ListRunStepsResponse  # noqa: F401
from openapi_server.models.list_runs_response import ListRunsResponse  # noqa: F401
from openapi_server.models.message_file_object import MessageFileObject  # noqa: F401
from openapi_server.models.message_object import MessageObject  # noqa: F401
from openapi_server.models.modify_assistant_request import ModifyAssistantRequest  # noqa: F401
from openapi_server.models.modify_message_request import ModifyMessageRequest  # noqa: F401
from openapi_server.models.modify_run_request import ModifyRunRequest  # noqa: F401
from openapi_server.models.modify_thread_request import ModifyThreadRequest  # noqa: F401
from openapi_server.models.run_object import RunObject  # noqa: F401
from openapi_server.models.run_step_object import RunStepObject  # noqa: F401
from openapi_server.models.submit_tool_outputs_run_request import SubmitToolOutputsRunRequest  # noqa: F401
from openapi_server.models.thread_object import ThreadObject  # noqa: F401


def test_cancel_run(client: TestClient):
    """Test case for cancel_run

    Cancels a run that is `in_progress`.
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/threads/{thread_id}/runs/{run_id}/cancel".format(thread_id='thread_id_example', run_id='run_id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_create_assistant(client: TestClient):
    """Test case for create_assistant

    Create an assistant with a model and instructions.
    """
    create_assistant_request = {"instructions":"instructions","metadata":"{}","name":"name","file_ids":["file_ids","file_ids","file_ids","file_ids","file_ids"],"description":"description","model":"gpt-4-turbo","tools":[{"type":"code_interpreter"},{"type":"code_interpreter"},{"type":"code_interpreter"},{"type":"code_interpreter"},{"type":"code_interpreter"}]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/assistants",
    #    headers=headers,
    #    json=create_assistant_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_create_assistant_file(client: TestClient):
    """Test case for create_assistant_file

    Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants).
    """
    create_assistant_file_request = {"file_id":"file_id"}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/assistants/{assistant_id}/files".format(assistant_id='file-abc123'),
    #    headers=headers,
    #    json=create_assistant_file_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_create_message(client: TestClient):
    """Test case for create_message

    Create a message.
    """
    create_message_request = {"metadata":"{}","role":"user","file_ids":["file_ids","file_ids","file_ids","file_ids","file_ids"],"content":"content"}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/threads/{thread_id}/messages".format(thread_id='thread_id_example'),
    #    headers=headers,
    #    json=create_message_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_create_run(client: TestClient):
    """Test case for create_run

    Create a run.
    """
    create_run_request = {"instructions":"instructions","additional_instructions":"additional_instructions","metadata":"{}","assistant_id":"assistant_id","additional_messages":[{"metadata":"{}","role":"user","file_ids":["file_ids","file_ids","file_ids","file_ids","file_ids"],"content":"content"},{"metadata":"{}","role":"user","file_ids":["file_ids","file_ids","file_ids","file_ids","file_ids"],"content":"content"}],"tools":[{"type":"code_interpreter"},{"type":"code_interpreter"},{"type":"code_interpreter"},{"type":"code_interpreter"},{"type":"code_interpreter"}],"truncation_strategy":{"last_messages":1,"type":"auto"},"max_completion_tokens":256,"response_format":"none","stream":1,"temperature":1,"tool_choice":"none","model":"gpt-4-turbo","max_prompt_tokens":256}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/threads/{thread_id}/runs".format(thread_id='thread_id_example'),
    #    headers=headers,
    #    json=create_run_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_create_thread(client: TestClient):
    """Test case for create_thread

    Create a thread.
    """
    create_thread_request = {"metadata":"{}","messages":[{"metadata":"{}","role":"user","file_ids":["file_ids","file_ids","file_ids","file_ids","file_ids"],"content":"content"},{"metadata":"{}","role":"user","file_ids":["file_ids","file_ids","file_ids","file_ids","file_ids"],"content":"content"}]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/threads",
    #    headers=headers,
    #    json=create_thread_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_create_thread_and_run(client: TestClient):
    """Test case for create_thread_and_run

    Create a thread and run it in one request.
    """
    create_thread_and_run_request = {"instructions":"instructions","metadata":"{}","assistant_id":"assistant_id","thread":{"metadata":"{}","messages":[{"metadata":"{}","role":"user","file_ids":["file_ids","file_ids","file_ids","file_ids","file_ids"],"content":"content"},{"metadata":"{}","role":"user","file_ids":["file_ids","file_ids","file_ids","file_ids","file_ids"],"content":"content"}]},"tools":[{"type":"code_interpreter"},{"type":"code_interpreter"},{"type":"code_interpreter"},{"type":"code_interpreter"},{"type":"code_interpreter"}],"truncation_strategy":{"last_messages":1,"type":"auto"},"max_completion_tokens":256,"response_format":"none","stream":1,"temperature":1,"tool_choice":"none","model":"gpt-4-turbo","max_prompt_tokens":256}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/threads/runs",
    #    headers=headers,
    #    json=create_thread_and_run_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_delete_assistant(client: TestClient):
    """Test case for delete_assistant

    Delete an assistant.
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "DELETE",
    #    "/assistants/{assistant_id}".format(assistant_id='assistant_id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_delete_assistant_file(client: TestClient):
    """Test case for delete_assistant_file

    Delete an assistant file.
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "DELETE",
    #    "/assistants/{assistant_id}/files/{file_id}".format(assistant_id='assistant_id_example', file_id='file_id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_delete_thread(client: TestClient):
    """Test case for delete_thread

    Delete a thread.
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "DELETE",
    #    "/threads/{thread_id}".format(thread_id='thread_id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_assistant(client: TestClient):
    """Test case for get_assistant

    Retrieves an assistant.
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/assistants/{assistant_id}".format(assistant_id='assistant_id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_assistant_file(client: TestClient):
    """Test case for get_assistant_file

    Retrieves an AssistantFile.
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/assistants/{assistant_id}/files/{file_id}".format(assistant_id='assistant_id_example', file_id='file_id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_message(client: TestClient):
    """Test case for get_message

    Retrieve a message.
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/threads/{thread_id}/messages/{message_id}".format(thread_id='thread_id_example', message_id='message_id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_message_file(client: TestClient):
    """Test case for get_message_file

    Retrieves a message file.
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/threads/{thread_id}/messages/{message_id}/files/{file_id}".format(thread_id='thread_abc123', message_id='msg_abc123', file_id='file-abc123'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_run(client: TestClient):
    """Test case for get_run

    Retrieves a run.
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/threads/{thread_id}/runs/{run_id}".format(thread_id='thread_id_example', run_id='run_id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_run_step(client: TestClient):
    """Test case for get_run_step

    Retrieves a run step.
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/threads/{thread_id}/runs/{run_id}/steps/{step_id}".format(thread_id='thread_id_example', run_id='run_id_example', step_id='step_id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_thread(client: TestClient):
    """Test case for get_thread

    Retrieves a thread.
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/threads/{thread_id}".format(thread_id='thread_id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_list_assistant_files(client: TestClient):
    """Test case for list_assistant_files

    Returns a list of assistant files.
    """
    params = [("limit", 20),     ("order", 'desc'),     ("after", 'after_example'),     ("before", 'before_example')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/assistants/{assistant_id}/files".format(assistant_id='assistant_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_list_assistants(client: TestClient):
    """Test case for list_assistants

    Returns a list of assistants.
    """
    params = [("limit", 20),     ("order", 'desc'),     ("after", 'after_example'),     ("before", 'before_example')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/assistants",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_list_message_files(client: TestClient):
    """Test case for list_message_files

    Returns a list of message files.
    """
    params = [("limit", 20),     ("order", 'desc'),     ("after", 'after_example'),     ("before", 'before_example')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/threads/{thread_id}/messages/{message_id}/files".format(thread_id='thread_id_example', message_id='message_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_list_messages(client: TestClient):
    """Test case for list_messages

    Returns a list of messages for a given thread.
    """
    params = [("limit", 20),     ("order", 'desc'),     ("after", 'after_example'),     ("before", 'before_example'),     ("run_id", 'run_id_example')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/threads/{thread_id}/messages".format(thread_id='thread_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_list_run_steps(client: TestClient):
    """Test case for list_run_steps

    Returns a list of run steps belonging to a run.
    """
    params = [("limit", 20),     ("order", 'desc'),     ("after", 'after_example'),     ("before", 'before_example')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/threads/{thread_id}/runs/{run_id}/steps".format(thread_id='thread_id_example', run_id='run_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_list_runs(client: TestClient):
    """Test case for list_runs

    Returns a list of runs belonging to a thread.
    """
    params = [("limit", 20),     ("order", 'desc'),     ("after", 'after_example'),     ("before", 'before_example')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/threads/{thread_id}/runs".format(thread_id='thread_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_modify_assistant(client: TestClient):
    """Test case for modify_assistant

    Modifies an assistant.
    """
    modify_assistant_request = {"instructions":"instructions","metadata":"{}","name":"name","file_ids":["file_ids","file_ids","file_ids","file_ids","file_ids"],"description":"description","model":"model","tools":[{"type":"code_interpreter"},{"type":"code_interpreter"},{"type":"code_interpreter"},{"type":"code_interpreter"},{"type":"code_interpreter"}]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/assistants/{assistant_id}".format(assistant_id='assistant_id_example'),
    #    headers=headers,
    #    json=modify_assistant_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_modify_message(client: TestClient):
    """Test case for modify_message

    Modifies a message.
    """
    modify_message_request = {"metadata":"{}"}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/threads/{thread_id}/messages/{message_id}".format(thread_id='thread_id_example', message_id='message_id_example'),
    #    headers=headers,
    #    json=modify_message_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_modify_run(client: TestClient):
    """Test case for modify_run

    Modifies a run.
    """
    modify_run_request = {"metadata":"{}"}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/threads/{thread_id}/runs/{run_id}".format(thread_id='thread_id_example', run_id='run_id_example'),
    #    headers=headers,
    #    json=modify_run_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_modify_thread(client: TestClient):
    """Test case for modify_thread

    Modifies a thread.
    """
    modify_thread_request = {"metadata":"{}"}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/threads/{thread_id}".format(thread_id='thread_id_example'),
    #    headers=headers,
    #    json=modify_thread_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_submit_tool_ouputs_to_run(client: TestClient):
    """Test case for submit_tool_ouputs_to_run

    When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request. 
    """
    submit_tool_outputs_run_request = {"stream":1,"tool_outputs":[{"output":"output","tool_call_id":"tool_call_id"},{"output":"output","tool_call_id":"tool_call_id"}]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/threads/{thread_id}/runs/{run_id}/submit_tool_outputs".format(thread_id='thread_id_example', run_id='run_id_example'),
    #    headers=headers,
    #    json=submit_tool_outputs_run_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

