from typing import List, Dict
from aiohttp import web

from openapi_server.models.delete_model_response import DeleteModelResponse
from openapi_server.models.list_models_response import ListModelsResponse
from openapi_server.models.model import Model
from openapi_server import util


async def delete_model(request: web.Request, model) -> web.Response:
    """Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.

    

    :param model: The model to delete
    :type model: str

    """
    return web.Response(status=200)


async def list_models(request: web.Request, ) -> web.Response:
    """Lists the currently available models, and provides basic information about each one such as the owner and availability.

    


    """
    return web.Response(status=200)


async def retrieve_model(request: web.Request, model) -> web.Response:
    """Retrieves a model instance, providing basic information about the model such as the owner and permissioning.

    

    :param model: The ID of the model to use for this request
    :type model: str

    """
    return web.Response(status=200)
