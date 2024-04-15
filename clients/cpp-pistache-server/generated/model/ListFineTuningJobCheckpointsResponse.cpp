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


#include "ListFineTuningJobCheckpointsResponse.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

ListFineTuningJobCheckpointsResponse::ListFineTuningJobCheckpointsResponse()
{
    m_object = "";
    m_First_id = "";
    m_First_idIsSet = false;
    m_Last_id = "";
    m_Last_idIsSet = false;
    m_Has_more = false;
    
}

void ListFineTuningJobCheckpointsResponse::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool ListFineTuningJobCheckpointsResponse::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool ListFineTuningJobCheckpointsResponse::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "ListFineTuningJobCheckpointsResponse" : pathPrefix;

         
    
    /* Data */ {
        const std::vector<org::openapitools::server::model::FineTuningJobCheckpoint>& value = m_Data;
        const std::string currentValuePath = _pathPrefix + ".data";
                
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const org::openapitools::server::model::FineTuningJobCheckpoint& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        success = value.validate(msg, currentValuePath + ".data") && success;
 
                i++;
            }
        }

    }
                    
    return success;
}

bool ListFineTuningJobCheckpointsResponse::operator==(const ListFineTuningJobCheckpointsResponse& rhs) const
{
    return
    
    
    (getData() == rhs.getData())
     &&
    
    (getObject() == rhs.getObject())
     &&
    
    
    ((!firstIdIsSet() && !rhs.firstIdIsSet()) || (firstIdIsSet() && rhs.firstIdIsSet() && getFirstId() == rhs.getFirstId())) &&
    
    
    ((!lastIdIsSet() && !rhs.lastIdIsSet()) || (lastIdIsSet() && rhs.lastIdIsSet() && getLastId() == rhs.getLastId())) &&
    
    (isHasMore() == rhs.isHasMore())
    
    
    ;
}

bool ListFineTuningJobCheckpointsResponse::operator!=(const ListFineTuningJobCheckpointsResponse& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const ListFineTuningJobCheckpointsResponse& o)
{
    j = nlohmann::json::object();
    j["data"] = o.m_Data;
    j["object"] = o.m_object;
    if(o.firstIdIsSet())
        j["first_id"] = o.m_First_id;
    if(o.lastIdIsSet())
        j["last_id"] = o.m_Last_id;
    j["has_more"] = o.m_Has_more;
    
}

void from_json(const nlohmann::json& j, ListFineTuningJobCheckpointsResponse& o)
{
    j.at("data").get_to(o.m_Data);
    j.at("object").get_to(o.m_object);
    if(j.find("first_id") != j.end())
    {
        j.at("first_id").get_to(o.m_First_id);
        o.m_First_idIsSet = true;
    } 
    if(j.find("last_id") != j.end())
    {
        j.at("last_id").get_to(o.m_Last_id);
        o.m_Last_idIsSet = true;
    } 
    j.at("has_more").get_to(o.m_Has_more);
    
}

std::vector<org::openapitools::server::model::FineTuningJobCheckpoint> ListFineTuningJobCheckpointsResponse::getData() const
{
    return m_Data;
}
void ListFineTuningJobCheckpointsResponse::setData(std::vector<org::openapitools::server::model::FineTuningJobCheckpoint> const& value)
{
    m_Data = value;
}
std::string ListFineTuningJobCheckpointsResponse::getObject() const
{
    return m_object;
}
void ListFineTuningJobCheckpointsResponse::setObject(std::string const& value)
{
    m_object = value;
}
std::string ListFineTuningJobCheckpointsResponse::getFirstId() const
{
    return m_First_id;
}
void ListFineTuningJobCheckpointsResponse::setFirstId(std::string const& value)
{
    m_First_id = value;
    m_First_idIsSet = true;
}
bool ListFineTuningJobCheckpointsResponse::firstIdIsSet() const
{
    return m_First_idIsSet;
}
void ListFineTuningJobCheckpointsResponse::unsetFirst_id()
{
    m_First_idIsSet = false;
}
std::string ListFineTuningJobCheckpointsResponse::getLastId() const
{
    return m_Last_id;
}
void ListFineTuningJobCheckpointsResponse::setLastId(std::string const& value)
{
    m_Last_id = value;
    m_Last_idIsSet = true;
}
bool ListFineTuningJobCheckpointsResponse::lastIdIsSet() const
{
    return m_Last_idIsSet;
}
void ListFineTuningJobCheckpointsResponse::unsetLast_id()
{
    m_Last_idIsSet = false;
}
bool ListFineTuningJobCheckpointsResponse::isHasMore() const
{
    return m_Has_more;
}
void ListFineTuningJobCheckpointsResponse::setHasMore(bool const value)
{
    m_Has_more = value;
}


} // namespace org::openapitools::server::model
