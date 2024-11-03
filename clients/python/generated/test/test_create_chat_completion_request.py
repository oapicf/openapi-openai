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

from openapiopenai.models.create_chat_completion_request import CreateChatCompletionRequest

class TestCreateChatCompletionRequest(unittest.TestCase):
    """CreateChatCompletionRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CreateChatCompletionRequest:
        """Test CreateChatCompletionRequest
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CreateChatCompletionRequest`
        """
        model = CreateChatCompletionRequest()
        if include_optional:
            return CreateChatCompletionRequest(
                messages = [
                    null
                    ],
                model = gpt-4-turbo,
                frequency_penalty = -2,
                logit_bias = {
                    'key' : 56
                    },
                logprobs = True,
                top_logprobs = 0,
                max_tokens = 56,
                n = 1,
                presence_penalty = -2,
                response_format = openapiopenai.models.create_chat_completion_request_response_format.CreateChatCompletionRequest_response_format(
                    type = 'text', ),
                seed = -9223372036854775808,
                stop = None,
                stream = True,
                temperature = 1,
                top_p = 1,
                tools = [
                    openapiopenai.models.chat_completion_tool.ChatCompletionTool(
                        type = 'function', 
                        function = openapiopenai.models.function_object.FunctionObject(
                            description = '', 
                            name = '', 
                            parameters = { }, ), )
                    ],
                tool_choice = None,
                user = 'user-1234',
                function_call = None,
                functions = [
                    openapiopenai.models.chat_completion_functions.ChatCompletionFunctions(
                        description = '', 
                        name = '', 
                        parameters = { }, )
                    ]
            )
        else:
            return CreateChatCompletionRequest(
                messages = [
                    null
                    ],
                model = gpt-4-turbo,
        )
        """

    def testCreateChatCompletionRequest(self):
        """Test CreateChatCompletionRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
