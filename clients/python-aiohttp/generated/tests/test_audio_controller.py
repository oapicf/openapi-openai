# coding: utf-8

import pytest
import json
from aiohttp import web
from aiohttp import FormData
from aiohttp import FormData

from openapi_server.models.create_speech_request import CreateSpeechRequest
from openapi_server.models.create_transcription200_response import CreateTranscription200Response
from openapi_server.models.create_transcription_request_model import CreateTranscriptionRequestModel
from openapi_server.models.create_translation200_response import CreateTranslation200Response


pytestmark = pytest.mark.asyncio

async def test_create_speech(client):
    """Test case for create_speech

    Generates audio from the input text.
    """
    body = {"voice":"alloy","input":"input","response_format":"mp3","model":"CreateSpeechRequest_model","speed":0.5503105714228793}
    headers = { 
        'Accept': 'application/octet-stream',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/v1/audio/speech',
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

@pytest.mark.skip("multipart/form-data not supported by Connexion")
async def test_create_transcription(client):
    """Test case for create_transcription

    Transcribes audio into the input language.
    """
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'multipart/form-data',
        'Authorization': 'Bearer special-key',
    }
    data = FormData()
    data.add_field('file', '/path/to/file')
    data.add_field('model', openapi_server.CreateTranscriptionRequestModel())
    data.add_field('language', 'language_example')
    data.add_field('prompt', 'prompt_example')
    data.add_field('response_format', 'json')
    data.add_field('temperature', 0)
    data.add_field('timestamp_granularities', ['timestamp_granularities_example'])
    response = await client.request(
        method='POST',
        path='/v1/audio/transcriptions',
        headers=headers,
        data=data,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

@pytest.mark.skip("multipart/form-data not supported by Connexion")
async def test_create_translation(client):
    """Test case for create_translation

    Translates audio into English.
    """
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'multipart/form-data',
        'Authorization': 'Bearer special-key',
    }
    data = FormData()
    data.add_field('file', '/path/to/file')
    data.add_field('model', openapi_server.CreateTranscriptionRequestModel())
    data.add_field('prompt', 'prompt_example')
    data.add_field('response_format', 'json')
    data.add_field('temperature', 0)
    response = await client.request(
        method='POST',
        path='/v1/audio/translations',
        headers=headers,
        data=data,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

