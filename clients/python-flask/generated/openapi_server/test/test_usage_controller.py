import unittest

from flask import json

from openapi_server.models.usage_response import UsageResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestUsageController(BaseTestCase):
    """UsageController integration test stubs"""

    def test_usage_audio_speeches(self):
        """Test case for usage_audio_speeches

        Get audio speeches usage details for the organization.
        """
        query_string = [('start_time', 56),
                        ('end_time', 56),
                        ('bucket_width', 1d),
                        ('project_ids', ['project_ids_example']),
                        ('user_ids', ['user_ids_example']),
                        ('api_key_ids', ['api_key_ids_example']),
                        ('models', ['models_example']),
                        ('group_by', ['group_by_example']),
                        ('limit', 56),
                        ('page', 'page_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/organization/usage/audio_speeches',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_usage_audio_transcriptions(self):
        """Test case for usage_audio_transcriptions

        Get audio transcriptions usage details for the organization.
        """
        query_string = [('start_time', 56),
                        ('end_time', 56),
                        ('bucket_width', 1d),
                        ('project_ids', ['project_ids_example']),
                        ('user_ids', ['user_ids_example']),
                        ('api_key_ids', ['api_key_ids_example']),
                        ('models', ['models_example']),
                        ('group_by', ['group_by_example']),
                        ('limit', 56),
                        ('page', 'page_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/organization/usage/audio_transcriptions',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_usage_code_interpreter_sessions(self):
        """Test case for usage_code_interpreter_sessions

        Get code interpreter sessions usage details for the organization.
        """
        query_string = [('start_time', 56),
                        ('end_time', 56),
                        ('bucket_width', 1d),
                        ('project_ids', ['project_ids_example']),
                        ('group_by', ['group_by_example']),
                        ('limit', 56),
                        ('page', 'page_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/organization/usage/code_interpreter_sessions',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_usage_completions(self):
        """Test case for usage_completions

        Get completions usage details for the organization.
        """
        query_string = [('start_time', 56),
                        ('end_time', 56),
                        ('bucket_width', 1d),
                        ('project_ids', ['project_ids_example']),
                        ('user_ids', ['user_ids_example']),
                        ('api_key_ids', ['api_key_ids_example']),
                        ('models', ['models_example']),
                        ('batch', True),
                        ('group_by', ['group_by_example']),
                        ('limit', 56),
                        ('page', 'page_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/organization/usage/completions',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_usage_costs(self):
        """Test case for usage_costs

        Get costs details for the organization.
        """
        query_string = [('start_time', 56),
                        ('end_time', 56),
                        ('bucket_width', 1d),
                        ('project_ids', ['project_ids_example']),
                        ('group_by', ['group_by_example']),
                        ('limit', 7),
                        ('page', 'page_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/organization/costs',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_usage_embeddings(self):
        """Test case for usage_embeddings

        Get embeddings usage details for the organization.
        """
        query_string = [('start_time', 56),
                        ('end_time', 56),
                        ('bucket_width', 1d),
                        ('project_ids', ['project_ids_example']),
                        ('user_ids', ['user_ids_example']),
                        ('api_key_ids', ['api_key_ids_example']),
                        ('models', ['models_example']),
                        ('group_by', ['group_by_example']),
                        ('limit', 56),
                        ('page', 'page_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/organization/usage/embeddings',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_usage_images(self):
        """Test case for usage_images

        Get images usage details for the organization.
        """
        query_string = [('start_time', 56),
                        ('end_time', 56),
                        ('bucket_width', 1d),
                        ('sources', ['sources_example']),
                        ('sizes', ['sizes_example']),
                        ('project_ids', ['project_ids_example']),
                        ('user_ids', ['user_ids_example']),
                        ('api_key_ids', ['api_key_ids_example']),
                        ('models', ['models_example']),
                        ('group_by', ['group_by_example']),
                        ('limit', 56),
                        ('page', 'page_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/organization/usage/images',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_usage_moderations(self):
        """Test case for usage_moderations

        Get moderations usage details for the organization.
        """
        query_string = [('start_time', 56),
                        ('end_time', 56),
                        ('bucket_width', 1d),
                        ('project_ids', ['project_ids_example']),
                        ('user_ids', ['user_ids_example']),
                        ('api_key_ids', ['api_key_ids_example']),
                        ('models', ['models_example']),
                        ('group_by', ['group_by_example']),
                        ('limit', 56),
                        ('page', 'page_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/organization/usage/moderations',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_usage_vector_stores(self):
        """Test case for usage_vector_stores

        Get vector stores usage details for the organization.
        """
        query_string = [('start_time', 56),
                        ('end_time', 56),
                        ('bucket_width', 1d),
                        ('project_ids', ['project_ids_example']),
                        ('group_by', ['group_by_example']),
                        ('limit', 56),
                        ('page', 'page_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/organization/usage/vector_stores',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
