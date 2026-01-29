import connexion

from app.openapi_server.models.delete_model_response import DeleteModelResponse  # noqa: E501
from app.openapi_server.models.list_models_response import ListModelsResponse  # noqa: E501
from app.openapi_server.models.model import Model  # noqa: E501
from openapi_server import util


def delete_model(model):  # noqa: E501
    """Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.

     # noqa: E501

    :param model: The model to delete
    :type model: str

    :rtype: DeleteModelResponse
    """
    return 'do some magic!'


def list_models():  # noqa: E501
    """Lists the currently available models, and provides basic information about each one such as the owner and availability.

     # noqa: E501


    :rtype: ListModelsResponse
    """
    return 'do some magic!'


def retrieve_model(model):  # noqa: E501
    """Retrieves a model instance, providing basic information about the model such as the owner and permissioning.

     # noqa: E501

    :param model: The ID of the model to use for this request
    :type model: str

    :rtype: Model
    """
    return 'do some magic!'
