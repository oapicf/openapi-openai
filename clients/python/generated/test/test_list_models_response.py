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

from openapiopenai.models.list_models_response import ListModelsResponse

class TestListModelsResponse(unittest.TestCase):
    """ListModelsResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ListModelsResponse:
        """Test ListModelsResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ListModelsResponse`
        """
        model = ListModelsResponse()
        if include_optional:
            return ListModelsResponse(
                object = 'list',
                data = [
                    openapiopenai.models.model.Model(
                        id = '', 
                        created = 56, 
                        object = 'model', 
                        owned_by = '', )
                    ]
            )
        else:
            return ListModelsResponse(
                object = 'list',
                data = [
                    openapiopenai.models.model.Model(
                        id = '', 
                        created = 56, 
                        object = 'model', 
                        owned_by = '', )
                    ],
        )
        """

    def testListModelsResponse(self):
        """Test ListModelsResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()