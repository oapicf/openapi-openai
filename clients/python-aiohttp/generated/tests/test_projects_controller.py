# coding: utf-8

import pytest
import json
from aiohttp import web

from openapi_server.models.error_response import ErrorResponse
from openapi_server.models.project import Project
from openapi_server.models.project_api_key import ProjectApiKey
from openapi_server.models.project_api_key_delete_response import ProjectApiKeyDeleteResponse
from openapi_server.models.project_api_key_list_response import ProjectApiKeyListResponse
from openapi_server.models.project_create_request import ProjectCreateRequest
from openapi_server.models.project_list_response import ProjectListResponse
from openapi_server.models.project_rate_limit import ProjectRateLimit
from openapi_server.models.project_rate_limit_list_response import ProjectRateLimitListResponse
from openapi_server.models.project_rate_limit_update_request import ProjectRateLimitUpdateRequest
from openapi_server.models.project_service_account import ProjectServiceAccount
from openapi_server.models.project_service_account_create_request import ProjectServiceAccountCreateRequest
from openapi_server.models.project_service_account_create_response import ProjectServiceAccountCreateResponse
from openapi_server.models.project_service_account_delete_response import ProjectServiceAccountDeleteResponse
from openapi_server.models.project_service_account_list_response import ProjectServiceAccountListResponse
from openapi_server.models.project_update_request import ProjectUpdateRequest
from openapi_server.models.project_user import ProjectUser
from openapi_server.models.project_user_create_request import ProjectUserCreateRequest
from openapi_server.models.project_user_delete_response import ProjectUserDeleteResponse
from openapi_server.models.project_user_list_response import ProjectUserListResponse
from openapi_server.models.project_user_update_request import ProjectUserUpdateRequest


pytestmark = pytest.mark.asyncio

async def test_archive_project(client):
    """Test case for archive_project

    Archives a project in the organization. Archived projects cannot be used or updated.
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/v1/organization/projects/{project_id}/archive'.format(project_id='project_id_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_create_project(client):
    """Test case for create_project

    Create a new project in the organization. Projects can be created and archived, but cannot be deleted.
    """
    body = {"name":"name"}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/v1/organization/projects',
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_create_project_service_account(client):
    """Test case for create_project_service_account

    Creates a new service account in the project. This also returns an unredacted API key for the service account.
    """
    body = {"name":"name"}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/v1/organization/projects/{project_id}/service_accounts'.format(project_id='project_id_example'),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_create_project_user(client):
    """Test case for create_project_user

    Adds a user to the project. Users must already be members of the organization to be added to a project.
    """
    body = {"role":"owner","user_id":"user_id"}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/v1/organization/projects/{project_id}/users'.format(project_id='project_id_example'),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_delete_project_api_key(client):
    """Test case for delete_project_api_key

    Deletes an API key from the project.
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='DELETE',
        path='/v1/organization/projects/{project_id}/api_keys/{key_id}'.format(project_id='project_id_example', key_id='key_id_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_delete_project_service_account(client):
    """Test case for delete_project_service_account

    Deletes a service account from the project.
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='DELETE',
        path='/v1/organization/projects/{project_id}/service_accounts/{service_account_id}'.format(project_id='project_id_example', service_account_id='service_account_id_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_delete_project_user(client):
    """Test case for delete_project_user

    Deletes a user from the project.
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='DELETE',
        path='/v1/organization/projects/{project_id}/users/{user_id}'.format(project_id='project_id_example', user_id='user_id_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_list_project_api_keys(client):
    """Test case for list_project_api_keys

    Returns a list of API keys in the project.
    """
    params = [('limit', 20),
                    ('after', 'after_example')]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/v1/organization/projects/{project_id}/api_keys'.format(project_id='project_id_example'),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_list_project_rate_limits(client):
    """Test case for list_project_rate_limits

    Returns the rate limits per model for a project.
    """
    params = [('limit', 100),
                    ('after', 'after_example'),
                    ('before', 'before_example')]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/v1/organization/projects/{project_id}/rate_limits'.format(project_id='project_id_example'),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_list_project_service_accounts(client):
    """Test case for list_project_service_accounts

    Returns a list of service accounts in the project.
    """
    params = [('limit', 20),
                    ('after', 'after_example')]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/v1/organization/projects/{project_id}/service_accounts'.format(project_id='project_id_example'),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_list_project_users(client):
    """Test case for list_project_users

    Returns a list of users in the project.
    """
    params = [('limit', 20),
                    ('after', 'after_example')]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/v1/organization/projects/{project_id}/users'.format(project_id='project_id_example'),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_list_projects(client):
    """Test case for list_projects

    Returns a list of projects.
    """
    params = [('limit', 20),
                    ('after', 'after_example'),
                    ('include_archived', False)]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/v1/organization/projects',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_modify_project(client):
    """Test case for modify_project

    Modifies a project in the organization.
    """
    body = {"name":"name"}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/v1/organization/projects/{project_id}'.format(project_id='project_id_example'),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_modify_project_user(client):
    """Test case for modify_project_user

    Modifies a user's role in the project.
    """
    body = {"role":"owner"}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/v1/organization/projects/{project_id}/users/{user_id}'.format(project_id='project_id_example', user_id='user_id_example'),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_retrieve_project(client):
    """Test case for retrieve_project

    Retrieves a project.
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/v1/organization/projects/{project_id}'.format(project_id='project_id_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_retrieve_project_api_key(client):
    """Test case for retrieve_project_api_key

    Retrieves an API key in the project.
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/v1/organization/projects/{project_id}/api_keys/{key_id}'.format(project_id='project_id_example', key_id='key_id_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_retrieve_project_service_account(client):
    """Test case for retrieve_project_service_account

    Retrieves a service account in the project.
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/v1/organization/projects/{project_id}/service_accounts/{service_account_id}'.format(project_id='project_id_example', service_account_id='service_account_id_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_retrieve_project_user(client):
    """Test case for retrieve_project_user

    Retrieves a user in the project.
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/v1/organization/projects/{project_id}/users/{user_id}'.format(project_id='project_id_example', user_id='user_id_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_update_project_rate_limits(client):
    """Test case for update_project_rate_limits

    Updates a project rate limit.
    """
    body = {"batch_1_day_max_input_tokens":2,"max_tokens_per_1_minute":6,"max_images_per_1_minute":1,"max_audio_megabytes_per_1_minute":5,"max_requests_per_1_minute":0,"max_requests_per_1_day":5}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/v1/organization/projects/{project_id}/rate_limits/{rate_limit_id}'.format(project_id='project_id_example', rate_limit_id='rate_limit_id_example'),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

