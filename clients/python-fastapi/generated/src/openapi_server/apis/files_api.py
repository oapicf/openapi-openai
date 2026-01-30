# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.files_api_base import BaseFilesApi
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
from pydantic import Field, StrictBytes, StrictInt, StrictStr, field_validator
from typing import Optional, Tuple, Union
from typing_extensions import Annotated
from openapi_server.models.delete_file_response import DeleteFileResponse
from openapi_server.models.list_files_response import ListFilesResponse
from openapi_server.models.open_ai_file import OpenAIFile
from openapi_server.security_api import get_token_ApiKeyAuth

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/files",
    responses={
        200: {"model": ListFilesResponse, "description": "OK"},
    },
    tags=["Files"],
    summary="Returns a list of files.",
    response_model_by_alias=True,
)
async def list_files(
    purpose: Annotated[Optional[StrictStr], Field(description="Only return files with the given purpose.")] = Query(None, description="Only return files with the given purpose.", alias="purpose"),
    limit: Annotated[Optional[StrictInt], Field(description="A limit on the number of objects to be returned. Limit can range between 1 and 10,000, and the default is 10,000. ")] = Query(10000, description="A limit on the number of objects to be returned. Limit can range between 1 and 10,000, and the default is 10,000. ", alias="limit"),
    order: Annotated[Optional[StrictStr], Field(description="Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. ")] = Query(desc, description="Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. ", alias="order"),
    after: Annotated[Optional[StrictStr], Field(description="A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ")] = Query(None, description="A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ", alias="after"),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> ListFilesResponse:
    if not BaseFilesApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFilesApi.subclasses[0]().list_files(purpose, limit, order, after)


@router.post(
    "/files",
    responses={
        200: {"model": OpenAIFile, "description": "OK"},
    },
    tags=["Files"],
    summary="Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports &#x60;.jsonl&#x60; files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports &#x60;.jsonl&#x60; files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. ",
    response_model_by_alias=True,
)
async def create_file(
    file: Annotated[Union[StrictBytes, StrictStr, Tuple[StrictStr, StrictBytes]], Field(description="The File object (not file name) to be uploaded. ")] = Form(None, description="The File object (not file name) to be uploaded. "),
    purpose: Annotated[StrictStr, Field(description="The intended purpose of the uploaded file.  Use \\\"assistants\\\" for [Assistants](/docs/api-reference/assistants) and [Message](/docs/api-reference/messages) files, \\\"vision\\\" for Assistants image file inputs, \\\"batch\\\" for [Batch API](/docs/guides/batch), and \\\"fine-tune\\\" for [Fine-tuning](/docs/api-reference/fine-tuning). ")] = Form(None, description="The intended purpose of the uploaded file.  Use \\\&quot;assistants\\\&quot; for [Assistants](/docs/api-reference/assistants) and [Message](/docs/api-reference/messages) files, \\\&quot;vision\\\&quot; for Assistants image file inputs, \\\&quot;batch\\\&quot; for [Batch API](/docs/guides/batch), and \\\&quot;fine-tune\\\&quot; for [Fine-tuning](/docs/api-reference/fine-tuning). "),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> OpenAIFile:
    if not BaseFilesApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFilesApi.subclasses[0]().create_file(file, purpose)


@router.get(
    "/files/{file_id}",
    responses={
        200: {"model": OpenAIFile, "description": "OK"},
    },
    tags=["Files"],
    summary="Returns information about a specific file.",
    response_model_by_alias=True,
)
async def retrieve_file(
    file_id: Annotated[StrictStr, Field(description="The ID of the file to use for this request.")] = Path(..., description="The ID of the file to use for this request."),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> OpenAIFile:
    if not BaseFilesApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFilesApi.subclasses[0]().retrieve_file(file_id)


@router.delete(
    "/files/{file_id}",
    responses={
        200: {"model": DeleteFileResponse, "description": "OK"},
    },
    tags=["Files"],
    summary="Delete a file.",
    response_model_by_alias=True,
)
async def delete_file(
    file_id: Annotated[StrictStr, Field(description="The ID of the file to use for this request.")] = Path(..., description="The ID of the file to use for this request."),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> DeleteFileResponse:
    if not BaseFilesApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFilesApi.subclasses[0]().delete_file(file_id)


@router.get(
    "/files/{file_id}/content",
    responses={
        200: {"model": str, "description": "OK"},
    },
    tags=["Files"],
    summary="Returns the contents of the specified file.",
    response_model_by_alias=True,
)
async def download_file(
    file_id: Annotated[StrictStr, Field(description="The ID of the file to use for this request.")] = Path(..., description="The ID of the file to use for this request."),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> str:
    if not BaseFilesApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFilesApi.subclasses[0]().download_file(file_id)
