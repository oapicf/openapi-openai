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


#include "FineTuningJobCheckpoint_metrics.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

FineTuningJobCheckpoint_metrics::FineTuningJobCheckpoint_metrics()
{
    m_Step = 0.0;
    m_StepIsSet = false;
    m_Train_loss = 0.0;
    m_Train_lossIsSet = false;
    m_Train_mean_token_accuracy = 0.0;
    m_Train_mean_token_accuracyIsSet = false;
    m_Valid_loss = 0.0;
    m_Valid_lossIsSet = false;
    m_Valid_mean_token_accuracy = 0.0;
    m_Valid_mean_token_accuracyIsSet = false;
    m_Full_valid_loss = 0.0;
    m_Full_valid_lossIsSet = false;
    m_Full_valid_mean_token_accuracy = 0.0;
    m_Full_valid_mean_token_accuracyIsSet = false;
    
}

void FineTuningJobCheckpoint_metrics::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool FineTuningJobCheckpoint_metrics::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool FineTuningJobCheckpoint_metrics::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "FineTuningJobCheckpoint_metrics" : pathPrefix;

                                
    return success;
}

bool FineTuningJobCheckpoint_metrics::operator==(const FineTuningJobCheckpoint_metrics& rhs) const
{
    return
    
    
    
    ((!stepIsSet() && !rhs.stepIsSet()) || (stepIsSet() && rhs.stepIsSet() && getStep() == rhs.getStep())) &&
    
    
    ((!trainLossIsSet() && !rhs.trainLossIsSet()) || (trainLossIsSet() && rhs.trainLossIsSet() && getTrainLoss() == rhs.getTrainLoss())) &&
    
    
    ((!trainMeanTokenAccuracyIsSet() && !rhs.trainMeanTokenAccuracyIsSet()) || (trainMeanTokenAccuracyIsSet() && rhs.trainMeanTokenAccuracyIsSet() && getTrainMeanTokenAccuracy() == rhs.getTrainMeanTokenAccuracy())) &&
    
    
    ((!validLossIsSet() && !rhs.validLossIsSet()) || (validLossIsSet() && rhs.validLossIsSet() && getValidLoss() == rhs.getValidLoss())) &&
    
    
    ((!validMeanTokenAccuracyIsSet() && !rhs.validMeanTokenAccuracyIsSet()) || (validMeanTokenAccuracyIsSet() && rhs.validMeanTokenAccuracyIsSet() && getValidMeanTokenAccuracy() == rhs.getValidMeanTokenAccuracy())) &&
    
    
    ((!fullValidLossIsSet() && !rhs.fullValidLossIsSet()) || (fullValidLossIsSet() && rhs.fullValidLossIsSet() && getFullValidLoss() == rhs.getFullValidLoss())) &&
    
    
    ((!fullValidMeanTokenAccuracyIsSet() && !rhs.fullValidMeanTokenAccuracyIsSet()) || (fullValidMeanTokenAccuracyIsSet() && rhs.fullValidMeanTokenAccuracyIsSet() && getFullValidMeanTokenAccuracy() == rhs.getFullValidMeanTokenAccuracy()))
    
    ;
}

bool FineTuningJobCheckpoint_metrics::operator!=(const FineTuningJobCheckpoint_metrics& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const FineTuningJobCheckpoint_metrics& o)
{
    j = nlohmann::json::object();
    if(o.stepIsSet())
        j["step"] = o.m_Step;
    if(o.trainLossIsSet())
        j["train_loss"] = o.m_Train_loss;
    if(o.trainMeanTokenAccuracyIsSet())
        j["train_mean_token_accuracy"] = o.m_Train_mean_token_accuracy;
    if(o.validLossIsSet())
        j["valid_loss"] = o.m_Valid_loss;
    if(o.validMeanTokenAccuracyIsSet())
        j["valid_mean_token_accuracy"] = o.m_Valid_mean_token_accuracy;
    if(o.fullValidLossIsSet())
        j["full_valid_loss"] = o.m_Full_valid_loss;
    if(o.fullValidMeanTokenAccuracyIsSet())
        j["full_valid_mean_token_accuracy"] = o.m_Full_valid_mean_token_accuracy;
    
}

void from_json(const nlohmann::json& j, FineTuningJobCheckpoint_metrics& o)
{
    if(j.find("step") != j.end())
    {
        j.at("step").get_to(o.m_Step);
        o.m_StepIsSet = true;
    } 
    if(j.find("train_loss") != j.end())
    {
        j.at("train_loss").get_to(o.m_Train_loss);
        o.m_Train_lossIsSet = true;
    } 
    if(j.find("train_mean_token_accuracy") != j.end())
    {
        j.at("train_mean_token_accuracy").get_to(o.m_Train_mean_token_accuracy);
        o.m_Train_mean_token_accuracyIsSet = true;
    } 
    if(j.find("valid_loss") != j.end())
    {
        j.at("valid_loss").get_to(o.m_Valid_loss);
        o.m_Valid_lossIsSet = true;
    } 
    if(j.find("valid_mean_token_accuracy") != j.end())
    {
        j.at("valid_mean_token_accuracy").get_to(o.m_Valid_mean_token_accuracy);
        o.m_Valid_mean_token_accuracyIsSet = true;
    } 
    if(j.find("full_valid_loss") != j.end())
    {
        j.at("full_valid_loss").get_to(o.m_Full_valid_loss);
        o.m_Full_valid_lossIsSet = true;
    } 
    if(j.find("full_valid_mean_token_accuracy") != j.end())
    {
        j.at("full_valid_mean_token_accuracy").get_to(o.m_Full_valid_mean_token_accuracy);
        o.m_Full_valid_mean_token_accuracyIsSet = true;
    } 
    
}

double FineTuningJobCheckpoint_metrics::getStep() const
{
    return m_Step;
}
void FineTuningJobCheckpoint_metrics::setStep(double const value)
{
    m_Step = value;
    m_StepIsSet = true;
}
bool FineTuningJobCheckpoint_metrics::stepIsSet() const
{
    return m_StepIsSet;
}
void FineTuningJobCheckpoint_metrics::unsetStep()
{
    m_StepIsSet = false;
}
double FineTuningJobCheckpoint_metrics::getTrainLoss() const
{
    return m_Train_loss;
}
void FineTuningJobCheckpoint_metrics::setTrainLoss(double const value)
{
    m_Train_loss = value;
    m_Train_lossIsSet = true;
}
bool FineTuningJobCheckpoint_metrics::trainLossIsSet() const
{
    return m_Train_lossIsSet;
}
void FineTuningJobCheckpoint_metrics::unsetTrain_loss()
{
    m_Train_lossIsSet = false;
}
double FineTuningJobCheckpoint_metrics::getTrainMeanTokenAccuracy() const
{
    return m_Train_mean_token_accuracy;
}
void FineTuningJobCheckpoint_metrics::setTrainMeanTokenAccuracy(double const value)
{
    m_Train_mean_token_accuracy = value;
    m_Train_mean_token_accuracyIsSet = true;
}
bool FineTuningJobCheckpoint_metrics::trainMeanTokenAccuracyIsSet() const
{
    return m_Train_mean_token_accuracyIsSet;
}
void FineTuningJobCheckpoint_metrics::unsetTrain_mean_token_accuracy()
{
    m_Train_mean_token_accuracyIsSet = false;
}
double FineTuningJobCheckpoint_metrics::getValidLoss() const
{
    return m_Valid_loss;
}
void FineTuningJobCheckpoint_metrics::setValidLoss(double const value)
{
    m_Valid_loss = value;
    m_Valid_lossIsSet = true;
}
bool FineTuningJobCheckpoint_metrics::validLossIsSet() const
{
    return m_Valid_lossIsSet;
}
void FineTuningJobCheckpoint_metrics::unsetValid_loss()
{
    m_Valid_lossIsSet = false;
}
double FineTuningJobCheckpoint_metrics::getValidMeanTokenAccuracy() const
{
    return m_Valid_mean_token_accuracy;
}
void FineTuningJobCheckpoint_metrics::setValidMeanTokenAccuracy(double const value)
{
    m_Valid_mean_token_accuracy = value;
    m_Valid_mean_token_accuracyIsSet = true;
}
bool FineTuningJobCheckpoint_metrics::validMeanTokenAccuracyIsSet() const
{
    return m_Valid_mean_token_accuracyIsSet;
}
void FineTuningJobCheckpoint_metrics::unsetValid_mean_token_accuracy()
{
    m_Valid_mean_token_accuracyIsSet = false;
}
double FineTuningJobCheckpoint_metrics::getFullValidLoss() const
{
    return m_Full_valid_loss;
}
void FineTuningJobCheckpoint_metrics::setFullValidLoss(double const value)
{
    m_Full_valid_loss = value;
    m_Full_valid_lossIsSet = true;
}
bool FineTuningJobCheckpoint_metrics::fullValidLossIsSet() const
{
    return m_Full_valid_lossIsSet;
}
void FineTuningJobCheckpoint_metrics::unsetFull_valid_loss()
{
    m_Full_valid_lossIsSet = false;
}
double FineTuningJobCheckpoint_metrics::getFullValidMeanTokenAccuracy() const
{
    return m_Full_valid_mean_token_accuracy;
}
void FineTuningJobCheckpoint_metrics::setFullValidMeanTokenAccuracy(double const value)
{
    m_Full_valid_mean_token_accuracy = value;
    m_Full_valid_mean_token_accuracyIsSet = true;
}
bool FineTuningJobCheckpoint_metrics::fullValidMeanTokenAccuracyIsSet() const
{
    return m_Full_valid_mean_token_accuracyIsSet;
}
void FineTuningJobCheckpoint_metrics::unsetFull_valid_mean_token_accuracy()
{
    m_Full_valid_mean_token_accuracyIsSet = false;
}


} // namespace org::openapitools::server::model

