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

#include "OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter::OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter::OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter() {
    this->initializeModel();
}

OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter::~OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter() {}

void OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter::initializeModel() {

    m_input_isSet = false;
    m_input_isValid = false;

    m_outputs_isSet = false;
    m_outputs_isValid = false;
}

void OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter::fromJsonObject(QJsonObject json) {

    m_input_isValid = ::OpenAPI::fromJsonValue(m_input, json[QString("input")]);
    m_input_isSet = !json[QString("input")].isNull() && m_input_isValid;

    m_outputs_isValid = ::OpenAPI::fromJsonValue(m_outputs, json[QString("outputs")]);
    m_outputs_isSet = !json[QString("outputs")].isNull() && m_outputs_isValid;
}

QString OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter::asJsonObject() const {
    QJsonObject obj;
    if (m_input_isSet) {
        obj.insert(QString("input"), ::OpenAPI::toJsonValue(m_input));
    }
    if (m_outputs.size() > 0) {
        obj.insert(QString("outputs"), ::OpenAPI::toJsonValue(m_outputs));
    }
    return obj;
}

QString OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter::getInput() const {
    return m_input;
}
void OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter::setInput(const QString &input) {
    m_input = input;
    m_input_isSet = true;
}

bool OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter::is_input_Set() const{
    return m_input_isSet;
}

bool OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter::is_input_Valid() const{
    return m_input_isValid;
}

QList<OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner> OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter::getOutputs() const {
    return m_outputs;
}
void OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter::setOutputs(const QList<OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner> &outputs) {
    m_outputs = outputs;
    m_outputs_isSet = true;
}

bool OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter::is_outputs_Set() const{
    return m_outputs_isSet;
}

bool OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter::is_outputs_Valid() const{
    return m_outputs_isValid;
}

bool OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_input_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_outputs.size() > 0) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI