# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.projects_api_base import BaseProjectsApi
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
from pydantic import Field, StrictBool, StrictInt, StrictStr
from typing import Optional
from typing_extensions import Annotated
from openapi_server.models.error_response import ErrorResponse
from openapi_server.models.project import Project
from openapi_server.models.project_api_key import ProjectApiKey
from openapi_server.models.project_api_key_delete_response import ProjectApiKeyDeleteResponse
from openapi_server.models.project_api_key_list_response import ProjectApiKeyListResponse
from openapi_server.models.project_create_request import ProjectCreateRequest
from openapi_server.models.project_list_response import ProjectListResponse
from openapi_server.models.project_rate_limit import ProjectRateLimit
from openapi_server.models.project_rate_limit_list_response import ProjectRateLimitListResponse
from openapi_server.models.project_rate_limit_update_request import ProjectRateLimitUpdateRequest
from openapi_server.models.project_service_account import ProjectServiceAccount
from openapi_server.models.project_service_account_create_request import ProjectServiceAccountCreateRequest
from openapi_server.models.project_service_account_create_response import ProjectServiceAccountCreateResponse
from openapi_server.models.project_service_account_delete_response import ProjectServiceAccountDeleteResponse
from openapi_server.models.project_service_account_list_response import ProjectServiceAccountListResponse
from openapi_server.models.project_update_request import ProjectUpdateRequest
from openapi_server.models.project_user import ProjectUser
from openapi_server.models.project_user_create_request import ProjectUserCreateRequest
from openapi_server.models.project_user_delete_response import ProjectUserDeleteResponse
from openapi_server.models.project_user_list_response import ProjectUserListResponse
from openapi_server.models.project_user_update_request import ProjectUserUpdateRequest
from openapi_server.security_api import get_token_ApiKeyAuth

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/organization/projects",
    responses={
        200: {"model": ProjectListResponse, "description": "Projects listed successfully."},
    },
    tags=["Projects"],
    summary="Returns a list of projects.",
    response_model_by_alias=True,
)
async def list_projects(
    limit: Annotated[Optional[StrictInt], Field(description="A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ")] = Query(20, description="A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", alias="limit"),
    after: Annotated[Optional[StrictStr], Field(description="A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ")] = Query(None, description="A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ", alias="after"),
    include_archived: Annotated[Optional[StrictBool], Field(description="If `true` returns all projects including those that have been `archived`. Archived projects are not included by default.")] = Query(False, description="If &#x60;true&#x60; returns all projects including those that have been &#x60;archived&#x60;. Archived projects are not included by default.", alias="include_archived"),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> ProjectListResponse:
    if not BaseProjectsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseProjectsApi.subclasses[0]().list_projects(limit, after, include_archived)


@router.post(
    "/organization/projects",
    responses={
        200: {"model": Project, "description": "Project created successfully."},
    },
    tags=["Projects"],
    summary="Create a new project in the organization. Projects can be created and archived, but cannot be deleted.",
    response_model_by_alias=True,
)
async def create_project(
    project_create_request: Annotated[ProjectCreateRequest, Field(description="The project create request payload.")] = Body(None, description="The project create request payload."),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> Project:
    if not BaseProjectsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseProjectsApi.subclasses[0]().create_project(project_create_request)


@router.get(
    "/organization/projects/{project_id}",
    responses={
        200: {"model": Project, "description": "Project retrieved successfully."},
    },
    tags=["Projects"],
    summary="Retrieves a project.",
    response_model_by_alias=True,
)
async def retrieve_project(
    project_id: Annotated[StrictStr, Field(description="The ID of the project.")] = Path(..., description="The ID of the project."),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> Project:
    if not BaseProjectsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseProjectsApi.subclasses[0]().retrieve_project(project_id)


@router.post(
    "/organization/projects/{project_id}",
    responses={
        200: {"model": Project, "description": "Project updated successfully."},
        400: {"model": ErrorResponse, "description": "Error response when updating the default project."},
    },
    tags=["Projects"],
    summary="Modifies a project in the organization.",
    response_model_by_alias=True,
)
async def modify_project(
    project_id: Annotated[StrictStr, Field(description="The ID of the project.")] = Path(..., description="The ID of the project."),
    project_update_request: Annotated[ProjectUpdateRequest, Field(description="The project update request payload.")] = Body(None, description="The project update request payload."),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> Project:
    if not BaseProjectsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseProjectsApi.subclasses[0]().modify_project(project_id, project_update_request)


@router.get(
    "/organization/projects/{project_id}/api_keys",
    responses={
        200: {"model": ProjectApiKeyListResponse, "description": "Project API keys listed successfully."},
    },
    tags=["Projects"],
    summary="Returns a list of API keys in the project.",
    response_model_by_alias=True,
)
async def list_project_api_keys(
    project_id: Annotated[StrictStr, Field(description="The ID of the project.")] = Path(..., description="The ID of the project."),
    limit: Annotated[Optional[StrictInt], Field(description="A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ")] = Query(20, description="A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", alias="limit"),
    after: Annotated[Optional[StrictStr], Field(description="A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ")] = Query(None, description="A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ", alias="after"),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> ProjectApiKeyListResponse:
    if not BaseProjectsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseProjectsApi.subclasses[0]().list_project_api_keys(project_id, limit, after)


@router.get(
    "/organization/projects/{project_id}/api_keys/{key_id}",
    responses={
        200: {"model": ProjectApiKey, "description": "Project API key retrieved successfully."},
    },
    tags=["Projects"],
    summary="Retrieves an API key in the project.",
    response_model_by_alias=True,
)
async def retrieve_project_api_key(
    project_id: Annotated[StrictStr, Field(description="The ID of the project.")] = Path(..., description="The ID of the project."),
    key_id: Annotated[StrictStr, Field(description="The ID of the API key.")] = Path(..., description="The ID of the API key."),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> ProjectApiKey:
    if not BaseProjectsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseProjectsApi.subclasses[0]().retrieve_project_api_key(project_id, key_id)


@router.delete(
    "/organization/projects/{project_id}/api_keys/{key_id}",
    responses={
        200: {"model": ProjectApiKeyDeleteResponse, "description": "Project API key deleted successfully."},
        400: {"model": ErrorResponse, "description": "Error response for various conditions."},
    },
    tags=["Projects"],
    summary="Deletes an API key from the project.",
    response_model_by_alias=True,
)
async def delete_project_api_key(
    project_id: Annotated[StrictStr, Field(description="The ID of the project.")] = Path(..., description="The ID of the project."),
    key_id: Annotated[StrictStr, Field(description="The ID of the API key.")] = Path(..., description="The ID of the API key."),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> ProjectApiKeyDeleteResponse:
    if not BaseProjectsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseProjectsApi.subclasses[0]().delete_project_api_key(project_id, key_id)


@router.post(
    "/organization/projects/{project_id}/archive",
    responses={
        200: {"model": Project, "description": "Project archived successfully."},
    },
    tags=["Projects"],
    summary="Archives a project in the organization. Archived projects cannot be used or updated.",
    response_model_by_alias=True,
)
async def archive_project(
    project_id: Annotated[StrictStr, Field(description="The ID of the project.")] = Path(..., description="The ID of the project."),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> Project:
    if not BaseProjectsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseProjectsApi.subclasses[0]().archive_project(project_id)


@router.get(
    "/organization/projects/{project_id}/rate_limits",
    responses={
        200: {"model": ProjectRateLimitListResponse, "description": "Project rate limits listed successfully."},
    },
    tags=["Projects"],
    summary="Returns the rate limits per model for a project.",
    response_model_by_alias=True,
)
async def list_project_rate_limits(
    project_id: Annotated[StrictStr, Field(description="The ID of the project.")] = Path(..., description="The ID of the project."),
    limit: Annotated[Optional[StrictInt], Field(description="A limit on the number of objects to be returned. The default is 100. ")] = Query(100, description="A limit on the number of objects to be returned. The default is 100. ", alias="limit"),
    after: Annotated[Optional[StrictStr], Field(description="A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ")] = Query(None, description="A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ", alias="after"),
    before: Annotated[Optional[StrictStr], Field(description="A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, beginning with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. ")] = Query(None, description="A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, beginning with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. ", alias="before"),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> ProjectRateLimitListResponse:
    if not BaseProjectsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseProjectsApi.subclasses[0]().list_project_rate_limits(project_id, limit, after, before)


@router.post(
    "/organization/projects/{project_id}/rate_limits/{rate_limit_id}",
    responses={
        200: {"model": ProjectRateLimit, "description": "Project rate limit updated successfully."},
        400: {"model": ErrorResponse, "description": "Error response for various conditions."},
    },
    tags=["Projects"],
    summary="Updates a project rate limit.",
    response_model_by_alias=True,
)
async def update_project_rate_limits(
    project_id: Annotated[StrictStr, Field(description="The ID of the project.")] = Path(..., description="The ID of the project."),
    rate_limit_id: Annotated[StrictStr, Field(description="The ID of the rate limit.")] = Path(..., description="The ID of the rate limit."),
    project_rate_limit_update_request: Annotated[ProjectRateLimitUpdateRequest, Field(description="The project rate limit update request payload.")] = Body(None, description="The project rate limit update request payload."),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> ProjectRateLimit:
    if not BaseProjectsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseProjectsApi.subclasses[0]().update_project_rate_limits(project_id, rate_limit_id, project_rate_limit_update_request)


@router.get(
    "/organization/projects/{project_id}/service_accounts",
    responses={
        200: {"model": ProjectServiceAccountListResponse, "description": "Project service accounts listed successfully."},
        400: {"model": ErrorResponse, "description": "Error response when project is archived."},
    },
    tags=["Projects"],
    summary="Returns a list of service accounts in the project.",
    response_model_by_alias=True,
)
async def list_project_service_accounts(
    project_id: Annotated[StrictStr, Field(description="The ID of the project.")] = Path(..., description="The ID of the project."),
    limit: Annotated[Optional[StrictInt], Field(description="A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ")] = Query(20, description="A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", alias="limit"),
    after: Annotated[Optional[StrictStr], Field(description="A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ")] = Query(None, description="A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ", alias="after"),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> ProjectServiceAccountListResponse:
    if not BaseProjectsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseProjectsApi.subclasses[0]().list_project_service_accounts(project_id, limit, after)


@router.post(
    "/organization/projects/{project_id}/service_accounts",
    responses={
        200: {"model": ProjectServiceAccountCreateResponse, "description": "Project service account created successfully."},
        400: {"model": ErrorResponse, "description": "Error response when project is archived."},
    },
    tags=["Projects"],
    summary="Creates a new service account in the project. This also returns an unredacted API key for the service account.",
    response_model_by_alias=True,
)
async def create_project_service_account(
    project_id: Annotated[StrictStr, Field(description="The ID of the project.")] = Path(..., description="The ID of the project."),
    project_service_account_create_request: Annotated[ProjectServiceAccountCreateRequest, Field(description="The project service account create request payload.")] = Body(None, description="The project service account create request payload."),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> ProjectServiceAccountCreateResponse:
    if not BaseProjectsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseProjectsApi.subclasses[0]().create_project_service_account(project_id, project_service_account_create_request)


@router.get(
    "/organization/projects/{project_id}/service_accounts/{service_account_id}",
    responses={
        200: {"model": ProjectServiceAccount, "description": "Project service account retrieved successfully."},
    },
    tags=["Projects"],
    summary="Retrieves a service account in the project.",
    response_model_by_alias=True,
)
async def retrieve_project_service_account(
    project_id: Annotated[StrictStr, Field(description="The ID of the project.")] = Path(..., description="The ID of the project."),
    service_account_id: Annotated[StrictStr, Field(description="The ID of the service account.")] = Path(..., description="The ID of the service account."),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> ProjectServiceAccount:
    if not BaseProjectsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseProjectsApi.subclasses[0]().retrieve_project_service_account(project_id, service_account_id)


@router.delete(
    "/organization/projects/{project_id}/service_accounts/{service_account_id}",
    responses={
        200: {"model": ProjectServiceAccountDeleteResponse, "description": "Project service account deleted successfully."},
    },
    tags=["Projects"],
    summary="Deletes a service account from the project.",
    response_model_by_alias=True,
)
async def delete_project_service_account(
    project_id: Annotated[StrictStr, Field(description="The ID of the project.")] = Path(..., description="The ID of the project."),
    service_account_id: Annotated[StrictStr, Field(description="The ID of the service account.")] = Path(..., description="The ID of the service account."),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> ProjectServiceAccountDeleteResponse:
    if not BaseProjectsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseProjectsApi.subclasses[0]().delete_project_service_account(project_id, service_account_id)


@router.get(
    "/organization/projects/{project_id}/users",
    responses={
        200: {"model": ProjectUserListResponse, "description": "Project users listed successfully."},
        400: {"model": ErrorResponse, "description": "Error response when project is archived."},
    },
    tags=["Projects"],
    summary="Returns a list of users in the project.",
    response_model_by_alias=True,
)
async def list_project_users(
    project_id: Annotated[StrictStr, Field(description="The ID of the project.")] = Path(..., description="The ID of the project."),
    limit: Annotated[Optional[StrictInt], Field(description="A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ")] = Query(20, description="A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", alias="limit"),
    after: Annotated[Optional[StrictStr], Field(description="A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ")] = Query(None, description="A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ", alias="after"),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> ProjectUserListResponse:
    if not BaseProjectsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseProjectsApi.subclasses[0]().list_project_users(project_id, limit, after)


@router.post(
    "/organization/projects/{project_id}/users",
    responses={
        200: {"model": ProjectUser, "description": "User added to project successfully."},
        400: {"model": ErrorResponse, "description": "Error response for various conditions."},
    },
    tags=["Projects"],
    summary="Adds a user to the project. Users must already be members of the organization to be added to a project.",
    response_model_by_alias=True,
)
async def create_project_user(
    project_id: Annotated[StrictStr, Field(description="The ID of the project.")] = Path(..., description="The ID of the project."),
    project_user_create_request: Annotated[ProjectUserCreateRequest, Field(description="The project user create request payload.")] = Body(None, description="The project user create request payload."),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> ProjectUser:
    if not BaseProjectsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseProjectsApi.subclasses[0]().create_project_user(project_id, project_user_create_request)


@router.get(
    "/organization/projects/{project_id}/users/{user_id}",
    responses={
        200: {"model": ProjectUser, "description": "Project user retrieved successfully."},
    },
    tags=["Projects"],
    summary="Retrieves a user in the project.",
    response_model_by_alias=True,
)
async def retrieve_project_user(
    project_id: Annotated[StrictStr, Field(description="The ID of the project.")] = Path(..., description="The ID of the project."),
    user_id: Annotated[StrictStr, Field(description="The ID of the user.")] = Path(..., description="The ID of the user."),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> ProjectUser:
    if not BaseProjectsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseProjectsApi.subclasses[0]().retrieve_project_user(project_id, user_id)


@router.post(
    "/organization/projects/{project_id}/users/{user_id}",
    responses={
        200: {"model": ProjectUser, "description": "Project user&#39;s role updated successfully."},
        400: {"model": ErrorResponse, "description": "Error response for various conditions."},
    },
    tags=["Projects"],
    summary="Modifies a user&#39;s role in the project.",
    response_model_by_alias=True,
)
async def modify_project_user(
    project_id: Annotated[StrictStr, Field(description="The ID of the project.")] = Path(..., description="The ID of the project."),
    user_id: Annotated[StrictStr, Field(description="The ID of the user.")] = Path(..., description="The ID of the user."),
    project_user_update_request: Annotated[ProjectUserUpdateRequest, Field(description="The project user update request payload.")] = Body(None, description="The project user update request payload."),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> ProjectUser:
    if not BaseProjectsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseProjectsApi.subclasses[0]().modify_project_user(project_id, user_id, project_user_update_request)


@router.delete(
    "/organization/projects/{project_id}/users/{user_id}",
    responses={
        200: {"model": ProjectUserDeleteResponse, "description": "Project user deleted successfully."},
        400: {"model": ErrorResponse, "description": "Error response for various conditions."},
    },
    tags=["Projects"],
    summary="Deletes a user from the project.",
    response_model_by_alias=True,
)
async def delete_project_user(
    project_id: Annotated[StrictStr, Field(description="The ID of the project.")] = Path(..., description="The ID of the project."),
    user_id: Annotated[StrictStr, Field(description="The ID of the user.")] = Path(..., description="The ID of the user."),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> ProjectUserDeleteResponse:
    if not BaseProjectsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseProjectsApi.subclasses[0]().delete_project_user(project_id, user_id)
