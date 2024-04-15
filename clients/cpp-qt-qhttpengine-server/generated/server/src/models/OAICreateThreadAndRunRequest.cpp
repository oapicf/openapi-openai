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

#include "OAICreateThreadAndRunRequest.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICreateThreadAndRunRequest::OAICreateThreadAndRunRequest(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICreateThreadAndRunRequest::OAICreateThreadAndRunRequest() {
    this->initializeModel();
}

OAICreateThreadAndRunRequest::~OAICreateThreadAndRunRequest() {}

void OAICreateThreadAndRunRequest::initializeModel() {

    m_assistant_id_isSet = false;
    m_assistant_id_isValid = false;

    m_thread_isSet = false;
    m_thread_isValid = false;

    m_model_isSet = false;
    m_model_isValid = false;

    m_instructions_isSet = false;
    m_instructions_isValid = false;

    m_tools_isSet = false;
    m_tools_isValid = false;

    m_metadata_isSet = false;
    m_metadata_isValid = false;

    m_temperature_isSet = false;
    m_temperature_isValid = false;

    m_stream_isSet = false;
    m_stream_isValid = false;

    m_max_prompt_tokens_isSet = false;
    m_max_prompt_tokens_isValid = false;

    m_max_completion_tokens_isSet = false;
    m_max_completion_tokens_isValid = false;

    m_truncation_strategy_isSet = false;
    m_truncation_strategy_isValid = false;

    m_tool_choice_isSet = false;
    m_tool_choice_isValid = false;

    m_response_format_isSet = false;
    m_response_format_isValid = false;
}

void OAICreateThreadAndRunRequest::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAICreateThreadAndRunRequest::fromJsonObject(QJsonObject json) {

    m_assistant_id_isValid = ::OpenAPI::fromJsonValue(assistant_id, json[QString("assistant_id")]);
    m_assistant_id_isSet = !json[QString("assistant_id")].isNull() && m_assistant_id_isValid;

    m_thread_isValid = ::OpenAPI::fromJsonValue(thread, json[QString("thread")]);
    m_thread_isSet = !json[QString("thread")].isNull() && m_thread_isValid;

    m_model_isValid = ::OpenAPI::fromJsonValue(model, json[QString("model")]);
    m_model_isSet = !json[QString("model")].isNull() && m_model_isValid;

    m_instructions_isValid = ::OpenAPI::fromJsonValue(instructions, json[QString("instructions")]);
    m_instructions_isSet = !json[QString("instructions")].isNull() && m_instructions_isValid;

    m_tools_isValid = ::OpenAPI::fromJsonValue(tools, json[QString("tools")]);
    m_tools_isSet = !json[QString("tools")].isNull() && m_tools_isValid;

    m_metadata_isValid = ::OpenAPI::fromJsonValue(metadata, json[QString("metadata")]);
    m_metadata_isSet = !json[QString("metadata")].isNull() && m_metadata_isValid;

    m_temperature_isValid = ::OpenAPI::fromJsonValue(temperature, json[QString("temperature")]);
    m_temperature_isSet = !json[QString("temperature")].isNull() && m_temperature_isValid;

    m_stream_isValid = ::OpenAPI::fromJsonValue(stream, json[QString("stream")]);
    m_stream_isSet = !json[QString("stream")].isNull() && m_stream_isValid;

    m_max_prompt_tokens_isValid = ::OpenAPI::fromJsonValue(max_prompt_tokens, json[QString("max_prompt_tokens")]);
    m_max_prompt_tokens_isSet = !json[QString("max_prompt_tokens")].isNull() && m_max_prompt_tokens_isValid;

    m_max_completion_tokens_isValid = ::OpenAPI::fromJsonValue(max_completion_tokens, json[QString("max_completion_tokens")]);
    m_max_completion_tokens_isSet = !json[QString("max_completion_tokens")].isNull() && m_max_completion_tokens_isValid;

    m_truncation_strategy_isValid = ::OpenAPI::fromJsonValue(truncation_strategy, json[QString("truncation_strategy")]);
    m_truncation_strategy_isSet = !json[QString("truncation_strategy")].isNull() && m_truncation_strategy_isValid;

    m_tool_choice_isValid = ::OpenAPI::fromJsonValue(tool_choice, json[QString("tool_choice")]);
    m_tool_choice_isSet = !json[QString("tool_choice")].isNull() && m_tool_choice_isValid;

    m_response_format_isValid = ::OpenAPI::fromJsonValue(response_format, json[QString("response_format")]);
    m_response_format_isSet = !json[QString("response_format")].isNull() && m_response_format_isValid;
}

QString OAICreateThreadAndRunRequest::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAICreateThreadAndRunRequest::asJsonObject() const {
    QJsonObject obj;
    if (m_assistant_id_isSet) {
        obj.insert(QString("assistant_id"), ::OpenAPI::toJsonValue(assistant_id));
    }
    if (thread.isSet()) {
        obj.insert(QString("thread"), ::OpenAPI::toJsonValue(thread));
    }
    if (model.isSet()) {
        obj.insert(QString("model"), ::OpenAPI::toJsonValue(model));
    }
    if (m_instructions_isSet) {
        obj.insert(QString("instructions"), ::OpenAPI::toJsonValue(instructions));
    }
    if (tools.size() > 0) {
        obj.insert(QString("tools"), ::OpenAPI::toJsonValue(tools));
    }
    if (m_metadata_isSet) {
        obj.insert(QString("metadata"), ::OpenAPI::toJsonValue(metadata));
    }
    if (m_temperature_isSet) {
        obj.insert(QString("temperature"), ::OpenAPI::toJsonValue(temperature));
    }
    if (m_stream_isSet) {
        obj.insert(QString("stream"), ::OpenAPI::toJsonValue(stream));
    }
    if (m_max_prompt_tokens_isSet) {
        obj.insert(QString("max_prompt_tokens"), ::OpenAPI::toJsonValue(max_prompt_tokens));
    }
    if (m_max_completion_tokens_isSet) {
        obj.insert(QString("max_completion_tokens"), ::OpenAPI::toJsonValue(max_completion_tokens));
    }
    if (truncation_strategy.isSet()) {
        obj.insert(QString("truncation_strategy"), ::OpenAPI::toJsonValue(truncation_strategy));
    }
    if (tool_choice.isSet()) {
        obj.insert(QString("tool_choice"), ::OpenAPI::toJsonValue(tool_choice));
    }
    if (response_format.isSet()) {
        obj.insert(QString("response_format"), ::OpenAPI::toJsonValue(response_format));
    }
    return obj;
}

QString OAICreateThreadAndRunRequest::getAssistantId() const {
    return assistant_id;
}
void OAICreateThreadAndRunRequest::setAssistantId(const QString &assistant_id) {
    this->assistant_id = assistant_id;
    this->m_assistant_id_isSet = true;
}

bool OAICreateThreadAndRunRequest::is_assistant_id_Set() const{
    return m_assistant_id_isSet;
}

bool OAICreateThreadAndRunRequest::is_assistant_id_Valid() const{
    return m_assistant_id_isValid;
}

OAICreateThreadRequest OAICreateThreadAndRunRequest::getThread() const {
    return thread;
}
void OAICreateThreadAndRunRequest::setThread(const OAICreateThreadRequest &thread) {
    this->thread = thread;
    this->m_thread_isSet = true;
}

bool OAICreateThreadAndRunRequest::is_thread_Set() const{
    return m_thread_isSet;
}

bool OAICreateThreadAndRunRequest::is_thread_Valid() const{
    return m_thread_isValid;
}

OAICreateRunRequest_model OAICreateThreadAndRunRequest::getModel() const {
    return model;
}
void OAICreateThreadAndRunRequest::setModel(const OAICreateRunRequest_model &model) {
    this->model = model;
    this->m_model_isSet = true;
}

bool OAICreateThreadAndRunRequest::is_model_Set() const{
    return m_model_isSet;
}

bool OAICreateThreadAndRunRequest::is_model_Valid() const{
    return m_model_isValid;
}

QString OAICreateThreadAndRunRequest::getInstructions() const {
    return instructions;
}
void OAICreateThreadAndRunRequest::setInstructions(const QString &instructions) {
    this->instructions = instructions;
    this->m_instructions_isSet = true;
}

bool OAICreateThreadAndRunRequest::is_instructions_Set() const{
    return m_instructions_isSet;
}

bool OAICreateThreadAndRunRequest::is_instructions_Valid() const{
    return m_instructions_isValid;
}

QList<OAICreateThreadAndRunRequest_tools_inner> OAICreateThreadAndRunRequest::getTools() const {
    return tools;
}
void OAICreateThreadAndRunRequest::setTools(const QList<OAICreateThreadAndRunRequest_tools_inner> &tools) {
    this->tools = tools;
    this->m_tools_isSet = true;
}

bool OAICreateThreadAndRunRequest::is_tools_Set() const{
    return m_tools_isSet;
}

bool OAICreateThreadAndRunRequest::is_tools_Valid() const{
    return m_tools_isValid;
}

OAIObject OAICreateThreadAndRunRequest::getMetadata() const {
    return metadata;
}
void OAICreateThreadAndRunRequest::setMetadata(const OAIObject &metadata) {
    this->metadata = metadata;
    this->m_metadata_isSet = true;
}

bool OAICreateThreadAndRunRequest::is_metadata_Set() const{
    return m_metadata_isSet;
}

bool OAICreateThreadAndRunRequest::is_metadata_Valid() const{
    return m_metadata_isValid;
}

double OAICreateThreadAndRunRequest::getTemperature() const {
    return temperature;
}
void OAICreateThreadAndRunRequest::setTemperature(const double &temperature) {
    this->temperature = temperature;
    this->m_temperature_isSet = true;
}

bool OAICreateThreadAndRunRequest::is_temperature_Set() const{
    return m_temperature_isSet;
}

bool OAICreateThreadAndRunRequest::is_temperature_Valid() const{
    return m_temperature_isValid;
}

bool OAICreateThreadAndRunRequest::isStream() const {
    return stream;
}
void OAICreateThreadAndRunRequest::setStream(const bool &stream) {
    this->stream = stream;
    this->m_stream_isSet = true;
}

bool OAICreateThreadAndRunRequest::is_stream_Set() const{
    return m_stream_isSet;
}

bool OAICreateThreadAndRunRequest::is_stream_Valid() const{
    return m_stream_isValid;
}

qint32 OAICreateThreadAndRunRequest::getMaxPromptTokens() const {
    return max_prompt_tokens;
}
void OAICreateThreadAndRunRequest::setMaxPromptTokens(const qint32 &max_prompt_tokens) {
    this->max_prompt_tokens = max_prompt_tokens;
    this->m_max_prompt_tokens_isSet = true;
}

bool OAICreateThreadAndRunRequest::is_max_prompt_tokens_Set() const{
    return m_max_prompt_tokens_isSet;
}

bool OAICreateThreadAndRunRequest::is_max_prompt_tokens_Valid() const{
    return m_max_prompt_tokens_isValid;
}

qint32 OAICreateThreadAndRunRequest::getMaxCompletionTokens() const {
    return max_completion_tokens;
}
void OAICreateThreadAndRunRequest::setMaxCompletionTokens(const qint32 &max_completion_tokens) {
    this->max_completion_tokens = max_completion_tokens;
    this->m_max_completion_tokens_isSet = true;
}

bool OAICreateThreadAndRunRequest::is_max_completion_tokens_Set() const{
    return m_max_completion_tokens_isSet;
}

bool OAICreateThreadAndRunRequest::is_max_completion_tokens_Valid() const{
    return m_max_completion_tokens_isValid;
}

OAITruncationObject OAICreateThreadAndRunRequest::getTruncationStrategy() const {
    return truncation_strategy;
}
void OAICreateThreadAndRunRequest::setTruncationStrategy(const OAITruncationObject &truncation_strategy) {
    this->truncation_strategy = truncation_strategy;
    this->m_truncation_strategy_isSet = true;
}

bool OAICreateThreadAndRunRequest::is_truncation_strategy_Set() const{
    return m_truncation_strategy_isSet;
}

bool OAICreateThreadAndRunRequest::is_truncation_strategy_Valid() const{
    return m_truncation_strategy_isValid;
}

OAIAssistantsApiToolChoiceOption OAICreateThreadAndRunRequest::getToolChoice() const {
    return tool_choice;
}
void OAICreateThreadAndRunRequest::setToolChoice(const OAIAssistantsApiToolChoiceOption &tool_choice) {
    this->tool_choice = tool_choice;
    this->m_tool_choice_isSet = true;
}

bool OAICreateThreadAndRunRequest::is_tool_choice_Set() const{
    return m_tool_choice_isSet;
}

bool OAICreateThreadAndRunRequest::is_tool_choice_Valid() const{
    return m_tool_choice_isValid;
}

OAIAssistantsApiResponseFormatOption OAICreateThreadAndRunRequest::getResponseFormat() const {
    return response_format;
}
void OAICreateThreadAndRunRequest::setResponseFormat(const OAIAssistantsApiResponseFormatOption &response_format) {
    this->response_format = response_format;
    this->m_response_format_isSet = true;
}

bool OAICreateThreadAndRunRequest::is_response_format_Set() const{
    return m_response_format_isSet;
}

bool OAICreateThreadAndRunRequest::is_response_format_Valid() const{
    return m_response_format_isValid;
}

bool OAICreateThreadAndRunRequest::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_assistant_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (thread.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (model.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_instructions_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (tools.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_metadata_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_temperature_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_stream_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_max_prompt_tokens_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_max_completion_tokens_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (truncation_strategy.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (tool_choice.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (response_format.isSet()) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAICreateThreadAndRunRequest::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_assistant_id_isValid && true;
}

} // namespace OpenAPI