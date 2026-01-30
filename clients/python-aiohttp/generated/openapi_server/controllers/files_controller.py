from typing import List, Dict
from aiohttp import web

from openapi_server.models.delete_file_response import DeleteFileResponse
from openapi_server.models.list_files_response import ListFilesResponse
from openapi_server.models.open_ai_file import OpenAIFile
from openapi_server import util


async def create_file(request: web.Request, file, purpose) -> web.Response:
    """Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports &#x60;.jsonl&#x60; files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports &#x60;.jsonl&#x60; files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 

    

    :param file: The File object (not file name) to be uploaded. 
    :type file: str
    :param purpose: The intended purpose of the uploaded file.  Use \\\&quot;assistants\\\&quot; for [Assistants](/docs/api-reference/assistants) and [Message](/docs/api-reference/messages) files, \\\&quot;vision\\\&quot; for Assistants image file inputs, \\\&quot;batch\\\&quot; for [Batch API](/docs/guides/batch), and \\\&quot;fine-tune\\\&quot; for [Fine-tuning](/docs/api-reference/fine-tuning). 
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


async def list_files(request: web.Request, purpose=None, limit=None, order=None, after=None) -> web.Response:
    """Returns a list of files.

    

    :param purpose: Only return files with the given purpose.
    :type purpose: str
    :param limit: A limit on the number of objects to be returned. Limit can range between 1 and 10,000, and the default is 10,000. 
    :type limit: int
    :param order: Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
    :type order: str
    :param after: A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
    :type after: str

    """
    return web.Response(status=200)


async def retrieve_file(request: web.Request, file_id) -> web.Response:
    """Returns information about a specific file.

    

    :param file_id: The ID of the file to use for this request.
    :type file_id: str

    """
    return web.Response(status=200)
