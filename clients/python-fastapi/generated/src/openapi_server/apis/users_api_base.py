# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import Field, StrictInt, StrictStr
from typing import Optional
from typing_extensions import Annotated
from openapi_server.models.user import User
from openapi_server.models.user_delete_response import UserDeleteResponse
from openapi_server.models.user_list_response import UserListResponse
from openapi_server.models.user_role_update_request import UserRoleUpdateRequest
from openapi_server.security_api import get_token_ApiKeyAuth

class BaseUsersApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseUsersApi.subclasses = BaseUsersApi.subclasses + (cls,)
    async def list_users(
        self,
        limit: Annotated[Optional[StrictInt], Field(description="A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ")],
        after: Annotated[Optional[StrictStr], Field(description="A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ")],
    ) -> UserListResponse:
        ...


    async def retrieve_user(
        self,
        user_id: Annotated[StrictStr, Field(description="The ID of the user.")],
    ) -> User:
        ...


    async def modify_user(
        self,
        user_id: Annotated[StrictStr, Field(description="The ID of the user.")],
        user_role_update_request: Annotated[UserRoleUpdateRequest, Field(description="The new user role to modify. This must be one of `owner` or `member`.")],
    ) -> User:
        ...


    async def delete_user(
        self,
        user_id: Annotated[StrictStr, Field(description="The ID of the user.")],
    ) -> UserDeleteResponse:
        ...
