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

#include "OAICreateChatCompletionStreamResponse_choices_inner.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICreateChatCompletionStreamResponse_choices_inner::OAICreateChatCompletionStreamResponse_choices_inner(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICreateChatCompletionStreamResponse_choices_inner::OAICreateChatCompletionStreamResponse_choices_inner() {
    this->initializeModel();
}

OAICreateChatCompletionStreamResponse_choices_inner::~OAICreateChatCompletionStreamResponse_choices_inner() {}

void OAICreateChatCompletionStreamResponse_choices_inner::initializeModel() {

    m_delta_isSet = false;
    m_delta_isValid = false;

    m_logprobs_isSet = false;
    m_logprobs_isValid = false;

    m_finish_reason_isSet = false;
    m_finish_reason_isValid = false;

    m_index_isSet = false;
    m_index_isValid = false;
}

void OAICreateChatCompletionStreamResponse_choices_inner::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAICreateChatCompletionStreamResponse_choices_inner::fromJsonObject(QJsonObject json) {

    m_delta_isValid = ::OpenAPI::fromJsonValue(m_delta, json[QString("delta")]);
    m_delta_isSet = !json[QString("delta")].isNull() && m_delta_isValid;

    m_logprobs_isValid = ::OpenAPI::fromJsonValue(m_logprobs, json[QString("logprobs")]);
    m_logprobs_isSet = !json[QString("logprobs")].isNull() && m_logprobs_isValid;

    m_finish_reason_isValid = ::OpenAPI::fromJsonValue(m_finish_reason, json[QString("finish_reason")]);
    m_finish_reason_isSet = !json[QString("finish_reason")].isNull() && m_finish_reason_isValid;

    m_index_isValid = ::OpenAPI::fromJsonValue(m_index, json[QString("index")]);
    m_index_isSet = !json[QString("index")].isNull() && m_index_isValid;
}

QString OAICreateChatCompletionStreamResponse_choices_inner::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAICreateChatCompletionStreamResponse_choices_inner::asJsonObject() const {
    QJsonObject obj;
    if (m_delta.isSet()) {
        obj.insert(QString("delta"), ::OpenAPI::toJsonValue(m_delta));
    }
    if (m_logprobs.isSet()) {
        obj.insert(QString("logprobs"), ::OpenAPI::toJsonValue(m_logprobs));
    }
    if (m_finish_reason_isSet) {
        obj.insert(QString("finish_reason"), ::OpenAPI::toJsonValue(m_finish_reason));
    }
    if (m_index_isSet) {
        obj.insert(QString("index"), ::OpenAPI::toJsonValue(m_index));
    }
    return obj;
}

OAIChatCompletionStreamResponseDelta OAICreateChatCompletionStreamResponse_choices_inner::getDelta() const {
    return m_delta;
}
void OAICreateChatCompletionStreamResponse_choices_inner::setDelta(const OAIChatCompletionStreamResponseDelta &delta) {
    m_delta = delta;
    m_delta_isSet = true;
}

bool OAICreateChatCompletionStreamResponse_choices_inner::is_delta_Set() const{
    return m_delta_isSet;
}

bool OAICreateChatCompletionStreamResponse_choices_inner::is_delta_Valid() const{
    return m_delta_isValid;
}

OAICreateChatCompletionResponse_choices_inner_logprobs OAICreateChatCompletionStreamResponse_choices_inner::getLogprobs() const {
    return m_logprobs;
}
void OAICreateChatCompletionStreamResponse_choices_inner::setLogprobs(const OAICreateChatCompletionResponse_choices_inner_logprobs &logprobs) {
    m_logprobs = logprobs;
    m_logprobs_isSet = true;
}

bool OAICreateChatCompletionStreamResponse_choices_inner::is_logprobs_Set() const{
    return m_logprobs_isSet;
}

bool OAICreateChatCompletionStreamResponse_choices_inner::is_logprobs_Valid() const{
    return m_logprobs_isValid;
}

QString OAICreateChatCompletionStreamResponse_choices_inner::getFinishReason() const {
    return m_finish_reason;
}
void OAICreateChatCompletionStreamResponse_choices_inner::setFinishReason(const QString &finish_reason) {
    m_finish_reason = finish_reason;
    m_finish_reason_isSet = true;
}

bool OAICreateChatCompletionStreamResponse_choices_inner::is_finish_reason_Set() const{
    return m_finish_reason_isSet;
}

bool OAICreateChatCompletionStreamResponse_choices_inner::is_finish_reason_Valid() const{
    return m_finish_reason_isValid;
}

qint32 OAICreateChatCompletionStreamResponse_choices_inner::getIndex() const {
    return m_index;
}
void OAICreateChatCompletionStreamResponse_choices_inner::setIndex(const qint32 &index) {
    m_index = index;
    m_index_isSet = true;
}

bool OAICreateChatCompletionStreamResponse_choices_inner::is_index_Set() const{
    return m_index_isSet;
}

bool OAICreateChatCompletionStreamResponse_choices_inner::is_index_Valid() const{
    return m_index_isValid;
}

bool OAICreateChatCompletionStreamResponse_choices_inner::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_delta.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_logprobs.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_finish_reason_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_index_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAICreateChatCompletionStreamResponse_choices_inner::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_delta_isValid && m_finish_reason_isValid && m_index_isValid && true;
}

} // namespace OpenAPI