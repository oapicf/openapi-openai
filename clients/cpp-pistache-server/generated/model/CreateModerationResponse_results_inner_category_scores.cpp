/**
* OpenAI API
* APIs for sampling from and fine-tuning language models
*
* The version of the OpenAPI document: 2.0.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/


#include "CreateModerationResponse_results_inner_category_scores.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

CreateModerationResponse_results_inner_category_scores::CreateModerationResponse_results_inner_category_scores()
{
    m_Hate = 0.0;
    m_Hate_threatening = 0.0;
    m_Self_harm = 0.0;
    m_Sexual = 0.0;
    m_Sexual_minors = 0.0;
    m_Violence = 0.0;
    m_Violence_graphic = 0.0;
    
}

void CreateModerationResponse_results_inner_category_scores::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool CreateModerationResponse_results_inner_category_scores::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool CreateModerationResponse_results_inner_category_scores::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "CreateModerationResponse_results_inner_category_scores" : pathPrefix;

                                
    return success;
}

bool CreateModerationResponse_results_inner_category_scores::operator==(const CreateModerationResponse_results_inner_category_scores& rhs) const
{
    return
    
    
    (getHate() == rhs.getHate())
     &&
    
    (getHateThreatening() == rhs.getHateThreatening())
     &&
    
    (getSelfHarm() == rhs.getSelfHarm())
     &&
    
    (getSexual() == rhs.getSexual())
     &&
    
    (getSexualMinors() == rhs.getSexualMinors())
     &&
    
    (getViolence() == rhs.getViolence())
     &&
    
    (getViolenceGraphic() == rhs.getViolenceGraphic())
    
    
    ;
}

bool CreateModerationResponse_results_inner_category_scores::operator!=(const CreateModerationResponse_results_inner_category_scores& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const CreateModerationResponse_results_inner_category_scores& o)
{
    j = nlohmann::json::object();
    j["hate"] = o.m_Hate;
    j["hate/threatening"] = o.m_Hate_threatening;
    j["self-harm"] = o.m_Self_harm;
    j["sexual"] = o.m_Sexual;
    j["sexual/minors"] = o.m_Sexual_minors;
    j["violence"] = o.m_Violence;
    j["violence/graphic"] = o.m_Violence_graphic;
    
}

void from_json(const nlohmann::json& j, CreateModerationResponse_results_inner_category_scores& o)
{
    j.at("hate").get_to(o.m_Hate);
    j.at("hate/threatening").get_to(o.m_Hate_threatening);
    j.at("self-harm").get_to(o.m_Self_harm);
    j.at("sexual").get_to(o.m_Sexual);
    j.at("sexual/minors").get_to(o.m_Sexual_minors);
    j.at("violence").get_to(o.m_Violence);
    j.at("violence/graphic").get_to(o.m_Violence_graphic);
    
}

double CreateModerationResponse_results_inner_category_scores::getHate() const
{
    return m_Hate;
}
void CreateModerationResponse_results_inner_category_scores::setHate(double const value)
{
    m_Hate = value;
}
double CreateModerationResponse_results_inner_category_scores::getHateThreatening() const
{
    return m_Hate_threatening;
}
void CreateModerationResponse_results_inner_category_scores::setHateThreatening(double const value)
{
    m_Hate_threatening = value;
}
double CreateModerationResponse_results_inner_category_scores::getSelfHarm() const
{
    return m_Self_harm;
}
void CreateModerationResponse_results_inner_category_scores::setSelfHarm(double const value)
{
    m_Self_harm = value;
}
double CreateModerationResponse_results_inner_category_scores::getSexual() const
{
    return m_Sexual;
}
void CreateModerationResponse_results_inner_category_scores::setSexual(double const value)
{
    m_Sexual = value;
}
double CreateModerationResponse_results_inner_category_scores::getSexualMinors() const
{
    return m_Sexual_minors;
}
void CreateModerationResponse_results_inner_category_scores::setSexualMinors(double const value)
{
    m_Sexual_minors = value;
}
double CreateModerationResponse_results_inner_category_scores::getViolence() const
{
    return m_Violence;
}
void CreateModerationResponse_results_inner_category_scores::setViolence(double const value)
{
    m_Violence = value;
}
double CreateModerationResponse_results_inner_category_scores::getViolenceGraphic() const
{
    return m_Violence_graphic;
}
void CreateModerationResponse_results_inner_category_scores::setViolenceGraphic(double const value)
{
    m_Violence_graphic = value;
}


} // namespace org::openapitools::server::model

