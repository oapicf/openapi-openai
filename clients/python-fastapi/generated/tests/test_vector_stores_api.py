# coding: utf-8

from fastapi.testclient import TestClient


from pydantic import Field, StrictInt, StrictStr, field_validator  # noqa: F401
from typing import Optional  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.create_vector_store_file_batch_request import CreateVectorStoreFileBatchRequest  # noqa: F401
from openapi_server.models.create_vector_store_file_request import CreateVectorStoreFileRequest  # noqa: F401
from openapi_server.models.create_vector_store_request import CreateVectorStoreRequest  # noqa: F401
from openapi_server.models.delete_vector_store_file_response import DeleteVectorStoreFileResponse  # noqa: F401
from openapi_server.models.delete_vector_store_response import DeleteVectorStoreResponse  # noqa: F401
from openapi_server.models.list_vector_store_files_response import ListVectorStoreFilesResponse  # noqa: F401
from openapi_server.models.list_vector_stores_response import ListVectorStoresResponse  # noqa: F401
from openapi_server.models.update_vector_store_request import UpdateVectorStoreRequest  # noqa: F401
from openapi_server.models.vector_store_file_batch_object import VectorStoreFileBatchObject  # noqa: F401
from openapi_server.models.vector_store_file_object import VectorStoreFileObject  # noqa: F401
from openapi_server.models.vector_store_object import VectorStoreObject  # noqa: F401


def test_list_vector_stores(client: TestClient):
    """Test case for list_vector_stores

    Returns a list of vector stores.
    """
    params = [("limit", 20),     ("order", desc),     ("after", 'after_example'),     ("before", 'before_example')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/vector_stores",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_create_vector_store(client: TestClient):
    """Test case for create_vector_store

    Create a vector store.
    """
    create_vector_store_request = {"chunking_strategy":{"type":"auto"},"metadata":"{}","expires_after":{"anchor":"last_active_at","days":339},"file_ids":["file_ids","file_ids","file_ids","file_ids","file_ids"],"name":"name"}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/vector_stores",
    #    headers=headers,
    #    json=create_vector_store_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_vector_store(client: TestClient):
    """Test case for get_vector_store

    Retrieves a vector store.
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/vector_stores/{vector_store_id}".format(vector_store_id='vector_store_id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_modify_vector_store(client: TestClient):
    """Test case for modify_vector_store

    Modifies a vector store.
    """
    update_vector_store_request = {"metadata":"{}","expires_after":{"anchor":"last_active_at","days":339},"name":"name"}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/vector_stores/{vector_store_id}".format(vector_store_id='vector_store_id_example'),
    #    headers=headers,
    #    json=update_vector_store_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_delete_vector_store(client: TestClient):
    """Test case for delete_vector_store

    Delete a vector store.
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "DELETE",
    #    "/vector_stores/{vector_store_id}".format(vector_store_id='vector_store_id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_create_vector_store_file_batch(client: TestClient):
    """Test case for create_vector_store_file_batch

    Create a vector store file batch.
    """
    create_vector_store_file_batch_request = {"chunking_strategy":{"type":"auto"},"file_ids":["file_ids","file_ids","file_ids","file_ids","file_ids"]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/vector_stores/{vector_store_id}/file_batches".format(vector_store_id='vs_abc123'),
    #    headers=headers,
    #    json=create_vector_store_file_batch_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_vector_store_file_batch(client: TestClient):
    """Test case for get_vector_store_file_batch

    Retrieves a vector store file batch.
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/vector_stores/{vector_store_id}/file_batches/{batch_id}".format(vector_store_id='vs_abc123', batch_id='vsfb_abc123'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_cancel_vector_store_file_batch(client: TestClient):
    """Test case for cancel_vector_store_file_batch

    Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel".format(vector_store_id='vector_store_id_example', batch_id='batch_id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_list_files_in_vector_store_batch(client: TestClient):
    """Test case for list_files_in_vector_store_batch

    Returns a list of vector store files in a batch.
    """
    params = [("limit", 20),     ("order", desc),     ("after", 'after_example'),     ("before", 'before_example'),     ("filter", 'filter_example')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/vector_stores/{vector_store_id}/file_batches/{batch_id}/files".format(vector_store_id='vector_store_id_example', batch_id='batch_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_list_vector_store_files(client: TestClient):
    """Test case for list_vector_store_files

    Returns a list of vector store files.
    """
    params = [("limit", 20),     ("order", desc),     ("after", 'after_example'),     ("before", 'before_example'),     ("filter", 'filter_example')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/vector_stores/{vector_store_id}/files".format(vector_store_id='vector_store_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_create_vector_store_file(client: TestClient):
    """Test case for create_vector_store_file

    Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
    """
    create_vector_store_file_request = {"chunking_strategy":{"type":"auto"},"file_id":"file_id"}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/vector_stores/{vector_store_id}/files".format(vector_store_id='vs_abc123'),
    #    headers=headers,
    #    json=create_vector_store_file_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_vector_store_file(client: TestClient):
    """Test case for get_vector_store_file

    Retrieves a vector store file.
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/vector_stores/{vector_store_id}/files/{file_id}".format(vector_store_id='vs_abc123', file_id='file-abc123'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_delete_vector_store_file(client: TestClient):
    """Test case for delete_vector_store_file

    Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "DELETE",
    #    "/vector_stores/{vector_store_id}/files/{file_id}".format(vector_store_id='vector_store_id_example', file_id='file_id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

