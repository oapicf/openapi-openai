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

from openapiopenai.models.run_step_details_tool_calls_code_object_code_interpreter_outputs_inner import RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner

class TestRunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner(unittest.TestCase):
    """RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner:
        """Test RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner`
        """
        model = RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner()
        if include_optional:
            return RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner(
                type = 'logs',
                logs = '',
                image = openapiopenai.models.run_step_details_tool_calls_code_output_image_object_image.RunStepDetailsToolCallsCodeOutputImageObject_image(
                    file_id = '', )
            )
        else:
            return RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner(
                type = 'logs',
                logs = '',
                image = openapiopenai.models.run_step_details_tool_calls_code_output_image_object_image.RunStepDetailsToolCallsCodeOutputImageObject_image(
                    file_id = '', ),
        )
        """

    def testRunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner(self):
        """Test RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()