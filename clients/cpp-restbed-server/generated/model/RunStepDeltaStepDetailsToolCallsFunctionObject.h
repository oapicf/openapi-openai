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
 * RunStepDeltaStepDetailsToolCallsFunctionObject.h
 *
 * 
 */

#ifndef RunStepDeltaStepDetailsToolCallsFunctionObject_H_
#define RunStepDeltaStepDetailsToolCallsFunctionObject_H_



#include <string>
#include "RunStepDeltaStepDetailsToolCallsFunctionObject_function.h"
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
/// 
/// </summary>
class  RunStepDeltaStepDetailsToolCallsFunctionObject 
{
public:
    RunStepDeltaStepDetailsToolCallsFunctionObject() = default;
    explicit RunStepDeltaStepDetailsToolCallsFunctionObject(boost::property_tree::ptree const& pt);
    virtual ~RunStepDeltaStepDetailsToolCallsFunctionObject() = default;

    RunStepDeltaStepDetailsToolCallsFunctionObject(const RunStepDeltaStepDetailsToolCallsFunctionObject& other) = default; // copy constructor
    RunStepDeltaStepDetailsToolCallsFunctionObject(RunStepDeltaStepDetailsToolCallsFunctionObject&& other) noexcept = default; // move constructor

    RunStepDeltaStepDetailsToolCallsFunctionObject& operator=(const RunStepDeltaStepDetailsToolCallsFunctionObject& other) = default; // copy assignment
    RunStepDeltaStepDetailsToolCallsFunctionObject& operator=(RunStepDeltaStepDetailsToolCallsFunctionObject&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// RunStepDeltaStepDetailsToolCallsFunctionObject members

    /// <summary>
    /// The index of the tool call in the tool calls array.
    /// </summary>
    int32_t getIndex() const;
    void setIndex(int32_t value);

    /// <summary>
    /// The ID of the tool call object.
    /// </summary>
    std::string getId() const;
    void setId(std::string value);

    /// <summary>
    /// The type of tool call. This is always going to be &#x60;function&#x60; for this type of tool call.
    /// </summary>
    std::string getType() const;
    void setType(std::string value);

    /// <summary>
    /// 
    /// </summary>
    RunStepDeltaStepDetailsToolCallsFunctionObject_function getFunction() const;
    void setFunction(RunStepDeltaStepDetailsToolCallsFunctionObject_function value);

protected:
    int32_t m_Index = 0;
    std::string m_Id = "";
    std::string m_Type = "";
    RunStepDeltaStepDetailsToolCallsFunctionObject_function m_Function;
};

std::vector<RunStepDeltaStepDetailsToolCallsFunctionObject> createRunStepDeltaStepDetailsToolCallsFunctionObjectVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<RunStepDeltaStepDetailsToolCallsFunctionObject>(const RunStepDeltaStepDetailsToolCallsFunctionObject& val) {
    return val.toPropertyTree();
}

template<>
inline RunStepDeltaStepDetailsToolCallsFunctionObject fromPt<RunStepDeltaStepDetailsToolCallsFunctionObject>(const boost::property_tree::ptree& pt) {
    RunStepDeltaStepDetailsToolCallsFunctionObject ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* RunStepDeltaStepDetailsToolCallsFunctionObject_H_ */