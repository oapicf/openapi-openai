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

from openapiopenai.models.create_chat_completion_request_model import CreateChatCompletionRequestModel

class TestCreateChatCompletionRequestModel(unittest.TestCase):
    """CreateChatCompletionRequestModel unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CreateChatCompletionRequestModel:
        """Test CreateChatCompletionRequestModel
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CreateChatCompletionRequestModel`
        """
        model = CreateChatCompletionRequestModel()
        if include_optional:
            return CreateChatCompletionRequestModel(
            )
        else:
            return CreateChatCompletionRequestModel(
        )
        """

    def testCreateChatCompletionRequestModel(self):
        """Test CreateChatCompletionRequestModel"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()