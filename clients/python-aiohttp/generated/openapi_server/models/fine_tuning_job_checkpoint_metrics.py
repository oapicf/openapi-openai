# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model import Model
from openapi_server import util


class FineTuningJobCheckpointMetrics(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, step: float=None, train_loss: float=None, train_mean_token_accuracy: float=None, valid_loss: float=None, valid_mean_token_accuracy: float=None, full_valid_loss: float=None, full_valid_mean_token_accuracy: float=None):
        """FineTuningJobCheckpointMetrics - a model defined in OpenAPI

        :param step: The step of this FineTuningJobCheckpointMetrics.
        :param train_loss: The train_loss of this FineTuningJobCheckpointMetrics.
        :param train_mean_token_accuracy: The train_mean_token_accuracy of this FineTuningJobCheckpointMetrics.
        :param valid_loss: The valid_loss of this FineTuningJobCheckpointMetrics.
        :param valid_mean_token_accuracy: The valid_mean_token_accuracy of this FineTuningJobCheckpointMetrics.
        :param full_valid_loss: The full_valid_loss of this FineTuningJobCheckpointMetrics.
        :param full_valid_mean_token_accuracy: The full_valid_mean_token_accuracy of this FineTuningJobCheckpointMetrics.
        """
        self.openapi_types = {
            'step': float,
            'train_loss': float,
            'train_mean_token_accuracy': float,
            'valid_loss': float,
            'valid_mean_token_accuracy': float,
            'full_valid_loss': float,
            'full_valid_mean_token_accuracy': float
        }

        self.attribute_map = {
            'step': 'step',
            'train_loss': 'train_loss',
            'train_mean_token_accuracy': 'train_mean_token_accuracy',
            'valid_loss': 'valid_loss',
            'valid_mean_token_accuracy': 'valid_mean_token_accuracy',
            'full_valid_loss': 'full_valid_loss',
            'full_valid_mean_token_accuracy': 'full_valid_mean_token_accuracy'
        }

        self._step = step
        self._train_loss = train_loss
        self._train_mean_token_accuracy = train_mean_token_accuracy
        self._valid_loss = valid_loss
        self._valid_mean_token_accuracy = valid_mean_token_accuracy
        self._full_valid_loss = full_valid_loss
        self._full_valid_mean_token_accuracy = full_valid_mean_token_accuracy

    @classmethod
    def from_dict(cls, dikt: dict) -> 'FineTuningJobCheckpointMetrics':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The FineTuningJobCheckpoint_metrics of this FineTuningJobCheckpointMetrics.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def step(self):
        """Gets the step of this FineTuningJobCheckpointMetrics.


        :return: The step of this FineTuningJobCheckpointMetrics.
        :rtype: float
        """
        return self._step

    @step.setter
    def step(self, step):
        """Sets the step of this FineTuningJobCheckpointMetrics.


        :param step: The step of this FineTuningJobCheckpointMetrics.
        :type step: float
        """

        self._step = step

    @property
    def train_loss(self):
        """Gets the train_loss of this FineTuningJobCheckpointMetrics.


        :return: The train_loss of this FineTuningJobCheckpointMetrics.
        :rtype: float
        """
        return self._train_loss

    @train_loss.setter
    def train_loss(self, train_loss):
        """Sets the train_loss of this FineTuningJobCheckpointMetrics.


        :param train_loss: The train_loss of this FineTuningJobCheckpointMetrics.
        :type train_loss: float
        """

        self._train_loss = train_loss

    @property
    def train_mean_token_accuracy(self):
        """Gets the train_mean_token_accuracy of this FineTuningJobCheckpointMetrics.


        :return: The train_mean_token_accuracy of this FineTuningJobCheckpointMetrics.
        :rtype: float
        """
        return self._train_mean_token_accuracy

    @train_mean_token_accuracy.setter
    def train_mean_token_accuracy(self, train_mean_token_accuracy):
        """Sets the train_mean_token_accuracy of this FineTuningJobCheckpointMetrics.


        :param train_mean_token_accuracy: The train_mean_token_accuracy of this FineTuningJobCheckpointMetrics.
        :type train_mean_token_accuracy: float
        """

        self._train_mean_token_accuracy = train_mean_token_accuracy

    @property
    def valid_loss(self):
        """Gets the valid_loss of this FineTuningJobCheckpointMetrics.


        :return: The valid_loss of this FineTuningJobCheckpointMetrics.
        :rtype: float
        """
        return self._valid_loss

    @valid_loss.setter
    def valid_loss(self, valid_loss):
        """Sets the valid_loss of this FineTuningJobCheckpointMetrics.


        :param valid_loss: The valid_loss of this FineTuningJobCheckpointMetrics.
        :type valid_loss: float
        """

        self._valid_loss = valid_loss

    @property
    def valid_mean_token_accuracy(self):
        """Gets the valid_mean_token_accuracy of this FineTuningJobCheckpointMetrics.


        :return: The valid_mean_token_accuracy of this FineTuningJobCheckpointMetrics.
        :rtype: float
        """
        return self._valid_mean_token_accuracy

    @valid_mean_token_accuracy.setter
    def valid_mean_token_accuracy(self, valid_mean_token_accuracy):
        """Sets the valid_mean_token_accuracy of this FineTuningJobCheckpointMetrics.


        :param valid_mean_token_accuracy: The valid_mean_token_accuracy of this FineTuningJobCheckpointMetrics.
        :type valid_mean_token_accuracy: float
        """

        self._valid_mean_token_accuracy = valid_mean_token_accuracy

    @property
    def full_valid_loss(self):
        """Gets the full_valid_loss of this FineTuningJobCheckpointMetrics.


        :return: The full_valid_loss of this FineTuningJobCheckpointMetrics.
        :rtype: float
        """
        return self._full_valid_loss

    @full_valid_loss.setter
    def full_valid_loss(self, full_valid_loss):
        """Sets the full_valid_loss of this FineTuningJobCheckpointMetrics.


        :param full_valid_loss: The full_valid_loss of this FineTuningJobCheckpointMetrics.
        :type full_valid_loss: float
        """

        self._full_valid_loss = full_valid_loss

    @property
    def full_valid_mean_token_accuracy(self):
        """Gets the full_valid_mean_token_accuracy of this FineTuningJobCheckpointMetrics.


        :return: The full_valid_mean_token_accuracy of this FineTuningJobCheckpointMetrics.
        :rtype: float
        """
        return self._full_valid_mean_token_accuracy

    @full_valid_mean_token_accuracy.setter
    def full_valid_mean_token_accuracy(self, full_valid_mean_token_accuracy):
        """Sets the full_valid_mean_token_accuracy of this FineTuningJobCheckpointMetrics.


        :param full_valid_mean_token_accuracy: The full_valid_mean_token_accuracy of this FineTuningJobCheckpointMetrics.
        :type full_valid_mean_token_accuracy: float
        """

        self._full_valid_mean_token_accuracy = full_valid_mean_token_accuracy