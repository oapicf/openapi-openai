from typing import List, Dict
from aiohttp import web

from openapi_server.models.delete_file_response import DeleteFileResponse
from openapi_server.models.list_files_response import ListFilesResponse
from openapi_server.models.open_ai_file import OpenAIFile
from openapi_server import util


async def create_file(request: web.Request, file, purpose) -> web.Response:
    """Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports &#x60;.jsonl&#x60; files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 

    

    :param file: The File object (not file name) to be uploaded. 
    :type file: str
    :param purpose: The intended purpose of the uploaded file.  Use \\\&quot;fine-tune\\\&quot; for [Fine-tuning](/docs/api-reference/fine-tuning) and \\\&quot;assistants\\\&quot; for [Assistants](/docs/api-reference/assistants) and [Messages](/docs/api-reference/messages). This allows us to validate the format of the uploaded file is correct for fine-tuning. 
    :type purpose: str

    """
    return web.Response(status=200)


async def delete_file(request: web.Request, file_id) -> web.Response:
    """Delete a file.

    

    :param file_id: The ID of the file to use for this request.
    :type file_id: str

    """
    return web.Response(status=200)


async def download_file(request: web.Request, file_id) -> web.Response:
    """Returns the contents of the specified file.

    

    :param file_id: The ID of the file to use for this request.
    :type file_id: str

    """
    return web.Response(status=200)


async def list_files(request: web.Request, purpose=None) -> web.Response:
    """Returns a list of files that belong to the user&#39;s organization.

    

    :param purpose: Only return files with the given purpose.
    :type purpose: str

    """
    return web.Response(status=200)


async def retrieve_file(request: web.Request, file_id) -> web.Response:
    """Returns information about a specific file.

    

    :param file_id: The ID of the file to use for this request.
    :type file_id: str

    """
    return web.Response(status=200)
