# coding: utf-8

from fastapi.testclient import TestClient


from pydantic import Field, StrictBytes, StrictFloat, StrictInt, StrictStr, field_validator  # noqa: F401
from typing import List, Optional, Tuple, Union  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.audio_response_format import AudioResponseFormat  # noqa: F401
from openapi_server.models.create_speech_request import CreateSpeechRequest  # noqa: F401
from openapi_server.models.create_transcription200_response import CreateTranscription200Response  # noqa: F401
from openapi_server.models.create_transcription_request_model import CreateTranscriptionRequestModel  # noqa: F401
from openapi_server.models.create_translation200_response import CreateTranslation200Response  # noqa: F401


def test_create_speech(client: TestClient):
    """Test case for create_speech

    Generates audio from the input text.
    """
    create_speech_request = {"voice":"alloy","input":"input","response_format":"mp3","model":"CreateSpeechRequest_model","speed":0.5503105714228793}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/audio/speech",
    #    headers=headers,
    #    json=create_speech_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_create_transcription(client: TestClient):
    """Test case for create_transcription

    Transcribes audio into the input language.
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    data = {
        "file": '/path/to/file',
        "model": openapi_server.CreateTranscriptionRequestModel(),
        "language": 'language_example',
        "prompt": 'prompt_example',
        "response_format": json,
        "temperature": 0,
        "timestamp_granularities": ['timestamp_granularities_example']
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/audio/transcriptions",
    #    headers=headers,
    #    data=data,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_create_translation(client: TestClient):
    """Test case for create_translation

    Translates audio into English.
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    data = {
        "file": '/path/to/file',
        "model": openapi_server.CreateTranscriptionRequestModel(),
        "prompt": 'prompt_example',
        "response_format": json,
        "temperature": 0
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/audio/translations",
    #    headers=headers,
    #    data=data,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

