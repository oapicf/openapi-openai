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

#include "OAIAssistantFileObject.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIAssistantFileObject::OAIAssistantFileObject(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIAssistantFileObject::OAIAssistantFileObject() {
    this->initializeModel();
}

OAIAssistantFileObject::~OAIAssistantFileObject() {}

void OAIAssistantFileObject::initializeModel() {

    m_id_isSet = false;
    m_id_isValid = false;

    m_object_isSet = false;
    m_object_isValid = false;

    m_created_at_isSet = false;
    m_created_at_isValid = false;

    m_assistant_id_isSet = false;
    m_assistant_id_isValid = false;
}

void OAIAssistantFileObject::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIAssistantFileObject::fromJsonObject(QJsonObject json) {

    m_id_isValid = ::OpenAPI::fromJsonValue(m_id, json[QString("id")]);
    m_id_isSet = !json[QString("id")].isNull() && m_id_isValid;

    m_object_isValid = ::OpenAPI::fromJsonValue(m_object, json[QString("object")]);
    m_object_isSet = !json[QString("object")].isNull() && m_object_isValid;

    m_created_at_isValid = ::OpenAPI::fromJsonValue(m_created_at, json[QString("created_at")]);
    m_created_at_isSet = !json[QString("created_at")].isNull() && m_created_at_isValid;

    m_assistant_id_isValid = ::OpenAPI::fromJsonValue(m_assistant_id, json[QString("assistant_id")]);
    m_assistant_id_isSet = !json[QString("assistant_id")].isNull() && m_assistant_id_isValid;
}

QString OAIAssistantFileObject::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIAssistantFileObject::asJsonObject() const {
    QJsonObject obj;
    if (m_id_isSet) {
        obj.insert(QString("id"), ::OpenAPI::toJsonValue(m_id));
    }
    if (m_object_isSet) {
        obj.insert(QString("object"), ::OpenAPI::toJsonValue(m_object));
    }
    if (m_created_at_isSet) {
        obj.insert(QString("created_at"), ::OpenAPI::toJsonValue(m_created_at));
    }
    if (m_assistant_id_isSet) {
        obj.insert(QString("assistant_id"), ::OpenAPI::toJsonValue(m_assistant_id));
    }
    return obj;
}

QString OAIAssistantFileObject::getId() const {
    return m_id;
}
void OAIAssistantFileObject::setId(const QString &id) {
    m_id = id;
    m_id_isSet = true;
}

bool OAIAssistantFileObject::is_id_Set() const{
    return m_id_isSet;
}

bool OAIAssistantFileObject::is_id_Valid() const{
    return m_id_isValid;
}

QString OAIAssistantFileObject::getObject() const {
    return m_object;
}
void OAIAssistantFileObject::setObject(const QString &object) {
    m_object = object;
    m_object_isSet = true;
}

bool OAIAssistantFileObject::is_object_Set() const{
    return m_object_isSet;
}

bool OAIAssistantFileObject::is_object_Valid() const{
    return m_object_isValid;
}

qint32 OAIAssistantFileObject::getCreatedAt() const {
    return m_created_at;
}
void OAIAssistantFileObject::setCreatedAt(const qint32 &created_at) {
    m_created_at = created_at;
    m_created_at_isSet = true;
}

bool OAIAssistantFileObject::is_created_at_Set() const{
    return m_created_at_isSet;
}

bool OAIAssistantFileObject::is_created_at_Valid() const{
    return m_created_at_isValid;
}

QString OAIAssistantFileObject::getAssistantId() const {
    return m_assistant_id;
}
void OAIAssistantFileObject::setAssistantId(const QString &assistant_id) {
    m_assistant_id = assistant_id;
    m_assistant_id_isSet = true;
}

bool OAIAssistantFileObject::is_assistant_id_Set() const{
    return m_assistant_id_isSet;
}

bool OAIAssistantFileObject::is_assistant_id_Valid() const{
    return m_assistant_id_isValid;
}

bool OAIAssistantFileObject::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_object_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_created_at_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_assistant_id_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIAssistantFileObject::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_id_isValid && m_object_isValid && m_created_at_isValid && m_assistant_id_isValid && true;
}

} // namespace OpenAPI
