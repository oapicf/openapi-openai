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
 * RunStreamEvent_oneOf_2.h
 *
 * Occurs when a [run](/docs/api-reference/runs/object) moves to an &#x60;in_progress&#x60; status.
 */

#ifndef RunStreamEvent_oneOf_2_H_
#define RunStreamEvent_oneOf_2_H_



#include <string>
#include "RunObject.h"
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
/// Occurs when a [run](/docs/api-reference/runs/object) moves to an &#x60;in_progress&#x60; status.
/// </summary>
class  RunStreamEvent_oneOf_2 
{
public:
    RunStreamEvent_oneOf_2() = default;
    explicit RunStreamEvent_oneOf_2(boost::property_tree::ptree const& pt);
    virtual ~RunStreamEvent_oneOf_2() = default;

    RunStreamEvent_oneOf_2(const RunStreamEvent_oneOf_2& other) = default; // copy constructor
    RunStreamEvent_oneOf_2(RunStreamEvent_oneOf_2&& other) noexcept = default; // move constructor

    RunStreamEvent_oneOf_2& operator=(const RunStreamEvent_oneOf_2& other) = default; // copy assignment
    RunStreamEvent_oneOf_2& operator=(RunStreamEvent_oneOf_2&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// RunStreamEvent_oneOf_2 members

    /// <summary>
    /// 
    /// </summary>
    std::string getEvent() const;
    void setEvent(std::string value);

    /// <summary>
    /// 
    /// </summary>
    RunObject getData() const;
    void setData(RunObject value);

protected:
    std::string m_Event = "";
    RunObject m_Data;
};

std::vector<RunStreamEvent_oneOf_2> createRunStreamEvent_oneOf_2VectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<RunStreamEvent_oneOf_2>(const RunStreamEvent_oneOf_2& val) {
    return val.toPropertyTree();
}

template<>
inline RunStreamEvent_oneOf_2 fromPt<RunStreamEvent_oneOf_2>(const boost::property_tree::ptree& pt) {
    RunStreamEvent_oneOf_2 ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* RunStreamEvent_oneOf_2_H_ */