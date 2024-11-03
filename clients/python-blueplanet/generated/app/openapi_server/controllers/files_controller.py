import connexion

from app.openapi_server.models.delete_file_response import DeleteFileResponse  # noqa: E501
from app.openapi_server.models.list_files_response import ListFilesResponse  # noqa: E501
from app.openapi_server.models.open_ai_file import OpenAIFile  # noqa: E501
from openapi_server import util


def create_file(file, purpose):  # noqa: E501
    """Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports &#x60;.jsonl&#x60; files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 

     # noqa: E501

    :param file: The File object (not file name) to be uploaded. 
    :type file: str
    :param purpose: The intended purpose of the uploaded file.  Use \\\&quot;fine-tune\\\&quot; for [Fine-tuning](/docs/api-reference/fine-tuning) and \\\&quot;assistants\\\&quot; for [Assistants](/docs/api-reference/assistants) and [Messages](/docs/api-reference/messages). This allows us to validate the format of the uploaded file is correct for fine-tuning. 
    :type purpose: str

    :rtype: OpenAIFile
    """
    return 'do some magic!'


def delete_file(file_id):  # noqa: E501
    """Delete a file.

     # noqa: E501

    :param file_id: The ID of the file to use for this request.
    :type file_id: str

    :rtype: DeleteFileResponse
    """
    return 'do some magic!'


def download_file(file_id):  # noqa: E501
    """Returns the contents of the specified file.

     # noqa: E501

    :param file_id: The ID of the file to use for this request.
    :type file_id: str

    :rtype: str
    """
    return 'do some magic!'


def list_files(purpose=None):  # noqa: E501
    """Returns a list of files that belong to the user&#39;s organization.

     # noqa: E501

    :param purpose: Only return files with the given purpose.
    :type purpose: str

    :rtype: ListFilesResponse
    """
    return 'do some magic!'


def retrieve_file(file_id):  # noqa: E501
    """Returns information about a specific file.

     # noqa: E501

    :param file_id: The ID of the file to use for this request.
    :type file_id: str

    :rtype: OpenAIFile
    """
    return 'do some magic!'
