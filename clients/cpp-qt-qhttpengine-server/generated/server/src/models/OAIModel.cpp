/**
 * OpenAI API
 * APIs for sampling from and fine-tuning language models
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

#include "OAIModel.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIModel::OAIModel(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIModel::OAIModel() {
    this->initializeModel();
}

OAIModel::~OAIModel() {}

void OAIModel::initializeModel() {

    m_id_isSet = false;
    m_id_isValid = false;

    m_object_isSet = false;
    m_object_isValid = false;

    m_created_isSet = false;
    m_created_isValid = false;

    m_owned_by_isSet = false;
    m_owned_by_isValid = false;
}

void OAIModel::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIModel::fromJsonObject(QJsonObject json) {

    m_id_isValid = ::OpenAPI::fromJsonValue(id, json[QString("id")]);
    m_id_isSet = !json[QString("id")].isNull() && m_id_isValid;

    m_object_isValid = ::OpenAPI::fromJsonValue(object, json[QString("object")]);
    m_object_isSet = !json[QString("object")].isNull() && m_object_isValid;

    m_created_isValid = ::OpenAPI::fromJsonValue(created, json[QString("created")]);
    m_created_isSet = !json[QString("created")].isNull() && m_created_isValid;

    m_owned_by_isValid = ::OpenAPI::fromJsonValue(owned_by, json[QString("owned_by")]);
    m_owned_by_isSet = !json[QString("owned_by")].isNull() && m_owned_by_isValid;
}

QString OAIModel::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIModel::asJsonObject() const {
    QJsonObject obj;
    if (m_id_isSet) {
        obj.insert(QString("id"), ::OpenAPI::toJsonValue(id));
    }
    if (m_object_isSet) {
        obj.insert(QString("object"), ::OpenAPI::toJsonValue(object));
    }
    if (m_created_isSet) {
        obj.insert(QString("created"), ::OpenAPI::toJsonValue(created));
    }
    if (m_owned_by_isSet) {
        obj.insert(QString("owned_by"), ::OpenAPI::toJsonValue(owned_by));
    }
    return obj;
}

QString OAIModel::getId() const {
    return id;
}
void OAIModel::setId(const QString &id) {
    this->id = id;
    this->m_id_isSet = true;
}

bool OAIModel::is_id_Set() const{
    return m_id_isSet;
}

bool OAIModel::is_id_Valid() const{
    return m_id_isValid;
}

QString OAIModel::getObject() const {
    return object;
}
void OAIModel::setObject(const QString &object) {
    this->object = object;
    this->m_object_isSet = true;
}

bool OAIModel::is_object_Set() const{
    return m_object_isSet;
}

bool OAIModel::is_object_Valid() const{
    return m_object_isValid;
}

qint32 OAIModel::getCreated() const {
    return created;
}
void OAIModel::setCreated(const qint32 &created) {
    this->created = created;
    this->m_created_isSet = true;
}

bool OAIModel::is_created_Set() const{
    return m_created_isSet;
}

bool OAIModel::is_created_Valid() const{
    return m_created_isValid;
}

QString OAIModel::getOwnedBy() const {
    return owned_by;
}
void OAIModel::setOwnedBy(const QString &owned_by) {
    this->owned_by = owned_by;
    this->m_owned_by_isSet = true;
}

bool OAIModel::is_owned_by_Set() const{
    return m_owned_by_isSet;
}

bool OAIModel::is_owned_by_Valid() const{
    return m_owned_by_isValid;
}

bool OAIModel::isSet() const {
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

        if (m_created_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_owned_by_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIModel::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_id_isValid && m_object_isValid && m_created_isValid && m_owned_by_isValid && true;
}

} // namespace OpenAPI