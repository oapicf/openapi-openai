import unittest

from flask import json

from openapi_server.models.create_chat_completion_request import CreateChatCompletionRequest  # noqa: E501
from openapi_server.models.create_chat_completion_response import CreateChatCompletionResponse  # noqa: E501
from openapi_server.models.create_completion_request import CreateCompletionRequest  # noqa: E501
from openapi_server.models.create_completion_response import CreateCompletionResponse  # noqa: E501
from openapi_server.models.create_edit_request import CreateEditRequest  # noqa: E501
from openapi_server.models.create_edit_response import CreateEditResponse  # noqa: E501
from openapi_server.models.create_embedding_request import CreateEmbeddingRequest  # noqa: E501
from openapi_server.models.create_embedding_response import CreateEmbeddingResponse  # noqa: E501
from openapi_server.models.create_fine_tune_request import CreateFineTuneRequest  # noqa: E501
from openapi_server.models.create_image_request import CreateImageRequest  # noqa: E501
from openapi_server.models.create_moderation_request import CreateModerationRequest  # noqa: E501
from openapi_server.models.create_moderation_response import CreateModerationResponse  # noqa: E501
from openapi_server.models.create_transcription_request_model import CreateTranscriptionRequestModel  # noqa: E501
from openapi_server.models.create_transcription_response import CreateTranscriptionResponse  # noqa: E501
from openapi_server.models.create_translation_response import CreateTranslationResponse  # noqa: E501
from openapi_server.models.delete_file_response import DeleteFileResponse  # noqa: E501
from openapi_server.models.delete_model_response import DeleteModelResponse  # noqa: E501
from openapi_server.models.fine_tune import FineTune  # noqa: E501
from openapi_server.models.images_response import ImagesResponse  # noqa: E501
from openapi_server.models.list_files_response import ListFilesResponse  # noqa: E501
from openapi_server.models.list_fine_tune_events_response import ListFineTuneEventsResponse  # noqa: E501
from openapi_server.models.list_fine_tunes_response import ListFineTunesResponse  # noqa: E501
from openapi_server.models.list_models_response import ListModelsResponse  # noqa: E501
from openapi_server.models.model import Model  # noqa: E501
from openapi_server.models.open_ai_file import OpenAIFile  # noqa: E501
from openapi_server.test import BaseTestCase


class TestOpenAIController(BaseTestCase):
    """OpenAIController integration test stubs"""

    def test_cancel_fine_tune(self):
        """Test case for cancel_fine_tune

        Immediately cancel a fine-tune job. 
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/v1/fine-tunes/{fine_tune_id}/cancel'.format(fine_tune_id='ft-AF1WoRqd3aJAHsqc9NY7iL8F'),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_chat_completion(self):
        """Test case for create_chat_completion

        Creates a model response for the given chat conversation.
        """
        create_chat_completion_request = {"logit_bias":"{}","functions":[{"name":"name","description":"description","parameters":{"key":""}},{"name":"name","description":"description","parameters":{"key":""}}],"function_call":"none","max_tokens":0,"presence_penalty":0.4109824732281613,"n":1,"top_p":1,"frequency_penalty":-1.413674807798822,"stop":"CreateChatCompletionRequest_stop","stream":False,"temperature":1,"messages":[{"role":"system","function_call":{"name":"name","arguments":"arguments"},"name":"name","content":"content"},{"role":"system","function_call":{"name":"name","arguments":"arguments"},"name":"name","content":"content"}],"model":"gpt-3.5-turbo","user":"user-1234"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/v1/chat/completions',
            method='POST',
            headers=headers,
            data=json.dumps(create_chat_completion_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_completion(self):
        """Test case for create_completion

        Creates a completion for the provided prompt and parameters.
        """
        create_completion_request = {"logit_bias":"{}","max_tokens":16,"presence_penalty":0.4109824732281613,"echo":False,"suffix":"test.","n":1,"logprobs":0,"top_p":1,"frequency_penalty":-1.413674807798822,"stop":"\n","best_of":11,"stream":False,"temperature":1,"model":"CreateCompletionRequest_model","prompt":"This is a test.","user":"user-1234"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/v1/completions',
            method='POST',
            headers=headers,
            data=json.dumps(create_completion_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_edit(self):
        """Test case for create_edit

        Creates a new edit for the provided input, instruction, and parameters.
        """
        create_edit_request = {"top_p":1,"input":"What day of the wek is it?","instruction":"Fix the spelling mistakes.","temperature":1,"model":"text-davinci-edit-001","n":1}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/v1/edits',
            method='POST',
            headers=headers,
            data=json.dumps(create_edit_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_embedding(self):
        """Test case for create_embedding

        Creates an embedding vector representing the input text.
        """
        create_embedding_request = {"input":"The quick brown fox jumped over the lazy dog","model":"text-embedding-ada-002","user":"user-1234"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/v1/embeddings',
            method='POST',
            headers=headers,
            data=json.dumps(create_embedding_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("multipart/form-data not supported by Connexion")
    def test_create_file(self):
        """Test case for create_file

        Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 
        """
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'multipart/form-data',
        }
        data = dict(file='/path/to/file',
                    purpose='purpose_example')
        response = self.client.open(
            '/v1/files',
            method='POST',
            headers=headers,
            data=data,
            content_type='multipart/form-data')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_fine_tune(self):
        """Test case for create_fine_tune

        Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
        """
        create_fine_tune_request = {"training_file":"file-ajSREls59WBbvgSzJSVWxMCB","n_epochs":0,"batch_size":6,"classification_n_classes":5,"validation_file":"file-XjSREls59WBbvgSzJSVWxMCa","classification_betas":[0.6,1,1.5,2],"prompt_loss_weight":5.962133916683182,"model":"curie","compute_classification_metrics":False,"classification_positive_class":"classification_positive_class","suffix":"suffix","learning_rate_multiplier":1.4658129805029452}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/v1/fine-tunes',
            method='POST',
            headers=headers,
            data=json.dumps(create_fine_tune_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_image(self):
        """Test case for create_image

        Creates an image given a prompt.
        """
        create_image_request = {"response_format":"url","size":"1024x1024","prompt":"A cute baby sea otter","user":"user-1234","n":1}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/v1/images/generations',
            method='POST',
            headers=headers,
            data=json.dumps(create_image_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("multipart/form-data not supported by Connexion")
    def test_create_image_edit(self):
        """Test case for create_image_edit

        Creates an edited or extended image given an original image and a prompt.
        """
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'multipart/form-data',
        }
        data = dict(image='/path/to/file',
                    mask='/path/to/file',
                    prompt='prompt_example',
                    n=1,
                    size='1024x1024',
                    response_format='url',
                    user='user_example')
        response = self.client.open(
            '/v1/images/edits',
            method='POST',
            headers=headers,
            data=data,
            content_type='multipart/form-data')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("multipart/form-data not supported by Connexion")
    def test_create_image_variation(self):
        """Test case for create_image_variation

        Creates a variation of a given image.
        """
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'multipart/form-data',
        }
        data = dict(image='/path/to/file',
                    n=1,
                    size='1024x1024',
                    response_format='url',
                    user='user_example')
        response = self.client.open(
            '/v1/images/variations',
            method='POST',
            headers=headers,
            data=data,
            content_type='multipart/form-data')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_moderation(self):
        """Test case for create_moderation

        Classifies if text violates OpenAI's Content Policy
        """
        create_moderation_request = {"input":"I want to kill them.","model":"text-moderation-stable"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/v1/moderations',
            method='POST',
            headers=headers,
            data=json.dumps(create_moderation_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("multipart/form-data not supported by Connexion")
    def test_create_transcription(self):
        """Test case for create_transcription

        Transcribes audio into the input language.
        """
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'multipart/form-data',
        }
        data = dict(file='/path/to/file',
                    model=openapi_server.CreateTranscriptionRequestModel(),
                    prompt='prompt_example',
                    response_format='json',
                    temperature=0,
                    language='language_example')
        response = self.client.open(
            '/v1/audio/transcriptions',
            method='POST',
            headers=headers,
            data=data,
            content_type='multipart/form-data')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("multipart/form-data not supported by Connexion")
    def test_create_translation(self):
        """Test case for create_translation

        Translates audio into English.
        """
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'multipart/form-data',
        }
        data = dict(file='/path/to/file',
                    model=openapi_server.CreateTranscriptionRequestModel(),
                    prompt='prompt_example',
                    response_format='json',
                    temperature=0)
        response = self.client.open(
            '/v1/audio/translations',
            method='POST',
            headers=headers,
            data=data,
            content_type='multipart/form-data')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_file(self):
        """Test case for delete_file

        Delete a file.
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/v1/files/{file_id}'.format(file_id='file_id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_model(self):
        """Test case for delete_model

        Delete a fine-tuned model. You must have the Owner role in your organization.
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/v1/models/{model}'.format(model='curie:ft-acmeco-2021-03-03-21-44-20'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_download_file(self):
        """Test case for download_file

        Returns the contents of the specified file
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/v1/files/{file_id}/content'.format(file_id='file_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_list_files(self):
        """Test case for list_files

        Returns a list of files that belong to the user's organization.
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/v1/files',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_list_fine_tune_events(self):
        """Test case for list_fine_tune_events

        Get fine-grained status updates for a fine-tune job. 
        """
        query_string = [('stream', False)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/v1/fine-tunes/{fine_tune_id}/events'.format(fine_tune_id='ft-AF1WoRqd3aJAHsqc9NY7iL8F'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_list_fine_tunes(self):
        """Test case for list_fine_tunes

        List your organization's fine-tuning jobs 
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/v1/fine-tunes',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_list_models(self):
        """Test case for list_models

        Lists the currently available models, and provides basic information about each one such as the owner and availability.
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/v1/models',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_retrieve_file(self):
        """Test case for retrieve_file

        Returns information about a specific file.
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/v1/files/{file_id}'.format(file_id='file_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_retrieve_fine_tune(self):
        """Test case for retrieve_fine_tune

        Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/v1/fine-tunes/{fine_tune_id}'.format(fine_tune_id='ft-AF1WoRqd3aJAHsqc9NY7iL8F'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_retrieve_model(self):
        """Test case for retrieve_model

        Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/v1/models/{model}'.format(model='text-davinci-001'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
