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

from openapiopenai.models.create_chat_completion_response_choices_inner_logprobs import CreateChatCompletionResponseChoicesInnerLogprobs

class TestCreateChatCompletionResponseChoicesInnerLogprobs(unittest.TestCase):
    """CreateChatCompletionResponseChoicesInnerLogprobs unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CreateChatCompletionResponseChoicesInnerLogprobs:
        """Test CreateChatCompletionResponseChoicesInnerLogprobs
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CreateChatCompletionResponseChoicesInnerLogprobs`
        """
        model = CreateChatCompletionResponseChoicesInnerLogprobs()
        if include_optional:
            return CreateChatCompletionResponseChoicesInnerLogprobs(
                content = [
                    openapiopenai.models.chat_completion_token_logprob.ChatCompletionTokenLogprob(
                        token = '', 
                        logprob = 1.337, 
                        bytes = [
                            56
                            ], 
                        top_logprobs = [
                            openapiopenai.models.chat_completion_token_logprob_top_logprobs_inner.ChatCompletionTokenLogprob_top_logprobs_inner(
                                token = '', 
                                logprob = 1.337, 
                                bytes = [
                                    56
                                    ], )
                            ], )
                    ]
            )
        else:
            return CreateChatCompletionResponseChoicesInnerLogprobs(
                content = [
                    openapiopenai.models.chat_completion_token_logprob.ChatCompletionTokenLogprob(
                        token = '', 
                        logprob = 1.337, 
                        bytes = [
                            56
                            ], 
                        top_logprobs = [
                            openapiopenai.models.chat_completion_token_logprob_top_logprobs_inner.ChatCompletionTokenLogprob_top_logprobs_inner(
                                token = '', 
                                logprob = 1.337, 
                                bytes = [
                                    56
                                    ], )
                            ], )
                    ],
        )
        """

    def testCreateChatCompletionResponseChoicesInnerLogprobs(self):
        """Test CreateChatCompletionResponseChoicesInnerLogprobs"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
