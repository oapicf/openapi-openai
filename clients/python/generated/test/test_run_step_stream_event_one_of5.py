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

from openapiopenai.models.run_step_stream_event_one_of5 import RunStepStreamEventOneOf5

class TestRunStepStreamEventOneOf5(unittest.TestCase):
    """RunStepStreamEventOneOf5 unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> RunStepStreamEventOneOf5:
        """Test RunStepStreamEventOneOf5
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `RunStepStreamEventOneOf5`
        """
        model = RunStepStreamEventOneOf5()
        if include_optional:
            return RunStepStreamEventOneOf5(
                event = 'thread.run.step.cancelled',
                data = openapiopenai.models.run_steps.Run steps(
                    id = '', 
                    object = 'thread.run.step', 
                    created_at = 56, 
                    assistant_id = '', 
                    thread_id = '', 
                    run_id = '', 
                    type = 'message_creation', 
                    status = 'in_progress', 
                    step_details = openapiopenai.models.run_step_object_step_details.RunStepObject_step_details(), 
                    last_error = openapiopenai.models.run_step_object_last_error.RunStepObject_last_error(
                        code = 'server_error', 
                        message = '', ), 
                    expired_at = 56, 
                    cancelled_at = 56, 
                    failed_at = 56, 
                    completed_at = 56, 
                    metadata = openapiopenai.models.metadata.metadata(), 
                    usage = openapiopenai.models.run_step_completion_usage.RunStepCompletionUsage(
                        completion_tokens = 56, 
                        prompt_tokens = 56, 
                        total_tokens = 56, ), )
            )
        else:
            return RunStepStreamEventOneOf5(
                event = 'thread.run.step.cancelled',
                data = openapiopenai.models.run_steps.Run steps(
                    id = '', 
                    object = 'thread.run.step', 
                    created_at = 56, 
                    assistant_id = '', 
                    thread_id = '', 
                    run_id = '', 
                    type = 'message_creation', 
                    status = 'in_progress', 
                    step_details = openapiopenai.models.run_step_object_step_details.RunStepObject_step_details(), 
                    last_error = openapiopenai.models.run_step_object_last_error.RunStepObject_last_error(
                        code = 'server_error', 
                        message = '', ), 
                    expired_at = 56, 
                    cancelled_at = 56, 
                    failed_at = 56, 
                    completed_at = 56, 
                    metadata = openapiopenai.models.metadata.metadata(), 
                    usage = openapiopenai.models.run_step_completion_usage.RunStepCompletionUsage(
                        completion_tokens = 56, 
                        prompt_tokens = 56, 
                        total_tokens = 56, ), ),
        )
        """

    def testRunStepStreamEventOneOf5(self):
        """Test RunStepStreamEventOneOf5"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
