# coding: utf-8

import pytest
import json
from aiohttp import web

from openapi_server.models.usage_response import UsageResponse


pytestmark = pytest.mark.asyncio

async def test_usage_audio_speeches(client):
    """Test case for usage_audio_speeches

    Get audio speeches usage details for the organization.
    """
    params = [('start_time', 56),
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
    response = await client.request(
        method='GET',
        path='/v1/organization/usage/audio_speeches',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_usage_audio_transcriptions(client):
    """Test case for usage_audio_transcriptions

    Get audio transcriptions usage details for the organization.
    """
    params = [('start_time', 56),
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
    response = await client.request(
        method='GET',
        path='/v1/organization/usage/audio_transcriptions',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_usage_code_interpreter_sessions(client):
    """Test case for usage_code_interpreter_sessions

    Get code interpreter sessions usage details for the organization.
    """
    params = [('start_time', 56),
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
    response = await client.request(
        method='GET',
        path='/v1/organization/usage/code_interpreter_sessions',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_usage_completions(client):
    """Test case for usage_completions

    Get completions usage details for the organization.
    """
    params = [('start_time', 56),
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
    response = await client.request(
        method='GET',
        path='/v1/organization/usage/completions',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_usage_costs(client):
    """Test case for usage_costs

    Get costs details for the organization.
    """
    params = [('start_time', 56),
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
    response = await client.request(
        method='GET',
        path='/v1/organization/costs',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_usage_embeddings(client):
    """Test case for usage_embeddings

    Get embeddings usage details for the organization.
    """
    params = [('start_time', 56),
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
    response = await client.request(
        method='GET',
        path='/v1/organization/usage/embeddings',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_usage_images(client):
    """Test case for usage_images

    Get images usage details for the organization.
    """
    params = [('start_time', 56),
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
    response = await client.request(
        method='GET',
        path='/v1/organization/usage/images',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_usage_moderations(client):
    """Test case for usage_moderations

    Get moderations usage details for the organization.
    """
    params = [('start_time', 56),
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
    response = await client.request(
        method='GET',
        path='/v1/organization/usage/moderations',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_usage_vector_stores(client):
    """Test case for usage_vector_stores

    Get vector stores usage details for the organization.
    """
    params = [('start_time', 56),
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
    response = await client.request(
        method='GET',
        path='/v1/organization/usage/vector_stores',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

