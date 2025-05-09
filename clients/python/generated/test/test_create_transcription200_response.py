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

from openapiopenai.models.create_transcription200_response import CreateTranscription200Response

class TestCreateTranscription200Response(unittest.TestCase):
    """CreateTranscription200Response unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CreateTranscription200Response:
        """Test CreateTranscription200Response
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CreateTranscription200Response`
        """
        model = CreateTranscription200Response()
        if include_optional:
            return CreateTranscription200Response(
                text = '',
                language = '',
                duration = '',
                words = [
                    openapiopenai.models.transcription_word.TranscriptionWord(
                        word = '', 
                        start = 1.337, 
                        end = 1.337, )
                    ],
                segments = [
                    openapiopenai.models.transcription_segment.TranscriptionSegment(
                        id = 56, 
                        seek = 56, 
                        start = 1.337, 
                        end = 1.337, 
                        text = '', 
                        tokens = [
                            56
                            ], 
                        temperature = 1.337, 
                        avg_logprob = 1.337, 
                        compression_ratio = 1.337, 
                        no_speech_prob = 1.337, )
                    ]
            )
        else:
            return CreateTranscription200Response(
                text = '',
                language = '',
                duration = '',
        )
        """

    def testCreateTranscription200Response(self):
        """Test CreateTranscription200Response"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
