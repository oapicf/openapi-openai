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

#include "OAICreateChatCompletionResponse_choices_inner_logprobs.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICreateChatCompletionResponse_choices_inner_logprobs::OAICreateChatCompletionResponse_choices_inner_logprobs(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICreateChatCompletionResponse_choices_inner_logprobs::OAICreateChatCompletionResponse_choices_inner_logprobs() {
    this->initializeModel();
}

OAICreateChatCompletionResponse_choices_inner_logprobs::~OAICreateChatCompletionResponse_choices_inner_logprobs() {}

void OAICreateChatCompletionResponse_choices_inner_logprobs::initializeModel() {

    m_content_isSet = false;
    m_content_isValid = false;
}

void OAICreateChatCompletionResponse_choices_inner_logprobs::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAICreateChatCompletionResponse_choices_inner_logprobs::fromJsonObject(QJsonObject json) {

    m_content_isValid = ::OpenAPI::fromJsonValue(m_content, json[QString("content")]);
    m_content_isSet = !json[QString("content")].isNull() && m_content_isValid;
}

QString OAICreateChatCompletionResponse_choices_inner_logprobs::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAICreateChatCompletionResponse_choices_inner_logprobs::asJsonObject() const {
    QJsonObject obj;
    if (m_content.size() > 0) {
        obj.insert(QString("content"), ::OpenAPI::toJsonValue(m_content));
    }
    return obj;
}

QList<OAIChatCompletionTokenLogprob> OAICreateChatCompletionResponse_choices_inner_logprobs::getContent() const {
    return m_content;
}
void OAICreateChatCompletionResponse_choices_inner_logprobs::setContent(const QList<OAIChatCompletionTokenLogprob> &content) {
    m_content = content;
    m_content_isSet = true;
}

bool OAICreateChatCompletionResponse_choices_inner_logprobs::is_content_Set() const{
    return m_content_isSet;
}

bool OAICreateChatCompletionResponse_choices_inner_logprobs::is_content_Valid() const{
    return m_content_isValid;
}

bool OAICreateChatCompletionResponse_choices_inner_logprobs::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_content.size() > 0) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAICreateChatCompletionResponse_choices_inner_logprobs::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_content_isValid && true;
}

} // namespace OpenAPI
