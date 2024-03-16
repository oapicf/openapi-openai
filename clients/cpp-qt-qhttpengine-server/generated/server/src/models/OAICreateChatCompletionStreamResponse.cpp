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

#include "OAICreateChatCompletionStreamResponse.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICreateChatCompletionStreamResponse::OAICreateChatCompletionStreamResponse(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICreateChatCompletionStreamResponse::OAICreateChatCompletionStreamResponse() {
    this->initializeModel();
}

OAICreateChatCompletionStreamResponse::~OAICreateChatCompletionStreamResponse() {}

void OAICreateChatCompletionStreamResponse::initializeModel() {

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
}

void OAICreateChatCompletionStreamResponse::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAICreateChatCompletionStreamResponse::fromJsonObject(QJsonObject json) {

    m_id_isValid = ::OpenAPI::fromJsonValue(id, json[QString("id")]);
    m_id_isSet = !json[QString("id")].isNull() && m_id_isValid;

    m_object_isValid = ::OpenAPI::fromJsonValue(object, json[QString("object")]);
    m_object_isSet = !json[QString("object")].isNull() && m_object_isValid;

    m_created_isValid = ::OpenAPI::fromJsonValue(created, json[QString("created")]);
    m_created_isSet = !json[QString("created")].isNull() && m_created_isValid;

    m_model_isValid = ::OpenAPI::fromJsonValue(model, json[QString("model")]);
    m_model_isSet = !json[QString("model")].isNull() && m_model_isValid;

    m_choices_isValid = ::OpenAPI::fromJsonValue(choices, json[QString("choices")]);
    m_choices_isSet = !json[QString("choices")].isNull() && m_choices_isValid;
}

QString OAICreateChatCompletionStreamResponse::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAICreateChatCompletionStreamResponse::asJsonObject() const {
    QJsonObject obj;
    if (m_id_isSet) {
        obj.insert(QString("id"), ::OpenAPI::toJsonValue(id));
    }
    if (m_object_isSet) {
        obj.insert(QString("object"), ::OpenAPI::toJsonValue(object));
    }
    if (m_created_isSet) {
        obj.insert(QString("created"), ::OpenAPI::toJsonValue(created));
    }
    if (m_model_isSet) {
        obj.insert(QString("model"), ::OpenAPI::toJsonValue(model));
    }
    if (choices.size() > 0) {
        obj.insert(QString("choices"), ::OpenAPI::toJsonValue(choices));
    }
    return obj;
}

QString OAICreateChatCompletionStreamResponse::getId() const {
    return id;
}
void OAICreateChatCompletionStreamResponse::setId(const QString &id) {
    this->id = id;
    this->m_id_isSet = true;
}

bool OAICreateChatCompletionStreamResponse::is_id_Set() const{
    return m_id_isSet;
}

bool OAICreateChatCompletionStreamResponse::is_id_Valid() const{
    return m_id_isValid;
}

QString OAICreateChatCompletionStreamResponse::getObject() const {
    return object;
}
void OAICreateChatCompletionStreamResponse::setObject(const QString &object) {
    this->object = object;
    this->m_object_isSet = true;
}

bool OAICreateChatCompletionStreamResponse::is_object_Set() const{
    return m_object_isSet;
}

bool OAICreateChatCompletionStreamResponse::is_object_Valid() const{
    return m_object_isValid;
}

qint32 OAICreateChatCompletionStreamResponse::getCreated() const {
    return created;
}
void OAICreateChatCompletionStreamResponse::setCreated(const qint32 &created) {
    this->created = created;
    this->m_created_isSet = true;
}

bool OAICreateChatCompletionStreamResponse::is_created_Set() const{
    return m_created_isSet;
}

bool OAICreateChatCompletionStreamResponse::is_created_Valid() const{
    return m_created_isValid;
}

QString OAICreateChatCompletionStreamResponse::getModel() const {
    return model;
}
void OAICreateChatCompletionStreamResponse::setModel(const QString &model) {
    this->model = model;
    this->m_model_isSet = true;
}

bool OAICreateChatCompletionStreamResponse::is_model_Set() const{
    return m_model_isSet;
}

bool OAICreateChatCompletionStreamResponse::is_model_Valid() const{
    return m_model_isValid;
}

QList<OAICreateChatCompletionStreamResponse_choices_inner> OAICreateChatCompletionStreamResponse::getChoices() const {
    return choices;
}
void OAICreateChatCompletionStreamResponse::setChoices(const QList<OAICreateChatCompletionStreamResponse_choices_inner> &choices) {
    this->choices = choices;
    this->m_choices_isSet = true;
}

bool OAICreateChatCompletionStreamResponse::is_choices_Set() const{
    return m_choices_isSet;
}

bool OAICreateChatCompletionStreamResponse::is_choices_Valid() const{
    return m_choices_isValid;
}

bool OAICreateChatCompletionStreamResponse::isSet() const {
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

        if (choices.size() > 0) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAICreateChatCompletionStreamResponse::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_id_isValid && m_object_isValid && m_created_isValid && m_model_isValid && m_choices_isValid && true;
}

} // namespace OpenAPI
