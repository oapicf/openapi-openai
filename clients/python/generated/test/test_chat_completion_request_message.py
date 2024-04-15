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

from openapiopenai.models.chat_completion_request_message import ChatCompletionRequestMessage

class TestChatCompletionRequestMessage(unittest.TestCase):
    """ChatCompletionRequestMessage unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ChatCompletionRequestMessage:
        """Test ChatCompletionRequestMessage
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ChatCompletionRequestMessage`
        """
        model = ChatCompletionRequestMessage()
        if include_optional:
            return ChatCompletionRequestMessage(
                content = '',
                role = 'function',
                name = '',
                tool_calls = [
                    openapiopenai.models.chat_completion_message_tool_call.ChatCompletionMessageToolCall(
                        id = '', 
                        type = 'function', 
                        function = openapiopenai.models.chat_completion_message_tool_call_function.ChatCompletionMessageToolCall_function(
                            name = '', 
                            arguments = '', ), )
                    ],
                function_call = openapiopenai.models.chat_completion_request_assistant_message_function_call.ChatCompletionRequestAssistantMessage_function_call(
                    arguments = '', 
                    name = '', ),
                tool_call_id = ''
            )
        else:
            return ChatCompletionRequestMessage(
                content = '',
                role = 'function',
                name = '',
                tool_call_id = '',
        )
        """

    def testChatCompletionRequestMessage(self):
        """Test ChatCompletionRequestMessage"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()