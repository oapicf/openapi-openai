# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import StrictInt, StrictStr, field_validator
from typing import Optional
from openapi_server.models.admin_api_key import AdminApiKey
from openapi_server.models.admin_api_keys_create_request import AdminApiKeysCreateRequest
from openapi_server.models.admin_api_keys_delete200_response import AdminApiKeysDelete200Response
from openapi_server.models.api_key_list import ApiKeyList
from openapi_server.security_api import get_token_ApiKeyAuth

class BaseDefaultApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseDefaultApi.subclasses = BaseDefaultApi.subclasses + (cls,)
    async def admin_api_keys_list(
        self,
        after: Optional[StrictStr],
        order: Optional[StrictStr],
        limit: Optional[StrictInt],
    ) -> ApiKeyList:
        """Retrieve a paginated list of organization admin API keys."""
        ...


    async def admin_api_keys_create(
        self,
        admin_api_keys_create_request: AdminApiKeysCreateRequest,
    ) -> AdminApiKey:
        """Create a new admin-level API key for the organization."""
        ...


    async def admin_api_keys_get(
        self,
        key_id: StrictStr,
    ) -> AdminApiKey:
        """Get details for a specific organization API key by its ID."""
        ...


    async def admin_api_keys_delete(
        self,
        key_id: StrictStr,
    ) -> AdminApiKeysDelete200Response:
        """Delete the specified admin API key."""
        ...
