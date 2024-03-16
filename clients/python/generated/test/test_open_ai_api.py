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

from openapiopenai.api.open_ai_api import OpenAIApi


class TestOpenAIApi(unittest.TestCase):
    """OpenAIApi unit test stubs"""

    def setUp(self) -> None:
        self.api = OpenAIApi()

    def tearDown(self) -> None:
        pass

    def test_cancel_fine_tune(self) -> None:
        """Test case for cancel_fine_tune

        Immediately cancel a fine-tune job. 
        """
        pass

    def test_create_chat_completion(self) -> None:
        """Test case for create_chat_completion

        Creates a model response for the given chat conversation.
        """
        pass

    def test_create_completion(self) -> None:
        """Test case for create_completion

        Creates a completion for the provided prompt and parameters.
        """
        pass

    def test_create_edit(self) -> None:
        """Test case for create_edit

        Creates a new edit for the provided input, instruction, and parameters.
        """
        pass

    def test_create_embedding(self) -> None:
        """Test case for create_embedding

        Creates an embedding vector representing the input text.
        """
        pass

    def test_create_file(self) -> None:
        """Test case for create_file

        Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 
        """
        pass

    def test_create_fine_tune(self) -> None:
        """Test case for create_fine_tune

        Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
        """
        pass

    def test_create_image(self) -> None:
        """Test case for create_image

        Creates an image given a prompt.
        """
        pass

    def test_create_image_edit(self) -> None:
        """Test case for create_image_edit

        Creates an edited or extended image given an original image and a prompt.
        """
        pass

    def test_create_image_variation(self) -> None:
        """Test case for create_image_variation

        Creates a variation of a given image.
        """
        pass

    def test_create_moderation(self) -> None:
        """Test case for create_moderation

        Classifies if text violates OpenAI's Content Policy
        """
        pass

    def test_create_transcription(self) -> None:
        """Test case for create_transcription

        Transcribes audio into the input language.
        """
        pass

    def test_create_translation(self) -> None:
        """Test case for create_translation

        Translates audio into English.
        """
        pass

    def test_delete_file(self) -> None:
        """Test case for delete_file

        Delete a file.
        """
        pass

    def test_delete_model(self) -> None:
        """Test case for delete_model

        Delete a fine-tuned model. You must have the Owner role in your organization.
        """
        pass

    def test_download_file(self) -> None:
        """Test case for download_file

        Returns the contents of the specified file
        """
        pass

    def test_list_files(self) -> None:
        """Test case for list_files

        Returns a list of files that belong to the user's organization.
        """
        pass

    def test_list_fine_tune_events(self) -> None:
        """Test case for list_fine_tune_events

        Get fine-grained status updates for a fine-tune job. 
        """
        pass

    def test_list_fine_tunes(self) -> None:
        """Test case for list_fine_tunes

        List your organization's fine-tuning jobs 
        """
        pass

    def test_list_models(self) -> None:
        """Test case for list_models

        Lists the currently available models, and provides basic information about each one such as the owner and availability.
        """
        pass

    def test_retrieve_file(self) -> None:
        """Test case for retrieve_file

        Returns information about a specific file.
        """
        pass

    def test_retrieve_fine_tune(self) -> None:
        """Test case for retrieve_fine_tune

        Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
        """
        pass

    def test_retrieve_model(self) -> None:
        """Test case for retrieve_model

        Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
        """
        pass


if __name__ == '__main__':
    unittest.main()
