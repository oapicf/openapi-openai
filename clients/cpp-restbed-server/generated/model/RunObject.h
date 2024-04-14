/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.4.0.
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
#include "AssistantsApiToolChoiceOption.h"
#include <vector>
#include "RunObject_incomplete_details.h"
#include "RunObject_last_error.h"
#include <memory>
#include <vector>
#include <array>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Represents an execution run on a [thread](/docs/api-reference/threads).
/// </summary>
class  RunObject 
{
public:
    RunObject() = default;
    explicit RunObject(boost::property_tree::ptree const& pt);
    virtual ~RunObject() = default;

    RunObject(const RunObject& other) = default; // copy constructor
    RunObject(RunObject&& other) noexcept = default; // move constructor

    RunObject& operator=(const RunObject& other) = default; // copy assignment
    RunObject& operator=(RunObject&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// RunObject members

    /// <summary>
    /// The identifier, which can be referenced in API endpoints.
    /// </summary>
    std::string getId() const;
    void setId(std::string value);

    /// <summary>
    /// The object type, which is always &#x60;thread.run&#x60;.
    /// </summary>
    std::string getObject() const;
    void setObject(std::string value);

    /// <summary>
    /// The Unix timestamp (in seconds) for when the run was created.
    /// </summary>
    int32_t getCreatedAt() const;
    void setCreatedAt(int32_t value);

    /// <summary>
    /// The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run.
    /// </summary>
    std::string getThreadId() const;
    void setThreadId(std::string value);

    /// <summary>
    /// The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run.
    /// </summary>
    std::string getAssistantId() const;
    void setAssistantId(std::string value);

    /// <summary>
    /// The status of the run, which can be either &#x60;queued&#x60;, &#x60;in_progress&#x60;, &#x60;requires_action&#x60;, &#x60;cancelling&#x60;, &#x60;cancelled&#x60;, &#x60;failed&#x60;, &#x60;completed&#x60;, or &#x60;expired&#x60;.
    /// </summary>
    std::string getStatus() const;
    void setStatus(std::string value);

    /// <summary>
    /// 
    /// </summary>
    RunObject_required_action getRequiredAction() const;
    void setRequiredAction(RunObject_required_action value);

    /// <summary>
    /// 
    /// </summary>
    RunObject_last_error getLastError() const;
    void setLastError(RunObject_last_error value);

    /// <summary>
    /// The Unix timestamp (in seconds) for when the run will expire.
    /// </summary>
    int32_t getExpiresAt() const;
    void setExpiresAt(int32_t value);

    /// <summary>
    /// The Unix timestamp (in seconds) for when the run was started.
    /// </summary>
    int32_t getStartedAt() const;
    void setStartedAt(int32_t value);

    /// <summary>
    /// The Unix timestamp (in seconds) for when the run was cancelled.
    /// </summary>
    int32_t getCancelledAt() const;
    void setCancelledAt(int32_t value);

    /// <summary>
    /// The Unix timestamp (in seconds) for when the run failed.
    /// </summary>
    int32_t getFailedAt() const;
    void setFailedAt(int32_t value);

    /// <summary>
    /// The Unix timestamp (in seconds) for when the run was completed.
    /// </summary>
    int32_t getCompletedAt() const;
    void setCompletedAt(int32_t value);

    /// <summary>
    /// 
    /// </summary>
    RunObject_incomplete_details getIncompleteDetails() const;
    void setIncompleteDetails(RunObject_incomplete_details value);

    /// <summary>
    /// The model that the [assistant](/docs/api-reference/assistants) used for this run.
    /// </summary>
    std::string getModel() const;
    void setModel(std::string value);

    /// <summary>
    /// The instructions that the [assistant](/docs/api-reference/assistants) used for this run.
    /// </summary>
    std::string getInstructions() const;
    void setInstructions(std::string value);

    /// <summary>
    /// The list of tools that the [assistant](/docs/api-reference/assistants) used for this run.
    /// </summary>
    std::vector<AssistantObject_tools_inner> getTools() const;
    void setTools(std::vector<AssistantObject_tools_inner> value);

    /// <summary>
    /// The list of [File](/docs/api-reference/files) IDs the [assistant](/docs/api-reference/assistants) used for this run.
    /// </summary>
    std::vector<std::string> getFileIds() const;
    void setFileIds(std::vector<std::string> value);

    /// <summary>
    /// Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
    /// </summary>
    std::string getMetadata() const;
    void setMetadata(std::string value);

    /// <summary>
    /// 
    /// </summary>
    RunCompletionUsage getUsage() const;
    void setUsage(RunCompletionUsage value);

    /// <summary>
    /// The sampling temperature used for this run. If not set, defaults to 1.
    /// </summary>
    double getTemperature() const;
    void setTemperature(double value);

    /// <summary>
    /// The maximum number of prompt tokens specified to have been used over the course of the run. 
    /// </summary>
    int32_t getMaxPromptTokens() const;
    void setMaxPromptTokens(int32_t value);

    /// <summary>
    /// The maximum number of completion tokens specified to have been used over the course of the run. 
    /// </summary>
    int32_t getMaxCompletionTokens() const;
    void setMaxCompletionTokens(int32_t value);

    /// <summary>
    /// 
    /// </summary>
    TruncationObject getTruncationStrategy() const;
    void setTruncationStrategy(TruncationObject value);

    /// <summary>
    /// 
    /// </summary>
    AssistantsApiToolChoiceOption getToolChoice() const;
    void setToolChoice(AssistantsApiToolChoiceOption value);

    /// <summary>
    /// 
    /// </summary>
    AssistantsApiResponseFormatOption getResponseFormat() const;
    void setResponseFormat(AssistantsApiResponseFormatOption value);

protected:
    std::string m_Id = "";
    std::string m_object = "";
    int32_t m_Created_at = 0;
    std::string m_Thread_id = "";
    std::string m_Assistant_id = "";
    std::string m_Status = "";
    RunObject_required_action m_Required_action;
    RunObject_last_error m_Last_error;
    int32_t m_Expires_at = 0;
    int32_t m_Started_at = 0;
    int32_t m_Cancelled_at = 0;
    int32_t m_Failed_at = 0;
    int32_t m_Completed_at = 0;
    RunObject_incomplete_details m_Incomplete_details;
    std::string m_Model = "";
    std::string m_Instructions = "";
    std::vector<AssistantObject_tools_inner> m_Tools;
    std::vector<std::string> m_File_ids;
    std::string m_Metadata = std::string{};
    RunCompletionUsage m_Usage;
    double m_Temperature = 0.0;
    int32_t m_Max_prompt_tokens = 0;
    int32_t m_Max_completion_tokens = 0;
    TruncationObject m_Truncation_strategy;
    AssistantsApiToolChoiceOption m_Tool_choice;
    AssistantsApiResponseFormatOption m_Response_format;
};

std::vector<RunObject> createRunObjectVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<RunObject>(const RunObject& val) {
    return val.toPropertyTree();
}

template<>
inline RunObject fromPt<RunObject>(const boost::property_tree::ptree& pt) {
    RunObject ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* RunObject_H_ */
