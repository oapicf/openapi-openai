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

#include "OAIChatCompletionResponseMessage.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIChatCompletionResponseMessage::OAIChatCompletionResponseMessage(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIChatCompletionResponseMessage::OAIChatCompletionResponseMessage() {
    this->initializeModel();
}

OAIChatCompletionResponseMessage::~OAIChatCompletionResponseMessage() {}

void OAIChatCompletionResponseMessage::initializeModel() {

    m_role_isSet = false;
    m_role_isValid = false;

    m_content_isSet = false;
    m_content_isValid = false;

    m_function_call_isSet = false;
    m_function_call_isValid = false;
}

void OAIChatCompletionResponseMessage::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIChatCompletionResponseMessage::fromJsonObject(QJsonObject json) {

    m_role_isValid = ::OpenAPI::fromJsonValue(role, json[QString("role")]);
    m_role_isSet = !json[QString("role")].isNull() && m_role_isValid;

    m_content_isValid = ::OpenAPI::fromJsonValue(content, json[QString("content")]);
    m_content_isSet = !json[QString("content")].isNull() && m_content_isValid;

    m_function_call_isValid = ::OpenAPI::fromJsonValue(function_call, json[QString("function_call")]);
    m_function_call_isSet = !json[QString("function_call")].isNull() && m_function_call_isValid;
}

QString OAIChatCompletionResponseMessage::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIChatCompletionResponseMessage::asJsonObject() const {
    QJsonObject obj;
    if (m_role_isSet) {
        obj.insert(QString("role"), ::OpenAPI::toJsonValue(role));
    }
    if (m_content_isSet) {
        obj.insert(QString("content"), ::OpenAPI::toJsonValue(content));
    }
    if (function_call.isSet()) {
        obj.insert(QString("function_call"), ::OpenAPI::toJsonValue(function_call));
    }
    return obj;
}

QString OAIChatCompletionResponseMessage::getRole() const {
    return role;
}
void OAIChatCompletionResponseMessage::setRole(const QString &role) {
    this->role = role;
    this->m_role_isSet = true;
}

bool OAIChatCompletionResponseMessage::is_role_Set() const{
    return m_role_isSet;
}

bool OAIChatCompletionResponseMessage::is_role_Valid() const{
    return m_role_isValid;
}

QString OAIChatCompletionResponseMessage::getContent() const {
    return content;
}
void OAIChatCompletionResponseMessage::setContent(const QString &content) {
    this->content = content;
    this->m_content_isSet = true;
}

bool OAIChatCompletionResponseMessage::is_content_Set() const{
    return m_content_isSet;
}

bool OAIChatCompletionResponseMessage::is_content_Valid() const{
    return m_content_isValid;
}

OAIChatCompletionRequestMessage_function_call OAIChatCompletionResponseMessage::getFunctionCall() const {
    return function_call;
}
void OAIChatCompletionResponseMessage::setFunctionCall(const OAIChatCompletionRequestMessage_function_call &function_call) {
    this->function_call = function_call;
    this->m_function_call_isSet = true;
}

bool OAIChatCompletionResponseMessage::is_function_call_Set() const{
    return m_function_call_isSet;
}

bool OAIChatCompletionResponseMessage::is_function_call_Valid() const{
    return m_function_call_isValid;
}

bool OAIChatCompletionResponseMessage::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_role_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_content_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (function_call.isSet()) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIChatCompletionResponseMessage::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_role_isValid && true;
}

} // namespace OpenAPI
