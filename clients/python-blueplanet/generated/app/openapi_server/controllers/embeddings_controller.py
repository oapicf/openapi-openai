import connexion

from app.openapi_server.models.create_embedding_request import CreateEmbeddingRequest  # noqa: E501
from app.openapi_server.models.create_embedding_response import CreateEmbeddingResponse  # noqa: E501
from openapi_server import util


def create_embedding(body):  # noqa: E501
    """Creates an embedding vector representing the input text.

     # noqa: E501

    :param body: 
    :type body: dict | bytes

    :rtype: CreateEmbeddingResponse
    """
    if connexion.request.is_json:
        body = CreateEmbeddingRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
