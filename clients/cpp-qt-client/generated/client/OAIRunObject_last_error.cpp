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

#include "OAIRunObject_last_error.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIRunObject_last_error::OAIRunObject_last_error(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIRunObject_last_error::OAIRunObject_last_error() {
    this->initializeModel();
}

OAIRunObject_last_error::~OAIRunObject_last_error() {}

void OAIRunObject_last_error::initializeModel() {

    m_code_isSet = false;
    m_code_isValid = false;

    m_message_isSet = false;
    m_message_isValid = false;
}

void OAIRunObject_last_error::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIRunObject_last_error::fromJsonObject(QJsonObject json) {

    m_code_isValid = ::OpenAPI::fromJsonValue(m_code, json[QString("code")]);
    m_code_isSet = !json[QString("code")].isNull() && m_code_isValid;

    m_message_isValid = ::OpenAPI::fromJsonValue(m_message, json[QString("message")]);
    m_message_isSet = !json[QString("message")].isNull() && m_message_isValid;
}

QString OAIRunObject_last_error::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIRunObject_last_error::asJsonObject() const {
    QJsonObject obj;
    if (m_code_isSet) {
        obj.insert(QString("code"), ::OpenAPI::toJsonValue(m_code));
    }
    if (m_message_isSet) {
        obj.insert(QString("message"), ::OpenAPI::toJsonValue(m_message));
    }
    return obj;
}

QString OAIRunObject_last_error::getCode() const {
    return m_code;
}
void OAIRunObject_last_error::setCode(const QString &code) {
    m_code = code;
    m_code_isSet = true;
}

bool OAIRunObject_last_error::is_code_Set() const{
    return m_code_isSet;
}

bool OAIRunObject_last_error::is_code_Valid() const{
    return m_code_isValid;
}

QString OAIRunObject_last_error::getMessage() const {
    return m_message;
}
void OAIRunObject_last_error::setMessage(const QString &message) {
    m_message = message;
    m_message_isSet = true;
}

bool OAIRunObject_last_error::is_message_Set() const{
    return m_message_isSet;
}

bool OAIRunObject_last_error::is_message_Valid() const{
    return m_message_isValid;
}

bool OAIRunObject_last_error::isSet() const {
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

bool OAIRunObject_last_error::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_code_isValid && m_message_isValid && true;
}

} // namespace OpenAPI
