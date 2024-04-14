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

#include "OAICreateCompletionResponse_choices_inner_logprobs.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICreateCompletionResponse_choices_inner_logprobs::OAICreateCompletionResponse_choices_inner_logprobs(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICreateCompletionResponse_choices_inner_logprobs::OAICreateCompletionResponse_choices_inner_logprobs() {
    this->initializeModel();
}

OAICreateCompletionResponse_choices_inner_logprobs::~OAICreateCompletionResponse_choices_inner_logprobs() {}

void OAICreateCompletionResponse_choices_inner_logprobs::initializeModel() {

    m_tokens_isSet = false;
    m_tokens_isValid = false;

    m_token_logprobs_isSet = false;
    m_token_logprobs_isValid = false;

    m_top_logprobs_isSet = false;
    m_top_logprobs_isValid = false;

    m_text_offset_isSet = false;
    m_text_offset_isValid = false;
}

void OAICreateCompletionResponse_choices_inner_logprobs::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAICreateCompletionResponse_choices_inner_logprobs::fromJsonObject(QJsonObject json) {

    m_tokens_isValid = ::OpenAPI::fromJsonValue(tokens, json[QString("tokens")]);
    m_tokens_isSet = !json[QString("tokens")].isNull() && m_tokens_isValid;

    m_token_logprobs_isValid = ::OpenAPI::fromJsonValue(token_logprobs, json[QString("token_logprobs")]);
    m_token_logprobs_isSet = !json[QString("token_logprobs")].isNull() && m_token_logprobs_isValid;

    m_top_logprobs_isValid = ::OpenAPI::fromJsonValue(top_logprobs, json[QString("top_logprobs")]);
    m_top_logprobs_isSet = !json[QString("top_logprobs")].isNull() && m_top_logprobs_isValid;

    m_text_offset_isValid = ::OpenAPI::fromJsonValue(text_offset, json[QString("text_offset")]);
    m_text_offset_isSet = !json[QString("text_offset")].isNull() && m_text_offset_isValid;
}

QString OAICreateCompletionResponse_choices_inner_logprobs::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAICreateCompletionResponse_choices_inner_logprobs::asJsonObject() const {
    QJsonObject obj;
    if (tokens.size() > 0) {
        obj.insert(QString("tokens"), ::OpenAPI::toJsonValue(tokens));
    }
    if (token_logprobs.size() > 0) {
        obj.insert(QString("token_logprobs"), ::OpenAPI::toJsonValue(token_logprobs));
    }
    if (top_logprobs.size() > 0) {
        obj.insert(QString("top_logprobs"), ::OpenAPI::toJsonValue(top_logprobs));
    }
    if (text_offset.size() > 0) {
        obj.insert(QString("text_offset"), ::OpenAPI::toJsonValue(text_offset));
    }
    return obj;
}

QList<QString> OAICreateCompletionResponse_choices_inner_logprobs::getTokens() const {
    return tokens;
}
void OAICreateCompletionResponse_choices_inner_logprobs::setTokens(const QList<QString> &tokens) {
    this->tokens = tokens;
    this->m_tokens_isSet = true;
}

bool OAICreateCompletionResponse_choices_inner_logprobs::is_tokens_Set() const{
    return m_tokens_isSet;
}

bool OAICreateCompletionResponse_choices_inner_logprobs::is_tokens_Valid() const{
    return m_tokens_isValid;
}

QList<double> OAICreateCompletionResponse_choices_inner_logprobs::getTokenLogprobs() const {
    return token_logprobs;
}
void OAICreateCompletionResponse_choices_inner_logprobs::setTokenLogprobs(const QList<double> &token_logprobs) {
    this->token_logprobs = token_logprobs;
    this->m_token_logprobs_isSet = true;
}

bool OAICreateCompletionResponse_choices_inner_logprobs::is_token_logprobs_Set() const{
    return m_token_logprobs_isSet;
}

bool OAICreateCompletionResponse_choices_inner_logprobs::is_token_logprobs_Valid() const{
    return m_token_logprobs_isValid;
}

QList<OAIObject> OAICreateCompletionResponse_choices_inner_logprobs::getTopLogprobs() const {
    return top_logprobs;
}
void OAICreateCompletionResponse_choices_inner_logprobs::setTopLogprobs(const QList<OAIObject> &top_logprobs) {
    this->top_logprobs = top_logprobs;
    this->m_top_logprobs_isSet = true;
}

bool OAICreateCompletionResponse_choices_inner_logprobs::is_top_logprobs_Set() const{
    return m_top_logprobs_isSet;
}

bool OAICreateCompletionResponse_choices_inner_logprobs::is_top_logprobs_Valid() const{
    return m_top_logprobs_isValid;
}

QList<qint32> OAICreateCompletionResponse_choices_inner_logprobs::getTextOffset() const {
    return text_offset;
}
void OAICreateCompletionResponse_choices_inner_logprobs::setTextOffset(const QList<qint32> &text_offset) {
    this->text_offset = text_offset;
    this->m_text_offset_isSet = true;
}

bool OAICreateCompletionResponse_choices_inner_logprobs::is_text_offset_Set() const{
    return m_text_offset_isSet;
}

bool OAICreateCompletionResponse_choices_inner_logprobs::is_text_offset_Valid() const{
    return m_text_offset_isValid;
}

bool OAICreateCompletionResponse_choices_inner_logprobs::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (tokens.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (token_logprobs.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (top_logprobs.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (text_offset.size() > 0) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAICreateCompletionResponse_choices_inner_logprobs::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI