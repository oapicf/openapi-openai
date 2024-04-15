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

#include "OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner() {
    this->initializeModel();
}

OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::~OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner() {}

void OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::initializeModel() {

    m_index_isSet = false;
    m_index_isValid = false;

    m_type_isSet = false;
    m_type_isValid = false;

    m_logs_isSet = false;
    m_logs_isValid = false;

    m_image_isSet = false;
    m_image_isValid = false;
}

void OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::fromJsonObject(QJsonObject json) {

    m_index_isValid = ::OpenAPI::fromJsonValue(m_index, json[QString("index")]);
    m_index_isSet = !json[QString("index")].isNull() && m_index_isValid;

    m_type_isValid = ::OpenAPI::fromJsonValue(m_type, json[QString("type")]);
    m_type_isSet = !json[QString("type")].isNull() && m_type_isValid;

    m_logs_isValid = ::OpenAPI::fromJsonValue(m_logs, json[QString("logs")]);
    m_logs_isSet = !json[QString("logs")].isNull() && m_logs_isValid;

    m_image_isValid = ::OpenAPI::fromJsonValue(m_image, json[QString("image")]);
    m_image_isSet = !json[QString("image")].isNull() && m_image_isValid;
}

QString OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::asJsonObject() const {
    QJsonObject obj;
    if (m_index_isSet) {
        obj.insert(QString("index"), ::OpenAPI::toJsonValue(m_index));
    }
    if (m_type_isSet) {
        obj.insert(QString("type"), ::OpenAPI::toJsonValue(m_type));
    }
    if (m_logs_isSet) {
        obj.insert(QString("logs"), ::OpenAPI::toJsonValue(m_logs));
    }
    if (m_image.isSet()) {
        obj.insert(QString("image"), ::OpenAPI::toJsonValue(m_image));
    }
    return obj;
}

qint32 OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::getIndex() const {
    return m_index;
}
void OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::setIndex(const qint32 &index) {
    m_index = index;
    m_index_isSet = true;
}

bool OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::is_index_Set() const{
    return m_index_isSet;
}

bool OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::is_index_Valid() const{
    return m_index_isValid;
}

QString OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::getType() const {
    return m_type;
}
void OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::setType(const QString &type) {
    m_type = type;
    m_type_isSet = true;
}

bool OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::is_type_Set() const{
    return m_type_isSet;
}

bool OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::is_type_Valid() const{
    return m_type_isValid;
}

QString OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::getLogs() const {
    return m_logs;
}
void OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::setLogs(const QString &logs) {
    m_logs = logs;
    m_logs_isSet = true;
}

bool OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::is_logs_Set() const{
    return m_logs_isSet;
}

bool OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::is_logs_Valid() const{
    return m_logs_isValid;
}

OAIRunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::getImage() const {
    return m_image;
}
void OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::setImage(const OAIRunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image &image) {
    m_image = image;
    m_image_isSet = true;
}

bool OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::is_image_Set() const{
    return m_image_isSet;
}

bool OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::is_image_Valid() const{
    return m_image_isValid;
}

bool OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_index_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_type_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_logs_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_image.isSet()) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_index_isValid && m_type_isValid && true;
}

} // namespace OpenAPI