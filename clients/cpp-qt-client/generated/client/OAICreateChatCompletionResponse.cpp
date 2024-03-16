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

#include "OAICreateChatCompletionResponse.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICreateChatCompletionResponse::OAICreateChatCompletionResponse(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICreateChatCompletionResponse::OAICreateChatCompletionResponse() {
    this->initializeModel();
}

OAICreateChatCompletionResponse::~OAICreateChatCompletionResponse() {}

void OAICreateChatCompletionResponse::initializeModel() {

    m_id_isSet = false;
    m_id_isValid = false;

    m_object_isSet = false;
    m_object_isValid = false;

    m_created_isSet = false;
    m_created_isValid = false;

    m_model_isSet = false;
    m_model_isValid = false;

    m_choices_isSet = false;
    m_choices_isValid = false;

    m_usage_isSet = false;
    m_usage_isValid = false;
}

void OAICreateChatCompletionResponse::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAICreateChatCompletionResponse::fromJsonObject(QJsonObject json) {

    m_id_isValid = ::OpenAPI::fromJsonValue(m_id, json[QString("id")]);
    m_id_isSet = !json[QString("id")].isNull() && m_id_isValid;

    m_object_isValid = ::OpenAPI::fromJsonValue(m_object, json[QString("object")]);
    m_object_isSet = !json[QString("object")].isNull() && m_object_isValid;

    m_created_isValid = ::OpenAPI::fromJsonValue(m_created, json[QString("created")]);
    m_created_isSet = !json[QString("created")].isNull() && m_created_isValid;

    m_model_isValid = ::OpenAPI::fromJsonValue(m_model, json[QString("model")]);
    m_model_isSet = !json[QString("model")].isNull() && m_model_isValid;

    m_choices_isValid = ::OpenAPI::fromJsonValue(m_choices, json[QString("choices")]);
    m_choices_isSet = !json[QString("choices")].isNull() && m_choices_isValid;

    m_usage_isValid = ::OpenAPI::fromJsonValue(m_usage, json[QString("usage")]);
    m_usage_isSet = !json[QString("usage")].isNull() && m_usage_isValid;
}

QString OAICreateChatCompletionResponse::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAICreateChatCompletionResponse::asJsonObject() const {
    QJsonObject obj;
    if (m_id_isSet) {
        obj.insert(QString("id"), ::OpenAPI::toJsonValue(m_id));
    }
    if (m_object_isSet) {
        obj.insert(QString("object"), ::OpenAPI::toJsonValue(m_object));
    }
    if (m_created_isSet) {
        obj.insert(QString("created"), ::OpenAPI::toJsonValue(m_created));
    }
    if (m_model_isSet) {
        obj.insert(QString("model"), ::OpenAPI::toJsonValue(m_model));
    }
    if (m_choices.size() > 0) {
        obj.insert(QString("choices"), ::OpenAPI::toJsonValue(m_choices));
    }
    if (m_usage.isSet()) {
        obj.insert(QString("usage"), ::OpenAPI::toJsonValue(m_usage));
    }
    return obj;
}

QString OAICreateChatCompletionResponse::getId() const {
    return m_id;
}
void OAICreateChatCompletionResponse::setId(const QString &id) {
    m_id = id;
    m_id_isSet = true;
}

bool OAICreateChatCompletionResponse::is_id_Set() const{
    return m_id_isSet;
}

bool OAICreateChatCompletionResponse::is_id_Valid() const{
    return m_id_isValid;
}

QString OAICreateChatCompletionResponse::getObject() const {
    return m_object;
}
void OAICreateChatCompletionResponse::setObject(const QString &object) {
    m_object = object;
    m_object_isSet = true;
}

bool OAICreateChatCompletionResponse::is_object_Set() const{
    return m_object_isSet;
}

bool OAICreateChatCompletionResponse::is_object_Valid() const{
    return m_object_isValid;
}

qint32 OAICreateChatCompletionResponse::getCreated() const {
    return m_created;
}
void OAICreateChatCompletionResponse::setCreated(const qint32 &created) {
    m_created = created;
    m_created_isSet = true;
}

bool OAICreateChatCompletionResponse::is_created_Set() const{
    return m_created_isSet;
}

bool OAICreateChatCompletionResponse::is_created_Valid() const{
    return m_created_isValid;
}

QString OAICreateChatCompletionResponse::getModel() const {
    return m_model;
}
void OAICreateChatCompletionResponse::setModel(const QString &model) {
    m_model = model;
    m_model_isSet = true;
}

bool OAICreateChatCompletionResponse::is_model_Set() const{
    return m_model_isSet;
}

bool OAICreateChatCompletionResponse::is_model_Valid() const{
    return m_model_isValid;
}

QList<OAICreateChatCompletionResponse_choices_inner> OAICreateChatCompletionResponse::getChoices() const {
    return m_choices;
}
void OAICreateChatCompletionResponse::setChoices(const QList<OAICreateChatCompletionResponse_choices_inner> &choices) {
    m_choices = choices;
    m_choices_isSet = true;
}

bool OAICreateChatCompletionResponse::is_choices_Set() const{
    return m_choices_isSet;
}

bool OAICreateChatCompletionResponse::is_choices_Valid() const{
    return m_choices_isValid;
}

OAICreateCompletionResponse_usage OAICreateChatCompletionResponse::getUsage() const {
    return m_usage;
}
void OAICreateChatCompletionResponse::setUsage(const OAICreateCompletionResponse_usage &usage) {
    m_usage = usage;
    m_usage_isSet = true;
}

bool OAICreateChatCompletionResponse::is_usage_Set() const{
    return m_usage_isSet;
}

bool OAICreateChatCompletionResponse::is_usage_Valid() const{
    return m_usage_isValid;
}

bool OAICreateChatCompletionResponse::isSet() const {
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

        if (m_model_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_choices.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_usage.isSet()) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAICreateChatCompletionResponse::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_id_isValid && m_object_isValid && m_created_isValid && m_model_isValid && m_choices_isValid && true;
}

} // namespace OpenAPI
