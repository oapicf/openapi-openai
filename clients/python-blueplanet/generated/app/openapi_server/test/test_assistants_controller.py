# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

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
from openapi_server.test import BaseTestCase


class TestAssistantsController(BaseTestCase):
    """AssistantsController integration test stubs"""

    def test_cancel_run(self):
        """Test case for cancel_run

        Cancels a run that is `in_progress`.
        """
        response = self.client.open(
            '/v1/threads/{thread_id}/runs/{run_id}/cancel'.format(thread_id='thread_id_example', run_id='run_id_example'),
            method='POST')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_assistant(self):
        """Test case for create_assistant

        Create an assistant with a model and instructions.
        """
        body = {"instructions":"instructions","metadata":"{}","name":"name","file_ids":["file_ids","file_ids","file_ids","file_ids","file_ids"],"description":"description","model":"gpt-4-turbo","tools":[{"type":"code_interpreter"},{"type":"code_interpreter"},{"type":"code_interpreter"},{"type":"code_interpreter"},{"type":"code_interpreter"}]}
        response = self.client.open(
            '/v1/assistants',
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_assistant_file(self):
        """Test case for create_assistant_file

        Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants).
        """
        body = {"file_id":"file_id"}
        response = self.client.open(
            '/v1/assistants/{assistant_id}/files'.format(assistant_id='file-abc123'),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_message(self):
        """Test case for create_message

        Create a message.
        """
        body = {"metadata":"{}","role":"user","file_ids":["file_ids","file_ids","file_ids","file_ids","file_ids"],"content":"content"}
        response = self.client.open(
            '/v1/threads/{thread_id}/messages'.format(thread_id='thread_id_example'),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_run(self):
        """Test case for create_run

        Create a run.
        """
        body = {"instructions":"instructions","additional_instructions":"additional_instructions","metadata":"{}","assistant_id":"assistant_id","additional_messages":[{"metadata":"{}","role":"user","file_ids":["file_ids","file_ids","file_ids","file_ids","file_ids"],"content":"content"},{"metadata":"{}","role":"user","file_ids":["file_ids","file_ids","file_ids","file_ids","file_ids"],"content":"content"}],"tools":[{"type":"code_interpreter"},{"type":"code_interpreter"},{"type":"code_interpreter"},{"type":"code_interpreter"},{"type":"code_interpreter"}],"truncation_strategy":{"last_messages":1,"type":"auto"},"max_completion_tokens":256,"response_format":"none","stream":True,"temperature":1,"tool_choice":"none","model":"gpt-4-turbo","max_prompt_tokens":256}
        response = self.client.open(
            '/v1/threads/{thread_id}/runs'.format(thread_id='thread_id_example'),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_thread(self):
        """Test case for create_thread

        Create a thread.
        """
        body = {"metadata":"{}","messages":[{"metadata":"{}","role":"user","file_ids":["file_ids","file_ids","file_ids","file_ids","file_ids"],"content":"content"},{"metadata":"{}","role":"user","file_ids":["file_ids","file_ids","file_ids","file_ids","file_ids"],"content":"content"}]}
        response = self.client.open(
            '/v1/threads',
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_thread_and_run(self):
        """Test case for create_thread_and_run

        Create a thread and run it in one request.
        """
        body = {"instructions":"instructions","metadata":"{}","assistant_id":"assistant_id","thread":{"metadata":"{}","messages":[{"metadata":"{}","role":"user","file_ids":["file_ids","file_ids","file_ids","file_ids","file_ids"],"content":"content"},{"metadata":"{}","role":"user","file_ids":["file_ids","file_ids","file_ids","file_ids","file_ids"],"content":"content"}]},"tools":[{"type":"code_interpreter"},{"type":"code_interpreter"},{"type":"code_interpreter"},{"type":"code_interpreter"},{"type":"code_interpreter"}],"truncation_strategy":{"last_messages":1,"type":"auto"},"max_completion_tokens":256,"response_format":"none","stream":True,"temperature":1,"tool_choice":"none","model":"gpt-4-turbo","max_prompt_tokens":256}
        response = self.client.open(
            '/v1/threads/runs',
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_assistant(self):
        """Test case for delete_assistant

        Delete an assistant.
        """
        response = self.client.open(
            '/v1/assistants/{assistant_id}'.format(assistant_id='assistant_id_example'),
            method='DELETE')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_assistant_file(self):
        """Test case for delete_assistant_file

        Delete an assistant file.
        """
        response = self.client.open(
            '/v1/assistants/{assistant_id}/files/{file_id}'.format(assistant_id='assistant_id_example', file_id='file_id_example'),
            method='DELETE')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_thread(self):
        """Test case for delete_thread

        Delete a thread.
        """
        response = self.client.open(
            '/v1/threads/{thread_id}'.format(thread_id='thread_id_example'),
            method='DELETE')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_assistant(self):
        """Test case for get_assistant

        Retrieves an assistant.
        """
        response = self.client.open(
            '/v1/assistants/{assistant_id}'.format(assistant_id='assistant_id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_assistant_file(self):
        """Test case for get_assistant_file

        Retrieves an AssistantFile.
        """
        response = self.client.open(
            '/v1/assistants/{assistant_id}/files/{file_id}'.format(assistant_id='assistant_id_example', file_id='file_id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_message(self):
        """Test case for get_message

        Retrieve a message.
        """
        response = self.client.open(
            '/v1/threads/{thread_id}/messages/{message_id}'.format(thread_id='thread_id_example', message_id='message_id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_message_file(self):
        """Test case for get_message_file

        Retrieves a message file.
        """
        response = self.client.open(
            '/v1/threads/{thread_id}/messages/{message_id}/files/{file_id}'.format(thread_id='thread_abc123', message_id='msg_abc123', file_id='file-abc123'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_run(self):
        """Test case for get_run

        Retrieves a run.
        """
        response = self.client.open(
            '/v1/threads/{thread_id}/runs/{run_id}'.format(thread_id='thread_id_example', run_id='run_id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_run_step(self):
        """Test case for get_run_step

        Retrieves a run step.
        """
        response = self.client.open(
            '/v1/threads/{thread_id}/runs/{run_id}/steps/{step_id}'.format(thread_id='thread_id_example', run_id='run_id_example', step_id='step_id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_thread(self):
        """Test case for get_thread

        Retrieves a thread.
        """
        response = self.client.open(
            '/v1/threads/{thread_id}'.format(thread_id='thread_id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_list_assistant_files(self):
        """Test case for list_assistant_files

        Returns a list of assistant files.
        """
        query_string = [('limit', 20),
                        ('order', desc),
                        ('after', 'after_example'),
                        ('before', 'before_example')]
        response = self.client.open(
            '/v1/assistants/{assistant_id}/files'.format(assistant_id='assistant_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_list_assistants(self):
        """Test case for list_assistants

        Returns a list of assistants.
        """
        query_string = [('limit', 20),
                        ('order', desc),
                        ('after', 'after_example'),
                        ('before', 'before_example')]
        response = self.client.open(
            '/v1/assistants',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_list_message_files(self):
        """Test case for list_message_files

        Returns a list of message files.
        """
        query_string = [('limit', 20),
                        ('order', desc),
                        ('after', 'after_example'),
                        ('before', 'before_example')]
        response = self.client.open(
            '/v1/threads/{thread_id}/messages/{message_id}/files'.format(thread_id='thread_id_example', message_id='message_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_list_messages(self):
        """Test case for list_messages

        Returns a list of messages for a given thread.
        """
        query_string = [('limit', 20),
                        ('order', desc),
                        ('after', 'after_example'),
                        ('before', 'before_example'),
                        ('run_id', 'run_id_example')]
        response = self.client.open(
            '/v1/threads/{thread_id}/messages'.format(thread_id='thread_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_list_run_steps(self):
        """Test case for list_run_steps

        Returns a list of run steps belonging to a run.
        """
        query_string = [('limit', 20),
                        ('order', desc),
                        ('after', 'after_example'),
                        ('before', 'before_example')]
        response = self.client.open(
            '/v1/threads/{thread_id}/runs/{run_id}/steps'.format(thread_id='thread_id_example', run_id='run_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_list_runs(self):
        """Test case for list_runs

        Returns a list of runs belonging to a thread.
        """
        query_string = [('limit', 20),
                        ('order', desc),
                        ('after', 'after_example'),
                        ('before', 'before_example')]
        response = self.client.open(
            '/v1/threads/{thread_id}/runs'.format(thread_id='thread_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_modify_assistant(self):
        """Test case for modify_assistant

        Modifies an assistant.
        """
        body = {"instructions":"instructions","metadata":"{}","name":"name","file_ids":["file_ids","file_ids","file_ids","file_ids","file_ids"],"description":"description","model":"model","tools":[{"type":"code_interpreter"},{"type":"code_interpreter"},{"type":"code_interpreter"},{"type":"code_interpreter"},{"type":"code_interpreter"}]}
        response = self.client.open(
            '/v1/assistants/{assistant_id}'.format(assistant_id='assistant_id_example'),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_modify_message(self):
        """Test case for modify_message

        Modifies a message.
        """
        body = {"metadata":"{}"}
        response = self.client.open(
            '/v1/threads/{thread_id}/messages/{message_id}'.format(thread_id='thread_id_example', message_id='message_id_example'),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_modify_run(self):
        """Test case for modify_run

        Modifies a run.
        """
        body = {"metadata":"{}"}
        response = self.client.open(
            '/v1/threads/{thread_id}/runs/{run_id}'.format(thread_id='thread_id_example', run_id='run_id_example'),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_modify_thread(self):
        """Test case for modify_thread

        Modifies a thread.
        """
        body = {"metadata":"{}"}
        response = self.client.open(
            '/v1/threads/{thread_id}'.format(thread_id='thread_id_example'),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_submit_tool_ouputs_to_run(self):
        """Test case for submit_tool_ouputs_to_run

        When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request. 
        """
        body = {"stream":True,"tool_outputs":[{"output":"output","tool_call_id":"tool_call_id"},{"output":"output","tool_call_id":"tool_call_id"}]}
        response = self.client.open(
            '/v1/threads/{thread_id}/runs/{run_id}/submit_tool_outputs'.format(thread_id='thread_id_example', run_id='run_id_example'),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
