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

#include "OAIRunStepDeltaStepDetailsMessageCreationObject.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIRunStepDeltaStepDetailsMessageCreationObject::OAIRunStepDeltaStepDetailsMessageCreationObject(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIRunStepDeltaStepDetailsMessageCreationObject::OAIRunStepDeltaStepDetailsMessageCreationObject() {
    this->initializeModel();
}

OAIRunStepDeltaStepDetailsMessageCreationObject::~OAIRunStepDeltaStepDetailsMessageCreationObject() {}

void OAIRunStepDeltaStepDetailsMessageCreationObject::initializeModel() {

    m_type_isSet = false;
    m_type_isValid = false;

    m_message_creation_isSet = false;
    m_message_creation_isValid = false;
}

void OAIRunStepDeltaStepDetailsMessageCreationObject::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIRunStepDeltaStepDetailsMessageCreationObject::fromJsonObject(QJsonObject json) {

    m_type_isValid = ::OpenAPI::fromJsonValue(type, json[QString("type")]);
    m_type_isSet = !json[QString("type")].isNull() && m_type_isValid;

    m_message_creation_isValid = ::OpenAPI::fromJsonValue(message_creation, json[QString("message_creation")]);
    m_message_creation_isSet = !json[QString("message_creation")].isNull() && m_message_creation_isValid;
}

QString OAIRunStepDeltaStepDetailsMessageCreationObject::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIRunStepDeltaStepDetailsMessageCreationObject::asJsonObject() const {
    QJsonObject obj;
    if (m_type_isSet) {
        obj.insert(QString("type"), ::OpenAPI::toJsonValue(type));
    }
    if (message_creation.isSet()) {
        obj.insert(QString("message_creation"), ::OpenAPI::toJsonValue(message_creation));
    }
    return obj;
}

QString OAIRunStepDeltaStepDetailsMessageCreationObject::getType() const {
    return type;
}
void OAIRunStepDeltaStepDetailsMessageCreationObject::setType(const QString &type) {
    this->type = type;
    this->m_type_isSet = true;
}

bool OAIRunStepDeltaStepDetailsMessageCreationObject::is_type_Set() const{
    return m_type_isSet;
}

bool OAIRunStepDeltaStepDetailsMessageCreationObject::is_type_Valid() const{
    return m_type_isValid;
}

OAIRunStepDeltaStepDetailsMessageCreationObject_message_creation OAIRunStepDeltaStepDetailsMessageCreationObject::getMessageCreation() const {
    return message_creation;
}
void OAIRunStepDeltaStepDetailsMessageCreationObject::setMessageCreation(const OAIRunStepDeltaStepDetailsMessageCreationObject_message_creation &message_creation) {
    this->message_creation = message_creation;
    this->m_message_creation_isSet = true;
}

bool OAIRunStepDeltaStepDetailsMessageCreationObject::is_message_creation_Set() const{
    return m_message_creation_isSet;
}

bool OAIRunStepDeltaStepDetailsMessageCreationObject::is_message_creation_Valid() const{
    return m_message_creation_isValid;
}

bool OAIRunStepDeltaStepDetailsMessageCreationObject::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_type_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (message_creation.isSet()) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIRunStepDeltaStepDetailsMessageCreationObject::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_type_isValid && true;
}

} // namespace OpenAPI
