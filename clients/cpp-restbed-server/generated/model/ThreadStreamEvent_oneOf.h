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
 * ThreadStreamEvent_oneOf.h
 *
 * Occurs when a new [thread](/docs/api-reference/threads/object) is created.
 */

#ifndef ThreadStreamEvent_oneOf_H_
#define ThreadStreamEvent_oneOf_H_



#include <string>
#include "ThreadObject.h"
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
/// Occurs when a new [thread](/docs/api-reference/threads/object) is created.
/// </summary>
class  ThreadStreamEvent_oneOf 
{
public:
    ThreadStreamEvent_oneOf() = default;
    explicit ThreadStreamEvent_oneOf(boost::property_tree::ptree const& pt);
    virtual ~ThreadStreamEvent_oneOf() = default;

    ThreadStreamEvent_oneOf(const ThreadStreamEvent_oneOf& other) = default; // copy constructor
    ThreadStreamEvent_oneOf(ThreadStreamEvent_oneOf&& other) noexcept = default; // move constructor

    ThreadStreamEvent_oneOf& operator=(const ThreadStreamEvent_oneOf& other) = default; // copy assignment
    ThreadStreamEvent_oneOf& operator=(ThreadStreamEvent_oneOf&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// ThreadStreamEvent_oneOf members

    /// <summary>
    /// 
    /// </summary>
    std::string getEvent() const;
    void setEvent(std::string value);

    /// <summary>
    /// 
    /// </summary>
    ThreadObject getData() const;
    void setData(ThreadObject value);

protected:
    std::string m_Event = "";
    ThreadObject m_Data;
};

std::vector<ThreadStreamEvent_oneOf> createThreadStreamEvent_oneOfVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<ThreadStreamEvent_oneOf>(const ThreadStreamEvent_oneOf& val) {
    return val.toPropertyTree();
}

template<>
inline ThreadStreamEvent_oneOf fromPt<ThreadStreamEvent_oneOf>(const boost::property_tree::ptree& pt) {
    ThreadStreamEvent_oneOf ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* ThreadStreamEvent_oneOf_H_ */
