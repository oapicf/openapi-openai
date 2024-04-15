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
 * SubmitToolOutputsRunRequest.h
 *
 * 
 */

#ifndef SubmitToolOutputsRunRequest_H_
#define SubmitToolOutputsRunRequest_H_


#include "SubmitToolOutputsRunRequest_tool_outputs_inner.h"
#include <vector>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  SubmitToolOutputsRunRequest
{
public:
    SubmitToolOutputsRunRequest();
    virtual ~SubmitToolOutputsRunRequest() = default;


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

    bool operator==(const SubmitToolOutputsRunRequest& rhs) const;
    bool operator!=(const SubmitToolOutputsRunRequest& rhs) const;

    /////////////////////////////////////////////
    /// SubmitToolOutputsRunRequest members

    /// <summary>
    /// A list of tools for which the outputs are being submitted.
    /// </summary>
    std::vector<org::openapitools::server::model::SubmitToolOutputsRunRequest_tool_outputs_inner> getToolOutputs() const;
    void setToolOutputs(std::vector<org::openapitools::server::model::SubmitToolOutputsRunRequest_tool_outputs_inner> const& value);
    /// <summary>
    /// If &#x60;true&#x60;, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a &#x60;data: [DONE]&#x60; message. 
    /// </summary>
    bool isStream() const;
    void setStream(bool const value);
    bool streamIsSet() const;
    void unsetStream();

    friend  void to_json(nlohmann::json& j, const SubmitToolOutputsRunRequest& o);
    friend  void from_json(const nlohmann::json& j, SubmitToolOutputsRunRequest& o);
protected:
    std::vector<org::openapitools::server::model::SubmitToolOutputsRunRequest_tool_outputs_inner> m_Tool_outputs;

    bool m_Stream;
    bool m_StreamIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* SubmitToolOutputsRunRequest_H_ */