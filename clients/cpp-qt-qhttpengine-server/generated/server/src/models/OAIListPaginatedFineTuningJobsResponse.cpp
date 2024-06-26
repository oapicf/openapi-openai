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

#include "OAIListPaginatedFineTuningJobsResponse.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIListPaginatedFineTuningJobsResponse::OAIListPaginatedFineTuningJobsResponse(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIListPaginatedFineTuningJobsResponse::OAIListPaginatedFineTuningJobsResponse() {
    this->initializeModel();
}

OAIListPaginatedFineTuningJobsResponse::~OAIListPaginatedFineTuningJobsResponse() {}

void OAIListPaginatedFineTuningJobsResponse::initializeModel() {

    m_data_isSet = false;
    m_data_isValid = false;

    m_has_more_isSet = false;
    m_has_more_isValid = false;

    m_object_isSet = false;
    m_object_isValid = false;
}

void OAIListPaginatedFineTuningJobsResponse::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIListPaginatedFineTuningJobsResponse::fromJsonObject(QJsonObject json) {

    m_data_isValid = ::OpenAPI::fromJsonValue(data, json[QString("data")]);
    m_data_isSet = !json[QString("data")].isNull() && m_data_isValid;

    m_has_more_isValid = ::OpenAPI::fromJsonValue(has_more, json[QString("has_more")]);
    m_has_more_isSet = !json[QString("has_more")].isNull() && m_has_more_isValid;

    m_object_isValid = ::OpenAPI::fromJsonValue(object, json[QString("object")]);
    m_object_isSet = !json[QString("object")].isNull() && m_object_isValid;
}

QString OAIListPaginatedFineTuningJobsResponse::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIListPaginatedFineTuningJobsResponse::asJsonObject() const {
    QJsonObject obj;
    if (data.size() > 0) {
        obj.insert(QString("data"), ::OpenAPI::toJsonValue(data));
    }
    if (m_has_more_isSet) {
        obj.insert(QString("has_more"), ::OpenAPI::toJsonValue(has_more));
    }
    if (m_object_isSet) {
        obj.insert(QString("object"), ::OpenAPI::toJsonValue(object));
    }
    return obj;
}

QList<OAIFineTuningJob> OAIListPaginatedFineTuningJobsResponse::getData() const {
    return data;
}
void OAIListPaginatedFineTuningJobsResponse::setData(const QList<OAIFineTuningJob> &data) {
    this->data = data;
    this->m_data_isSet = true;
}

bool OAIListPaginatedFineTuningJobsResponse::is_data_Set() const{
    return m_data_isSet;
}

bool OAIListPaginatedFineTuningJobsResponse::is_data_Valid() const{
    return m_data_isValid;
}

bool OAIListPaginatedFineTuningJobsResponse::isHasMore() const {
    return has_more;
}
void OAIListPaginatedFineTuningJobsResponse::setHasMore(const bool &has_more) {
    this->has_more = has_more;
    this->m_has_more_isSet = true;
}

bool OAIListPaginatedFineTuningJobsResponse::is_has_more_Set() const{
    return m_has_more_isSet;
}

bool OAIListPaginatedFineTuningJobsResponse::is_has_more_Valid() const{
    return m_has_more_isValid;
}

QString OAIListPaginatedFineTuningJobsResponse::getObject() const {
    return object;
}
void OAIListPaginatedFineTuningJobsResponse::setObject(const QString &object) {
    this->object = object;
    this->m_object_isSet = true;
}

bool OAIListPaginatedFineTuningJobsResponse::is_object_Set() const{
    return m_object_isSet;
}

bool OAIListPaginatedFineTuningJobsResponse::is_object_Valid() const{
    return m_object_isValid;
}

bool OAIListPaginatedFineTuningJobsResponse::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (data.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_has_more_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_object_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIListPaginatedFineTuningJobsResponse::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_data_isValid && m_has_more_isValid && m_object_isValid && true;
}

} // namespace OpenAPI
