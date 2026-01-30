# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import Field
from typing_extensions import Annotated
from openapi_server.models.realtime_session_create_request import RealtimeSessionCreateRequest
from openapi_server.models.realtime_session_create_response import RealtimeSessionCreateResponse
from openapi_server.security_api import get_token_ApiKeyAuth

class BaseRealtimeApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseRealtimeApi.subclasses = BaseRealtimeApi.subclasses + (cls,)
    async def create_realtime_session(
        self,
        realtime_session_create_request: Annotated[RealtimeSessionCreateRequest, Field(description="Create an ephemeral API key with the given session configuration.")],
    ) -> RealtimeSessionCreateResponse:
        ...
