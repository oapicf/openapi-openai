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

    m_index_isValid = ::OpenAPI::fromJsonValue(index, json[QString("index")]);
    m_index_isSet = !json[QString("index")].isNull() && m_index_isValid;

    m_type_isValid = ::OpenAPI::fromJsonValue(type, json[QString("type")]);
    m_type_isSet = !json[QString("type")].isNull() && m_type_isValid;

    m_logs_isValid = ::OpenAPI::fromJsonValue(logs, json[QString("logs")]);
    m_logs_isSet = !json[QString("logs")].isNull() && m_logs_isValid;

    m_image_isValid = ::OpenAPI::fromJsonValue(image, json[QString("image")]);
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
        obj.insert(QString("index"), ::OpenAPI::toJsonValue(index));
    }
    if (m_type_isSet) {
        obj.insert(QString("type"), ::OpenAPI::toJsonValue(type));
    }
    if (m_logs_isSet) {
        obj.insert(QString("logs"), ::OpenAPI::toJsonValue(logs));
    }
    if (image.isSet()) {
        obj.insert(QString("image"), ::OpenAPI::toJsonValue(image));
    }
    return obj;
}

qint32 OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::getIndex() const {
    return index;
}
void OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::setIndex(const qint32 &index) {
    this->index = index;
    this->m_index_isSet = true;
}

bool OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::is_index_Set() const{
    return m_index_isSet;
}

bool OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::is_index_Valid() const{
    return m_index_isValid;
}

QString OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::getType() const {
    return type;
}
void OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::setType(const QString &type) {
    this->type = type;
    this->m_type_isSet = true;
}

bool OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::is_type_Set() const{
    return m_type_isSet;
}

bool OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::is_type_Valid() const{
    return m_type_isValid;
}

QString OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::getLogs() const {
    return logs;
}
void OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::setLogs(const QString &logs) {
    this->logs = logs;
    this->m_logs_isSet = true;
}

bool OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::is_logs_Set() const{
    return m_logs_isSet;
}

bool OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::is_logs_Valid() const{
    return m_logs_isValid;
}

OAIRunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::getImage() const {
    return image;
}
void OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::setImage(const OAIRunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image &image) {
    this->image = image;
    this->m_image_isSet = true;
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

        if (image.isSet()) {
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