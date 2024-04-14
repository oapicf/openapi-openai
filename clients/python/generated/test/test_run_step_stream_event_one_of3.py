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

from openapiopenai.models.run_step_stream_event_one_of3 import RunStepStreamEventOneOf3

class TestRunStepStreamEventOneOf3(unittest.TestCase):
    """RunStepStreamEventOneOf3 unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> RunStepStreamEventOneOf3:
        """Test RunStepStreamEventOneOf3
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `RunStepStreamEventOneOf3`
        """
        model = RunStepStreamEventOneOf3()
        if include_optional:
            return RunStepStreamEventOneOf3(
                event = 'thread.run.step.completed',
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
            return RunStepStreamEventOneOf3(
                event = 'thread.run.step.completed',
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

    def testRunStepStreamEventOneOf3(self):
        """Test RunStepStreamEventOneOf3"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
