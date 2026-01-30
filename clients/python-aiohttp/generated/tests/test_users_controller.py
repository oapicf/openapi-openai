# coding: utf-8

import pytest
import json
from aiohttp import web

from openapi_server.models.user import User
from openapi_server.models.user_delete_response import UserDeleteResponse
from openapi_server.models.user_list_response import UserListResponse
from openapi_server.models.user_role_update_request import UserRoleUpdateRequest


pytestmark = pytest.mark.asyncio

async def test_delete_user(client):
    """Test case for delete_user

    Deletes a user from the organization.
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='DELETE',
        path='/v1/organization/users/{user_id}'.format(user_id='user_id_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_list_users(client):
    """Test case for list_users

    Lists all of the users in the organization.
    """
    params = [('limit', 20),
                    ('after', 'after_example')]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/v1/organization/users',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_modify_user(client):
    """Test case for modify_user

    Modifies a user's role in the organization.
    """
    body = {"role":"owner"}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/v1/organization/users/{user_id}'.format(user_id='user_id_example'),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_retrieve_user(client):
    """Test case for retrieve_user

    Retrieves a user by their identifier.
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/v1/organization/users/{user_id}'.format(user_id='user_id_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

