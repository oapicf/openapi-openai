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


#include "ListPaginatedFineTuningJobsResponse.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

ListPaginatedFineTuningJobsResponse::ListPaginatedFineTuningJobsResponse()
{
    m_Has_more = false;
    m_object = "";
    
}

void ListPaginatedFineTuningJobsResponse::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool ListPaginatedFineTuningJobsResponse::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool ListPaginatedFineTuningJobsResponse::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "ListPaginatedFineTuningJobsResponse" : pathPrefix;

         
    
    /* Data */ {
        const std::vector<org::openapitools::server::model::FineTuningJob>& value = m_Data;
        const std::string currentValuePath = _pathPrefix + ".data";
                
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const org::openapitools::server::model::FineTuningJob& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        success = value.validate(msg, currentValuePath + ".data") && success;
 
                i++;
            }
        }

    }
            
    return success;
}

bool ListPaginatedFineTuningJobsResponse::operator==(const ListPaginatedFineTuningJobsResponse& rhs) const
{
    return
    
    
    (getData() == rhs.getData())
     &&
    
    (isHasMore() == rhs.isHasMore())
     &&
    
    (getObject() == rhs.getObject())
    
    
    ;
}

bool ListPaginatedFineTuningJobsResponse::operator!=(const ListPaginatedFineTuningJobsResponse& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const ListPaginatedFineTuningJobsResponse& o)
{
    j = nlohmann::json::object();
    j["data"] = o.m_Data;
    j["has_more"] = o.m_Has_more;
    j["object"] = o.m_object;
    
}

void from_json(const nlohmann::json& j, ListPaginatedFineTuningJobsResponse& o)
{
    j.at("data").get_to(o.m_Data);
    j.at("has_more").get_to(o.m_Has_more);
    j.at("object").get_to(o.m_object);
    
}

std::vector<org::openapitools::server::model::FineTuningJob> ListPaginatedFineTuningJobsResponse::getData() const
{
    return m_Data;
}
void ListPaginatedFineTuningJobsResponse::setData(std::vector<org::openapitools::server::model::FineTuningJob> const& value)
{
    m_Data = value;
}
bool ListPaginatedFineTuningJobsResponse::isHasMore() const
{
    return m_Has_more;
}
void ListPaginatedFineTuningJobsResponse::setHasMore(bool const value)
{
    m_Has_more = value;
}
std::string ListPaginatedFineTuningJobsResponse::getObject() const
{
    return m_object;
}
void ListPaginatedFineTuningJobsResponse::setObject(std::string const& value)
{
    m_object = value;
}


} // namespace org::openapitools::server::model

