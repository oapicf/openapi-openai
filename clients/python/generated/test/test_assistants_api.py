# coding: utf-8

"""
    OpenAI API

    The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

    The version of the OpenAPI document: 2.0.0
    Contact: blah+oapicf@cliffano.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapiopenai.api.assistants_api import AssistantsApi


class TestAssistantsApi(unittest.TestCase):
    """AssistantsApi unit test stubs"""

    def setUp(self) -> None:
        self.api = AssistantsApi()

    def tearDown(self) -> None:
        pass

    def test_cancel_run(self) -> None:
        """Test case for cancel_run

        Cancels a run that is `in_progress`.
        """
        pass

    def test_create_assistant(self) -> None:
        """Test case for create_assistant

        Create an assistant with a model and instructions.
        """
        pass

    def test_create_assistant_file(self) -> None:
        """Test case for create_assistant_file

        Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants).
        """
        pass

    def test_create_message(self) -> None:
        """Test case for create_message

        Create a message.
        """
        pass

    def test_create_run(self) -> None:
        """Test case for create_run

        Create a run.
        """
        pass

    def test_create_thread(self) -> None:
        """Test case for create_thread

        Create a thread.
        """
        pass

    def test_create_thread_and_run(self) -> None:
        """Test case for create_thread_and_run

        Create a thread and run it in one request.
        """
        pass

    def test_delete_assistant(self) -> None:
        """Test case for delete_assistant

        Delete an assistant.
        """
        pass

    def test_delete_assistant_file(self) -> None:
        """Test case for delete_assistant_file

        Delete an assistant file.
        """
        pass

    def test_delete_thread(self) -> None:
        """Test case for delete_thread

        Delete a thread.
        """
        pass

    def test_get_assistant(self) -> None:
        """Test case for get_assistant

        Retrieves an assistant.
        """
        pass

    def test_get_assistant_file(self) -> None:
        """Test case for get_assistant_file

        Retrieves an AssistantFile.
        """
        pass

    def test_get_message(self) -> None:
        """Test case for get_message

        Retrieve a message.
        """
        pass

    def test_get_message_file(self) -> None:
        """Test case for get_message_file

        Retrieves a message file.
        """
        pass

    def test_get_run(self) -> None:
        """Test case for get_run

        Retrieves a run.
        """
        pass

    def test_get_run_step(self) -> None:
        """Test case for get_run_step

        Retrieves a run step.
        """
        pass

    def test_get_thread(self) -> None:
        """Test case for get_thread

        Retrieves a thread.
        """
        pass

    def test_list_assistant_files(self) -> None:
        """Test case for list_assistant_files

        Returns a list of assistant files.
        """
        pass

    def test_list_assistants(self) -> None:
        """Test case for list_assistants

        Returns a list of assistants.
        """
        pass

    def test_list_message_files(self) -> None:
        """Test case for list_message_files

        Returns a list of message files.
        """
        pass

    def test_list_messages(self) -> None:
        """Test case for list_messages

        Returns a list of messages for a given thread.
        """
        pass

    def test_list_run_steps(self) -> None:
        """Test case for list_run_steps

        Returns a list of run steps belonging to a run.
        """
        pass

    def test_list_runs(self) -> None:
        """Test case for list_runs

        Returns a list of runs belonging to a thread.
        """
        pass

    def test_modify_assistant(self) -> None:
        """Test case for modify_assistant

        Modifies an assistant.
        """
        pass

    def test_modify_message(self) -> None:
        """Test case for modify_message

        Modifies a message.
        """
        pass

    def test_modify_run(self) -> None:
        """Test case for modify_run

        Modifies a run.
        """
        pass

    def test_modify_thread(self) -> None:
        """Test case for modify_thread

        Modifies a thread.
        """
        pass

    def test_submit_tool_ouputs_to_run(self) -> None:
        """Test case for submit_tool_ouputs_to_run

        When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request. 
        """
        pass


if __name__ == '__main__':
    unittest.main()
