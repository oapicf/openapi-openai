
/*
 * ApiKeyList.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ApiKeyList_H_
#define TINY_CPP_CLIENT_ApiKeyList_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AdminApiKey.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ApiKeyList{
public:

    /*! \brief Constructor.
	 */
    ApiKeyList();
    ApiKeyList(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ApiKeyList();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getObject();

	/*! \brief Set 
	 */
	void setObject(std::string  object);
	/*! \brief Get 
	 */
	std::list<AdminApiKey> getData();

	/*! \brief Set 
	 */
	void setData(std::list <AdminApiKey> data);
	/*! \brief Get 
	 */
	bool isHasMore();

	/*! \brief Set 
	 */
	void setHasMore(bool  has_more);
	/*! \brief Get 
	 */
	std::string getFirstId();

	/*! \brief Set 
	 */
	void setFirstId(std::string  first_id);
	/*! \brief Get 
	 */
	std::string getLastId();

	/*! \brief Set 
	 */
	void setLastId(std::string  last_id);


    private:
    std::string object{};
    std::list<AdminApiKey> data;
    bool has_more{};
    std::string first_id{};
    std::string last_id{};
};
}

#endif /* TINY_CPP_CLIENT_ApiKeyList_H_ */
