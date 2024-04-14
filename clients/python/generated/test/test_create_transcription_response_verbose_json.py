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

from openapiopenai.models.create_transcription_response_verbose_json import CreateTranscriptionResponseVerboseJson

class TestCreateTranscriptionResponseVerboseJson(unittest.TestCase):
    """CreateTranscriptionResponseVerboseJson unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CreateTranscriptionResponseVerboseJson:
        """Test CreateTranscriptionResponseVerboseJson
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CreateTranscriptionResponseVerboseJson`
        """
        model = CreateTranscriptionResponseVerboseJson()
        if include_optional:
            return CreateTranscriptionResponseVerboseJson(
                language = '',
                duration = '',
                text = '',
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
            return CreateTranscriptionResponseVerboseJson(
                language = '',
                duration = '',
                text = '',
        )
        """

    def testCreateTranscriptionResponseVerboseJson(self):
        """Test CreateTranscriptionResponseVerboseJson"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
