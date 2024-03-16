/**
 * OpenAI API
 * APIs for sampling from and fine-tuning language models
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.4.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * FineTuneEvent.h
 *
 * 
 */

#ifndef FineTuneEvent_H_
#define FineTuneEvent_H_



#include <string>
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
class  FineTuneEvent 
{
public:
    FineTuneEvent() = default;
    explicit FineTuneEvent(boost::property_tree::ptree const& pt);
    virtual ~FineTuneEvent() = default;

    FineTuneEvent(const FineTuneEvent& other) = default; // copy constructor
    FineTuneEvent(FineTuneEvent&& other) noexcept = default; // move constructor

    FineTuneEvent& operator=(const FineTuneEvent& other) = default; // copy assignment
    FineTuneEvent& operator=(FineTuneEvent&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// FineTuneEvent members

    /// <summary>
    /// 
    /// </summary>
    std::string getObject() const;
    void setObject(std::string value);

    /// <summary>
    /// 
    /// </summary>
    int32_t getCreatedAt() const;
    void setCreatedAt(int32_t value);

    /// <summary>
    /// 
    /// </summary>
    std::string getLevel() const;
    void setLevel(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::string getMessage() const;
    void setMessage(std::string value);

protected:
    std::string m_object = "";
    int32_t m_Created_at = 0;
    std::string m_Level = "";
    std::string m_Message = "";
};

std::vector<FineTuneEvent> createFineTuneEventVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<FineTuneEvent>(const FineTuneEvent& val) {
    return val.toPropertyTree();
}

template<>
inline FineTuneEvent fromPt<FineTuneEvent>(const boost::property_tree::ptree& pt) {
    FineTuneEvent ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* FineTuneEvent_H_ */
