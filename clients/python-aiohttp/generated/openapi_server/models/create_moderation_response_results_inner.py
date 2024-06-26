# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model import Model
from openapi_server.models.create_moderation_response_results_inner_categories import CreateModerationResponseResultsInnerCategories
from openapi_server.models.create_moderation_response_results_inner_category_scores import CreateModerationResponseResultsInnerCategoryScores
from openapi_server import util


class CreateModerationResponseResultsInner(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, flagged: bool=None, categories: CreateModerationResponseResultsInnerCategories=None, category_scores: CreateModerationResponseResultsInnerCategoryScores=None):
        """CreateModerationResponseResultsInner - a model defined in OpenAPI

        :param flagged: The flagged of this CreateModerationResponseResultsInner.
        :param categories: The categories of this CreateModerationResponseResultsInner.
        :param category_scores: The category_scores of this CreateModerationResponseResultsInner.
        """
        self.openapi_types = {
            'flagged': bool,
            'categories': CreateModerationResponseResultsInnerCategories,
            'category_scores': CreateModerationResponseResultsInnerCategoryScores
        }

        self.attribute_map = {
            'flagged': 'flagged',
            'categories': 'categories',
            'category_scores': 'category_scores'
        }

        self._flagged = flagged
        self._categories = categories
        self._category_scores = category_scores

    @classmethod
    def from_dict(cls, dikt: dict) -> 'CreateModerationResponseResultsInner':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The CreateModerationResponse_results_inner of this CreateModerationResponseResultsInner.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def flagged(self):
        """Gets the flagged of this CreateModerationResponseResultsInner.

        Whether any of the below categories are flagged.

        :return: The flagged of this CreateModerationResponseResultsInner.
        :rtype: bool
        """
        return self._flagged

    @flagged.setter
    def flagged(self, flagged):
        """Sets the flagged of this CreateModerationResponseResultsInner.

        Whether any of the below categories are flagged.

        :param flagged: The flagged of this CreateModerationResponseResultsInner.
        :type flagged: bool
        """
        if flagged is None:
            raise ValueError("Invalid value for `flagged`, must not be `None`")

        self._flagged = flagged

    @property
    def categories(self):
        """Gets the categories of this CreateModerationResponseResultsInner.


        :return: The categories of this CreateModerationResponseResultsInner.
        :rtype: CreateModerationResponseResultsInnerCategories
        """
        return self._categories

    @categories.setter
    def categories(self, categories):
        """Sets the categories of this CreateModerationResponseResultsInner.


        :param categories: The categories of this CreateModerationResponseResultsInner.
        :type categories: CreateModerationResponseResultsInnerCategories
        """
        if categories is None:
            raise ValueError("Invalid value for `categories`, must not be `None`")

        self._categories = categories

    @property
    def category_scores(self):
        """Gets the category_scores of this CreateModerationResponseResultsInner.


        :return: The category_scores of this CreateModerationResponseResultsInner.
        :rtype: CreateModerationResponseResultsInnerCategoryScores
        """
        return self._category_scores

    @category_scores.setter
    def category_scores(self, category_scores):
        """Sets the category_scores of this CreateModerationResponseResultsInner.


        :param category_scores: The category_scores of this CreateModerationResponseResultsInner.
        :type category_scores: CreateModerationResponseResultsInnerCategoryScores
        """
        if category_scores is None:
            raise ValueError("Invalid value for `category_scores`, must not be `None`")

        self._category_scores = category_scores
