from typing import List, Dict
from aiohttp import web

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
from openapi_server import util


async def archive_project(request: web.Request, project_id) -> web.Response:
    """Archives a project in the organization. Archived projects cannot be used or updated.

    

    :param project_id: The ID of the project.
    :type project_id: str

    """
    return web.Response(status=200)


async def create_project(request: web.Request, body) -> web.Response:
    """Create a new project in the organization. Projects can be created and archived, but cannot be deleted.

    

    :param body: The project create request payload.
    :type body: dict | bytes

    """
    body = ProjectCreateRequest.from_dict(body)
    return web.Response(status=200)


async def create_project_service_account(request: web.Request, project_id, body) -> web.Response:
    """Creates a new service account in the project. This also returns an unredacted API key for the service account.

    

    :param project_id: The ID of the project.
    :type project_id: str
    :param body: The project service account create request payload.
    :type body: dict | bytes

    """
    body = ProjectServiceAccountCreateRequest.from_dict(body)
    return web.Response(status=200)


async def create_project_user(request: web.Request, project_id, body) -> web.Response:
    """Adds a user to the project. Users must already be members of the organization to be added to a project.

    

    :param project_id: The ID of the project.
    :type project_id: str
    :param body: The project user create request payload.
    :type body: dict | bytes

    """
    body = ProjectUserCreateRequest.from_dict(body)
    return web.Response(status=200)


async def delete_project_api_key(request: web.Request, project_id, key_id) -> web.Response:
    """Deletes an API key from the project.

    

    :param project_id: The ID of the project.
    :type project_id: str
    :param key_id: The ID of the API key.
    :type key_id: str

    """
    return web.Response(status=200)


async def delete_project_service_account(request: web.Request, project_id, service_account_id) -> web.Response:
    """Deletes a service account from the project.

    

    :param project_id: The ID of the project.
    :type project_id: str
    :param service_account_id: The ID of the service account.
    :type service_account_id: str

    """
    return web.Response(status=200)


async def delete_project_user(request: web.Request, project_id, user_id) -> web.Response:
    """Deletes a user from the project.

    

    :param project_id: The ID of the project.
    :type project_id: str
    :param user_id: The ID of the user.
    :type user_id: str

    """
    return web.Response(status=200)


async def list_project_api_keys(request: web.Request, project_id, limit=None, after=None) -> web.Response:
    """Returns a list of API keys in the project.

    

    :param project_id: The ID of the project.
    :type project_id: str
    :param limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
    :type limit: int
    :param after: A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
    :type after: str

    """
    return web.Response(status=200)


async def list_project_rate_limits(request: web.Request, project_id, limit=None, after=None, before=None) -> web.Response:
    """Returns the rate limits per model for a project.

    

    :param project_id: The ID of the project.
    :type project_id: str
    :param limit: A limit on the number of objects to be returned. The default is 100. 
    :type limit: int
    :param after: A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
    :type after: str
    :param before: A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, beginning with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
    :type before: str

    """
    return web.Response(status=200)


async def list_project_service_accounts(request: web.Request, project_id, limit=None, after=None) -> web.Response:
    """Returns a list of service accounts in the project.

    

    :param project_id: The ID of the project.
    :type project_id: str
    :param limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
    :type limit: int
    :param after: A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
    :type after: str

    """
    return web.Response(status=200)


async def list_project_users(request: web.Request, project_id, limit=None, after=None) -> web.Response:
    """Returns a list of users in the project.

    

    :param project_id: The ID of the project.
    :type project_id: str
    :param limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
    :type limit: int
    :param after: A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
    :type after: str

    """
    return web.Response(status=200)


async def list_projects(request: web.Request, limit=None, after=None, include_archived=None) -> web.Response:
    """Returns a list of projects.

    

    :param limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
    :type limit: int
    :param after: A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
    :type after: str
    :param include_archived: If &#x60;true&#x60; returns all projects including those that have been &#x60;archived&#x60;. Archived projects are not included by default.
    :type include_archived: bool

    """
    return web.Response(status=200)


async def modify_project(request: web.Request, project_id, body) -> web.Response:
    """Modifies a project in the organization.

    

    :param project_id: The ID of the project.
    :type project_id: str
    :param body: The project update request payload.
    :type body: dict | bytes

    """
    body = ProjectUpdateRequest.from_dict(body)
    return web.Response(status=200)


async def modify_project_user(request: web.Request, project_id, user_id, body) -> web.Response:
    """Modifies a user&#39;s role in the project.

    

    :param project_id: The ID of the project.
    :type project_id: str
    :param user_id: The ID of the user.
    :type user_id: str
    :param body: The project user update request payload.
    :type body: dict | bytes

    """
    body = ProjectUserUpdateRequest.from_dict(body)
    return web.Response(status=200)


async def retrieve_project(request: web.Request, project_id) -> web.Response:
    """Retrieves a project.

    

    :param project_id: The ID of the project.
    :type project_id: str

    """
    return web.Response(status=200)


async def retrieve_project_api_key(request: web.Request, project_id, key_id) -> web.Response:
    """Retrieves an API key in the project.

    

    :param project_id: The ID of the project.
    :type project_id: str
    :param key_id: The ID of the API key.
    :type key_id: str

    """
    return web.Response(status=200)


async def retrieve_project_service_account(request: web.Request, project_id, service_account_id) -> web.Response:
    """Retrieves a service account in the project.

    

    :param project_id: The ID of the project.
    :type project_id: str
    :param service_account_id: The ID of the service account.
    :type service_account_id: str

    """
    return web.Response(status=200)


async def retrieve_project_user(request: web.Request, project_id, user_id) -> web.Response:
    """Retrieves a user in the project.

    

    :param project_id: The ID of the project.
    :type project_id: str
    :param user_id: The ID of the user.
    :type user_id: str

    """
    return web.Response(status=200)


async def update_project_rate_limits(request: web.Request, project_id, rate_limit_id, body) -> web.Response:
    """Updates a project rate limit.

    

    :param project_id: The ID of the project.
    :type project_id: str
    :param rate_limit_id: The ID of the rate limit.
    :type rate_limit_id: str
    :param body: The project rate limit update request payload.
    :type body: dict | bytes

    """
    body = ProjectRateLimitUpdateRequest.from_dict(body)
    return web.Response(status=200)
