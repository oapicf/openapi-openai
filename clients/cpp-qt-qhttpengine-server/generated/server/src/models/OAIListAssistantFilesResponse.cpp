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

#include "OAIListAssistantFilesResponse.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIListAssistantFilesResponse::OAIListAssistantFilesResponse(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIListAssistantFilesResponse::OAIListAssistantFilesResponse() {
    this->initializeModel();
}

OAIListAssistantFilesResponse::~OAIListAssistantFilesResponse() {}

void OAIListAssistantFilesResponse::initializeModel() {

    m_object_isSet = false;
    m_object_isValid = false;

    m_data_isSet = false;
    m_data_isValid = false;

    m_first_id_isSet = false;
    m_first_id_isValid = false;

    m_last_id_isSet = false;
    m_last_id_isValid = false;

    m_has_more_isSet = false;
    m_has_more_isValid = false;
}

void OAIListAssistantFilesResponse::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIListAssistantFilesResponse::fromJsonObject(QJsonObject json) {

    m_object_isValid = ::OpenAPI::fromJsonValue(object, json[QString("object")]);
    m_object_isSet = !json[QString("object")].isNull() && m_object_isValid;

    m_data_isValid = ::OpenAPI::fromJsonValue(data, json[QString("data")]);
    m_data_isSet = !json[QString("data")].isNull() && m_data_isValid;

    m_first_id_isValid = ::OpenAPI::fromJsonValue(first_id, json[QString("first_id")]);
    m_first_id_isSet = !json[QString("first_id")].isNull() && m_first_id_isValid;

    m_last_id_isValid = ::OpenAPI::fromJsonValue(last_id, json[QString("last_id")]);
    m_last_id_isSet = !json[QString("last_id")].isNull() && m_last_id_isValid;

    m_has_more_isValid = ::OpenAPI::fromJsonValue(has_more, json[QString("has_more")]);
    m_has_more_isSet = !json[QString("has_more")].isNull() && m_has_more_isValid;
}

QString OAIListAssistantFilesResponse::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIListAssistantFilesResponse::asJsonObject() const {
    QJsonObject obj;
    if (m_object_isSet) {
        obj.insert(QString("object"), ::OpenAPI::toJsonValue(object));
    }
    if (data.size() > 0) {
        obj.insert(QString("data"), ::OpenAPI::toJsonValue(data));
    }
    if (m_first_id_isSet) {
        obj.insert(QString("first_id"), ::OpenAPI::toJsonValue(first_id));
    }
    if (m_last_id_isSet) {
        obj.insert(QString("last_id"), ::OpenAPI::toJsonValue(last_id));
    }
    if (m_has_more_isSet) {
        obj.insert(QString("has_more"), ::OpenAPI::toJsonValue(has_more));
    }
    return obj;
}

QString OAIListAssistantFilesResponse::getObject() const {
    return object;
}
void OAIListAssistantFilesResponse::setObject(const QString &object) {
    this->object = object;
    this->m_object_isSet = true;
}

bool OAIListAssistantFilesResponse::is_object_Set() const{
    return m_object_isSet;
}

bool OAIListAssistantFilesResponse::is_object_Valid() const{
    return m_object_isValid;
}

QList<OAIAssistantFileObject> OAIListAssistantFilesResponse::getData() const {
    return data;
}
void OAIListAssistantFilesResponse::setData(const QList<OAIAssistantFileObject> &data) {
    this->data = data;
    this->m_data_isSet = true;
}

bool OAIListAssistantFilesResponse::is_data_Set() const{
    return m_data_isSet;
}

bool OAIListAssistantFilesResponse::is_data_Valid() const{
    return m_data_isValid;
}

QString OAIListAssistantFilesResponse::getFirstId() const {
    return first_id;
}
void OAIListAssistantFilesResponse::setFirstId(const QString &first_id) {
    this->first_id = first_id;
    this->m_first_id_isSet = true;
}

bool OAIListAssistantFilesResponse::is_first_id_Set() const{
    return m_first_id_isSet;
}

bool OAIListAssistantFilesResponse::is_first_id_Valid() const{
    return m_first_id_isValid;
}

QString OAIListAssistantFilesResponse::getLastId() const {
    return last_id;
}
void OAIListAssistantFilesResponse::setLastId(const QString &last_id) {
    this->last_id = last_id;
    this->m_last_id_isSet = true;
}

bool OAIListAssistantFilesResponse::is_last_id_Set() const{
    return m_last_id_isSet;
}

bool OAIListAssistantFilesResponse::is_last_id_Valid() const{
    return m_last_id_isValid;
}

bool OAIListAssistantFilesResponse::isHasMore() const {
    return has_more;
}
void OAIListAssistantFilesResponse::setHasMore(const bool &has_more) {
    this->has_more = has_more;
    this->m_has_more_isSet = true;
}

bool OAIListAssistantFilesResponse::is_has_more_Set() const{
    return m_has_more_isSet;
}

bool OAIListAssistantFilesResponse::is_has_more_Valid() const{
    return m_has_more_isValid;
}

bool OAIListAssistantFilesResponse::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_object_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (data.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_first_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_last_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_has_more_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIListAssistantFilesResponse::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_object_isValid && m_data_isValid && m_first_id_isValid && m_last_id_isValid && m_has_more_isValid && true;
}

} // namespace OpenAPI
