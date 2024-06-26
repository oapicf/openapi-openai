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


#include "CreateFineTuningJobRequest_hyperparameters.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

CreateFineTuningJobRequest_hyperparameters::CreateFineTuningJobRequest_hyperparameters()
{
    m_Batch_sizeIsSet = false;
    m_Learning_rate_multiplierIsSet = false;
    m_N_epochsIsSet = false;
    
}

void CreateFineTuningJobRequest_hyperparameters::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool CreateFineTuningJobRequest_hyperparameters::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool CreateFineTuningJobRequest_hyperparameters::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "CreateFineTuningJobRequest_hyperparameters" : pathPrefix;

                
    return success;
}

bool CreateFineTuningJobRequest_hyperparameters::operator==(const CreateFineTuningJobRequest_hyperparameters& rhs) const
{
    return
    
    
    
    ((!batchSizeIsSet() && !rhs.batchSizeIsSet()) || (batchSizeIsSet() && rhs.batchSizeIsSet() && getBatchSize() == rhs.getBatchSize())) &&
    
    
    ((!learningRateMultiplierIsSet() && !rhs.learningRateMultiplierIsSet()) || (learningRateMultiplierIsSet() && rhs.learningRateMultiplierIsSet() && getLearningRateMultiplier() == rhs.getLearningRateMultiplier())) &&
    
    
    ((!nEpochsIsSet() && !rhs.nEpochsIsSet()) || (nEpochsIsSet() && rhs.nEpochsIsSet() && getNEpochs() == rhs.getNEpochs()))
    
    ;
}

bool CreateFineTuningJobRequest_hyperparameters::operator!=(const CreateFineTuningJobRequest_hyperparameters& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const CreateFineTuningJobRequest_hyperparameters& o)
{
    j = nlohmann::json::object();
    if(o.batchSizeIsSet())
        j["batch_size"] = o.m_Batch_size;
    if(o.learningRateMultiplierIsSet())
        j["learning_rate_multiplier"] = o.m_Learning_rate_multiplier;
    if(o.nEpochsIsSet())
        j["n_epochs"] = o.m_N_epochs;
    
}

void from_json(const nlohmann::json& j, CreateFineTuningJobRequest_hyperparameters& o)
{
    if(j.find("batch_size") != j.end())
    {
        j.at("batch_size").get_to(o.m_Batch_size);
        o.m_Batch_sizeIsSet = true;
    } 
    if(j.find("learning_rate_multiplier") != j.end())
    {
        j.at("learning_rate_multiplier").get_to(o.m_Learning_rate_multiplier);
        o.m_Learning_rate_multiplierIsSet = true;
    } 
    if(j.find("n_epochs") != j.end())
    {
        j.at("n_epochs").get_to(o.m_N_epochs);
        o.m_N_epochsIsSet = true;
    } 
    
}

org::openapitools::server::model::CreateFineTuningJobRequest_hyperparameters_batch_size CreateFineTuningJobRequest_hyperparameters::getBatchSize() const
{
    return m_Batch_size;
}
void CreateFineTuningJobRequest_hyperparameters::setBatchSize(org::openapitools::server::model::CreateFineTuningJobRequest_hyperparameters_batch_size const& value)
{
    m_Batch_size = value;
    m_Batch_sizeIsSet = true;
}
bool CreateFineTuningJobRequest_hyperparameters::batchSizeIsSet() const
{
    return m_Batch_sizeIsSet;
}
void CreateFineTuningJobRequest_hyperparameters::unsetBatch_size()
{
    m_Batch_sizeIsSet = false;
}
org::openapitools::server::model::CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier CreateFineTuningJobRequest_hyperparameters::getLearningRateMultiplier() const
{
    return m_Learning_rate_multiplier;
}
void CreateFineTuningJobRequest_hyperparameters::setLearningRateMultiplier(org::openapitools::server::model::CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier const& value)
{
    m_Learning_rate_multiplier = value;
    m_Learning_rate_multiplierIsSet = true;
}
bool CreateFineTuningJobRequest_hyperparameters::learningRateMultiplierIsSet() const
{
    return m_Learning_rate_multiplierIsSet;
}
void CreateFineTuningJobRequest_hyperparameters::unsetLearning_rate_multiplier()
{
    m_Learning_rate_multiplierIsSet = false;
}
org::openapitools::server::model::CreateFineTuningJobRequest_hyperparameters_n_epochs CreateFineTuningJobRequest_hyperparameters::getNEpochs() const
{
    return m_N_epochs;
}
void CreateFineTuningJobRequest_hyperparameters::setNEpochs(org::openapitools::server::model::CreateFineTuningJobRequest_hyperparameters_n_epochs const& value)
{
    m_N_epochs = value;
    m_N_epochsIsSet = true;
}
bool CreateFineTuningJobRequest_hyperparameters::nEpochsIsSet() const
{
    return m_N_epochsIsSet;
}
void CreateFineTuningJobRequest_hyperparameters::unsetN_epochs()
{
    m_N_epochsIsSet = false;
}


} // namespace org::openapitools::server::model

