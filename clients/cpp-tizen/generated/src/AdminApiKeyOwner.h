/*
 * AdminApiKey_owner.h
 *
 * 
 */

#ifndef _AdminApiKey_owner_H_
#define _AdminApiKey_owner_H_


#include <string>
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

class AdminApiKey_owner : public Object {
public:
	/*! \brief Constructor.
	 */
	AdminApiKey_owner();
	AdminApiKey_owner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdminApiKey_owner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getType();

	/*! \brief Set 
	 */
	void setType(std::string  type);
	/*! \brief Get 
	 */
	std::string getId();

	/*! \brief Set 
	 */
	void setId(std::string  id);
	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	long long getCreatedAt();

	/*! \brief Set 
	 */
	void setCreatedAt(long long  created_at);
	/*! \brief Get 
	 */
	std::string getRole();

	/*! \brief Set 
	 */
	void setRole(std::string  role);

private:
	std::string type;
	std::string id;
	std::string name;
	long long created_at;
	std::string role;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdminApiKey_owner_H_ */
