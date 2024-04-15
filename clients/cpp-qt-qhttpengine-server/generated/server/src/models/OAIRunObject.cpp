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

#include "OAIRunObject.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIRunObject::OAIRunObject(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIRunObject::OAIRunObject() {
    this->initializeModel();
}

OAIRunObject::~OAIRunObject() {}

void OAIRunObject::initializeModel() {

    m_id_isSet = false;
    m_id_isValid = false;

    m_object_isSet = false;
    m_object_isValid = false;

    m_created_at_isSet = false;
    m_created_at_isValid = false;

    m_thread_id_isSet = false;
    m_thread_id_isValid = false;

    m_assistant_id_isSet = false;
    m_assistant_id_isValid = false;

    m_status_isSet = false;
    m_status_isValid = false;

    m_required_action_isSet = false;
    m_required_action_isValid = false;

    m_last_error_isSet = false;
    m_last_error_isValid = false;

    m_expires_at_isSet = false;
    m_expires_at_isValid = false;

    m_started_at_isSet = false;
    m_started_at_isValid = false;

    m_cancelled_at_isSet = false;
    m_cancelled_at_isValid = false;

    m_failed_at_isSet = false;
    m_failed_at_isValid = false;

    m_completed_at_isSet = false;
    m_completed_at_isValid = false;

    m_incomplete_details_isSet = false;
    m_incomplete_details_isValid = false;

    m_model_isSet = false;
    m_model_isValid = false;

    m_instructions_isSet = false;
    m_instructions_isValid = false;

    m_tools_isSet = false;
    m_tools_isValid = false;

    m_file_ids_isSet = false;
    m_file_ids_isValid = false;

    m_metadata_isSet = false;
    m_metadata_isValid = false;

    m_usage_isSet = false;
    m_usage_isValid = false;

    m_temperature_isSet = false;
    m_temperature_isValid = false;

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

void OAIRunObject::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIRunObject::fromJsonObject(QJsonObject json) {

    m_id_isValid = ::OpenAPI::fromJsonValue(id, json[QString("id")]);
    m_id_isSet = !json[QString("id")].isNull() && m_id_isValid;

    m_object_isValid = ::OpenAPI::fromJsonValue(object, json[QString("object")]);
    m_object_isSet = !json[QString("object")].isNull() && m_object_isValid;

    m_created_at_isValid = ::OpenAPI::fromJsonValue(created_at, json[QString("created_at")]);
    m_created_at_isSet = !json[QString("created_at")].isNull() && m_created_at_isValid;

    m_thread_id_isValid = ::OpenAPI::fromJsonValue(thread_id, json[QString("thread_id")]);
    m_thread_id_isSet = !json[QString("thread_id")].isNull() && m_thread_id_isValid;

    m_assistant_id_isValid = ::OpenAPI::fromJsonValue(assistant_id, json[QString("assistant_id")]);
    m_assistant_id_isSet = !json[QString("assistant_id")].isNull() && m_assistant_id_isValid;

    m_status_isValid = ::OpenAPI::fromJsonValue(status, json[QString("status")]);
    m_status_isSet = !json[QString("status")].isNull() && m_status_isValid;

    m_required_action_isValid = ::OpenAPI::fromJsonValue(required_action, json[QString("required_action")]);
    m_required_action_isSet = !json[QString("required_action")].isNull() && m_required_action_isValid;

    m_last_error_isValid = ::OpenAPI::fromJsonValue(last_error, json[QString("last_error")]);
    m_last_error_isSet = !json[QString("last_error")].isNull() && m_last_error_isValid;

    m_expires_at_isValid = ::OpenAPI::fromJsonValue(expires_at, json[QString("expires_at")]);
    m_expires_at_isSet = !json[QString("expires_at")].isNull() && m_expires_at_isValid;

    m_started_at_isValid = ::OpenAPI::fromJsonValue(started_at, json[QString("started_at")]);
    m_started_at_isSet = !json[QString("started_at")].isNull() && m_started_at_isValid;

    m_cancelled_at_isValid = ::OpenAPI::fromJsonValue(cancelled_at, json[QString("cancelled_at")]);
    m_cancelled_at_isSet = !json[QString("cancelled_at")].isNull() && m_cancelled_at_isValid;

    m_failed_at_isValid = ::OpenAPI::fromJsonValue(failed_at, json[QString("failed_at")]);
    m_failed_at_isSet = !json[QString("failed_at")].isNull() && m_failed_at_isValid;

    m_completed_at_isValid = ::OpenAPI::fromJsonValue(completed_at, json[QString("completed_at")]);
    m_completed_at_isSet = !json[QString("completed_at")].isNull() && m_completed_at_isValid;

    m_incomplete_details_isValid = ::OpenAPI::fromJsonValue(incomplete_details, json[QString("incomplete_details")]);
    m_incomplete_details_isSet = !json[QString("incomplete_details")].isNull() && m_incomplete_details_isValid;

    m_model_isValid = ::OpenAPI::fromJsonValue(model, json[QString("model")]);
    m_model_isSet = !json[QString("model")].isNull() && m_model_isValid;

    m_instructions_isValid = ::OpenAPI::fromJsonValue(instructions, json[QString("instructions")]);
    m_instructions_isSet = !json[QString("instructions")].isNull() && m_instructions_isValid;

    m_tools_isValid = ::OpenAPI::fromJsonValue(tools, json[QString("tools")]);
    m_tools_isSet = !json[QString("tools")].isNull() && m_tools_isValid;

    m_file_ids_isValid = ::OpenAPI::fromJsonValue(file_ids, json[QString("file_ids")]);
    m_file_ids_isSet = !json[QString("file_ids")].isNull() && m_file_ids_isValid;

    m_metadata_isValid = ::OpenAPI::fromJsonValue(metadata, json[QString("metadata")]);
    m_metadata_isSet = !json[QString("metadata")].isNull() && m_metadata_isValid;

    m_usage_isValid = ::OpenAPI::fromJsonValue(usage, json[QString("usage")]);
    m_usage_isSet = !json[QString("usage")].isNull() && m_usage_isValid;

    m_temperature_isValid = ::OpenAPI::fromJsonValue(temperature, json[QString("temperature")]);
    m_temperature_isSet = !json[QString("temperature")].isNull() && m_temperature_isValid;

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

QString OAIRunObject::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIRunObject::asJsonObject() const {
    QJsonObject obj;
    if (m_id_isSet) {
        obj.insert(QString("id"), ::OpenAPI::toJsonValue(id));
    }
    if (m_object_isSet) {
        obj.insert(QString("object"), ::OpenAPI::toJsonValue(object));
    }
    if (m_created_at_isSet) {
        obj.insert(QString("created_at"), ::OpenAPI::toJsonValue(created_at));
    }
    if (m_thread_id_isSet) {
        obj.insert(QString("thread_id"), ::OpenAPI::toJsonValue(thread_id));
    }
    if (m_assistant_id_isSet) {
        obj.insert(QString("assistant_id"), ::OpenAPI::toJsonValue(assistant_id));
    }
    if (m_status_isSet) {
        obj.insert(QString("status"), ::OpenAPI::toJsonValue(status));
    }
    if (required_action.isSet()) {
        obj.insert(QString("required_action"), ::OpenAPI::toJsonValue(required_action));
    }
    if (last_error.isSet()) {
        obj.insert(QString("last_error"), ::OpenAPI::toJsonValue(last_error));
    }
    if (m_expires_at_isSet) {
        obj.insert(QString("expires_at"), ::OpenAPI::toJsonValue(expires_at));
    }
    if (m_started_at_isSet) {
        obj.insert(QString("started_at"), ::OpenAPI::toJsonValue(started_at));
    }
    if (m_cancelled_at_isSet) {
        obj.insert(QString("cancelled_at"), ::OpenAPI::toJsonValue(cancelled_at));
    }
    if (m_failed_at_isSet) {
        obj.insert(QString("failed_at"), ::OpenAPI::toJsonValue(failed_at));
    }
    if (m_completed_at_isSet) {
        obj.insert(QString("completed_at"), ::OpenAPI::toJsonValue(completed_at));
    }
    if (incomplete_details.isSet()) {
        obj.insert(QString("incomplete_details"), ::OpenAPI::toJsonValue(incomplete_details));
    }
    if (m_model_isSet) {
        obj.insert(QString("model"), ::OpenAPI::toJsonValue(model));
    }
    if (m_instructions_isSet) {
        obj.insert(QString("instructions"), ::OpenAPI::toJsonValue(instructions));
    }
    if (tools.size() > 0) {
        obj.insert(QString("tools"), ::OpenAPI::toJsonValue(tools));
    }
    if (file_ids.size() > 0) {
        obj.insert(QString("file_ids"), ::OpenAPI::toJsonValue(file_ids));
    }
    if (m_metadata_isSet) {
        obj.insert(QString("metadata"), ::OpenAPI::toJsonValue(metadata));
    }
    if (usage.isSet()) {
        obj.insert(QString("usage"), ::OpenAPI::toJsonValue(usage));
    }
    if (m_temperature_isSet) {
        obj.insert(QString("temperature"), ::OpenAPI::toJsonValue(temperature));
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

QString OAIRunObject::getId() const {
    return id;
}
void OAIRunObject::setId(const QString &id) {
    this->id = id;
    this->m_id_isSet = true;
}

bool OAIRunObject::is_id_Set() const{
    return m_id_isSet;
}

bool OAIRunObject::is_id_Valid() const{
    return m_id_isValid;
}

QString OAIRunObject::getObject() const {
    return object;
}
void OAIRunObject::setObject(const QString &object) {
    this->object = object;
    this->m_object_isSet = true;
}

bool OAIRunObject::is_object_Set() const{
    return m_object_isSet;
}

bool OAIRunObject::is_object_Valid() const{
    return m_object_isValid;
}

qint32 OAIRunObject::getCreatedAt() const {
    return created_at;
}
void OAIRunObject::setCreatedAt(const qint32 &created_at) {
    this->created_at = created_at;
    this->m_created_at_isSet = true;
}

bool OAIRunObject::is_created_at_Set() const{
    return m_created_at_isSet;
}

bool OAIRunObject::is_created_at_Valid() const{
    return m_created_at_isValid;
}

QString OAIRunObject::getThreadId() const {
    return thread_id;
}
void OAIRunObject::setThreadId(const QString &thread_id) {
    this->thread_id = thread_id;
    this->m_thread_id_isSet = true;
}

bool OAIRunObject::is_thread_id_Set() const{
    return m_thread_id_isSet;
}

bool OAIRunObject::is_thread_id_Valid() const{
    return m_thread_id_isValid;
}

QString OAIRunObject::getAssistantId() const {
    return assistant_id;
}
void OAIRunObject::setAssistantId(const QString &assistant_id) {
    this->assistant_id = assistant_id;
    this->m_assistant_id_isSet = true;
}

bool OAIRunObject::is_assistant_id_Set() const{
    return m_assistant_id_isSet;
}

bool OAIRunObject::is_assistant_id_Valid() const{
    return m_assistant_id_isValid;
}

QString OAIRunObject::getStatus() const {
    return status;
}
void OAIRunObject::setStatus(const QString &status) {
    this->status = status;
    this->m_status_isSet = true;
}

bool OAIRunObject::is_status_Set() const{
    return m_status_isSet;
}

bool OAIRunObject::is_status_Valid() const{
    return m_status_isValid;
}

OAIRunObject_required_action OAIRunObject::getRequiredAction() const {
    return required_action;
}
void OAIRunObject::setRequiredAction(const OAIRunObject_required_action &required_action) {
    this->required_action = required_action;
    this->m_required_action_isSet = true;
}

bool OAIRunObject::is_required_action_Set() const{
    return m_required_action_isSet;
}

bool OAIRunObject::is_required_action_Valid() const{
    return m_required_action_isValid;
}

OAIRunObject_last_error OAIRunObject::getLastError() const {
    return last_error;
}
void OAIRunObject::setLastError(const OAIRunObject_last_error &last_error) {
    this->last_error = last_error;
    this->m_last_error_isSet = true;
}

bool OAIRunObject::is_last_error_Set() const{
    return m_last_error_isSet;
}

bool OAIRunObject::is_last_error_Valid() const{
    return m_last_error_isValid;
}

qint32 OAIRunObject::getExpiresAt() const {
    return expires_at;
}
void OAIRunObject::setExpiresAt(const qint32 &expires_at) {
    this->expires_at = expires_at;
    this->m_expires_at_isSet = true;
}

bool OAIRunObject::is_expires_at_Set() const{
    return m_expires_at_isSet;
}

bool OAIRunObject::is_expires_at_Valid() const{
    return m_expires_at_isValid;
}

qint32 OAIRunObject::getStartedAt() const {
    return started_at;
}
void OAIRunObject::setStartedAt(const qint32 &started_at) {
    this->started_at = started_at;
    this->m_started_at_isSet = true;
}

bool OAIRunObject::is_started_at_Set() const{
    return m_started_at_isSet;
}

bool OAIRunObject::is_started_at_Valid() const{
    return m_started_at_isValid;
}

qint32 OAIRunObject::getCancelledAt() const {
    return cancelled_at;
}
void OAIRunObject::setCancelledAt(const qint32 &cancelled_at) {
    this->cancelled_at = cancelled_at;
    this->m_cancelled_at_isSet = true;
}

bool OAIRunObject::is_cancelled_at_Set() const{
    return m_cancelled_at_isSet;
}

bool OAIRunObject::is_cancelled_at_Valid() const{
    return m_cancelled_at_isValid;
}

qint32 OAIRunObject::getFailedAt() const {
    return failed_at;
}
void OAIRunObject::setFailedAt(const qint32 &failed_at) {
    this->failed_at = failed_at;
    this->m_failed_at_isSet = true;
}

bool OAIRunObject::is_failed_at_Set() const{
    return m_failed_at_isSet;
}

bool OAIRunObject::is_failed_at_Valid() const{
    return m_failed_at_isValid;
}

qint32 OAIRunObject::getCompletedAt() const {
    return completed_at;
}
void OAIRunObject::setCompletedAt(const qint32 &completed_at) {
    this->completed_at = completed_at;
    this->m_completed_at_isSet = true;
}

bool OAIRunObject::is_completed_at_Set() const{
    return m_completed_at_isSet;
}

bool OAIRunObject::is_completed_at_Valid() const{
    return m_completed_at_isValid;
}

OAIRunObject_incomplete_details OAIRunObject::getIncompleteDetails() const {
    return incomplete_details;
}
void OAIRunObject::setIncompleteDetails(const OAIRunObject_incomplete_details &incomplete_details) {
    this->incomplete_details = incomplete_details;
    this->m_incomplete_details_isSet = true;
}

bool OAIRunObject::is_incomplete_details_Set() const{
    return m_incomplete_details_isSet;
}

bool OAIRunObject::is_incomplete_details_Valid() const{
    return m_incomplete_details_isValid;
}

QString OAIRunObject::getModel() const {
    return model;
}
void OAIRunObject::setModel(const QString &model) {
    this->model = model;
    this->m_model_isSet = true;
}

bool OAIRunObject::is_model_Set() const{
    return m_model_isSet;
}

bool OAIRunObject::is_model_Valid() const{
    return m_model_isValid;
}

QString OAIRunObject::getInstructions() const {
    return instructions;
}
void OAIRunObject::setInstructions(const QString &instructions) {
    this->instructions = instructions;
    this->m_instructions_isSet = true;
}

bool OAIRunObject::is_instructions_Set() const{
    return m_instructions_isSet;
}

bool OAIRunObject::is_instructions_Valid() const{
    return m_instructions_isValid;
}

QList<OAIAssistantObject_tools_inner> OAIRunObject::getTools() const {
    return tools;
}
void OAIRunObject::setTools(const QList<OAIAssistantObject_tools_inner> &tools) {
    this->tools = tools;
    this->m_tools_isSet = true;
}

bool OAIRunObject::is_tools_Set() const{
    return m_tools_isSet;
}

bool OAIRunObject::is_tools_Valid() const{
    return m_tools_isValid;
}

QList<QString> OAIRunObject::getFileIds() const {
    return file_ids;
}
void OAIRunObject::setFileIds(const QList<QString> &file_ids) {
    this->file_ids = file_ids;
    this->m_file_ids_isSet = true;
}

bool OAIRunObject::is_file_ids_Set() const{
    return m_file_ids_isSet;
}

bool OAIRunObject::is_file_ids_Valid() const{
    return m_file_ids_isValid;
}

OAIObject OAIRunObject::getMetadata() const {
    return metadata;
}
void OAIRunObject::setMetadata(const OAIObject &metadata) {
    this->metadata = metadata;
    this->m_metadata_isSet = true;
}

bool OAIRunObject::is_metadata_Set() const{
    return m_metadata_isSet;
}

bool OAIRunObject::is_metadata_Valid() const{
    return m_metadata_isValid;
}

OAIRunCompletionUsage OAIRunObject::getUsage() const {
    return usage;
}
void OAIRunObject::setUsage(const OAIRunCompletionUsage &usage) {
    this->usage = usage;
    this->m_usage_isSet = true;
}

bool OAIRunObject::is_usage_Set() const{
    return m_usage_isSet;
}

bool OAIRunObject::is_usage_Valid() const{
    return m_usage_isValid;
}

double OAIRunObject::getTemperature() const {
    return temperature;
}
void OAIRunObject::setTemperature(const double &temperature) {
    this->temperature = temperature;
    this->m_temperature_isSet = true;
}

bool OAIRunObject::is_temperature_Set() const{
    return m_temperature_isSet;
}

bool OAIRunObject::is_temperature_Valid() const{
    return m_temperature_isValid;
}

qint32 OAIRunObject::getMaxPromptTokens() const {
    return max_prompt_tokens;
}
void OAIRunObject::setMaxPromptTokens(const qint32 &max_prompt_tokens) {
    this->max_prompt_tokens = max_prompt_tokens;
    this->m_max_prompt_tokens_isSet = true;
}

bool OAIRunObject::is_max_prompt_tokens_Set() const{
    return m_max_prompt_tokens_isSet;
}

bool OAIRunObject::is_max_prompt_tokens_Valid() const{
    return m_max_prompt_tokens_isValid;
}

qint32 OAIRunObject::getMaxCompletionTokens() const {
    return max_completion_tokens;
}
void OAIRunObject::setMaxCompletionTokens(const qint32 &max_completion_tokens) {
    this->max_completion_tokens = max_completion_tokens;
    this->m_max_completion_tokens_isSet = true;
}

bool OAIRunObject::is_max_completion_tokens_Set() const{
    return m_max_completion_tokens_isSet;
}

bool OAIRunObject::is_max_completion_tokens_Valid() const{
    return m_max_completion_tokens_isValid;
}

OAITruncationObject OAIRunObject::getTruncationStrategy() const {
    return truncation_strategy;
}
void OAIRunObject::setTruncationStrategy(const OAITruncationObject &truncation_strategy) {
    this->truncation_strategy = truncation_strategy;
    this->m_truncation_strategy_isSet = true;
}

bool OAIRunObject::is_truncation_strategy_Set() const{
    return m_truncation_strategy_isSet;
}

bool OAIRunObject::is_truncation_strategy_Valid() const{
    return m_truncation_strategy_isValid;
}

OAIAssistantsApiToolChoiceOption OAIRunObject::getToolChoice() const {
    return tool_choice;
}
void OAIRunObject::setToolChoice(const OAIAssistantsApiToolChoiceOption &tool_choice) {
    this->tool_choice = tool_choice;
    this->m_tool_choice_isSet = true;
}

bool OAIRunObject::is_tool_choice_Set() const{
    return m_tool_choice_isSet;
}

bool OAIRunObject::is_tool_choice_Valid() const{
    return m_tool_choice_isValid;
}

OAIAssistantsApiResponseFormatOption OAIRunObject::getResponseFormat() const {
    return response_format;
}
void OAIRunObject::setResponseFormat(const OAIAssistantsApiResponseFormatOption &response_format) {
    this->response_format = response_format;
    this->m_response_format_isSet = true;
}

bool OAIRunObject::is_response_format_Set() const{
    return m_response_format_isSet;
}

bool OAIRunObject::is_response_format_Valid() const{
    return m_response_format_isValid;
}

bool OAIRunObject::isSet() const {
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

        if (m_created_at_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_thread_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_assistant_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_status_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (required_action.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (last_error.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_expires_at_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_started_at_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_cancelled_at_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_failed_at_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_completed_at_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (incomplete_details.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_model_isSet) {
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

        if (file_ids.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_metadata_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (usage.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_temperature_isSet) {
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

bool OAIRunObject::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_id_isValid && m_object_isValid && m_created_at_isValid && m_thread_id_isValid && m_assistant_id_isValid && m_status_isValid && m_required_action_isValid && m_last_error_isValid && m_expires_at_isValid && m_started_at_isValid && m_cancelled_at_isValid && m_failed_at_isValid && m_completed_at_isValid && m_incomplete_details_isValid && m_model_isValid && m_instructions_isValid && m_tools_isValid && m_file_ids_isValid && m_metadata_isValid && m_usage_isValid && m_max_prompt_tokens_isValid && m_max_completion_tokens_isValid && m_truncation_strategy_isValid && m_tool_choice_isValid && m_response_format_isValid && true;
}

} // namespace OpenAPI