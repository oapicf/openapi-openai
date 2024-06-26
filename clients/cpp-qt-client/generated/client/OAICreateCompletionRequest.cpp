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

#include "OAICreateCompletionRequest.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICreateCompletionRequest::OAICreateCompletionRequest(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICreateCompletionRequest::OAICreateCompletionRequest() {
    this->initializeModel();
}

OAICreateCompletionRequest::~OAICreateCompletionRequest() {}

void OAICreateCompletionRequest::initializeModel() {

    m_model_isSet = false;
    m_model_isValid = false;

    m_prompt_isSet = false;
    m_prompt_isValid = false;

    m_best_of_isSet = false;
    m_best_of_isValid = false;

    m_echo_isSet = false;
    m_echo_isValid = false;

    m_frequency_penalty_isSet = false;
    m_frequency_penalty_isValid = false;

    m_logit_bias_isSet = false;
    m_logit_bias_isValid = false;

    m_logprobs_isSet = false;
    m_logprobs_isValid = false;

    m_max_tokens_isSet = false;
    m_max_tokens_isValid = false;

    m_n_isSet = false;
    m_n_isValid = false;

    m_presence_penalty_isSet = false;
    m_presence_penalty_isValid = false;

    m_seed_isSet = false;
    m_seed_isValid = false;

    m_stop_isSet = false;
    m_stop_isValid = false;

    m_stream_isSet = false;
    m_stream_isValid = false;

    m_suffix_isSet = false;
    m_suffix_isValid = false;

    m_temperature_isSet = false;
    m_temperature_isValid = false;

    m_top_p_isSet = false;
    m_top_p_isValid = false;

    m_user_isSet = false;
    m_user_isValid = false;
}

void OAICreateCompletionRequest::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAICreateCompletionRequest::fromJsonObject(QJsonObject json) {

    m_model_isValid = ::OpenAPI::fromJsonValue(m_model, json[QString("model")]);
    m_model_isSet = !json[QString("model")].isNull() && m_model_isValid;

    m_prompt_isValid = ::OpenAPI::fromJsonValue(m_prompt, json[QString("prompt")]);
    m_prompt_isSet = !json[QString("prompt")].isNull() && m_prompt_isValid;

    m_best_of_isValid = ::OpenAPI::fromJsonValue(m_best_of, json[QString("best_of")]);
    m_best_of_isSet = !json[QString("best_of")].isNull() && m_best_of_isValid;

    m_echo_isValid = ::OpenAPI::fromJsonValue(m_echo, json[QString("echo")]);
    m_echo_isSet = !json[QString("echo")].isNull() && m_echo_isValid;

    m_frequency_penalty_isValid = ::OpenAPI::fromJsonValue(m_frequency_penalty, json[QString("frequency_penalty")]);
    m_frequency_penalty_isSet = !json[QString("frequency_penalty")].isNull() && m_frequency_penalty_isValid;

    m_logit_bias_isValid = ::OpenAPI::fromJsonValue(m_logit_bias, json[QString("logit_bias")]);
    m_logit_bias_isSet = !json[QString("logit_bias")].isNull() && m_logit_bias_isValid;

    m_logprobs_isValid = ::OpenAPI::fromJsonValue(m_logprobs, json[QString("logprobs")]);
    m_logprobs_isSet = !json[QString("logprobs")].isNull() && m_logprobs_isValid;

    m_max_tokens_isValid = ::OpenAPI::fromJsonValue(m_max_tokens, json[QString("max_tokens")]);
    m_max_tokens_isSet = !json[QString("max_tokens")].isNull() && m_max_tokens_isValid;

    m_n_isValid = ::OpenAPI::fromJsonValue(m_n, json[QString("n")]);
    m_n_isSet = !json[QString("n")].isNull() && m_n_isValid;

    m_presence_penalty_isValid = ::OpenAPI::fromJsonValue(m_presence_penalty, json[QString("presence_penalty")]);
    m_presence_penalty_isSet = !json[QString("presence_penalty")].isNull() && m_presence_penalty_isValid;

    m_seed_isValid = ::OpenAPI::fromJsonValue(m_seed, json[QString("seed")]);
    m_seed_isSet = !json[QString("seed")].isNull() && m_seed_isValid;

    m_stop_isValid = ::OpenAPI::fromJsonValue(m_stop, json[QString("stop")]);
    m_stop_isSet = !json[QString("stop")].isNull() && m_stop_isValid;

    m_stream_isValid = ::OpenAPI::fromJsonValue(m_stream, json[QString("stream")]);
    m_stream_isSet = !json[QString("stream")].isNull() && m_stream_isValid;

    m_suffix_isValid = ::OpenAPI::fromJsonValue(m_suffix, json[QString("suffix")]);
    m_suffix_isSet = !json[QString("suffix")].isNull() && m_suffix_isValid;

    m_temperature_isValid = ::OpenAPI::fromJsonValue(m_temperature, json[QString("temperature")]);
    m_temperature_isSet = !json[QString("temperature")].isNull() && m_temperature_isValid;

    m_top_p_isValid = ::OpenAPI::fromJsonValue(m_top_p, json[QString("top_p")]);
    m_top_p_isSet = !json[QString("top_p")].isNull() && m_top_p_isValid;

    m_user_isValid = ::OpenAPI::fromJsonValue(m_user, json[QString("user")]);
    m_user_isSet = !json[QString("user")].isNull() && m_user_isValid;
}

QString OAICreateCompletionRequest::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAICreateCompletionRequest::asJsonObject() const {
    QJsonObject obj;
    if (m_model.isSet()) {
        obj.insert(QString("model"), ::OpenAPI::toJsonValue(m_model));
    }
    if (m_prompt.isSet()) {
        obj.insert(QString("prompt"), ::OpenAPI::toJsonValue(m_prompt));
    }
    if (m_best_of_isSet) {
        obj.insert(QString("best_of"), ::OpenAPI::toJsonValue(m_best_of));
    }
    if (m_echo_isSet) {
        obj.insert(QString("echo"), ::OpenAPI::toJsonValue(m_echo));
    }
    if (m_frequency_penalty_isSet) {
        obj.insert(QString("frequency_penalty"), ::OpenAPI::toJsonValue(m_frequency_penalty));
    }
    if (m_logit_bias.size() > 0) {
        obj.insert(QString("logit_bias"), ::OpenAPI::toJsonValue(m_logit_bias));
    }
    if (m_logprobs_isSet) {
        obj.insert(QString("logprobs"), ::OpenAPI::toJsonValue(m_logprobs));
    }
    if (m_max_tokens_isSet) {
        obj.insert(QString("max_tokens"), ::OpenAPI::toJsonValue(m_max_tokens));
    }
    if (m_n_isSet) {
        obj.insert(QString("n"), ::OpenAPI::toJsonValue(m_n));
    }
    if (m_presence_penalty_isSet) {
        obj.insert(QString("presence_penalty"), ::OpenAPI::toJsonValue(m_presence_penalty));
    }
    if (m_seed_isSet) {
        obj.insert(QString("seed"), ::OpenAPI::toJsonValue(m_seed));
    }
    if (m_stop.isSet()) {
        obj.insert(QString("stop"), ::OpenAPI::toJsonValue(m_stop));
    }
    if (m_stream_isSet) {
        obj.insert(QString("stream"), ::OpenAPI::toJsonValue(m_stream));
    }
    if (m_suffix_isSet) {
        obj.insert(QString("suffix"), ::OpenAPI::toJsonValue(m_suffix));
    }
    if (m_temperature_isSet) {
        obj.insert(QString("temperature"), ::OpenAPI::toJsonValue(m_temperature));
    }
    if (m_top_p_isSet) {
        obj.insert(QString("top_p"), ::OpenAPI::toJsonValue(m_top_p));
    }
    if (m_user_isSet) {
        obj.insert(QString("user"), ::OpenAPI::toJsonValue(m_user));
    }
    return obj;
}

OAICreateCompletionRequest_model OAICreateCompletionRequest::getModel() const {
    return m_model;
}
void OAICreateCompletionRequest::setModel(const OAICreateCompletionRequest_model &model) {
    m_model = model;
    m_model_isSet = true;
}

bool OAICreateCompletionRequest::is_model_Set() const{
    return m_model_isSet;
}

bool OAICreateCompletionRequest::is_model_Valid() const{
    return m_model_isValid;
}

OAICreateCompletionRequest_prompt OAICreateCompletionRequest::getPrompt() const {
    return m_prompt;
}
void OAICreateCompletionRequest::setPrompt(const OAICreateCompletionRequest_prompt &prompt) {
    m_prompt = prompt;
    m_prompt_isSet = true;
}

bool OAICreateCompletionRequest::is_prompt_Set() const{
    return m_prompt_isSet;
}

bool OAICreateCompletionRequest::is_prompt_Valid() const{
    return m_prompt_isValid;
}

qint32 OAICreateCompletionRequest::getBestOf() const {
    return m_best_of;
}
void OAICreateCompletionRequest::setBestOf(const qint32 &best_of) {
    m_best_of = best_of;
    m_best_of_isSet = true;
}

bool OAICreateCompletionRequest::is_best_of_Set() const{
    return m_best_of_isSet;
}

bool OAICreateCompletionRequest::is_best_of_Valid() const{
    return m_best_of_isValid;
}

bool OAICreateCompletionRequest::isEcho() const {
    return m_echo;
}
void OAICreateCompletionRequest::setEcho(const bool &echo) {
    m_echo = echo;
    m_echo_isSet = true;
}

bool OAICreateCompletionRequest::is_echo_Set() const{
    return m_echo_isSet;
}

bool OAICreateCompletionRequest::is_echo_Valid() const{
    return m_echo_isValid;
}

double OAICreateCompletionRequest::getFrequencyPenalty() const {
    return m_frequency_penalty;
}
void OAICreateCompletionRequest::setFrequencyPenalty(const double &frequency_penalty) {
    m_frequency_penalty = frequency_penalty;
    m_frequency_penalty_isSet = true;
}

bool OAICreateCompletionRequest::is_frequency_penalty_Set() const{
    return m_frequency_penalty_isSet;
}

bool OAICreateCompletionRequest::is_frequency_penalty_Valid() const{
    return m_frequency_penalty_isValid;
}

QMap<QString, qint32> OAICreateCompletionRequest::getLogitBias() const {
    return m_logit_bias;
}
void OAICreateCompletionRequest::setLogitBias(const QMap<QString, qint32> &logit_bias) {
    m_logit_bias = logit_bias;
    m_logit_bias_isSet = true;
}

bool OAICreateCompletionRequest::is_logit_bias_Set() const{
    return m_logit_bias_isSet;
}

bool OAICreateCompletionRequest::is_logit_bias_Valid() const{
    return m_logit_bias_isValid;
}

qint32 OAICreateCompletionRequest::getLogprobs() const {
    return m_logprobs;
}
void OAICreateCompletionRequest::setLogprobs(const qint32 &logprobs) {
    m_logprobs = logprobs;
    m_logprobs_isSet = true;
}

bool OAICreateCompletionRequest::is_logprobs_Set() const{
    return m_logprobs_isSet;
}

bool OAICreateCompletionRequest::is_logprobs_Valid() const{
    return m_logprobs_isValid;
}

qint32 OAICreateCompletionRequest::getMaxTokens() const {
    return m_max_tokens;
}
void OAICreateCompletionRequest::setMaxTokens(const qint32 &max_tokens) {
    m_max_tokens = max_tokens;
    m_max_tokens_isSet = true;
}

bool OAICreateCompletionRequest::is_max_tokens_Set() const{
    return m_max_tokens_isSet;
}

bool OAICreateCompletionRequest::is_max_tokens_Valid() const{
    return m_max_tokens_isValid;
}

qint32 OAICreateCompletionRequest::getN() const {
    return m_n;
}
void OAICreateCompletionRequest::setN(const qint32 &n) {
    m_n = n;
    m_n_isSet = true;
}

bool OAICreateCompletionRequest::is_n_Set() const{
    return m_n_isSet;
}

bool OAICreateCompletionRequest::is_n_Valid() const{
    return m_n_isValid;
}

double OAICreateCompletionRequest::getPresencePenalty() const {
    return m_presence_penalty;
}
void OAICreateCompletionRequest::setPresencePenalty(const double &presence_penalty) {
    m_presence_penalty = presence_penalty;
    m_presence_penalty_isSet = true;
}

bool OAICreateCompletionRequest::is_presence_penalty_Set() const{
    return m_presence_penalty_isSet;
}

bool OAICreateCompletionRequest::is_presence_penalty_Valid() const{
    return m_presence_penalty_isValid;
}

qint32 OAICreateCompletionRequest::getSeed() const {
    return m_seed;
}
void OAICreateCompletionRequest::setSeed(const qint32 &seed) {
    m_seed = seed;
    m_seed_isSet = true;
}

bool OAICreateCompletionRequest::is_seed_Set() const{
    return m_seed_isSet;
}

bool OAICreateCompletionRequest::is_seed_Valid() const{
    return m_seed_isValid;
}

OAICreateCompletionRequest_stop OAICreateCompletionRequest::getStop() const {
    return m_stop;
}
void OAICreateCompletionRequest::setStop(const OAICreateCompletionRequest_stop &stop) {
    m_stop = stop;
    m_stop_isSet = true;
}

bool OAICreateCompletionRequest::is_stop_Set() const{
    return m_stop_isSet;
}

bool OAICreateCompletionRequest::is_stop_Valid() const{
    return m_stop_isValid;
}

bool OAICreateCompletionRequest::isStream() const {
    return m_stream;
}
void OAICreateCompletionRequest::setStream(const bool &stream) {
    m_stream = stream;
    m_stream_isSet = true;
}

bool OAICreateCompletionRequest::is_stream_Set() const{
    return m_stream_isSet;
}

bool OAICreateCompletionRequest::is_stream_Valid() const{
    return m_stream_isValid;
}

QString OAICreateCompletionRequest::getSuffix() const {
    return m_suffix;
}
void OAICreateCompletionRequest::setSuffix(const QString &suffix) {
    m_suffix = suffix;
    m_suffix_isSet = true;
}

bool OAICreateCompletionRequest::is_suffix_Set() const{
    return m_suffix_isSet;
}

bool OAICreateCompletionRequest::is_suffix_Valid() const{
    return m_suffix_isValid;
}

double OAICreateCompletionRequest::getTemperature() const {
    return m_temperature;
}
void OAICreateCompletionRequest::setTemperature(const double &temperature) {
    m_temperature = temperature;
    m_temperature_isSet = true;
}

bool OAICreateCompletionRequest::is_temperature_Set() const{
    return m_temperature_isSet;
}

bool OAICreateCompletionRequest::is_temperature_Valid() const{
    return m_temperature_isValid;
}

double OAICreateCompletionRequest::getTopP() const {
    return m_top_p;
}
void OAICreateCompletionRequest::setTopP(const double &top_p) {
    m_top_p = top_p;
    m_top_p_isSet = true;
}

bool OAICreateCompletionRequest::is_top_p_Set() const{
    return m_top_p_isSet;
}

bool OAICreateCompletionRequest::is_top_p_Valid() const{
    return m_top_p_isValid;
}

QString OAICreateCompletionRequest::getUser() const {
    return m_user;
}
void OAICreateCompletionRequest::setUser(const QString &user) {
    m_user = user;
    m_user_isSet = true;
}

bool OAICreateCompletionRequest::is_user_Set() const{
    return m_user_isSet;
}

bool OAICreateCompletionRequest::is_user_Valid() const{
    return m_user_isValid;
}

bool OAICreateCompletionRequest::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_model.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_prompt.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_best_of_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_echo_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_frequency_penalty_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_logit_bias.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_logprobs_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_max_tokens_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_n_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_presence_penalty_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_seed_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_stop.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_stream_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_suffix_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_temperature_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_top_p_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_user_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAICreateCompletionRequest::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_model_isValid && m_prompt_isValid && true;
}

} // namespace OpenAPI
