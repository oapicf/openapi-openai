/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

#include "OAICreateEmbeddingRequest.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICreateEmbeddingRequest::OAICreateEmbeddingRequest(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICreateEmbeddingRequest::OAICreateEmbeddingRequest() {
    this->initializeModel();
}

OAICreateEmbeddingRequest::~OAICreateEmbeddingRequest() {}

void OAICreateEmbeddingRequest::initializeModel() {

    m_input_isSet = false;
    m_input_isValid = false;

    m_model_isSet = false;
    m_model_isValid = false;

    m_encoding_format_isSet = false;
    m_encoding_format_isValid = false;

    m_dimensions_isSet = false;
    m_dimensions_isValid = false;

    m_user_isSet = false;
    m_user_isValid = false;
}

void OAICreateEmbeddingRequest::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAICreateEmbeddingRequest::fromJsonObject(QJsonObject json) {

    m_input_isValid = ::OpenAPI::fromJsonValue(input, json[QString("input")]);
    m_input_isSet = !json[QString("input")].isNull() && m_input_isValid;

    m_model_isValid = ::OpenAPI::fromJsonValue(model, json[QString("model")]);
    m_model_isSet = !json[QString("model")].isNull() && m_model_isValid;

    m_encoding_format_isValid = ::OpenAPI::fromJsonValue(encoding_format, json[QString("encoding_format")]);
    m_encoding_format_isSet = !json[QString("encoding_format")].isNull() && m_encoding_format_isValid;

    m_dimensions_isValid = ::OpenAPI::fromJsonValue(dimensions, json[QString("dimensions")]);
    m_dimensions_isSet = !json[QString("dimensions")].isNull() && m_dimensions_isValid;

    m_user_isValid = ::OpenAPI::fromJsonValue(user, json[QString("user")]);
    m_user_isSet = !json[QString("user")].isNull() && m_user_isValid;
}

QString OAICreateEmbeddingRequest::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAICreateEmbeddingRequest::asJsonObject() const {
    QJsonObject obj;
    if (input.isSet()) {
        obj.insert(QString("input"), ::OpenAPI::toJsonValue(input));
    }
    if (model.isSet()) {
        obj.insert(QString("model"), ::OpenAPI::toJsonValue(model));
    }
    if (m_encoding_format_isSet) {
        obj.insert(QString("encoding_format"), ::OpenAPI::toJsonValue(encoding_format));
    }
    if (m_dimensions_isSet) {
        obj.insert(QString("dimensions"), ::OpenAPI::toJsonValue(dimensions));
    }
    if (m_user_isSet) {
        obj.insert(QString("user"), ::OpenAPI::toJsonValue(user));
    }
    return obj;
}

OAICreateEmbeddingRequest_input OAICreateEmbeddingRequest::getInput() const {
    return input;
}
void OAICreateEmbeddingRequest::setInput(const OAICreateEmbeddingRequest_input &input) {
    this->input = input;
    this->m_input_isSet = true;
}

bool OAICreateEmbeddingRequest::is_input_Set() const{
    return m_input_isSet;
}

bool OAICreateEmbeddingRequest::is_input_Valid() const{
    return m_input_isValid;
}

OAICreateEmbeddingRequest_model OAICreateEmbeddingRequest::getModel() const {
    return model;
}
void OAICreateEmbeddingRequest::setModel(const OAICreateEmbeddingRequest_model &model) {
    this->model = model;
    this->m_model_isSet = true;
}

bool OAICreateEmbeddingRequest::is_model_Set() const{
    return m_model_isSet;
}

bool OAICreateEmbeddingRequest::is_model_Valid() const{
    return m_model_isValid;
}

QString OAICreateEmbeddingRequest::getEncodingFormat() const {
    return encoding_format;
}
void OAICreateEmbeddingRequest::setEncodingFormat(const QString &encoding_format) {
    this->encoding_format = encoding_format;
    this->m_encoding_format_isSet = true;
}

bool OAICreateEmbeddingRequest::is_encoding_format_Set() const{
    return m_encoding_format_isSet;
}

bool OAICreateEmbeddingRequest::is_encoding_format_Valid() const{
    return m_encoding_format_isValid;
}

qint32 OAICreateEmbeddingRequest::getDimensions() const {
    return dimensions;
}
void OAICreateEmbeddingRequest::setDimensions(const qint32 &dimensions) {
    this->dimensions = dimensions;
    this->m_dimensions_isSet = true;
}

bool OAICreateEmbeddingRequest::is_dimensions_Set() const{
    return m_dimensions_isSet;
}

bool OAICreateEmbeddingRequest::is_dimensions_Valid() const{
    return m_dimensions_isValid;
}

QString OAICreateEmbeddingRequest::getUser() const {
    return user;
}
void OAICreateEmbeddingRequest::setUser(const QString &user) {
    this->user = user;
    this->m_user_isSet = true;
}

bool OAICreateEmbeddingRequest::is_user_Set() const{
    return m_user_isSet;
}

bool OAICreateEmbeddingRequest::is_user_Valid() const{
    return m_user_isValid;
}

bool OAICreateEmbeddingRequest::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (input.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (model.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_encoding_format_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_dimensions_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_user_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAICreateEmbeddingRequest::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_input_isValid && m_model_isValid && true;
}

} // namespace OpenAPI
