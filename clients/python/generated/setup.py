# coding: utf-8

"""
    OpenAI API

    APIs for sampling from and fine-tuning language models

    The version of the OpenAPI document: 2.0.0
    Contact: blah+oapicf@cliffano.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from setuptools import setup, find_packages  # noqa: H301

# To install the library, run the following
#
# python setup.py install
#
# prerequisite: setuptools
# http://pypi.python.org/pypi/setuptools
NAME = "openapiopenai"
VERSION = "0.9.0-pre.0"
PYTHON_REQUIRES = ">=3.7"
REQUIRES = [
    "urllib3 >= 1.25.3, < 2.1.0",
    "python-dateutil",
    "pydantic >= 2",
    "typing-extensions >= 4.7.1",
]

setup(
    name=NAME,
    version=VERSION,
    description="OpenAI API",
    author="Cliffano Subagio",
    author_email="blah+oapicf@cliffano.com",
    url="https://github.com/oapicf/openapi-openai",
    keywords=["OpenAPI", "OpenAPI-Generator", "OpenAI API"],
    install_requires=REQUIRES,
    packages=find_packages(exclude=["test", "tests"]),
    include_package_data=True,
    long_description_content_type='text/markdown',
    long_description="""\
    APIs for sampling from and fine-tuning language models
    """,  # noqa: E501
    package_data={"openapiopenai": ["py.typed"]},
)
