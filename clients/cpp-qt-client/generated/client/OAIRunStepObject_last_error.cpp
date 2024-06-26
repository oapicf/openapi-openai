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

#include "OAIRunStepObject_last_error.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIRunStepObject_last_error::OAIRunStepObject_last_error(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIRunStepObject_last_error::OAIRunStepObject_last_error() {
    this->initializeModel();
}

OAIRunStepObject_last_error::~OAIRunStepObject_last_error() {}

void OAIRunStepObject_last_error::initializeModel() {

    m_code_isSet = false;
    m_code_isValid = false;

    m_message_isSet = false;
    m_message_isValid = false;
}

void OAIRunStepObject_last_error::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIRunStepObject_last_error::fromJsonObject(QJsonObject json) {

    m_code_isValid = ::OpenAPI::fromJsonValue(m_code, json[QString("code")]);
    m_code_isSet = !json[QString("code")].isNull() && m_code_isValid;

    m_message_isValid = ::OpenAPI::fromJsonValue(m_message, json[QString("message")]);
    m_message_isSet = !json[QString("message")].isNull() && m_message_isValid;
}

QString OAIRunStepObject_last_error::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIRunStepObject_last_error::asJsonObject() const {
    QJsonObject obj;
    if (m_code_isSet) {
        obj.insert(QString("code"), ::OpenAPI::toJsonValue(m_code));
    }
    if (m_message_isSet) {
        obj.insert(QString("message"), ::OpenAPI::toJsonValue(m_message));
    }
    return obj;
}

QString OAIRunStepObject_last_error::getCode() const {
    return m_code;
}
void OAIRunStepObject_last_error::setCode(const QString &code) {
    m_code = code;
    m_code_isSet = true;
}

bool OAIRunStepObject_last_error::is_code_Set() const{
    return m_code_isSet;
}

bool OAIRunStepObject_last_error::is_code_Valid() const{
    return m_code_isValid;
}

QString OAIRunStepObject_last_error::getMessage() const {
    return m_message;
}
void OAIRunStepObject_last_error::setMessage(const QString &message) {
    m_message = message;
    m_message_isSet = true;
}

bool OAIRunStepObject_last_error::is_message_Set() const{
    return m_message_isSet;
}

bool OAIRunStepObject_last_error::is_message_Valid() const{
    return m_message_isValid;
}

bool OAIRunStepObject_last_error::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_code_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_message_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIRunStepObject_last_error::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_code_isValid && m_message_isValid && true;
}

} // namespace OpenAPI
