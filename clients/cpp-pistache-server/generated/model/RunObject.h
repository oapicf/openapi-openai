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
/*
 * RunObject.h
 *
 * Represents an execution run on a [thread](/docs/api-reference/threads).
 */

#ifndef RunObject_H_
#define RunObject_H_


#include "TruncationObject.h"
#include "AssistantObject_tools_inner.h"
#include "RunCompletionUsage.h"
#include "RunObject_required_action.h"
#include <string>
#include "AssistantsApiResponseFormatOption.h"
#include "Object.h"
#include "AssistantsApiToolChoiceOption.h"
#include <vector>
#include "RunObject_incomplete_details.h"
#include "RunObject_last_error.h"
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Represents an execution run on a [thread](/docs/api-reference/threads).
/// </summary>
class  RunObject
{
public:
    RunObject();
    virtual ~RunObject() = default;


    /// <summary>
    /// Validate the current data in the model. Throws a ValidationException on failure.
    /// </summary>
    void validate() const;

    /// <summary>
    /// Validate the current data in the model. Returns false on error and writes an error
    /// message into the given stringstream.
    /// </summary>
    bool validate(std::stringstream& msg) const;

    /// <summary>
    /// Helper overload for validate. Used when one model stores another model and calls it's validate.
    /// Not meant to be called outside that case.
    /// </summary>
    bool validate(std::stringstream& msg, const std::string& pathPrefix) const;

    bool operator==(const RunObject& rhs) const;
    bool operator!=(const RunObject& rhs) const;

    /////////////////////////////////////////////
    /// RunObject members

    /// <summary>
    /// The identifier, which can be referenced in API endpoints.
    /// </summary>
    std::string getId() const;
    void setId(std::string const& value);
    /// <summary>
    /// The object type, which is always &#x60;thread.run&#x60;.
    /// </summary>
    std::string getObject() const;
    void setObject(std::string const& value);
    /// <summary>
    /// The Unix timestamp (in seconds) for when the run was created.
    /// </summary>
    int32_t getCreatedAt() const;
    void setCreatedAt(int32_t const value);
    /// <summary>
    /// The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run.
    /// </summary>
    std::string getThreadId() const;
    void setThreadId(std::string const& value);
    /// <summary>
    /// The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run.
    /// </summary>
    std::string getAssistantId() const;
    void setAssistantId(std::string const& value);
    /// <summary>
    /// The status of the run, which can be either &#x60;queued&#x60;, &#x60;in_progress&#x60;, &#x60;requires_action&#x60;, &#x60;cancelling&#x60;, &#x60;cancelled&#x60;, &#x60;failed&#x60;, &#x60;completed&#x60;, or &#x60;expired&#x60;.
    /// </summary>
    std::string getStatus() const;
    void setStatus(std::string const& value);
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::RunObject_required_action getRequiredAction() const;
    void setRequiredAction(org::openapitools::server::model::RunObject_required_action const& value);
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::RunObject_last_error getLastError() const;
    void setLastError(org::openapitools::server::model::RunObject_last_error const& value);
    /// <summary>
    /// The Unix timestamp (in seconds) for when the run will expire.
    /// </summary>
    int32_t getExpiresAt() const;
    void setExpiresAt(int32_t const value);
    /// <summary>
    /// The Unix timestamp (in seconds) for when the run was started.
    /// </summary>
    int32_t getStartedAt() const;
    void setStartedAt(int32_t const value);
    /// <summary>
    /// The Unix timestamp (in seconds) for when the run was cancelled.
    /// </summary>
    int32_t getCancelledAt() const;
    void setCancelledAt(int32_t const value);
    /// <summary>
    /// The Unix timestamp (in seconds) for when the run failed.
    /// </summary>
    int32_t getFailedAt() const;
    void setFailedAt(int32_t const value);
    /// <summary>
    /// The Unix timestamp (in seconds) for when the run was completed.
    /// </summary>
    int32_t getCompletedAt() const;
    void setCompletedAt(int32_t const value);
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::RunObject_incomplete_details getIncompleteDetails() const;
    void setIncompleteDetails(org::openapitools::server::model::RunObject_incomplete_details const& value);
    /// <summary>
    /// The model that the [assistant](/docs/api-reference/assistants) used for this run.
    /// </summary>
    std::string getModel() const;
    void setModel(std::string const& value);
    /// <summary>
    /// The instructions that the [assistant](/docs/api-reference/assistants) used for this run.
    /// </summary>
    std::string getInstructions() const;
    void setInstructions(std::string const& value);
    /// <summary>
    /// The list of tools that the [assistant](/docs/api-reference/assistants) used for this run.
    /// </summary>
    std::vector<org::openapitools::server::model::AssistantObject_tools_inner> getTools() const;
    void setTools(std::vector<org::openapitools::server::model::AssistantObject_tools_inner> const& value);
    /// <summary>
    /// The list of [File](/docs/api-reference/files) IDs the [assistant](/docs/api-reference/assistants) used for this run.
    /// </summary>
    std::vector<std::string> getFileIds() const;
    void setFileIds(std::vector<std::string> const& value);
    /// <summary>
    /// Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
    /// </summary>
    org::openapitools::server::model::Object getMetadata() const;
    void setMetadata(org::openapitools::server::model::Object const& value);
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::RunCompletionUsage getUsage() const;
    void setUsage(org::openapitools::server::model::RunCompletionUsage const& value);
    /// <summary>
    /// The sampling temperature used for this run. If not set, defaults to 1.
    /// </summary>
    double getTemperature() const;
    void setTemperature(double const value);
    bool temperatureIsSet() const;
    void unsetTemperature();
    /// <summary>
    /// The maximum number of prompt tokens specified to have been used over the course of the run. 
    /// </summary>
    int32_t getMaxPromptTokens() const;
    void setMaxPromptTokens(int32_t const value);
    /// <summary>
    /// The maximum number of completion tokens specified to have been used over the course of the run. 
    /// </summary>
    int32_t getMaxCompletionTokens() const;
    void setMaxCompletionTokens(int32_t const value);
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::TruncationObject getTruncationStrategy() const;
    void setTruncationStrategy(org::openapitools::server::model::TruncationObject const& value);
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::AssistantsApiToolChoiceOption getToolChoice() const;
    void setToolChoice(org::openapitools::server::model::AssistantsApiToolChoiceOption const& value);
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::AssistantsApiResponseFormatOption getResponseFormat() const;
    void setResponseFormat(org::openapitools::server::model::AssistantsApiResponseFormatOption const& value);

    friend  void to_json(nlohmann::json& j, const RunObject& o);
    friend  void from_json(const nlohmann::json& j, RunObject& o);
protected:
    std::string m_Id;

    std::string m_object;

    int32_t m_Created_at;

    std::string m_Thread_id;

    std::string m_Assistant_id;

    std::string m_Status;

    org::openapitools::server::model::RunObject_required_action m_Required_action;

    org::openapitools::server::model::RunObject_last_error m_Last_error;

    int32_t m_Expires_at;

    int32_t m_Started_at;

    int32_t m_Cancelled_at;

    int32_t m_Failed_at;

    int32_t m_Completed_at;

    org::openapitools::server::model::RunObject_incomplete_details m_Incomplete_details;

    std::string m_Model;

    std::string m_Instructions;

    std::vector<org::openapitools::server::model::AssistantObject_tools_inner> m_Tools;

    std::vector<std::string> m_File_ids;

    org::openapitools::server::model::Object m_Metadata;

    org::openapitools::server::model::RunCompletionUsage m_Usage;

    double m_Temperature;
    bool m_TemperatureIsSet;
    int32_t m_Max_prompt_tokens;

    int32_t m_Max_completion_tokens;

    org::openapitools::server::model::TruncationObject m_Truncation_strategy;

    org::openapitools::server::model::AssistantsApiToolChoiceOption m_Tool_choice;

    org::openapitools::server::model::AssistantsApiResponseFormatOption m_Response_format;

    
};

} // namespace org::openapitools::server::model

#endif /* RunObject_H_ */
