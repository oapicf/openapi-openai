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

from openapiopenai.models.assistants_api_named_tool_choice import AssistantsApiNamedToolChoice

class TestAssistantsApiNamedToolChoice(unittest.TestCase):
    """AssistantsApiNamedToolChoice unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> AssistantsApiNamedToolChoice:
        """Test AssistantsApiNamedToolChoice
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `AssistantsApiNamedToolChoice`
        """
        model = AssistantsApiNamedToolChoice()
        if include_optional:
            return AssistantsApiNamedToolChoice(
                type = 'function',
                function = openapiopenai.models.chat_completion_named_tool_choice_function.ChatCompletionNamedToolChoice_function(
                    name = '', )
            )
        else:
            return AssistantsApiNamedToolChoice(
                type = 'function',
        )
        """

    def testAssistantsApiNamedToolChoice(self):
        """Test AssistantsApiNamedToolChoice"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
