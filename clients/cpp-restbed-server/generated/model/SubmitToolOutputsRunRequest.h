/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.4.0.
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
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  SubmitToolOutputsRunRequest 
{
public:
    SubmitToolOutputsRunRequest() = default;
    explicit SubmitToolOutputsRunRequest(boost::property_tree::ptree const& pt);
    virtual ~SubmitToolOutputsRunRequest() = default;

    SubmitToolOutputsRunRequest(const SubmitToolOutputsRunRequest& other) = default; // copy constructor
    SubmitToolOutputsRunRequest(SubmitToolOutputsRunRequest&& other) noexcept = default; // move constructor

    SubmitToolOutputsRunRequest& operator=(const SubmitToolOutputsRunRequest& other) = default; // copy assignment
    SubmitToolOutputsRunRequest& operator=(SubmitToolOutputsRunRequest&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// SubmitToolOutputsRunRequest members

    /// <summary>
    /// A list of tools for which the outputs are being submitted.
    /// </summary>
    std::vector<SubmitToolOutputsRunRequest_tool_outputs_inner> getToolOutputs() const;
    void setToolOutputs(std::vector<SubmitToolOutputsRunRequest_tool_outputs_inner> value);

    /// <summary>
    /// If &#x60;true&#x60;, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a &#x60;data: [DONE]&#x60; message. 
    /// </summary>
    bool isStream() const;
    void setStream(bool value);

protected:
    std::vector<SubmitToolOutputsRunRequest_tool_outputs_inner> m_Tool_outputs;
    bool m_Stream = false;
};

std::vector<SubmitToolOutputsRunRequest> createSubmitToolOutputsRunRequestVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<SubmitToolOutputsRunRequest>(const SubmitToolOutputsRunRequest& val) {
    return val.toPropertyTree();
}

template<>
inline SubmitToolOutputsRunRequest fromPt<SubmitToolOutputsRunRequest>(const boost::property_tree::ptree& pt) {
    SubmitToolOutputsRunRequest ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* SubmitToolOutputsRunRequest_H_ */
