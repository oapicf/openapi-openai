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


#include "CreateFineTuningJobRequest.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

CreateFineTuningJobRequest::CreateFineTuningJobRequest()
{
    m_Training_file = "";
    m_HyperparametersIsSet = false;
    m_Suffix = "";
    m_SuffixIsSet = false;
    m_Validation_file = "";
    m_Validation_fileIsSet = false;
    m_IntegrationsIsSet = false;
    m_Seed = 0;
    m_SeedIsSet = false;
    
}

void CreateFineTuningJobRequest::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool CreateFineTuningJobRequest::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool CreateFineTuningJobRequest::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "CreateFineTuningJobRequest" : pathPrefix;

        
    if (!m_Model.validate(msg, _pathPrefix + ".model")) {
        msg << _pathPrefix << ": Model is invalid;";
        success = false;
    }             
    if (suffixIsSet())
    {
        const std::string& value = m_Suffix;
        const std::string currentValuePath = _pathPrefix + ".suffix";
                
        
        if (value.length() < 1)
        {
            success = false;
            msg << currentValuePath << ": must be at least 1 characters long;";
        }
        if (value.length() > 40)
        {
            success = false;
            msg << currentValuePath << ": must be at most 40 characters long;";
        }

    }
             
    if (integrationsIsSet())
    {
        const std::vector<org::openapitools::server::model::CreateFineTuningJobRequest_integrations_inner>& value = m_Integrations;
        const std::string currentValuePath = _pathPrefix + ".integrations";
                
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const org::openapitools::server::model::CreateFineTuningJobRequest_integrations_inner& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        success = value.validate(msg, currentValuePath + ".integrations") && success;
 
                i++;
            }
        }

    }
         
    if (seedIsSet())
    {
        const int32_t& value = m_Seed;
        const std::string currentValuePath = _pathPrefix + ".seed";
                
        
        if (value < 0)
        {
            success = false;
            msg << currentValuePath << ": must be greater than or equal to 0;";
        }
        if (value > 2147483647)
        {
            success = false;
            msg << currentValuePath << ": must be less than or equal to 2147483647;";
        }

    }
    
    return success;
}

bool CreateFineTuningJobRequest::operator==(const CreateFineTuningJobRequest& rhs) const
{
    return
    
    
    (getModel() == rhs.getModel())
     &&
    
    (getTrainingFile() == rhs.getTrainingFile())
     &&
    
    
    ((!hyperparametersIsSet() && !rhs.hyperparametersIsSet()) || (hyperparametersIsSet() && rhs.hyperparametersIsSet() && getHyperparameters() == rhs.getHyperparameters())) &&
    
    
    ((!suffixIsSet() && !rhs.suffixIsSet()) || (suffixIsSet() && rhs.suffixIsSet() && getSuffix() == rhs.getSuffix())) &&
    
    
    ((!validationFileIsSet() && !rhs.validationFileIsSet()) || (validationFileIsSet() && rhs.validationFileIsSet() && getValidationFile() == rhs.getValidationFile())) &&
    
    
    ((!integrationsIsSet() && !rhs.integrationsIsSet()) || (integrationsIsSet() && rhs.integrationsIsSet() && getIntegrations() == rhs.getIntegrations())) &&
    
    
    ((!seedIsSet() && !rhs.seedIsSet()) || (seedIsSet() && rhs.seedIsSet() && getSeed() == rhs.getSeed()))
    
    ;
}

bool CreateFineTuningJobRequest::operator!=(const CreateFineTuningJobRequest& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const CreateFineTuningJobRequest& o)
{
    j = nlohmann::json::object();
    j["model"] = o.m_Model;
    j["training_file"] = o.m_Training_file;
    if(o.hyperparametersIsSet())
        j["hyperparameters"] = o.m_Hyperparameters;
    if(o.suffixIsSet())
        j["suffix"] = o.m_Suffix;
    if(o.validationFileIsSet())
        j["validation_file"] = o.m_Validation_file;
    if(o.integrationsIsSet() || !o.m_Integrations.empty())
        j["integrations"] = o.m_Integrations;
    if(o.seedIsSet())
        j["seed"] = o.m_Seed;
    
}

void from_json(const nlohmann::json& j, CreateFineTuningJobRequest& o)
{
    j.at("model").get_to(o.m_Model);
    j.at("training_file").get_to(o.m_Training_file);
    if(j.find("hyperparameters") != j.end())
    {
        j.at("hyperparameters").get_to(o.m_Hyperparameters);
        o.m_HyperparametersIsSet = true;
    } 
    if(j.find("suffix") != j.end())
    {
        j.at("suffix").get_to(o.m_Suffix);
        o.m_SuffixIsSet = true;
    } 
    if(j.find("validation_file") != j.end())
    {
        j.at("validation_file").get_to(o.m_Validation_file);
        o.m_Validation_fileIsSet = true;
    } 
    if(j.find("integrations") != j.end())
    {
        j.at("integrations").get_to(o.m_Integrations);
        o.m_IntegrationsIsSet = true;
    } 
    if(j.find("seed") != j.end())
    {
        j.at("seed").get_to(o.m_Seed);
        o.m_SeedIsSet = true;
    } 
    
}

org::openapitools::server::model::CreateFineTuningJobRequest_model CreateFineTuningJobRequest::getModel() const
{
    return m_Model;
}
void CreateFineTuningJobRequest::setModel(org::openapitools::server::model::CreateFineTuningJobRequest_model const& value)
{
    m_Model = value;
}
std::string CreateFineTuningJobRequest::getTrainingFile() const
{
    return m_Training_file;
}
void CreateFineTuningJobRequest::setTrainingFile(std::string const& value)
{
    m_Training_file = value;
}
org::openapitools::server::model::CreateFineTuningJobRequest_hyperparameters CreateFineTuningJobRequest::getHyperparameters() const
{
    return m_Hyperparameters;
}
void CreateFineTuningJobRequest::setHyperparameters(org::openapitools::server::model::CreateFineTuningJobRequest_hyperparameters const& value)
{
    m_Hyperparameters = value;
    m_HyperparametersIsSet = true;
}
bool CreateFineTuningJobRequest::hyperparametersIsSet() const
{
    return m_HyperparametersIsSet;
}
void CreateFineTuningJobRequest::unsetHyperparameters()
{
    m_HyperparametersIsSet = false;
}
std::string CreateFineTuningJobRequest::getSuffix() const
{
    return m_Suffix;
}
void CreateFineTuningJobRequest::setSuffix(std::string const& value)
{
    m_Suffix = value;
    m_SuffixIsSet = true;
}
bool CreateFineTuningJobRequest::suffixIsSet() const
{
    return m_SuffixIsSet;
}
void CreateFineTuningJobRequest::unsetSuffix()
{
    m_SuffixIsSet = false;
}
std::string CreateFineTuningJobRequest::getValidationFile() const
{
    return m_Validation_file;
}
void CreateFineTuningJobRequest::setValidationFile(std::string const& value)
{
    m_Validation_file = value;
    m_Validation_fileIsSet = true;
}
bool CreateFineTuningJobRequest::validationFileIsSet() const
{
    return m_Validation_fileIsSet;
}
void CreateFineTuningJobRequest::unsetValidation_file()
{
    m_Validation_fileIsSet = false;
}
std::vector<org::openapitools::server::model::CreateFineTuningJobRequest_integrations_inner> CreateFineTuningJobRequest::getIntegrations() const
{
    return m_Integrations;
}
void CreateFineTuningJobRequest::setIntegrations(std::vector<org::openapitools::server::model::CreateFineTuningJobRequest_integrations_inner> const& value)
{
    m_Integrations = value;
    m_IntegrationsIsSet = true;
}
bool CreateFineTuningJobRequest::integrationsIsSet() const
{
    return m_IntegrationsIsSet;
}
void CreateFineTuningJobRequest::unsetIntegrations()
{
    m_IntegrationsIsSet = false;
}
int32_t CreateFineTuningJobRequest::getSeed() const
{
    return m_Seed;
}
void CreateFineTuningJobRequest::setSeed(int32_t const value)
{
    m_Seed = value;
    m_SeedIsSet = true;
}
bool CreateFineTuningJobRequest::seedIsSet() const
{
    return m_SeedIsSet;
}
void CreateFineTuningJobRequest::unsetSeed()
{
    m_SeedIsSet = false;
}


} // namespace org::openapitools::server::model

