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

from openapiopenai.models.fine_tuning_job_hyperparameters import FineTuningJobHyperparameters

class TestFineTuningJobHyperparameters(unittest.TestCase):
    """FineTuningJobHyperparameters unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> FineTuningJobHyperparameters:
        """Test FineTuningJobHyperparameters
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `FineTuningJobHyperparameters`
        """
        model = FineTuningJobHyperparameters()
        if include_optional:
            return FineTuningJobHyperparameters(
                n_epochs = None
            )
        else:
            return FineTuningJobHyperparameters(
                n_epochs = None,
        )
        """

    def testFineTuningJobHyperparameters(self):
        """Test FineTuningJobHyperparameters"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
