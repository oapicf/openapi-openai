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

from openapiopenai.models.run_step_delta_step_details_tool_calls_function_object import RunStepDeltaStepDetailsToolCallsFunctionObject

class TestRunStepDeltaStepDetailsToolCallsFunctionObject(unittest.TestCase):
    """RunStepDeltaStepDetailsToolCallsFunctionObject unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> RunStepDeltaStepDetailsToolCallsFunctionObject:
        """Test RunStepDeltaStepDetailsToolCallsFunctionObject
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `RunStepDeltaStepDetailsToolCallsFunctionObject`
        """
        model = RunStepDeltaStepDetailsToolCallsFunctionObject()
        if include_optional:
            return RunStepDeltaStepDetailsToolCallsFunctionObject(
                index = 56,
                id = '',
                type = 'function',
                function = openapiopenai.models.run_step_delta_step_details_tool_calls_function_object_function.RunStepDeltaStepDetailsToolCallsFunctionObject_function(
                    name = '', 
                    arguments = '', 
                    output = '', )
            )
        else:
            return RunStepDeltaStepDetailsToolCallsFunctionObject(
                index = 56,
                type = 'function',
        )
        """

    def testRunStepDeltaStepDetailsToolCallsFunctionObject(self):
        """Test RunStepDeltaStepDetailsToolCallsFunctionObject"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
