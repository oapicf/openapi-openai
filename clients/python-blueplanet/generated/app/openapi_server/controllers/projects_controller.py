import connexion

from app.openapi_server.models.error_response import ErrorResponse  # noqa: E501
from app.openapi_server.models.project import Project  # noqa: E501
from app.openapi_server.models.project_api_key import ProjectApiKey  # noqa: E501
from app.openapi_server.models.project_api_key_delete_response import ProjectApiKeyDeleteResponse  # noqa: E501
from app.openapi_server.models.project_api_key_list_response import ProjectApiKeyListResponse  # noqa: E501
from app.openapi_server.models.project_create_request import ProjectCreateRequest  # noqa: E501
from app.openapi_server.models.project_list_response import ProjectListResponse  # noqa: E501
from app.openapi_server.models.project_rate_limit import ProjectRateLimit  # noqa: E501
from app.openapi_server.models.project_rate_limit_list_response import ProjectRateLimitListResponse  # noqa: E501
from app.openapi_server.models.project_rate_limit_update_request import ProjectRateLimitUpdateRequest  # noqa: E501
from app.openapi_server.models.project_service_account import ProjectServiceAccount  # noqa: E501
from app.openapi_server.models.project_service_account_create_request import ProjectServiceAccountCreateRequest  # noqa: E501
from app.openapi_server.models.project_service_account_create_response import ProjectServiceAccountCreateResponse  # noqa: E501
from app.openapi_server.models.project_service_account_delete_response import ProjectServiceAccountDeleteResponse  # noqa: E501
from app.openapi_server.models.project_service_account_list_response import ProjectServiceAccountListResponse  # noqa: E501
from app.openapi_server.models.project_update_request import ProjectUpdateRequest  # noqa: E501
from app.openapi_server.models.project_user import ProjectUser  # noqa: E501
from app.openapi_server.models.project_user_create_request import ProjectUserCreateRequest  # noqa: E501
from app.openapi_server.models.project_user_delete_response import ProjectUserDeleteResponse  # noqa: E501
from app.openapi_server.models.project_user_list_response import ProjectUserListResponse  # noqa: E501
from app.openapi_server.models.project_user_update_request import ProjectUserUpdateRequest  # noqa: E501
from openapi_server import util


def archive_project(project_id):  # noqa: E501
    """Archives a project in the organization. Archived projects cannot be used or updated.

     # noqa: E501

    :param project_id: The ID of the project.
    :type project_id: str

    :rtype: Project
    """
    return 'do some magic!'


def create_project(body):  # noqa: E501
    """Create a new project in the organization. Projects can be created and archived, but cannot be deleted.

     # noqa: E501

    :param body: The project create request payload.
    :type body: dict | bytes

    :rtype: Project
    """
    if connexion.request.is_json:
        body = ProjectCreateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def create_project_service_account(project_id, body):  # noqa: E501
    """Creates a new service account in the project. This also returns an unredacted API key for the service account.

     # noqa: E501

    :param project_id: The ID of the project.
    :type project_id: str
    :param body: The project service account create request payload.
    :type body: dict | bytes

    :rtype: ProjectServiceAccountCreateResponse
    """
    if connexion.request.is_json:
        body = ProjectServiceAccountCreateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def create_project_user(project_id, body):  # noqa: E501
    """Adds a user to the project. Users must already be members of the organization to be added to a project.

     # noqa: E501

    :param project_id: The ID of the project.
    :type project_id: str
    :param body: The project user create request payload.
    :type body: dict | bytes

    :rtype: ProjectUser
    """
    if connexion.request.is_json:
        body = ProjectUserCreateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_project_api_key(project_id, key_id):  # noqa: E501
    """Deletes an API key from the project.

     # noqa: E501

    :param project_id: The ID of the project.
    :type project_id: str
    :param key_id: The ID of the API key.
    :type key_id: str

    :rtype: ProjectApiKeyDeleteResponse
    """
    return 'do some magic!'


def delete_project_service_account(project_id, service_account_id):  # noqa: E501
    """Deletes a service account from the project.

     # noqa: E501

    :param project_id: The ID of the project.
    :type project_id: str
    :param service_account_id: The ID of the service account.
    :type service_account_id: str

    :rtype: ProjectServiceAccountDeleteResponse
    """
    return 'do some magic!'


def delete_project_user(project_id, user_id):  # noqa: E501
    """Deletes a user from the project.

     # noqa: E501

    :param project_id: The ID of the project.
    :type project_id: str
    :param user_id: The ID of the user.
    :type user_id: str

    :rtype: ProjectUserDeleteResponse
    """
    return 'do some magic!'


def list_project_api_keys(project_id, limit=None, after=None):  # noqa: E501
    """Returns a list of API keys in the project.

     # noqa: E501

    :param project_id: The ID of the project.
    :type project_id: str
    :param limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
    :type limit: int
    :param after: A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
    :type after: str

    :rtype: ProjectApiKeyListResponse
    """
    return 'do some magic!'


def list_project_rate_limits(project_id, limit=None, after=None, before=None):  # noqa: E501
    """Returns the rate limits per model for a project.

     # noqa: E501

    :param project_id: The ID of the project.
    :type project_id: str
    :param limit: A limit on the number of objects to be returned. The default is 100. 
    :type limit: int
    :param after: A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
    :type after: str
    :param before: A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, beginning with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
    :type before: str

    :rtype: ProjectRateLimitListResponse
    """
    return 'do some magic!'


def list_project_service_accounts(project_id, limit=None, after=None):  # noqa: E501
    """Returns a list of service accounts in the project.

     # noqa: E501

    :param project_id: The ID of the project.
    :type project_id: str
    :param limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
    :type limit: int
    :param after: A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
    :type after: str

    :rtype: ProjectServiceAccountListResponse
    """
    return 'do some magic!'


def list_project_users(project_id, limit=None, after=None):  # noqa: E501
    """Returns a list of users in the project.

     # noqa: E501

    :param project_id: The ID of the project.
    :type project_id: str
    :param limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
    :type limit: int
    :param after: A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
    :type after: str

    :rtype: ProjectUserListResponse
    """
    return 'do some magic!'


def list_projects(limit=None, after=None, include_archived=None):  # noqa: E501
    """Returns a list of projects.

     # noqa: E501

    :param limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
    :type limit: int
    :param after: A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
    :type after: str
    :param include_archived: If &#x60;true&#x60; returns all projects including those that have been &#x60;archived&#x60;. Archived projects are not included by default.
    :type include_archived: bool

    :rtype: ProjectListResponse
    """
    return 'do some magic!'


def modify_project(project_id, body):  # noqa: E501
    """Modifies a project in the organization.

     # noqa: E501

    :param project_id: The ID of the project.
    :type project_id: str
    :param body: The project update request payload.
    :type body: dict | bytes

    :rtype: Project
    """
    if connexion.request.is_json:
        body = ProjectUpdateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def modify_project_user(project_id, user_id, body):  # noqa: E501
    """Modifies a user&#39;s role in the project.

     # noqa: E501

    :param project_id: The ID of the project.
    :type project_id: str
    :param user_id: The ID of the user.
    :type user_id: str
    :param body: The project user update request payload.
    :type body: dict | bytes

    :rtype: ProjectUser
    """
    if connexion.request.is_json:
        body = ProjectUserUpdateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def retrieve_project(project_id):  # noqa: E501
    """Retrieves a project.

     # noqa: E501

    :param project_id: The ID of the project.
    :type project_id: str

    :rtype: Project
    """
    return 'do some magic!'


def retrieve_project_api_key(project_id, key_id):  # noqa: E501
    """Retrieves an API key in the project.

     # noqa: E501

    :param project_id: The ID of the project.
    :type project_id: str
    :param key_id: The ID of the API key.
    :type key_id: str

    :rtype: ProjectApiKey
    """
    return 'do some magic!'


def retrieve_project_service_account(project_id, service_account_id):  # noqa: E501
    """Retrieves a service account in the project.

     # noqa: E501

    :param project_id: The ID of the project.
    :type project_id: str
    :param service_account_id: The ID of the service account.
    :type service_account_id: str

    :rtype: ProjectServiceAccount
    """
    return 'do some magic!'


def retrieve_project_user(project_id, user_id):  # noqa: E501
    """Retrieves a user in the project.

     # noqa: E501

    :param project_id: The ID of the project.
    :type project_id: str
    :param user_id: The ID of the user.
    :type user_id: str

    :rtype: ProjectUser
    """
    return 'do some magic!'


def update_project_rate_limits(project_id, rate_limit_id, body):  # noqa: E501
    """Updates a project rate limit.

     # noqa: E501

    :param project_id: The ID of the project.
    :type project_id: str
    :param rate_limit_id: The ID of the rate limit.
    :type rate_limit_id: str
    :param body: The project rate limit update request payload.
    :type body: dict | bytes

    :rtype: ProjectRateLimit
    """
    if connexion.request.is_json:
        body = ProjectRateLimitUpdateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
