# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import Field, StrictInt, StrictStr, field_validator
from typing import Optional
from typing_extensions import Annotated
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
from openapi_server.security_api import get_token_ApiKeyAuth

class BaseVectorStoresApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseVectorStoresApi.subclasses = BaseVectorStoresApi.subclasses + (cls,)
    async def list_vector_stores(
        self,
        limit: Annotated[Optional[StrictInt], Field(description="A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ")],
        order: Annotated[Optional[StrictStr], Field(description="Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. ")],
        after: Annotated[Optional[StrictStr], Field(description="A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ")],
        before: Annotated[Optional[StrictStr], Field(description="A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. ")],
    ) -> ListVectorStoresResponse:
        ...


    async def create_vector_store(
        self,
        create_vector_store_request: CreateVectorStoreRequest,
    ) -> VectorStoreObject:
        ...


    async def get_vector_store(
        self,
        vector_store_id: Annotated[StrictStr, Field(description="The ID of the vector store to retrieve.")],
    ) -> VectorStoreObject:
        ...


    async def modify_vector_store(
        self,
        vector_store_id: Annotated[StrictStr, Field(description="The ID of the vector store to modify.")],
        update_vector_store_request: UpdateVectorStoreRequest,
    ) -> VectorStoreObject:
        ...


    async def delete_vector_store(
        self,
        vector_store_id: Annotated[StrictStr, Field(description="The ID of the vector store to delete.")],
    ) -> DeleteVectorStoreResponse:
        ...


    async def create_vector_store_file_batch(
        self,
        vector_store_id: Annotated[StrictStr, Field(description="The ID of the vector store for which to create a File Batch. ")],
        create_vector_store_file_batch_request: CreateVectorStoreFileBatchRequest,
    ) -> VectorStoreFileBatchObject:
        ...


    async def get_vector_store_file_batch(
        self,
        vector_store_id: Annotated[StrictStr, Field(description="The ID of the vector store that the file batch belongs to.")],
        batch_id: Annotated[StrictStr, Field(description="The ID of the file batch being retrieved.")],
    ) -> VectorStoreFileBatchObject:
        ...


    async def cancel_vector_store_file_batch(
        self,
        vector_store_id: Annotated[StrictStr, Field(description="The ID of the vector store that the file batch belongs to.")],
        batch_id: Annotated[StrictStr, Field(description="The ID of the file batch to cancel.")],
    ) -> VectorStoreFileBatchObject:
        ...


    async def list_files_in_vector_store_batch(
        self,
        vector_store_id: Annotated[StrictStr, Field(description="The ID of the vector store that the files belong to.")],
        batch_id: Annotated[StrictStr, Field(description="The ID of the file batch that the files belong to.")],
        limit: Annotated[Optional[StrictInt], Field(description="A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ")],
        order: Annotated[Optional[StrictStr], Field(description="Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. ")],
        after: Annotated[Optional[StrictStr], Field(description="A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ")],
        before: Annotated[Optional[StrictStr], Field(description="A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. ")],
        filter: Annotated[Optional[StrictStr], Field(description="Filter by file status. One of `in_progress`, `completed`, `failed`, `cancelled`.")],
    ) -> ListVectorStoreFilesResponse:
        ...


    async def list_vector_store_files(
        self,
        vector_store_id: Annotated[StrictStr, Field(description="The ID of the vector store that the files belong to.")],
        limit: Annotated[Optional[StrictInt], Field(description="A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ")],
        order: Annotated[Optional[StrictStr], Field(description="Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. ")],
        after: Annotated[Optional[StrictStr], Field(description="A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ")],
        before: Annotated[Optional[StrictStr], Field(description="A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. ")],
        filter: Annotated[Optional[StrictStr], Field(description="Filter by file status. One of `in_progress`, `completed`, `failed`, `cancelled`.")],
    ) -> ListVectorStoreFilesResponse:
        ...


    async def create_vector_store_file(
        self,
        vector_store_id: Annotated[StrictStr, Field(description="The ID of the vector store for which to create a File. ")],
        create_vector_store_file_request: CreateVectorStoreFileRequest,
    ) -> VectorStoreFileObject:
        ...


    async def get_vector_store_file(
        self,
        vector_store_id: Annotated[StrictStr, Field(description="The ID of the vector store that the file belongs to.")],
        file_id: Annotated[StrictStr, Field(description="The ID of the file being retrieved.")],
    ) -> VectorStoreFileObject:
        ...


    async def delete_vector_store_file(
        self,
        vector_store_id: Annotated[StrictStr, Field(description="The ID of the vector store that the file belongs to.")],
        file_id: Annotated[StrictStr, Field(description="The ID of the file to delete.")],
    ) -> DeleteVectorStoreFileResponse:
        ...
