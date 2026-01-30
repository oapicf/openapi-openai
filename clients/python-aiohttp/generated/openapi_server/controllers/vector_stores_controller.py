from typing import List, Dict
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
from openapi_server import util


async def cancel_vector_store_file_batch(request: web.Request, vector_store_id, batch_id) -> web.Response:
    """Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.

    

    :param vector_store_id: The ID of the vector store that the file batch belongs to.
    :type vector_store_id: str
    :param batch_id: The ID of the file batch to cancel.
    :type batch_id: str

    """
    return web.Response(status=200)


async def create_vector_store(request: web.Request, body) -> web.Response:
    """Create a vector store.

    

    :param body: 
    :type body: dict | bytes

    """
    body = CreateVectorStoreRequest.from_dict(body)
    return web.Response(status=200)


async def create_vector_store_file(request: web.Request, vector_store_id, body) -> web.Response:
    """Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).

    

    :param vector_store_id: The ID of the vector store for which to create a File. 
    :type vector_store_id: str
    :param body: 
    :type body: dict | bytes

    """
    body = CreateVectorStoreFileRequest.from_dict(body)
    return web.Response(status=200)


async def create_vector_store_file_batch(request: web.Request, vector_store_id, body) -> web.Response:
    """Create a vector store file batch.

    

    :param vector_store_id: The ID of the vector store for which to create a File Batch. 
    :type vector_store_id: str
    :param body: 
    :type body: dict | bytes

    """
    body = CreateVectorStoreFileBatchRequest.from_dict(body)
    return web.Response(status=200)


async def delete_vector_store(request: web.Request, vector_store_id) -> web.Response:
    """Delete a vector store.

    

    :param vector_store_id: The ID of the vector store to delete.
    :type vector_store_id: str

    """
    return web.Response(status=200)


async def delete_vector_store_file(request: web.Request, vector_store_id, file_id) -> web.Response:
    """Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.

    

    :param vector_store_id: The ID of the vector store that the file belongs to.
    :type vector_store_id: str
    :param file_id: The ID of the file to delete.
    :type file_id: str

    """
    return web.Response(status=200)


async def get_vector_store(request: web.Request, vector_store_id) -> web.Response:
    """Retrieves a vector store.

    

    :param vector_store_id: The ID of the vector store to retrieve.
    :type vector_store_id: str

    """
    return web.Response(status=200)


async def get_vector_store_file(request: web.Request, vector_store_id, file_id) -> web.Response:
    """Retrieves a vector store file.

    

    :param vector_store_id: The ID of the vector store that the file belongs to.
    :type vector_store_id: str
    :param file_id: The ID of the file being retrieved.
    :type file_id: str

    """
    return web.Response(status=200)


async def get_vector_store_file_batch(request: web.Request, vector_store_id, batch_id) -> web.Response:
    """Retrieves a vector store file batch.

    

    :param vector_store_id: The ID of the vector store that the file batch belongs to.
    :type vector_store_id: str
    :param batch_id: The ID of the file batch being retrieved.
    :type batch_id: str

    """
    return web.Response(status=200)


async def list_files_in_vector_store_batch(request: web.Request, vector_store_id, batch_id, limit=None, order=None, after=None, before=None, filter=None) -> web.Response:
    """Returns a list of vector store files in a batch.

    

    :param vector_store_id: The ID of the vector store that the files belong to.
    :type vector_store_id: str
    :param batch_id: The ID of the file batch that the files belong to.
    :type batch_id: str
    :param limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
    :type limit: int
    :param order: Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
    :type order: str
    :param after: A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
    :type after: str
    :param before: A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
    :type before: str
    :param filter: Filter by file status. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;cancelled&#x60;.
    :type filter: str

    """
    return web.Response(status=200)


async def list_vector_store_files(request: web.Request, vector_store_id, limit=None, order=None, after=None, before=None, filter=None) -> web.Response:
    """Returns a list of vector store files.

    

    :param vector_store_id: The ID of the vector store that the files belong to.
    :type vector_store_id: str
    :param limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
    :type limit: int
    :param order: Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
    :type order: str
    :param after: A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
    :type after: str
    :param before: A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
    :type before: str
    :param filter: Filter by file status. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;cancelled&#x60;.
    :type filter: str

    """
    return web.Response(status=200)


async def list_vector_stores(request: web.Request, limit=None, order=None, after=None, before=None) -> web.Response:
    """Returns a list of vector stores.

    

    :param limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
    :type limit: int
    :param order: Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
    :type order: str
    :param after: A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
    :type after: str
    :param before: A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
    :type before: str

    """
    return web.Response(status=200)


async def modify_vector_store(request: web.Request, vector_store_id, body) -> web.Response:
    """Modifies a vector store.

    

    :param vector_store_id: The ID of the vector store to modify.
    :type vector_store_id: str
    :param body: 
    :type body: dict | bytes

    """
    body = UpdateVectorStoreRequest.from_dict(body)
    return web.Response(status=200)
