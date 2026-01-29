# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import Field, StrictBytes, StrictStr, field_validator
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
    ) -> ListFilesResponse:
        ...


    async def create_file(
        self,
        file: Annotated[Union[StrictBytes, StrictStr, Tuple[StrictStr, StrictBytes]], Field(description="The File object (not file name) to be uploaded. ")],
        purpose: Annotated[StrictStr, Field(description="The intended purpose of the uploaded file.  Use \\\"fine-tune\\\" for [Fine-tuning](/docs/api-reference/fine-tuning) and \\\"assistants\\\" for [Assistants](/docs/api-reference/assistants) and [Messages](/docs/api-reference/messages). This allows us to validate the format of the uploaded file is correct for fine-tuning. ")],
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
