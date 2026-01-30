# coding: utf-8

import pytest
import json
from aiohttp import web

from openapi_server.models.create_vector_store_file_batch_request import CreateVectorStoreFileBatchRequest
from openapi_server.models.create_vector_store_file_request import CreateVectorStoreFileRequest
from openapi_server.models.create_vector_store_request import CreateVectorStoreRequest
from openapi_server.models.delete_vector_store_file_response import DeleteVectorStoreFileResponse
from openapi_server.models.delete_vector_store_response import DeleteVectorStoreResponse
from openapi_server.models.list_vector_store_files_response import ListVectorStoreFilesResponse
from openapi_server.models.list_vector_stores_response import ListVectorStoresResponse
from openapi_server.models.update_vector_store_request import UpdateVectorStoreRequest
from openapi_server.models.vector_store_file_batch_object import VectorStoreFileBatchObject
from openapi_server.models.vector_store_file_object import VectorStoreFileObject
from openapi_server.models.vector_store_object import VectorStoreObject


pytestmark = pytest.mark.asyncio

async def test_cancel_vector_store_file_batch(client):
    """Test case for cancel_vector_store_file_batch

    Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/v1/vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel'.format(vector_store_id='vector_store_id_example', batch_id='batch_id_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_create_vector_store(client):
    """Test case for create_vector_store

    Create a vector store.
    """
    body = {"chunking_strategy":{"type":"auto"},"metadata":"{}","expires_after":{"anchor":"last_active_at","days":339},"file_ids":["file_ids","file_ids","file_ids","file_ids","file_ids"],"name":"name"}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/v1/vector_stores',
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_create_vector_store_file(client):
    """Test case for create_vector_store_file

    Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
    """
    body = {"chunking_strategy":{"type":"auto"},"file_id":"file_id"}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/v1/vector_stores/{vector_store_id}/files'.format(vector_store_id='vs_abc123'),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_create_vector_store_file_batch(client):
    """Test case for create_vector_store_file_batch

    Create a vector store file batch.
    """
    body = {"chunking_strategy":{"type":"auto"},"file_ids":["file_ids","file_ids","file_ids","file_ids","file_ids"]}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/v1/vector_stores/{vector_store_id}/file_batches'.format(vector_store_id='vs_abc123'),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_delete_vector_store(client):
    """Test case for delete_vector_store

    Delete a vector store.
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='DELETE',
        path='/v1/vector_stores/{vector_store_id}'.format(vector_store_id='vector_store_id_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_delete_vector_store_file(client):
    """Test case for delete_vector_store_file

    Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='DELETE',
        path='/v1/vector_stores/{vector_store_id}/files/{file_id}'.format(vector_store_id='vector_store_id_example', file_id='file_id_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_vector_store(client):
    """Test case for get_vector_store

    Retrieves a vector store.
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/v1/vector_stores/{vector_store_id}'.format(vector_store_id='vector_store_id_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_vector_store_file(client):
    """Test case for get_vector_store_file

    Retrieves a vector store file.
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/v1/vector_stores/{vector_store_id}/files/{file_id}'.format(vector_store_id='vs_abc123', file_id='file-abc123'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_vector_store_file_batch(client):
    """Test case for get_vector_store_file_batch

    Retrieves a vector store file batch.
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/v1/vector_stores/{vector_store_id}/file_batches/{batch_id}'.format(vector_store_id='vs_abc123', batch_id='vsfb_abc123'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_list_files_in_vector_store_batch(client):
    """Test case for list_files_in_vector_store_batch

    Returns a list of vector store files in a batch.
    """
    params = [('limit', 20),
                    ('order', desc),
                    ('after', 'after_example'),
                    ('before', 'before_example'),
                    ('filter', 'filter_example')]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/v1/vector_stores/{vector_store_id}/file_batches/{batch_id}/files'.format(vector_store_id='vector_store_id_example', batch_id='batch_id_example'),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_list_vector_store_files(client):
    """Test case for list_vector_store_files

    Returns a list of vector store files.
    """
    params = [('limit', 20),
                    ('order', desc),
                    ('after', 'after_example'),
                    ('before', 'before_example'),
                    ('filter', 'filter_example')]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/v1/vector_stores/{vector_store_id}/files'.format(vector_store_id='vector_store_id_example'),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_list_vector_stores(client):
    """Test case for list_vector_stores

    Returns a list of vector stores.
    """
    params = [('limit', 20),
                    ('order', desc),
                    ('after', 'after_example'),
                    ('before', 'before_example')]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/v1/vector_stores',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_modify_vector_store(client):
    """Test case for modify_vector_store

    Modifies a vector store.
    """
    body = {"metadata":"{}","expires_after":{"anchor":"last_active_at","days":339},"name":"name"}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/v1/vector_stores/{vector_store_id}'.format(vector_store_id='vector_store_id_example'),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

