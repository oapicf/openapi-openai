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

from openapiopenai.models.message_delta_content_text_object import MessageDeltaContentTextObject

class TestMessageDeltaContentTextObject(unittest.TestCase):
    """MessageDeltaContentTextObject unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> MessageDeltaContentTextObject:
        """Test MessageDeltaContentTextObject
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `MessageDeltaContentTextObject`
        """
        model = MessageDeltaContentTextObject()
        if include_optional:
            return MessageDeltaContentTextObject(
                index = 56,
                type = 'text',
                text = openapiopenai.models.message_delta_content_text_object_text.MessageDeltaContentTextObject_text(
                    value = '', 
                    annotations = [
                        null
                        ], )
            )
        else:
            return MessageDeltaContentTextObject(
                index = 56,
                type = 'text',
        )
        """

    def testMessageDeltaContentTextObject(self):
        """Test MessageDeltaContentTextObject"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()