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

#include "OAIChatCompletionRequestFunctionMessage.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIChatCompletionRequestFunctionMessage::OAIChatCompletionRequestFunctionMessage(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIChatCompletionRequestFunctionMessage::OAIChatCompletionRequestFunctionMessage() {
    this->initializeModel();
}

OAIChatCompletionRequestFunctionMessage::~OAIChatCompletionRequestFunctionMessage() {}

void OAIChatCompletionRequestFunctionMessage::initializeModel() {

    m_role_isSet = false;
    m_role_isValid = false;

    m_content_isSet = false;
    m_content_isValid = false;

    m_name_isSet = false;
    m_name_isValid = false;
}

void OAIChatCompletionRequestFunctionMessage::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIChatCompletionRequestFunctionMessage::fromJsonObject(QJsonObject json) {

    m_role_isValid = ::OpenAPI::fromJsonValue(role, json[QString("role")]);
    m_role_isSet = !json[QString("role")].isNull() && m_role_isValid;

    m_content_isValid = ::OpenAPI::fromJsonValue(content, json[QString("content")]);
    m_content_isSet = !json[QString("content")].isNull() && m_content_isValid;

    m_name_isValid = ::OpenAPI::fromJsonValue(name, json[QString("name")]);
    m_name_isSet = !json[QString("name")].isNull() && m_name_isValid;
}

QString OAIChatCompletionRequestFunctionMessage::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIChatCompletionRequestFunctionMessage::asJsonObject() const {
    QJsonObject obj;
    if (m_role_isSet) {
        obj.insert(QString("role"), ::OpenAPI::toJsonValue(role));
    }
    if (m_content_isSet) {
        obj.insert(QString("content"), ::OpenAPI::toJsonValue(content));
    }
    if (m_name_isSet) {
        obj.insert(QString("name"), ::OpenAPI::toJsonValue(name));
    }
    return obj;
}

QString OAIChatCompletionRequestFunctionMessage::getRole() const {
    return role;
}
void OAIChatCompletionRequestFunctionMessage::setRole(const QString &role) {
    this->role = role;
    this->m_role_isSet = true;
}

bool OAIChatCompletionRequestFunctionMessage::is_role_Set() const{
    return m_role_isSet;
}

bool OAIChatCompletionRequestFunctionMessage::is_role_Valid() const{
    return m_role_isValid;
}

QString OAIChatCompletionRequestFunctionMessage::getContent() const {
    return content;
}
void OAIChatCompletionRequestFunctionMessage::setContent(const QString &content) {
    this->content = content;
    this->m_content_isSet = true;
}

bool OAIChatCompletionRequestFunctionMessage::is_content_Set() const{
    return m_content_isSet;
}

bool OAIChatCompletionRequestFunctionMessage::is_content_Valid() const{
    return m_content_isValid;
}

QString OAIChatCompletionRequestFunctionMessage::getName() const {
    return name;
}
void OAIChatCompletionRequestFunctionMessage::setName(const QString &name) {
    this->name = name;
    this->m_name_isSet = true;
}

bool OAIChatCompletionRequestFunctionMessage::is_name_Set() const{
    return m_name_isSet;
}

bool OAIChatCompletionRequestFunctionMessage::is_name_Valid() const{
    return m_name_isValid;
}

bool OAIChatCompletionRequestFunctionMessage::isSet() const {
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

        if (m_name_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIChatCompletionRequestFunctionMessage::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_role_isValid && m_content_isValid && m_name_isValid && true;
}

} // namespace OpenAPI
