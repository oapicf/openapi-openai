# coding: utf-8

from fastapi.testclient import TestClient


from openapi_server.models.create_chat_completion_request import CreateChatCompletionRequest  # noqa: F401
from openapi_server.models.create_chat_completion_response import CreateChatCompletionResponse  # noqa: F401
from openapi_server.models.create_completion_request import CreateCompletionRequest  # noqa: F401
from openapi_server.models.create_completion_response import CreateCompletionResponse  # noqa: F401
from openapi_server.models.create_edit_request import CreateEditRequest  # noqa: F401
from openapi_server.models.create_edit_response import CreateEditResponse  # noqa: F401
from openapi_server.models.create_embedding_request import CreateEmbeddingRequest  # noqa: F401
from openapi_server.models.create_embedding_response import CreateEmbeddingResponse  # noqa: F401
from openapi_server.models.create_fine_tune_request import CreateFineTuneRequest  # noqa: F401
from openapi_server.models.create_image_request import CreateImageRequest  # noqa: F401
from openapi_server.models.create_moderation_request import CreateModerationRequest  # noqa: F401
from openapi_server.models.create_moderation_response import CreateModerationResponse  # noqa: F401
from openapi_server.models.create_transcription_request_model import CreateTranscriptionRequestModel  # noqa: F401
from openapi_server.models.create_transcription_response import CreateTranscriptionResponse  # noqa: F401
from openapi_server.models.create_translation_response import CreateTranslationResponse  # noqa: F401
from openapi_server.models.delete_file_response import DeleteFileResponse  # noqa: F401
from openapi_server.models.delete_model_response import DeleteModelResponse  # noqa: F401
from openapi_server.models.fine_tune import FineTune  # noqa: F401
from openapi_server.models.images_response import ImagesResponse  # noqa: F401
from openapi_server.models.list_files_response import ListFilesResponse  # noqa: F401
from openapi_server.models.list_fine_tune_events_response import ListFineTuneEventsResponse  # noqa: F401
from openapi_server.models.list_fine_tunes_response import ListFineTunesResponse  # noqa: F401
from openapi_server.models.list_models_response import ListModelsResponse  # noqa: F401
from openapi_server.models.model import Model  # noqa: F401
from openapi_server.models.open_ai_file import OpenAIFile  # noqa: F401


def test_cancel_fine_tune(client: TestClient):
    """Test case for cancel_fine_tune

    Immediately cancel a fine-tune job. 
    """

    headers = {
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/fine-tunes/{fine_tune_id}/cancel".format(fine_tune_id='ft-AF1WoRqd3aJAHsqc9NY7iL8F'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_create_chat_completion(client: TestClient):
    """Test case for create_chat_completion

    Creates a model response for the given chat conversation.
    """
    create_chat_completion_request = {"logit_bias":"{}","functions":[{"name":"name","description":"description","parameters":{"key":""}},{"name":"name","description":"description","parameters":{"key":""}}],"function_call":"none","max_tokens":0,"presence_penalty":0.4109824732281613,"n":1,"top_p":1,"frequency_penalty":-1.413674807798822,"stop":"CreateChatCompletionRequest_stop","stream":0,"temperature":1,"messages":[{"role":"system","function_call":{"name":"name","arguments":"arguments"},"name":"name","content":"content"},{"role":"system","function_call":{"name":"name","arguments":"arguments"},"name":"name","content":"content"}],"model":"gpt-3.5-turbo","user":"user-1234"}

    headers = {
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/chat/completions",
    #    headers=headers,
    #    json=create_chat_completion_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_create_completion(client: TestClient):
    """Test case for create_completion

    Creates a completion for the provided prompt and parameters.
    """
    create_completion_request = {"logit_bias":"{}","max_tokens":16,"presence_penalty":0.4109824732281613,"echo":0,"suffix":"test.","n":1,"logprobs":0,"top_p":1,"frequency_penalty":-1.413674807798822,"stop":"\n","best_of":11,"stream":0,"temperature":1,"model":"CreateCompletionRequest_model","prompt":"This is a test.","user":"user-1234"}

    headers = {
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/completions",
    #    headers=headers,
    #    json=create_completion_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_create_edit(client: TestClient):
    """Test case for create_edit

    Creates a new edit for the provided input, instruction, and parameters.
    """
    create_edit_request = {"top_p":1,"input":"What day of the wek is it?","instruction":"Fix the spelling mistakes.","temperature":1,"model":"text-davinci-edit-001","n":1}

    headers = {
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/edits",
    #    headers=headers,
    #    json=create_edit_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_create_embedding(client: TestClient):
    """Test case for create_embedding

    Creates an embedding vector representing the input text.
    """
    create_embedding_request = {"input":"The quick brown fox jumped over the lazy dog","model":"text-embedding-ada-002","user":"user-1234"}

    headers = {
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/embeddings",
    #    headers=headers,
    #    json=create_embedding_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_create_file(client: TestClient):
    """Test case for create_file

    Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 
    """

    headers = {
    }
    data = {
        "file": '/path/to/file',
        "purpose": 'purpose_example'
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/files",
    #    headers=headers,
    #    data=data,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_create_fine_tune(client: TestClient):
    """Test case for create_fine_tune

    Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
    """
    create_fine_tune_request = {"training_file":"file-ajSREls59WBbvgSzJSVWxMCB","n_epochs":0,"batch_size":6,"classification_n_classes":5,"validation_file":"file-XjSREls59WBbvgSzJSVWxMCa","classification_betas":[0.6,1,1.5,2],"prompt_loss_weight":5.962133916683182,"model":"curie","compute_classification_metrics":0,"classification_positive_class":"classification_positive_class","suffix":"suffix","learning_rate_multiplier":1.4658129805029452}

    headers = {
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/fine-tunes",
    #    headers=headers,
    #    json=create_fine_tune_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_create_image(client: TestClient):
    """Test case for create_image

    Creates an image given a prompt.
    """
    create_image_request = {"response_format":"url","size":"1024x1024","prompt":"A cute baby sea otter","user":"user-1234","n":1}

    headers = {
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/images/generations",
    #    headers=headers,
    #    json=create_image_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_create_image_edit(client: TestClient):
    """Test case for create_image_edit

    Creates an edited or extended image given an original image and a prompt.
    """

    headers = {
    }
    data = {
        "image": '/path/to/file',
        "mask": '/path/to/file',
        "prompt": 'prompt_example',
        "n": 1,
        "size": '1024x1024',
        "response_format": 'url',
        "user": 'user_example'
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/images/edits",
    #    headers=headers,
    #    data=data,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_create_image_variation(client: TestClient):
    """Test case for create_image_variation

    Creates a variation of a given image.
    """

    headers = {
    }
    data = {
        "image": '/path/to/file',
        "n": 1,
        "size": '1024x1024',
        "response_format": 'url',
        "user": 'user_example'
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/images/variations",
    #    headers=headers,
    #    data=data,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_create_moderation(client: TestClient):
    """Test case for create_moderation

    Classifies if text violates OpenAI's Content Policy
    """
    create_moderation_request = {"input":"I want to kill them.","model":"text-moderation-stable"}

    headers = {
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/moderations",
    #    headers=headers,
    #    json=create_moderation_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_create_transcription(client: TestClient):
    """Test case for create_transcription

    Transcribes audio into the input language.
    """

    headers = {
    }
    data = {
        "file": '/path/to/file',
        "model": openapi_server.CreateTranscriptionRequestModel(),
        "prompt": 'prompt_example',
        "response_format": 'json',
        "temperature": 0,
        "language": 'language_example'
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
    }
    data = {
        "file": '/path/to/file',
        "model": openapi_server.CreateTranscriptionRequestModel(),
        "prompt": 'prompt_example',
        "response_format": 'json',
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


def test_delete_file(client: TestClient):
    """Test case for delete_file

    Delete a file.
    """

    headers = {
    }
    # uncomment below to make a request
    #response = client.request(
    #    "DELETE",
    #    "/files/{file_id}".format(file_id='file_id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_delete_model(client: TestClient):
    """Test case for delete_model

    Delete a fine-tuned model. You must have the Owner role in your organization.
    """

    headers = {
    }
    # uncomment below to make a request
    #response = client.request(
    #    "DELETE",
    #    "/models/{model}".format(model='curie:ft-acmeco-2021-03-03-21-44-20'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_download_file(client: TestClient):
    """Test case for download_file

    Returns the contents of the specified file
    """

    headers = {
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/files/{file_id}/content".format(file_id='file_id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_list_files(client: TestClient):
    """Test case for list_files

    Returns a list of files that belong to the user's organization.
    """

    headers = {
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/files",
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_list_fine_tune_events(client: TestClient):
    """Test case for list_fine_tune_events

    Get fine-grained status updates for a fine-tune job. 
    """
    params = [("stream", False)]
    headers = {
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/fine-tunes/{fine_tune_id}/events".format(fine_tune_id='ft-AF1WoRqd3aJAHsqc9NY7iL8F'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_list_fine_tunes(client: TestClient):
    """Test case for list_fine_tunes

    List your organization's fine-tuning jobs 
    """

    headers = {
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/fine-tunes",
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_list_models(client: TestClient):
    """Test case for list_models

    Lists the currently available models, and provides basic information about each one such as the owner and availability.
    """

    headers = {
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/models",
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_retrieve_file(client: TestClient):
    """Test case for retrieve_file

    Returns information about a specific file.
    """

    headers = {
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/files/{file_id}".format(file_id='file_id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_retrieve_fine_tune(client: TestClient):
    """Test case for retrieve_fine_tune

    Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
    """

    headers = {
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/fine-tunes/{fine_tune_id}".format(fine_tune_id='ft-AF1WoRqd3aJAHsqc9NY7iL8F'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_retrieve_model(client: TestClient):
    """Test case for retrieve_model

    Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
    """

    headers = {
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/models/{model}".format(model='text-davinci-001'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

