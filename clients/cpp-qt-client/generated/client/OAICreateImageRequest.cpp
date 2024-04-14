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

#include "OAICreateImageRequest.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICreateImageRequest::OAICreateImageRequest(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICreateImageRequest::OAICreateImageRequest() {
    this->initializeModel();
}

OAICreateImageRequest::~OAICreateImageRequest() {}

void OAICreateImageRequest::initializeModel() {

    m_prompt_isSet = false;
    m_prompt_isValid = false;

    m_model_isSet = false;
    m_model_isValid = false;

    m_n_isSet = false;
    m_n_isValid = false;

    m_quality_isSet = false;
    m_quality_isValid = false;

    m_response_format_isSet = false;
    m_response_format_isValid = false;

    m_size_isSet = false;
    m_size_isValid = false;

    m_style_isSet = false;
    m_style_isValid = false;

    m_user_isSet = false;
    m_user_isValid = false;
}

void OAICreateImageRequest::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAICreateImageRequest::fromJsonObject(QJsonObject json) {

    m_prompt_isValid = ::OpenAPI::fromJsonValue(m_prompt, json[QString("prompt")]);
    m_prompt_isSet = !json[QString("prompt")].isNull() && m_prompt_isValid;

    m_model_isValid = ::OpenAPI::fromJsonValue(m_model, json[QString("model")]);
    m_model_isSet = !json[QString("model")].isNull() && m_model_isValid;

    m_n_isValid = ::OpenAPI::fromJsonValue(m_n, json[QString("n")]);
    m_n_isSet = !json[QString("n")].isNull() && m_n_isValid;

    m_quality_isValid = ::OpenAPI::fromJsonValue(m_quality, json[QString("quality")]);
    m_quality_isSet = !json[QString("quality")].isNull() && m_quality_isValid;

    m_response_format_isValid = ::OpenAPI::fromJsonValue(m_response_format, json[QString("response_format")]);
    m_response_format_isSet = !json[QString("response_format")].isNull() && m_response_format_isValid;

    m_size_isValid = ::OpenAPI::fromJsonValue(m_size, json[QString("size")]);
    m_size_isSet = !json[QString("size")].isNull() && m_size_isValid;

    m_style_isValid = ::OpenAPI::fromJsonValue(m_style, json[QString("style")]);
    m_style_isSet = !json[QString("style")].isNull() && m_style_isValid;

    m_user_isValid = ::OpenAPI::fromJsonValue(m_user, json[QString("user")]);
    m_user_isSet = !json[QString("user")].isNull() && m_user_isValid;
}

QString OAICreateImageRequest::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAICreateImageRequest::asJsonObject() const {
    QJsonObject obj;
    if (m_prompt_isSet) {
        obj.insert(QString("prompt"), ::OpenAPI::toJsonValue(m_prompt));
    }
    if (m_model.isSet()) {
        obj.insert(QString("model"), ::OpenAPI::toJsonValue(m_model));
    }
    if (m_n_isSet) {
        obj.insert(QString("n"), ::OpenAPI::toJsonValue(m_n));
    }
    if (m_quality_isSet) {
        obj.insert(QString("quality"), ::OpenAPI::toJsonValue(m_quality));
    }
    if (m_response_format_isSet) {
        obj.insert(QString("response_format"), ::OpenAPI::toJsonValue(m_response_format));
    }
    if (m_size_isSet) {
        obj.insert(QString("size"), ::OpenAPI::toJsonValue(m_size));
    }
    if (m_style_isSet) {
        obj.insert(QString("style"), ::OpenAPI::toJsonValue(m_style));
    }
    if (m_user_isSet) {
        obj.insert(QString("user"), ::OpenAPI::toJsonValue(m_user));
    }
    return obj;
}

QString OAICreateImageRequest::getPrompt() const {
    return m_prompt;
}
void OAICreateImageRequest::setPrompt(const QString &prompt) {
    m_prompt = prompt;
    m_prompt_isSet = true;
}

bool OAICreateImageRequest::is_prompt_Set() const{
    return m_prompt_isSet;
}

bool OAICreateImageRequest::is_prompt_Valid() const{
    return m_prompt_isValid;
}

OAICreateImageRequest_model OAICreateImageRequest::getModel() const {
    return m_model;
}
void OAICreateImageRequest::setModel(const OAICreateImageRequest_model &model) {
    m_model = model;
    m_model_isSet = true;
}

bool OAICreateImageRequest::is_model_Set() const{
    return m_model_isSet;
}

bool OAICreateImageRequest::is_model_Valid() const{
    return m_model_isValid;
}

qint32 OAICreateImageRequest::getN() const {
    return m_n;
}
void OAICreateImageRequest::setN(const qint32 &n) {
    m_n = n;
    m_n_isSet = true;
}

bool OAICreateImageRequest::is_n_Set() const{
    return m_n_isSet;
}

bool OAICreateImageRequest::is_n_Valid() const{
    return m_n_isValid;
}

QString OAICreateImageRequest::getQuality() const {
    return m_quality;
}
void OAICreateImageRequest::setQuality(const QString &quality) {
    m_quality = quality;
    m_quality_isSet = true;
}

bool OAICreateImageRequest::is_quality_Set() const{
    return m_quality_isSet;
}

bool OAICreateImageRequest::is_quality_Valid() const{
    return m_quality_isValid;
}

QString OAICreateImageRequest::getResponseFormat() const {
    return m_response_format;
}
void OAICreateImageRequest::setResponseFormat(const QString &response_format) {
    m_response_format = response_format;
    m_response_format_isSet = true;
}

bool OAICreateImageRequest::is_response_format_Set() const{
    return m_response_format_isSet;
}

bool OAICreateImageRequest::is_response_format_Valid() const{
    return m_response_format_isValid;
}

QString OAICreateImageRequest::getSize() const {
    return m_size;
}
void OAICreateImageRequest::setSize(const QString &size) {
    m_size = size;
    m_size_isSet = true;
}

bool OAICreateImageRequest::is_size_Set() const{
    return m_size_isSet;
}

bool OAICreateImageRequest::is_size_Valid() const{
    return m_size_isValid;
}

QString OAICreateImageRequest::getStyle() const {
    return m_style;
}
void OAICreateImageRequest::setStyle(const QString &style) {
    m_style = style;
    m_style_isSet = true;
}

bool OAICreateImageRequest::is_style_Set() const{
    return m_style_isSet;
}

bool OAICreateImageRequest::is_style_Valid() const{
    return m_style_isValid;
}

QString OAICreateImageRequest::getUser() const {
    return m_user;
}
void OAICreateImageRequest::setUser(const QString &user) {
    m_user = user;
    m_user_isSet = true;
}

bool OAICreateImageRequest::is_user_Set() const{
    return m_user_isSet;
}

bool OAICreateImageRequest::is_user_Valid() const{
    return m_user_isValid;
}

bool OAICreateImageRequest::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_prompt_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_model.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_n_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_quality_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_response_format_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_size_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_style_isSet) {
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

bool OAICreateImageRequest::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_prompt_isValid && true;
}

} // namespace OpenAPI
