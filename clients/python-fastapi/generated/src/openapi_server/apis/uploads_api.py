# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.uploads_api_base import BaseUploadsApi
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
from pydantic import Field, StrictBytes, StrictStr
from typing import Tuple, Union
from typing_extensions import Annotated
from openapi_server.models.complete_upload_request import CompleteUploadRequest
from openapi_server.models.create_upload_request import CreateUploadRequest
from openapi_server.models.upload import Upload
from openapi_server.models.upload_part import UploadPart
from openapi_server.security_api import get_token_ApiKeyAuth

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.post(
    "/uploads",
    responses={
        200: {"model": Upload, "description": "OK"},
    },
    tags=["Uploads"],
    summary="Creates an intermediate [Upload](/docs/api-reference/uploads/object) object that you can add [Parts](/docs/api-reference/uploads/part-object) to. Currently, an Upload can accept at most 8 GB in total and expires after an hour after you create it.  Once you complete the Upload, we will create a [File](/docs/api-reference/files/object) object that contains all the parts you uploaded. This File is usable in the rest of our platform as a regular File object.  For certain &#x60;purpose&#x60;s, the correct &#x60;mime_type&#x60; must be specified. Please refer to documentation for the supported MIME types for your use case: - [Assistants](/docs/assistants/tools/file-search#supported-files)  For guidance on the proper filename extensions for each purpose, please follow the documentation on [creating a File](/docs/api-reference/files/create). ",
    response_model_by_alias=True,
)
async def create_upload(
    create_upload_request: CreateUploadRequest = Body(None, description=""),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> Upload:
    if not BaseUploadsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseUploadsApi.subclasses[0]().create_upload(create_upload_request)


@router.post(
    "/uploads/{upload_id}/cancel",
    responses={
        200: {"model": Upload, "description": "OK"},
    },
    tags=["Uploads"],
    summary="Cancels the Upload. No Parts may be added after an Upload is cancelled. ",
    response_model_by_alias=True,
)
async def cancel_upload(
    upload_id: Annotated[StrictStr, Field(description="The ID of the Upload. ")] = Path(..., description="The ID of the Upload. "),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> Upload:
    if not BaseUploadsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseUploadsApi.subclasses[0]().cancel_upload(upload_id)


@router.post(
    "/uploads/{upload_id}/complete",
    responses={
        200: {"model": Upload, "description": "OK"},
    },
    tags=["Uploads"],
    summary="Completes the [Upload](/docs/api-reference/uploads/object).   Within the returned Upload object, there is a nested [File](/docs/api-reference/files/object) object that is ready to use in the rest of the platform.  You can specify the order of the Parts by passing in an ordered list of the Part IDs.  The number of bytes uploaded upon completion must match the number of bytes initially specified when creating the Upload object. No Parts may be added after an Upload is completed. ",
    response_model_by_alias=True,
)
async def complete_upload(
    upload_id: Annotated[StrictStr, Field(description="The ID of the Upload. ")] = Path(..., description="The ID of the Upload. "),
    complete_upload_request: CompleteUploadRequest = Body(None, description=""),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> Upload:
    if not BaseUploadsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseUploadsApi.subclasses[0]().complete_upload(upload_id, complete_upload_request)


@router.post(
    "/uploads/{upload_id}/parts",
    responses={
        200: {"model": UploadPart, "description": "OK"},
    },
    tags=["Uploads"],
    summary="Adds a [Part](/docs/api-reference/uploads/part-object) to an [Upload](/docs/api-reference/uploads/object) object. A Part represents a chunk of bytes from the file you are trying to upload.   Each Part can be at most 64 MB, and you can add Parts until you hit the Upload maximum of 8 GB.  It is possible to add multiple Parts in parallel. You can decide the intended order of the Parts when you [complete the Upload](/docs/api-reference/uploads/complete). ",
    response_model_by_alias=True,
)
async def add_upload_part(
    upload_id: Annotated[StrictStr, Field(description="The ID of the Upload. ")] = Path(..., description="The ID of the Upload. "),
    data: Annotated[Union[StrictBytes, StrictStr, Tuple[StrictStr, StrictBytes]], Field(description="The chunk of bytes for this Part. ")] = Form(None, description="The chunk of bytes for this Part. "),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> UploadPart:
    if not BaseUploadsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseUploadsApi.subclasses[0]().add_upload_part(upload_id, data)
