# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model import Model
from openapi_server import util


class CreateModerationResponseResultsInnerCategoryScores(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, hate: float=None, hate_threatening: float=None, self_harm: float=None, sexual: float=None, sexual_minors: float=None, violence: float=None, violence_graphic: float=None):
        """CreateModerationResponseResultsInnerCategoryScores - a model defined in OpenAPI

        :param hate: The hate of this CreateModerationResponseResultsInnerCategoryScores.
        :param hate_threatening: The hate_threatening of this CreateModerationResponseResultsInnerCategoryScores.
        :param self_harm: The self_harm of this CreateModerationResponseResultsInnerCategoryScores.
        :param sexual: The sexual of this CreateModerationResponseResultsInnerCategoryScores.
        :param sexual_minors: The sexual_minors of this CreateModerationResponseResultsInnerCategoryScores.
        :param violence: The violence of this CreateModerationResponseResultsInnerCategoryScores.
        :param violence_graphic: The violence_graphic of this CreateModerationResponseResultsInnerCategoryScores.
        """
        self.openapi_types = {
            'hate': float,
            'hate_threatening': float,
            'self_harm': float,
            'sexual': float,
            'sexual_minors': float,
            'violence': float,
            'violence_graphic': float
        }

        self.attribute_map = {
            'hate': 'hate',
            'hate_threatening': 'hate/threatening',
            'self_harm': 'self-harm',
            'sexual': 'sexual',
            'sexual_minors': 'sexual/minors',
            'violence': 'violence',
            'violence_graphic': 'violence/graphic'
        }

        self._hate = hate
        self._hate_threatening = hate_threatening
        self._self_harm = self_harm
        self._sexual = sexual
        self._sexual_minors = sexual_minors
        self._violence = violence
        self._violence_graphic = violence_graphic

    @classmethod
    def from_dict(cls, dikt: dict) -> 'CreateModerationResponseResultsInnerCategoryScores':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The CreateModerationResponse_results_inner_category_scores of this CreateModerationResponseResultsInnerCategoryScores.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def hate(self):
        """Gets the hate of this CreateModerationResponseResultsInnerCategoryScores.


        :return: The hate of this CreateModerationResponseResultsInnerCategoryScores.
        :rtype: float
        """
        return self._hate

    @hate.setter
    def hate(self, hate):
        """Sets the hate of this CreateModerationResponseResultsInnerCategoryScores.


        :param hate: The hate of this CreateModerationResponseResultsInnerCategoryScores.
        :type hate: float
        """
        if hate is None:
            raise ValueError("Invalid value for `hate`, must not be `None`")

        self._hate = hate

    @property
    def hate_threatening(self):
        """Gets the hate_threatening of this CreateModerationResponseResultsInnerCategoryScores.


        :return: The hate_threatening of this CreateModerationResponseResultsInnerCategoryScores.
        :rtype: float
        """
        return self._hate_threatening

    @hate_threatening.setter
    def hate_threatening(self, hate_threatening):
        """Sets the hate_threatening of this CreateModerationResponseResultsInnerCategoryScores.


        :param hate_threatening: The hate_threatening of this CreateModerationResponseResultsInnerCategoryScores.
        :type hate_threatening: float
        """
        if hate_threatening is None:
            raise ValueError("Invalid value for `hate_threatening`, must not be `None`")

        self._hate_threatening = hate_threatening

    @property
    def self_harm(self):
        """Gets the self_harm of this CreateModerationResponseResultsInnerCategoryScores.


        :return: The self_harm of this CreateModerationResponseResultsInnerCategoryScores.
        :rtype: float
        """
        return self._self_harm

    @self_harm.setter
    def self_harm(self, self_harm):
        """Sets the self_harm of this CreateModerationResponseResultsInnerCategoryScores.


        :param self_harm: The self_harm of this CreateModerationResponseResultsInnerCategoryScores.
        :type self_harm: float
        """
        if self_harm is None:
            raise ValueError("Invalid value for `self_harm`, must not be `None`")

        self._self_harm = self_harm

    @property
    def sexual(self):
        """Gets the sexual of this CreateModerationResponseResultsInnerCategoryScores.


        :return: The sexual of this CreateModerationResponseResultsInnerCategoryScores.
        :rtype: float
        """
        return self._sexual

    @sexual.setter
    def sexual(self, sexual):
        """Sets the sexual of this CreateModerationResponseResultsInnerCategoryScores.


        :param sexual: The sexual of this CreateModerationResponseResultsInnerCategoryScores.
        :type sexual: float
        """
        if sexual is None:
            raise ValueError("Invalid value for `sexual`, must not be `None`")

        self._sexual = sexual

    @property
    def sexual_minors(self):
        """Gets the sexual_minors of this CreateModerationResponseResultsInnerCategoryScores.


        :return: The sexual_minors of this CreateModerationResponseResultsInnerCategoryScores.
        :rtype: float
        """
        return self._sexual_minors

    @sexual_minors.setter
    def sexual_minors(self, sexual_minors):
        """Sets the sexual_minors of this CreateModerationResponseResultsInnerCategoryScores.


        :param sexual_minors: The sexual_minors of this CreateModerationResponseResultsInnerCategoryScores.
        :type sexual_minors: float
        """
        if sexual_minors is None:
            raise ValueError("Invalid value for `sexual_minors`, must not be `None`")

        self._sexual_minors = sexual_minors

    @property
    def violence(self):
        """Gets the violence of this CreateModerationResponseResultsInnerCategoryScores.


        :return: The violence of this CreateModerationResponseResultsInnerCategoryScores.
        :rtype: float
        """
        return self._violence

    @violence.setter
    def violence(self, violence):
        """Sets the violence of this CreateModerationResponseResultsInnerCategoryScores.


        :param violence: The violence of this CreateModerationResponseResultsInnerCategoryScores.
        :type violence: float
        """
        if violence is None:
            raise ValueError("Invalid value for `violence`, must not be `None`")

        self._violence = violence

    @property
    def violence_graphic(self):
        """Gets the violence_graphic of this CreateModerationResponseResultsInnerCategoryScores.


        :return: The violence_graphic of this CreateModerationResponseResultsInnerCategoryScores.
        :rtype: float
        """
        return self._violence_graphic

    @violence_graphic.setter
    def violence_graphic(self, violence_graphic):
        """Sets the violence_graphic of this CreateModerationResponseResultsInnerCategoryScores.


        :param violence_graphic: The violence_graphic of this CreateModerationResponseResultsInnerCategoryScores.
        :type violence_graphic: float
        """
        if violence_graphic is None:
            raise ValueError("Invalid value for `violence_graphic`, must not be `None`")

        self._violence_graphic = violence_graphic
