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

#include "OAICreateChatCompletionFunctionResponse_choices_inner.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICreateChatCompletionFunctionResponse_choices_inner::OAICreateChatCompletionFunctionResponse_choices_inner(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICreateChatCompletionFunctionResponse_choices_inner::OAICreateChatCompletionFunctionResponse_choices_inner() {
    this->initializeModel();
}

OAICreateChatCompletionFunctionResponse_choices_inner::~OAICreateChatCompletionFunctionResponse_choices_inner() {}

void OAICreateChatCompletionFunctionResponse_choices_inner::initializeModel() {

    m_finish_reason_isSet = false;
    m_finish_reason_isValid = false;

    m_index_isSet = false;
    m_index_isValid = false;

    m_message_isSet = false;
    m_message_isValid = false;
}

void OAICreateChatCompletionFunctionResponse_choices_inner::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAICreateChatCompletionFunctionResponse_choices_inner::fromJsonObject(QJsonObject json) {

    m_finish_reason_isValid = ::OpenAPI::fromJsonValue(m_finish_reason, json[QString("finish_reason")]);
    m_finish_reason_isSet = !json[QString("finish_reason")].isNull() && m_finish_reason_isValid;

    m_index_isValid = ::OpenAPI::fromJsonValue(m_index, json[QString("index")]);
    m_index_isSet = !json[QString("index")].isNull() && m_index_isValid;

    m_message_isValid = ::OpenAPI::fromJsonValue(m_message, json[QString("message")]);
    m_message_isSet = !json[QString("message")].isNull() && m_message_isValid;
}

QString OAICreateChatCompletionFunctionResponse_choices_inner::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAICreateChatCompletionFunctionResponse_choices_inner::asJsonObject() const {
    QJsonObject obj;
    if (m_finish_reason_isSet) {
        obj.insert(QString("finish_reason"), ::OpenAPI::toJsonValue(m_finish_reason));
    }
    if (m_index_isSet) {
        obj.insert(QString("index"), ::OpenAPI::toJsonValue(m_index));
    }
    if (m_message.isSet()) {
        obj.insert(QString("message"), ::OpenAPI::toJsonValue(m_message));
    }
    return obj;
}

QString OAICreateChatCompletionFunctionResponse_choices_inner::getFinishReason() const {
    return m_finish_reason;
}
void OAICreateChatCompletionFunctionResponse_choices_inner::setFinishReason(const QString &finish_reason) {
    m_finish_reason = finish_reason;
    m_finish_reason_isSet = true;
}

bool OAICreateChatCompletionFunctionResponse_choices_inner::is_finish_reason_Set() const{
    return m_finish_reason_isSet;
}

bool OAICreateChatCompletionFunctionResponse_choices_inner::is_finish_reason_Valid() const{
    return m_finish_reason_isValid;
}

qint32 OAICreateChatCompletionFunctionResponse_choices_inner::getIndex() const {
    return m_index;
}
void OAICreateChatCompletionFunctionResponse_choices_inner::setIndex(const qint32 &index) {
    m_index = index;
    m_index_isSet = true;
}

bool OAICreateChatCompletionFunctionResponse_choices_inner::is_index_Set() const{
    return m_index_isSet;
}

bool OAICreateChatCompletionFunctionResponse_choices_inner::is_index_Valid() const{
    return m_index_isValid;
}

OAIChatCompletionResponseMessage OAICreateChatCompletionFunctionResponse_choices_inner::getMessage() const {
    return m_message;
}
void OAICreateChatCompletionFunctionResponse_choices_inner::setMessage(const OAIChatCompletionResponseMessage &message) {
    m_message = message;
    m_message_isSet = true;
}

bool OAICreateChatCompletionFunctionResponse_choices_inner::is_message_Set() const{
    return m_message_isSet;
}

bool OAICreateChatCompletionFunctionResponse_choices_inner::is_message_Valid() const{
    return m_message_isValid;
}

bool OAICreateChatCompletionFunctionResponse_choices_inner::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_finish_reason_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_index_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_message.isSet()) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAICreateChatCompletionFunctionResponse_choices_inner::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_finish_reason_isValid && m_index_isValid && m_message_isValid && true;
}

} // namespace OpenAPI