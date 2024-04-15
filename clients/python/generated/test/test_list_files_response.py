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

from openapiopenai.models.list_files_response import ListFilesResponse

class TestListFilesResponse(unittest.TestCase):
    """ListFilesResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ListFilesResponse:
        """Test ListFilesResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ListFilesResponse`
        """
        model = ListFilesResponse()
        if include_optional:
            return ListFilesResponse(
                data = [
                    openapiopenai.models.open_ai_file.OpenAIFile(
                        id = '', 
                        bytes = 56, 
                        created_at = 56, 
                        filename = '', 
                        object = 'file', 
                        purpose = 'fine-tune', 
                        status = 'uploaded', 
                        status_details = '', )
                    ],
                object = 'list'
            )
        else:
            return ListFilesResponse(
                data = [
                    openapiopenai.models.open_ai_file.OpenAIFile(
                        id = '', 
                        bytes = 56, 
                        created_at = 56, 
                        filename = '', 
                        object = 'file', 
                        purpose = 'fine-tune', 
                        status = 'uploaded', 
                        status_details = '', )
                    ],
                object = 'list',
        )
        """

    def testListFilesResponse(self):
        """Test ListFilesResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()