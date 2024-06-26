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

#include "OAIImagesResponse.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIImagesResponse::OAIImagesResponse(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIImagesResponse::OAIImagesResponse() {
    this->initializeModel();
}

OAIImagesResponse::~OAIImagesResponse() {}

void OAIImagesResponse::initializeModel() {

    m_created_isSet = false;
    m_created_isValid = false;

    m_data_isSet = false;
    m_data_isValid = false;
}

void OAIImagesResponse::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIImagesResponse::fromJsonObject(QJsonObject json) {

    m_created_isValid = ::OpenAPI::fromJsonValue(created, json[QString("created")]);
    m_created_isSet = !json[QString("created")].isNull() && m_created_isValid;

    m_data_isValid = ::OpenAPI::fromJsonValue(data, json[QString("data")]);
    m_data_isSet = !json[QString("data")].isNull() && m_data_isValid;
}

QString OAIImagesResponse::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIImagesResponse::asJsonObject() const {
    QJsonObject obj;
    if (m_created_isSet) {
        obj.insert(QString("created"), ::OpenAPI::toJsonValue(created));
    }
    if (data.size() > 0) {
        obj.insert(QString("data"), ::OpenAPI::toJsonValue(data));
    }
    return obj;
}

qint32 OAIImagesResponse::getCreated() const {
    return created;
}
void OAIImagesResponse::setCreated(const qint32 &created) {
    this->created = created;
    this->m_created_isSet = true;
}

bool OAIImagesResponse::is_created_Set() const{
    return m_created_isSet;
}

bool OAIImagesResponse::is_created_Valid() const{
    return m_created_isValid;
}

QList<OAIImage> OAIImagesResponse::getData() const {
    return data;
}
void OAIImagesResponse::setData(const QList<OAIImage> &data) {
    this->data = data;
    this->m_data_isSet = true;
}

bool OAIImagesResponse::is_data_Set() const{
    return m_data_isSet;
}

bool OAIImagesResponse::is_data_Valid() const{
    return m_data_isValid;
}

bool OAIImagesResponse::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_created_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (data.size() > 0) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIImagesResponse::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_created_isValid && m_data_isValid && true;
}

} // namespace OpenAPI
