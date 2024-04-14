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
 * DeleteFileResponse.h
 *
 * 
 */

#ifndef DeleteFileResponse_H_
#define DeleteFileResponse_H_


#include <string>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  DeleteFileResponse
{
public:
    DeleteFileResponse();
    virtual ~DeleteFileResponse() = default;


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

    bool operator==(const DeleteFileResponse& rhs) const;
    bool operator!=(const DeleteFileResponse& rhs) const;

    /////////////////////////////////////////////
    /// DeleteFileResponse members

    /// <summary>
    /// 
    /// </summary>
    std::string getId() const;
    void setId(std::string const& value);
    /// <summary>
    /// 
    /// </summary>
    std::string getObject() const;
    void setObject(std::string const& value);
    /// <summary>
    /// 
    /// </summary>
    bool isDeleted() const;
    void setDeleted(bool const value);

    friend  void to_json(nlohmann::json& j, const DeleteFileResponse& o);
    friend  void from_json(const nlohmann::json& j, DeleteFileResponse& o);
protected:
    std::string m_Id;

    std::string m_object;

    bool m_Deleted;

    
};

} // namespace org::openapitools::server::model

#endif /* DeleteFileResponse_H_ */
