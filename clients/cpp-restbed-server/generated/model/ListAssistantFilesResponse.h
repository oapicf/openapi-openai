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
 * ListAssistantFilesResponse.h
 *
 * 
 */

#ifndef ListAssistantFilesResponse_H_
#define ListAssistantFilesResponse_H_



#include <string>
#include "AssistantFileObject.h"
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
class  ListAssistantFilesResponse 
{
public:
    ListAssistantFilesResponse() = default;
    explicit ListAssistantFilesResponse(boost::property_tree::ptree const& pt);
    virtual ~ListAssistantFilesResponse() = default;

    ListAssistantFilesResponse(const ListAssistantFilesResponse& other) = default; // copy constructor
    ListAssistantFilesResponse(ListAssistantFilesResponse&& other) noexcept = default; // move constructor

    ListAssistantFilesResponse& operator=(const ListAssistantFilesResponse& other) = default; // copy assignment
    ListAssistantFilesResponse& operator=(ListAssistantFilesResponse&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// ListAssistantFilesResponse members

    /// <summary>
    /// 
    /// </summary>
    std::string getObject() const;
    void setObject(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::vector<AssistantFileObject> getData() const;
    void setData(std::vector<AssistantFileObject> value);

    /// <summary>
    /// 
    /// </summary>
    std::string getFirstId() const;
    void setFirstId(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::string getLastId() const;
    void setLastId(std::string value);

    /// <summary>
    /// 
    /// </summary>
    bool isHasMore() const;
    void setHasMore(bool value);

protected:
    std::string m_object = "";
    std::vector<AssistantFileObject> m_Data;
    std::string m_First_id = "";
    std::string m_Last_id = "";
    bool m_Has_more = false;
};

std::vector<ListAssistantFilesResponse> createListAssistantFilesResponseVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<ListAssistantFilesResponse>(const ListAssistantFilesResponse& val) {
    return val.toPropertyTree();
}

template<>
inline ListAssistantFilesResponse fromPt<ListAssistantFilesResponse>(const boost::property_tree::ptree& pt) {
    ListAssistantFilesResponse ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* ListAssistantFilesResponse_H_ */