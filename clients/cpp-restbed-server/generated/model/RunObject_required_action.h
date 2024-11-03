/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.9.0.
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
#include <memory>
#include <vector>
#include <array>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Details on the action required to continue the run. Will be &#x60;null&#x60; if no action is required.
/// </summary>
class  RunObject_required_action 
{
public:
    RunObject_required_action() = default;
    explicit RunObject_required_action(boost::property_tree::ptree const& pt);
    virtual ~RunObject_required_action() = default;

    RunObject_required_action(const RunObject_required_action& other) = default; // copy constructor
    RunObject_required_action(RunObject_required_action&& other) noexcept = default; // move constructor

    RunObject_required_action& operator=(const RunObject_required_action& other) = default; // copy assignment
    RunObject_required_action& operator=(RunObject_required_action&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// RunObject_required_action members

    /// <summary>
    /// For now, this is always &#x60;submit_tool_outputs&#x60;.
    /// </summary>
    std::string getType() const;
    void setType(std::string value);

    /// <summary>
    /// 
    /// </summary>
    RunObject_required_action_submit_tool_outputs getSubmitToolOutputs() const;
    void setSubmitToolOutputs(RunObject_required_action_submit_tool_outputs value);

protected:
    std::string m_Type = "";
    RunObject_required_action_submit_tool_outputs m_Submit_tool_outputs;
};

std::vector<RunObject_required_action> createRunObject_required_actionVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<RunObject_required_action>(const RunObject_required_action& val) {
    return val.toPropertyTree();
}

template<>
inline RunObject_required_action fromPt<RunObject_required_action>(const boost::property_tree::ptree& pt) {
    RunObject_required_action ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* RunObject_required_action_H_ */
