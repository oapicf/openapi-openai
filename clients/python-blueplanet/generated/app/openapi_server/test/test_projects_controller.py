# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.error_response import ErrorResponse  # noqa: E501
from app.openapi_server.models.project import Project  # noqa: E501
from app.openapi_server.models.project_api_key import ProjectApiKey  # noqa: E501
from app.openapi_server.models.project_api_key_delete_response import ProjectApiKeyDeleteResponse  # noqa: E501
from app.openapi_server.models.project_api_key_list_response import ProjectApiKeyListResponse  # noqa: E501
from app.openapi_server.models.project_create_request import ProjectCreateRequest  # noqa: E501
from app.openapi_server.models.project_list_response import ProjectListResponse  # noqa: E501
from app.openapi_server.models.project_rate_limit import ProjectRateLimit  # noqa: E501
from app.openapi_server.models.project_rate_limit_list_response import ProjectRateLimitListResponse  # noqa: E501
from app.openapi_server.models.project_rate_limit_update_request import ProjectRateLimitUpdateRequest  # noqa: E501
from app.openapi_server.models.project_service_account import ProjectServiceAccount  # noqa: E501
from app.openapi_server.models.project_service_account_create_request import ProjectServiceAccountCreateRequest  # noqa: E501
from app.openapi_server.models.project_service_account_create_response import ProjectServiceAccountCreateResponse  # noqa: E501
from app.openapi_server.models.project_service_account_delete_response import ProjectServiceAccountDeleteResponse  # noqa: E501
from app.openapi_server.models.project_service_account_list_response import ProjectServiceAccountListResponse  # noqa: E501
from app.openapi_server.models.project_update_request import ProjectUpdateRequest  # noqa: E501
from app.openapi_server.models.project_user import ProjectUser  # noqa: E501
from app.openapi_server.models.project_user_create_request import ProjectUserCreateRequest  # noqa: E501
from app.openapi_server.models.project_user_delete_response import ProjectUserDeleteResponse  # noqa: E501
from app.openapi_server.models.project_user_list_response import ProjectUserListResponse  # noqa: E501
from app.openapi_server.models.project_user_update_request import ProjectUserUpdateRequest  # noqa: E501
from openapi_server.test import BaseTestCase


class TestProjectsController(BaseTestCase):
    """ProjectsController integration test stubs"""

    def test_archive_project(self):
        """Test case for archive_project

        Archives a project in the organization. Archived projects cannot be used or updated.
        """
        response = self.client.open(
            '/v1/organization/projects/{project_id}/archive'.format(project_id='project_id_example'),
            method='POST')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_project(self):
        """Test case for create_project

        Create a new project in the organization. Projects can be created and archived, but cannot be deleted.
        """
        body = {"name":"name"}
        response = self.client.open(
            '/v1/organization/projects',
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_project_service_account(self):
        """Test case for create_project_service_account

        Creates a new service account in the project. This also returns an unredacted API key for the service account.
        """
        body = {"name":"name"}
        response = self.client.open(
            '/v1/organization/projects/{project_id}/service_accounts'.format(project_id='project_id_example'),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_project_user(self):
        """Test case for create_project_user

        Adds a user to the project. Users must already be members of the organization to be added to a project.
        """
        body = {"role":"owner","user_id":"user_id"}
        response = self.client.open(
            '/v1/organization/projects/{project_id}/users'.format(project_id='project_id_example'),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_project_api_key(self):
        """Test case for delete_project_api_key

        Deletes an API key from the project.
        """
        response = self.client.open(
            '/v1/organization/projects/{project_id}/api_keys/{key_id}'.format(project_id='project_id_example', key_id='key_id_example'),
            method='DELETE')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_project_service_account(self):
        """Test case for delete_project_service_account

        Deletes a service account from the project.
        """
        response = self.client.open(
            '/v1/organization/projects/{project_id}/service_accounts/{service_account_id}'.format(project_id='project_id_example', service_account_id='service_account_id_example'),
            method='DELETE')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_project_user(self):
        """Test case for delete_project_user

        Deletes a user from the project.
        """
        response = self.client.open(
            '/v1/organization/projects/{project_id}/users/{user_id}'.format(project_id='project_id_example', user_id='user_id_example'),
            method='DELETE')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_list_project_api_keys(self):
        """Test case for list_project_api_keys

        Returns a list of API keys in the project.
        """
        query_string = [('limit', 20),
                        ('after', 'after_example')]
        response = self.client.open(
            '/v1/organization/projects/{project_id}/api_keys'.format(project_id='project_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_list_project_rate_limits(self):
        """Test case for list_project_rate_limits

        Returns the rate limits per model for a project.
        """
        query_string = [('limit', 100),
                        ('after', 'after_example'),
                        ('before', 'before_example')]
        response = self.client.open(
            '/v1/organization/projects/{project_id}/rate_limits'.format(project_id='project_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_list_project_service_accounts(self):
        """Test case for list_project_service_accounts

        Returns a list of service accounts in the project.
        """
        query_string = [('limit', 20),
                        ('after', 'after_example')]
        response = self.client.open(
            '/v1/organization/projects/{project_id}/service_accounts'.format(project_id='project_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_list_project_users(self):
        """Test case for list_project_users

        Returns a list of users in the project.
        """
        query_string = [('limit', 20),
                        ('after', 'after_example')]
        response = self.client.open(
            '/v1/organization/projects/{project_id}/users'.format(project_id='project_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_list_projects(self):
        """Test case for list_projects

        Returns a list of projects.
        """
        query_string = [('limit', 20),
                        ('after', 'after_example'),
                        ('include_archived', False)]
        response = self.client.open(
            '/v1/organization/projects',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_modify_project(self):
        """Test case for modify_project

        Modifies a project in the organization.
        """
        body = {"name":"name"}
        response = self.client.open(
            '/v1/organization/projects/{project_id}'.format(project_id='project_id_example'),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_modify_project_user(self):
        """Test case for modify_project_user

        Modifies a user's role in the project.
        """
        body = {"role":"owner"}
        response = self.client.open(
            '/v1/organization/projects/{project_id}/users/{user_id}'.format(project_id='project_id_example', user_id='user_id_example'),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_retrieve_project(self):
        """Test case for retrieve_project

        Retrieves a project.
        """
        response = self.client.open(
            '/v1/organization/projects/{project_id}'.format(project_id='project_id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_retrieve_project_api_key(self):
        """Test case for retrieve_project_api_key

        Retrieves an API key in the project.
        """
        response = self.client.open(
            '/v1/organization/projects/{project_id}/api_keys/{key_id}'.format(project_id='project_id_example', key_id='key_id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_retrieve_project_service_account(self):
        """Test case for retrieve_project_service_account

        Retrieves a service account in the project.
        """
        response = self.client.open(
            '/v1/organization/projects/{project_id}/service_accounts/{service_account_id}'.format(project_id='project_id_example', service_account_id='service_account_id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_retrieve_project_user(self):
        """Test case for retrieve_project_user

        Retrieves a user in the project.
        """
        response = self.client.open(
            '/v1/organization/projects/{project_id}/users/{user_id}'.format(project_id='project_id_example', user_id='user_id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_project_rate_limits(self):
        """Test case for update_project_rate_limits

        Updates a project rate limit.
        """
        body = {"batch_1_day_max_input_tokens":2,"max_tokens_per_1_minute":6,"max_images_per_1_minute":1,"max_audio_megabytes_per_1_minute":5,"max_requests_per_1_minute":0,"max_requests_per_1_day":5}
        response = self.client.open(
            '/v1/organization/projects/{project_id}/rate_limits/{rate_limit_id}'.format(project_id='project_id_example', rate_limit_id='rate_limit_id_example'),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
