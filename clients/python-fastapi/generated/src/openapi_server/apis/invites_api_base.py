# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import Field, StrictInt, StrictStr
from typing import Optional
from typing_extensions import Annotated
from openapi_server.models.invite import Invite
from openapi_server.models.invite_delete_response import InviteDeleteResponse
from openapi_server.models.invite_list_response import InviteListResponse
from openapi_server.models.invite_request import InviteRequest
from openapi_server.security_api import get_token_ApiKeyAuth

class BaseInvitesApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseInvitesApi.subclasses = BaseInvitesApi.subclasses + (cls,)
    async def list_invites(
        self,
        limit: Annotated[Optional[StrictInt], Field(description="A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ")],
        after: Annotated[Optional[StrictStr], Field(description="A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ")],
    ) -> InviteListResponse:
        ...


    async def invite_user(
        self,
        invite_request: Annotated[InviteRequest, Field(description="The invite request payload.")],
    ) -> Invite:
        ...


    async def retrieve_invite(
        self,
        invite_id: Annotated[StrictStr, Field(description="The ID of the invite to retrieve.")],
    ) -> Invite:
        ...


    async def delete_invite(
        self,
        invite_id: Annotated[StrictStr, Field(description="The ID of the invite to delete.")],
    ) -> InviteDeleteResponse:
        ...
