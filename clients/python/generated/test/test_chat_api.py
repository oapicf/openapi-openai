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

from openapiopenai.api.chat_api import ChatApi


class TestChatApi(unittest.TestCase):
    """ChatApi unit test stubs"""

    def setUp(self) -> None:
        self.api = ChatApi()

    def tearDown(self) -> None:
        pass

    def test_create_chat_completion(self) -> None:
        """Test case for create_chat_completion

        Creates a model response for the given chat conversation.
        """
        pass


if __name__ == '__main__':
    unittest.main()
