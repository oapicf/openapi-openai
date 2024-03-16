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

from openapiopenai.models.create_fine_tune_request_model import CreateFineTuneRequestModel

class TestCreateFineTuneRequestModel(unittest.TestCase):
    """CreateFineTuneRequestModel unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CreateFineTuneRequestModel:
        """Test CreateFineTuneRequestModel
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CreateFineTuneRequestModel`
        """
        model = CreateFineTuneRequestModel()
        if include_optional:
            return CreateFineTuneRequestModel(
            )
        else:
            return CreateFineTuneRequestModel(
        )
        """

    def testCreateFineTuneRequestModel(self):
        """Test CreateFineTuneRequestModel"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
