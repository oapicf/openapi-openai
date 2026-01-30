import connexion

from app.openapi_server.models.create_vector_store_file_batch_request import CreateVectorStoreFileBatchRequest  # noqa: E501
from app.openapi_server.models.create_vector_store_file_request import CreateVectorStoreFileRequest  # noqa: E501
from app.openapi_server.models.create_vector_store_request import CreateVectorStoreRequest  # noqa: E501
from app.openapi_server.models.delete_vector_store_file_response import DeleteVectorStoreFileResponse  # noqa: E501
from app.openapi_server.models.delete_vector_store_response import DeleteVectorStoreResponse  # noqa: E501
from app.openapi_server.models.list_vector_store_files_response import ListVectorStoreFilesResponse  # noqa: E501
from app.openapi_server.models.list_vector_stores_response import ListVectorStoresResponse  # noqa: E501
from app.openapi_server.models.update_vector_store_request import UpdateVectorStoreRequest  # noqa: E501
from app.openapi_server.models.vector_store_file_batch_object import VectorStoreFileBatchObject  # noqa: E501
from app.openapi_server.models.vector_store_file_object import VectorStoreFileObject  # noqa: E501
from app.openapi_server.models.vector_store_object import VectorStoreObject  # noqa: E501
from openapi_server import util


def cancel_vector_store_file_batch(vector_store_id, batch_id):  # noqa: E501
    """Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.

     # noqa: E501

    :param vector_store_id: The ID of the vector store that the file batch belongs to.
    :type vector_store_id: str
    :param batch_id: The ID of the file batch to cancel.
    :type batch_id: str

    :rtype: VectorStoreFileBatchObject
    """
    return 'do some magic!'


def create_vector_store(body):  # noqa: E501
    """Create a vector store.

     # noqa: E501

    :param body: 
    :type body: dict | bytes

    :rtype: VectorStoreObject
    """
    if connexion.request.is_json:
        body = CreateVectorStoreRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def create_vector_store_file(vector_store_id, body):  # noqa: E501
    """Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).

     # noqa: E501

    :param vector_store_id: The ID of the vector store for which to create a File. 
    :type vector_store_id: str
    :param body: 
    :type body: dict | bytes

    :rtype: VectorStoreFileObject
    """
    if connexion.request.is_json:
        body = CreateVectorStoreFileRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def create_vector_store_file_batch(vector_store_id, body):  # noqa: E501
    """Create a vector store file batch.

     # noqa: E501

    :param vector_store_id: The ID of the vector store for which to create a File Batch. 
    :type vector_store_id: str
    :param body: 
    :type body: dict | bytes

    :rtype: VectorStoreFileBatchObject
    """
    if connexion.request.is_json:
        body = CreateVectorStoreFileBatchRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_vector_store(vector_store_id):  # noqa: E501
    """Delete a vector store.

     # noqa: E501

    :param vector_store_id: The ID of the vector store to delete.
    :type vector_store_id: str

    :rtype: DeleteVectorStoreResponse
    """
    return 'do some magic!'


def delete_vector_store_file(vector_store_id, file_id):  # noqa: E501
    """Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.

     # noqa: E501

    :param vector_store_id: The ID of the vector store that the file belongs to.
    :type vector_store_id: str
    :param file_id: The ID of the file to delete.
    :type file_id: str

    :rtype: DeleteVectorStoreFileResponse
    """
    return 'do some magic!'


def get_vector_store(vector_store_id):  # noqa: E501
    """Retrieves a vector store.

     # noqa: E501

    :param vector_store_id: The ID of the vector store to retrieve.
    :type vector_store_id: str

    :rtype: VectorStoreObject
    """
    return 'do some magic!'


def get_vector_store_file(vector_store_id, file_id):  # noqa: E501
    """Retrieves a vector store file.

     # noqa: E501

    :param vector_store_id: The ID of the vector store that the file belongs to.
    :type vector_store_id: str
    :param file_id: The ID of the file being retrieved.
    :type file_id: str

    :rtype: VectorStoreFileObject
    """
    return 'do some magic!'


def get_vector_store_file_batch(vector_store_id, batch_id):  # noqa: E501
    """Retrieves a vector store file batch.

     # noqa: E501

    :param vector_store_id: The ID of the vector store that the file batch belongs to.
    :type vector_store_id: str
    :param batch_id: The ID of the file batch being retrieved.
    :type batch_id: str

    :rtype: VectorStoreFileBatchObject
    """
    return 'do some magic!'


def list_files_in_vector_store_batch(vector_store_id, batch_id, limit=None, order=None, after=None, before=None, filter=None):  # noqa: E501
    """Returns a list of vector store files in a batch.

     # noqa: E501

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

    :rtype: ListVectorStoreFilesResponse
    """
    return 'do some magic!'


def list_vector_store_files(vector_store_id, limit=None, order=None, after=None, before=None, filter=None):  # noqa: E501
    """Returns a list of vector store files.

     # noqa: E501

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

    :rtype: ListVectorStoreFilesResponse
    """
    return 'do some magic!'


def list_vector_stores(limit=None, order=None, after=None, before=None):  # noqa: E501
    """Returns a list of vector stores.

     # noqa: E501

    :param limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
    :type limit: int
    :param order: Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
    :type order: str
    :param after: A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
    :type after: str
    :param before: A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
    :type before: str

    :rtype: ListVectorStoresResponse
    """
    return 'do some magic!'


def modify_vector_store(vector_store_id, body):  # noqa: E501
    """Modifies a vector store.

     # noqa: E501

    :param vector_store_id: The ID of the vector store to modify.
    :type vector_store_id: str
    :param body: 
    :type body: dict | bytes

    :rtype: VectorStoreObject
    """
    if connexion.request.is_json:
        body = UpdateVectorStoreRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
