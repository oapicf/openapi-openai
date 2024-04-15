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

#include "OAIRunObject_required_action.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIRunObject_required_action::OAIRunObject_required_action(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIRunObject_required_action::OAIRunObject_required_action() {
    this->initializeModel();
}

OAIRunObject_required_action::~OAIRunObject_required_action() {}

void OAIRunObject_required_action::initializeModel() {

    m_type_isSet = false;
    m_type_isValid = false;

    m_submit_tool_outputs_isSet = false;
    m_submit_tool_outputs_isValid = false;
}

void OAIRunObject_required_action::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIRunObject_required_action::fromJsonObject(QJsonObject json) {

    m_type_isValid = ::OpenAPI::fromJsonValue(type, json[QString("type")]);
    m_type_isSet = !json[QString("type")].isNull() && m_type_isValid;

    m_submit_tool_outputs_isValid = ::OpenAPI::fromJsonValue(submit_tool_outputs, json[QString("submit_tool_outputs")]);
    m_submit_tool_outputs_isSet = !json[QString("submit_tool_outputs")].isNull() && m_submit_tool_outputs_isValid;
}

QString OAIRunObject_required_action::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIRunObject_required_action::asJsonObject() const {
    QJsonObject obj;
    if (m_type_isSet) {
        obj.insert(QString("type"), ::OpenAPI::toJsonValue(type));
    }
    if (submit_tool_outputs.isSet()) {
        obj.insert(QString("submit_tool_outputs"), ::OpenAPI::toJsonValue(submit_tool_outputs));
    }
    return obj;
}

QString OAIRunObject_required_action::getType() const {
    return type;
}
void OAIRunObject_required_action::setType(const QString &type) {
    this->type = type;
    this->m_type_isSet = true;
}

bool OAIRunObject_required_action::is_type_Set() const{
    return m_type_isSet;
}

bool OAIRunObject_required_action::is_type_Valid() const{
    return m_type_isValid;
}

OAIRunObject_required_action_submit_tool_outputs OAIRunObject_required_action::getSubmitToolOutputs() const {
    return submit_tool_outputs;
}
void OAIRunObject_required_action::setSubmitToolOutputs(const OAIRunObject_required_action_submit_tool_outputs &submit_tool_outputs) {
    this->submit_tool_outputs = submit_tool_outputs;
    this->m_submit_tool_outputs_isSet = true;
}

bool OAIRunObject_required_action::is_submit_tool_outputs_Set() const{
    return m_submit_tool_outputs_isSet;
}

bool OAIRunObject_required_action::is_submit_tool_outputs_Valid() const{
    return m_submit_tool_outputs_isValid;
}

bool OAIRunObject_required_action::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_type_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (submit_tool_outputs.isSet()) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIRunObject_required_action::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_type_isValid && m_submit_tool_outputs_isValid && true;
}

} // namespace OpenAPI