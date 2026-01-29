# coding: utf-8

import pytest
import json
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


pytestmark = pytest.mark.asyncio

async def test_cancel_run(client):
    """Test case for cancel_run

    Cancels a run that is `in_progress`.
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/v1/threads/{thread_id}/runs/{run_id}/cancel'.format(thread_id='thread_id_example', run_id='run_id_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_create_assistant(client):
    """Test case for create_assistant

    Create an assistant with a model and instructions.
    """
    body = {"instructions":"instructions","metadata":"{}","name":"name","file_ids":["file_ids","file_ids","file_ids","file_ids","file_ids"],"description":"description","model":"gpt-4-turbo","tools":[{"type":"code_interpreter"},{"type":"code_interpreter"},{"type":"code_interpreter"},{"type":"code_interpreter"},{"type":"code_interpreter"}]}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/v1/assistants',
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_create_assistant_file(client):
    """Test case for create_assistant_file

    Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants).
    """
    body = {"file_id":"file_id"}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/v1/assistants/{assistant_id}/files'.format(assistant_id='file-abc123'),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_create_message(client):
    """Test case for create_message

    Create a message.
    """
    body = {"metadata":"{}","role":"user","file_ids":["file_ids","file_ids","file_ids","file_ids","file_ids"],"content":"content"}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/v1/threads/{thread_id}/messages'.format(thread_id='thread_id_example'),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_create_run(client):
    """Test case for create_run

    Create a run.
    """
    body = {"instructions":"instructions","additional_instructions":"additional_instructions","metadata":"{}","assistant_id":"assistant_id","additional_messages":[{"metadata":"{}","role":"user","file_ids":["file_ids","file_ids","file_ids","file_ids","file_ids"],"content":"content"},{"metadata":"{}","role":"user","file_ids":["file_ids","file_ids","file_ids","file_ids","file_ids"],"content":"content"}],"tools":[{"type":"code_interpreter"},{"type":"code_interpreter"},{"type":"code_interpreter"},{"type":"code_interpreter"},{"type":"code_interpreter"}],"truncation_strategy":{"last_messages":1,"type":"auto"},"max_completion_tokens":256,"response_format":"none","stream":True,"temperature":1,"tool_choice":"none","model":"gpt-4-turbo","max_prompt_tokens":256}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/v1/threads/{thread_id}/runs'.format(thread_id='thread_id_example'),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_create_thread(client):
    """Test case for create_thread

    Create a thread.
    """
    body = {"metadata":"{}","messages":[{"metadata":"{}","role":"user","file_ids":["file_ids","file_ids","file_ids","file_ids","file_ids"],"content":"content"},{"metadata":"{}","role":"user","file_ids":["file_ids","file_ids","file_ids","file_ids","file_ids"],"content":"content"}]}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/v1/threads',
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_create_thread_and_run(client):
    """Test case for create_thread_and_run

    Create a thread and run it in one request.
    """
    body = {"instructions":"instructions","metadata":"{}","assistant_id":"assistant_id","thread":{"metadata":"{}","messages":[{"metadata":"{}","role":"user","file_ids":["file_ids","file_ids","file_ids","file_ids","file_ids"],"content":"content"},{"metadata":"{}","role":"user","file_ids":["file_ids","file_ids","file_ids","file_ids","file_ids"],"content":"content"}]},"tools":[{"type":"code_interpreter"},{"type":"code_interpreter"},{"type":"code_interpreter"},{"type":"code_interpreter"},{"type":"code_interpreter"}],"truncation_strategy":{"last_messages":1,"type":"auto"},"max_completion_tokens":256,"response_format":"none","stream":True,"temperature":1,"tool_choice":"none","model":"gpt-4-turbo","max_prompt_tokens":256}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/v1/threads/runs',
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_delete_assistant(client):
    """Test case for delete_assistant

    Delete an assistant.
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='DELETE',
        path='/v1/assistants/{assistant_id}'.format(assistant_id='assistant_id_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_delete_assistant_file(client):
    """Test case for delete_assistant_file

    Delete an assistant file.
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='DELETE',
        path='/v1/assistants/{assistant_id}/files/{file_id}'.format(assistant_id='assistant_id_example', file_id='file_id_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_delete_thread(client):
    """Test case for delete_thread

    Delete a thread.
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='DELETE',
        path='/v1/threads/{thread_id}'.format(thread_id='thread_id_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_assistant(client):
    """Test case for get_assistant

    Retrieves an assistant.
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/v1/assistants/{assistant_id}'.format(assistant_id='assistant_id_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_assistant_file(client):
    """Test case for get_assistant_file

    Retrieves an AssistantFile.
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/v1/assistants/{assistant_id}/files/{file_id}'.format(assistant_id='assistant_id_example', file_id='file_id_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_message(client):
    """Test case for get_message

    Retrieve a message.
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/v1/threads/{thread_id}/messages/{message_id}'.format(thread_id='thread_id_example', message_id='message_id_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_message_file(client):
    """Test case for get_message_file

    Retrieves a message file.
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/v1/threads/{thread_id}/messages/{message_id}/files/{file_id}'.format(thread_id='thread_abc123', message_id='msg_abc123', file_id='file-abc123'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_run(client):
    """Test case for get_run

    Retrieves a run.
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/v1/threads/{thread_id}/runs/{run_id}'.format(thread_id='thread_id_example', run_id='run_id_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_run_step(client):
    """Test case for get_run_step

    Retrieves a run step.
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/v1/threads/{thread_id}/runs/{run_id}/steps/{step_id}'.format(thread_id='thread_id_example', run_id='run_id_example', step_id='step_id_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_thread(client):
    """Test case for get_thread

    Retrieves a thread.
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/v1/threads/{thread_id}'.format(thread_id='thread_id_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_list_assistant_files(client):
    """Test case for list_assistant_files

    Returns a list of assistant files.
    """
    params = [('limit', 20),
                    ('order', desc),
                    ('after', 'after_example'),
                    ('before', 'before_example')]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/v1/assistants/{assistant_id}/files'.format(assistant_id='assistant_id_example'),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_list_assistants(client):
    """Test case for list_assistants

    Returns a list of assistants.
    """
    params = [('limit', 20),
                    ('order', desc),
                    ('after', 'after_example'),
                    ('before', 'before_example')]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/v1/assistants',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_list_message_files(client):
    """Test case for list_message_files

    Returns a list of message files.
    """
    params = [('limit', 20),
                    ('order', desc),
                    ('after', 'after_example'),
                    ('before', 'before_example')]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/v1/threads/{thread_id}/messages/{message_id}/files'.format(thread_id='thread_id_example', message_id='message_id_example'),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_list_messages(client):
    """Test case for list_messages

    Returns a list of messages for a given thread.
    """
    params = [('limit', 20),
                    ('order', desc),
                    ('after', 'after_example'),
                    ('before', 'before_example'),
                    ('run_id', 'run_id_example')]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/v1/threads/{thread_id}/messages'.format(thread_id='thread_id_example'),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_list_run_steps(client):
    """Test case for list_run_steps

    Returns a list of run steps belonging to a run.
    """
    params = [('limit', 20),
                    ('order', desc),
                    ('after', 'after_example'),
                    ('before', 'before_example')]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/v1/threads/{thread_id}/runs/{run_id}/steps'.format(thread_id='thread_id_example', run_id='run_id_example'),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_list_runs(client):
    """Test case for list_runs

    Returns a list of runs belonging to a thread.
    """
    params = [('limit', 20),
                    ('order', desc),
                    ('after', 'after_example'),
                    ('before', 'before_example')]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/v1/threads/{thread_id}/runs'.format(thread_id='thread_id_example'),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_modify_assistant(client):
    """Test case for modify_assistant

    Modifies an assistant.
    """
    body = {"instructions":"instructions","metadata":"{}","name":"name","file_ids":["file_ids","file_ids","file_ids","file_ids","file_ids"],"description":"description","model":"model","tools":[{"type":"code_interpreter"},{"type":"code_interpreter"},{"type":"code_interpreter"},{"type":"code_interpreter"},{"type":"code_interpreter"}]}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/v1/assistants/{assistant_id}'.format(assistant_id='assistant_id_example'),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_modify_message(client):
    """Test case for modify_message

    Modifies a message.
    """
    body = {"metadata":"{}"}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/v1/threads/{thread_id}/messages/{message_id}'.format(thread_id='thread_id_example', message_id='message_id_example'),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_modify_run(client):
    """Test case for modify_run

    Modifies a run.
    """
    body = {"metadata":"{}"}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/v1/threads/{thread_id}/runs/{run_id}'.format(thread_id='thread_id_example', run_id='run_id_example'),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_modify_thread(client):
    """Test case for modify_thread

    Modifies a thread.
    """
    body = {"metadata":"{}"}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/v1/threads/{thread_id}'.format(thread_id='thread_id_example'),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_submit_tool_ouputs_to_run(client):
    """Test case for submit_tool_ouputs_to_run

    When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request. 
    """
    body = {"stream":True,"tool_outputs":[{"output":"output","tool_call_id":"tool_call_id"},{"output":"output","tool_call_id":"tool_call_id"}]}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/v1/threads/{thread_id}/runs/{run_id}/submit_tool_outputs'.format(thread_id='thread_id_example', run_id='run_id_example'),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

