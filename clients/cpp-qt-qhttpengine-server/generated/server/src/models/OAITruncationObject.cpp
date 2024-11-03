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

#include "OAITruncationObject.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAITruncationObject::OAITruncationObject(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAITruncationObject::OAITruncationObject() {
    this->initializeModel();
}

OAITruncationObject::~OAITruncationObject() {}

void OAITruncationObject::initializeModel() {

    m_type_isSet = false;
    m_type_isValid = false;

    m_last_messages_isSet = false;
    m_last_messages_isValid = false;
}

void OAITruncationObject::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAITruncationObject::fromJsonObject(QJsonObject json) {

    m_type_isValid = ::OpenAPI::fromJsonValue(type, json[QString("type")]);
    m_type_isSet = !json[QString("type")].isNull() && m_type_isValid;

    m_last_messages_isValid = ::OpenAPI::fromJsonValue(last_messages, json[QString("last_messages")]);
    m_last_messages_isSet = !json[QString("last_messages")].isNull() && m_last_messages_isValid;
}

QString OAITruncationObject::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAITruncationObject::asJsonObject() const {
    QJsonObject obj;
    if (m_type_isSet) {
        obj.insert(QString("type"), ::OpenAPI::toJsonValue(type));
    }
    if (m_last_messages_isSet) {
        obj.insert(QString("last_messages"), ::OpenAPI::toJsonValue(last_messages));
    }
    return obj;
}

QString OAITruncationObject::getType() const {
    return type;
}
void OAITruncationObject::setType(const QString &type) {
    this->type = type;
    this->m_type_isSet = true;
}

bool OAITruncationObject::is_type_Set() const{
    return m_type_isSet;
}

bool OAITruncationObject::is_type_Valid() const{
    return m_type_isValid;
}

qint32 OAITruncationObject::getLastMessages() const {
    return last_messages;
}
void OAITruncationObject::setLastMessages(const qint32 &last_messages) {
    this->last_messages = last_messages;
    this->m_last_messages_isSet = true;
}

bool OAITruncationObject::is_last_messages_Set() const{
    return m_last_messages_isSet;
}

bool OAITruncationObject::is_last_messages_Valid() const{
    return m_last_messages_isValid;
}

bool OAITruncationObject::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_type_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_last_messages_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAITruncationObject::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
