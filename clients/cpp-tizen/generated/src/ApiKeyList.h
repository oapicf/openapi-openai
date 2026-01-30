/*
 * ApiKeyList.h
 *
 * 
 */

#ifndef _ApiKeyList_H_
#define _ApiKeyList_H_


#include <string>
#include "AdminApiKey.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ApiKeyList : public Object {
public:
	/*! \brief Constructor.
	 */
	ApiKeyList();
	ApiKeyList(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ApiKeyList();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	bool getHasMore();

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
	std::string object;
	std::list <AdminApiKey>data;
	bool has_more;
	std::string first_id;
	std::string last_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ApiKeyList_H_ */
