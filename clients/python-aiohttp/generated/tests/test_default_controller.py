# coding: utf-8

import pytest
import json
from aiohttp import web

from openapi_server.models.admin_api_key import AdminApiKey
from openapi_server.models.admin_api_keys_create_request import AdminApiKeysCreateRequest
from openapi_server.models.admin_api_keys_delete200_response import AdminApiKeysDelete200Response
from openapi_server.models.api_key_list import ApiKeyList


pytestmark = pytest.mark.asyncio

async def test_admin_api_keys_create(client):
    """Test case for admin_api_keys_create

    Create an organization admin API key
    """
    body = openapi_server.AdminApiKeysCreateRequest()
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/v1/organization/admin_api_keys',
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_admin_api_keys_delete(client):
    """Test case for admin_api_keys_delete

    Delete an organization admin API key
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='DELETE',
        path='/v1/organization/admin_api_keys/{key_id}'.format(key_id='key_id_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_admin_api_keys_get(client):
    """Test case for admin_api_keys_get

    Retrieve a single organization API key
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/v1/organization/admin_api_keys/{key_id}'.format(key_id='key_id_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_admin_api_keys_list(client):
    """Test case for admin_api_keys_list

    List organization API keys
    """
    params = [('after', 'after_example'),
                    ('order', asc),
                    ('limit', 20)]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/v1/organization/admin_api_keys',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

