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


#include "RunObject.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

RunObject::RunObject()
{
    m_Id = "";
    m_object = "";
    m_Created_at = 0;
    m_Thread_id = "";
    m_Assistant_id = "";
    m_Status = "";
    m_Expires_at = 0;
    m_Started_at = 0;
    m_Cancelled_at = 0;
    m_Failed_at = 0;
    m_Completed_at = 0;
    m_Model = "";
    m_Instructions = "";
    m_Temperature = 0.0;
    m_TemperatureIsSet = false;
    m_Max_prompt_tokens = 0;
    m_Max_completion_tokens = 0;
    
}

void RunObject::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool RunObject::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool RunObject::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "RunObject" : pathPrefix;

                                
    if (!m_Required_action.validate(msg, _pathPrefix + ".requiredAction")) {
        msg << _pathPrefix << ": Required_action is invalid;";
        success = false;
    }    
    if (!m_Last_error.validate(msg, _pathPrefix + ".lastError")) {
        msg << _pathPrefix << ": Last_error is invalid;";
        success = false;
    }                        
    if (!m_Incomplete_details.validate(msg, _pathPrefix + ".incompleteDetails")) {
        msg << _pathPrefix << ": Incomplete_details is invalid;";
        success = false;
    }             
    
    /* Tools */ {
        const std::vector<org::openapitools::server::model::AssistantObject_tools_inner>& value = m_Tools;
        const std::string currentValuePath = _pathPrefix + ".tools";
                
        
        if (value.size() > 20)
        {
            success = false;
            msg << currentValuePath << ": must have at most 20 elements;";
        }
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const org::openapitools::server::model::AssistantObject_tools_inner& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        success = value.validate(msg, currentValuePath + ".tools") && success;
 
                i++;
            }
        }

    }
         
    
    /* File_ids */ {
        const std::vector<std::string>& value = m_File_ids;
        const std::string currentValuePath = _pathPrefix + ".fileIds";
                
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const std::string& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        
 
                i++;
            }
        }

    }
            
    if (!m_Usage.validate(msg, _pathPrefix + ".usage")) {
        msg << _pathPrefix << ": Usage is invalid;";
        success = false;
    }         
    
    /* Max_prompt_tokens */ {
        const int32_t& value = m_Max_prompt_tokens;
        const std::string currentValuePath = _pathPrefix + ".maxPromptTokens";
                
        
        if (value < 256)
        {
            success = false;
            msg << currentValuePath << ": must be greater than or equal to 256;";
        }

    }
         
    
    /* Max_completion_tokens */ {
        const int32_t& value = m_Max_completion_tokens;
        const std::string currentValuePath = _pathPrefix + ".maxCompletionTokens";
                
        
        if (value < 256)
        {
            success = false;
            msg << currentValuePath << ": must be greater than or equal to 256;";
        }

    }
        
    if (!m_Truncation_strategy.validate(msg, _pathPrefix + ".truncationStrategy")) {
        msg << _pathPrefix << ": Truncation_strategy is invalid;";
        success = false;
    }    
    if (!m_Tool_choice.validate(msg, _pathPrefix + ".toolChoice")) {
        msg << _pathPrefix << ": Tool_choice is invalid;";
        success = false;
    }    
    if (!m_Response_format.validate(msg, _pathPrefix + ".responseFormat")) {
        msg << _pathPrefix << ": Response_format is invalid;";
        success = false;
    }
    return success;
}

bool RunObject::operator==(const RunObject& rhs) const
{
    return
    
    
    (getId() == rhs.getId())
     &&
    
    (getObject() == rhs.getObject())
     &&
    
    (getCreatedAt() == rhs.getCreatedAt())
     &&
    
    (getThreadId() == rhs.getThreadId())
     &&
    
    (getAssistantId() == rhs.getAssistantId())
     &&
    
    (getStatus() == rhs.getStatus())
     &&
    
    (getRequiredAction() == rhs.getRequiredAction())
     &&
    
    (getLastError() == rhs.getLastError())
     &&
    
    (getExpiresAt() == rhs.getExpiresAt())
     &&
    
    (getStartedAt() == rhs.getStartedAt())
     &&
    
    (getCancelledAt() == rhs.getCancelledAt())
     &&
    
    (getFailedAt() == rhs.getFailedAt())
     &&
    
    (getCompletedAt() == rhs.getCompletedAt())
     &&
    
    (getIncompleteDetails() == rhs.getIncompleteDetails())
     &&
    
    (getModel() == rhs.getModel())
     &&
    
    (getInstructions() == rhs.getInstructions())
     &&
    
    (getTools() == rhs.getTools())
     &&
    
    (getFileIds() == rhs.getFileIds())
     &&
    
    (getMetadata() == rhs.getMetadata())
     &&
    
    (getUsage() == rhs.getUsage())
     &&
    
    
    ((!temperatureIsSet() && !rhs.temperatureIsSet()) || (temperatureIsSet() && rhs.temperatureIsSet() && getTemperature() == rhs.getTemperature())) &&
    
    (getMaxPromptTokens() == rhs.getMaxPromptTokens())
     &&
    
    (getMaxCompletionTokens() == rhs.getMaxCompletionTokens())
     &&
    
    (getTruncationStrategy() == rhs.getTruncationStrategy())
     &&
    
    (getToolChoice() == rhs.getToolChoice())
     &&
    
    (getResponseFormat() == rhs.getResponseFormat())
    
    
    ;
}

bool RunObject::operator!=(const RunObject& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const RunObject& o)
{
    j = nlohmann::json::object();
    j["id"] = o.m_Id;
    j["object"] = o.m_object;
    j["created_at"] = o.m_Created_at;
    j["thread_id"] = o.m_Thread_id;
    j["assistant_id"] = o.m_Assistant_id;
    j["status"] = o.m_Status;
    j["required_action"] = o.m_Required_action;
    j["last_error"] = o.m_Last_error;
    j["expires_at"] = o.m_Expires_at;
    j["started_at"] = o.m_Started_at;
    j["cancelled_at"] = o.m_Cancelled_at;
    j["failed_at"] = o.m_Failed_at;
    j["completed_at"] = o.m_Completed_at;
    j["incomplete_details"] = o.m_Incomplete_details;
    j["model"] = o.m_Model;
    j["instructions"] = o.m_Instructions;
    j["tools"] = o.m_Tools;
    j["file_ids"] = o.m_File_ids;
    j["metadata"] = o.m_Metadata;
    j["usage"] = o.m_Usage;
    if(o.temperatureIsSet())
        j["temperature"] = o.m_Temperature;
    j["max_prompt_tokens"] = o.m_Max_prompt_tokens;
    j["max_completion_tokens"] = o.m_Max_completion_tokens;
    j["truncation_strategy"] = o.m_Truncation_strategy;
    j["tool_choice"] = o.m_Tool_choice;
    j["response_format"] = o.m_Response_format;
    
}

void from_json(const nlohmann::json& j, RunObject& o)
{
    j.at("id").get_to(o.m_Id);
    j.at("object").get_to(o.m_object);
    j.at("created_at").get_to(o.m_Created_at);
    j.at("thread_id").get_to(o.m_Thread_id);
    j.at("assistant_id").get_to(o.m_Assistant_id);
    j.at("status").get_to(o.m_Status);
    j.at("required_action").get_to(o.m_Required_action);
    j.at("last_error").get_to(o.m_Last_error);
    j.at("expires_at").get_to(o.m_Expires_at);
    j.at("started_at").get_to(o.m_Started_at);
    j.at("cancelled_at").get_to(o.m_Cancelled_at);
    j.at("failed_at").get_to(o.m_Failed_at);
    j.at("completed_at").get_to(o.m_Completed_at);
    j.at("incomplete_details").get_to(o.m_Incomplete_details);
    j.at("model").get_to(o.m_Model);
    j.at("instructions").get_to(o.m_Instructions);
    j.at("tools").get_to(o.m_Tools);
    j.at("file_ids").get_to(o.m_File_ids);
    j.at("metadata").get_to(o.m_Metadata);
    j.at("usage").get_to(o.m_Usage);
    if(j.find("temperature") != j.end())
    {
        j.at("temperature").get_to(o.m_Temperature);
        o.m_TemperatureIsSet = true;
    } 
    j.at("max_prompt_tokens").get_to(o.m_Max_prompt_tokens);
    j.at("max_completion_tokens").get_to(o.m_Max_completion_tokens);
    j.at("truncation_strategy").get_to(o.m_Truncation_strategy);
    j.at("tool_choice").get_to(o.m_Tool_choice);
    j.at("response_format").get_to(o.m_Response_format);
    
}

std::string RunObject::getId() const
{
    return m_Id;
}
void RunObject::setId(std::string const& value)
{
    m_Id = value;
}
std::string RunObject::getObject() const
{
    return m_object;
}
void RunObject::setObject(std::string const& value)
{
    m_object = value;
}
int32_t RunObject::getCreatedAt() const
{
    return m_Created_at;
}
void RunObject::setCreatedAt(int32_t const value)
{
    m_Created_at = value;
}
std::string RunObject::getThreadId() const
{
    return m_Thread_id;
}
void RunObject::setThreadId(std::string const& value)
{
    m_Thread_id = value;
}
std::string RunObject::getAssistantId() const
{
    return m_Assistant_id;
}
void RunObject::setAssistantId(std::string const& value)
{
    m_Assistant_id = value;
}
std::string RunObject::getStatus() const
{
    return m_Status;
}
void RunObject::setStatus(std::string const& value)
{
    m_Status = value;
}
org::openapitools::server::model::RunObject_required_action RunObject::getRequiredAction() const
{
    return m_Required_action;
}
void RunObject::setRequiredAction(org::openapitools::server::model::RunObject_required_action const& value)
{
    m_Required_action = value;
}
org::openapitools::server::model::RunObject_last_error RunObject::getLastError() const
{
    return m_Last_error;
}
void RunObject::setLastError(org::openapitools::server::model::RunObject_last_error const& value)
{
    m_Last_error = value;
}
int32_t RunObject::getExpiresAt() const
{
    return m_Expires_at;
}
void RunObject::setExpiresAt(int32_t const value)
{
    m_Expires_at = value;
}
int32_t RunObject::getStartedAt() const
{
    return m_Started_at;
}
void RunObject::setStartedAt(int32_t const value)
{
    m_Started_at = value;
}
int32_t RunObject::getCancelledAt() const
{
    return m_Cancelled_at;
}
void RunObject::setCancelledAt(int32_t const value)
{
    m_Cancelled_at = value;
}
int32_t RunObject::getFailedAt() const
{
    return m_Failed_at;
}
void RunObject::setFailedAt(int32_t const value)
{
    m_Failed_at = value;
}
int32_t RunObject::getCompletedAt() const
{
    return m_Completed_at;
}
void RunObject::setCompletedAt(int32_t const value)
{
    m_Completed_at = value;
}
org::openapitools::server::model::RunObject_incomplete_details RunObject::getIncompleteDetails() const
{
    return m_Incomplete_details;
}
void RunObject::setIncompleteDetails(org::openapitools::server::model::RunObject_incomplete_details const& value)
{
    m_Incomplete_details = value;
}
std::string RunObject::getModel() const
{
    return m_Model;
}
void RunObject::setModel(std::string const& value)
{
    m_Model = value;
}
std::string RunObject::getInstructions() const
{
    return m_Instructions;
}
void RunObject::setInstructions(std::string const& value)
{
    m_Instructions = value;
}
std::vector<org::openapitools::server::model::AssistantObject_tools_inner> RunObject::getTools() const
{
    return m_Tools;
}
void RunObject::setTools(std::vector<org::openapitools::server::model::AssistantObject_tools_inner> const& value)
{
    m_Tools = value;
}
std::vector<std::string> RunObject::getFileIds() const
{
    return m_File_ids;
}
void RunObject::setFileIds(std::vector<std::string> const& value)
{
    m_File_ids = value;
}
nlohmann::json RunObject::getMetadata() const
{
    return m_Metadata;
}
void RunObject::setMetadata(nlohmann::json const& value)
{
    m_Metadata = value;
}
org::openapitools::server::model::RunCompletionUsage RunObject::getUsage() const
{
    return m_Usage;
}
void RunObject::setUsage(org::openapitools::server::model::RunCompletionUsage const& value)
{
    m_Usage = value;
}
double RunObject::getTemperature() const
{
    return m_Temperature;
}
void RunObject::setTemperature(double const value)
{
    m_Temperature = value;
    m_TemperatureIsSet = true;
}
bool RunObject::temperatureIsSet() const
{
    return m_TemperatureIsSet;
}
void RunObject::unsetTemperature()
{
    m_TemperatureIsSet = false;
}
int32_t RunObject::getMaxPromptTokens() const
{
    return m_Max_prompt_tokens;
}
void RunObject::setMaxPromptTokens(int32_t const value)
{
    m_Max_prompt_tokens = value;
}
int32_t RunObject::getMaxCompletionTokens() const
{
    return m_Max_completion_tokens;
}
void RunObject::setMaxCompletionTokens(int32_t const value)
{
    m_Max_completion_tokens = value;
}
org::openapitools::server::model::TruncationObject RunObject::getTruncationStrategy() const
{
    return m_Truncation_strategy;
}
void RunObject::setTruncationStrategy(org::openapitools::server::model::TruncationObject const& value)
{
    m_Truncation_strategy = value;
}
org::openapitools::server::model::AssistantsApiToolChoiceOption RunObject::getToolChoice() const
{
    return m_Tool_choice;
}
void RunObject::setToolChoice(org::openapitools::server::model::AssistantsApiToolChoiceOption const& value)
{
    m_Tool_choice = value;
}
org::openapitools::server::model::AssistantsApiResponseFormatOption RunObject::getResponseFormat() const
{
    return m_Response_format;
}
void RunObject::setResponseFormat(org::openapitools::server::model::AssistantsApiResponseFormatOption const& value)
{
    m_Response_format = value;
}


} // namespace org::openapitools::server::model

