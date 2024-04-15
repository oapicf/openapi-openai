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

#include "OAICreateSpeechRequest.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICreateSpeechRequest::OAICreateSpeechRequest(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICreateSpeechRequest::OAICreateSpeechRequest() {
    this->initializeModel();
}

OAICreateSpeechRequest::~OAICreateSpeechRequest() {}

void OAICreateSpeechRequest::initializeModel() {

    m_model_isSet = false;
    m_model_isValid = false;

    m_input_isSet = false;
    m_input_isValid = false;

    m_voice_isSet = false;
    m_voice_isValid = false;

    m_response_format_isSet = false;
    m_response_format_isValid = false;

    m_speed_isSet = false;
    m_speed_isValid = false;
}

void OAICreateSpeechRequest::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAICreateSpeechRequest::fromJsonObject(QJsonObject json) {

    m_model_isValid = ::OpenAPI::fromJsonValue(m_model, json[QString("model")]);
    m_model_isSet = !json[QString("model")].isNull() && m_model_isValid;

    m_input_isValid = ::OpenAPI::fromJsonValue(m_input, json[QString("input")]);
    m_input_isSet = !json[QString("input")].isNull() && m_input_isValid;

    m_voice_isValid = ::OpenAPI::fromJsonValue(m_voice, json[QString("voice")]);
    m_voice_isSet = !json[QString("voice")].isNull() && m_voice_isValid;

    m_response_format_isValid = ::OpenAPI::fromJsonValue(m_response_format, json[QString("response_format")]);
    m_response_format_isSet = !json[QString("response_format")].isNull() && m_response_format_isValid;

    m_speed_isValid = ::OpenAPI::fromJsonValue(m_speed, json[QString("speed")]);
    m_speed_isSet = !json[QString("speed")].isNull() && m_speed_isValid;
}

QString OAICreateSpeechRequest::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAICreateSpeechRequest::asJsonObject() const {
    QJsonObject obj;
    if (m_model.isSet()) {
        obj.insert(QString("model"), ::OpenAPI::toJsonValue(m_model));
    }
    if (m_input_isSet) {
        obj.insert(QString("input"), ::OpenAPI::toJsonValue(m_input));
    }
    if (m_voice_isSet) {
        obj.insert(QString("voice"), ::OpenAPI::toJsonValue(m_voice));
    }
    if (m_response_format_isSet) {
        obj.insert(QString("response_format"), ::OpenAPI::toJsonValue(m_response_format));
    }
    if (m_speed_isSet) {
        obj.insert(QString("speed"), ::OpenAPI::toJsonValue(m_speed));
    }
    return obj;
}

OAICreateSpeechRequest_model OAICreateSpeechRequest::getModel() const {
    return m_model;
}
void OAICreateSpeechRequest::setModel(const OAICreateSpeechRequest_model &model) {
    m_model = model;
    m_model_isSet = true;
}

bool OAICreateSpeechRequest::is_model_Set() const{
    return m_model_isSet;
}

bool OAICreateSpeechRequest::is_model_Valid() const{
    return m_model_isValid;
}

QString OAICreateSpeechRequest::getInput() const {
    return m_input;
}
void OAICreateSpeechRequest::setInput(const QString &input) {
    m_input = input;
    m_input_isSet = true;
}

bool OAICreateSpeechRequest::is_input_Set() const{
    return m_input_isSet;
}

bool OAICreateSpeechRequest::is_input_Valid() const{
    return m_input_isValid;
}

QString OAICreateSpeechRequest::getVoice() const {
    return m_voice;
}
void OAICreateSpeechRequest::setVoice(const QString &voice) {
    m_voice = voice;
    m_voice_isSet = true;
}

bool OAICreateSpeechRequest::is_voice_Set() const{
    return m_voice_isSet;
}

bool OAICreateSpeechRequest::is_voice_Valid() const{
    return m_voice_isValid;
}

QString OAICreateSpeechRequest::getResponseFormat() const {
    return m_response_format;
}
void OAICreateSpeechRequest::setResponseFormat(const QString &response_format) {
    m_response_format = response_format;
    m_response_format_isSet = true;
}

bool OAICreateSpeechRequest::is_response_format_Set() const{
    return m_response_format_isSet;
}

bool OAICreateSpeechRequest::is_response_format_Valid() const{
    return m_response_format_isValid;
}

double OAICreateSpeechRequest::getSpeed() const {
    return m_speed;
}
void OAICreateSpeechRequest::setSpeed(const double &speed) {
    m_speed = speed;
    m_speed_isSet = true;
}

bool OAICreateSpeechRequest::is_speed_Set() const{
    return m_speed_isSet;
}

bool OAICreateSpeechRequest::is_speed_Valid() const{
    return m_speed_isValid;
}

bool OAICreateSpeechRequest::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_model.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_input_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_voice_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_response_format_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_speed_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAICreateSpeechRequest::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_model_isValid && m_input_isValid && m_voice_isValid && true;
}

} // namespace OpenAPI