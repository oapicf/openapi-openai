# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.openapi_server.models.base_model import Model
from app.openapi_server.models.create_moderation_response_results_inner_categories import CreateModerationResponseResultsInnerCategories  # noqa: F401,E501
from app.openapi_server.models.create_moderation_response_results_inner_category_scores import CreateModerationResponseResultsInnerCategoryScores  # noqa: F401,E501
from openapi_server import util


class CreateModerationResponseResultsInner(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, flagged: bool=None, categories: CreateModerationResponseResultsInnerCategories=None, category_scores: CreateModerationResponseResultsInnerCategoryScores=None):  # noqa: E501
        """CreateModerationResponseResultsInner - a model defined in Swagger

        :param flagged: The flagged of this CreateModerationResponseResultsInner.  # noqa: E501
        :type flagged: bool
        :param categories: The categories of this CreateModerationResponseResultsInner.  # noqa: E501
        :type categories: CreateModerationResponseResultsInnerCategories
        :param category_scores: The category_scores of this CreateModerationResponseResultsInner.  # noqa: E501
        :type category_scores: CreateModerationResponseResultsInnerCategoryScores
        """
        self.swagger_types = {
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
    def from_dict(cls, dikt) -> 'CreateModerationResponseResultsInner':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The CreateModerationResponse_results_inner of this CreateModerationResponseResultsInner.  # noqa: E501
        :rtype: CreateModerationResponseResultsInner
        """
        return util.deserialize_model(dikt, cls)

    @property
    def flagged(self) -> bool:
        """Gets the flagged of this CreateModerationResponseResultsInner.

        Whether any of the below categories are flagged.  # noqa: E501

        :return: The flagged of this CreateModerationResponseResultsInner.
        :rtype: bool
        """
        return self._flagged

    @flagged.setter
    def flagged(self, flagged: bool):
        """Sets the flagged of this CreateModerationResponseResultsInner.

        Whether any of the below categories are flagged.  # noqa: E501

        :param flagged: The flagged of this CreateModerationResponseResultsInner.
        :type flagged: bool
        """
        if flagged is None:
            raise ValueError("Invalid value for `flagged`, must not be `None`")  # noqa: E501

        self._flagged = flagged

    @property
    def categories(self) -> CreateModerationResponseResultsInnerCategories:
        """Gets the categories of this CreateModerationResponseResultsInner.


        :return: The categories of this CreateModerationResponseResultsInner.
        :rtype: CreateModerationResponseResultsInnerCategories
        """
        return self._categories

    @categories.setter
    def categories(self, categories: CreateModerationResponseResultsInnerCategories):
        """Sets the categories of this CreateModerationResponseResultsInner.


        :param categories: The categories of this CreateModerationResponseResultsInner.
        :type categories: CreateModerationResponseResultsInnerCategories
        """
        if categories is None:
            raise ValueError("Invalid value for `categories`, must not be `None`")  # noqa: E501

        self._categories = categories

    @property
    def category_scores(self) -> CreateModerationResponseResultsInnerCategoryScores:
        """Gets the category_scores of this CreateModerationResponseResultsInner.


        :return: The category_scores of this CreateModerationResponseResultsInner.
        :rtype: CreateModerationResponseResultsInnerCategoryScores
        """
        return self._category_scores

    @category_scores.setter
    def category_scores(self, category_scores: CreateModerationResponseResultsInnerCategoryScores):
        """Sets the category_scores of this CreateModerationResponseResultsInner.


        :param category_scores: The category_scores of this CreateModerationResponseResultsInner.
        :type category_scores: CreateModerationResponseResultsInnerCategoryScores
        """
        if category_scores is None:
            raise ValueError("Invalid value for `category_scores`, must not be `None`")  # noqa: E501

        self._category_scores = category_scores
