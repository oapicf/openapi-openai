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
 * RunObject_required_action.h
 *
 * Details on the action required to continue the run. Will be &#x60;null&#x60; if no action is required.
 */

#ifndef RunObject_required_action_H_
#define RunObject_required_action_H_


#include <string>
#include "RunObject_required_action_submit_tool_outputs.h"
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Details on the action required to continue the run. Will be &#x60;null&#x60; if no action is required.
/// </summary>
class  RunObject_required_action
{
public:
    RunObject_required_action();
    virtual ~RunObject_required_action() = default;


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

    bool operator==(const RunObject_required_action& rhs) const;
    bool operator!=(const RunObject_required_action& rhs) const;

    /////////////////////////////////////////////
    /// RunObject_required_action members

    /// <summary>
    /// For now, this is always &#x60;submit_tool_outputs&#x60;.
    /// </summary>
    std::string getType() const;
    void setType(std::string const& value);
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::RunObject_required_action_submit_tool_outputs getSubmitToolOutputs() const;
    void setSubmitToolOutputs(org::openapitools::server::model::RunObject_required_action_submit_tool_outputs const& value);

    friend  void to_json(nlohmann::json& j, const RunObject_required_action& o);
    friend  void from_json(const nlohmann::json& j, RunObject_required_action& o);
protected:
    std::string m_Type;

    org::openapitools::server::model::RunObject_required_action_submit_tool_outputs m_Submit_tool_outputs;

    
};

} // namespace org::openapitools::server::model

#endif /* RunObject_required_action_H_ */
