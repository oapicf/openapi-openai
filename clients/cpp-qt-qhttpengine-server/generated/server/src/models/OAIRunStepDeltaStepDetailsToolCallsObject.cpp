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

#include "OAIRunStepDeltaStepDetailsToolCallsObject.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIRunStepDeltaStepDetailsToolCallsObject::OAIRunStepDeltaStepDetailsToolCallsObject(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIRunStepDeltaStepDetailsToolCallsObject::OAIRunStepDeltaStepDetailsToolCallsObject() {
    this->initializeModel();
}

OAIRunStepDeltaStepDetailsToolCallsObject::~OAIRunStepDeltaStepDetailsToolCallsObject() {}

void OAIRunStepDeltaStepDetailsToolCallsObject::initializeModel() {

    m_type_isSet = false;
    m_type_isValid = false;

    m_tool_calls_isSet = false;
    m_tool_calls_isValid = false;
}

void OAIRunStepDeltaStepDetailsToolCallsObject::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIRunStepDeltaStepDetailsToolCallsObject::fromJsonObject(QJsonObject json) {

    m_type_isValid = ::OpenAPI::fromJsonValue(type, json[QString("type")]);
    m_type_isSet = !json[QString("type")].isNull() && m_type_isValid;

    m_tool_calls_isValid = ::OpenAPI::fromJsonValue(tool_calls, json[QString("tool_calls")]);
    m_tool_calls_isSet = !json[QString("tool_calls")].isNull() && m_tool_calls_isValid;
}

QString OAIRunStepDeltaStepDetailsToolCallsObject::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIRunStepDeltaStepDetailsToolCallsObject::asJsonObject() const {
    QJsonObject obj;
    if (m_type_isSet) {
        obj.insert(QString("type"), ::OpenAPI::toJsonValue(type));
    }
    if (tool_calls.size() > 0) {
        obj.insert(QString("tool_calls"), ::OpenAPI::toJsonValue(tool_calls));
    }
    return obj;
}

QString OAIRunStepDeltaStepDetailsToolCallsObject::getType() const {
    return type;
}
void OAIRunStepDeltaStepDetailsToolCallsObject::setType(const QString &type) {
    this->type = type;
    this->m_type_isSet = true;
}

bool OAIRunStepDeltaStepDetailsToolCallsObject::is_type_Set() const{
    return m_type_isSet;
}

bool OAIRunStepDeltaStepDetailsToolCallsObject::is_type_Valid() const{
    return m_type_isValid;
}

QList<OAIRunStepDeltaStepDetailsToolCallsObject_tool_calls_inner> OAIRunStepDeltaStepDetailsToolCallsObject::getToolCalls() const {
    return tool_calls;
}
void OAIRunStepDeltaStepDetailsToolCallsObject::setToolCalls(const QList<OAIRunStepDeltaStepDetailsToolCallsObject_tool_calls_inner> &tool_calls) {
    this->tool_calls = tool_calls;
    this->m_tool_calls_isSet = true;
}

bool OAIRunStepDeltaStepDetailsToolCallsObject::is_tool_calls_Set() const{
    return m_tool_calls_isSet;
}

bool OAIRunStepDeltaStepDetailsToolCallsObject::is_tool_calls_Valid() const{
    return m_tool_calls_isValid;
}

bool OAIRunStepDeltaStepDetailsToolCallsObject::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_type_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (tool_calls.size() > 0) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIRunStepDeltaStepDetailsToolCallsObject::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_type_isValid && true;
}

} // namespace OpenAPI
