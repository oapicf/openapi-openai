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
 * ListFineTuningJobCheckpointsResponse.h
 *
 * 
 */

#ifndef ListFineTuningJobCheckpointsResponse_H_
#define ListFineTuningJobCheckpointsResponse_H_


#include "FineTuningJobCheckpoint.h"
#include <string>
#include <vector>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  ListFineTuningJobCheckpointsResponse
{
public:
    ListFineTuningJobCheckpointsResponse();
    virtual ~ListFineTuningJobCheckpointsResponse() = default;


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

    bool operator==(const ListFineTuningJobCheckpointsResponse& rhs) const;
    bool operator!=(const ListFineTuningJobCheckpointsResponse& rhs) const;

    /////////////////////////////////////////////
    /// ListFineTuningJobCheckpointsResponse members

    /// <summary>
    /// 
    /// </summary>
    std::vector<org::openapitools::server::model::FineTuningJobCheckpoint> getData() const;
    void setData(std::vector<org::openapitools::server::model::FineTuningJobCheckpoint> const& value);
    /// <summary>
    /// 
    /// </summary>
    std::string getObject() const;
    void setObject(std::string const& value);
    /// <summary>
    /// 
    /// </summary>
    std::string getFirstId() const;
    void setFirstId(std::string const& value);
    bool firstIdIsSet() const;
    void unsetFirst_id();
    /// <summary>
    /// 
    /// </summary>
    std::string getLastId() const;
    void setLastId(std::string const& value);
    bool lastIdIsSet() const;
    void unsetLast_id();
    /// <summary>
    /// 
    /// </summary>
    bool isHasMore() const;
    void setHasMore(bool const value);

    friend  void to_json(nlohmann::json& j, const ListFineTuningJobCheckpointsResponse& o);
    friend  void from_json(const nlohmann::json& j, ListFineTuningJobCheckpointsResponse& o);
protected:
    std::vector<org::openapitools::server::model::FineTuningJobCheckpoint> m_Data;

    std::string m_object;

    std::string m_First_id;
    bool m_First_idIsSet;
    std::string m_Last_id;
    bool m_Last_idIsSet;
    bool m_Has_more;

    
};

} // namespace org::openapitools::server::model

#endif /* ListFineTuningJobCheckpointsResponse_H_ */