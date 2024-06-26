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

#include "OAIChatCompletionStreamResponseDelta.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIChatCompletionStreamResponseDelta::OAIChatCompletionStreamResponseDelta(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIChatCompletionStreamResponseDelta::OAIChatCompletionStreamResponseDelta() {
    this->initializeModel();
}

OAIChatCompletionStreamResponseDelta::~OAIChatCompletionStreamResponseDelta() {}

void OAIChatCompletionStreamResponseDelta::initializeModel() {

    m_content_isSet = false;
    m_content_isValid = false;

    m_function_call_isSet = false;
    m_function_call_isValid = false;

    m_tool_calls_isSet = false;
    m_tool_calls_isValid = false;

    m_role_isSet = false;
    m_role_isValid = false;
}

void OAIChatCompletionStreamResponseDelta::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIChatCompletionStreamResponseDelta::fromJsonObject(QJsonObject json) {

    m_content_isValid = ::OpenAPI::fromJsonValue(content, json[QString("content")]);
    m_content_isSet = !json[QString("content")].isNull() && m_content_isValid;

    m_function_call_isValid = ::OpenAPI::fromJsonValue(function_call, json[QString("function_call")]);
    m_function_call_isSet = !json[QString("function_call")].isNull() && m_function_call_isValid;

    m_tool_calls_isValid = ::OpenAPI::fromJsonValue(tool_calls, json[QString("tool_calls")]);
    m_tool_calls_isSet = !json[QString("tool_calls")].isNull() && m_tool_calls_isValid;

    m_role_isValid = ::OpenAPI::fromJsonValue(role, json[QString("role")]);
    m_role_isSet = !json[QString("role")].isNull() && m_role_isValid;
}

QString OAIChatCompletionStreamResponseDelta::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIChatCompletionStreamResponseDelta::asJsonObject() const {
    QJsonObject obj;
    if (m_content_isSet) {
        obj.insert(QString("content"), ::OpenAPI::toJsonValue(content));
    }
    if (function_call.isSet()) {
        obj.insert(QString("function_call"), ::OpenAPI::toJsonValue(function_call));
    }
    if (tool_calls.size() > 0) {
        obj.insert(QString("tool_calls"), ::OpenAPI::toJsonValue(tool_calls));
    }
    if (m_role_isSet) {
        obj.insert(QString("role"), ::OpenAPI::toJsonValue(role));
    }
    return obj;
}

QString OAIChatCompletionStreamResponseDelta::getContent() const {
    return content;
}
void OAIChatCompletionStreamResponseDelta::setContent(const QString &content) {
    this->content = content;
    this->m_content_isSet = true;
}

bool OAIChatCompletionStreamResponseDelta::is_content_Set() const{
    return m_content_isSet;
}

bool OAIChatCompletionStreamResponseDelta::is_content_Valid() const{
    return m_content_isValid;
}

OAIChatCompletionStreamResponseDelta_function_call OAIChatCompletionStreamResponseDelta::getFunctionCall() const {
    return function_call;
}
void OAIChatCompletionStreamResponseDelta::setFunctionCall(const OAIChatCompletionStreamResponseDelta_function_call &function_call) {
    this->function_call = function_call;
    this->m_function_call_isSet = true;
}

bool OAIChatCompletionStreamResponseDelta::is_function_call_Set() const{
    return m_function_call_isSet;
}

bool OAIChatCompletionStreamResponseDelta::is_function_call_Valid() const{
    return m_function_call_isValid;
}

QList<OAIChatCompletionMessageToolCallChunk> OAIChatCompletionStreamResponseDelta::getToolCalls() const {
    return tool_calls;
}
void OAIChatCompletionStreamResponseDelta::setToolCalls(const QList<OAIChatCompletionMessageToolCallChunk> &tool_calls) {
    this->tool_calls = tool_calls;
    this->m_tool_calls_isSet = true;
}

bool OAIChatCompletionStreamResponseDelta::is_tool_calls_Set() const{
    return m_tool_calls_isSet;
}

bool OAIChatCompletionStreamResponseDelta::is_tool_calls_Valid() const{
    return m_tool_calls_isValid;
}

QString OAIChatCompletionStreamResponseDelta::getRole() const {
    return role;
}
void OAIChatCompletionStreamResponseDelta::setRole(const QString &role) {
    this->role = role;
    this->m_role_isSet = true;
}

bool OAIChatCompletionStreamResponseDelta::is_role_Set() const{
    return m_role_isSet;
}

bool OAIChatCompletionStreamResponseDelta::is_role_Valid() const{
    return m_role_isValid;
}

bool OAIChatCompletionStreamResponseDelta::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_content_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (function_call.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (tool_calls.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_role_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIChatCompletionStreamResponseDelta::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
