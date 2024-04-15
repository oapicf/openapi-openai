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
 * RunStepDetailsToolCallsObject_tool_calls_inner.h
 *
 * 
 */

#ifndef RunStepDetailsToolCallsObject_tool_calls_inner_H_
#define RunStepDetailsToolCallsObject_tool_calls_inner_H_



#include "RunStepDetailsToolCallsRetrievalObject.h"
#include "RunStepDetailsToolCallsFunctionObject.h"
#include <string>
#include "RunStepDetailsToolCallsCodeObject_code_interpreter.h"
#include "RunStepDetailsToolCallsFunctionObject_function.h"
#include "RunStepDetailsToolCallsCodeObject.h"
#include <memory>
#include <vector>
#include <array>
#include <boost/property_tree/ptree.hpp>
#include "RunStepDetailsToolCallsCodeObject.h"
#include "RunStepDetailsToolCallsRetrievalObject.h"
#include "RunStepDetailsToolCallsFunctionObject.h"
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  RunStepDetailsToolCallsObject_tool_calls_inner : public RunStepDetailsToolCallsCodeObject, public RunStepDetailsToolCallsRetrievalObject, public RunStepDetailsToolCallsFunctionObject
{
public:
    RunStepDetailsToolCallsObject_tool_calls_inner() = default;
    explicit RunStepDetailsToolCallsObject_tool_calls_inner(boost::property_tree::ptree const& pt);
    virtual ~RunStepDetailsToolCallsObject_tool_calls_inner() = default;

    RunStepDetailsToolCallsObject_tool_calls_inner(const RunStepDetailsToolCallsObject_tool_calls_inner& other) = default; // copy constructor
    RunStepDetailsToolCallsObject_tool_calls_inner(RunStepDetailsToolCallsObject_tool_calls_inner&& other) noexcept = default; // move constructor

    RunStepDetailsToolCallsObject_tool_calls_inner& operator=(const RunStepDetailsToolCallsObject_tool_calls_inner& other) = default; // copy assignment
    RunStepDetailsToolCallsObject_tool_calls_inner& operator=(RunStepDetailsToolCallsObject_tool_calls_inner&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// RunStepDetailsToolCallsObject_tool_calls_inner members

    /// <summary>
    /// The ID of the tool call object.
    /// </summary>
    std::string getId() const;
    void setId(std::string value);

    /// <summary>
    /// The type of tool call. This is always going to be &#x60;code_interpreter&#x60; for this type of tool call.
    /// </summary>
    std::string getType() const;
    void setType(std::string value);

    /// <summary>
    /// 
    /// </summary>
    RunStepDetailsToolCallsCodeObject_code_interpreter getCodeInterpreter() const;
    void setCodeInterpreter(RunStepDetailsToolCallsCodeObject_code_interpreter value);

    /// <summary>
    /// For now, this is always going to be an empty object.
    /// </summary>
    std::string getRetrieval() const;
    void setRetrieval(std::string value);

    /// <summary>
    /// 
    /// </summary>
    RunStepDetailsToolCallsFunctionObject_function getFunction() const;
    void setFunction(RunStepDetailsToolCallsFunctionObject_function value);

protected:
    std::string m_Id = "";
    std::string m_Type = "";
    RunStepDetailsToolCallsCodeObject_code_interpreter m_Code_interpreter;
    std::string m_Retrieval = std::string{};
    RunStepDetailsToolCallsFunctionObject_function m_Function;
};

std::vector<RunStepDetailsToolCallsObject_tool_calls_inner> createRunStepDetailsToolCallsObject_tool_calls_innerVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<RunStepDetailsToolCallsObject_tool_calls_inner>(const RunStepDetailsToolCallsObject_tool_calls_inner& val) {
    return val.toPropertyTree();
}

template<>
inline RunStepDetailsToolCallsObject_tool_calls_inner fromPt<RunStepDetailsToolCallsObject_tool_calls_inner>(const boost::property_tree::ptree& pt) {
    RunStepDetailsToolCallsObject_tool_calls_inner ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* RunStepDetailsToolCallsObject_tool_calls_inner_H_ */