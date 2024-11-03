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


#include "ListRunsResponse.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

ListRunsResponse::ListRunsResponse()
{
    m_object = "";
    m_First_id = "";
    m_Last_id = "";
    m_Has_more = false;
    
}

void ListRunsResponse::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool ListRunsResponse::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool ListRunsResponse::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "ListRunsResponse" : pathPrefix;

             
    
    /* Data */ {
        const std::vector<org::openapitools::server::model::RunObject>& value = m_Data;
        const std::string currentValuePath = _pathPrefix + ".data";
                
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const org::openapitools::server::model::RunObject& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        success = value.validate(msg, currentValuePath + ".data") && success;
 
                i++;
            }
        }

    }
                
    return success;
}

bool ListRunsResponse::operator==(const ListRunsResponse& rhs) const
{
    return
    
    
    (getObject() == rhs.getObject())
     &&
    
    (getData() == rhs.getData())
     &&
    
    (getFirstId() == rhs.getFirstId())
     &&
    
    (getLastId() == rhs.getLastId())
     &&
    
    (isHasMore() == rhs.isHasMore())
    
    
    ;
}

bool ListRunsResponse::operator!=(const ListRunsResponse& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const ListRunsResponse& o)
{
    j = nlohmann::json::object();
    j["object"] = o.m_object;
    j["data"] = o.m_Data;
    j["first_id"] = o.m_First_id;
    j["last_id"] = o.m_Last_id;
    j["has_more"] = o.m_Has_more;
    
}

void from_json(const nlohmann::json& j, ListRunsResponse& o)
{
    j.at("object").get_to(o.m_object);
    j.at("data").get_to(o.m_Data);
    j.at("first_id").get_to(o.m_First_id);
    j.at("last_id").get_to(o.m_Last_id);
    j.at("has_more").get_to(o.m_Has_more);
    
}

std::string ListRunsResponse::getObject() const
{
    return m_object;
}
void ListRunsResponse::setObject(std::string const& value)
{
    m_object = value;
}
std::vector<org::openapitools::server::model::RunObject> ListRunsResponse::getData() const
{
    return m_Data;
}
void ListRunsResponse::setData(std::vector<org::openapitools::server::model::RunObject> const& value)
{
    m_Data = value;
}
std::string ListRunsResponse::getFirstId() const
{
    return m_First_id;
}
void ListRunsResponse::setFirstId(std::string const& value)
{
    m_First_id = value;
}
std::string ListRunsResponse::getLastId() const
{
    return m_Last_id;
}
void ListRunsResponse::setLastId(std::string const& value)
{
    m_Last_id = value;
}
bool ListRunsResponse::isHasMore() const
{
    return m_Has_more;
}
void ListRunsResponse::setHasMore(bool const value)
{
    m_Has_more = value;
}


} // namespace org::openapitools::server::model

