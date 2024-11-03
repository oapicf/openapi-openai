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

#include "OAIListMessageFilesResponse.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIListMessageFilesResponse::OAIListMessageFilesResponse(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIListMessageFilesResponse::OAIListMessageFilesResponse() {
    this->initializeModel();
}

OAIListMessageFilesResponse::~OAIListMessageFilesResponse() {}

void OAIListMessageFilesResponse::initializeModel() {

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

void OAIListMessageFilesResponse::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIListMessageFilesResponse::fromJsonObject(QJsonObject json) {

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

QString OAIListMessageFilesResponse::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIListMessageFilesResponse::asJsonObject() const {
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

QString OAIListMessageFilesResponse::getObject() const {
    return object;
}
void OAIListMessageFilesResponse::setObject(const QString &object) {
    this->object = object;
    this->m_object_isSet = true;
}

bool OAIListMessageFilesResponse::is_object_Set() const{
    return m_object_isSet;
}

bool OAIListMessageFilesResponse::is_object_Valid() const{
    return m_object_isValid;
}

QList<OAIMessageFileObject> OAIListMessageFilesResponse::getData() const {
    return data;
}
void OAIListMessageFilesResponse::setData(const QList<OAIMessageFileObject> &data) {
    this->data = data;
    this->m_data_isSet = true;
}

bool OAIListMessageFilesResponse::is_data_Set() const{
    return m_data_isSet;
}

bool OAIListMessageFilesResponse::is_data_Valid() const{
    return m_data_isValid;
}

QString OAIListMessageFilesResponse::getFirstId() const {
    return first_id;
}
void OAIListMessageFilesResponse::setFirstId(const QString &first_id) {
    this->first_id = first_id;
    this->m_first_id_isSet = true;
}

bool OAIListMessageFilesResponse::is_first_id_Set() const{
    return m_first_id_isSet;
}

bool OAIListMessageFilesResponse::is_first_id_Valid() const{
    return m_first_id_isValid;
}

QString OAIListMessageFilesResponse::getLastId() const {
    return last_id;
}
void OAIListMessageFilesResponse::setLastId(const QString &last_id) {
    this->last_id = last_id;
    this->m_last_id_isSet = true;
}

bool OAIListMessageFilesResponse::is_last_id_Set() const{
    return m_last_id_isSet;
}

bool OAIListMessageFilesResponse::is_last_id_Valid() const{
    return m_last_id_isValid;
}

bool OAIListMessageFilesResponse::isHasMore() const {
    return has_more;
}
void OAIListMessageFilesResponse::setHasMore(const bool &has_more) {
    this->has_more = has_more;
    this->m_has_more_isSet = true;
}

bool OAIListMessageFilesResponse::is_has_more_Set() const{
    return m_has_more_isSet;
}

bool OAIListMessageFilesResponse::is_has_more_Valid() const{
    return m_has_more_isValid;
}

bool OAIListMessageFilesResponse::isSet() const {
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

bool OAIListMessageFilesResponse::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_object_isValid && m_data_isValid && m_first_id_isValid && m_last_id_isValid && m_has_more_isValid && true;
}

} // namespace OpenAPI
