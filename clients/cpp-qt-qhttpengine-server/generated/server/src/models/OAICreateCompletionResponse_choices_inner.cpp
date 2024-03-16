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

#include "OAICreateCompletionResponse_choices_inner.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICreateCompletionResponse_choices_inner::OAICreateCompletionResponse_choices_inner(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICreateCompletionResponse_choices_inner::OAICreateCompletionResponse_choices_inner() {
    this->initializeModel();
}

OAICreateCompletionResponse_choices_inner::~OAICreateCompletionResponse_choices_inner() {}

void OAICreateCompletionResponse_choices_inner::initializeModel() {

    m_text_isSet = false;
    m_text_isValid = false;

    m_index_isSet = false;
    m_index_isValid = false;

    m_logprobs_isSet = false;
    m_logprobs_isValid = false;

    m_finish_reason_isSet = false;
    m_finish_reason_isValid = false;
}

void OAICreateCompletionResponse_choices_inner::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAICreateCompletionResponse_choices_inner::fromJsonObject(QJsonObject json) {

    m_text_isValid = ::OpenAPI::fromJsonValue(text, json[QString("text")]);
    m_text_isSet = !json[QString("text")].isNull() && m_text_isValid;

    m_index_isValid = ::OpenAPI::fromJsonValue(index, json[QString("index")]);
    m_index_isSet = !json[QString("index")].isNull() && m_index_isValid;

    m_logprobs_isValid = ::OpenAPI::fromJsonValue(logprobs, json[QString("logprobs")]);
    m_logprobs_isSet = !json[QString("logprobs")].isNull() && m_logprobs_isValid;

    m_finish_reason_isValid = ::OpenAPI::fromJsonValue(finish_reason, json[QString("finish_reason")]);
    m_finish_reason_isSet = !json[QString("finish_reason")].isNull() && m_finish_reason_isValid;
}

QString OAICreateCompletionResponse_choices_inner::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAICreateCompletionResponse_choices_inner::asJsonObject() const {
    QJsonObject obj;
    if (m_text_isSet) {
        obj.insert(QString("text"), ::OpenAPI::toJsonValue(text));
    }
    if (m_index_isSet) {
        obj.insert(QString("index"), ::OpenAPI::toJsonValue(index));
    }
    if (logprobs.isSet()) {
        obj.insert(QString("logprobs"), ::OpenAPI::toJsonValue(logprobs));
    }
    if (m_finish_reason_isSet) {
        obj.insert(QString("finish_reason"), ::OpenAPI::toJsonValue(finish_reason));
    }
    return obj;
}

QString OAICreateCompletionResponse_choices_inner::getText() const {
    return text;
}
void OAICreateCompletionResponse_choices_inner::setText(const QString &text) {
    this->text = text;
    this->m_text_isSet = true;
}

bool OAICreateCompletionResponse_choices_inner::is_text_Set() const{
    return m_text_isSet;
}

bool OAICreateCompletionResponse_choices_inner::is_text_Valid() const{
    return m_text_isValid;
}

qint32 OAICreateCompletionResponse_choices_inner::getIndex() const {
    return index;
}
void OAICreateCompletionResponse_choices_inner::setIndex(const qint32 &index) {
    this->index = index;
    this->m_index_isSet = true;
}

bool OAICreateCompletionResponse_choices_inner::is_index_Set() const{
    return m_index_isSet;
}

bool OAICreateCompletionResponse_choices_inner::is_index_Valid() const{
    return m_index_isValid;
}

OAICreateCompletionResponse_choices_inner_logprobs OAICreateCompletionResponse_choices_inner::getLogprobs() const {
    return logprobs;
}
void OAICreateCompletionResponse_choices_inner::setLogprobs(const OAICreateCompletionResponse_choices_inner_logprobs &logprobs) {
    this->logprobs = logprobs;
    this->m_logprobs_isSet = true;
}

bool OAICreateCompletionResponse_choices_inner::is_logprobs_Set() const{
    return m_logprobs_isSet;
}

bool OAICreateCompletionResponse_choices_inner::is_logprobs_Valid() const{
    return m_logprobs_isValid;
}

QString OAICreateCompletionResponse_choices_inner::getFinishReason() const {
    return finish_reason;
}
void OAICreateCompletionResponse_choices_inner::setFinishReason(const QString &finish_reason) {
    this->finish_reason = finish_reason;
    this->m_finish_reason_isSet = true;
}

bool OAICreateCompletionResponse_choices_inner::is_finish_reason_Set() const{
    return m_finish_reason_isSet;
}

bool OAICreateCompletionResponse_choices_inner::is_finish_reason_Valid() const{
    return m_finish_reason_isValid;
}

bool OAICreateCompletionResponse_choices_inner::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_text_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_index_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (logprobs.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_finish_reason_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAICreateCompletionResponse_choices_inner::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_text_isValid && m_index_isValid && m_logprobs_isValid && m_finish_reason_isValid && true;
}

} // namespace OpenAPI
