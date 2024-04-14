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

#include "OAIListModelsResponse.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIListModelsResponse::OAIListModelsResponse(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIListModelsResponse::OAIListModelsResponse() {
    this->initializeModel();
}

OAIListModelsResponse::~OAIListModelsResponse() {}

void OAIListModelsResponse::initializeModel() {

    m_object_isSet = false;
    m_object_isValid = false;

    m_data_isSet = false;
    m_data_isValid = false;
}

void OAIListModelsResponse::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIListModelsResponse::fromJsonObject(QJsonObject json) {

    m_object_isValid = ::OpenAPI::fromJsonValue(object, json[QString("object")]);
    m_object_isSet = !json[QString("object")].isNull() && m_object_isValid;

    m_data_isValid = ::OpenAPI::fromJsonValue(data, json[QString("data")]);
    m_data_isSet = !json[QString("data")].isNull() && m_data_isValid;
}

QString OAIListModelsResponse::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIListModelsResponse::asJsonObject() const {
    QJsonObject obj;
    if (m_object_isSet) {
        obj.insert(QString("object"), ::OpenAPI::toJsonValue(object));
    }
    if (data.size() > 0) {
        obj.insert(QString("data"), ::OpenAPI::toJsonValue(data));
    }
    return obj;
}

QString OAIListModelsResponse::getObject() const {
    return object;
}
void OAIListModelsResponse::setObject(const QString &object) {
    this->object = object;
    this->m_object_isSet = true;
}

bool OAIListModelsResponse::is_object_Set() const{
    return m_object_isSet;
}

bool OAIListModelsResponse::is_object_Valid() const{
    return m_object_isValid;
}

QList<OAIModel> OAIListModelsResponse::getData() const {
    return data;
}
void OAIListModelsResponse::setData(const QList<OAIModel> &data) {
    this->data = data;
    this->m_data_isSet = true;
}

bool OAIListModelsResponse::is_data_Set() const{
    return m_data_isSet;
}

bool OAIListModelsResponse::is_data_Valid() const{
    return m_data_isValid;
}

bool OAIListModelsResponse::isSet() const {
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
    } while (false);
    return isObjectUpdated;
}

bool OAIListModelsResponse::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_object_isValid && m_data_isValid && true;
}

} // namespace OpenAPI