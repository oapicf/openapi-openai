# coding: utf-8

import pytest
import json
from aiohttp import web
from aiohttp import FormData
from aiohttp import FormData
from aiohttp import FormData
from aiohttp import FormData
from aiohttp import FormData

from openapi_server.models.create_chat_completion_request import CreateChatCompletionRequest
from openapi_server.models.create_chat_completion_response import CreateChatCompletionResponse
from openapi_server.models.create_completion_request import CreateCompletionRequest
from openapi_server.models.create_completion_response import CreateCompletionResponse
from openapi_server.models.create_edit_request import CreateEditRequest
from openapi_server.models.create_edit_response import CreateEditResponse
from openapi_server.models.create_embedding_request import CreateEmbeddingRequest
from openapi_server.models.create_embedding_response import CreateEmbeddingResponse
from openapi_server.models.create_fine_tune_request import CreateFineTuneRequest
from openapi_server.models.create_image_request import CreateImageRequest
from openapi_server.models.create_moderation_request import CreateModerationRequest
from openapi_server.models.create_moderation_response import CreateModerationResponse
from openapi_server.models.create_transcription_request_model import CreateTranscriptionRequestModel
from openapi_server.models.create_transcription_response import CreateTranscriptionResponse
from openapi_server.models.create_translation_response import CreateTranslationResponse
from openapi_server.models.delete_file_response import DeleteFileResponse
from openapi_server.models.delete_model_response import DeleteModelResponse
from openapi_server.models.fine_tune import FineTune
from openapi_server.models.images_response import ImagesResponse
from openapi_server.models.list_files_response import ListFilesResponse
from openapi_server.models.list_fine_tune_events_response import ListFineTuneEventsResponse
from openapi_server.models.list_fine_tunes_response import ListFineTunesResponse
from openapi_server.models.list_models_response import ListModelsResponse
from openapi_server.models.model import Model
from openapi_server.models.open_ai_file import OpenAIFile


pytestmark = pytest.mark.asyncio

async def test_cancel_fine_tune(client):
    """Test case for cancel_fine_tune

    Immediately cancel a fine-tune job. 
    """
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='POST',
        path='/v1/fine-tunes/{fine_tune_id}/cancel'.format(fine_tune_id='ft-AF1WoRqd3aJAHsqc9NY7iL8F'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_create_chat_completion(client):
    """Test case for create_chat_completion

    Creates a model response for the given chat conversation.
    """
    body = {"logit_bias":"{}","functions":[{"name":"name","description":"description","parameters":{"key":""}},{"name":"name","description":"description","parameters":{"key":""}}],"function_call":"none","max_tokens":0,"presence_penalty":0.4109824732281613,"n":1,"top_p":1,"frequency_penalty":-1.413674807798822,"stop":"CreateChatCompletionRequest_stop","stream":False,"temperature":1,"messages":[{"role":"system","function_call":{"name":"name","arguments":"arguments"},"name":"name","content":"content"},{"role":"system","function_call":{"name":"name","arguments":"arguments"},"name":"name","content":"content"}],"model":"gpt-3.5-turbo","user":"user-1234"}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
    }
    response = await client.request(
        method='POST',
        path='/v1/chat/completions',
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_create_completion(client):
    """Test case for create_completion

    Creates a completion for the provided prompt and parameters.
    """
    body = {"logit_bias":"{}","max_tokens":16,"presence_penalty":0.4109824732281613,"echo":False,"suffix":"test.","n":1,"logprobs":0,"top_p":1,"frequency_penalty":-1.413674807798822,"stop":"\n","best_of":11,"stream":False,"temperature":1,"model":"CreateCompletionRequest_model","prompt":"This is a test.","user":"user-1234"}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
    }
    response = await client.request(
        method='POST',
        path='/v1/completions',
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_create_edit(client):
    """Test case for create_edit

    Creates a new edit for the provided input, instruction, and parameters.
    """
    body = {"top_p":1,"input":"What day of the wek is it?","instruction":"Fix the spelling mistakes.","temperature":1,"model":"text-davinci-edit-001","n":1}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
    }
    response = await client.request(
        method='POST',
        path='/v1/edits',
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_create_embedding(client):
    """Test case for create_embedding

    Creates an embedding vector representing the input text.
    """
    body = {"input":"The quick brown fox jumped over the lazy dog","model":"text-embedding-ada-002","user":"user-1234"}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
    }
    response = await client.request(
        method='POST',
        path='/v1/embeddings',
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

@pytest.mark.skip("multipart/form-data not supported by Connexion")
async def test_create_file(client):
    """Test case for create_file

    Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 
    """
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'multipart/form-data',
    }
    data = FormData()
    data.add_field('file', '/path/to/file')
    data.add_field('purpose', 'purpose_example')
    response = await client.request(
        method='POST',
        path='/v1/files',
        headers=headers,
        data=data,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_create_fine_tune(client):
    """Test case for create_fine_tune

    Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
    """
    body = {"training_file":"file-ajSREls59WBbvgSzJSVWxMCB","n_epochs":0,"batch_size":6,"classification_n_classes":5,"validation_file":"file-XjSREls59WBbvgSzJSVWxMCa","classification_betas":[0.6,1,1.5,2],"prompt_loss_weight":5.962133916683182,"model":"curie","compute_classification_metrics":False,"classification_positive_class":"classification_positive_class","suffix":"suffix","learning_rate_multiplier":1.4658129805029452}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
    }
    response = await client.request(
        method='POST',
        path='/v1/fine-tunes',
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_create_image(client):
    """Test case for create_image

    Creates an image given a prompt.
    """
    body = {"response_format":"url","size":"1024x1024","prompt":"A cute baby sea otter","user":"user-1234","n":1}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
    }
    response = await client.request(
        method='POST',
        path='/v1/images/generations',
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

@pytest.mark.skip("multipart/form-data not supported by Connexion")
async def test_create_image_edit(client):
    """Test case for create_image_edit

    Creates an edited or extended image given an original image and a prompt.
    """
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'multipart/form-data',
    }
    data = FormData()
    data.add_field('image', '/path/to/file')
    data.add_field('mask', '/path/to/file')
    data.add_field('prompt', 'prompt_example')
    data.add_field('n', 1)
    data.add_field('size', '1024x1024')
    data.add_field('response_format', 'url')
    data.add_field('user', 'user_example')
    response = await client.request(
        method='POST',
        path='/v1/images/edits',
        headers=headers,
        data=data,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

@pytest.mark.skip("multipart/form-data not supported by Connexion")
async def test_create_image_variation(client):
    """Test case for create_image_variation

    Creates a variation of a given image.
    """
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'multipart/form-data',
    }
    data = FormData()
    data.add_field('image', '/path/to/file')
    data.add_field('n', 1)
    data.add_field('size', '1024x1024')
    data.add_field('response_format', 'url')
    data.add_field('user', 'user_example')
    response = await client.request(
        method='POST',
        path='/v1/images/variations',
        headers=headers,
        data=data,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_create_moderation(client):
    """Test case for create_moderation

    Classifies if text violates OpenAI's Content Policy
    """
    body = {"input":"I want to kill them.","model":"text-moderation-stable"}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
    }
    response = await client.request(
        method='POST',
        path='/v1/moderations',
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
    }
    data = FormData()
    data.add_field('file', '/path/to/file')
    data.add_field('model', openapi_server.CreateTranscriptionRequestModel())
    data.add_field('prompt', 'prompt_example')
    data.add_field('response_format', 'json')
    data.add_field('temperature', 0)
    data.add_field('language', 'language_example')
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


pytestmark = pytest.mark.asyncio

async def test_delete_file(client):
    """Test case for delete_file

    Delete a file.
    """
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='DELETE',
        path='/v1/files/{file_id}'.format(file_id='file_id_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_delete_model(client):
    """Test case for delete_model

    Delete a fine-tuned model. You must have the Owner role in your organization.
    """
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='DELETE',
        path='/v1/models/{model}'.format(model='curie:ft-acmeco-2021-03-03-21-44-20'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_download_file(client):
    """Test case for download_file

    Returns the contents of the specified file
    """
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/v1/files/{file_id}/content'.format(file_id='file_id_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_list_files(client):
    """Test case for list_files

    Returns a list of files that belong to the user's organization.
    """
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/v1/files',
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_list_fine_tune_events(client):
    """Test case for list_fine_tune_events

    Get fine-grained status updates for a fine-tune job. 
    """
    params = [('stream', False)]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/v1/fine-tunes/{fine_tune_id}/events'.format(fine_tune_id='ft-AF1WoRqd3aJAHsqc9NY7iL8F'),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_list_fine_tunes(client):
    """Test case for list_fine_tunes

    List your organization's fine-tuning jobs 
    """
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/v1/fine-tunes',
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_list_models(client):
    """Test case for list_models

    Lists the currently available models, and provides basic information about each one such as the owner and availability.
    """
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/v1/models',
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_retrieve_file(client):
    """Test case for retrieve_file

    Returns information about a specific file.
    """
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/v1/files/{file_id}'.format(file_id='file_id_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_retrieve_fine_tune(client):
    """Test case for retrieve_fine_tune

    Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
    """
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/v1/fine-tunes/{fine_tune_id}'.format(fine_tune_id='ft-AF1WoRqd3aJAHsqc9NY7iL8F'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_retrieve_model(client):
    """Test case for retrieve_model

    Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
    """
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/v1/models/{model}'.format(model='text-davinci-001'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

