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

from openapiopenai.models.chat_completion_stream_response_delta import ChatCompletionStreamResponseDelta

class TestChatCompletionStreamResponseDelta(unittest.TestCase):
    """ChatCompletionStreamResponseDelta unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ChatCompletionStreamResponseDelta:
        """Test ChatCompletionStreamResponseDelta
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ChatCompletionStreamResponseDelta`
        """
        model = ChatCompletionStreamResponseDelta()
        if include_optional:
            return ChatCompletionStreamResponseDelta(
                role = 'system',
                content = '',
                function_call = openapiopenai.models.chat_completion_request_message_function_call.ChatCompletionRequestMessage_function_call(
                    name = '', 
                    arguments = '', )
            )
        else:
            return ChatCompletionStreamResponseDelta(
        )
        """

    def testChatCompletionStreamResponseDelta(self):
        """Test ChatCompletionStreamResponseDelta"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()