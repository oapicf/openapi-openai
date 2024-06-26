# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.openapi_server.models.base_model import Model
from app.openapi_server.models.run_step_delta_object_delta_step_details import RunStepDeltaObjectDeltaStepDetails  # noqa: F401,E501
from openapi_server import util


class RunStepDeltaObjectDelta(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, step_details: RunStepDeltaObjectDeltaStepDetails=None):  # noqa: E501
        """RunStepDeltaObjectDelta - a model defined in Swagger

        :param step_details: The step_details of this RunStepDeltaObjectDelta.  # noqa: E501
        :type step_details: RunStepDeltaObjectDeltaStepDetails
        """
        self.swagger_types = {
            'step_details': RunStepDeltaObjectDeltaStepDetails
        }

        self.attribute_map = {
            'step_details': 'step_details'
        }

        self._step_details = step_details

    @classmethod
    def from_dict(cls, dikt) -> 'RunStepDeltaObjectDelta':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The RunStepDeltaObject_delta of this RunStepDeltaObjectDelta.  # noqa: E501
        :rtype: RunStepDeltaObjectDelta
        """
        return util.deserialize_model(dikt, cls)

    @property
    def step_details(self) -> RunStepDeltaObjectDeltaStepDetails:
        """Gets the step_details of this RunStepDeltaObjectDelta.


        :return: The step_details of this RunStepDeltaObjectDelta.
        :rtype: RunStepDeltaObjectDeltaStepDetails
        """
        return self._step_details

    @step_details.setter
    def step_details(self, step_details: RunStepDeltaObjectDeltaStepDetails):
        """Sets the step_details of this RunStepDeltaObjectDelta.


        :param step_details: The step_details of this RunStepDeltaObjectDelta.
        :type step_details: RunStepDeltaObjectDeltaStepDetails
        """

        self._step_details = step_details
