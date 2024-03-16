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

from openapiopenai.models.list_fine_tunes_response import ListFineTunesResponse

class TestListFineTunesResponse(unittest.TestCase):
    """ListFineTunesResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ListFineTunesResponse:
        """Test ListFineTunesResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ListFineTunesResponse`
        """
        model = ListFineTunesResponse()
        if include_optional:
            return ListFineTunesResponse(
                object = '',
                data = [
                    openapiopenai.models.fine_tune.FineTune(
                        id = '', 
                        object = '', 
                        created_at = 56, 
                        updated_at = 56, 
                        model = '', 
                        fine_tuned_model = '', 
                        organization_id = '', 
                        status = '', 
                        hyperparams = openapiopenai.models.hyperparams.hyperparams(), 
                        training_files = [
                            openapiopenai.models.open_ai_file.OpenAIFile(
                                id = '', 
                                object = '', 
                                bytes = 56, 
                                created_at = 56, 
                                filename = '', 
                                purpose = '', 
                                status = '', 
                                status_details = openapiopenai.models.status_details.status_details(), )
                            ], 
                        validation_files = [
                            openapiopenai.models.open_ai_file.OpenAIFile(
                                id = '', 
                                object = '', 
                                bytes = 56, 
                                created_at = 56, 
                                filename = '', 
                                purpose = '', 
                                status = '', 
                                status_details = openapiopenai.models.status_details.status_details(), )
                            ], 
                        result_files = [
                            
                            ], 
                        events = [
                            openapiopenai.models.fine_tune_event.FineTuneEvent(
                                object = '', 
                                created_at = 56, 
                                level = '', 
                                message = '', )
                            ], )
                    ]
            )
        else:
            return ListFineTunesResponse(
                object = '',
                data = [
                    openapiopenai.models.fine_tune.FineTune(
                        id = '', 
                        object = '', 
                        created_at = 56, 
                        updated_at = 56, 
                        model = '', 
                        fine_tuned_model = '', 
                        organization_id = '', 
                        status = '', 
                        hyperparams = openapiopenai.models.hyperparams.hyperparams(), 
                        training_files = [
                            openapiopenai.models.open_ai_file.OpenAIFile(
                                id = '', 
                                object = '', 
                                bytes = 56, 
                                created_at = 56, 
                                filename = '', 
                                purpose = '', 
                                status = '', 
                                status_details = openapiopenai.models.status_details.status_details(), )
                            ], 
                        validation_files = [
                            openapiopenai.models.open_ai_file.OpenAIFile(
                                id = '', 
                                object = '', 
                                bytes = 56, 
                                created_at = 56, 
                                filename = '', 
                                purpose = '', 
                                status = '', 
                                status_details = openapiopenai.models.status_details.status_details(), )
                            ], 
                        result_files = [
                            
                            ], 
                        events = [
                            openapiopenai.models.fine_tune_event.FineTuneEvent(
                                object = '', 
                                created_at = 56, 
                                level = '', 
                                message = '', )
                            ], )
                    ],
        )
        """

    def testListFineTunesResponse(self):
        """Test ListFineTunesResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
