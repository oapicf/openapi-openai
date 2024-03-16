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

#include "OAIListFilesResponse.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIListFilesResponse::OAIListFilesResponse(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIListFilesResponse::OAIListFilesResponse() {
    this->initializeModel();
}

OAIListFilesResponse::~OAIListFilesResponse() {}

void OAIListFilesResponse::initializeModel() {

    m_object_isSet = false;
    m_object_isValid = false;

    m_data_isSet = false;
    m_data_isValid = false;
}

void OAIListFilesResponse::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIListFilesResponse::fromJsonObject(QJsonObject json) {

    m_object_isValid = ::OpenAPI::fromJsonValue(m_object, json[QString("object")]);
    m_object_isSet = !json[QString("object")].isNull() && m_object_isValid;

    m_data_isValid = ::OpenAPI::fromJsonValue(m_data, json[QString("data")]);
    m_data_isSet = !json[QString("data")].isNull() && m_data_isValid;
}

QString OAIListFilesResponse::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIListFilesResponse::asJsonObject() const {
    QJsonObject obj;
    if (m_object_isSet) {
        obj.insert(QString("object"), ::OpenAPI::toJsonValue(m_object));
    }
    if (m_data.size() > 0) {
        obj.insert(QString("data"), ::OpenAPI::toJsonValue(m_data));
    }
    return obj;
}

QString OAIListFilesResponse::getObject() const {
    return m_object;
}
void OAIListFilesResponse::setObject(const QString &object) {
    m_object = object;
    m_object_isSet = true;
}

bool OAIListFilesResponse::is_object_Set() const{
    return m_object_isSet;
}

bool OAIListFilesResponse::is_object_Valid() const{
    return m_object_isValid;
}

QList<OAIOpenAIFile> OAIListFilesResponse::getData() const {
    return m_data;
}
void OAIListFilesResponse::setData(const QList<OAIOpenAIFile> &data) {
    m_data = data;
    m_data_isSet = true;
}

bool OAIListFilesResponse::is_data_Set() const{
    return m_data_isSet;
}

bool OAIListFilesResponse::is_data_Valid() const{
    return m_data_isValid;
}

bool OAIListFilesResponse::isSet() const {
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
    } while (false);
    return isObjectUpdated;
}

bool OAIListFilesResponse::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_object_isValid && m_data_isValid && true;
}

} // namespace OpenAPI
