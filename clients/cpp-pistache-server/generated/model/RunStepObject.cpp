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


#include "RunStepObject.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

RunStepObject::RunStepObject()
{
    m_Id = "";
    m_object = "";
    m_Created_at = 0;
    m_Assistant_id = "";
    m_Thread_id = "";
    m_Run_id = "";
    m_Type = "";
    m_Status = "";
    m_Expired_at = 0;
    m_Cancelled_at = 0;
    m_Failed_at = 0;
    m_Completed_at = 0;
    
}

void RunStepObject::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool RunStepObject::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool RunStepObject::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "RunStepObject" : pathPrefix;

                                        
    if (!m_Step_details.validate(msg, _pathPrefix + ".stepDetails")) {
        msg << _pathPrefix << ": Step_details is invalid;";
        success = false;
    }    
    if (!m_Last_error.validate(msg, _pathPrefix + ".lastError")) {
        msg << _pathPrefix << ": Last_error is invalid;";
        success = false;
    }                        
    if (!m_Usage.validate(msg, _pathPrefix + ".usage")) {
        msg << _pathPrefix << ": Usage is invalid;";
        success = false;
    }
    return success;
}

bool RunStepObject::operator==(const RunStepObject& rhs) const
{
    return
    
    
    (getId() == rhs.getId())
     &&
    
    (getObject() == rhs.getObject())
     &&
    
    (getCreatedAt() == rhs.getCreatedAt())
     &&
    
    (getAssistantId() == rhs.getAssistantId())
     &&
    
    (getThreadId() == rhs.getThreadId())
     &&
    
    (getRunId() == rhs.getRunId())
     &&
    
    (getType() == rhs.getType())
     &&
    
    (getStatus() == rhs.getStatus())
     &&
    
    (getStepDetails() == rhs.getStepDetails())
     &&
    
    (getLastError() == rhs.getLastError())
     &&
    
    (getExpiredAt() == rhs.getExpiredAt())
     &&
    
    (getCancelledAt() == rhs.getCancelledAt())
     &&
    
    (getFailedAt() == rhs.getFailedAt())
     &&
    
    (getCompletedAt() == rhs.getCompletedAt())
     &&
    
    (getMetadata() == rhs.getMetadata())
     &&
    
    (getUsage() == rhs.getUsage())
    
    
    ;
}

bool RunStepObject::operator!=(const RunStepObject& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const RunStepObject& o)
{
    j = nlohmann::json::object();
    j["id"] = o.m_Id;
    j["object"] = o.m_object;
    j["created_at"] = o.m_Created_at;
    j["assistant_id"] = o.m_Assistant_id;
    j["thread_id"] = o.m_Thread_id;
    j["run_id"] = o.m_Run_id;
    j["type"] = o.m_Type;
    j["status"] = o.m_Status;
    j["step_details"] = o.m_Step_details;
    j["last_error"] = o.m_Last_error;
    j["expired_at"] = o.m_Expired_at;
    j["cancelled_at"] = o.m_Cancelled_at;
    j["failed_at"] = o.m_Failed_at;
    j["completed_at"] = o.m_Completed_at;
    j["metadata"] = o.m_Metadata;
    j["usage"] = o.m_Usage;
    
}

void from_json(const nlohmann::json& j, RunStepObject& o)
{
    j.at("id").get_to(o.m_Id);
    j.at("object").get_to(o.m_object);
    j.at("created_at").get_to(o.m_Created_at);
    j.at("assistant_id").get_to(o.m_Assistant_id);
    j.at("thread_id").get_to(o.m_Thread_id);
    j.at("run_id").get_to(o.m_Run_id);
    j.at("type").get_to(o.m_Type);
    j.at("status").get_to(o.m_Status);
    j.at("step_details").get_to(o.m_Step_details);
    j.at("last_error").get_to(o.m_Last_error);
    j.at("expired_at").get_to(o.m_Expired_at);
    j.at("cancelled_at").get_to(o.m_Cancelled_at);
    j.at("failed_at").get_to(o.m_Failed_at);
    j.at("completed_at").get_to(o.m_Completed_at);
    j.at("metadata").get_to(o.m_Metadata);
    j.at("usage").get_to(o.m_Usage);
    
}

std::string RunStepObject::getId() const
{
    return m_Id;
}
void RunStepObject::setId(std::string const& value)
{
    m_Id = value;
}
std::string RunStepObject::getObject() const
{
    return m_object;
}
void RunStepObject::setObject(std::string const& value)
{
    m_object = value;
}
int32_t RunStepObject::getCreatedAt() const
{
    return m_Created_at;
}
void RunStepObject::setCreatedAt(int32_t const value)
{
    m_Created_at = value;
}
std::string RunStepObject::getAssistantId() const
{
    return m_Assistant_id;
}
void RunStepObject::setAssistantId(std::string const& value)
{
    m_Assistant_id = value;
}
std::string RunStepObject::getThreadId() const
{
    return m_Thread_id;
}
void RunStepObject::setThreadId(std::string const& value)
{
    m_Thread_id = value;
}
std::string RunStepObject::getRunId() const
{
    return m_Run_id;
}
void RunStepObject::setRunId(std::string const& value)
{
    m_Run_id = value;
}
std::string RunStepObject::getType() const
{
    return m_Type;
}
void RunStepObject::setType(std::string const& value)
{
    m_Type = value;
}
std::string RunStepObject::getStatus() const
{
    return m_Status;
}
void RunStepObject::setStatus(std::string const& value)
{
    m_Status = value;
}
org::openapitools::server::model::RunStepObject_step_details RunStepObject::getStepDetails() const
{
    return m_Step_details;
}
void RunStepObject::setStepDetails(org::openapitools::server::model::RunStepObject_step_details const& value)
{
    m_Step_details = value;
}
org::openapitools::server::model::RunStepObject_last_error RunStepObject::getLastError() const
{
    return m_Last_error;
}
void RunStepObject::setLastError(org::openapitools::server::model::RunStepObject_last_error const& value)
{
    m_Last_error = value;
}
int32_t RunStepObject::getExpiredAt() const
{
    return m_Expired_at;
}
void RunStepObject::setExpiredAt(int32_t const value)
{
    m_Expired_at = value;
}
int32_t RunStepObject::getCancelledAt() const
{
    return m_Cancelled_at;
}
void RunStepObject::setCancelledAt(int32_t const value)
{
    m_Cancelled_at = value;
}
int32_t RunStepObject::getFailedAt() const
{
    return m_Failed_at;
}
void RunStepObject::setFailedAt(int32_t const value)
{
    m_Failed_at = value;
}
int32_t RunStepObject::getCompletedAt() const
{
    return m_Completed_at;
}
void RunStepObject::setCompletedAt(int32_t const value)
{
    m_Completed_at = value;
}
nlohmann::json RunStepObject::getMetadata() const
{
    return m_Metadata;
}
void RunStepObject::setMetadata(nlohmann::json const& value)
{
    m_Metadata = value;
}
org::openapitools::server::model::RunStepCompletionUsage RunStepObject::getUsage() const
{
    return m_Usage;
}
void RunStepObject::setUsage(org::openapitools::server::model::RunStepCompletionUsage const& value)
{
    m_Usage = value;
}


} // namespace org::openapitools::server::model

