from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.create_fine_tuning_job_request_hyperparameters_batch_size import CreateFineTuningJobRequestHyperparametersBatchSize
from openapi_server.models.create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier import CreateFineTuningJobRequestHyperparametersLearningRateMultiplier
from openapi_server.models.create_fine_tuning_job_request_hyperparameters_n_epochs import CreateFineTuningJobRequestHyperparametersNEpochs
from openapi_server import util

from openapi_server.models.create_fine_tuning_job_request_hyperparameters_batch_size import CreateFineTuningJobRequestHyperparametersBatchSize  # noqa: E501
from openapi_server.models.create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier import CreateFineTuningJobRequestHyperparametersLearningRateMultiplier  # noqa: E501
from openapi_server.models.create_fine_tuning_job_request_hyperparameters_n_epochs import CreateFineTuningJobRequestHyperparametersNEpochs  # noqa: E501

class CreateFineTuningJobRequestHyperparameters(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, batch_size=None, learning_rate_multiplier=None, n_epochs=None):  # noqa: E501
        """CreateFineTuningJobRequestHyperparameters - a model defined in OpenAPI

        :param batch_size: The batch_size of this CreateFineTuningJobRequestHyperparameters.  # noqa: E501
        :type batch_size: CreateFineTuningJobRequestHyperparametersBatchSize
        :param learning_rate_multiplier: The learning_rate_multiplier of this CreateFineTuningJobRequestHyperparameters.  # noqa: E501
        :type learning_rate_multiplier: CreateFineTuningJobRequestHyperparametersLearningRateMultiplier
        :param n_epochs: The n_epochs of this CreateFineTuningJobRequestHyperparameters.  # noqa: E501
        :type n_epochs: CreateFineTuningJobRequestHyperparametersNEpochs
        """
        self.openapi_types = {
            'batch_size': CreateFineTuningJobRequestHyperparametersBatchSize,
            'learning_rate_multiplier': CreateFineTuningJobRequestHyperparametersLearningRateMultiplier,
            'n_epochs': CreateFineTuningJobRequestHyperparametersNEpochs
        }

        self.attribute_map = {
            'batch_size': 'batch_size',
            'learning_rate_multiplier': 'learning_rate_multiplier',
            'n_epochs': 'n_epochs'
        }

        self._batch_size = batch_size
        self._learning_rate_multiplier = learning_rate_multiplier
        self._n_epochs = n_epochs

    @classmethod
    def from_dict(cls, dikt) -> 'CreateFineTuningJobRequestHyperparameters':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The CreateFineTuningJobRequest_hyperparameters of this CreateFineTuningJobRequestHyperparameters.  # noqa: E501
        :rtype: CreateFineTuningJobRequestHyperparameters
        """
        return util.deserialize_model(dikt, cls)

    @property
    def batch_size(self) -> CreateFineTuningJobRequestHyperparametersBatchSize:
        """Gets the batch_size of this CreateFineTuningJobRequestHyperparameters.


        :return: The batch_size of this CreateFineTuningJobRequestHyperparameters.
        :rtype: CreateFineTuningJobRequestHyperparametersBatchSize
        """
        return self._batch_size

    @batch_size.setter
    def batch_size(self, batch_size: CreateFineTuningJobRequestHyperparametersBatchSize):
        """Sets the batch_size of this CreateFineTuningJobRequestHyperparameters.


        :param batch_size: The batch_size of this CreateFineTuningJobRequestHyperparameters.
        :type batch_size: CreateFineTuningJobRequestHyperparametersBatchSize
        """

        self._batch_size = batch_size

    @property
    def learning_rate_multiplier(self) -> CreateFineTuningJobRequestHyperparametersLearningRateMultiplier:
        """Gets the learning_rate_multiplier of this CreateFineTuningJobRequestHyperparameters.


        :return: The learning_rate_multiplier of this CreateFineTuningJobRequestHyperparameters.
        :rtype: CreateFineTuningJobRequestHyperparametersLearningRateMultiplier
        """
        return self._learning_rate_multiplier

    @learning_rate_multiplier.setter
    def learning_rate_multiplier(self, learning_rate_multiplier: CreateFineTuningJobRequestHyperparametersLearningRateMultiplier):
        """Sets the learning_rate_multiplier of this CreateFineTuningJobRequestHyperparameters.


        :param learning_rate_multiplier: The learning_rate_multiplier of this CreateFineTuningJobRequestHyperparameters.
        :type learning_rate_multiplier: CreateFineTuningJobRequestHyperparametersLearningRateMultiplier
        """

        self._learning_rate_multiplier = learning_rate_multiplier

    @property
    def n_epochs(self) -> CreateFineTuningJobRequestHyperparametersNEpochs:
        """Gets the n_epochs of this CreateFineTuningJobRequestHyperparameters.


        :return: The n_epochs of this CreateFineTuningJobRequestHyperparameters.
        :rtype: CreateFineTuningJobRequestHyperparametersNEpochs
        """
        return self._n_epochs

    @n_epochs.setter
    def n_epochs(self, n_epochs: CreateFineTuningJobRequestHyperparametersNEpochs):
        """Sets the n_epochs of this CreateFineTuningJobRequestHyperparameters.


        :param n_epochs: The n_epochs of this CreateFineTuningJobRequestHyperparameters.
        :type n_epochs: CreateFineTuningJobRequestHyperparametersNEpochs
        """

        self._n_epochs = n_epochs