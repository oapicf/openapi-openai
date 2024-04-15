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

from openapiopenai.api.files_api import FilesApi


class TestFilesApi(unittest.TestCase):
    """FilesApi unit test stubs"""

    def setUp(self) -> None:
        self.api = FilesApi()

    def tearDown(self) -> None:
        pass

    def test_create_file(self) -> None:
        """Test case for create_file

        Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports `.jsonl` files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
        """
        pass

    def test_delete_file(self) -> None:
        """Test case for delete_file

        Delete a file.
        """
        pass

    def test_download_file(self) -> None:
        """Test case for download_file

        Returns the contents of the specified file.
        """
        pass

    def test_list_files(self) -> None:
        """Test case for list_files

        Returns a list of files that belong to the user's organization.
        """
        pass

    def test_retrieve_file(self) -> None:
        """Test case for retrieve_file

        Returns information about a specific file.
        """
        pass


if __name__ == '__main__':
    unittest.main()