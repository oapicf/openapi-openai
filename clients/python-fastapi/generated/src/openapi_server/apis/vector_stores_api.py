# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.vector_stores_api_base import BaseVectorStoresApi
import openapi_server.impl

from fastapi import (  # noqa: F401
    APIRouter,
    Body,
    Cookie,
    Depends,
    Form,
    Header,
    HTTPException,
    Path,
    Query,
    Response,
    Security,
    status,
)

from openapi_server.models.extra_models import TokenModel  # noqa: F401
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

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/vector_stores",
    responses={
        200: {"model": ListVectorStoresResponse, "description": "OK"},
    },
    tags=["Vector stores"],
    summary="Returns a list of vector stores.",
    response_model_by_alias=True,
)
async def list_vector_stores(
    limit: Annotated[Optional[StrictInt], Field(description="A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ")] = Query(20, description="A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", alias="limit"),
    order: Annotated[Optional[StrictStr], Field(description="Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. ")] = Query(desc, description="Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. ", alias="order"),
    after: Annotated[Optional[StrictStr], Field(description="A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ")] = Query(None, description="A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ", alias="after"),
    before: Annotated[Optional[StrictStr], Field(description="A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. ")] = Query(None, description="A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. ", alias="before"),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> ListVectorStoresResponse:
    if not BaseVectorStoresApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseVectorStoresApi.subclasses[0]().list_vector_stores(limit, order, after, before)


@router.post(
    "/vector_stores",
    responses={
        200: {"model": VectorStoreObject, "description": "OK"},
    },
    tags=["Vector stores"],
    summary="Create a vector store.",
    response_model_by_alias=True,
)
async def create_vector_store(
    create_vector_store_request: CreateVectorStoreRequest = Body(None, description=""),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> VectorStoreObject:
    if not BaseVectorStoresApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseVectorStoresApi.subclasses[0]().create_vector_store(create_vector_store_request)


@router.get(
    "/vector_stores/{vector_store_id}",
    responses={
        200: {"model": VectorStoreObject, "description": "OK"},
    },
    tags=["Vector stores"],
    summary="Retrieves a vector store.",
    response_model_by_alias=True,
)
async def get_vector_store(
    vector_store_id: Annotated[StrictStr, Field(description="The ID of the vector store to retrieve.")] = Path(..., description="The ID of the vector store to retrieve."),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> VectorStoreObject:
    if not BaseVectorStoresApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseVectorStoresApi.subclasses[0]().get_vector_store(vector_store_id)


@router.post(
    "/vector_stores/{vector_store_id}",
    responses={
        200: {"model": VectorStoreObject, "description": "OK"},
    },
    tags=["Vector stores"],
    summary="Modifies a vector store.",
    response_model_by_alias=True,
)
async def modify_vector_store(
    vector_store_id: Annotated[StrictStr, Field(description="The ID of the vector store to modify.")] = Path(..., description="The ID of the vector store to modify."),
    update_vector_store_request: UpdateVectorStoreRequest = Body(None, description=""),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> VectorStoreObject:
    if not BaseVectorStoresApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseVectorStoresApi.subclasses[0]().modify_vector_store(vector_store_id, update_vector_store_request)


@router.delete(
    "/vector_stores/{vector_store_id}",
    responses={
        200: {"model": DeleteVectorStoreResponse, "description": "OK"},
    },
    tags=["Vector stores"],
    summary="Delete a vector store.",
    response_model_by_alias=True,
)
async def delete_vector_store(
    vector_store_id: Annotated[StrictStr, Field(description="The ID of the vector store to delete.")] = Path(..., description="The ID of the vector store to delete."),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> DeleteVectorStoreResponse:
    if not BaseVectorStoresApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseVectorStoresApi.subclasses[0]().delete_vector_store(vector_store_id)


@router.post(
    "/vector_stores/{vector_store_id}/file_batches",
    responses={
        200: {"model": VectorStoreFileBatchObject, "description": "OK"},
    },
    tags=["Vector stores"],
    summary="Create a vector store file batch.",
    response_model_by_alias=True,
)
async def create_vector_store_file_batch(
    vector_store_id: Annotated[StrictStr, Field(description="The ID of the vector store for which to create a File Batch. ")] = Path(..., description="The ID of the vector store for which to create a File Batch. "),
    create_vector_store_file_batch_request: CreateVectorStoreFileBatchRequest = Body(None, description=""),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> VectorStoreFileBatchObject:
    if not BaseVectorStoresApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseVectorStoresApi.subclasses[0]().create_vector_store_file_batch(vector_store_id, create_vector_store_file_batch_request)


@router.get(
    "/vector_stores/{vector_store_id}/file_batches/{batch_id}",
    responses={
        200: {"model": VectorStoreFileBatchObject, "description": "OK"},
    },
    tags=["Vector stores"],
    summary="Retrieves a vector store file batch.",
    response_model_by_alias=True,
)
async def get_vector_store_file_batch(
    vector_store_id: Annotated[StrictStr, Field(description="The ID of the vector store that the file batch belongs to.")] = Path(..., description="The ID of the vector store that the file batch belongs to."),
    batch_id: Annotated[StrictStr, Field(description="The ID of the file batch being retrieved.")] = Path(..., description="The ID of the file batch being retrieved."),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> VectorStoreFileBatchObject:
    if not BaseVectorStoresApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseVectorStoresApi.subclasses[0]().get_vector_store_file_batch(vector_store_id, batch_id)


@router.post(
    "/vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel",
    responses={
        200: {"model": VectorStoreFileBatchObject, "description": "OK"},
    },
    tags=["Vector stores"],
    summary="Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.",
    response_model_by_alias=True,
)
async def cancel_vector_store_file_batch(
    vector_store_id: Annotated[StrictStr, Field(description="The ID of the vector store that the file batch belongs to.")] = Path(..., description="The ID of the vector store that the file batch belongs to."),
    batch_id: Annotated[StrictStr, Field(description="The ID of the file batch to cancel.")] = Path(..., description="The ID of the file batch to cancel."),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> VectorStoreFileBatchObject:
    if not BaseVectorStoresApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseVectorStoresApi.subclasses[0]().cancel_vector_store_file_batch(vector_store_id, batch_id)


@router.get(
    "/vector_stores/{vector_store_id}/file_batches/{batch_id}/files",
    responses={
        200: {"model": ListVectorStoreFilesResponse, "description": "OK"},
    },
    tags=["Vector stores"],
    summary="Returns a list of vector store files in a batch.",
    response_model_by_alias=True,
)
async def list_files_in_vector_store_batch(
    vector_store_id: Annotated[StrictStr, Field(description="The ID of the vector store that the files belong to.")] = Path(..., description="The ID of the vector store that the files belong to."),
    batch_id: Annotated[StrictStr, Field(description="The ID of the file batch that the files belong to.")] = Path(..., description="The ID of the file batch that the files belong to."),
    limit: Annotated[Optional[StrictInt], Field(description="A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ")] = Query(20, description="A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", alias="limit"),
    order: Annotated[Optional[StrictStr], Field(description="Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. ")] = Query(desc, description="Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. ", alias="order"),
    after: Annotated[Optional[StrictStr], Field(description="A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ")] = Query(None, description="A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ", alias="after"),
    before: Annotated[Optional[StrictStr], Field(description="A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. ")] = Query(None, description="A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. ", alias="before"),
    filter: Annotated[Optional[StrictStr], Field(description="Filter by file status. One of `in_progress`, `completed`, `failed`, `cancelled`.")] = Query(None, description="Filter by file status. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;cancelled&#x60;.", alias="filter"),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> ListVectorStoreFilesResponse:
    if not BaseVectorStoresApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseVectorStoresApi.subclasses[0]().list_files_in_vector_store_batch(vector_store_id, batch_id, limit, order, after, before, filter)


@router.get(
    "/vector_stores/{vector_store_id}/files",
    responses={
        200: {"model": ListVectorStoreFilesResponse, "description": "OK"},
    },
    tags=["Vector stores"],
    summary="Returns a list of vector store files.",
    response_model_by_alias=True,
)
async def list_vector_store_files(
    vector_store_id: Annotated[StrictStr, Field(description="The ID of the vector store that the files belong to.")] = Path(..., description="The ID of the vector store that the files belong to."),
    limit: Annotated[Optional[StrictInt], Field(description="A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ")] = Query(20, description="A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", alias="limit"),
    order: Annotated[Optional[StrictStr], Field(description="Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. ")] = Query(desc, description="Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. ", alias="order"),
    after: Annotated[Optional[StrictStr], Field(description="A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ")] = Query(None, description="A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ", alias="after"),
    before: Annotated[Optional[StrictStr], Field(description="A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. ")] = Query(None, description="A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. ", alias="before"),
    filter: Annotated[Optional[StrictStr], Field(description="Filter by file status. One of `in_progress`, `completed`, `failed`, `cancelled`.")] = Query(None, description="Filter by file status. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;cancelled&#x60;.", alias="filter"),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> ListVectorStoreFilesResponse:
    if not BaseVectorStoresApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseVectorStoresApi.subclasses[0]().list_vector_store_files(vector_store_id, limit, order, after, before, filter)


@router.post(
    "/vector_stores/{vector_store_id}/files",
    responses={
        200: {"model": VectorStoreFileObject, "description": "OK"},
    },
    tags=["Vector stores"],
    summary="Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).",
    response_model_by_alias=True,
)
async def create_vector_store_file(
    vector_store_id: Annotated[StrictStr, Field(description="The ID of the vector store for which to create a File. ")] = Path(..., description="The ID of the vector store for which to create a File. "),
    create_vector_store_file_request: CreateVectorStoreFileRequest = Body(None, description=""),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> VectorStoreFileObject:
    if not BaseVectorStoresApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseVectorStoresApi.subclasses[0]().create_vector_store_file(vector_store_id, create_vector_store_file_request)


@router.get(
    "/vector_stores/{vector_store_id}/files/{file_id}",
    responses={
        200: {"model": VectorStoreFileObject, "description": "OK"},
    },
    tags=["Vector stores"],
    summary="Retrieves a vector store file.",
    response_model_by_alias=True,
)
async def get_vector_store_file(
    vector_store_id: Annotated[StrictStr, Field(description="The ID of the vector store that the file belongs to.")] = Path(..., description="The ID of the vector store that the file belongs to."),
    file_id: Annotated[StrictStr, Field(description="The ID of the file being retrieved.")] = Path(..., description="The ID of the file being retrieved."),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> VectorStoreFileObject:
    if not BaseVectorStoresApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseVectorStoresApi.subclasses[0]().get_vector_store_file(vector_store_id, file_id)


@router.delete(
    "/vector_stores/{vector_store_id}/files/{file_id}",
    responses={
        200: {"model": DeleteVectorStoreFileResponse, "description": "OK"},
    },
    tags=["Vector stores"],
    summary="Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.",
    response_model_by_alias=True,
)
async def delete_vector_store_file(
    vector_store_id: Annotated[StrictStr, Field(description="The ID of the vector store that the file belongs to.")] = Path(..., description="The ID of the vector store that the file belongs to."),
    file_id: Annotated[StrictStr, Field(description="The ID of the file to delete.")] = Path(..., description="The ID of the file to delete."),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> DeleteVectorStoreFileResponse:
    if not BaseVectorStoresApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseVectorStoresApi.subclasses[0]().delete_vector_store_file(vector_store_id, file_id)
