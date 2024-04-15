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


#include "FineTuningJob.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

FineTuningJob::FineTuningJob()
{
    m_Id = "";
    m_Created_at = 0;
    m_Fine_tuned_model = "";
    m_Finished_at = 0;
    m_Model = "";
    m_object = "";
    m_Organization_id = "";
    m_Status = "";
    m_Trained_tokens = 0;
    m_Training_file = "";
    m_Validation_file = "";
    m_IntegrationsIsSet = false;
    m_Seed = 0;
    
}

void FineTuningJob::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool FineTuningJob::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool FineTuningJob::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "FineTuningJob" : pathPrefix;

                
    if (!m_Error.validate()) {
        msg << _pathPrefix << ": Error is invalid;";
        success = false;
    }            
    if (!m_Hyperparameters.validate()) {
        msg << _pathPrefix << ": Hyperparameters is invalid;";
        success = false;
    }                 
    
    /* Result_files */ {
        const std::vector<std::string>& value = m_Result_files;
        const std::string currentValuePath = _pathPrefix + ".resultFiles";
                
        
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
                         
    if (integrationsIsSet())
    {
        const std::vector<org::openapitools::server::model::FineTuningJob_integrations_inner>& value = m_Integrations;
        const std::string currentValuePath = _pathPrefix + ".integrations";
                
        
        if (value.size() > 5)
        {
            success = false;
            msg << currentValuePath << ": must have at most 5 elements;";
        }
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const org::openapitools::server::model::FineTuningJob_integrations_inner& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        success = value.validate(msg, currentValuePath + ".integrations") && success;
 
                i++;
            }
        }

    }
        
    return success;
}

bool FineTuningJob::operator==(const FineTuningJob& rhs) const
{
    return
    
    
    (getId() == rhs.getId())
     &&
    
    (getCreatedAt() == rhs.getCreatedAt())
     &&
    
    (getError() == rhs.getError())
     &&
    
    (getFineTunedModel() == rhs.getFineTunedModel())
     &&
    
    (getFinishedAt() == rhs.getFinishedAt())
     &&
    
    (getHyperparameters() == rhs.getHyperparameters())
     &&
    
    (getModel() == rhs.getModel())
     &&
    
    (getObject() == rhs.getObject())
     &&
    
    (getOrganizationId() == rhs.getOrganizationId())
     &&
    
    (getResultFiles() == rhs.getResultFiles())
     &&
    
    (getStatus() == rhs.getStatus())
     &&
    
    (getTrainedTokens() == rhs.getTrainedTokens())
     &&
    
    (getTrainingFile() == rhs.getTrainingFile())
     &&
    
    (getValidationFile() == rhs.getValidationFile())
     &&
    
    
    ((!integrationsIsSet() && !rhs.integrationsIsSet()) || (integrationsIsSet() && rhs.integrationsIsSet() && getIntegrations() == rhs.getIntegrations())) &&
    
    (getSeed() == rhs.getSeed())
    
    
    ;
}

bool FineTuningJob::operator!=(const FineTuningJob& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const FineTuningJob& o)
{
    j = nlohmann::json::object();
    j["id"] = o.m_Id;
    j["created_at"] = o.m_Created_at;
    j["error"] = o.m_Error;
    j["fine_tuned_model"] = o.m_Fine_tuned_model;
    j["finished_at"] = o.m_Finished_at;
    j["hyperparameters"] = o.m_Hyperparameters;
    j["model"] = o.m_Model;
    j["object"] = o.m_object;
    j["organization_id"] = o.m_Organization_id;
    j["result_files"] = o.m_Result_files;
    j["status"] = o.m_Status;
    j["trained_tokens"] = o.m_Trained_tokens;
    j["training_file"] = o.m_Training_file;
    j["validation_file"] = o.m_Validation_file;
    if(o.integrationsIsSet() || !o.m_Integrations.empty())
        j["integrations"] = o.m_Integrations;
    j["seed"] = o.m_Seed;
    
}

void from_json(const nlohmann::json& j, FineTuningJob& o)
{
    j.at("id").get_to(o.m_Id);
    j.at("created_at").get_to(o.m_Created_at);
    j.at("error").get_to(o.m_Error);
    j.at("fine_tuned_model").get_to(o.m_Fine_tuned_model);
    j.at("finished_at").get_to(o.m_Finished_at);
    j.at("hyperparameters").get_to(o.m_Hyperparameters);
    j.at("model").get_to(o.m_Model);
    j.at("object").get_to(o.m_object);
    j.at("organization_id").get_to(o.m_Organization_id);
    j.at("result_files").get_to(o.m_Result_files);
    j.at("status").get_to(o.m_Status);
    j.at("trained_tokens").get_to(o.m_Trained_tokens);
    j.at("training_file").get_to(o.m_Training_file);
    j.at("validation_file").get_to(o.m_Validation_file);
    if(j.find("integrations") != j.end())
    {
        j.at("integrations").get_to(o.m_Integrations);
        o.m_IntegrationsIsSet = true;
    } 
    j.at("seed").get_to(o.m_Seed);
    
}

std::string FineTuningJob::getId() const
{
    return m_Id;
}
void FineTuningJob::setId(std::string const& value)
{
    m_Id = value;
}
int32_t FineTuningJob::getCreatedAt() const
{
    return m_Created_at;
}
void FineTuningJob::setCreatedAt(int32_t const value)
{
    m_Created_at = value;
}
org::openapitools::server::model::FineTuningJob_error FineTuningJob::getError() const
{
    return m_Error;
}
void FineTuningJob::setError(org::openapitools::server::model::FineTuningJob_error const& value)
{
    m_Error = value;
}
std::string FineTuningJob::getFineTunedModel() const
{
    return m_Fine_tuned_model;
}
void FineTuningJob::setFineTunedModel(std::string const& value)
{
    m_Fine_tuned_model = value;
}
int32_t FineTuningJob::getFinishedAt() const
{
    return m_Finished_at;
}
void FineTuningJob::setFinishedAt(int32_t const value)
{
    m_Finished_at = value;
}
org::openapitools::server::model::FineTuningJob_hyperparameters FineTuningJob::getHyperparameters() const
{
    return m_Hyperparameters;
}
void FineTuningJob::setHyperparameters(org::openapitools::server::model::FineTuningJob_hyperparameters const& value)
{
    m_Hyperparameters = value;
}
std::string FineTuningJob::getModel() const
{
    return m_Model;
}
void FineTuningJob::setModel(std::string const& value)
{
    m_Model = value;
}
std::string FineTuningJob::getObject() const
{
    return m_object;
}
void FineTuningJob::setObject(std::string const& value)
{
    m_object = value;
}
std::string FineTuningJob::getOrganizationId() const
{
    return m_Organization_id;
}
void FineTuningJob::setOrganizationId(std::string const& value)
{
    m_Organization_id = value;
}
std::vector<std::string> FineTuningJob::getResultFiles() const
{
    return m_Result_files;
}
void FineTuningJob::setResultFiles(std::vector<std::string> const& value)
{
    m_Result_files = value;
}
std::string FineTuningJob::getStatus() const
{
    return m_Status;
}
void FineTuningJob::setStatus(std::string const& value)
{
    m_Status = value;
}
int32_t FineTuningJob::getTrainedTokens() const
{
    return m_Trained_tokens;
}
void FineTuningJob::setTrainedTokens(int32_t const value)
{
    m_Trained_tokens = value;
}
std::string FineTuningJob::getTrainingFile() const
{
    return m_Training_file;
}
void FineTuningJob::setTrainingFile(std::string const& value)
{
    m_Training_file = value;
}
std::string FineTuningJob::getValidationFile() const
{
    return m_Validation_file;
}
void FineTuningJob::setValidationFile(std::string const& value)
{
    m_Validation_file = value;
}
std::vector<org::openapitools::server::model::FineTuningJob_integrations_inner> FineTuningJob::getIntegrations() const
{
    return m_Integrations;
}
void FineTuningJob::setIntegrations(std::vector<org::openapitools::server::model::FineTuningJob_integrations_inner> const& value)
{
    m_Integrations = value;
    m_IntegrationsIsSet = true;
}
bool FineTuningJob::integrationsIsSet() const
{
    return m_IntegrationsIsSet;
}
void FineTuningJob::unsetIntegrations()
{
    m_IntegrationsIsSet = false;
}
int32_t FineTuningJob::getSeed() const
{
    return m_Seed;
}
void FineTuningJob::setSeed(int32_t const value)
{
    m_Seed = value;
}


} // namespace org::openapitools::server::model
