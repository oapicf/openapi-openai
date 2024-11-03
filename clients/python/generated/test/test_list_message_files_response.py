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

from openapiopenai.models.list_message_files_response import ListMessageFilesResponse

class TestListMessageFilesResponse(unittest.TestCase):
    """ListMessageFilesResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ListMessageFilesResponse:
        """Test ListMessageFilesResponse
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ListMessageFilesResponse`
        """
        model = ListMessageFilesResponse()
        if include_optional:
            return ListMessageFilesResponse(
                object = 'list',
                data = [
                    openapiopenai.models.message_files.Message files(
                        id = '', 
                        object = 'thread.message.file', 
                        created_at = 56, 
                        message_id = '', )
                    ],
                first_id = 'file-abc123',
                last_id = 'file-abc456',
                has_more = False
            )
        else:
            return ListMessageFilesResponse(
                object = 'list',
                data = [
                    openapiopenai.models.message_files.Message files(
                        id = '', 
                        object = 'thread.message.file', 
                        created_at = 56, 
                        message_id = '', )
                    ],
                first_id = 'file-abc123',
                last_id = 'file-abc456',
                has_more = False,
        )
        """

    def testListMessageFilesResponse(self):
        """Test ListMessageFilesResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
