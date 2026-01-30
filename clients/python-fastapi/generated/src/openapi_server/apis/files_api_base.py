# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import Field, StrictBytes, StrictInt, StrictStr, field_validator
from typing import Optional, Tuple, Union
from typing_extensions import Annotated
from openapi_server.models.delete_file_response import DeleteFileResponse
from openapi_server.models.list_files_response import ListFilesResponse
from openapi_server.models.open_ai_file import OpenAIFile
from openapi_server.security_api import get_token_ApiKeyAuth

class BaseFilesApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseFilesApi.subclasses = BaseFilesApi.subclasses + (cls,)
    async def list_files(
        self,
        purpose: Annotated[Optional[StrictStr], Field(description="Only return files with the given purpose.")],
        limit: Annotated[Optional[StrictInt], Field(description="A limit on the number of objects to be returned. Limit can range between 1 and 10,000, and the default is 10,000. ")],
        order: Annotated[Optional[StrictStr], Field(description="Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. ")],
        after: Annotated[Optional[StrictStr], Field(description="A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ")],
    ) -> ListFilesResponse:
        ...


    async def create_file(
        self,
        file: Annotated[Union[StrictBytes, StrictStr, Tuple[StrictStr, StrictBytes]], Field(description="The File object (not file name) to be uploaded. ")],
        purpose: Annotated[StrictStr, Field(description="The intended purpose of the uploaded file.  Use \\\"assistants\\\" for [Assistants](/docs/api-reference/assistants) and [Message](/docs/api-reference/messages) files, \\\"vision\\\" for Assistants image file inputs, \\\"batch\\\" for [Batch API](/docs/guides/batch), and \\\"fine-tune\\\" for [Fine-tuning](/docs/api-reference/fine-tuning). ")],
    ) -> OpenAIFile:
        ...


    async def retrieve_file(
        self,
        file_id: Annotated[StrictStr, Field(description="The ID of the file to use for this request.")],
    ) -> OpenAIFile:
        ...


    async def delete_file(
        self,
        file_id: Annotated[StrictStr, Field(description="The ID of the file to use for this request.")],
    ) -> DeleteFileResponse:
        ...


    async def download_file(
        self,
        file_id: Annotated[StrictStr, Field(description="The ID of the file to use for this request.")],
    ) -> str:
        ...
