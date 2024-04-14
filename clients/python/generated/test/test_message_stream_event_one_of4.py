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

from openapiopenai.models.message_stream_event_one_of4 import MessageStreamEventOneOf4

class TestMessageStreamEventOneOf4(unittest.TestCase):
    """MessageStreamEventOneOf4 unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> MessageStreamEventOneOf4:
        """Test MessageStreamEventOneOf4
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `MessageStreamEventOneOf4`
        """
        model = MessageStreamEventOneOf4()
        if include_optional:
            return MessageStreamEventOneOf4(
                event = 'thread.message.incomplete',
                data = openapiopenai.models.the_message_object.The message object(
                    id = '', 
                    object = 'thread.message', 
                    created_at = 56, 
                    thread_id = '', 
                    status = 'in_progress', 
                    incomplete_details = openapiopenai.models.message_object_incomplete_details.MessageObject_incomplete_details(
                        reason = 'content_filter', ), 
                    completed_at = 56, 
                    incomplete_at = 56, 
                    role = 'user', 
                    content = [
                        null
                        ], 
                    assistant_id = '', 
                    run_id = '', 
                    file_ids = [
                        ''
                        ], 
                    metadata = openapiopenai.models.metadata.metadata(), )
            )
        else:
            return MessageStreamEventOneOf4(
                event = 'thread.message.incomplete',
                data = openapiopenai.models.the_message_object.The message object(
                    id = '', 
                    object = 'thread.message', 
                    created_at = 56, 
                    thread_id = '', 
                    status = 'in_progress', 
                    incomplete_details = openapiopenai.models.message_object_incomplete_details.MessageObject_incomplete_details(
                        reason = 'content_filter', ), 
                    completed_at = 56, 
                    incomplete_at = 56, 
                    role = 'user', 
                    content = [
                        null
                        ], 
                    assistant_id = '', 
                    run_id = '', 
                    file_ids = [
                        ''
                        ], 
                    metadata = openapiopenai.models.metadata.metadata(), ),
        )
        """

    def testMessageStreamEventOneOf4(self):
        """Test MessageStreamEventOneOf4"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
