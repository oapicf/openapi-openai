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

from openapiopenai.models.fine_tuning_job_hyperparameters_n_epochs import FineTuningJobHyperparametersNEpochs

class TestFineTuningJobHyperparametersNEpochs(unittest.TestCase):
    """FineTuningJobHyperparametersNEpochs unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> FineTuningJobHyperparametersNEpochs:
        """Test FineTuningJobHyperparametersNEpochs
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `FineTuningJobHyperparametersNEpochs`
        """
        model = FineTuningJobHyperparametersNEpochs()
        if include_optional:
            return FineTuningJobHyperparametersNEpochs(
            )
        else:
            return FineTuningJobHyperparametersNEpochs(
        )
        """

    def testFineTuningJobHyperparametersNEpochs(self):
        """Test FineTuningJobHyperparametersNEpochs"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
