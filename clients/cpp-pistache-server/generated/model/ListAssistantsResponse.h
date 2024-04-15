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
/*
 * ListAssistantsResponse.h
 *
 * 
 */

#ifndef ListAssistantsResponse_H_
#define ListAssistantsResponse_H_


#include <string>
#include "AssistantObject.h"
#include <vector>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  ListAssistantsResponse
{
public:
    ListAssistantsResponse();
    virtual ~ListAssistantsResponse() = default;


    /// <summary>
    /// Validate the current data in the model. Throws a ValidationException on failure.
    /// </summary>
    void validate() const;

    /// <summary>
    /// Validate the current data in the model. Returns false on error and writes an error
    /// message into the given stringstream.
    /// </summary>
    bool validate(std::stringstream& msg) const;

    /// <summary>
    /// Helper overload for validate. Used when one model stores another model and calls it's validate.
    /// Not meant to be called outside that case.
    /// </summary>
    bool validate(std::stringstream& msg, const std::string& pathPrefix) const;

    bool operator==(const ListAssistantsResponse& rhs) const;
    bool operator!=(const ListAssistantsResponse& rhs) const;

    /////////////////////////////////////////////
    /// ListAssistantsResponse members

    /// <summary>
    /// 
    /// </summary>
    std::string getObject() const;
    void setObject(std::string const& value);
    /// <summary>
    /// 
    /// </summary>
    std::vector<org::openapitools::server::model::AssistantObject> getData() const;
    void setData(std::vector<org::openapitools::server::model::AssistantObject> const& value);
    /// <summary>
    /// 
    /// </summary>
    std::string getFirstId() const;
    void setFirstId(std::string const& value);
    /// <summary>
    /// 
    /// </summary>
    std::string getLastId() const;
    void setLastId(std::string const& value);
    /// <summary>
    /// 
    /// </summary>
    bool isHasMore() const;
    void setHasMore(bool const value);

    friend  void to_json(nlohmann::json& j, const ListAssistantsResponse& o);
    friend  void from_json(const nlohmann::json& j, ListAssistantsResponse& o);
protected:
    std::string m_object;

    std::vector<org::openapitools::server::model::AssistantObject> m_Data;

    std::string m_First_id;

    std::string m_Last_id;

    bool m_Has_more;

    
};

} // namespace org::openapitools::server::model

#endif /* ListAssistantsResponse_H_ */