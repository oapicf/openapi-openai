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

from openapiopenai.models.fine_tuning_job_integrations_inner import FineTuningJobIntegrationsInner

class TestFineTuningJobIntegrationsInner(unittest.TestCase):
    """FineTuningJobIntegrationsInner unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> FineTuningJobIntegrationsInner:
        """Test FineTuningJobIntegrationsInner
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `FineTuningJobIntegrationsInner`
        """
        model = FineTuningJobIntegrationsInner()
        if include_optional:
            return FineTuningJobIntegrationsInner(
                type = 'wandb',
                wandb = openapiopenai.models.create_fine_tuning_job_request_integrations_inner_wandb.CreateFineTuningJobRequest_integrations_inner_wandb(
                    project = 'my-wandb-project', 
                    name = '', 
                    entity = '', 
                    tags = [
                        'custom-tag'
                        ], )
            )
        else:
            return FineTuningJobIntegrationsInner(
                type = 'wandb',
                wandb = openapiopenai.models.create_fine_tuning_job_request_integrations_inner_wandb.CreateFineTuningJobRequest_integrations_inner_wandb(
                    project = 'my-wandb-project', 
                    name = '', 
                    entity = '', 
                    tags = [
                        'custom-tag'
                        ], ),
        )
        """

    def testFineTuningJobIntegrationsInner(self):
        """Test FineTuningJobIntegrationsInner"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
