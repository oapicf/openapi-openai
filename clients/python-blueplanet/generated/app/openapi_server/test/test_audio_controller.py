# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.create_speech_request import CreateSpeechRequest  # noqa: E501
from app.openapi_server.models.create_transcription200_response import CreateTranscription200Response  # noqa: E501
from app.openapi_server.models.create_transcription_request_model import CreateTranscriptionRequestModel  # noqa: E501
from app.openapi_server.models.create_translation200_response import CreateTranslation200Response  # noqa: E501
from openapi_server.test import BaseTestCase


class TestAudioController(BaseTestCase):
    """AudioController integration test stubs"""

    def test_create_speech(self):
        """Test case for create_speech

        Generates audio from the input text.
        """
        body = {"voice":"alloy","input":"input","response_format":"mp3","model":"CreateSpeechRequest_model","speed":0.5503105714228793}
        response = self.client.open(
            '/v1/audio/speech',
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_transcription(self):
        """Test case for create_transcription

        Transcribes audio into the input language.
        """
        data = dict(file='/path/to/file',
                    model=openapi_server.CreateTranscriptionRequestModel(),
                    language='language_example',
                    prompt='prompt_example',
                    response_format='json',
                    temperature=0,
                    timestamp_granularities=['timestamp_granularities_example'])
        response = self.client.open(
            '/v1/audio/transcriptions',
            method='POST',
            data=data,
            content_type='multipart/form-data')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_translation(self):
        """Test case for create_translation

        Translates audio into English.
        """
        data = dict(file='/path/to/file',
                    model=openapi_server.CreateTranscriptionRequestModel(),
                    prompt='prompt_example',
                    response_format='json',
                    temperature=0)
        response = self.client.open(
            '/v1/audio/translations',
            method='POST',
            data=data,
            content_type='multipart/form-data')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
