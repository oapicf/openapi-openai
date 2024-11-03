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
 * RunStepDetailsToolCallsCodeObject.h
 *
 * Details of the Code Interpreter tool call the run step was involved in.
 */

#ifndef RunStepDetailsToolCallsCodeObject_H_
#define RunStepDetailsToolCallsCodeObject_H_



#include <string>
#include "RunStepDetailsToolCallsCodeObject_code_interpreter.h"
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
/// Details of the Code Interpreter tool call the run step was involved in.
/// </summary>
class  RunStepDetailsToolCallsCodeObject 
{
public:
    RunStepDetailsToolCallsCodeObject() = default;
    explicit RunStepDetailsToolCallsCodeObject(boost::property_tree::ptree const& pt);
    virtual ~RunStepDetailsToolCallsCodeObject() = default;

    RunStepDetailsToolCallsCodeObject(const RunStepDetailsToolCallsCodeObject& other) = default; // copy constructor
    RunStepDetailsToolCallsCodeObject(RunStepDetailsToolCallsCodeObject&& other) noexcept = default; // move constructor

    RunStepDetailsToolCallsCodeObject& operator=(const RunStepDetailsToolCallsCodeObject& other) = default; // copy assignment
    RunStepDetailsToolCallsCodeObject& operator=(RunStepDetailsToolCallsCodeObject&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// RunStepDetailsToolCallsCodeObject members

    /// <summary>
    /// The ID of the tool call.
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

protected:
    std::string m_Id = "";
    std::string m_Type = "";
    RunStepDetailsToolCallsCodeObject_code_interpreter m_Code_interpreter;
};

std::vector<RunStepDetailsToolCallsCodeObject> createRunStepDetailsToolCallsCodeObjectVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<RunStepDetailsToolCallsCodeObject>(const RunStepDetailsToolCallsCodeObject& val) {
    return val.toPropertyTree();
}

template<>
inline RunStepDetailsToolCallsCodeObject fromPt<RunStepDetailsToolCallsCodeObject>(const boost::property_tree::ptree& pt) {
    RunStepDetailsToolCallsCodeObject ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* RunStepDetailsToolCallsCodeObject_H_ */
