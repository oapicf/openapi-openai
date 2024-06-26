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

#include "OAICreateChatCompletionFunctionResponse.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICreateChatCompletionFunctionResponse::OAICreateChatCompletionFunctionResponse(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICreateChatCompletionFunctionResponse::OAICreateChatCompletionFunctionResponse() {
    this->initializeModel();
}

OAICreateChatCompletionFunctionResponse::~OAICreateChatCompletionFunctionResponse() {}

void OAICreateChatCompletionFunctionResponse::initializeModel() {

    m_id_isSet = false;
    m_id_isValid = false;

    m_choices_isSet = false;
    m_choices_isValid = false;

    m_created_isSet = false;
    m_created_isValid = false;

    m_model_isSet = false;
    m_model_isValid = false;

    m_system_fingerprint_isSet = false;
    m_system_fingerprint_isValid = false;

    m_object_isSet = false;
    m_object_isValid = false;

    m_usage_isSet = false;
    m_usage_isValid = false;
}

void OAICreateChatCompletionFunctionResponse::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAICreateChatCompletionFunctionResponse::fromJsonObject(QJsonObject json) {

    m_id_isValid = ::OpenAPI::fromJsonValue(m_id, json[QString("id")]);
    m_id_isSet = !json[QString("id")].isNull() && m_id_isValid;

    m_choices_isValid = ::OpenAPI::fromJsonValue(m_choices, json[QString("choices")]);
    m_choices_isSet = !json[QString("choices")].isNull() && m_choices_isValid;

    m_created_isValid = ::OpenAPI::fromJsonValue(m_created, json[QString("created")]);
    m_created_isSet = !json[QString("created")].isNull() && m_created_isValid;

    m_model_isValid = ::OpenAPI::fromJsonValue(m_model, json[QString("model")]);
    m_model_isSet = !json[QString("model")].isNull() && m_model_isValid;

    m_system_fingerprint_isValid = ::OpenAPI::fromJsonValue(m_system_fingerprint, json[QString("system_fingerprint")]);
    m_system_fingerprint_isSet = !json[QString("system_fingerprint")].isNull() && m_system_fingerprint_isValid;

    m_object_isValid = ::OpenAPI::fromJsonValue(m_object, json[QString("object")]);
    m_object_isSet = !json[QString("object")].isNull() && m_object_isValid;

    m_usage_isValid = ::OpenAPI::fromJsonValue(m_usage, json[QString("usage")]);
    m_usage_isSet = !json[QString("usage")].isNull() && m_usage_isValid;
}

QString OAICreateChatCompletionFunctionResponse::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAICreateChatCompletionFunctionResponse::asJsonObject() const {
    QJsonObject obj;
    if (m_id_isSet) {
        obj.insert(QString("id"), ::OpenAPI::toJsonValue(m_id));
    }
    if (m_choices.size() > 0) {
        obj.insert(QString("choices"), ::OpenAPI::toJsonValue(m_choices));
    }
    if (m_created_isSet) {
        obj.insert(QString("created"), ::OpenAPI::toJsonValue(m_created));
    }
    if (m_model_isSet) {
        obj.insert(QString("model"), ::OpenAPI::toJsonValue(m_model));
    }
    if (m_system_fingerprint_isSet) {
        obj.insert(QString("system_fingerprint"), ::OpenAPI::toJsonValue(m_system_fingerprint));
    }
    if (m_object_isSet) {
        obj.insert(QString("object"), ::OpenAPI::toJsonValue(m_object));
    }
    if (m_usage.isSet()) {
        obj.insert(QString("usage"), ::OpenAPI::toJsonValue(m_usage));
    }
    return obj;
}

QString OAICreateChatCompletionFunctionResponse::getId() const {
    return m_id;
}
void OAICreateChatCompletionFunctionResponse::setId(const QString &id) {
    m_id = id;
    m_id_isSet = true;
}

bool OAICreateChatCompletionFunctionResponse::is_id_Set() const{
    return m_id_isSet;
}

bool OAICreateChatCompletionFunctionResponse::is_id_Valid() const{
    return m_id_isValid;
}

QList<OAICreateChatCompletionFunctionResponse_choices_inner> OAICreateChatCompletionFunctionResponse::getChoices() const {
    return m_choices;
}
void OAICreateChatCompletionFunctionResponse::setChoices(const QList<OAICreateChatCompletionFunctionResponse_choices_inner> &choices) {
    m_choices = choices;
    m_choices_isSet = true;
}

bool OAICreateChatCompletionFunctionResponse::is_choices_Set() const{
    return m_choices_isSet;
}

bool OAICreateChatCompletionFunctionResponse::is_choices_Valid() const{
    return m_choices_isValid;
}

qint32 OAICreateChatCompletionFunctionResponse::getCreated() const {
    return m_created;
}
void OAICreateChatCompletionFunctionResponse::setCreated(const qint32 &created) {
    m_created = created;
    m_created_isSet = true;
}

bool OAICreateChatCompletionFunctionResponse::is_created_Set() const{
    return m_created_isSet;
}

bool OAICreateChatCompletionFunctionResponse::is_created_Valid() const{
    return m_created_isValid;
}

QString OAICreateChatCompletionFunctionResponse::getModel() const {
    return m_model;
}
void OAICreateChatCompletionFunctionResponse::setModel(const QString &model) {
    m_model = model;
    m_model_isSet = true;
}

bool OAICreateChatCompletionFunctionResponse::is_model_Set() const{
    return m_model_isSet;
}

bool OAICreateChatCompletionFunctionResponse::is_model_Valid() const{
    return m_model_isValid;
}

QString OAICreateChatCompletionFunctionResponse::getSystemFingerprint() const {
    return m_system_fingerprint;
}
void OAICreateChatCompletionFunctionResponse::setSystemFingerprint(const QString &system_fingerprint) {
    m_system_fingerprint = system_fingerprint;
    m_system_fingerprint_isSet = true;
}

bool OAICreateChatCompletionFunctionResponse::is_system_fingerprint_Set() const{
    return m_system_fingerprint_isSet;
}

bool OAICreateChatCompletionFunctionResponse::is_system_fingerprint_Valid() const{
    return m_system_fingerprint_isValid;
}

QString OAICreateChatCompletionFunctionResponse::getObject() const {
    return m_object;
}
void OAICreateChatCompletionFunctionResponse::setObject(const QString &object) {
    m_object = object;
    m_object_isSet = true;
}

bool OAICreateChatCompletionFunctionResponse::is_object_Set() const{
    return m_object_isSet;
}

bool OAICreateChatCompletionFunctionResponse::is_object_Valid() const{
    return m_object_isValid;
}

OAICompletionUsage OAICreateChatCompletionFunctionResponse::getUsage() const {
    return m_usage;
}
void OAICreateChatCompletionFunctionResponse::setUsage(const OAICompletionUsage &usage) {
    m_usage = usage;
    m_usage_isSet = true;
}

bool OAICreateChatCompletionFunctionResponse::is_usage_Set() const{
    return m_usage_isSet;
}

bool OAICreateChatCompletionFunctionResponse::is_usage_Valid() const{
    return m_usage_isValid;
}

bool OAICreateChatCompletionFunctionResponse::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_choices.size() > 0) {
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

        if (m_system_fingerprint_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_object_isSet) {
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

bool OAICreateChatCompletionFunctionResponse::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_id_isValid && m_choices_isValid && m_created_isValid && m_model_isValid && m_object_isValid && true;
}

} // namespace OpenAPI
