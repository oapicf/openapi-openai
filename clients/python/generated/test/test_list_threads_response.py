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

from openapiopenai.models.list_threads_response import ListThreadsResponse

class TestListThreadsResponse(unittest.TestCase):
    """ListThreadsResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ListThreadsResponse:
        """Test ListThreadsResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ListThreadsResponse`
        """
        model = ListThreadsResponse()
        if include_optional:
            return ListThreadsResponse(
                object = 'list',
                data = [
                    openapiopenai.models.thread.Thread(
                        id = '', 
                        object = 'thread', 
                        created_at = 56, 
                        metadata = openapiopenai.models.metadata.metadata(), )
                    ],
                first_id = 'asst_abc123',
                last_id = 'asst_abc456',
                has_more = False
            )
        else:
            return ListThreadsResponse(
                object = 'list',
                data = [
                    openapiopenai.models.thread.Thread(
                        id = '', 
                        object = 'thread', 
                        created_at = 56, 
                        metadata = openapiopenai.models.metadata.metadata(), )
                    ],
                first_id = 'asst_abc123',
                last_id = 'asst_abc456',
                has_more = False,
        )
        """

    def testListThreadsResponse(self):
        """Test ListThreadsResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
