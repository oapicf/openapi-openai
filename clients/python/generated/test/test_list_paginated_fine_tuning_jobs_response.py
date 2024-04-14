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

from openapiopenai.models.list_paginated_fine_tuning_jobs_response import ListPaginatedFineTuningJobsResponse

class TestListPaginatedFineTuningJobsResponse(unittest.TestCase):
    """ListPaginatedFineTuningJobsResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ListPaginatedFineTuningJobsResponse:
        """Test ListPaginatedFineTuningJobsResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ListPaginatedFineTuningJobsResponse`
        """
        model = ListPaginatedFineTuningJobsResponse()
        if include_optional:
            return ListPaginatedFineTuningJobsResponse(
                data = [
                    openapiopenai.models.fine_tuning_job.FineTuningJob(
                        id = '', 
                        created_at = 56, 
                        error = openapiopenai.models.fine_tuning_job_error.FineTuningJob_error(
                            code = '', 
                            message = '', 
                            param = '', ), 
                        fine_tuned_model = '', 
                        finished_at = 56, 
                        hyperparameters = openapiopenai.models.fine_tuning_job_hyperparameters.FineTuningJob_hyperparameters(
                            n_epochs = null, ), 
                        model = '', 
                        object = 'fine_tuning.job', 
                        organization_id = '', 
                        result_files = [
                            'file-abc123'
                            ], 
                        status = 'validating_files', 
                        trained_tokens = 56, 
                        training_file = '', 
                        validation_file = '', 
                        integrations = [
                            null
                            ], 
                        seed = 56, )
                    ],
                has_more = True,
                object = 'list'
            )
        else:
            return ListPaginatedFineTuningJobsResponse(
                data = [
                    openapiopenai.models.fine_tuning_job.FineTuningJob(
                        id = '', 
                        created_at = 56, 
                        error = openapiopenai.models.fine_tuning_job_error.FineTuningJob_error(
                            code = '', 
                            message = '', 
                            param = '', ), 
                        fine_tuned_model = '', 
                        finished_at = 56, 
                        hyperparameters = openapiopenai.models.fine_tuning_job_hyperparameters.FineTuningJob_hyperparameters(
                            n_epochs = null, ), 
                        model = '', 
                        object = 'fine_tuning.job', 
                        organization_id = '', 
                        result_files = [
                            'file-abc123'
                            ], 
                        status = 'validating_files', 
                        trained_tokens = 56, 
                        training_file = '', 
                        validation_file = '', 
                        integrations = [
                            null
                            ], 
                        seed = 56, )
                    ],
                has_more = True,
                object = 'list',
        )
        """

    def testListPaginatedFineTuningJobsResponse(self):
        """Test ListPaginatedFineTuningJobsResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
