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

#include "OAICreateChatCompletionRequest.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICreateChatCompletionRequest::OAICreateChatCompletionRequest(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICreateChatCompletionRequest::OAICreateChatCompletionRequest() {
    this->initializeModel();
}

OAICreateChatCompletionRequest::~OAICreateChatCompletionRequest() {}

void OAICreateChatCompletionRequest::initializeModel() {

    m_model_isSet = false;
    m_model_isValid = false;

    m_messages_isSet = false;
    m_messages_isValid = false;

    m_functions_isSet = false;
    m_functions_isValid = false;

    m_function_call_isSet = false;
    m_function_call_isValid = false;

    m_temperature_isSet = false;
    m_temperature_isValid = false;

    m_top_p_isSet = false;
    m_top_p_isValid = false;

    m_n_isSet = false;
    m_n_isValid = false;

    m_stream_isSet = false;
    m_stream_isValid = false;

    m_stop_isSet = false;
    m_stop_isValid = false;

    m_max_tokens_isSet = false;
    m_max_tokens_isValid = false;

    m_presence_penalty_isSet = false;
    m_presence_penalty_isValid = false;

    m_frequency_penalty_isSet = false;
    m_frequency_penalty_isValid = false;

    m_logit_bias_isSet = false;
    m_logit_bias_isValid = false;

    m_user_isSet = false;
    m_user_isValid = false;
}

void OAICreateChatCompletionRequest::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAICreateChatCompletionRequest::fromJsonObject(QJsonObject json) {

    m_model_isValid = ::OpenAPI::fromJsonValue(model, json[QString("model")]);
    m_model_isSet = !json[QString("model")].isNull() && m_model_isValid;

    m_messages_isValid = ::OpenAPI::fromJsonValue(messages, json[QString("messages")]);
    m_messages_isSet = !json[QString("messages")].isNull() && m_messages_isValid;

    m_functions_isValid = ::OpenAPI::fromJsonValue(functions, json[QString("functions")]);
    m_functions_isSet = !json[QString("functions")].isNull() && m_functions_isValid;

    m_function_call_isValid = ::OpenAPI::fromJsonValue(function_call, json[QString("function_call")]);
    m_function_call_isSet = !json[QString("function_call")].isNull() && m_function_call_isValid;

    m_temperature_isValid = ::OpenAPI::fromJsonValue(temperature, json[QString("temperature")]);
    m_temperature_isSet = !json[QString("temperature")].isNull() && m_temperature_isValid;

    m_top_p_isValid = ::OpenAPI::fromJsonValue(top_p, json[QString("top_p")]);
    m_top_p_isSet = !json[QString("top_p")].isNull() && m_top_p_isValid;

    m_n_isValid = ::OpenAPI::fromJsonValue(n, json[QString("n")]);
    m_n_isSet = !json[QString("n")].isNull() && m_n_isValid;

    m_stream_isValid = ::OpenAPI::fromJsonValue(stream, json[QString("stream")]);
    m_stream_isSet = !json[QString("stream")].isNull() && m_stream_isValid;

    m_stop_isValid = ::OpenAPI::fromJsonValue(stop, json[QString("stop")]);
    m_stop_isSet = !json[QString("stop")].isNull() && m_stop_isValid;

    m_max_tokens_isValid = ::OpenAPI::fromJsonValue(max_tokens, json[QString("max_tokens")]);
    m_max_tokens_isSet = !json[QString("max_tokens")].isNull() && m_max_tokens_isValid;

    m_presence_penalty_isValid = ::OpenAPI::fromJsonValue(presence_penalty, json[QString("presence_penalty")]);
    m_presence_penalty_isSet = !json[QString("presence_penalty")].isNull() && m_presence_penalty_isValid;

    m_frequency_penalty_isValid = ::OpenAPI::fromJsonValue(frequency_penalty, json[QString("frequency_penalty")]);
    m_frequency_penalty_isSet = !json[QString("frequency_penalty")].isNull() && m_frequency_penalty_isValid;

    m_logit_bias_isValid = ::OpenAPI::fromJsonValue(logit_bias, json[QString("logit_bias")]);
    m_logit_bias_isSet = !json[QString("logit_bias")].isNull() && m_logit_bias_isValid;

    m_user_isValid = ::OpenAPI::fromJsonValue(user, json[QString("user")]);
    m_user_isSet = !json[QString("user")].isNull() && m_user_isValid;
}

QString OAICreateChatCompletionRequest::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAICreateChatCompletionRequest::asJsonObject() const {
    QJsonObject obj;
    if (model.isSet()) {
        obj.insert(QString("model"), ::OpenAPI::toJsonValue(model));
    }
    if (messages.size() > 0) {
        obj.insert(QString("messages"), ::OpenAPI::toJsonValue(messages));
    }
    if (functions.size() > 0) {
        obj.insert(QString("functions"), ::OpenAPI::toJsonValue(functions));
    }
    if (function_call.isSet()) {
        obj.insert(QString("function_call"), ::OpenAPI::toJsonValue(function_call));
    }
    if (m_temperature_isSet) {
        obj.insert(QString("temperature"), ::OpenAPI::toJsonValue(temperature));
    }
    if (m_top_p_isSet) {
        obj.insert(QString("top_p"), ::OpenAPI::toJsonValue(top_p));
    }
    if (m_n_isSet) {
        obj.insert(QString("n"), ::OpenAPI::toJsonValue(n));
    }
    if (m_stream_isSet) {
        obj.insert(QString("stream"), ::OpenAPI::toJsonValue(stream));
    }
    if (stop.isSet()) {
        obj.insert(QString("stop"), ::OpenAPI::toJsonValue(stop));
    }
    if (m_max_tokens_isSet) {
        obj.insert(QString("max_tokens"), ::OpenAPI::toJsonValue(max_tokens));
    }
    if (m_presence_penalty_isSet) {
        obj.insert(QString("presence_penalty"), ::OpenAPI::toJsonValue(presence_penalty));
    }
    if (m_frequency_penalty_isSet) {
        obj.insert(QString("frequency_penalty"), ::OpenAPI::toJsonValue(frequency_penalty));
    }
    if (m_logit_bias_isSet) {
        obj.insert(QString("logit_bias"), ::OpenAPI::toJsonValue(logit_bias));
    }
    if (m_user_isSet) {
        obj.insert(QString("user"), ::OpenAPI::toJsonValue(user));
    }
    return obj;
}

OAICreateChatCompletionRequest_model OAICreateChatCompletionRequest::getModel() const {
    return model;
}
void OAICreateChatCompletionRequest::setModel(const OAICreateChatCompletionRequest_model &model) {
    this->model = model;
    this->m_model_isSet = true;
}

bool OAICreateChatCompletionRequest::is_model_Set() const{
    return m_model_isSet;
}

bool OAICreateChatCompletionRequest::is_model_Valid() const{
    return m_model_isValid;
}

QList<OAIChatCompletionRequestMessage> OAICreateChatCompletionRequest::getMessages() const {
    return messages;
}
void OAICreateChatCompletionRequest::setMessages(const QList<OAIChatCompletionRequestMessage> &messages) {
    this->messages = messages;
    this->m_messages_isSet = true;
}

bool OAICreateChatCompletionRequest::is_messages_Set() const{
    return m_messages_isSet;
}

bool OAICreateChatCompletionRequest::is_messages_Valid() const{
    return m_messages_isValid;
}

QList<OAIChatCompletionFunctions> OAICreateChatCompletionRequest::getFunctions() const {
    return functions;
}
void OAICreateChatCompletionRequest::setFunctions(const QList<OAIChatCompletionFunctions> &functions) {
    this->functions = functions;
    this->m_functions_isSet = true;
}

bool OAICreateChatCompletionRequest::is_functions_Set() const{
    return m_functions_isSet;
}

bool OAICreateChatCompletionRequest::is_functions_Valid() const{
    return m_functions_isValid;
}

OAICreateChatCompletionRequest_function_call OAICreateChatCompletionRequest::getFunctionCall() const {
    return function_call;
}
void OAICreateChatCompletionRequest::setFunctionCall(const OAICreateChatCompletionRequest_function_call &function_call) {
    this->function_call = function_call;
    this->m_function_call_isSet = true;
}

bool OAICreateChatCompletionRequest::is_function_call_Set() const{
    return m_function_call_isSet;
}

bool OAICreateChatCompletionRequest::is_function_call_Valid() const{
    return m_function_call_isValid;
}

double OAICreateChatCompletionRequest::getTemperature() const {
    return temperature;
}
void OAICreateChatCompletionRequest::setTemperature(const double &temperature) {
    this->temperature = temperature;
    this->m_temperature_isSet = true;
}

bool OAICreateChatCompletionRequest::is_temperature_Set() const{
    return m_temperature_isSet;
}

bool OAICreateChatCompletionRequest::is_temperature_Valid() const{
    return m_temperature_isValid;
}

double OAICreateChatCompletionRequest::getTopP() const {
    return top_p;
}
void OAICreateChatCompletionRequest::setTopP(const double &top_p) {
    this->top_p = top_p;
    this->m_top_p_isSet = true;
}

bool OAICreateChatCompletionRequest::is_top_p_Set() const{
    return m_top_p_isSet;
}

bool OAICreateChatCompletionRequest::is_top_p_Valid() const{
    return m_top_p_isValid;
}

qint32 OAICreateChatCompletionRequest::getN() const {
    return n;
}
void OAICreateChatCompletionRequest::setN(const qint32 &n) {
    this->n = n;
    this->m_n_isSet = true;
}

bool OAICreateChatCompletionRequest::is_n_Set() const{
    return m_n_isSet;
}

bool OAICreateChatCompletionRequest::is_n_Valid() const{
    return m_n_isValid;
}

bool OAICreateChatCompletionRequest::isStream() const {
    return stream;
}
void OAICreateChatCompletionRequest::setStream(const bool &stream) {
    this->stream = stream;
    this->m_stream_isSet = true;
}

bool OAICreateChatCompletionRequest::is_stream_Set() const{
    return m_stream_isSet;
}

bool OAICreateChatCompletionRequest::is_stream_Valid() const{
    return m_stream_isValid;
}

OAICreateChatCompletionRequest_stop OAICreateChatCompletionRequest::getStop() const {
    return stop;
}
void OAICreateChatCompletionRequest::setStop(const OAICreateChatCompletionRequest_stop &stop) {
    this->stop = stop;
    this->m_stop_isSet = true;
}

bool OAICreateChatCompletionRequest::is_stop_Set() const{
    return m_stop_isSet;
}

bool OAICreateChatCompletionRequest::is_stop_Valid() const{
    return m_stop_isValid;
}

qint32 OAICreateChatCompletionRequest::getMaxTokens() const {
    return max_tokens;
}
void OAICreateChatCompletionRequest::setMaxTokens(const qint32 &max_tokens) {
    this->max_tokens = max_tokens;
    this->m_max_tokens_isSet = true;
}

bool OAICreateChatCompletionRequest::is_max_tokens_Set() const{
    return m_max_tokens_isSet;
}

bool OAICreateChatCompletionRequest::is_max_tokens_Valid() const{
    return m_max_tokens_isValid;
}

double OAICreateChatCompletionRequest::getPresencePenalty() const {
    return presence_penalty;
}
void OAICreateChatCompletionRequest::setPresencePenalty(const double &presence_penalty) {
    this->presence_penalty = presence_penalty;
    this->m_presence_penalty_isSet = true;
}

bool OAICreateChatCompletionRequest::is_presence_penalty_Set() const{
    return m_presence_penalty_isSet;
}

bool OAICreateChatCompletionRequest::is_presence_penalty_Valid() const{
    return m_presence_penalty_isValid;
}

double OAICreateChatCompletionRequest::getFrequencyPenalty() const {
    return frequency_penalty;
}
void OAICreateChatCompletionRequest::setFrequencyPenalty(const double &frequency_penalty) {
    this->frequency_penalty = frequency_penalty;
    this->m_frequency_penalty_isSet = true;
}

bool OAICreateChatCompletionRequest::is_frequency_penalty_Set() const{
    return m_frequency_penalty_isSet;
}

bool OAICreateChatCompletionRequest::is_frequency_penalty_Valid() const{
    return m_frequency_penalty_isValid;
}

OAIObject OAICreateChatCompletionRequest::getLogitBias() const {
    return logit_bias;
}
void OAICreateChatCompletionRequest::setLogitBias(const OAIObject &logit_bias) {
    this->logit_bias = logit_bias;
    this->m_logit_bias_isSet = true;
}

bool OAICreateChatCompletionRequest::is_logit_bias_Set() const{
    return m_logit_bias_isSet;
}

bool OAICreateChatCompletionRequest::is_logit_bias_Valid() const{
    return m_logit_bias_isValid;
}

QString OAICreateChatCompletionRequest::getUser() const {
    return user;
}
void OAICreateChatCompletionRequest::setUser(const QString &user) {
    this->user = user;
    this->m_user_isSet = true;
}

bool OAICreateChatCompletionRequest::is_user_Set() const{
    return m_user_isSet;
}

bool OAICreateChatCompletionRequest::is_user_Valid() const{
    return m_user_isValid;
}

bool OAICreateChatCompletionRequest::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (model.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (messages.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (functions.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (function_call.isSet()) {
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

        if (m_n_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_stream_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (stop.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_max_tokens_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_presence_penalty_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_frequency_penalty_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_logit_bias_isSet) {
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

bool OAICreateChatCompletionRequest::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_model_isValid && m_messages_isValid && true;
}

} // namespace OpenAPI
