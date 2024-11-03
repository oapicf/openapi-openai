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
 * RunObject_incomplete_details.h
 *
 * Details on why the run is incomplete. Will be &#x60;null&#x60; if the run is not incomplete.
 */

#ifndef RunObject_incomplete_details_H_
#define RunObject_incomplete_details_H_


#include <string>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Details on why the run is incomplete. Will be &#x60;null&#x60; if the run is not incomplete.
/// </summary>
class  RunObject_incomplete_details
{
public:
    RunObject_incomplete_details();
    virtual ~RunObject_incomplete_details() = default;


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

    bool operator==(const RunObject_incomplete_details& rhs) const;
    bool operator!=(const RunObject_incomplete_details& rhs) const;

    /////////////////////////////////////////////
    /// RunObject_incomplete_details members

    /// <summary>
    /// The reason why the run is incomplete. This will point to which specific token limit was reached over the course of the run.
    /// </summary>
    std::string getReason() const;
    void setReason(std::string const& value);
    bool reasonIsSet() const;
    void unsetReason();

    friend  void to_json(nlohmann::json& j, const RunObject_incomplete_details& o);
    friend  void from_json(const nlohmann::json& j, RunObject_incomplete_details& o);
protected:
    std::string m_Reason;
    bool m_ReasonIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* RunObject_incomplete_details_H_ */
