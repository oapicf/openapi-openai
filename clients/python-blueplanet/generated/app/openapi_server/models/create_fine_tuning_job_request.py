# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.openapi_server.models.base_model import Model
from app.openapi_server.models.create_fine_tuning_job_request_hyperparameters import CreateFineTuningJobRequestHyperparameters  # noqa: F401,E501
from app.openapi_server.models.create_fine_tuning_job_request_integrations_inner import CreateFineTuningJobRequestIntegrationsInner  # noqa: F401,E501
from app.openapi_server.models.create_fine_tuning_job_request_model import CreateFineTuningJobRequestModel  # noqa: F401,E501
from openapi_server import util


class CreateFineTuningJobRequest(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, model: CreateFineTuningJobRequestModel=None, training_file: str=None, hyperparameters: CreateFineTuningJobRequestHyperparameters=None, suffix: str=None, validation_file: str=None, integrations: List[CreateFineTuningJobRequestIntegrationsInner]=None, seed: int=None):  # noqa: E501
        """CreateFineTuningJobRequest - a model defined in Swagger

        :param model: The model of this CreateFineTuningJobRequest.  # noqa: E501
        :type model: CreateFineTuningJobRequestModel
        :param training_file: The training_file of this CreateFineTuningJobRequest.  # noqa: E501
        :type training_file: str
        :param hyperparameters: The hyperparameters of this CreateFineTuningJobRequest.  # noqa: E501
        :type hyperparameters: CreateFineTuningJobRequestHyperparameters
        :param suffix: The suffix of this CreateFineTuningJobRequest.  # noqa: E501
        :type suffix: str
        :param validation_file: The validation_file of this CreateFineTuningJobRequest.  # noqa: E501
        :type validation_file: str
        :param integrations: The integrations of this CreateFineTuningJobRequest.  # noqa: E501
        :type integrations: List[CreateFineTuningJobRequestIntegrationsInner]
        :param seed: The seed of this CreateFineTuningJobRequest.  # noqa: E501
        :type seed: int
        """
        self.swagger_types = {
            'model': CreateFineTuningJobRequestModel,
            'training_file': str,
            'hyperparameters': CreateFineTuningJobRequestHyperparameters,
            'suffix': str,
            'validation_file': str,
            'integrations': List[CreateFineTuningJobRequestIntegrationsInner],
            'seed': int
        }

        self.attribute_map = {
            'model': 'model',
            'training_file': 'training_file',
            'hyperparameters': 'hyperparameters',
            'suffix': 'suffix',
            'validation_file': 'validation_file',
            'integrations': 'integrations',
            'seed': 'seed'
        }

        self._model = model
        self._training_file = training_file
        self._hyperparameters = hyperparameters
        self._suffix = suffix
        self._validation_file = validation_file
        self._integrations = integrations
        self._seed = seed

    @classmethod
    def from_dict(cls, dikt) -> 'CreateFineTuningJobRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The CreateFineTuningJobRequest of this CreateFineTuningJobRequest.  # noqa: E501
        :rtype: CreateFineTuningJobRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def model(self) -> CreateFineTuningJobRequestModel:
        """Gets the model of this CreateFineTuningJobRequest.


        :return: The model of this CreateFineTuningJobRequest.
        :rtype: CreateFineTuningJobRequestModel
        """
        return self._model

    @model.setter
    def model(self, model: CreateFineTuningJobRequestModel):
        """Sets the model of this CreateFineTuningJobRequest.


        :param model: The model of this CreateFineTuningJobRequest.
        :type model: CreateFineTuningJobRequestModel
        """
        if model is None:
            raise ValueError("Invalid value for `model`, must not be `None`")  # noqa: E501

        self._model = model

    @property
    def training_file(self) -> str:
        """Gets the training_file of this CreateFineTuningJobRequest.

        The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/upload) for how to upload a file.  Your dataset must be formatted as a JSONL file. Additionally, you must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details.   # noqa: E501

        :return: The training_file of this CreateFineTuningJobRequest.
        :rtype: str
        """
        return self._training_file

    @training_file.setter
    def training_file(self, training_file: str):
        """Sets the training_file of this CreateFineTuningJobRequest.

        The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/upload) for how to upload a file.  Your dataset must be formatted as a JSONL file. Additionally, you must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details.   # noqa: E501

        :param training_file: The training_file of this CreateFineTuningJobRequest.
        :type training_file: str
        """
        if training_file is None:
            raise ValueError("Invalid value for `training_file`, must not be `None`")  # noqa: E501

        self._training_file = training_file

    @property
    def hyperparameters(self) -> CreateFineTuningJobRequestHyperparameters:
        """Gets the hyperparameters of this CreateFineTuningJobRequest.


        :return: The hyperparameters of this CreateFineTuningJobRequest.
        :rtype: CreateFineTuningJobRequestHyperparameters
        """
        return self._hyperparameters

    @hyperparameters.setter
    def hyperparameters(self, hyperparameters: CreateFineTuningJobRequestHyperparameters):
        """Sets the hyperparameters of this CreateFineTuningJobRequest.


        :param hyperparameters: The hyperparameters of this CreateFineTuningJobRequest.
        :type hyperparameters: CreateFineTuningJobRequestHyperparameters
        """

        self._hyperparameters = hyperparameters

    @property
    def suffix(self) -> str:
        """Gets the suffix of this CreateFineTuningJobRequest.

        A string of up to 18 characters that will be added to your fine-tuned model name.  For example, a `suffix` of \"custom-model-name\" would produce a model name like `ft:gpt-3.5-turbo:openai:custom-model-name:7p4lURel`.   # noqa: E501

        :return: The suffix of this CreateFineTuningJobRequest.
        :rtype: str
        """
        return self._suffix

    @suffix.setter
    def suffix(self, suffix: str):
        """Sets the suffix of this CreateFineTuningJobRequest.

        A string of up to 18 characters that will be added to your fine-tuned model name.  For example, a `suffix` of \"custom-model-name\" would produce a model name like `ft:gpt-3.5-turbo:openai:custom-model-name:7p4lURel`.   # noqa: E501

        :param suffix: The suffix of this CreateFineTuningJobRequest.
        :type suffix: str
        """
        if suffix is not None and len(suffix) > 40:
            raise ValueError("Invalid value for `suffix`, length must be less than or equal to `40`")  # noqa: E501
        if suffix is not None and len(suffix) < 1:
            raise ValueError("Invalid value for `suffix`, length must be greater than or equal to `1`")  # noqa: E501

        self._suffix = suffix

    @property
    def validation_file(self) -> str:
        """Gets the validation_file of this CreateFineTuningJobRequest.

        The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the fine-tuning results file. The same data should not be present in both train and validation files.  Your dataset must be formatted as a JSONL file. You must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details.   # noqa: E501

        :return: The validation_file of this CreateFineTuningJobRequest.
        :rtype: str
        """
        return self._validation_file

    @validation_file.setter
    def validation_file(self, validation_file: str):
        """Sets the validation_file of this CreateFineTuningJobRequest.

        The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the fine-tuning results file. The same data should not be present in both train and validation files.  Your dataset must be formatted as a JSONL file. You must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details.   # noqa: E501

        :param validation_file: The validation_file of this CreateFineTuningJobRequest.
        :type validation_file: str
        """

        self._validation_file = validation_file

    @property
    def integrations(self) -> List[CreateFineTuningJobRequestIntegrationsInner]:
        """Gets the integrations of this CreateFineTuningJobRequest.

        A list of integrations to enable for your fine-tuning job.  # noqa: E501

        :return: The integrations of this CreateFineTuningJobRequest.
        :rtype: List[CreateFineTuningJobRequestIntegrationsInner]
        """
        return self._integrations

    @integrations.setter
    def integrations(self, integrations: List[CreateFineTuningJobRequestIntegrationsInner]):
        """Sets the integrations of this CreateFineTuningJobRequest.

        A list of integrations to enable for your fine-tuning job.  # noqa: E501

        :param integrations: The integrations of this CreateFineTuningJobRequest.
        :type integrations: List[CreateFineTuningJobRequestIntegrationsInner]
        """

        self._integrations = integrations

    @property
    def seed(self) -> int:
        """Gets the seed of this CreateFineTuningJobRequest.

        The seed controls the reproducibility of the job. Passing in the same seed and job parameters should produce the same results, but may differ in rare cases. If a seed is not specified, one will be generated for you.   # noqa: E501

        :return: The seed of this CreateFineTuningJobRequest.
        :rtype: int
        """
        return self._seed

    @seed.setter
    def seed(self, seed: int):
        """Sets the seed of this CreateFineTuningJobRequest.

        The seed controls the reproducibility of the job. Passing in the same seed and job parameters should produce the same results, but may differ in rare cases. If a seed is not specified, one will be generated for you.   # noqa: E501

        :param seed: The seed of this CreateFineTuningJobRequest.
        :type seed: int
        """
        if seed is not None and seed > 2147483647:  # noqa: E501
            raise ValueError("Invalid value for `seed`, must be a value less than or equal to `2147483647`")  # noqa: E501
        if seed is not None and seed < 0:  # noqa: E501
            raise ValueError("Invalid value for `seed`, must be a value greater than or equal to `0`")  # noqa: E501

        self._seed = seed
