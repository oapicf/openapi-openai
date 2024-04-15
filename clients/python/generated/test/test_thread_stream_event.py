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

from openapiopenai.models.thread_stream_event import ThreadStreamEvent

class TestThreadStreamEvent(unittest.TestCase):
    """ThreadStreamEvent unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ThreadStreamEvent:
        """Test ThreadStreamEvent
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ThreadStreamEvent`
        """
        model = ThreadStreamEvent()
        if include_optional:
            return ThreadStreamEvent(
                event = 'thread.created',
                data = openapiopenai.models.thread.Thread(
                    id = '', 
                    object = 'thread', 
                    created_at = 56, 
                    metadata = openapiopenai.models.metadata.metadata(), )
            )
        else:
            return ThreadStreamEvent(
                event = 'thread.created',
                data = openapiopenai.models.thread.Thread(
                    id = '', 
                    object = 'thread', 
                    created_at = 56, 
                    metadata = openapiopenai.models.metadata.metadata(), ),
        )
        """

    def testThreadStreamEvent(self):
        """Test ThreadStreamEvent"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()