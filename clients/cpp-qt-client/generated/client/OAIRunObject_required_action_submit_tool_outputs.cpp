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

#include "OAIRunObject_required_action_submit_tool_outputs.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIRunObject_required_action_submit_tool_outputs::OAIRunObject_required_action_submit_tool_outputs(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIRunObject_required_action_submit_tool_outputs::OAIRunObject_required_action_submit_tool_outputs() {
    this->initializeModel();
}

OAIRunObject_required_action_submit_tool_outputs::~OAIRunObject_required_action_submit_tool_outputs() {}

void OAIRunObject_required_action_submit_tool_outputs::initializeModel() {

    m_tool_calls_isSet = false;
    m_tool_calls_isValid = false;
}

void OAIRunObject_required_action_submit_tool_outputs::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIRunObject_required_action_submit_tool_outputs::fromJsonObject(QJsonObject json) {

    m_tool_calls_isValid = ::OpenAPI::fromJsonValue(m_tool_calls, json[QString("tool_calls")]);
    m_tool_calls_isSet = !json[QString("tool_calls")].isNull() && m_tool_calls_isValid;
}

QString OAIRunObject_required_action_submit_tool_outputs::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIRunObject_required_action_submit_tool_outputs::asJsonObject() const {
    QJsonObject obj;
    if (m_tool_calls.size() > 0) {
        obj.insert(QString("tool_calls"), ::OpenAPI::toJsonValue(m_tool_calls));
    }
    return obj;
}

QList<OAIRunToolCallObject> OAIRunObject_required_action_submit_tool_outputs::getToolCalls() const {
    return m_tool_calls;
}
void OAIRunObject_required_action_submit_tool_outputs::setToolCalls(const QList<OAIRunToolCallObject> &tool_calls) {
    m_tool_calls = tool_calls;
    m_tool_calls_isSet = true;
}

bool OAIRunObject_required_action_submit_tool_outputs::is_tool_calls_Set() const{
    return m_tool_calls_isSet;
}

bool OAIRunObject_required_action_submit_tool_outputs::is_tool_calls_Valid() const{
    return m_tool_calls_isValid;
}

bool OAIRunObject_required_action_submit_tool_outputs::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_tool_calls.size() > 0) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIRunObject_required_action_submit_tool_outputs::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_tool_calls_isValid && true;
}

} // namespace OpenAPI
