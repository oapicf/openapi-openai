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

#include "OAICreateEmbeddingResponse.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICreateEmbeddingResponse::OAICreateEmbeddingResponse(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICreateEmbeddingResponse::OAICreateEmbeddingResponse() {
    this->initializeModel();
}

OAICreateEmbeddingResponse::~OAICreateEmbeddingResponse() {}

void OAICreateEmbeddingResponse::initializeModel() {

    m_data_isSet = false;
    m_data_isValid = false;

    m_model_isSet = false;
    m_model_isValid = false;

    m_object_isSet = false;
    m_object_isValid = false;

    m_usage_isSet = false;
    m_usage_isValid = false;
}

void OAICreateEmbeddingResponse::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAICreateEmbeddingResponse::fromJsonObject(QJsonObject json) {

    m_data_isValid = ::OpenAPI::fromJsonValue(data, json[QString("data")]);
    m_data_isSet = !json[QString("data")].isNull() && m_data_isValid;

    m_model_isValid = ::OpenAPI::fromJsonValue(model, json[QString("model")]);
    m_model_isSet = !json[QString("model")].isNull() && m_model_isValid;

    m_object_isValid = ::OpenAPI::fromJsonValue(object, json[QString("object")]);
    m_object_isSet = !json[QString("object")].isNull() && m_object_isValid;

    m_usage_isValid = ::OpenAPI::fromJsonValue(usage, json[QString("usage")]);
    m_usage_isSet = !json[QString("usage")].isNull() && m_usage_isValid;
}

QString OAICreateEmbeddingResponse::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAICreateEmbeddingResponse::asJsonObject() const {
    QJsonObject obj;
    if (data.size() > 0) {
        obj.insert(QString("data"), ::OpenAPI::toJsonValue(data));
    }
    if (m_model_isSet) {
        obj.insert(QString("model"), ::OpenAPI::toJsonValue(model));
    }
    if (m_object_isSet) {
        obj.insert(QString("object"), ::OpenAPI::toJsonValue(object));
    }
    if (usage.isSet()) {
        obj.insert(QString("usage"), ::OpenAPI::toJsonValue(usage));
    }
    return obj;
}

QList<OAIEmbedding> OAICreateEmbeddingResponse::getData() const {
    return data;
}
void OAICreateEmbeddingResponse::setData(const QList<OAIEmbedding> &data) {
    this->data = data;
    this->m_data_isSet = true;
}

bool OAICreateEmbeddingResponse::is_data_Set() const{
    return m_data_isSet;
}

bool OAICreateEmbeddingResponse::is_data_Valid() const{
    return m_data_isValid;
}

QString OAICreateEmbeddingResponse::getModel() const {
    return model;
}
void OAICreateEmbeddingResponse::setModel(const QString &model) {
    this->model = model;
    this->m_model_isSet = true;
}

bool OAICreateEmbeddingResponse::is_model_Set() const{
    return m_model_isSet;
}

bool OAICreateEmbeddingResponse::is_model_Valid() const{
    return m_model_isValid;
}

QString OAICreateEmbeddingResponse::getObject() const {
    return object;
}
void OAICreateEmbeddingResponse::setObject(const QString &object) {
    this->object = object;
    this->m_object_isSet = true;
}

bool OAICreateEmbeddingResponse::is_object_Set() const{
    return m_object_isSet;
}

bool OAICreateEmbeddingResponse::is_object_Valid() const{
    return m_object_isValid;
}

OAICreateEmbeddingResponse_usage OAICreateEmbeddingResponse::getUsage() const {
    return usage;
}
void OAICreateEmbeddingResponse::setUsage(const OAICreateEmbeddingResponse_usage &usage) {
    this->usage = usage;
    this->m_usage_isSet = true;
}

bool OAICreateEmbeddingResponse::is_usage_Set() const{
    return m_usage_isSet;
}

bool OAICreateEmbeddingResponse::is_usage_Valid() const{
    return m_usage_isValid;
}

bool OAICreateEmbeddingResponse::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (data.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_model_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_object_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (usage.isSet()) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAICreateEmbeddingResponse::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_data_isValid && m_model_isValid && m_object_isValid && m_usage_isValid && true;
}

} // namespace OpenAPI
