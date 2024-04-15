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
 * RunStepObject.h
 *
 * Represents a step in execution of a run. 
 */

#ifndef RunStepObject_H_
#define RunStepObject_H_


#include "RunStepObject_last_error.h"
#include <string>
#include "RunStepObject_step_details.h"
#include "Object.h"
#include "RunStepCompletionUsage.h"
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Represents a step in execution of a run. 
/// </summary>
class  RunStepObject
{
public:
    RunStepObject();
    virtual ~RunStepObject() = default;


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

    bool operator==(const RunStepObject& rhs) const;
    bool operator!=(const RunStepObject& rhs) const;

    /////////////////////////////////////////////
    /// RunStepObject members

    /// <summary>
    /// The identifier of the run step, which can be referenced in API endpoints.
    /// </summary>
    std::string getId() const;
    void setId(std::string const& value);
    /// <summary>
    /// The object type, which is always &#x60;thread.run.step&#x60;.
    /// </summary>
    std::string getObject() const;
    void setObject(std::string const& value);
    /// <summary>
    /// The Unix timestamp (in seconds) for when the run step was created.
    /// </summary>
    int32_t getCreatedAt() const;
    void setCreatedAt(int32_t const value);
    /// <summary>
    /// The ID of the [assistant](/docs/api-reference/assistants) associated with the run step.
    /// </summary>
    std::string getAssistantId() const;
    void setAssistantId(std::string const& value);
    /// <summary>
    /// The ID of the [thread](/docs/api-reference/threads) that was run.
    /// </summary>
    std::string getThreadId() const;
    void setThreadId(std::string const& value);
    /// <summary>
    /// The ID of the [run](/docs/api-reference/runs) that this run step is a part of.
    /// </summary>
    std::string getRunId() const;
    void setRunId(std::string const& value);
    /// <summary>
    /// The type of run step, which can be either &#x60;message_creation&#x60; or &#x60;tool_calls&#x60;.
    /// </summary>
    std::string getType() const;
    void setType(std::string const& value);
    /// <summary>
    /// The status of the run step, which can be either &#x60;in_progress&#x60;, &#x60;cancelled&#x60;, &#x60;failed&#x60;, &#x60;completed&#x60;, or &#x60;expired&#x60;.
    /// </summary>
    std::string getStatus() const;
    void setStatus(std::string const& value);
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::RunStepObject_step_details getStepDetails() const;
    void setStepDetails(org::openapitools::server::model::RunStepObject_step_details const& value);
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::RunStepObject_last_error getLastError() const;
    void setLastError(org::openapitools::server::model::RunStepObject_last_error const& value);
    /// <summary>
    /// The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired.
    /// </summary>
    int32_t getExpiredAt() const;
    void setExpiredAt(int32_t const value);
    /// <summary>
    /// The Unix timestamp (in seconds) for when the run step was cancelled.
    /// </summary>
    int32_t getCancelledAt() const;
    void setCancelledAt(int32_t const value);
    /// <summary>
    /// The Unix timestamp (in seconds) for when the run step failed.
    /// </summary>
    int32_t getFailedAt() const;
    void setFailedAt(int32_t const value);
    /// <summary>
    /// The Unix timestamp (in seconds) for when the run step completed.
    /// </summary>
    int32_t getCompletedAt() const;
    void setCompletedAt(int32_t const value);
    /// <summary>
    /// Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
    /// </summary>
    org::openapitools::server::model::Object getMetadata() const;
    void setMetadata(org::openapitools::server::model::Object const& value);
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::RunStepCompletionUsage getUsage() const;
    void setUsage(org::openapitools::server::model::RunStepCompletionUsage const& value);

    friend  void to_json(nlohmann::json& j, const RunStepObject& o);
    friend  void from_json(const nlohmann::json& j, RunStepObject& o);
protected:
    std::string m_Id;

    std::string m_object;

    int32_t m_Created_at;

    std::string m_Assistant_id;

    std::string m_Thread_id;

    std::string m_Run_id;

    std::string m_Type;

    std::string m_Status;

    org::openapitools::server::model::RunStepObject_step_details m_Step_details;

    org::openapitools::server::model::RunStepObject_last_error m_Last_error;

    int32_t m_Expired_at;

    int32_t m_Cancelled_at;

    int32_t m_Failed_at;

    int32_t m_Completed_at;

    org::openapitools::server::model::Object m_Metadata;

    org::openapitools::server::model::RunStepCompletionUsage m_Usage;

    
};

} // namespace org::openapitools::server::model

#endif /* RunStepObject_H_ */