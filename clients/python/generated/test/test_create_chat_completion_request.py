# coding: utf-8

"""
    OpenAI API

    APIs for sampling from and fine-tuning language models

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
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CreateChatCompletionRequest`
        """
        model = CreateChatCompletionRequest()
        if include_optional:
            return CreateChatCompletionRequest(
                model = gpt-3.5-turbo,
                messages = [
                    openapiopenai.models.chat_completion_request_message.ChatCompletionRequestMessage(
                        role = 'system', 
                        content = '', 
                        name = '', 
                        function_call = openapiopenai.models.chat_completion_request_message_function_call.ChatCompletionRequestMessage_function_call(
                            name = '', 
                            arguments = '', ), )
                    ],
                functions = [
                    openapiopenai.models.chat_completion_functions.ChatCompletionFunctions(
                        name = '', 
                        description = '', 
                        parameters = { }, )
                    ],
                function_call = None,
                temperature = 1,
                top_p = 1,
                n = 1,
                stream = True,
                stop = None,
                max_tokens = 56,
                presence_penalty = -2,
                frequency_penalty = -2,
                logit_bias = None,
                user = 'user-1234'
            )
        else:
            return CreateChatCompletionRequest(
                model = gpt-3.5-turbo,
                messages = [
                    openapiopenai.models.chat_completion_request_message.ChatCompletionRequestMessage(
                        role = 'system', 
                        content = '', 
                        name = '', 
                        function_call = openapiopenai.models.chat_completion_request_message_function_call.ChatCompletionRequestMessage_function_call(
                            name = '', 
                            arguments = '', ), )
                    ],
        )
        """

    def testCreateChatCompletionRequest(self):
        """Test CreateChatCompletionRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()