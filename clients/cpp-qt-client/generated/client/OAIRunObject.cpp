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

    m_id_isValid = ::OpenAPI::fromJsonValue(m_id, json[QString("id")]);
    m_id_isSet = !json[QString("id")].isNull() && m_id_isValid;

    m_object_isValid = ::OpenAPI::fromJsonValue(m_object, json[QString("object")]);
    m_object_isSet = !json[QString("object")].isNull() && m_object_isValid;

    m_created_at_isValid = ::OpenAPI::fromJsonValue(m_created_at, json[QString("created_at")]);
    m_created_at_isSet = !json[QString("created_at")].isNull() && m_created_at_isValid;

    m_thread_id_isValid = ::OpenAPI::fromJsonValue(m_thread_id, json[QString("thread_id")]);
    m_thread_id_isSet = !json[QString("thread_id")].isNull() && m_thread_id_isValid;

    m_assistant_id_isValid = ::OpenAPI::fromJsonValue(m_assistant_id, json[QString("assistant_id")]);
    m_assistant_id_isSet = !json[QString("assistant_id")].isNull() && m_assistant_id_isValid;

    m_status_isValid = ::OpenAPI::fromJsonValue(m_status, json[QString("status")]);
    m_status_isSet = !json[QString("status")].isNull() && m_status_isValid;

    m_required_action_isValid = ::OpenAPI::fromJsonValue(m_required_action, json[QString("required_action")]);
    m_required_action_isSet = !json[QString("required_action")].isNull() && m_required_action_isValid;

    m_last_error_isValid = ::OpenAPI::fromJsonValue(m_last_error, json[QString("last_error")]);
    m_last_error_isSet = !json[QString("last_error")].isNull() && m_last_error_isValid;

    m_expires_at_isValid = ::OpenAPI::fromJsonValue(m_expires_at, json[QString("expires_at")]);
    m_expires_at_isSet = !json[QString("expires_at")].isNull() && m_expires_at_isValid;

    m_started_at_isValid = ::OpenAPI::fromJsonValue(m_started_at, json[QString("started_at")]);
    m_started_at_isSet = !json[QString("started_at")].isNull() && m_started_at_isValid;

    m_cancelled_at_isValid = ::OpenAPI::fromJsonValue(m_cancelled_at, json[QString("cancelled_at")]);
    m_cancelled_at_isSet = !json[QString("cancelled_at")].isNull() && m_cancelled_at_isValid;

    m_failed_at_isValid = ::OpenAPI::fromJsonValue(m_failed_at, json[QString("failed_at")]);
    m_failed_at_isSet = !json[QString("failed_at")].isNull() && m_failed_at_isValid;

    m_completed_at_isValid = ::OpenAPI::fromJsonValue(m_completed_at, json[QString("completed_at")]);
    m_completed_at_isSet = !json[QString("completed_at")].isNull() && m_completed_at_isValid;

    m_incomplete_details_isValid = ::OpenAPI::fromJsonValue(m_incomplete_details, json[QString("incomplete_details")]);
    m_incomplete_details_isSet = !json[QString("incomplete_details")].isNull() && m_incomplete_details_isValid;

    m_model_isValid = ::OpenAPI::fromJsonValue(m_model, json[QString("model")]);
    m_model_isSet = !json[QString("model")].isNull() && m_model_isValid;

    m_instructions_isValid = ::OpenAPI::fromJsonValue(m_instructions, json[QString("instructions")]);
    m_instructions_isSet = !json[QString("instructions")].isNull() && m_instructions_isValid;

    m_tools_isValid = ::OpenAPI::fromJsonValue(m_tools, json[QString("tools")]);
    m_tools_isSet = !json[QString("tools")].isNull() && m_tools_isValid;

    m_file_ids_isValid = ::OpenAPI::fromJsonValue(m_file_ids, json[QString("file_ids")]);
    m_file_ids_isSet = !json[QString("file_ids")].isNull() && m_file_ids_isValid;

    m_metadata_isValid = ::OpenAPI::fromJsonValue(m_metadata, json[QString("metadata")]);
    m_metadata_isSet = !json[QString("metadata")].isNull() && m_metadata_isValid;

    m_usage_isValid = ::OpenAPI::fromJsonValue(m_usage, json[QString("usage")]);
    m_usage_isSet = !json[QString("usage")].isNull() && m_usage_isValid;

    m_temperature_isValid = ::OpenAPI::fromJsonValue(m_temperature, json[QString("temperature")]);
    m_temperature_isSet = !json[QString("temperature")].isNull() && m_temperature_isValid;

    m_max_prompt_tokens_isValid = ::OpenAPI::fromJsonValue(m_max_prompt_tokens, json[QString("max_prompt_tokens")]);
    m_max_prompt_tokens_isSet = !json[QString("max_prompt_tokens")].isNull() && m_max_prompt_tokens_isValid;

    m_max_completion_tokens_isValid = ::OpenAPI::fromJsonValue(m_max_completion_tokens, json[QString("max_completion_tokens")]);
    m_max_completion_tokens_isSet = !json[QString("max_completion_tokens")].isNull() && m_max_completion_tokens_isValid;

    m_truncation_strategy_isValid = ::OpenAPI::fromJsonValue(m_truncation_strategy, json[QString("truncation_strategy")]);
    m_truncation_strategy_isSet = !json[QString("truncation_strategy")].isNull() && m_truncation_strategy_isValid;

    m_tool_choice_isValid = ::OpenAPI::fromJsonValue(m_tool_choice, json[QString("tool_choice")]);
    m_tool_choice_isSet = !json[QString("tool_choice")].isNull() && m_tool_choice_isValid;

    m_response_format_isValid = ::OpenAPI::fromJsonValue(m_response_format, json[QString("response_format")]);
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
        obj.insert(QString("id"), ::OpenAPI::toJsonValue(m_id));
    }
    if (m_object_isSet) {
        obj.insert(QString("object"), ::OpenAPI::toJsonValue(m_object));
    }
    if (m_created_at_isSet) {
        obj.insert(QString("created_at"), ::OpenAPI::toJsonValue(m_created_at));
    }
    if (m_thread_id_isSet) {
        obj.insert(QString("thread_id"), ::OpenAPI::toJsonValue(m_thread_id));
    }
    if (m_assistant_id_isSet) {
        obj.insert(QString("assistant_id"), ::OpenAPI::toJsonValue(m_assistant_id));
    }
    if (m_status_isSet) {
        obj.insert(QString("status"), ::OpenAPI::toJsonValue(m_status));
    }
    if (m_required_action.isSet()) {
        obj.insert(QString("required_action"), ::OpenAPI::toJsonValue(m_required_action));
    }
    if (m_last_error.isSet()) {
        obj.insert(QString("last_error"), ::OpenAPI::toJsonValue(m_last_error));
    }
    if (m_expires_at_isSet) {
        obj.insert(QString("expires_at"), ::OpenAPI::toJsonValue(m_expires_at));
    }
    if (m_started_at_isSet) {
        obj.insert(QString("started_at"), ::OpenAPI::toJsonValue(m_started_at));
    }
    if (m_cancelled_at_isSet) {
        obj.insert(QString("cancelled_at"), ::OpenAPI::toJsonValue(m_cancelled_at));
    }
    if (m_failed_at_isSet) {
        obj.insert(QString("failed_at"), ::OpenAPI::toJsonValue(m_failed_at));
    }
    if (m_completed_at_isSet) {
        obj.insert(QString("completed_at"), ::OpenAPI::toJsonValue(m_completed_at));
    }
    if (m_incomplete_details.isSet()) {
        obj.insert(QString("incomplete_details"), ::OpenAPI::toJsonValue(m_incomplete_details));
    }
    if (m_model_isSet) {
        obj.insert(QString("model"), ::OpenAPI::toJsonValue(m_model));
    }
    if (m_instructions_isSet) {
        obj.insert(QString("instructions"), ::OpenAPI::toJsonValue(m_instructions));
    }
    if (m_tools.size() > 0) {
        obj.insert(QString("tools"), ::OpenAPI::toJsonValue(m_tools));
    }
    if (m_file_ids.size() > 0) {
        obj.insert(QString("file_ids"), ::OpenAPI::toJsonValue(m_file_ids));
    }
    if (m_metadata_isSet) {
        obj.insert(QString("metadata"), ::OpenAPI::toJsonValue(m_metadata));
    }
    if (m_usage.isSet()) {
        obj.insert(QString("usage"), ::OpenAPI::toJsonValue(m_usage));
    }
    if (m_temperature_isSet) {
        obj.insert(QString("temperature"), ::OpenAPI::toJsonValue(m_temperature));
    }
    if (m_max_prompt_tokens_isSet) {
        obj.insert(QString("max_prompt_tokens"), ::OpenAPI::toJsonValue(m_max_prompt_tokens));
    }
    if (m_max_completion_tokens_isSet) {
        obj.insert(QString("max_completion_tokens"), ::OpenAPI::toJsonValue(m_max_completion_tokens));
    }
    if (m_truncation_strategy.isSet()) {
        obj.insert(QString("truncation_strategy"), ::OpenAPI::toJsonValue(m_truncation_strategy));
    }
    if (m_tool_choice.isSet()) {
        obj.insert(QString("tool_choice"), ::OpenAPI::toJsonValue(m_tool_choice));
    }
    if (m_response_format.isSet()) {
        obj.insert(QString("response_format"), ::OpenAPI::toJsonValue(m_response_format));
    }
    return obj;
}

QString OAIRunObject::getId() const {
    return m_id;
}
void OAIRunObject::setId(const QString &id) {
    m_id = id;
    m_id_isSet = true;
}

bool OAIRunObject::is_id_Set() const{
    return m_id_isSet;
}

bool OAIRunObject::is_id_Valid() const{
    return m_id_isValid;
}

QString OAIRunObject::getObject() const {
    return m_object;
}
void OAIRunObject::setObject(const QString &object) {
    m_object = object;
    m_object_isSet = true;
}

bool OAIRunObject::is_object_Set() const{
    return m_object_isSet;
}

bool OAIRunObject::is_object_Valid() const{
    return m_object_isValid;
}

qint32 OAIRunObject::getCreatedAt() const {
    return m_created_at;
}
void OAIRunObject::setCreatedAt(const qint32 &created_at) {
    m_created_at = created_at;
    m_created_at_isSet = true;
}

bool OAIRunObject::is_created_at_Set() const{
    return m_created_at_isSet;
}

bool OAIRunObject::is_created_at_Valid() const{
    return m_created_at_isValid;
}

QString OAIRunObject::getThreadId() const {
    return m_thread_id;
}
void OAIRunObject::setThreadId(const QString &thread_id) {
    m_thread_id = thread_id;
    m_thread_id_isSet = true;
}

bool OAIRunObject::is_thread_id_Set() const{
    return m_thread_id_isSet;
}

bool OAIRunObject::is_thread_id_Valid() const{
    return m_thread_id_isValid;
}

QString OAIRunObject::getAssistantId() const {
    return m_assistant_id;
}
void OAIRunObject::setAssistantId(const QString &assistant_id) {
    m_assistant_id = assistant_id;
    m_assistant_id_isSet = true;
}

bool OAIRunObject::is_assistant_id_Set() const{
    return m_assistant_id_isSet;
}

bool OAIRunObject::is_assistant_id_Valid() const{
    return m_assistant_id_isValid;
}

QString OAIRunObject::getStatus() const {
    return m_status;
}
void OAIRunObject::setStatus(const QString &status) {
    m_status = status;
    m_status_isSet = true;
}

bool OAIRunObject::is_status_Set() const{
    return m_status_isSet;
}

bool OAIRunObject::is_status_Valid() const{
    return m_status_isValid;
}

OAIRunObject_required_action OAIRunObject::getRequiredAction() const {
    return m_required_action;
}
void OAIRunObject::setRequiredAction(const OAIRunObject_required_action &required_action) {
    m_required_action = required_action;
    m_required_action_isSet = true;
}

bool OAIRunObject::is_required_action_Set() const{
    return m_required_action_isSet;
}

bool OAIRunObject::is_required_action_Valid() const{
    return m_required_action_isValid;
}

OAIRunObject_last_error OAIRunObject::getLastError() const {
    return m_last_error;
}
void OAIRunObject::setLastError(const OAIRunObject_last_error &last_error) {
    m_last_error = last_error;
    m_last_error_isSet = true;
}

bool OAIRunObject::is_last_error_Set() const{
    return m_last_error_isSet;
}

bool OAIRunObject::is_last_error_Valid() const{
    return m_last_error_isValid;
}

qint32 OAIRunObject::getExpiresAt() const {
    return m_expires_at;
}
void OAIRunObject::setExpiresAt(const qint32 &expires_at) {
    m_expires_at = expires_at;
    m_expires_at_isSet = true;
}

bool OAIRunObject::is_expires_at_Set() const{
    return m_expires_at_isSet;
}

bool OAIRunObject::is_expires_at_Valid() const{
    return m_expires_at_isValid;
}

qint32 OAIRunObject::getStartedAt() const {
    return m_started_at;
}
void OAIRunObject::setStartedAt(const qint32 &started_at) {
    m_started_at = started_at;
    m_started_at_isSet = true;
}

bool OAIRunObject::is_started_at_Set() const{
    return m_started_at_isSet;
}

bool OAIRunObject::is_started_at_Valid() const{
    return m_started_at_isValid;
}

qint32 OAIRunObject::getCancelledAt() const {
    return m_cancelled_at;
}
void OAIRunObject::setCancelledAt(const qint32 &cancelled_at) {
    m_cancelled_at = cancelled_at;
    m_cancelled_at_isSet = true;
}

bool OAIRunObject::is_cancelled_at_Set() const{
    return m_cancelled_at_isSet;
}

bool OAIRunObject::is_cancelled_at_Valid() const{
    return m_cancelled_at_isValid;
}

qint32 OAIRunObject::getFailedAt() const {
    return m_failed_at;
}
void OAIRunObject::setFailedAt(const qint32 &failed_at) {
    m_failed_at = failed_at;
    m_failed_at_isSet = true;
}

bool OAIRunObject::is_failed_at_Set() const{
    return m_failed_at_isSet;
}

bool OAIRunObject::is_failed_at_Valid() const{
    return m_failed_at_isValid;
}

qint32 OAIRunObject::getCompletedAt() const {
    return m_completed_at;
}
void OAIRunObject::setCompletedAt(const qint32 &completed_at) {
    m_completed_at = completed_at;
    m_completed_at_isSet = true;
}

bool OAIRunObject::is_completed_at_Set() const{
    return m_completed_at_isSet;
}

bool OAIRunObject::is_completed_at_Valid() const{
    return m_completed_at_isValid;
}

OAIRunObject_incomplete_details OAIRunObject::getIncompleteDetails() const {
    return m_incomplete_details;
}
void OAIRunObject::setIncompleteDetails(const OAIRunObject_incomplete_details &incomplete_details) {
    m_incomplete_details = incomplete_details;
    m_incomplete_details_isSet = true;
}

bool OAIRunObject::is_incomplete_details_Set() const{
    return m_incomplete_details_isSet;
}

bool OAIRunObject::is_incomplete_details_Valid() const{
    return m_incomplete_details_isValid;
}

QString OAIRunObject::getModel() const {
    return m_model;
}
void OAIRunObject::setModel(const QString &model) {
    m_model = model;
    m_model_isSet = true;
}

bool OAIRunObject::is_model_Set() const{
    return m_model_isSet;
}

bool OAIRunObject::is_model_Valid() const{
    return m_model_isValid;
}

QString OAIRunObject::getInstructions() const {
    return m_instructions;
}
void OAIRunObject::setInstructions(const QString &instructions) {
    m_instructions = instructions;
    m_instructions_isSet = true;
}

bool OAIRunObject::is_instructions_Set() const{
    return m_instructions_isSet;
}

bool OAIRunObject::is_instructions_Valid() const{
    return m_instructions_isValid;
}

QList<OAIAssistantObject_tools_inner> OAIRunObject::getTools() const {
    return m_tools;
}
void OAIRunObject::setTools(const QList<OAIAssistantObject_tools_inner> &tools) {
    m_tools = tools;
    m_tools_isSet = true;
}

bool OAIRunObject::is_tools_Set() const{
    return m_tools_isSet;
}

bool OAIRunObject::is_tools_Valid() const{
    return m_tools_isValid;
}

QList<QString> OAIRunObject::getFileIds() const {
    return m_file_ids;
}
void OAIRunObject::setFileIds(const QList<QString> &file_ids) {
    m_file_ids = file_ids;
    m_file_ids_isSet = true;
}

bool OAIRunObject::is_file_ids_Set() const{
    return m_file_ids_isSet;
}

bool OAIRunObject::is_file_ids_Valid() const{
    return m_file_ids_isValid;
}

OAIObject OAIRunObject::getMetadata() const {
    return m_metadata;
}
void OAIRunObject::setMetadata(const OAIObject &metadata) {
    m_metadata = metadata;
    m_metadata_isSet = true;
}

bool OAIRunObject::is_metadata_Set() const{
    return m_metadata_isSet;
}

bool OAIRunObject::is_metadata_Valid() const{
    return m_metadata_isValid;
}

OAIRunCompletionUsage OAIRunObject::getUsage() const {
    return m_usage;
}
void OAIRunObject::setUsage(const OAIRunCompletionUsage &usage) {
    m_usage = usage;
    m_usage_isSet = true;
}

bool OAIRunObject::is_usage_Set() const{
    return m_usage_isSet;
}

bool OAIRunObject::is_usage_Valid() const{
    return m_usage_isValid;
}

double OAIRunObject::getTemperature() const {
    return m_temperature;
}
void OAIRunObject::setTemperature(const double &temperature) {
    m_temperature = temperature;
    m_temperature_isSet = true;
}

bool OAIRunObject::is_temperature_Set() const{
    return m_temperature_isSet;
}

bool OAIRunObject::is_temperature_Valid() const{
    return m_temperature_isValid;
}

qint32 OAIRunObject::getMaxPromptTokens() const {
    return m_max_prompt_tokens;
}
void OAIRunObject::setMaxPromptTokens(const qint32 &max_prompt_tokens) {
    m_max_prompt_tokens = max_prompt_tokens;
    m_max_prompt_tokens_isSet = true;
}

bool OAIRunObject::is_max_prompt_tokens_Set() const{
    return m_max_prompt_tokens_isSet;
}

bool OAIRunObject::is_max_prompt_tokens_Valid() const{
    return m_max_prompt_tokens_isValid;
}

qint32 OAIRunObject::getMaxCompletionTokens() const {
    return m_max_completion_tokens;
}
void OAIRunObject::setMaxCompletionTokens(const qint32 &max_completion_tokens) {
    m_max_completion_tokens = max_completion_tokens;
    m_max_completion_tokens_isSet = true;
}

bool OAIRunObject::is_max_completion_tokens_Set() const{
    return m_max_completion_tokens_isSet;
}

bool OAIRunObject::is_max_completion_tokens_Valid() const{
    return m_max_completion_tokens_isValid;
}

OAITruncationObject OAIRunObject::getTruncationStrategy() const {
    return m_truncation_strategy;
}
void OAIRunObject::setTruncationStrategy(const OAITruncationObject &truncation_strategy) {
    m_truncation_strategy = truncation_strategy;
    m_truncation_strategy_isSet = true;
}

bool OAIRunObject::is_truncation_strategy_Set() const{
    return m_truncation_strategy_isSet;
}

bool OAIRunObject::is_truncation_strategy_Valid() const{
    return m_truncation_strategy_isValid;
}

OAIAssistantsApiToolChoiceOption OAIRunObject::getToolChoice() const {
    return m_tool_choice;
}
void OAIRunObject::setToolChoice(const OAIAssistantsApiToolChoiceOption &tool_choice) {
    m_tool_choice = tool_choice;
    m_tool_choice_isSet = true;
}

bool OAIRunObject::is_tool_choice_Set() const{
    return m_tool_choice_isSet;
}

bool OAIRunObject::is_tool_choice_Valid() const{
    return m_tool_choice_isValid;
}

OAIAssistantsApiResponseFormatOption OAIRunObject::getResponseFormat() const {
    return m_response_format;
}
void OAIRunObject::setResponseFormat(const OAIAssistantsApiResponseFormatOption &response_format) {
    m_response_format = response_format;
    m_response_format_isSet = true;
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

        if (m_required_action.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_last_error.isSet()) {
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

        if (m_incomplete_details.isSet()) {
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

        if (m_tools.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_file_ids.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_metadata_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_usage.isSet()) {
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

        if (m_truncation_strategy.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_tool_choice.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_response_format.isSet()) {
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
