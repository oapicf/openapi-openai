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

#include "OAIRunStepDeltaObject.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIRunStepDeltaObject::OAIRunStepDeltaObject(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIRunStepDeltaObject::OAIRunStepDeltaObject() {
    this->initializeModel();
}

OAIRunStepDeltaObject::~OAIRunStepDeltaObject() {}

void OAIRunStepDeltaObject::initializeModel() {

    m_id_isSet = false;
    m_id_isValid = false;

    m_object_isSet = false;
    m_object_isValid = false;

    m_delta_isSet = false;
    m_delta_isValid = false;
}

void OAIRunStepDeltaObject::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIRunStepDeltaObject::fromJsonObject(QJsonObject json) {

    m_id_isValid = ::OpenAPI::fromJsonValue(m_id, json[QString("id")]);
    m_id_isSet = !json[QString("id")].isNull() && m_id_isValid;

    m_object_isValid = ::OpenAPI::fromJsonValue(m_object, json[QString("object")]);
    m_object_isSet = !json[QString("object")].isNull() && m_object_isValid;

    m_delta_isValid = ::OpenAPI::fromJsonValue(m_delta, json[QString("delta")]);
    m_delta_isSet = !json[QString("delta")].isNull() && m_delta_isValid;
}

QString OAIRunStepDeltaObject::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIRunStepDeltaObject::asJsonObject() const {
    QJsonObject obj;
    if (m_id_isSet) {
        obj.insert(QString("id"), ::OpenAPI::toJsonValue(m_id));
    }
    if (m_object_isSet) {
        obj.insert(QString("object"), ::OpenAPI::toJsonValue(m_object));
    }
    if (m_delta.isSet()) {
        obj.insert(QString("delta"), ::OpenAPI::toJsonValue(m_delta));
    }
    return obj;
}

QString OAIRunStepDeltaObject::getId() const {
    return m_id;
}
void OAIRunStepDeltaObject::setId(const QString &id) {
    m_id = id;
    m_id_isSet = true;
}

bool OAIRunStepDeltaObject::is_id_Set() const{
    return m_id_isSet;
}

bool OAIRunStepDeltaObject::is_id_Valid() const{
    return m_id_isValid;
}

QString OAIRunStepDeltaObject::getObject() const {
    return m_object;
}
void OAIRunStepDeltaObject::setObject(const QString &object) {
    m_object = object;
    m_object_isSet = true;
}

bool OAIRunStepDeltaObject::is_object_Set() const{
    return m_object_isSet;
}

bool OAIRunStepDeltaObject::is_object_Valid() const{
    return m_object_isValid;
}

OAIRunStepDeltaObject_delta OAIRunStepDeltaObject::getDelta() const {
    return m_delta;
}
void OAIRunStepDeltaObject::setDelta(const OAIRunStepDeltaObject_delta &delta) {
    m_delta = delta;
    m_delta_isSet = true;
}

bool OAIRunStepDeltaObject::is_delta_Set() const{
    return m_delta_isSet;
}

bool OAIRunStepDeltaObject::is_delta_Valid() const{
    return m_delta_isValid;
}

bool OAIRunStepDeltaObject::isSet() const {
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

        if (m_delta.isSet()) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIRunStepDeltaObject::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_id_isValid && m_object_isValid && m_delta_isValid && true;
}

} // namespace OpenAPI