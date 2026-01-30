# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import Field, StrictInt, StrictStr
from typing import Optional
from typing_extensions import Annotated
from openapi_server.models.batch import Batch
from openapi_server.models.create_batch_request import CreateBatchRequest
from openapi_server.models.list_batches_response import ListBatchesResponse
from openapi_server.security_api import get_token_ApiKeyAuth

class BaseBatchApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseBatchApi.subclasses = BaseBatchApi.subclasses + (cls,)
    async def list_batches(
        self,
        after: Annotated[Optional[StrictStr], Field(description="A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ")],
        limit: Annotated[Optional[StrictInt], Field(description="A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ")],
    ) -> ListBatchesResponse:
        ...


    async def create_batch(
        self,
        create_batch_request: CreateBatchRequest,
    ) -> Batch:
        ...


    async def retrieve_batch(
        self,
        batch_id: Annotated[StrictStr, Field(description="The ID of the batch to retrieve.")],
    ) -> Batch:
        ...


    async def cancel_batch(
        self,
        batch_id: Annotated[StrictStr, Field(description="The ID of the batch to cancel.")],
    ) -> Batch:
        ...
