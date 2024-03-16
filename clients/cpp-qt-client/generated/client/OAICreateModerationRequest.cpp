/**
 * OpenAI API
 * APIs for sampling from and fine-tuning language models
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

#include "OAICreateModerationRequest.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICreateModerationRequest::OAICreateModerationRequest(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICreateModerationRequest::OAICreateModerationRequest() {
    this->initializeModel();
}

OAICreateModerationRequest::~OAICreateModerationRequest() {}

void OAICreateModerationRequest::initializeModel() {

    m_input_isSet = false;
    m_input_isValid = false;

    m_model_isSet = false;
    m_model_isValid = false;
}

void OAICreateModerationRequest::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAICreateModerationRequest::fromJsonObject(QJsonObject json) {

    m_input_isValid = ::OpenAPI::fromJsonValue(m_input, json[QString("input")]);
    m_input_isSet = !json[QString("input")].isNull() && m_input_isValid;

    m_model_isValid = ::OpenAPI::fromJsonValue(m_model, json[QString("model")]);
    m_model_isSet = !json[QString("model")].isNull() && m_model_isValid;
}

QString OAICreateModerationRequest::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAICreateModerationRequest::asJsonObject() const {
    QJsonObject obj;
    if (m_input.isSet()) {
        obj.insert(QString("input"), ::OpenAPI::toJsonValue(m_input));
    }
    if (m_model.isSet()) {
        obj.insert(QString("model"), ::OpenAPI::toJsonValue(m_model));
    }
    return obj;
}

OAICreateModerationRequest_input OAICreateModerationRequest::getInput() const {
    return m_input;
}
void OAICreateModerationRequest::setInput(const OAICreateModerationRequest_input &input) {
    m_input = input;
    m_input_isSet = true;
}

bool OAICreateModerationRequest::is_input_Set() const{
    return m_input_isSet;
}

bool OAICreateModerationRequest::is_input_Valid() const{
    return m_input_isValid;
}

OAICreateModerationRequest_model OAICreateModerationRequest::getModel() const {
    return m_model;
}
void OAICreateModerationRequest::setModel(const OAICreateModerationRequest_model &model) {
    m_model = model;
    m_model_isSet = true;
}

bool OAICreateModerationRequest::is_model_Set() const{
    return m_model_isSet;
}

bool OAICreateModerationRequest::is_model_Valid() const{
    return m_model_isValid;
}

bool OAICreateModerationRequest::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_input.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_model.isSet()) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAICreateModerationRequest::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_input_isValid && true;
}

} // namespace OpenAPI
