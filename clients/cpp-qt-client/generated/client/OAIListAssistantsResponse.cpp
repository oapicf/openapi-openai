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

#include "OAIListAssistantsResponse.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIListAssistantsResponse::OAIListAssistantsResponse(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIListAssistantsResponse::OAIListAssistantsResponse() {
    this->initializeModel();
}

OAIListAssistantsResponse::~OAIListAssistantsResponse() {}

void OAIListAssistantsResponse::initializeModel() {

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

void OAIListAssistantsResponse::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIListAssistantsResponse::fromJsonObject(QJsonObject json) {

    m_object_isValid = ::OpenAPI::fromJsonValue(m_object, json[QString("object")]);
    m_object_isSet = !json[QString("object")].isNull() && m_object_isValid;

    m_data_isValid = ::OpenAPI::fromJsonValue(m_data, json[QString("data")]);
    m_data_isSet = !json[QString("data")].isNull() && m_data_isValid;

    m_first_id_isValid = ::OpenAPI::fromJsonValue(m_first_id, json[QString("first_id")]);
    m_first_id_isSet = !json[QString("first_id")].isNull() && m_first_id_isValid;

    m_last_id_isValid = ::OpenAPI::fromJsonValue(m_last_id, json[QString("last_id")]);
    m_last_id_isSet = !json[QString("last_id")].isNull() && m_last_id_isValid;

    m_has_more_isValid = ::OpenAPI::fromJsonValue(m_has_more, json[QString("has_more")]);
    m_has_more_isSet = !json[QString("has_more")].isNull() && m_has_more_isValid;
}

QString OAIListAssistantsResponse::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIListAssistantsResponse::asJsonObject() const {
    QJsonObject obj;
    if (m_object_isSet) {
        obj.insert(QString("object"), ::OpenAPI::toJsonValue(m_object));
    }
    if (m_data.size() > 0) {
        obj.insert(QString("data"), ::OpenAPI::toJsonValue(m_data));
    }
    if (m_first_id_isSet) {
        obj.insert(QString("first_id"), ::OpenAPI::toJsonValue(m_first_id));
    }
    if (m_last_id_isSet) {
        obj.insert(QString("last_id"), ::OpenAPI::toJsonValue(m_last_id));
    }
    if (m_has_more_isSet) {
        obj.insert(QString("has_more"), ::OpenAPI::toJsonValue(m_has_more));
    }
    return obj;
}

QString OAIListAssistantsResponse::getObject() const {
    return m_object;
}
void OAIListAssistantsResponse::setObject(const QString &object) {
    m_object = object;
    m_object_isSet = true;
}

bool OAIListAssistantsResponse::is_object_Set() const{
    return m_object_isSet;
}

bool OAIListAssistantsResponse::is_object_Valid() const{
    return m_object_isValid;
}

QList<OAIAssistantObject> OAIListAssistantsResponse::getData() const {
    return m_data;
}
void OAIListAssistantsResponse::setData(const QList<OAIAssistantObject> &data) {
    m_data = data;
    m_data_isSet = true;
}

bool OAIListAssistantsResponse::is_data_Set() const{
    return m_data_isSet;
}

bool OAIListAssistantsResponse::is_data_Valid() const{
    return m_data_isValid;
}

QString OAIListAssistantsResponse::getFirstId() const {
    return m_first_id;
}
void OAIListAssistantsResponse::setFirstId(const QString &first_id) {
    m_first_id = first_id;
    m_first_id_isSet = true;
}

bool OAIListAssistantsResponse::is_first_id_Set() const{
    return m_first_id_isSet;
}

bool OAIListAssistantsResponse::is_first_id_Valid() const{
    return m_first_id_isValid;
}

QString OAIListAssistantsResponse::getLastId() const {
    return m_last_id;
}
void OAIListAssistantsResponse::setLastId(const QString &last_id) {
    m_last_id = last_id;
    m_last_id_isSet = true;
}

bool OAIListAssistantsResponse::is_last_id_Set() const{
    return m_last_id_isSet;
}

bool OAIListAssistantsResponse::is_last_id_Valid() const{
    return m_last_id_isValid;
}

bool OAIListAssistantsResponse::isHasMore() const {
    return m_has_more;
}
void OAIListAssistantsResponse::setHasMore(const bool &has_more) {
    m_has_more = has_more;
    m_has_more_isSet = true;
}

bool OAIListAssistantsResponse::is_has_more_Set() const{
    return m_has_more_isSet;
}

bool OAIListAssistantsResponse::is_has_more_Valid() const{
    return m_has_more_isValid;
}

bool OAIListAssistantsResponse::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_object_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_data.size() > 0) {
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

bool OAIListAssistantsResponse::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_object_isValid && m_data_isValid && m_first_id_isValid && m_last_id_isValid && m_has_more_isValid && true;
}

} // namespace OpenAPI
