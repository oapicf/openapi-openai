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

from openapiopenai.models.create_run_request_model import CreateRunRequestModel

class TestCreateRunRequestModel(unittest.TestCase):
    """CreateRunRequestModel unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CreateRunRequestModel:
        """Test CreateRunRequestModel
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CreateRunRequestModel`
        """
        model = CreateRunRequestModel()
        if include_optional:
            return CreateRunRequestModel(
            )
        else:
            return CreateRunRequestModel(
        )
        """

    def testCreateRunRequestModel(self):
        """Test CreateRunRequestModel"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
