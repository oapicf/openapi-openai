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
 * ListMessageFilesResponse.h
 *
 * 
 */

#ifndef ListMessageFilesResponse_H_
#define ListMessageFilesResponse_H_



#include "MessageFileObject.h"
#include <string>
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
class  ListMessageFilesResponse 
{
public:
    ListMessageFilesResponse() = default;
    explicit ListMessageFilesResponse(boost::property_tree::ptree const& pt);
    virtual ~ListMessageFilesResponse() = default;

    ListMessageFilesResponse(const ListMessageFilesResponse& other) = default; // copy constructor
    ListMessageFilesResponse(ListMessageFilesResponse&& other) noexcept = default; // move constructor

    ListMessageFilesResponse& operator=(const ListMessageFilesResponse& other) = default; // copy assignment
    ListMessageFilesResponse& operator=(ListMessageFilesResponse&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// ListMessageFilesResponse members

    /// <summary>
    /// 
    /// </summary>
    std::string getObject() const;
    void setObject(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::vector<MessageFileObject> getData() const;
    void setData(std::vector<MessageFileObject> value);

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
    std::vector<MessageFileObject> m_Data;
    std::string m_First_id = "";
    std::string m_Last_id = "";
    bool m_Has_more = false;
};

std::vector<ListMessageFilesResponse> createListMessageFilesResponseVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<ListMessageFilesResponse>(const ListMessageFilesResponse& val) {
    return val.toPropertyTree();
}

template<>
inline ListMessageFilesResponse fromPt<ListMessageFilesResponse>(const boost::property_tree::ptree& pt) {
    ListMessageFilesResponse ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* ListMessageFilesResponse_H_ */
